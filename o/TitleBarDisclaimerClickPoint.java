package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

final class TitleBarDisclaimerClickPoint implements RedDotDrawable {
    public static final TitleBarDisclaimerClickPoint length = new TitleBarDisclaimerClickPoint();

    public final Object apply(Object obj) {
        return Boolean.valueOf(((BaseRpcResult) obj).success);
    }
}
