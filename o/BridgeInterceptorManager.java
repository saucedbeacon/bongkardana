package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class BridgeInterceptorManager implements Function1 {
    public static final BridgeInterceptorManager setMin = new BridgeInterceptorManager();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }
}
