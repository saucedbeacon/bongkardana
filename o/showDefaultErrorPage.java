package o;

import id.dana.nearbyme.di.module.OtherStoreListModule;
import o.b;

public final class showDefaultErrorPage implements getAdapterPosition<t> {
    private final b.C0007b<s> length;
    private final OtherStoreListModule setMin;

    public static t getMin(OtherStoreListModule otherStoreListModule, s sVar) {
        t length2 = otherStoreListModule.length(sVar);
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        t length2 = this.setMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
