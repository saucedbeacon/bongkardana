package o;

final class sendMessageToWorker implements RedDotDrawable {
    private final EngineUtils length;

    public sendMessageToWorker(EngineUtils engineUtils) {
        this.length = engineUtils;
    }

    public final Object apply(Object obj) {
        return this.length.apply(obj);
    }
}
