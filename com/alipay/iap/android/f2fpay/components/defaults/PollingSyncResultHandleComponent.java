package com.alipay.iap.android.f2fpay.components.defaults;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.UniResultF2fpayOrderInfo;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.product.delegate.IAPUserDelegate;
import com.alipay.iap.android.f2fpay.b.a;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayInitializeCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayResultCallback;
import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;
import com.alipay.iap.android.f2fpay.client.pay.F2fPayOrderInfo;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.common.KeyValueRegistry;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent;
import com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo;
import com.alipay.iap.android.f2fpay.otp.OtpInitResult;
import com.alipay.iap.android.f2fpay.util.ConvertUtils;
import com.alipay.plus.android.unipayresult.sdk.callback.IUnifierPayResultHandler;
import com.alipay.plus.android.unipayresult.sdk.client.IUnifierQuery;
import com.alipay.plus.android.unipayresult.sdk.client.UnifierQueryClient;
import com.alipay.plus.android.unipayresult.sdk.executor.UnifierPayResultInfo;
import com.alipay.plus.android.unipayresult.sdk.executor.UnifierPollingRpcExecutor;
import com.alipay.plus.android.unipayresult.sdk.executor.UnifierSyncQueryExecutor;
import com.alipay.plus.android.unipayresult.sdk.request.IUnifierQueryDelegate;
import com.alipay.plus.android.unipayresult.sdk.request.IUnifierRequest;
import com.alipay.plus.android.unipayresult.sdk.request.UnifierPollingRpcRequest;
import com.alipay.plus.android.unipayresult.sdk.request.UnifierSyncRequest;
import java.util.ArrayList;
import java.util.List;

public class PollingSyncResultHandleComponent extends DefaultBaseComponent implements IF2FPayResultHandleComponent {
    protected static final int DEFAULT_CODE_GENERATE_INTERVAL = 3;
    protected static final int DEFAULT_POLLING_INTERVAL = 5000;
    protected static final String F2F_PAY_RESULT = "F2F_PAY_RESULT";

    /* renamed from: a  reason: collision with root package name */
    private boolean f9320a = true;
    protected List<Integer> mIntervals;
    protected IF2FPayResultCallback mPayResultCallback;
    protected IF2FPayResultHandleComponent.IPayResultDecoder mPayResultDecoder;
    protected boolean mRefreshTaskStarted;

    public PollingSyncResultHandleComponent() {
        ArrayList arrayList = new ArrayList();
        this.mIntervals = arrayList;
        arrayList.add(5000);
    }

    /* access modifiers changed from: private */
    public void a() {
        LoggerWrapper.d(F2FPayConstants.TAG, "start query result");
        Context context = getContext();
        UnifierPollingRpcExecutor unifierPollingRpcExecutor = new UnifierPollingRpcExecutor(context, this.mIntervals, new IUnifierQueryDelegate() {
            @NonNull
            public IUnifierRequest generateRequest() {
                IAPUserDelegate userDelegate = PollingSyncResultHandleComponent.this.getUserDelegate();
                UnifierPollingRpcRequest unifierPollingRpcRequest = new UnifierPollingRpcRequest();
                unifierPollingRpcRequest.mLinkTargetId = userDelegate.getUserId();
                unifierPollingRpcRequest.mBizNos = ((IF2FPayPaymentCodeComponent) PollingSyncResultHandleComponent.this.getComponent(IF2FPayPaymentCodeComponent.class)).getWaitingResultPaymentCodes();
                if (TextUtils.isEmpty(unifierPollingRpcRequest.mLinkTargetId) || unifierPollingRpcRequest.mBizNos == null || unifierPollingRpcRequest.mBizNos.size() == 0) {
                    PollingSyncResultHandleComponent.this.stopHandleResult();
                }
                StringBuilder sb = new StringBuilder("polling request bizNo:");
                sb.append(unifierPollingRpcRequest.mBizNos.toString());
                LoggerWrapper.d(F2FPayConstants.TAG, sb.toString());
                return unifierPollingRpcRequest;
            }

            public void parseBizResultInfo(@NonNull String str, @NonNull UnifierPayResultInfo unifierPayResultInfo) {
                PollingSyncResultHandleComponent.this.parseBizResultInfoInternal(str, unifierPayResultInfo);
            }
        });
        UnifierSyncQueryExecutor unifierSyncQueryExecutor = new UnifierSyncQueryExecutor(context, new IUnifierQueryDelegate() {
            @NonNull
            public IUnifierRequest generateRequest() {
                return new UnifierSyncRequest();
            }

            public void parseBizResultInfo(@NonNull String str, @NonNull UnifierPayResultInfo unifierPayResultInfo) {
                PollingSyncResultHandleComponent.this.parseBizResultInfoInternal(str, unifierPayResultInfo);
            }
        });
        final Class payOrderInfoClass = this.mPayResultDecoder.getPayOrderInfoClass();
        IUnifierQuery.QueryConfig queryConfig = new IUnifierQuery.QueryConfig("F2F_PAY_RESULT");
        queryConfig.addQueryExecutor(unifierPollingRpcExecutor).addQueryExecutor(unifierSyncQueryExecutor).setDeserializeBizOrderClazz(payOrderInfoClass).setPayResultHandler(new IUnifierPayResultHandler() {
            public boolean handlePayResult(UnifierPayResultInfo unifierPayResultInfo) {
                if (!payOrderInfoClass.isInstance(unifierPayResultInfo.mBizOrderInfo)) {
                    LoggerWrapper.i(F2FPayConstants.TAG, "handlePayResult, class not match ");
                    return false;
                }
                try {
                    return PollingSyncResultHandleComponent.this.processPayResultWithCallback(unifierPayResultInfo.mBizOrderInfo);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Handle pay result failed with exception: ");
                    sb.append(e.getMessage());
                    LoggerWrapper.e(F2FPayConstants.TAG, sb.toString());
                    return false;
                }
            }
        });
        UnifierQueryClient.getInstance().startQuery(queryConfig);
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        this.mIntervals = ConvertUtils.parseQueryIntervals(str, 5000);
        StringBuilder sb = new StringBuilder("setQueryInterval: ");
        sb.append(String.valueOf(this.mIntervals));
        LoggerWrapper.e(F2FPayConstants.TAG, sb.toString());
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IF2FPayResultHandleComponent.IPayResultDecoder<UniResultF2fpayOrderInfo> createDefaultPayResultDecoder() {
        return new IF2FPayResultHandleComponent.IPayResultDecoder<UniResultF2fpayOrderInfo>() {
            @NonNull
            public F2fPayOrderInfo convertF2fPayOrderInfo(@NonNull UniResultF2fpayOrderInfo uniResultF2fpayOrderInfo) {
                return new F2fPayOrderInfo(uniResultF2fpayOrderInfo);
            }

            @NonNull
            public Class<UniResultF2fpayOrderInfo> getPayOrderInfoClass() {
                return UniResultF2fpayOrderInfo.class;
            }
        };
    }

    /* access modifiers changed from: protected */
    public int getPaymentCodeGenerateInterval(String str) {
        F2FPayOtpInfo otpInfoByIdentity = getClientContext().getSecureStorage().getOtpInfoByIdentity(ConvertUtils.getIdentity(str, generateTerminalIdentifier()));
        if (otpInfoByIdentity == null || otpInfoByIdentity.interval <= 0) {
            return 3;
        }
        return otpInfoByIdentity.interval;
    }

    public void initialize(IF2FPayClient iF2FPayClient) {
        super.initialize(iF2FPayClient);
        setPayResultDecoder((IF2FPayResultHandleComponent.IPayResultDecoder) null);
        a(keyValueAccessor().getString(KeyValueRegistry.QUERY_INTERVAL, (String) null));
        ((IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class)).addInitializeCallback(new IF2FPayInitializeCallback() {
            public void onInitializeFailed(String str) {
            }

            public void onInitializeOtpSucceed() {
            }

            public void onOtpInfoChanged(@NonNull OtpInitResult otpInitResult) {
                PollingSyncResultHandleComponent.this.a(otpInitResult.queryInterval);
                if (PollingSyncResultHandleComponent.this.mRefreshTaskStarted) {
                    PollingSyncResultHandleComponent.this.stopHandleResult();
                    PollingSyncResultHandleComponent.this.a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void notifyPayResultArrived(final F2FPayResult f2FPayResult) {
        a.a().a((Runnable) new Runnable() {
            public void run() {
                if (PollingSyncResultHandleComponent.this.mPayResultCallback != null) {
                    LoggerWrapper.i(F2FPayConstants.TAG, "notify pay result arrived");
                    PollingSyncResultHandleComponent.this.mPayResultCallback.onPayResultArrived(f2FPayResult);
                }
            }
        });
    }

    public void parseBizResultInfoInternal(@NonNull String str, @NonNull UnifierPayResultInfo unifierPayResultInfo) {
        unifierPayResultInfo.mLinkTargetId = getUserDelegate().getUserId();
        if (unifierPayResultInfo.mBizOrderInfo instanceof UniResultF2fpayOrderInfo) {
            unifierPayResultInfo.mBizNo = ((UniResultF2fpayOrderInfo) unifierPayResultInfo.mBizOrderInfo).tradeNo;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean processPayResultWithCallback(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            java.lang.String r1 = "IAPF2FPAY"
            if (r13 != 0) goto L_0x000b
            java.lang.String r13 = "processPayResultWithCallback originalOrderInfo null"
        L_0x0007:
            com.alipay.iap.android.common.log.LoggerWrapper.i(r1, r13)
            return r0
        L_0x000b:
            java.lang.String r2 = "start handle result: "
            com.alipay.iap.android.common.log.LoggerWrapper.i(r1, r2)
            com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent$IPayResultDecoder r2 = r12.mPayResultDecoder
            com.alipay.iap.android.f2fpay.client.pay.F2fPayOrderInfo r2 = r2.convertF2fPayOrderInfo(r13)
            java.lang.String r3 = r2.paymentCode
            java.lang.Class<com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent> r4 = com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent.class
            com.alipay.iap.android.f2fpay.components.IF2FPayBaseComponent r4 = r12.getComponent(r4)
            com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent r4 = (com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent) r4
            long r5 = r4.getPollingTimeStamp(r3)
            int r4 = r4.paymentCodeResultHasHandled(r3)
            if (r4 >= 0) goto L_0x002e
            java.lang.String r13 = "order handled already "
            goto L_0x0007
        L_0x002e:
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r8 = "removeResult: "
            java.lang.String r7 = r8.concat(r7)
            com.alipay.iap.android.common.log.LoggerWrapper.i(r1, r7)
            com.alipay.iap.android.f2fpay.client.pay.F2FPayResult r7 = new com.alipay.iap.android.f2fpay.client.pay.F2FPayResult
            r7.<init>()
            java.lang.String r8 = r2.state
            java.lang.String r9 = "decode_failed"
            boolean r8 = r9.equals(r8)
            r9 = 1
            if (r8 == 0) goto L_0x006d
            java.lang.String r3 = "result decode failed "
            com.alipay.iap.android.common.log.LoggerWrapper.i(r1, r3)
            java.lang.Class<com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent> r1 = com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent.class
            com.alipay.iap.android.f2fpay.components.IF2FPayBaseComponent r1 = r12.getComponent(r1)
            com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent r1 = (com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent) r1
            r1.clearOtpInfo()
            com.alipay.iap.android.f2fpay.client.IF2FPayClient r1 = r12.mPayClient
            r1.refreshPaymentCode(r0)
            com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus r0 = com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus.Failure
            r7.status = r0
            r7.orderInfo = r2
            r7.originalOrderInfo = r13
            r12.notifyPayResultArrived(r7)
            goto L_0x0112
        L_0x006d:
            com.alipay.iap.android.common.product.delegate.IAPUserDelegate r8 = r12.getUserDelegate()
            java.lang.String r10 = r2.buyerUserId
            java.lang.String r11 = r8.getUserId()
            boolean r10 = android.text.TextUtils.equals(r10, r11)
            if (r10 != 0) goto L_0x0080
            java.lang.String r13 = "processPayResultWithCallback buyerUserId and current userId not match"
            goto L_0x0007
        L_0x0080:
            boolean r10 = r8.checkPermission()
            if (r10 != 0) goto L_0x008a
            java.lang.String r13 = "processPayResultWithCallback no permission"
            goto L_0x0007
        L_0x008a:
            java.lang.String r0 = r2.state
            java.lang.String r10 = "success"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x009a
            com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus r0 = com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus.Success
        L_0x0097:
            r7.status = r0
            goto L_0x00b4
        L_0x009a:
            java.lang.String r0 = r2.state
            java.lang.String r10 = "pending"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a7
            com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus r0 = com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus.Pending
            goto L_0x0097
        L_0x00a7:
            java.lang.String r0 = r2.state
            java.lang.String r10 = "failed"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b4
            com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus r0 = com.alipay.iap.android.f2fpay.client.pay.F2FPayResultStatus.Failure
            goto L_0x0097
        L_0x00b4:
            r7.orderInfo = r2
            r7.originalOrderInfo = r13
            r12.notifyPayResultArrived(r7)
            r10 = 0
            int r13 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0112
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r5
            int r13 = (int) r10
            java.lang.String r0 = "F2FPayReceivePayResult"
            com.alipay.iap.android.f2fpay.a.a r0 = com.alipay.iap.android.f2fpay.a.a.a((java.lang.String) r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.String r5 = "TimeIntervalFromGeneratedToResult"
            com.alipay.iap.android.f2fpay.a.a r0 = r0.a((java.lang.String) r5, (java.lang.Object) r2)
            java.lang.String r2 = "PaymentCode"
            com.alipay.iap.android.f2fpay.a.a r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            com.alipay.iap.android.f2fpay.extension.IF2FPayLogger r2 = r12.getLogger()
            r0.a((com.alipay.iap.android.f2fpay.extension.IF2FPayLogger) r2)
            if (r4 <= 0) goto L_0x0112
            java.lang.String r0 = "last code consumed"
            com.alipay.iap.android.common.log.LoggerWrapper.d(r1, r0)
            boolean r0 = r12.f9320a
            if (r0 != 0) goto L_0x00f5
            java.lang.String r13 = "last code consumed, but do not refresh"
            com.alipay.iap.android.common.log.LoggerWrapper.d(r1, r13)
            return r9
        L_0x00f5:
            java.lang.String r0 = r8.getUserId()
            int r0 = r12.getPaymentCodeGenerateInterval(r0)
            int r0 = r0 * 1000
            int r0 = r0 - r13
            java.lang.String r13 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "calculate diff between time past and interval: "
            java.lang.String r13 = r2.concat(r13)
            com.alipay.iap.android.common.log.LoggerWrapper.i(r1, r13)
            com.alipay.iap.android.f2fpay.client.IF2FPayClient r13 = r12.mPayClient
            r13.refreshPaymentCode(r0)
        L_0x0112:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.components.defaults.PollingSyncResultHandleComponent.processPayResultWithCallback(java.lang.Object):boolean");
    }

    public void setPayResultCallback(IF2FPayResultCallback iF2FPayResultCallback) {
        this.mPayResultCallback = iF2FPayResultCallback;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void setPayResultDecoder(@androidx.annotation.Nullable com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent.IPayResultDecoder<T> r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0003
            goto L_0x0007
        L_0x0003:
            com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent$IPayResultDecoder r1 = r0.createDefaultPayResultDecoder()
        L_0x0007:
            r0.mPayResultDecoder = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.components.defaults.PollingSyncResultHandleComponent.setPayResultDecoder(com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent$IPayResultDecoder):void");
    }

    public void setRefreshCodeWhenLastCodePayed(boolean z) {
        this.f9320a = z;
    }

    public void startHandleResult() {
        if (this.mRefreshTaskStarted) {
            LoggerWrapper.d(F2FPayConstants.TAG, "Result handler task is already started!");
            return;
        }
        this.mRefreshTaskStarted = true;
        if (isF2FPayOpen()) {
            a();
        }
    }

    public void stopHandleResult() {
        LoggerWrapper.d(F2FPayConstants.TAG, "stop handle result");
        this.mRefreshTaskStarted = false;
        UnifierQueryClient.getInstance().stopQuery("F2F_PAY_RESULT");
        if (this.mPayClient == null) {
            LoggerWrapper.w(F2FPayConstants.TAG, "F2FPayClient has been recycled, can not clear waiting result payment codes");
        } else {
            ((IF2FPayPaymentCodeComponent) getComponent(IF2FPayPaymentCodeComponent.class)).clearWaitingResultPaymentCodes();
        }
    }
}
