package o;

import id.dana.di.modules.GlobalNetworkModule;
import o.onNext;

public final class setTypeKey implements getAdapterPosition<onNext.length> {
    private final GlobalNetworkModule getMax;

    private setTypeKey(GlobalNetworkModule globalNetworkModule) {
        this.getMax = globalNetworkModule;
    }

    public static setTypeKey setMax(GlobalNetworkModule globalNetworkModule) {
        return new setTypeKey(globalNetworkModule);
    }

    public final /* synthetic */ Object get() {
        onNext.length min = this.getMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
