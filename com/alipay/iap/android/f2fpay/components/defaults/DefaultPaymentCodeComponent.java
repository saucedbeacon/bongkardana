package com.alipay.iap.android.f2fpay.components.defaults;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.product.delegate.IAPUserDelegate;
import com.alipay.iap.android.common.task.AsyncTaskExecutor;
import com.alipay.iap.android.f2fpay.b.a;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayInitializeCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayOpenCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaymentCodeCallback;
import com.alipay.iap.android.f2fpay.common.F2FPayCallbacks;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.common.F2FPayErrorCode;
import com.alipay.iap.android.f2fpay.common.IF2FPayCallbackHolder;
import com.alipay.iap.android.f2fpay.common.KeyValueRegistry;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayOpenComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent;
import com.alipay.iap.android.f2fpay.extension.IF2FPaySecureStorage;
import com.alipay.iap.android.f2fpay.otp.OtpInitResult;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import com.alipay.iap.android.f2fpay.util.ConvertUtils;
import java.util.List;

public class DefaultPaymentCodeComponent extends DefaultBaseComponent implements IF2FPayPaymentCodeComponent {

    /* renamed from: a  reason: collision with root package name */
    private a.C0012a f9317a = new a.C0012a() {
        public void call() {
            AsyncTaskExecutor.getInstance().execute(DefaultPaymentCodeComponent.this.b, "PaymentCodeGenerate");
        }

        public int nextDelayMillSeconds() {
            return DefaultPaymentCodeComponent.this.mRefreshTimeMillSeconds;
        }
    };
    /* access modifiers changed from: private */
    public Runnable b = new Runnable() {
        public void run() {
            try {
                IAPUserDelegate userDelegate = DefaultPaymentCodeComponent.this.getUserDelegate();
                if (DefaultPaymentCodeComponent.this.mRefreshTaskStarted) {
                    if (userDelegate.checkPermission()) {
                        if (!DefaultPaymentCodeComponent.this.isF2FPayOpen()) {
                            LoggerWrapper.e(F2FPayConstants.TAG, "GeneratePaymentRunnable error, F2FPay is not opened");
                            DefaultPaymentCodeComponent.this.a((GenerateResult) null);
                            return;
                        }
                        DefaultPaymentCodeComponent.this.generatePaymentCodeWithRetryInWorker(userDelegate.getUserId(), DefaultPaymentCodeComponent.this.generateTerminalIdentifier());
                        return;
                    }
                }
                LoggerWrapper.e(F2FPayConstants.TAG, "GeneratePaymentRunnable error, task stopped or no permission");
                DefaultPaymentCodeComponent.this.a((GenerateResult) null);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("GeneratePaymentRunnable error:");
                sb.append(e.getMessage());
                LoggerWrapper.e(F2FPayConstants.TAG, sb.toString());
                DefaultPaymentCodeComponent.this.a((GenerateResult) null);
            }
        }
    };
    protected com.alipay.iap.android.f2fpay.paymentcode.a mActivePaymentCodeQueue = new com.alipay.iap.android.f2fpay.paymentcode.a();
    protected F2FPayCallbacks<IF2FPaymentCodeCallback> mCallbacks = new F2FPayCallbacks<>();
    protected boolean mRefreshTaskStarted;
    protected int mRefreshTimeMillSeconds = 60000;
    protected a mTimerTaskManager = a.a();

    static class GenerateResult extends F2FPaymentCodeInfo {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f9318a;

        private GenerateResult() {
        }
    }

    /* access modifiers changed from: private */
    public void a(@Nullable final GenerateResult generateResult) {
        if (getStartRefreshFlag()) {
            if (generateResult == null || generateResult.isCodeEmpty()) {
                this.mCallbacks.postMainCallback(new F2FPayCallbacks.Invoker<IF2FPaymentCodeCallback>() {
                    public void invoke(@NonNull IF2FPaymentCodeCallback iF2FPaymentCodeCallback) {
                        iF2FPaymentCodeCallback.onPaymentCodeGenerateFailed();
                    }
                });
                return;
            }
            this.mActivePaymentCodeQueue.a(generateResult.paymentCode, generateResult.totp);
            this.mCallbacks.postMainCallback(new F2FPayCallbacks.Invoker<IF2FPaymentCodeCallback>() {
                public void invoke(@NonNull IF2FPaymentCodeCallback iF2FPaymentCodeCallback) {
                    iF2FPaymentCodeCallback.onPaymentCodeUpdated(new F2FPaymentCodeInfo(generateResult));
                }
            });
        }
    }

    public IF2FPayCallbackHolder addPaymentCodeCallback(@NonNull IF2FPaymentCodeCallback iF2FPaymentCodeCallback) {
        return this.mCallbacks.addCallback(iF2FPaymentCodeCallback);
    }

    public void clearWaitingResultPaymentCodes() {
        this.mActivePaymentCodeQueue.b();
    }

    /* access modifiers changed from: protected */
    public GenerateResult generatePaymentCode(String str) {
        GenerateResult generateResult = new GenerateResult();
        String generatePaymentCodeInternal = generatePaymentCodeInternal(str);
        generateResult.paymentCode = generatePaymentCodeInternal;
        if (!TextUtils.isEmpty(generatePaymentCodeInternal)) {
            int length = generatePaymentCodeInternal.length();
            if (length >= 6) {
                generateResult.totp = generatePaymentCodeInternal.substring(length - 6);
            }
        } else {
            String unused = generateResult.f9318a = F2FPayErrorCode.OTP_INFO_ERROR;
        }
        com.alipay.iap.android.f2fpay.a.a.a("F2FPayGeneratePaymentCode").a("Result", TextUtils.isEmpty(generateResult.paymentCode) ? "0" : "1").a(getLogger());
        return generateResult;
    }

    /* access modifiers changed from: protected */
    public String generatePaymentCodeInternal(String str) {
        IF2FPaySecureStorage secureStorage = getClientContext().getSecureStorage();
        if (!secureStorage.checkOtpInfoExist(str)) {
            return null;
        }
        String generateCode = getClientContext().getPaymentCodeGenerator().generateCode(this.mPayClient.getContext(), secureStorage.getOtpInfoByIdentity(str), ((IF2FPayTimeSyncComponent) this.mPayClient.getComponent(IF2FPayTimeSyncComponent.class)).getServerTime() / 1000, this.mPayClient.getSeedExtra());
        if (TextUtils.isEmpty(generateCode)) {
            secureStorage.clear();
        }
        return generateCode;
    }

    /* access modifiers changed from: protected */
    public void generatePaymentCodeWithRetryInWorker(String str, String str2) {
        GenerateResult generateResult;
        String identity = ConvertUtils.getIdentity(str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            generateResult = null;
        } else {
            ((IF2FPayTimeSyncComponent) getComponent(IF2FPayTimeSyncComponent.class)).synchronizeTimeInWorker();
            generateResult = generatePaymentCode(identity);
        }
        if (generateResult == null) {
            LoggerWrapper.e(F2FPayConstants.TAG, "generate payment code failed, result is null.");
            a((GenerateResult) null);
            return;
        }
        if (generateResult.isCodeEmpty() && TextUtils.equals(generateResult.f9318a, F2FPayErrorCode.OTP_INFO_ERROR)) {
            ((IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class)).initializeOtpInfoInWorker(str2, identity);
            generateResult = generatePaymentCode(identity);
        }
        a(generateResult);
    }

    public long getPollingTimeStamp(String str) {
        return this.mActivePaymentCodeQueue.a(str);
    }

    public int getRefreshTimeSeconds() {
        return this.mRefreshTimeMillSeconds / 1000;
    }

    @NonNull
    public List<String> getWaitingResultPaymentCodes() {
        return this.mActivePaymentCodeQueue.a();
    }

    public void initialize(IF2FPayClient iF2FPayClient) {
        super.initialize(iF2FPayClient);
        this.mActivePaymentCodeQueue.a(keyValueAccessor().getInt(KeyValueRegistry.QUERY_COUNT, 2));
        ((IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class)).addInitializeCallback(new IF2FPayInitializeCallback() {
            public void onInitializeFailed(String str) {
            }

            public void onInitializeOtpSucceed() {
            }

            public void onOtpInfoChanged(@NonNull OtpInitResult otpInitResult) {
                DefaultPaymentCodeComponent.this.mActivePaymentCodeQueue.a(otpInitResult.queryCount);
                DefaultPaymentCodeComponent.this.requestRefresh(0);
            }
        });
        IF2FPayOpenComponent iF2FPayOpenComponent = (IF2FPayOpenComponent) getComponent(IF2FPayOpenComponent.class);
        if (iF2FPayOpenComponent != null) {
            iF2FPayOpenComponent.addOpenCallback(new IF2FPayOpenCallback.Adapter() {
                public void onSwitchStatusChanged(boolean z, IF2FPayOpenCallback.StatusChangeCausedBy statusChangeCausedBy) {
                    if (z && DefaultPaymentCodeComponent.this.mRefreshTaskStarted) {
                        DefaultPaymentCodeComponent.this.requestRefresh(0);
                    }
                }
            });
        }
    }

    public int paymentCodeResultHasHandled(String str) {
        return this.mActivePaymentCodeQueue.b(str);
    }

    public void requestRefresh(int i) {
        stopRefreshTask();
        LoggerWrapper.d(F2FPayConstants.TAG, "request refresh code withe delay: ".concat(String.valueOf(i)));
        this.mRefreshTaskStarted = true;
        if (i > 0) {
            this.mTimerTaskManager.a(this.f9317a, (long) i);
        } else {
            this.mTimerTaskManager.a(this.f9317a);
        }
    }

    public void setRefreshTimeSeconds(int i) {
        this.mRefreshTimeMillSeconds = i * 1000;
    }

    public void startRefreshTask() {
        if (this.mRefreshTaskStarted) {
            LoggerWrapper.d(F2FPayConstants.TAG, "PaymentCode generate task is already started!");
        } else {
            requestRefresh(0);
        }
    }

    public void stopRefreshTask() {
        this.mTimerTaskManager.c(this.f9317a);
        this.mRefreshTaskStarted = false;
    }
}
