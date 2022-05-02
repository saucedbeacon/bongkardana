package o;

import id.dana.di.modules.TncSummaryModules;
import o.ToolUtils;

public final class openFileChooser implements getAdapterPosition<ToolUtils.length> {
    private final TncSummaryModules getMin;

    private openFileChooser(TncSummaryModules tncSummaryModules) {
        this.getMin = tncSummaryModules;
    }

    public static openFileChooser getMax(TncSummaryModules tncSummaryModules) {
        return new openFileChooser(tncSummaryModules);
    }

    public final /* synthetic */ Object get() {
        ToolUtils.length min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
