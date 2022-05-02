package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

final class TitleBarSegCheckPoint implements RedDotDrawable {
    public static final TitleBarSegCheckPoint length = new TitleBarSegCheckPoint();

    public final Object apply(Object obj) {
        return Boolean.valueOf(((BaseRpcResult) obj).success);
    }
}
