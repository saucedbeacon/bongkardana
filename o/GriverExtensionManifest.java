package o;

import id.dana.di.modules.OtpChallengeModule;
import o.endTransaction;

public final class GriverExtensionManifest implements getAdapterPosition<endTransaction.length> {
    private final OtpChallengeModule getMin;

    private GriverExtensionManifest(OtpChallengeModule otpChallengeModule) {
        this.getMin = otpChallengeModule;
    }

    public static GriverExtensionManifest length(OtpChallengeModule otpChallengeModule) {
        return new GriverExtensionManifest(otpChallengeModule);
    }

    public final /* synthetic */ Object get() {
        endTransaction.length max = this.getMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
