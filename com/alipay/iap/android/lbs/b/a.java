package com.alipay.iap.android.lbs.b;

import android.content.Context;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipay.iap.android.lbs.LBSLocationListener;
import com.alipay.iap.android.lbs.LBSLocationRequest;

public interface a {
    LBSLocation a(Context context, LBSLocationRequest lBSLocationRequest);

    void a(Context context);

    void a(Context context, LBSLocationListener lBSLocationListener);

    void a(Context context, LBSLocationRequest lBSLocationRequest, LBSLocationListener lBSLocationListener);

    void b(Context context, LBSLocationRequest lBSLocationRequest, LBSLocationListener lBSLocationListener);
}
