package o;

final class ActivityHelperOnCreateFinishedPoint implements RedDotDrawable {
    public static final ActivityHelperOnCreateFinishedPoint setMax = new ActivityHelperOnCreateFinishedPoint();

    public final Object apply(Object obj) {
        return ((onEmbedViewDestory) obj).setFirstPage(true);
    }
}
