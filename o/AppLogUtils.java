package o;

final class AppLogUtils implements RedDotDrawable {
    private final setEventName setMin;

    public AppLogUtils(setEventName seteventname) {
        this.setMin = seteventname;
    }

    public final Object apply(Object obj) {
        return lock.lambda$initAccount$18(this.setMin, (Boolean) obj);
    }
}
