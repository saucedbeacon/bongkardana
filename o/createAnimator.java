package o;

import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import o.b;
import o.getTransitionProperties;

public final class createAnimator implements getAdapterPosition<getTransitionProperties.setMin> {
    private final GenerateDeepLinkModule length;
    private final b.C0007b<matchInstances> setMax;

    private createAnimator(GenerateDeepLinkModule generateDeepLinkModule, b.C0007b<matchInstances> bVar) {
        this.length = generateDeepLinkModule;
        this.setMax = bVar;
    }

    public static createAnimator getMin(GenerateDeepLinkModule generateDeepLinkModule, b.C0007b<matchInstances> bVar) {
        return new createAnimator(generateDeepLinkModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getTransitionProperties.setMin max = this.length.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
