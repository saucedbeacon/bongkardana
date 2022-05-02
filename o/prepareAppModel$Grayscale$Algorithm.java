package o;

import o.PrepareException;
import o.b;

class prepareAppModel$Grayscale$Algorithm implements b.C0007b<getBluetoothName> {
    private final PrepareException.AnonymousClass1 getMin;

    prepareAppModel$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        getBluetoothName onCaptioningEnabledChanged = this.getMin.onCaptioningEnabledChanged();
        if (onCaptioningEnabledChanged != null) {
            return onCaptioningEnabledChanged;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
