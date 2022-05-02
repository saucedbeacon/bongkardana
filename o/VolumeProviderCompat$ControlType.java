package o;

import o.applyOptions;

final class VolumeProviderCompat$ControlType implements Runnable {
    private final applyOptions.AnonymousClass1 getMin;
    private final performLoadChildren length;

    public VolumeProviderCompat$ControlType(applyOptions.AnonymousClass1 r1, performLoadChildren performloadchildren) {
        this.getMin = r1;
        this.length = performloadchildren;
    }

    public final void run() {
        applyOptions.AnonymousClass1.setMin(this.getMin, this.length);
    }
}
