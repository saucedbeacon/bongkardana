package o;

import id.dana.di.modules.PromoClaimModule;
import o.b;
import o.openRecordMode;

public final class getSectionConfigWithListener implements getAdapterPosition<openRecordMode.setMin> {
    private final PromoClaimModule getMax;
    private final b.C0007b<isSupportCaptureFlush> setMin;

    public static openRecordMode.setMin getMax(PromoClaimModule promoClaimModule, isSupportCaptureFlush issupportcaptureflush) {
        openRecordMode.setMin length = promoClaimModule.length(issupportcaptureflush);
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        openRecordMode.setMin length = this.getMax.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
