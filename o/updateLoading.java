package o;

final class updateLoading implements RedDotDrawable {
    private final EmbedViewHelper setMin;

    public updateLoading(EmbedViewHelper embedViewHelper) {
        this.setMin = embedViewHelper;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$forceLogout$8((Boolean) obj);
    }
}
