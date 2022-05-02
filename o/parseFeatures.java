package o;

import id.dana.di.modules.AnnouncementModule;
import o.onLeftHiddenState;

public final class parseFeatures implements getAdapterPosition<onLeftHiddenState.getMin> {
    private final AnnouncementModule setMax;

    public static onLeftHiddenState.getMin setMin(AnnouncementModule announcementModule) {
        onLeftHiddenState.getMin max = announcementModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onLeftHiddenState.getMin max = this.setMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
