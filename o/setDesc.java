package o;

final class setDesc implements RedDotManager {
    private final lock setMin;

    public setDesc(lock lock) {
        this.setMin = lock;
    }

    public final void accept(Object obj) {
        this.setMin.lambda$thenRegister$14((setEventName) obj);
    }
}
