package o;

final class AppLogConfigProxy implements RedDotManager {
    public static final AppLogConfigProxy getMax = new AppLogConfigProxy();

    public final void accept(Object obj) {
        lock.lambda$thenRegister$15((setEventName) obj);
    }
}
