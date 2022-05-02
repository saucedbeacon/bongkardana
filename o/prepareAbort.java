package o;

final class prepareAbort implements RedDotDrawable {
    private final EmbedViewHelper length;

    public prepareAbort(EmbedViewHelper embedViewHelper) {
        this.length = embedViewHelper;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$logout$10((Boolean) obj);
    }
}
