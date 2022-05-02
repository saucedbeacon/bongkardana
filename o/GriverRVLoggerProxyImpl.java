package o;

import id.dana.domain.model.rpc.response.LoginResponse;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;
import o.TitleBarRightButtonView;

public class GriverRVLoggerProxyImpl extends parseFailed<LoginResponse, setMax> {
    private final GriverLogger loginRepository;

    @Inject
    public GriverRVLoggerProxyImpl(appxLoadFailed appxloadfailed, getScheme getscheme, GriverLogger griverLogger) {
        super(appxloadfailed, getscheme);
        this.loginRepository = griverLogger;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<LoginResponse> buildUseCaseObservable(setMax setmax) {
        return this.loginRepository.holdLogin(setmax.getOAuthMerchantName);
    }

    public static class setMax {
        public Function0<String> getOAuthMerchantName;

        public setMax(Function0<String> function0) {
            this.getOAuthMerchantName = function0;
        }
    }
}
