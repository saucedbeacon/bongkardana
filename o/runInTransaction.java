package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class runInTransaction implements Function1 {
    public static final runInTransaction setMax = new runInTransaction();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }
}
