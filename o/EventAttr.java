package o;

public final class EventAttr implements getAdapterPosition<Event$Stub> {

    static final class getMin {
        /* access modifiers changed from: private */
        public static final EventAttr length = new EventAttr();
    }

    public final Event$Stub get() {
        return newInstance();
    }

    public static EventAttr create() {
        return getMin.length;
    }

    public static Event$Stub newInstance() {
        return new Event$Stub();
    }
}
