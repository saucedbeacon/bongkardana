package o;

import android.location.Location;

final class NativeBridge implements RedDotDrawable {
    private final Location getMax;
    private final boolean getMin;
    private final int length;
    private final setTargetExtension setMax;
    private final int setMin;

    public NativeBridge(setTargetExtension settargetextension, boolean z, Location location, int i, int i2) {
        this.setMax = settargetextension;
        this.getMin = z;
        this.getMax = location;
        this.length = i;
        this.setMin = i2;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getNearbyShopByRadius$4(this.getMin, this.getMax, this.length, this.setMin, (generateUniqueId) obj);
    }
}
