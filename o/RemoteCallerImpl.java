package o;

final class RemoteCallerImpl implements RedDotDrawable {
    private final int length;
    private final getIpcProxy setMax;
    private final String setMin;

    public RemoteCallerImpl(getIpcProxy getipcproxy, String str, int i) {
        this.setMax = getipcproxy;
        this.setMin = str;
        this.length = i;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getPromoAdsObservableBasedOnDistanceThreshold$6(this.setMin, this.length, (Local) obj);
    }
}
