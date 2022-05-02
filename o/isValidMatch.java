package o;

import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import o.getTransitionProperties;

public final class isValidMatch implements getAdapterPosition<getTransitionProperties.length> {
    private final GenerateDeepLinkModule getMin;

    private isValidMatch(GenerateDeepLinkModule generateDeepLinkModule) {
        this.getMin = generateDeepLinkModule;
    }

    public static isValidMatch length(GenerateDeepLinkModule generateDeepLinkModule) {
        return new isValidMatch(generateDeepLinkModule);
    }

    public final /* synthetic */ Object get() {
        getTransitionProperties.length min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
