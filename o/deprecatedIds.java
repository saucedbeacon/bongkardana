package o;

import kotlin.jvm.functions.Function1;

final class deprecatedIds implements Function1 {
    private final jetifyAs setMin;

    public deprecatedIds(jetifyAs jetifyas) {
        this.setMin = jetifyas;
    }

    public final Object invoke(Object obj) {
        return jetifyAs.getMin(this.setMin, (Exception) obj);
    }
}
