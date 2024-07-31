package com.requestreview

import com.facebook.react.bridge.ReactApplicationContext

class RequestReviewModule(context: ReactApplicationContext) :
  NativeRequestReviewSpec(context) {
  private val moduleImpl: RequestReviewModuleImpl = RequestReviewModuleImpl(context)

  override fun getName(): String = RequestReviewModuleImpl.NAME

  override fun requestReview() {
    moduleImpl.requestReview()
  }
}
