package o;

import id.dana.social.di.module.ContentGroupingDetailModule;
import o.AUHorizontalListView;
import o.b;
import o.setLeftButtonUnicode;

public final class setIconfontSize implements getAdapterPosition<setLeftButtonUnicode.length> {
    private final b.C0007b<AUHorizontalListView.ListItemAccessibilityDelegate> getMin;
    private final ContentGroupingDetailModule setMin;

    public static setLeftButtonUnicode.length setMax(ContentGroupingDetailModule contentGroupingDetailModule, AUHorizontalListView.ListItemAccessibilityDelegate listItemAccessibilityDelegate) {
        setLeftButtonUnicode.length min = contentGroupingDetailModule.getMin(listItemAccessibilityDelegate);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setLeftButtonUnicode.length min = this.setMin.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
