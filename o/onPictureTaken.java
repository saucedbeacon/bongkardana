package o;

public final class onPictureTaken implements RedDotDrawable {
    public static final onPictureTaken setMax = new onPictureTaken();

    public final Object apply(Object obj) {
        return ((CharSequence) obj).toString();
    }
}
