package o;

import id.dana.di.modules.TncSummaryModules;
import o.ToolUtils;
import o.b;

public final class onShowFileChooser implements getAdapterPosition<ToolUtils.setMin> {
    private final b.C0007b<getResourceId> getMin;
    private final TncSummaryModules length;

    private onShowFileChooser(TncSummaryModules tncSummaryModules, b.C0007b<getResourceId> bVar) {
        this.length = tncSummaryModules;
        this.getMin = bVar;
    }

    public static onShowFileChooser length(TncSummaryModules tncSummaryModules, b.C0007b<getResourceId> bVar) {
        return new onShowFileChooser(tncSummaryModules, bVar);
    }

    public final /* synthetic */ Object get() {
        ToolUtils.setMin max = this.length.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
