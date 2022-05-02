package o;

import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import o.getTransitionProperties;

public final class getInterpolator implements getAdapterPosition<getTransitionProperties.setMax> {
    private final GenerateDeepLinkModule getMin;

    private getInterpolator(GenerateDeepLinkModule generateDeepLinkModule) {
        this.getMin = generateDeepLinkModule;
    }

    public static getInterpolator getMax(GenerateDeepLinkModule generateDeepLinkModule) {
        return new getInterpolator(generateDeepLinkModule);
    }

    public final /* synthetic */ Object get() {
        getTransitionProperties.setMax min = this.getMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
