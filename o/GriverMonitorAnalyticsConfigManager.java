package o;

import id.dana.domain.foundation.logger.LoginScenarioConstant;
import id.dana.domain.model.rpc.response.LoginResponse;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class GriverMonitorAnalyticsConfigManager extends parseFailed<LoginResponse, length> {
    private final GriverLogger loginRepository;

    @Inject
    public GriverMonitorAnalyticsConfigManager(appxLoadFailed appxloadfailed, getScheme getscheme, GriverLogger griverLogger) {
        super(appxloadfailed, getscheme);
        this.loginRepository = griverLogger;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<LoginResponse> buildUseCaseObservable(length length2) {
        return this.loginRepository.login(LoginScenarioConstant.TRUSTRISKLOGIN, length2.pin, length2.securityId, length2.withMobileData);
    }

    public static class length {
        /* access modifiers changed from: private */
        public final String pin;
        /* access modifiers changed from: private */
        public final String securityId;
        /* access modifiers changed from: private */
        public final boolean withMobileData;

        private length(String str, String str2, boolean z) {
            this.pin = str;
            this.securityId = str2;
            this.withMobileData = z;
        }

        public static length forLogin(String str, String str2, boolean z) {
            return new length(str, str2, z);
        }
    }
}
