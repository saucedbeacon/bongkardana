package o;

import id.dana.di.modules.SplitBillIntroductionModule;
import o.setBadgeInfo;

public final class GriverTitleBarEvent implements getAdapterPosition<setBadgeInfo.setMin> {
    private final SplitBillIntroductionModule getMax;

    private GriverTitleBarEvent(SplitBillIntroductionModule splitBillIntroductionModule) {
        this.getMax = splitBillIntroductionModule;
    }

    public static GriverTitleBarEvent length(SplitBillIntroductionModule splitBillIntroductionModule) {
        return new GriverTitleBarEvent(splitBillIntroductionModule);
    }

    public final /* synthetic */ Object get() {
        setBadgeInfo.setMin length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
