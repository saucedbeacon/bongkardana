package o;

final class HttpRequestResponseHandlePoint implements RedDotDrawable {
    private final WorkerExceptionPoint length;

    public HttpRequestResponseHandlePoint(WorkerExceptionPoint workerExceptionPoint) {
        this.length = workerExceptionPoint;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$initF2FPay$0((String) obj);
    }
}
