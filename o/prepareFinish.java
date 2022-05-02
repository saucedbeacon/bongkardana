package o;

final class prepareFinish implements RedDotDrawable {
    private final EmbedViewHelper setMin;

    public prepareFinish(EmbedViewHelper embedViewHelper) {
        this.setMin = embedViewHelper;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$logout$11((Boolean) obj);
    }
}
