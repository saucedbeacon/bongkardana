package com.alipay.iap.android.lbs;

public interface LBSLocationListener {
    void onLocationError(LBSLocationErrorCode lBSLocationErrorCode);

    void onLocationUpdate(LBSLocation lBSLocation);
}
