package o;

import id.dana.contract.user.GetUserInfoModule;
import o.setAutoDismissEnabled$core;

public final class getTitleFont implements getAdapterPosition<setAutoDismissEnabled$core.getMax> {
    private final GetUserInfoModule getMin;

    private getTitleFont(GetUserInfoModule getUserInfoModule) {
        this.getMin = getUserInfoModule;
    }

    public static getTitleFont setMin(GetUserInfoModule getUserInfoModule) {
        return new getTitleFont(getUserInfoModule);
    }

    public final /* synthetic */ Object get() {
        setAutoDismissEnabled$core.getMax min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
