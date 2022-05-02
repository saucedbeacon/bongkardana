package o;

final class unZip implements RedDotDrawable {
    private final lock length;

    public unZip(lock lock) {
        this.length = lock;
    }

    public final Object apply(Object obj) {
        return this.length.initAccount((setEventName) obj);
    }
}
