package o;

import id.dana.di.modules.QrisCrossBorderModule;
import o.b;
import o.startUCMIntentLoadUrl;

public final class GRVMPMoreMenuItem implements getAdapterPosition<startUCMIntentLoadUrl.getMin> {
    private final b.C0007b<SharedDataBridgeExtension> length;
    private final QrisCrossBorderModule setMin;

    public static startUCMIntentLoadUrl.getMin setMin(QrisCrossBorderModule qrisCrossBorderModule, SharedDataBridgeExtension sharedDataBridgeExtension) {
        startUCMIntentLoadUrl.getMin max = qrisCrossBorderModule.getMax(sharedDataBridgeExtension);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        startUCMIntentLoadUrl.getMin max = this.setMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
