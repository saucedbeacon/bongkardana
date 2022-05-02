package o;

import android.text.TextUtils;
import com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.mobile.common.rpc.RpcException;
import id.dana.data.base.NetworkException;
import o.TitleBarRightButtonView;
import o.b;

public abstract class setMinProgress {
    private final DialogLayout accountEntityDataFactory;
    private final getAppLaunchParams errorConfigFactory;
    private final BackKeyDownPoint guardFacade;
    private final b.AnonymousClass3 loginEntityDataFactory;

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$holdLoginAndRetry$0(TitleBarRightButtonView.AnonymousClass1 r0, com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1) throws Exception {
        return r0;
    }

    public setMinProgress(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams) {
        this.accountEntityDataFactory = dialogLayout;
        this.loginEntityDataFactory = r2;
        this.guardFacade = backKeyDownPoint;
        this.errorConfigFactory = getapplaunchparams;
    }

    public <T> TitleBarRightButtonView.AnonymousClass1<T> authenticatedRequest(TitleBarRightButtonView.AnonymousClass1<T> r2) {
        return r2.onErrorResumeNext((RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>>) holdLoginAndRetry(r2));
    }

    private <T> RedDotDrawable<Throwable, ? extends TitleBarRightButtonView.AnonymousClass1<? extends T>> holdLoginAndRetry(TitleBarRightButtonView.AnonymousClass1<T> r2) {
        return new setMaxFrame(this, r2);
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$holdLoginAndRetry$2(TitleBarRightButtonView.AnonymousClass1 r3, Throwable th) throws Exception {
        if ((th instanceof RpcException) && ((RpcException) th).getCode() == 2000) {
            return createAccountData().getUserId().concatMap(new setMinAndMaxFrame(this, r3));
        }
        if (th instanceof NetworkException) {
            NetworkException networkException = (NetworkException) th;
            networkException.setErrorMessage(getErrorOfflineConfig(networkException.getErrorCode(), networkException.getMessage()));
        }
        return TitleBarRightButtonView.AnonymousClass1.error(th);
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$holdLoginAndRetry$1(TitleBarRightButtonView.AnonymousClass1 r4, String str) throws Exception {
        return createNetworkLogin().holdLogin(str, getBadgeList.getClientKey(this.guardFacade, "")).doOnNext(saveClientKey()).doOnNext(notifyPayApi()).concatMap(new getSpeed(r4));
    }

    private String getErrorOfflineConfig(String str, String str2) {
        String errorMessageByKey = createLocalErrorConfigData().getErrorMessageByKey(str, createNetworkErrorConfigData().getErrorConfigAmcs());
        return !TextUtils.isEmpty(errorMessageByKey) ? errorMessageByKey : str2;
    }

    /* access modifiers changed from: protected */
    public setDrawDivider createAccountData() {
        return this.accountEntityDataFactory.createData("local");
    }

    private AppConfigModel createNetworkErrorConfigData() {
        return this.errorConfigFactory.createData("network");
    }

    private AppConfigModel createLocalErrorConfigData() {
        return this.errorConfigFactory.createData("local");
    }

    private b.AnonymousClass6 createNetworkLogin() {
        return this.loginEntityDataFactory.createData("network");
    }

    private RedDotManager<com_alibaba_ariver_app_api_ExtOpt$69$1> saveClientKey() {
        return new setMaxProgress(this);
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void lambda$saveClientKey$3(com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1) throws Exception {
        if (com_alibaba_ariver_app_api_extopt_69_1.success && !b.AnonymousClass12.isNeedChallenge(com_alibaba_ariver_app_api_extopt_69_1.verificationMethods) && !TextUtils.isEmpty(com_alibaba_ariver_app_api_extopt_69_1.clientKey)) {
            getBadgeList.setClientKey(this.guardFacade, com_alibaba_ariver_app_api_extopt_69_1.clientKey);
        }
    }

    private RedDotManager<com_alibaba_ariver_app_api_ExtOpt$69$1> notifyPayApi() {
        return getMaxFrame.setMax;
    }

    static /* synthetic */ void lambda$notifyPayApi$4(com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1) throws Exception {
        if (com_alibaba_ariver_app_api_extopt_69_1.success && !b.AnonymousClass12.isNeedChallenge(com_alibaba_ariver_app_api_extopt_69_1.verificationMethods)) {
            IAPLoginUserInfo iAPLoginUserInfo = new IAPLoginUserInfo();
            iAPLoginUserInfo.userID = com_alibaba_ariver_app_api_extopt_69_1.userId;
            iAPLoginUserInfo.sessionID = com_alibaba_ariver_app_api_extopt_69_1.sessionId;
            UserInfoManager.instance().loginNotify(iAPLoginUserInfo);
        }
    }
}
