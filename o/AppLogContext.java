package o;

final class AppLogContext implements RedDotDrawable {
    private final setEventName setMin;

    public AppLogContext(setEventName seteventname) {
        this.setMin = seteventname;
    }

    public final Object apply(Object obj) {
        return lock.lambda$thenRegister$7(this.setMin, (Long) obj);
    }
}
