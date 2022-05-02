package o;

import kotlin.jvm.functions.Function1;

final class getTextSpacing implements Function1 {
    private final updateAdapter getMin;

    public getTextSpacing(updateAdapter updateadapter) {
        this.getMin = updateadapter;
    }

    public final Object invoke(Object obj) {
        return updateAdapter.setMax(this.getMin, (clearExpired) obj);
    }
}
