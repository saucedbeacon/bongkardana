package o;

import id.dana.di.modules.AnnouncementModule;
import o.b;
import o.onLeftHiddenState;

public final class serialzeFeatures implements getAdapterPosition<onLeftHiddenState.setMin> {
    private final b.C0007b<getItemDelegate> setMax;
    private final AnnouncementModule setMin;

    public static onLeftHiddenState.setMin setMax(AnnouncementModule announcementModule, getItemDelegate getitemdelegate) {
        onLeftHiddenState.setMin min = announcementModule.getMin(getitemdelegate);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onLeftHiddenState.setMin min = this.setMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
