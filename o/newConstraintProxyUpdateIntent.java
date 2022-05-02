package o;

import kotlin.jvm.functions.Function1;

final class newConstraintProxyUpdateIntent implements Function1 {
    private final ConstraintProxy$NetworkStateProxy length;

    public newConstraintProxyUpdateIntent(ConstraintProxy$NetworkStateProxy constraintProxy$NetworkStateProxy) {
        this.length = constraintProxy$NetworkStateProxy;
    }

    public final Object invoke(Object obj) {
        return ConstraintProxy$NetworkStateProxy.getMax(this.length, (Throwable) obj);
    }
}
