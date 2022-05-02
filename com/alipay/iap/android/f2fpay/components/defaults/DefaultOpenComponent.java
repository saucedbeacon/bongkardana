package com.alipay.iap.android.f2fpay.components.defaults;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.ap.mobileprod.biz.f2fpay.rpc.F2fpaySwitchFacade;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.rpcintegration.EnvironmentInfo;
import com.alipay.iap.android.common.rpcintegration.EnvironmentInfoHost;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.iap.android.common.utils.security.RSAHelper;
import com.alipay.iap.android.f2fpay.client.CheckOpenStrategy;
import com.alipay.iap.android.f2fpay.client.F2FPayClientContext;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayOpenCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaySwitchOnVerifier;
import com.alipay.iap.android.f2fpay.common.F2FPayAsyncTask;
import com.alipay.iap.android.f2fpay.common.F2FPayCallbacks;
import com.alipay.iap.android.f2fpay.common.IF2FPayCallbackHolder;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayOpenComponent;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import com.alipayplus.mobile.component.common.facade.base.result.BaseServiceResult;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fpaySwitchOffRequest;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fpaySwitchOnRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fpayCheckOpenResult;

public class DefaultOpenComponent extends DefaultBaseComponent implements IF2FPayOpenComponent {
    protected F2fpayCheckOpenResult mCachedCheckResult;
    protected boolean mIsOpen;
    protected F2FPayCallbacks<IF2FPayOpenCallback> mOpenCallbacks = new F2FPayCallbacks<>();
    protected IF2FPaySwitchOnVerifier mSwitchOnVerifier;

    private F2fpaySwitchOnRequest a() {
        F2fpaySwitchOnRequest f2fpaySwitchOnRequest = new F2fpaySwitchOnRequest();
        f2fpaySwitchOnRequest.envInfo = getMobileEnvInfo(this.mPayClient.getContext());
        f2fpaySwitchOnRequest.verificationType = "nonPwd";
        f2fpaySwitchOnRequest.password = "";
        return f2fpaySwitchOnRequest;
    }

    /* access modifiers changed from: private */
    public void a(final F2fpaySwitchOnRequest f2fpaySwitchOnRequest) {
        F2FPayAsyncTask.asyncTask(new F2FPayAsyncTask.F2FPayRunner<BaseServiceResult>() {
            public BaseServiceResult execute() throws Exception {
                return DefaultOpenComponent.b().switchOn(f2fpaySwitchOnRequest);
            }

            public void onFailure(final IAPError iAPError) {
                super.onFailure(iAPError);
                DefaultOpenComponent.this.setF2FOpen(false);
                DefaultOpenComponent.this.mOpenCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayOpenCallback>() {
                    public void invoke(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
                        iF2FPayOpenCallback.onSwitchOnFailed(iAPError.errorMessage);
                    }
                });
            }

            public void onSuccess(final BaseServiceResult baseServiceResult) {
                super.onSuccess(baseServiceResult);
                DefaultOpenComponent.this.setF2FOpen(baseServiceResult.success);
                if (baseServiceResult.success) {
                    DefaultOpenComponent.this.initializeOtpInfo();
                }
                DefaultOpenComponent.this.mOpenCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayOpenCallback>() {
                    public void invoke(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
                        if (baseServiceResult.success) {
                            iF2FPayOpenCallback.onSwitchStatusChanged(true, IF2FPayOpenCallback.StatusChangeCausedBy.SwitchOn);
                        } else {
                            iF2FPayOpenCallback.onSwitchOnFailed(baseServiceResult.errorMessage);
                        }
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    public static F2fpaySwitchFacade b() {
        return (F2fpaySwitchFacade) RPCProxyHost.getInterfaceProxy(F2fpaySwitchFacade.class);
    }

    public static F2fpaySwitchOnRequest buildPasswordSwitchOnRequest(Context context, String str, String str2) {
        F2fpaySwitchOnRequest f2fpaySwitchOnRequest = new F2fpaySwitchOnRequest();
        f2fpaySwitchOnRequest.envInfo = getMobileEnvInfo(context);
        f2fpaySwitchOnRequest.verificationType = "AccPwd";
        if (!TextUtils.isEmpty(str2)) {
            f2fpaySwitchOnRequest.password = RSAHelper.encrypt(str, str2);
        } else {
            f2fpaySwitchOnRequest.password = str;
        }
        return f2fpaySwitchOnRequest;
    }

    public static MobileEnvInfo getMobileEnvInfo(Context context) {
        MobileEnvInfo mobileEnvInfo = new MobileEnvInfo();
        EnvironmentInfo environmentInfo = EnvironmentInfoHost.getEnvironmentInfo(context);
        mobileEnvInfo.tokenId = environmentInfo.tokenId;
        mobileEnvInfo.clientIp = environmentInfo.clientIp;
        mobileEnvInfo.terminalType = environmentInfo.terminalType;
        mobileEnvInfo.osType = environmentInfo.osType;
        mobileEnvInfo.osVersion = environmentInfo.osVersion;
        mobileEnvInfo.cashierSdkVersion = environmentInfo.cashierSdkVersion;
        mobileEnvInfo.appVersion = environmentInfo.appVersion;
        mobileEnvInfo.clientKey = environmentInfo.clientKey;
        mobileEnvInfo.extendInfo = environmentInfo.extendInfo;
        return mobileEnvInfo;
    }

    public IF2FPayCallbackHolder addOpenCallback(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
        return this.mOpenCallbacks.addCallback(iF2FPayOpenCallback);
    }

    public void checkOpen() {
        if (CheckOpenStrategy.FORCE_CHECK != getClientContext().getCheckOpenStrategy()) {
            this.mOpenCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayOpenCallback>() {
                public void invoke(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
                    iF2FPayOpenCallback.onSwitchStatusChanged(DefaultOpenComponent.this.mIsOpen, IF2FPayOpenCallback.StatusChangeCausedBy.CheckOpen);
                }
            });
            if (!this.mIsOpen) {
                switchOn();
                return;
            }
        }
        F2FPayAsyncTask.asyncTask(new F2FPayAsyncTask.F2FPayRunner<F2fpayCheckOpenResult>() {
            public F2fpayCheckOpenResult execute() throws Exception {
                return DefaultOpenComponent.b().checkOpen(new BaseRpcRequest());
            }

            public void onFailure(IAPError iAPError) {
                super.onFailure(iAPError);
                DefaultOpenComponent.this.mCachedCheckResult = null;
                DefaultOpenComponent.this.onCheckOpenFailed(iAPError.errorMessage);
            }

            public void onSuccess(final F2fpayCheckOpenResult f2fpayCheckOpenResult) {
                super.onSuccess(f2fpayCheckOpenResult);
                DefaultOpenComponent.this.mCachedCheckResult = f2fpayCheckOpenResult;
                if (f2fpayCheckOpenResult.success) {
                    DefaultOpenComponent.this.setF2FOpen(f2fpayCheckOpenResult.openFlag);
                    if (!f2fpayCheckOpenResult.openFlag) {
                        ((IF2FPayInitializeComponent) DefaultOpenComponent.this.getComponent(IF2FPayInitializeComponent.class)).clearOtpInfo();
                        DefaultOpenComponent.this.mPayClient.refreshPaymentCode(0);
                    }
                    DefaultOpenComponent.this.mOpenCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayOpenCallback>() {
                        public void invoke(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
                            iF2FPayOpenCallback.onSwitchStatusChanged(f2fpayCheckOpenResult.openFlag, IF2FPayOpenCallback.StatusChangeCausedBy.CheckOpen);
                        }
                    });
                    if (!f2fpayCheckOpenResult.openFlag) {
                        DefaultOpenComponent.this.switchOn();
                        return;
                    }
                    return;
                }
                DefaultOpenComponent.this.onCheckOpenFailed(f2fpayCheckOpenResult.errorMessage);
            }
        });
    }

    public void initialize(IF2FPayClient iF2FPayClient) {
        super.initialize(iF2FPayClient);
        F2FPayClientContext clientContext = getClientContext();
        if (CheckOpenStrategy.FORCE_CHECK != clientContext.getCheckOpenStrategy()) {
            this.mIsOpen = clientContext.getSecureStorage().checkOtpInfoExist(generateUserIdentity());
        }
    }

    public boolean isOpen() {
        return this.mIsOpen;
    }

    /* access modifiers changed from: protected */
    public void onCheckOpenFailed(String str) {
    }

    /* access modifiers changed from: protected */
    public void setF2FOpen(boolean z) {
        this.mIsOpen = z;
        if (!z) {
            ((IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class)).clearOtpInfo();
        }
    }

    public void setLocalOpenFlag(boolean z) {
        this.mIsOpen = z;
    }

    public void setSwitchOnVerifier(@Nullable IF2FPaySwitchOnVerifier iF2FPaySwitchOnVerifier) {
        this.mSwitchOnVerifier = iF2FPaySwitchOnVerifier;
    }

    public void switchOff() {
        F2FPayAsyncTask.asyncTask(new F2FPayAsyncTask.F2FPayRunner<BaseServiceResult>() {
            public BaseServiceResult execute() throws Exception {
                F2fpaySwitchOffRequest f2fpaySwitchOffRequest = new F2fpaySwitchOffRequest();
                f2fpaySwitchOffRequest.tid = DefaultOpenComponent.this.generateTerminalIdentifier();
                return DefaultOpenComponent.b().switchOff(f2fpaySwitchOffRequest);
            }

            public void onFailure(final IAPError iAPError) {
                super.onFailure(iAPError);
                DefaultOpenComponent.this.mOpenCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayOpenCallback>() {
                    public void invoke(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
                        iF2FPayOpenCallback.onSwitchOffFailed(iAPError.errorMessage);
                    }
                });
            }

            public void onSuccess(final BaseServiceResult baseServiceResult) {
                super.onSuccess(baseServiceResult);
                DefaultOpenComponent.this.setF2FOpen(false);
                DefaultOpenComponent.this.mOpenCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayOpenCallback>() {
                    public void invoke(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
                        if (baseServiceResult.success) {
                            iF2FPayOpenCallback.onSwitchStatusChanged(false, IF2FPayOpenCallback.StatusChangeCausedBy.SwitchOff);
                        } else {
                            iF2FPayOpenCallback.onSwitchOffFailed(baseServiceResult.errorMessage);
                        }
                    }
                });
            }
        });
    }

    public void switchOn() {
        IF2FPaySwitchOnVerifier iF2FPaySwitchOnVerifier = this.mSwitchOnVerifier;
        if (iF2FPaySwitchOnVerifier == null) {
            a(a());
        } else {
            iF2FPaySwitchOnVerifier.verifySwitchOnF2FPay(this.mCachedCheckResult, new IF2FPaySwitchOnVerifier.Callback() {
                public void onVerifyCallback(F2fpaySwitchOnRequest f2fpaySwitchOnRequest) {
                    DefaultOpenComponent.this.a(f2fpaySwitchOnRequest);
                }

                public void onVerifyCanceled() {
                    DefaultOpenComponent.this.mOpenCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayOpenCallback>() {
                        public void invoke(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback) {
                            iF2FPayOpenCallback.onSwitchOnCanceled();
                        }
                    });
                }
            });
        }
    }
}
