package o;

import kotlin.jvm.functions.Function1;

final class setTransactionSuccessful implements Function1 {
    private final internalInitInvalidationTracker setMin;

    public setTransactionSuccessful(internalInitInvalidationTracker internalinitinvalidationtracker) {
        this.setMin = internalinitinvalidationtracker;
    }

    public final Object invoke(Object obj) {
        return this.setMin.getMin.setMax(((Boolean) obj).booleanValue());
    }
}
