package o;

import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.domain.model.rpc.response.LoginResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/onboarding/interactor/BokuLogin;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/model/rpc/response/LoginResponse;", "Lid/dana/domain/onboarding/interactor/BokuLogin$Params;", "loginRepository", "Lid/dana/domain/login/LoginRepository;", "(Lid/dana/domain/login/LoginRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getNetworkType extends APWebChromeClient<LoginResponse, setMin> {
    private final GriverLogger loginRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getNetworkType(@NotNull GriverLogger griverLogger) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverLogger, "loginRepository");
        this.loginRepository = griverLogger;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LoginResponse> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        TitleBarRightButtonView.AnonymousClass1<LoginResponse> bokuLogin = this.loginRepository.bokuLogin(setmin.getLoginResponse(), setmin.getPhoneNumber(), setmin.getPin(), setmin.getKey(), setmin.getLoginScenario());
        Intrinsics.checkNotNullExpressionValue(bokuLogin, "loginRepository.bokuLogi…s.loginScenario\n        )");
        return bokuLogin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lid/dana/domain/onboarding/interactor/BokuLogin$Params;", "", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "phoneNumber", "", "pin", "key", "loginScenario", "(Lid/dana/domain/model/rpc/response/LoginResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getLoginResponse", "()Lid/dana/domain/model/rpc/response/LoginResponse;", "getLoginScenario", "getPhoneNumber", "getPin", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String key;
        @NotNull
        private final LoginResponse loginResponse;
        @NotNull
        private final String loginScenario;
        @NotNull
        private final String phoneNumber;
        @NotNull
        private final String pin;

        public setMin(@NotNull LoginResponse loginResponse2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(loginResponse2, ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            Intrinsics.checkNotNullParameter(str2, "pin");
            Intrinsics.checkNotNullParameter(str3, "key");
            Intrinsics.checkNotNullParameter(str4, "loginScenario");
            this.loginResponse = loginResponse2;
            this.phoneNumber = str;
            this.pin = str2;
            this.key = str3;
            this.loginScenario = str4;
        }

        @NotNull
        public final LoginResponse getLoginResponse() {
            return this.loginResponse;
        }

        @NotNull
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NotNull
        public final String getPin() {
            return this.pin;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getLoginScenario() {
            return this.loginScenario;
        }
    }
}
