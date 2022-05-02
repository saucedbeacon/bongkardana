package o;

import id.dana.domain.foundation.logger.LoginScenarioConstant;
import id.dana.domain.model.rpc.response.LoginResponse;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class DebugMonitor extends parseFailed<LoginResponse, setMin> {
    private final GriverLogger loginRepository;

    @Inject
    public DebugMonitor(appxLoadFailed appxloadfailed, getScheme getscheme, GriverLogger griverLogger) {
        super(appxloadfailed, getscheme);
        this.loginRepository = griverLogger;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<LoginResponse> buildUseCaseObservable(setMin setmin) {
        return this.loginRepository.login(LoginScenarioConstant.LOGIN, setmin.pin, (String) null, setmin.withMobileData);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public final String pin;
        /* access modifiers changed from: private */
        public final boolean withMobileData;

        private setMin(String str, boolean z) {
            this.pin = str;
            this.withMobileData = z;
        }

        public static setMin forLogin(String str, boolean z) {
            return new setMin(str, z);
        }
    }
}
