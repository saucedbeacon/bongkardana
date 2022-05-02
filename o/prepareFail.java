package o;

final class prepareFail implements RedDotDrawable {
    private final EmbedViewHelper setMin;

    public prepareFail(EmbedViewHelper embedViewHelper) {
        this.setMin = embedViewHelper;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$forceLogout$9((Boolean) obj);
    }
}
