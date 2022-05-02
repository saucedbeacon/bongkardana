package o;

final class RemoteCallService implements RedDotDrawable {
    private final String getMax;
    private final getIpcProxy getMin;

    public RemoteCallService(getIpcProxy getipcproxy, String str) {
        this.getMin = getipcproxy;
        this.getMax = str;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getPromoAdsObservableBasedOnDistanceThreshold$3(this.getMax, (Boolean) obj);
    }
}
