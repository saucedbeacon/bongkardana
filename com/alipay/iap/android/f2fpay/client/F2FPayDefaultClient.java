package com.alipay.iap.android.f2fpay.client;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCallback;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import com.alipay.iap.android.common.syncintegration.impl.IAPSyncMessageParsedCallback;
import com.alipay.iap.android.common.syncintegration.impl.SyncProvider;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayOpenCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayResultCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaymentCodeCallback;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.common.IF2FPayCallbackHolder;
import com.alipay.iap.android.f2fpay.common.KeyValueRegistry;
import com.alipay.iap.android.f2fpay.components.IF2FPayBaseComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayOpenComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayUserSwitchComponent;
import com.alipay.iap.android.f2fpay.components.defaults.DefaultInitializeComponent;
import com.alipay.iap.android.f2fpay.components.defaults.DefaultOpenComponent;
import com.alipay.iap.android.f2fpay.components.defaults.DefaultPaymentCodeComponent;
import com.alipay.iap.android.f2fpay.components.defaults.DefaultTimeSyncComponent;
import com.alipay.iap.android.f2fpay.components.defaults.DefaultUserSwitchComponent;
import com.alipay.iap.android.f2fpay.components.defaults.PollingSyncResultHandleComponent;
import com.alipay.iap.android.f2fpay.util.ConvertUtils;
import com.ap.zoloz.hummer.biz.HummerZCodeConstant;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class F2FPayDefaultClient implements IF2FPayClient, IF2FPayOpenCallback {

    /* renamed from: a  reason: collision with root package name */
    private String f9311a = "";
    private IAPSyncCallback b = null;
    protected F2FPayClientContext mClientContext;
    protected Map<Class<? extends IF2FPayBaseComponent>, IF2FPayBaseComponent> mComponents = new LinkedHashMap();
    protected WeakReference<Context> mContext;
    protected IF2FPayInitializeComponent mInitializeComponent;
    protected boolean mInitialized;
    protected IF2FPayPaymentCodeComponent mPaymentCodeComponent;
    protected IF2FPayResultHandleComponent mResultHandleComponent;
    protected boolean startRefreshFlag = true;

    public F2FPayDefaultClient() {
        createComponents();
    }

    private void a() {
        if (this.b == null) {
            this.b = new IAPSyncMessageParsedCallback() {
                public void onReceiveParsedSyncMessage(@NonNull IAPSyncMessage iAPSyncMessage, @NonNull String str, @NonNull List<String> list) {
                    String str2;
                    boolean z = false;
                    LoggerWrapper.e(F2FPayConstants.TAG, String.format("Receive sync message!\nmessageId = %s, userId = %s, biz = %s, message = %s", new Object[]{iAPSyncMessage.messageId, iAPSyncMessage.userId, iAPSyncMessage.biz, iAPSyncMessage.msgData}));
                    for (String jSONObject : list) {
                        try {
                            if ("INIT".equals(new JSONObject(jSONObject).optString(F2FPayConstants.SyncBiz.SYNC_MODEL_KEY_FUNCTION_CODE))) {
                                z = true;
                            }
                        } catch (Exception e) {
                            LoggerWrapper.e(F2FPayConstants.TAG, "", e);
                        }
                    }
                    if (z && F2FPayDefaultClient.this.mInitializeComponent != null) {
                        Context context = F2FPayDefaultClient.this.mContext.get();
                        if (context == null) {
                            str2 = HummerZCodeConstant.CONTEXT_ERROR_MSG;
                        } else {
                            String userId = UserInfoManager.instance().getUserId();
                            if (TextUtils.isEmpty(userId)) {
                                str2 = "user id is null";
                            } else {
                                LoggerWrapper.e(F2FPayConstants.TAG, "re-init otp seed");
                                String generateDeviceId = F2FPayDefaultClient.this.getClientContext().getDeviceIdGenerator().generateDeviceId(context);
                                F2FPayDefaultClient.this.mInitializeComponent.initializeOtpInfoInWorker(generateDeviceId, ConvertUtils.getIdentity(userId, generateDeviceId));
                                return;
                            }
                        }
                        LoggerWrapper.e(F2FPayConstants.TAG, str2);
                    }
                }
            };
            SyncProvider syncProvider = new SyncProvider();
            syncProvider.registerReceiveCallback(F2FPayConstants.SyncBiz.F2FPAY_SYNC_GLOBAL, this.b);
            syncProvider.registerReceiveCallback(F2FPayConstants.SyncBiz.F2FPAY_SYNC_USER, this.b);
        }
    }

    public <T extends IF2FPayBaseComponent> void addComponent(Class<T> cls, T t) {
        if (t != null) {
            this.mComponents.put(cls, t);
        }
    }

    public IF2FPayCallbackHolder addPayOpenCallback(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
        IF2FPayOpenComponent iF2FPayOpenComponent = (IF2FPayOpenComponent) getComponent(IF2FPayOpenComponent.class);
        if (iF2FPayOpenComponent != null) {
            return iF2FPayOpenComponent.addOpenCallback(iF2FPayOpenCallback);
        }
        return null;
    }

    public IF2FPayCallbackHolder addPaymentCodeCallback(@NonNull IF2FPaymentCodeCallback iF2FPaymentCodeCallback) {
        return this.mPaymentCodeComponent.addPaymentCodeCallback(iF2FPaymentCodeCallback);
    }

    public void closeF2FPay() {
        IF2FPayOpenComponent iF2FPayOpenComponent = (IF2FPayOpenComponent) getComponent(IF2FPayOpenComponent.class);
        if (iF2FPayOpenComponent != null) {
            iF2FPayOpenComponent.switchOff();
        }
    }

    /* access modifiers changed from: protected */
    public void createComponents() {
        this.mInitializeComponent = createInitializeComponent();
        this.mPaymentCodeComponent = createPaymentCodeComponent();
        this.mResultHandleComponent = createResultHandleComponent();
        addPayOpenCallback(this);
        addComponent(IF2FPayOpenComponent.class, createOpenComponent());
        addComponent(IF2FPayInitializeComponent.class, this.mInitializeComponent);
        addComponent(IF2FPayPaymentCodeComponent.class, this.mPaymentCodeComponent);
        addComponent(IF2FPayResultHandleComponent.class, this.mResultHandleComponent);
        addComponent(IF2FPayTimeSyncComponent.class, createTimeSyncComponent());
        addComponent(IF2FPayUserSwitchComponent.class, createUserSwitchComponent());
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IF2FPayInitializeComponent createInitializeComponent() {
        return new DefaultInitializeComponent();
    }

    /* access modifiers changed from: protected */
    @Nullable
    public IF2FPayOpenComponent createOpenComponent() {
        return new DefaultOpenComponent();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IF2FPayPaymentCodeComponent createPaymentCodeComponent() {
        return new DefaultPaymentCodeComponent();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IF2FPayResultHandleComponent createResultHandleComponent() {
        return new PollingSyncResultHandleComponent();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IF2FPayTimeSyncComponent createTimeSyncComponent() {
        return new DefaultTimeSyncComponent();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IF2FPayUserSwitchComponent createUserSwitchComponent() {
        return new DefaultUserSwitchComponent();
    }

    public void deleteOtpSeed() {
        F2FPayClientContext f2FPayClientContext = this.mClientContext;
        if (f2FPayClientContext != null) {
            f2FPayClientContext.getSecureStorage().clear();
        }
    }

    public String getBizType() {
        return "f2fpay";
    }

    @Nullable
    public F2FPayClientContext getClientContext() {
        return this.mClientContext;
    }

    public synchronized <T extends IF2FPayBaseComponent> T getComponent(Class<T> cls) {
        T t = (IF2FPayBaseComponent) this.mComponents.get(cls);
        if (t != null) {
            return t;
        }
        Iterator<IF2FPayBaseComponent> it = this.mComponents.values().iterator();
        while (it.hasNext()) {
            T t2 = (IF2FPayBaseComponent) it.next();
            if (cls.isAssignableFrom(t2.getClass())) {
                this.mComponents.put(cls, t2);
                return t2;
            }
        }
        return null;
    }

    public Context getContext() {
        return this.mContext.get();
    }

    public String getSeedExtra() {
        return this.f9311a;
    }

    public boolean getStartRefreshFlag() {
        return this.startRefreshFlag;
    }

    public void initialize(@NonNull Application application, @NonNull F2FPayClientContext f2FPayClientContext) {
        this.mContext = new WeakReference<>(application);
        this.mClientContext = f2FPayClientContext;
        initializeComponents();
        a();
    }

    public synchronized void initializeComponents() {
        if (!this.mInitialized) {
            KeyValueRegistry.getInstance().initialize(getContext());
            for (IF2FPayBaseComponent initialize : this.mComponents.values()) {
                initialize.initialize(this);
            }
            this.mInitialized = true;
        }
    }

    public boolean isInitialized() {
        LoggerWrapper.d(F2FPayConstants.TAG, "[Client] has not initialized.");
        return this.mInitialized;
    }

    public void onDestroy() {
        LoggerWrapper.d(F2FPayConstants.TAG, "[Client] onDestroy.");
        IF2FPayUserSwitchComponent iF2FPayUserSwitchComponent = (IF2FPayUserSwitchComponent) getComponent(IF2FPayUserSwitchComponent.class);
        if (iF2FPayUserSwitchComponent != null && (iF2FPayUserSwitchComponent instanceof DefaultUserSwitchComponent)) {
            ((DefaultUserSwitchComponent) iF2FPayUserSwitchComponent).onDestroy();
        }
        SyncProvider syncProvider = new SyncProvider();
        syncProvider.unregisterReceiveCallback(F2FPayConstants.SyncBiz.F2FPAY_SYNC_USER);
        syncProvider.unregisterReceiveCallback(F2FPayConstants.SyncBiz.F2FPAY_SYNC_GLOBAL);
        this.b = null;
    }

    public void onSwitchOffFailed(String str) {
    }

    public void onSwitchOnCanceled() {
    }

    public void onSwitchOnFailed(String str) {
    }

    public void onSwitchStatusChanged(boolean z, IF2FPayOpenCallback.StatusChangeCausedBy statusChangeCausedBy) {
        if (z) {
            this.mInitializeComponent.asyncInitializeOtpInfo();
        }
    }

    public void refreshPaymentCode(int i) {
        this.mPaymentCodeComponent.requestRefresh(i);
    }

    public void setPayResultCallback(@Nullable IF2FPayResultCallback iF2FPayResultCallback) {
        this.mResultHandleComponent.setPayResultCallback(iF2FPayResultCallback);
    }

    public void setSeedExtra(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f9311a = str;
        stopRefreshTask();
        startRefreshTask();
    }

    public void setStartRefreshFlag(boolean z) {
        this.startRefreshFlag = z;
    }

    public void startF2FPay() {
        LoggerWrapper.d(F2FPayConstants.TAG, "[Client] start f2fpay.");
        this.startRefreshFlag = true;
        IF2FPayOpenComponent iF2FPayOpenComponent = (IF2FPayOpenComponent) getComponent(IF2FPayOpenComponent.class);
        if (iF2FPayOpenComponent == null) {
            this.mInitializeComponent.asyncInitializeOtpInfo();
        } else {
            iF2FPayOpenComponent.checkOpen();
        }
    }

    public void startRefreshTask() {
        this.startRefreshFlag = true;
        LoggerWrapper.d(F2FPayConstants.TAG, "[client] startRefreshTask. (PaymentCode-generate, PayResult-polling)");
        this.mPaymentCodeComponent.startRefreshTask();
        this.mResultHandleComponent.startHandleResult();
    }

    public void stopRefreshTask() {
        this.startRefreshFlag = false;
        LoggerWrapper.d(F2FPayConstants.TAG, "[Client] stopRefreshTask. (PaymentCode-generate, PayResult-polling)");
        this.mPaymentCodeComponent.stopRefreshTask();
        this.mResultHandleComponent.stopHandleResult();
    }
}
