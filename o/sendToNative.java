package o;

import android.location.Location;

final class sendToNative implements RedDotDrawable {
    private final int getMin;
    private final setTargetExtension length;
    private final Location setMax;

    public sendToNative(setTargetExtension settargetextension, Location location, int i) {
        this.length = settargetextension;
        this.setMax = location;
        this.getMin = i;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getNearbyShopByRadius$5(this.setMax, this.getMin, (generateUniqueId) obj);
    }
}
