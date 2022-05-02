package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class getPageMargin implements Function1 {
    public static final getPageMargin length = new getPageMargin();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }
}
