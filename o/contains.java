package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class contains implements requestPermission {
    private final DialogLayout accountEntityDataFactory;
    private final b.AnonymousClass12 challengeManager;
    private final JsApiStatTrackServiceImpl otpEntityDataFactory;
    private final ParamBinder otpMapper;
    private final RequestBinder otpRetryManager;
    private final getLogType processManager;

    @Inject
    public contains(JsApiStatTrackServiceImpl jsApiStatTrackServiceImpl, DialogLayout dialogLayout, getLogType getlogtype, b.AnonymousClass12 r4, RequestBinder requestBinder, ParamBinder paramBinder) {
        this.otpEntityDataFactory = jsApiStatTrackServiceImpl;
        this.accountEntityDataFactory = dialogLayout;
        this.processManager = getlogtype;
        this.challengeManager = r4;
        this.otpRetryManager = requestBinder;
        this.otpMapper = paramBinder;
    }

    private trackKeyJSAPIInvoke createNetworkOtpData() {
        return this.otpEntityDataFactory.createData("network");
    }

    private trackKeyJSAPIInvoke createOtpReceiverData() {
        return this.otpEntityDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<canSendRequest> verifyOtp(@NonNull String str) {
        TitleBarRightButtonView.AnonymousClass1<getAppxVersionInWorker> verifyOtp = createNetworkOtpData().verifyOtp(this.processManager.getPhoneNumber(), str);
        ParamBinder paramBinder = this.otpMapper;
        Objects.requireNonNull(paramBinder);
        return verifyOtp.map(new IdBinder(paramBinder));
    }

    public TitleBarRightButtonView.AnonymousClass1<positivePermissionsResult> sendOtp(String str, String str2) {
        if (TextUtils.isEmpty(this.challengeManager.getPhoneNumber()) || !this.challengeManager.getPhoneNumber().equals(this.otpRetryManager.getPhoneNumber()) || !this.otpRetryManager.isNotOverRetry()) {
            TitleBarRightButtonView.AnonymousClass1<getJsApiDetail4TinyWithT2> doOnNext = createNetworkOtpData().sendOtp(sendPhoneNumber(str), str, str2).doOnNext(new CallbackBinder(this, str));
            ParamBinder paramBinder = this.otpMapper;
            Objects.requireNonNull(paramBinder);
            return doOnNext.map(new Binder(paramBinder));
        }
        RequestBinder requestBinder = this.otpRetryManager;
        Objects.requireNonNull(requestBinder);
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new ExecutorBinder(requestBinder));
        ParamBinder paramBinder2 = this.otpMapper;
        Objects.requireNonNull(paramBinder2);
        return fromCallable.map(new Binder(paramBinder2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendOtp$0(String str, getJsApiDetail4TinyWithT2 getjsapidetail4tinywitht2) throws Exception {
        this.otpRetryManager.setPhoneNumber(sendPhoneNumber(str));
        this.otpRetryManager.setSendOtpResult(getjsapidetail4tinywitht2);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> receiveOtp() {
        return createOtpReceiverData().receiveOtp();
    }

    private String sendPhoneNumber(String str) {
        if ("AP_LOGIN".equals(str)) {
            return this.challengeManager.getPhoneNumber();
        }
        return getAccountPhoneNumber();
    }

    private String getAccountPhoneNumber() {
        return (String) createAccountEntityData().getAccount().map(BindException.setMin).blockingFirst();
    }

    private setDrawDivider createAccountEntityData() {
        return this.accountEntityDataFactory.createData("local");
    }
}
