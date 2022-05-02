package o;

final class Event$Cost implements RedDotDrawable {
    private final Event$Stub setMin;

    public Event$Cost(Event$Stub event$Stub) {
        this.setMin = event$Stub;
    }

    public final Object apply(Object obj) {
        return this.setMin.transform((setViewId) obj);
    }
}
