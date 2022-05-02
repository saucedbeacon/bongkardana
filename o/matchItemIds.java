package o;

import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import o.getTransitionProperties;

public final class matchItemIds implements getAdapterPosition<getTransitionProperties.IsOverlapping> {
    private final GenerateDeepLinkModule getMin;

    private matchItemIds(GenerateDeepLinkModule generateDeepLinkModule) {
        this.getMin = generateDeepLinkModule;
    }

    public static matchItemIds getMax(GenerateDeepLinkModule generateDeepLinkModule) {
        return new matchItemIds(generateDeepLinkModule);
    }

    public final /* synthetic */ Object get() {
        getTransitionProperties.IsOverlapping length = this.getMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
