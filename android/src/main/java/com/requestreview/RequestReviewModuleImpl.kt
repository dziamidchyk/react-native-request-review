package com.requestreview

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.google.android.play.core.review.ReviewManagerFactory

class RequestReviewModuleImpl(private val context: ReactApplicationContext) {
  fun requestReview() {
    val manager = ReviewManagerFactory.create(context)

    val request = manager.requestReviewFlow()

    request.addOnCompleteListener { task ->
      if (task.isSuccessful) {
        val activity = context.currentActivity
        if (activity !== null) {
          manager.launchReviewFlow(activity, task.result)
        } else {
          Log.e(NAME, "Failed to launch review flow: current activity is null")
        }
      } else {
        Log.e(NAME, "Failed to request review flow", task.exception)
      }
    }
  }

  companion object {
    const val NAME = "RequestReview"
  }
}
