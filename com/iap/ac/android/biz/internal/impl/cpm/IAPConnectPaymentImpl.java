package com.iap.ac.android.biz.internal.impl.cpm;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.alipay.ac.pa.SCPMCompositeCodeUIService;
import com.alipay.iap.android.f2fpay.widgets.data.IF2FPaymentCodeStateChangedListener;
import com.alipay.iap.android.f2fpay.widgets.data.PaymentCodeState;
import com.alipay.iap.android.f2fpay.widgets.widget.F2FPayCompositePaymentCodeView;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.cpm.CpmManager;
import com.iap.ac.android.biz.cpm.CpmOption;
import com.iap.ac.android.biz.internal.IAPConnectRoute;
import com.iap.ac.android.common.log.ACLog;

public class IAPConnectPaymentImpl implements CpmManager, IPaymentCodeListener {
    public static final int TOTP_LENGTH = 6;
    public AcCpmManager mAcCpmManager;
    public F2FPayCompositePaymentCodeView mCompositePaymentCodeView;
    public CpmManager mCurrentCpmManager;
    public IPaymentCodeListener mOuterPaymentCodeListener;
    public PaCpmManager mPaCpmManager;

    public synchronized F2FPayCompositePaymentCodeView buildCompositePaymentCodeView(@NonNull Activity activity) {
        F2FPayCompositePaymentCodeView buildCompositePaymentCodeView;
        this.mCompositePaymentCodeView = null;
        buildCompositePaymentCodeView = new SCPMCompositeCodeUIService().buildCompositePaymentCodeView(activity, new IF2FPaymentCodeStateChangedListener() {
            public void onPaymentCodeStateChanged(PaymentCodeState paymentCodeState) {
            }
        });
        this.mCompositePaymentCodeView = buildCompositePaymentCodeView;
        return buildCompositePaymentCodeView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.length();
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo generatePaymentCodeInfo(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0013
            int r0 = r3.length()
            r1 = 6
            if (r0 < r1) goto L_0x0013
            int r0 = r0 - r1
            java.lang.String r0 = r3.substring(r0)
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo r1 = new com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.biz.internal.impl.cpm.IAPConnectPaymentImpl.generatePaymentCodeInfo(java.lang.String):com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo");
    }

    @NonNull
    public synchronized CpmManager getCpmManager(@NonNull CpmOption cpmOption) {
        if (this.mAcCpmManager == null) {
            this.mAcCpmManager = new AcCpmManager();
        }
        if (this.mPaCpmManager == null) {
            this.mPaCpmManager = new PaCpmManager();
        }
        updateOption(cpmOption);
        return this;
    }

    public synchronized void getPaymentCode() {
        this.mCurrentCpmManager.getPaymentCode();
    }

    public void onPaymentCodeUpdateFailed(@NonNull String str, @NonNull String str2) {
        StringBuilder sb = new StringBuilder("IAPConnectPaymentImpl, onPaymentCodeUpdatedFailed: ");
        sb.append(str);
        sb.append(", msg: ");
        sb.append(str2);
        ACLog.d(Constants.TAG, sb.toString());
        IPaymentCodeListener iPaymentCodeListener = this.mOuterPaymentCodeListener;
        if (iPaymentCodeListener != null) {
            iPaymentCodeListener.onPaymentCodeUpdateFailed(str, str2);
        }
        F2FPayCompositePaymentCodeView f2FPayCompositePaymentCodeView = this.mCompositePaymentCodeView;
        if (f2FPayCompositePaymentCodeView != null) {
            f2FPayCompositePaymentCodeView.generatePaymentCodeFailed();
        }
    }

    public void onPaymentCodeUpdated(@NonNull String str) {
        ACLog.d(Constants.TAG, "IAPConnectPaymentImpl, onPaymentCodeUpdated: ".concat(String.valueOf(str)));
        IPaymentCodeListener iPaymentCodeListener = this.mOuterPaymentCodeListener;
        if (iPaymentCodeListener != null) {
            iPaymentCodeListener.onPaymentCodeUpdated(str);
        }
        F2FPayCompositePaymentCodeView f2FPayCompositePaymentCodeView = this.mCompositePaymentCodeView;
        if (f2FPayCompositePaymentCodeView != null) {
            f2FPayCompositePaymentCodeView.updatePaymentCode(generatePaymentCodeInfo(str));
        }
    }

    public synchronized void startRefreshPaymentCode() {
        this.mCurrentCpmManager.startRefreshPaymentCode();
    }

    public synchronized void stopRefreshPaymentCode() {
        this.mCurrentCpmManager.stopRefreshPaymentCode();
    }

    public synchronized void updateOption(@NonNull CpmOption cpmOption) {
        if (cpmOption == null) {
            cpmOption = new CpmOption();
        }
        IAPConnectRoute.ScenarioType scenarioTypeByRegion = IAPConnectRoute.getScenarioTypeByRegion(cpmOption.region);
        CpmManager cpmManager = this.mPaCpmManager;
        if (scenarioTypeByRegion == IAPConnectRoute.ScenarioType.AC) {
            cpmManager = this.mAcCpmManager;
        }
        CpmManager cpmManager2 = this.mCurrentCpmManager;
        if (!(cpmManager2 == null || cpmManager2 == cpmManager)) {
            cpmManager2.stopRefreshPaymentCode();
        }
        this.mCurrentCpmManager = cpmManager;
        this.mOuterPaymentCodeListener = cpmOption.listener;
        cpmOption.listener = this;
        this.mCurrentCpmManager.updateOption(cpmOption);
    }
}
