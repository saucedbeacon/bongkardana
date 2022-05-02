package com.alipay.iap.android.f2fpay.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.product.delegate.IAPUserDelegate;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.iap.android.f2fpay.extension.IF2FPayDeviceIdGenerator;
import com.alipay.iap.android.f2fpay.extension.IF2FPayLogger;
import com.alipay.iap.android.f2fpay.extension.IF2FPayPaymentCodeGenerator;
import com.alipay.iap.android.f2fpay.extension.IF2FPaySecureStorage;

public abstract class F2FPayClientContext {

    /* renamed from: a  reason: collision with root package name */
    private CheckOpenStrategy f9310a;
    protected IF2FPayDeviceIdGenerator mDeviceIdGenerator;
    protected IF2FPayLogger mPayLogger;
    protected IF2FPayPaymentCodeGenerator mPaymentCodeGenerator;
    protected IF2FPaySecureStorage mSecureStorage;
    protected IAPUserDelegate mUserDelegate;

    public F2FPayClientContext(@NonNull Context context) {
        this(context, (IAPUserDelegate) UserInfoManager.instance());
    }

    public F2FPayClientContext(@NonNull Context context, @NonNull IAPUserDelegate iAPUserDelegate) {
        this(context, iAPUserDelegate, CheckOpenStrategy.DEFAULT);
    }

    public F2FPayClientContext(@NonNull Context context, @NonNull IAPUserDelegate iAPUserDelegate, CheckOpenStrategy checkOpenStrategy) {
        this.mUserDelegate = iAPUserDelegate;
        this.mPayLogger = createPayLogger();
        this.mSecureStorage = createSecureStorage();
        this.mDeviceIdGenerator = createDeviceIdGenerator();
        this.mPaymentCodeGenerator = createPaymentCodeGenerator();
        this.f9310a = checkOpenStrategy;
        initializeProviders(context);
    }

    public F2FPayClientContext(@NonNull Context context, CheckOpenStrategy checkOpenStrategy) {
        this(context, UserInfoManager.instance(), checkOpenStrategy);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract IF2FPayDeviceIdGenerator createDeviceIdGenerator();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract IF2FPayLogger createPayLogger();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract IF2FPayPaymentCodeGenerator createPaymentCodeGenerator();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract IF2FPaySecureStorage createSecureStorage();

    public CheckOpenStrategy getCheckOpenStrategy() {
        return this.f9310a;
    }

    @NonNull
    public IF2FPayDeviceIdGenerator getDeviceIdGenerator() {
        return this.mDeviceIdGenerator;
    }

    public IF2FPayLogger getPayLogger() {
        return this.mPayLogger;
    }

    @NonNull
    public IF2FPayPaymentCodeGenerator getPaymentCodeGenerator() {
        return this.mPaymentCodeGenerator;
    }

    @NonNull
    public IF2FPaySecureStorage getSecureStorage() {
        return this.mSecureStorage;
    }

    @NonNull
    public IAPUserDelegate getUserDelegate() {
        return this.mUserDelegate;
    }

    /* access modifiers changed from: protected */
    public void initializeProviders(@NonNull Context context) {
        this.mSecureStorage.initialize(context);
    }
}
