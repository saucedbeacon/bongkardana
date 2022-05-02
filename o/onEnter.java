package o;

final class onEnter implements RedDotDrawable {
    private final getData getMin;
    private final getExtraBeaconDataTracker setMin;

    public onEnter(getData getdata, getExtraBeaconDataTracker getextrabeacondatatracker) {
        this.getMin = getdata;
        this.setMin = getextrabeacondatatracker;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$generateSplitBillQrDeepLink$8(this.setMin, (APWebSettings) obj);
    }
}
