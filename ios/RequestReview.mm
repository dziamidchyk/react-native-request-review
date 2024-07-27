#import "RequestReview.h"

#import "react_native_request_review-Swift.h"

@implementation RequestReview
RCT_EXPORT_MODULE()

#ifdef RCT_NEW_ARCH_ENABLED
- (void)requestReview
#else
RCT_EXPORT_METHOD(requestReview)
#endif
{
  [StoreReview requestReview];
}

#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
(const facebook::react::ObjCTurboModule::InitParams &)params
{
  return std::make_shared<facebook::react::NativeRequestReviewSpecJSI>(params);
}
#endif

@end
