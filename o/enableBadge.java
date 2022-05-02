package o;

import id.dana.di.modules.QrisCrossBorderModule;
import o.startUCMIntentLoadUrl;

public final class enableBadge implements getAdapterPosition<startUCMIntentLoadUrl.setMin> {
    private final QrisCrossBorderModule setMin;

    public static startUCMIntentLoadUrl.setMin setMin(QrisCrossBorderModule qrisCrossBorderModule) {
        startUCMIntentLoadUrl.setMin min = qrisCrossBorderModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        startUCMIntentLoadUrl.setMin min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
