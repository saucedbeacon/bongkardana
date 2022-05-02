package o;

final class sendSilentDenyPermission implements RedDotDrawable {
    private final double getMax;
    private final double getMin;
    private final setTargetExtension length;
    private final boolean setMin;

    public sendSilentDenyPermission(setTargetExtension settargetextension, boolean z, double d, double d2) {
        this.length = settargetextension;
        this.setMin = z;
        this.getMin = d;
        this.getMax = d2;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getNearbyShops$2(this.setMin, this.getMin, this.getMax, (generateUniqueId) obj);
    }
}
