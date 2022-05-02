package o;

final class convertObjectToString implements RedDotDrawable {
    private final GriverMonitor getMin;

    public convertObjectToString(GriverMonitor griverMonitor) {
        this.getMin = griverMonitor;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$buildUseCaseObservable$0((Throwable) obj);
    }
}
