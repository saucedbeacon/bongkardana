package o;

final class setErrCode implements RedDotDrawable {
    private final lock getMax;

    public setErrCode(lock lock) {
        this.getMax = lock;
    }

    public final Object apply(Object obj) {
        return this.getMax.initNotification((setEventName) obj);
    }
}
