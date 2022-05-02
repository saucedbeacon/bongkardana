package o;

final class Event$Error implements RedDotDrawable {
    private final String getMin;
    private final Event$1 length;

    public Event$Error(Event$1 event$1, String str) {
        this.length = event$1;
        this.getMin = str;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$verify$0(this.getMin, (GriverPerformanceStages) obj);
    }
}
