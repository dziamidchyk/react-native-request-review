package com.requestreview

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class RequestReviewModule (context: ReactApplicationContext) :
  ReactContextBaseJavaModule(context) {
  private val moduleImpl: RequestReviewModuleImpl = RequestReviewModuleImpl(context)

  override fun getName(): String = RequestReviewModuleImpl.NAME

  @ReactMethod
  fun requestReview() {
    moduleImpl.requestReview()
  }
}
