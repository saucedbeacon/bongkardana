package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class end implements Function1 {
    public static final end setMin = new end();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }
}
