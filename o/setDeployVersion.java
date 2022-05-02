package o;

import id.dana.di.modules.VerifyPushChallengeModule;
import o.setShadowDrawable;

public final class setDeployVersion implements getAdapterPosition<setShadowDrawable.setMin> {
    private final VerifyPushChallengeModule length;

    private setDeployVersion(VerifyPushChallengeModule verifyPushChallengeModule) {
        this.length = verifyPushChallengeModule;
    }

    public static setDeployVersion getMin(VerifyPushChallengeModule verifyPushChallengeModule) {
        return new setDeployVersion(verifyPushChallengeModule);
    }

    public final /* synthetic */ Object get() {
        setShadowDrawable.setMin max = this.length.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
