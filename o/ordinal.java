package o;

import id.dana.di.modules.AddOutletReceiverModule;
import o.ImageInfoBridgeExtension;

public final class ordinal implements getAdapterPosition<ImageInfoBridgeExtension.AnonymousClass1.getMin> {
    private final AddOutletReceiverModule getMax;

    private ordinal(AddOutletReceiverModule addOutletReceiverModule) {
        this.getMax = addOutletReceiverModule;
    }

    public static ordinal getMin(AddOutletReceiverModule addOutletReceiverModule) {
        return new ordinal(addOutletReceiverModule);
    }

    public final /* synthetic */ Object get() {
        ImageInfoBridgeExtension.AnonymousClass1.getMin max = this.getMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
