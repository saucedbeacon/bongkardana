package o;

import id.dana.di.modules.RedeemUserMissionModule;
import o.isUsed;

public final class OnMenuItemClickListener implements getAdapterPosition<isUsed.getMax> {
    private final RedeemUserMissionModule getMax;

    private OnMenuItemClickListener(RedeemUserMissionModule redeemUserMissionModule) {
        this.getMax = redeemUserMissionModule;
    }

    public static OnMenuItemClickListener getMax(RedeemUserMissionModule redeemUserMissionModule) {
        return new OnMenuItemClickListener(redeemUserMissionModule);
    }

    public final /* synthetic */ Object get() {
        isUsed.getMax length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
