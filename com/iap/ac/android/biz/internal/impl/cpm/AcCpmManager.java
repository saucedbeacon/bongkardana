package com.iap.ac.android.biz.internal.impl.cpm;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.alipay.iap.android.f2fpay.widgets.widget.F2FPayCompositePaymentCodeView;
import com.iap.ac.android.biz.IAPConnect;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.cpm.CpmManager;
import com.iap.ac.android.biz.cpm.CpmOption;

public class AcCpmManager implements CpmManager {
    public IPaymentCodeListener mPaymentCodeListener;
    public String mRegion;
    public boolean mStarted = false;

    public F2FPayCompositePaymentCodeView buildCompositePaymentCodeView(@NonNull Activity activity) {
        return null;
    }

    public synchronized void getPaymentCode() {
        this.mStarted = true;
        IAPConnect.getPaymentCode(this.mRegion, this.mPaymentCodeListener);
    }

    public synchronized void startRefreshPaymentCode() {
        this.mStarted = true;
        IAPConnect.getPaymentCode(this.mRegion, this.mPaymentCodeListener);
    }

    public void stopRefreshPaymentCode() {
        this.mStarted = false;
    }

    public void updateOption(CpmOption cpmOption) {
        if (cpmOption != null) {
            this.mRegion = cpmOption.region;
            this.mPaymentCodeListener = cpmOption.listener;
            return;
        }
        this.mRegion = null;
        this.mPaymentCodeListener = null;
    }
}
