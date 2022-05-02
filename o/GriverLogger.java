package o;

import id.dana.domain.model.rpc.response.LoginResponse;
import kotlin.jvm.functions.Function0;
import o.TitleBarRightButtonView;

public interface GriverLogger {
    TitleBarRightButtonView.AnonymousClass1<LoginResponse> bokuLogin(LoginResponse loginResponse, String str, String str2, String str3, String str4);

    TitleBarRightButtonView.AnonymousClass1<Boolean> forceLogout();

    TitleBarRightButtonView.AnonymousClass1<LoginResponse> holdLogin(Function0<String> function0);

    TitleBarRightButtonView.AnonymousClass1<LoginResponse> login(String str, String str2, String str3, boolean z);

    TitleBarRightButtonView.AnonymousClass1<Boolean> logout();

    TitleBarRightButtonView.AnonymousClass1<Boolean> notifyPay();

    TitleBarRightButtonView.AnonymousClass1<LoginResponse> otpLogin(String str, String str2);

    TitleBarRightButtonView.AnonymousClass1<LoginResponse> reLogin(String str);

    TitleBarRightButtonView.AnonymousClass1<LoginResponse> verifyPushLogin(String str, String str2, int i);
}
