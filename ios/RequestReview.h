
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNRequestReviewSpec.h"

@interface RequestReview : NSObject <NativeRequestReviewSpec>
#else
#import <React/RCTBridgeModule.h>

@interface RequestReview : NSObject <RCTBridgeModule>
#endif

@end
