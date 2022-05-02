package o;

import java.util.concurrent.Callable;

final class invokeStaticMethod implements Callable {
    private final invokeMethod getMax;

    public invokeStaticMethod(invokeMethod invokemethod) {
        this.getMax = invokemethod;
    }

    public final Object call() {
        return this.getMax.lambda$getAddPayMethodConfig$0();
    }
}
