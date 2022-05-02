package o;

final class manualStartApp implements RedDotDrawable {
    public static final manualStartApp length = new manualStartApp();

    public final Object apply(Object obj) {
        return ((ResourceResponsePoint) obj).setUpdated(true);
    }
}
