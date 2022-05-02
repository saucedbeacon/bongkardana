package o;

import java.util.concurrent.Callable;

final class ExecutorBinder implements Callable {
    private final RequestBinder setMax;

    public ExecutorBinder(RequestBinder requestBinder) {
        this.setMax = requestBinder;
    }

    public final Object call() {
        return this.setMax.getSendOtpResult();
    }
}
