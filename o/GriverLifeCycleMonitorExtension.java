package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class GriverLifeCycleMonitorExtension implements Function1 {
    public static final GriverLifeCycleMonitorExtension setMax = new GriverLifeCycleMonitorExtension();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }
}
