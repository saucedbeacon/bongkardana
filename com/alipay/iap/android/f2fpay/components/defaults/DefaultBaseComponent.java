package com.alipay.iap.android.f2fpay.components.defaults;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.product.delegate.IAPUserDelegate;
import com.alipay.iap.android.f2fpay.client.F2FPayClientContext;
import com.alipay.iap.android.f2fpay.client.F2FPayDefaultClient;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.common.KeyValueAccessor;
import com.alipay.iap.android.f2fpay.common.KeyValueRegistry;
import com.alipay.iap.android.f2fpay.components.IF2FPayBaseComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayOpenComponent;
import com.alipay.iap.android.f2fpay.extension.IF2FPayLogger;
import com.alipay.iap.android.f2fpay.util.ConvertUtils;

public abstract class DefaultBaseComponent implements IF2FPayBaseComponent {
    protected IF2FPayClient mPayClient;

    /* access modifiers changed from: protected */
    public String generateTerminalIdentifier() {
        return getClientContext().getDeviceIdGenerator().generateDeviceId(getContext());
    }

    /* access modifiers changed from: protected */
    public String generateUserIdentity() {
        F2FPayClientContext clientContext = getClientContext();
        return ConvertUtils.getIdentity(clientContext.getUserDelegate().getUserId(), generateTerminalIdentifier());
    }

    /* access modifiers changed from: protected */
    @NonNull
    public F2FPayClientContext getClientContext() {
        return this.mPayClient.getClientContext();
    }

    /* access modifiers changed from: protected */
    public <T extends IF2FPayBaseComponent> T getComponent(Class<T> cls) {
        return this.mPayClient.getComponent(cls);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public Context getContext() {
        return this.mPayClient.getContext();
    }

    /* access modifiers changed from: protected */
    public IF2FPayLogger getLogger() {
        return getClientContext().getPayLogger();
    }

    public boolean getStartRefreshFlag() {
        return this.mPayClient.getStartRefreshFlag();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IAPUserDelegate getUserDelegate() {
        return getClientContext().getUserDelegate();
    }

    public void initialize(IF2FPayClient iF2FPayClient) {
        this.mPayClient = iF2FPayClient;
    }

    /* access modifiers changed from: protected */
    public void initializeOtpInfo() {
        ((IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class)).asyncInitializeOtpInfo();
    }

    /* access modifiers changed from: protected */
    public boolean isF2FPayOpen() {
        IF2FPayOpenComponent iF2FPayOpenComponent = (IF2FPayOpenComponent) getComponent(IF2FPayOpenComponent.class);
        return iF2FPayOpenComponent == null || iF2FPayOpenComponent.isOpen();
    }

    /* access modifiers changed from: protected */
    public KeyValueAccessor keyValueAccessor() {
        KeyValueRegistry instance;
        String str;
        if (this.mPayClient instanceof F2FPayDefaultClient) {
            instance = KeyValueRegistry.getInstance();
            str = ((F2FPayDefaultClient) this.mPayClient).getBizType();
        } else {
            instance = KeyValueRegistry.getInstance();
            str = null;
        }
        return instance.accessor(str);
    }

    public void setStartRefreshFlag(boolean z) {
        this.mPayClient.setStartRefreshFlag(z);
    }
}
