package o;

import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import o.b;
import o.getTransitionProperties;

public final class setMatchOrder implements getAdapterPosition<getTransitionProperties.getMin> {
    private final GenerateDeepLinkModule getMin;
    private final b.C0007b<createAnimators> setMax;

    private setMatchOrder(GenerateDeepLinkModule generateDeepLinkModule, b.C0007b<createAnimators> bVar) {
        this.getMin = generateDeepLinkModule;
        this.setMax = bVar;
    }

    public static setMatchOrder getMax(GenerateDeepLinkModule generateDeepLinkModule, b.C0007b<createAnimators> bVar) {
        return new setMatchOrder(generateDeepLinkModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getTransitionProperties.getMin max = this.getMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
