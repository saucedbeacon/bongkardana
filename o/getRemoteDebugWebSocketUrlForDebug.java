package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

final class getRemoteDebugWebSocketUrlForDebug implements RedDotDrawable {
    public static final getRemoteDebugWebSocketUrlForDebug getMax = new getRemoteDebugWebSocketUrlForDebug();

    public final Object apply(Object obj) {
        return Boolean.valueOf(((BaseRpcResult) obj).success);
    }
}
