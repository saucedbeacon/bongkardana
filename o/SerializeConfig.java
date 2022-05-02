package o;

import id.dana.di.modules.HomeReferralModule;
import o.b;
import o.onAction;

public final class SerializeConfig implements getAdapterPosition<onAction.setMax> {
    private final HomeReferralModule getMin;
    private final b.C0007b<CaptureListener> length;

    public static onAction.setMax getMax(HomeReferralModule homeReferralModule, CaptureListener captureListener) {
        onAction.setMax max = homeReferralModule.getMax(captureListener);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onAction.setMax max = this.getMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
