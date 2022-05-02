package com.iap.ac.android.biz.internal;

import com.iap.ac.android.biz.internal.impl.IAPConnectImpl;
import com.iap.ac.android.biz.internal.impl.OperationManagerImpl;

public class ACFactory {
    public static IIAPConnect createIAPConnectImpl() {
        return new IAPConnectImpl();
    }

    public static IOperationManager createIAPOperationManager() {
        return new OperationManagerImpl();
    }
}
