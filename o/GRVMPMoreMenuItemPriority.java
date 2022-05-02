package o;

import id.dana.di.modules.RecipientActivityModule;
import o.enqueueWorkRequests;

public final class GRVMPMoreMenuItemPriority implements getAdapterPosition<enqueueWorkRequests.setMax> {
    private final RecipientActivityModule getMax;

    private GRVMPMoreMenuItemPriority(RecipientActivityModule recipientActivityModule) {
        this.getMax = recipientActivityModule;
    }

    public static GRVMPMoreMenuItemPriority setMin(RecipientActivityModule recipientActivityModule) {
        return new GRVMPMoreMenuItemPriority(recipientActivityModule);
    }

    public final /* synthetic */ Object get() {
        enqueueWorkRequests.setMax length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
