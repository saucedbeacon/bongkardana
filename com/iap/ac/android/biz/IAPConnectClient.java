package com.iap.ac.android.biz;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.cpm.CpmManager;
import com.iap.ac.android.biz.cpm.CpmOption;
import com.iap.ac.android.biz.internal.impl.cpm.IAPConnectPaymentImpl;

public class IAPConnectClient {
    public static IAPConnectPaymentImpl mImpl = new IAPConnectPaymentImpl();

    public static CpmManager getCpmManager(@NonNull CpmOption cpmOption) {
        return mImpl.getCpmManager(cpmOption);
    }
}
