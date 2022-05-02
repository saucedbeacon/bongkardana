package o;

import id.dana.di.modules.KycAmlEddModule;
import o.GriverShouldLoadUrlExtension;

public final class writeStringWithSingleQuote implements getAdapterPosition<GriverShouldLoadUrlExtension.AnonymousClass1.getMax> {
    private final KycAmlEddModule setMin;

    public static GriverShouldLoadUrlExtension.AnonymousClass1.getMax getMin(KycAmlEddModule kycAmlEddModule) {
        GriverShouldLoadUrlExtension.AnonymousClass1.getMax max = kycAmlEddModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverShouldLoadUrlExtension.AnonymousClass1.getMax max = this.setMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
