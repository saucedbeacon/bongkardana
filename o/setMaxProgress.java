package o;

final class setMaxProgress implements RedDotManager {
    private final setMinProgress setMax;

    public setMaxProgress(setMinProgress setminprogress) {
        this.setMax = setminprogress;
    }

    public final void accept(Object obj) {
        this.setMax.lambda$saveClientKey$3((com_alibaba_ariver_app_api_ExtOpt$69$1) obj);
    }
}
