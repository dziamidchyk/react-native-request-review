//
//  StoreReview.swift
//  react-native-request-review
//
//  Created by Arseni Demidchik on 29.07.24.
//

import StoreKit

@objc(StoreReview)
public class StoreReview: NSObject {
  @objc public static func requestReview() -> Void {
    DispatchQueue.main.async {
      if #available(iOS 14.0, *) {
        if let scene = UIApplication.shared.connectedScenes.first(where: { $0.activationState == .foregroundActive }) as? UIWindowScene {
          SKStoreReviewController.requestReview(in: scene)
        }
      } else {
        SKStoreReviewController.requestReview()
      }
    }
  }
}
