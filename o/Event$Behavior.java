package o;

final class Event$Behavior implements RedDotDrawable {
    private final Event$Stub length;

    public Event$Behavior(Event$Stub event$Stub) {
        this.length = event$Stub;
    }

    public final Object apply(Object obj) {
        return this.length.transform((pickNext) obj);
    }
}
