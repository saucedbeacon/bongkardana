package o;

import id.dana.sendmoney.recipient.recent.RecentRecipientModule;
import o.setMediaId;

public final class getIsAlbumMedia implements getAdapterPosition<setMediaId.getMin> {
    private final RecentRecipientModule getMax;

    private getIsAlbumMedia(RecentRecipientModule recentRecipientModule) {
        this.getMax = recentRecipientModule;
    }

    public static getIsAlbumMedia setMin(RecentRecipientModule recentRecipientModule) {
        return new getIsAlbumMedia(recentRecipientModule);
    }

    public final /* synthetic */ Object get() {
        setMediaId.getMin max = this.getMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
