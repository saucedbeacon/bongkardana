package o;

import id.dana.di.modules.OauthModule;
import id.dana.di.modules.OpenBankAccountModule;
import o.b;
import o.onAnimationEnd;
import o.onPageScrolled;

public final class GriverBridgeCallNotFoundEvent implements getAdapterPosition<onPageScrolled.setMin> {
    private final OpenBankAccountModule setMin;

    public final class BridgeContext implements getAdapterPosition<onAnimationEnd.length> {
        private final OauthModule getMin;
        private final b.C0007b<getPlatformCallback> setMax;

        private BridgeContext(OauthModule oauthModule, b.C0007b<getPlatformCallback> bVar) {
            this.getMin = oauthModule;
            this.setMax = bVar;
        }

        public static BridgeContext setMax(OauthModule oauthModule, b.C0007b<getPlatformCallback> bVar) {
            return new BridgeContext(oauthModule, bVar);
        }

        public final /* synthetic */ Object get() {
            onAnimationEnd.length max = this.getMin.getMax(this.setMax.get());
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static onPageScrolled.setMin setMin(OpenBankAccountModule openBankAccountModule) {
        onPageScrolled.setMin max = openBankAccountModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onPageScrolled.setMin max = this.setMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
