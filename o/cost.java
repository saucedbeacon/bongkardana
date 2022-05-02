package o;

final class cost implements RedDotDrawable {
    private final EventTrackStore length;

    public cost(EventTrackStore eventTrackStore) {
        this.length = eventTrackStore;
    }

    public final Object apply(Object obj) {
        return this.length.transformMyReferral((doInitialize) obj);
    }
}
