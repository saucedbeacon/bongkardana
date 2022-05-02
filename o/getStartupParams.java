package o;

final class getStartupParams implements RedDotManager {
    private final setIncludeFiles setMin;

    public getStartupParams(setIncludeFiles setincludefiles) {
        this.setMin = setincludefiles;
    }

    public final void accept(Object obj) {
        this.setMin.lambda$getExploreDana$0((setNodeId) obj);
    }
}
