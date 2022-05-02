package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class setNonPrimaryAlpha implements Function1 {
    public static final setNonPrimaryAlpha getMin = new setNonPrimaryAlpha();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }
}
