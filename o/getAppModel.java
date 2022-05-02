package o;

final class getAppModel implements RedDotDrawable {
    private final BaseEmbedView getMax;

    public getAppModel(BaseEmbedView baseEmbedView) {
        this.getMax = baseEmbedView;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((generateStartToken) obj);
    }
}
