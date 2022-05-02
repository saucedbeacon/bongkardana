package o;

final class renderPage implements RedDotManager {
    private final EmbedViewHelper setMin;

    public renderPage(EmbedViewHelper embedViewHelper) {
        this.setMin = embedViewHelper;
    }

    public final void accept(Object obj) {
        this.setMin.lambda$login$0((com_alibaba_ariver_app_api_ExtOpt$69$1) obj);
    }
}
