package o;

import id.dana.contract.inbox.UnreadInboxModule;
import o.restoreState;

public final class finishUpdate implements getAdapterPosition<restoreState.getMax> {
    private final UnreadInboxModule getMin;

    private finishUpdate(UnreadInboxModule unreadInboxModule) {
        this.getMin = unreadInboxModule;
    }

    public static finishUpdate getMax(UnreadInboxModule unreadInboxModule) {
        return new finishUpdate(unreadInboxModule);
    }

    public final /* synthetic */ Object get() {
        restoreState.getMax min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
