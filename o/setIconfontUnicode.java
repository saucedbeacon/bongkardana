package o;

import id.dana.social.di.module.BlockedFragmentModule;
import o.AUHorizontalListView;
import o.b;
import o.setRightButtonUnicode;

public final class setIconfontUnicode implements getAdapterPosition<setRightButtonUnicode.getMin> {
    private final b.C0007b<AUHorizontalListView.PerformClick> getMax;
    private final BlockedFragmentModule length;

    public static setRightButtonUnicode.getMin setMin(BlockedFragmentModule blockedFragmentModule, AUHorizontalListView.PerformClick performClick) {
        setRightButtonUnicode.getMin max = blockedFragmentModule.setMax(performClick);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setRightButtonUnicode.getMin max = this.length.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
