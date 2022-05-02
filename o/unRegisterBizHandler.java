package o;

final class unRegisterBizHandler implements RedDotManager {
    private final AppRestartExtension getMax;

    public unRegisterBizHandler(AppRestartExtension appRestartExtension) {
        this.getMax = appRestartExtension;
    }

    public final void accept(Object obj) {
        this.getMax.lambda$getHomeInfo$1((flushMessages) obj);
    }
}
