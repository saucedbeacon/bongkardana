package o;

import id.dana.di.modules.LogoutModule;
import o.inTransaction;

public final class StringCodec implements getAdapterPosition<inTransaction.getMin> {
    private final LogoutModule getMax;

    private StringCodec(LogoutModule logoutModule) {
        this.getMax = logoutModule;
    }

    public static StringCodec length(LogoutModule logoutModule) {
        return new StringCodec(logoutModule);
    }

    public final /* synthetic */ Object get() {
        inTransaction.getMin min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
