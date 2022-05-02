package o;

import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import o.b;
import o.getTransitionProperties;

public final class alreadyContains implements getAdapterPosition<getTransitionProperties.getMax> {
    private final b.C0007b<matchNames> getMax;
    private final GenerateDeepLinkModule setMax;

    private alreadyContains(GenerateDeepLinkModule generateDeepLinkModule, b.C0007b<matchNames> bVar) {
        this.setMax = generateDeepLinkModule;
        this.getMax = bVar;
    }

    public static alreadyContains getMin(GenerateDeepLinkModule generateDeepLinkModule, b.C0007b<matchNames> bVar) {
        return new alreadyContains(generateDeepLinkModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getTransitionProperties.getMax min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
