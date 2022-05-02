package o;

final class BindException implements RedDotDrawable {
    public static final BindException setMin = new BindException();

    public final Object apply(Object obj) {
        return ((attach) obj).getPhoneNumber();
    }
}
