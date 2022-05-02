package o;

final class EmbedViewProvider implements RedDotManager {
    private final EmbedViewConstant getMax;

    public EmbedViewProvider(EmbedViewConstant embedViewConstant) {
        this.getMax = embedViewConstant;
    }

    public final void accept(Object obj) {
        this.getMax.lambda$reportDevice$0((Throwable) obj);
    }
}
