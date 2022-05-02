package o;

final class setPerformanceReporter implements RedDotDrawable {
    private final EmbedViewConstant getMax;

    public setPerformanceReporter(EmbedViewConstant embedViewConstant) {
        this.getMax = embedViewConstant;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$bindApp$2((Boolean) obj);
    }
}
