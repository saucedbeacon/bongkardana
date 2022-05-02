package o;

import kotlin.jvm.functions.Function1;

final class RescheduleReceiver implements Function1 {
    private final ConstraintProxy$NetworkStateProxy getMin;

    public RescheduleReceiver(ConstraintProxy$NetworkStateProxy constraintProxy$NetworkStateProxy) {
        this.getMin = constraintProxy$NetworkStateProxy;
    }

    public final Object invoke(Object obj) {
        return this.getMin.setMax.onGetMessageTemplateSuccess((postWebMessage) obj);
    }
}
