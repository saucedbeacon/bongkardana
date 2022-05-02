package o;

import id.dana.domain.model.rpc.response.LoginResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/login/interactor/VerifyPushLogin;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/model/rpc/response/LoginResponse;", "Lid/dana/domain/login/interactor/VerifyPushLogin$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "loginRepository", "Lid/dana/domain/login/LoginRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/login/LoginRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getAnalyticsMonitorConfig extends parseFailed<LoginResponse, length> {
    private final GriverLogger loginRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getAnalyticsMonitorConfig(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull GriverLogger griverLogger) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(griverLogger, "loginRepository");
        this.loginRepository = griverLogger;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LoginResponse> buildUseCaseObservable(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        TitleBarRightButtonView.AnonymousClass1<LoginResponse> verifyPushLogin = this.loginRepository.verifyPushLogin(length2.getVerifyAnswer(), length2.getLoginType(), length2.getRetryTreshold());
        Intrinsics.checkNotNullExpressionValue(verifyPushLogin, "loginRepository.verifyPu…pe, params.retryTreshold)");
        return verifyPushLogin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lid/dana/domain/login/interactor/VerifyPushLogin$Params;", "", "verifyAnswer", "", "loginType", "retryTreshold", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getLoginType", "()Ljava/lang/String;", "getRetryTreshold", "()I", "getVerifyAnswer", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        private final String loginType;
        private final int retryTreshold;
        @NotNull
        private final String verifyAnswer;

        public length(@NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "verifyAnswer");
            Intrinsics.checkNotNullParameter(str2, "loginType");
            this.verifyAnswer = str;
            this.loginType = str2;
            this.retryTreshold = i;
        }

        @NotNull
        public final String getLoginType() {
            return this.loginType;
        }

        public final int getRetryTreshold() {
            return this.retryTreshold;
        }

        @NotNull
        public final String getVerifyAnswer() {
            return this.verifyAnswer;
        }
    }
}
