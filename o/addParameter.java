package o;

import kotlin.jvm.functions.Function1;

final class addParameter implements Function1 {
    private final getLastModifiedDate getMax;

    public addParameter(getLastModifiedDate getlastmodifieddate) {
        this.getMax = getlastmodifieddate;
    }

    public final Object invoke(Object obj) {
        return getLastModifiedDate.setMax(this.getMax);
    }
}
