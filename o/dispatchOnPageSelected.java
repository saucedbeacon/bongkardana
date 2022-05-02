package o;

import id.dana.contract.ott.OttVerifyModule;
import o.completeScroll;

public final class dispatchOnPageSelected implements getAdapterPosition<completeScroll.setMax> {
    private final OttVerifyModule getMin;

    private dispatchOnPageSelected(OttVerifyModule ottVerifyModule) {
        this.getMin = ottVerifyModule;
    }

    public static dispatchOnPageSelected setMin(OttVerifyModule ottVerifyModule) {
        return new dispatchOnPageSelected(ottVerifyModule);
    }

    public final /* synthetic */ Object get() {
        completeScroll.setMax min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
