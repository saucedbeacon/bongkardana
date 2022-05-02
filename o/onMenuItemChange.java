package o;

import id.dana.di.modules.RecipientActivityModule;
import o.b;
import o.enqueueWorkRequests;

public final class onMenuItemChange implements getAdapterPosition<enqueueWorkRequests.length> {
    private final RecipientActivityModule getMin;
    private final b.C0007b<cancelUniqueWork> setMax;

    private onMenuItemChange(RecipientActivityModule recipientActivityModule, b.C0007b<cancelUniqueWork> bVar) {
        this.getMin = recipientActivityModule;
        this.setMax = bVar;
    }

    public static onMenuItemChange getMax(RecipientActivityModule recipientActivityModule, b.C0007b<cancelUniqueWork> bVar) {
        return new onMenuItemChange(recipientActivityModule, bVar);
    }

    public final /* synthetic */ Object get() {
        enqueueWorkRequests.length max = this.getMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
