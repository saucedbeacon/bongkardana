package o;

import id.dana.contract.inbox.UnreadInboxModule;
import o.b;
import o.restoreState;

public final class isViewFromObject implements getAdapterPosition<restoreState.length> {
    private final b.C0007b<setPrimaryItem> getMax;
    private final UnreadInboxModule setMax;

    private isViewFromObject(UnreadInboxModule unreadInboxModule, b.C0007b<setPrimaryItem> bVar) {
        this.setMax = unreadInboxModule;
        this.getMax = bVar;
    }

    public static isViewFromObject getMax(UnreadInboxModule unreadInboxModule, b.C0007b<setPrimaryItem> bVar) {
        return new isViewFromObject(unreadInboxModule, bVar);
    }

    public final /* synthetic */ Object get() {
        restoreState.length min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
