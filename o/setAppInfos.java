package o;

public final class setAppInfos implements RedDotDrawable {
    public static final setAppInfos setMin = new setAppInfos();

    public final Object apply(Object obj) {
        return ((CharSequence) obj).toString().toLowerCase().trim();
    }
}
