package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class addNewItem implements Function1 {
    public static final addNewItem setMin = new addNewItem();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }
}
