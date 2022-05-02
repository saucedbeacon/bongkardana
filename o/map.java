package o;

import id.dana.di.modules.ExpiryModule;
import o.onExecuted;

public final class map implements getAdapterPosition<onExecuted.length> {
    private final ExpiryModule getMax;

    private map(ExpiryModule expiryModule) {
        this.getMax = expiryModule;
    }

    public static map setMax(ExpiryModule expiryModule) {
        return new map(expiryModule);
    }

    public final /* synthetic */ Object get() {
        onExecuted.length min = this.getMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
