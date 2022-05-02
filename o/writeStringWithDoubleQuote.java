package o;

import id.dana.di.modules.KycRenewalModule;
import o.NebulaAuthDialogProxy;

public final class writeStringWithDoubleQuote implements getAdapterPosition<NebulaAuthDialogProxy.getMax> {
    private final KycRenewalModule length;

    public static NebulaAuthDialogProxy.getMax getMin(KycRenewalModule kycRenewalModule) {
        NebulaAuthDialogProxy.getMax length2 = kycRenewalModule.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        NebulaAuthDialogProxy.getMax length2 = this.length.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
