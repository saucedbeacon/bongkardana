package o;

import java.util.concurrent.Callable;

final class asyncTraceBegin implements Callable {
    private final asyncTraceEnd setMin;

    public asyncTraceBegin(asyncTraceEnd asynctraceend) {
        this.setMin = asynctraceend;
    }

    public final Object call() {
        return this.setMin.lambda$getAddPayMethodConfig$0();
    }
}
