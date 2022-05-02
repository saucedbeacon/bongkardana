package o;

final class APILogUtils implements RedDotDrawable {
    private final EmbedViewConstant getMin;

    public APILogUtils(EmbedViewConstant embedViewConstant) {
        this.getMin = embedViewConstant;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$reportDevice$1((imageQuality) obj);
    }
}
