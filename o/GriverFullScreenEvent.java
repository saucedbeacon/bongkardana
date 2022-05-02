package o;

import id.dana.di.modules.SplitBillShareQRModule;
import o.PopManager;

public final class GriverFullScreenEvent implements getAdapterPosition<PopManager.length> {
    private final SplitBillShareQRModule setMax;

    private GriverFullScreenEvent(SplitBillShareQRModule splitBillShareQRModule) {
        this.setMax = splitBillShareQRModule;
    }

    public static GriverFullScreenEvent setMin(SplitBillShareQRModule splitBillShareQRModule) {
        return new GriverFullScreenEvent(splitBillShareQRModule);
    }

    public final /* synthetic */ Object get() {
        PopManager.length max = this.setMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
