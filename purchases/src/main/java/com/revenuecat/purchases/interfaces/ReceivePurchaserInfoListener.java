//  Purchases
//
//  Copyright © 2019 RevenueCat, Inc. All rights reserved.
//

package com.revenuecat.purchases.interfaces;


import com.revenuecat.purchases.PurchaserInfo;
import com.revenuecat.purchases.PurchasesError;

import androidx.annotation.NonNull;

/**
 * Interface to be implemented when making calls that return a [PurchaserInfo]
 */
public interface ReceivePurchaserInfoListener {
    /**
     * Will be called after the call has completed.
     * @param purchaserInfo [PurchaserInfo] class sent back when the call has completed
     */
    void onReceived(@NonNull PurchaserInfo purchaserInfo);

     /**
     * Will be called after the call has completed with an error.
      * @param error A [PurchasesError] containing the reason for the failure of the call
     */
    void onError(@NonNull PurchasesError error);
}
