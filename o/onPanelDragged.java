package o;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.challenge.ChallengeScenario;
import id.dana.challenge.LoginFailureException;
import id.dana.constants.ErrorCode;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.model.rpc.response.LoginResponse;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.crashDetected;
import o.getAnalyticsMonitorConfig;
import o.setShadowDrawable;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J$\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0016H\u0016J\u0018\u0010\b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/challenge/verifypush/VerifyPushLoginPresenter;", "Lid/dana/challenge/verifypush/VerifyPushContract$Presenter;", "view", "Lid/dana/challenge/verifypush/VerifyPushContract$View;", "twilioTimeoutConfig", "Lid/dana/domain/featureconfig/interactor/GetTwilioTimeoutConfig;", "twilioRequestChallenge", "Lid/dana/domain/twilio/interactor/TwilioRequestChallenge;", "verifyPushLogin", "Lid/dana/domain/login/interactor/VerifyPushLogin;", "(Lid/dana/challenge/verifypush/VerifyPushContract$View;Lid/dana/domain/featureconfig/interactor/GetTwilioTimeoutConfig;Lid/dana/domain/twilio/interactor/TwilioRequestChallenge;Lid/dana/domain/login/interactor/VerifyPushLogin;)V", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "convertParamToTwilioChallenge", "Lid/dana/challenge/verifypush/model/request/TwilioChallengeModel;", "scene", "", "challengeInfo", "", "getTwilioTimeoutConfig", "", "onDestroy", "requestChallenge", "verifyAnswer", "loginType", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class onPanelDragged implements setShadowDrawable.getMax {
    @NotNull
    public static final length getMax = new length((byte) 0);
    int getMin = 20;
    private final crashDetected isInside;
    /* access modifiers changed from: private */
    public final setShadowDrawable.setMin length;
    final getAnalyticsMonitorConfig setMax;
    public final getContentWidth setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ onPanelDragged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(onPanelDragged onpaneldragged) {
            super(1);
            this.this$0 = onpaneldragged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.setMin(10, 20);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ onPanelDragged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(onPanelDragged onpaneldragged) {
            super(1);
            this.this$0 = onpaneldragged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.length("", false);
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_REQUEST_CHALLENGE, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/featureconfig/model/TwilioTimeoutConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<onWebViewEvent, Unit> {
        final /* synthetic */ onPanelDragged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(onPanelDragged onpaneldragged) {
            super(1);
            this.this$0 = onpaneldragged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((onWebViewEvent) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull onWebViewEvent onwebviewevent) {
            Intrinsics.checkNotNullParameter(onwebviewevent, "it");
            this.this$0.getMin = onwebviewevent.getCounter();
            this.this$0.length.setMin(onwebviewevent.getTimeout(), onwebviewevent.getCounter());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/twilio/model/RequestChallengeInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<setBetterBleListener, Unit> {
        final /* synthetic */ onPanelDragged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(onPanelDragged onpaneldragged) {
            super(1);
            this.this$0 = onpaneldragged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((setBetterBleListener) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull setBetterBleListener setbetterblelistener) {
            Intrinsics.checkNotNullParameter(setbetterblelistener, "it");
            setShadowDrawable.setMin min = this.this$0.length;
            String challengeSid = setbetterblelistener.getChallengeSid();
            setbetterblelistener.getTimer();
            min.length(challengeSid, true);
            onPanelDragged onpaneldragged = this.this$0;
            String challengeSid2 = setbetterblelistener.getChallengeSid();
            Intrinsics.checkNotNullParameter(challengeSid2, "verifyAnswer");
            Intrinsics.checkNotNullParameter(ChallengeScenario.TRUST_RISK_LOGIN, "loginType");
            onpaneldragged.setMax.execute(new IsOverlapping(onpaneldragged, challengeSid2), new getAnalyticsMonitorConfig.length(challengeSid2, ChallengeScenario.TRUST_RISK_LOGIN, onpaneldragged.getMin));
        }
    }

    @Inject
    public onPanelDragged(@NotNull setShadowDrawable.setMin setmin, @NotNull getContentWidth getcontentwidth, @NotNull crashDetected crashdetected, @NotNull getAnalyticsMonitorConfig getanalyticsmonitorconfig) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(getcontentwidth, "twilioTimeoutConfig");
        Intrinsics.checkNotNullParameter(crashdetected, "twilioRequestChallenge");
        Intrinsics.checkNotNullParameter(getanalyticsmonitorconfig, "verifyPushLogin");
        this.length = setmin;
        this.setMin = getcontentwidth;
        this.isInside = crashdetected;
        this.setMax = getanalyticsmonitorconfig;
    }

    public final void length(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "scene");
        Intrinsics.checkNotNullParameter(map, "challengeInfo");
        crashDetected crashdetected = this.isInside;
        invalidateChildRegion invalidatechildregion = new invalidateChildRegion(str, map);
        Intrinsics.checkNotNullParameter(invalidatechildregion, "$this$toTwilioChallenge");
        crashdetected.execute(new crashDetected.getMax(new BLEManager(invalidatechildregion.setMax, invalidatechildregion.getMax)), new setMin(this), new getMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/verifypush/VerifyPushLoginPresenter$verifyPushLogin$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/model/rpc/response/LoginResponse;", "onError", "", "e", "", "onNext", "loginResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<LoginResponse> {
        final /* synthetic */ onPanelDragged getMin;
        final /* synthetic */ String length;

        IsOverlapping(onPanelDragged onpaneldragged, String str) {
            this.getMin = onpaneldragged;
            this.length = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            LoginResponse loginResponse = (LoginResponse) obj;
            Intrinsics.checkNotNullParameter(loginResponse, ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            if (loginResponse.isSuccess()) {
                this.getMin.length.length(this.length);
                return;
            }
            String str = "";
            if (Intrinsics.areEqual((Object) loginResponse.getErrorCode(), (Object) ErrorCode.ERROR_RISK_REJECT)) {
                this.getMin.length.setMin(this.length);
                String errorMessage = loginResponse.getErrorMessage();
                if (errorMessage != null) {
                    str = errorMessage;
                }
                LoginFailureException loginFailureException = new LoginFailureException(str);
                Intrinsics.checkNotNullParameter(loginFailureException, "$this$logToCrashlytics");
                try {
                    FirebaseCrashlytics.getInstance().recordException(loginFailureException);
                } catch (Exception unused) {
                }
            } else {
                String errorMessage2 = loginResponse.getErrorMessage();
                if (errorMessage2 != null) {
                    str = errorMessage2;
                }
                LoginFailureException loginFailureException2 = new LoginFailureException(str);
                Intrinsics.checkNotNullParameter(loginFailureException2, "$this$logToCrashlytics");
                try {
                    FirebaseCrashlytics.getInstance().recordException(loginFailureException2);
                } catch (Exception unused2) {
                }
                this.getMin.length.getMax(str, this.length);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            String message = th.getMessage();
            LoginFailureException loginFailureException = new LoginFailureException(th);
            Intrinsics.checkNotNullParameter(loginFailureException, "$this$logToCrashlytics");
            try {
                FirebaseCrashlytics.getInstance().recordException(loginFailureException);
            } catch (Exception unused) {
            }
            this.getMin.length.getMax(message, this.length);
        }
    }

    public final void setMax() {
        this.setMin.dispose();
        this.isInside.dispose();
        this.setMax.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/challenge/verifypush/VerifyPushLoginPresenter$Companion;", "", "()V", "DEFAULT_COUNTER", "", "DEFAULT_TIMEOUT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
