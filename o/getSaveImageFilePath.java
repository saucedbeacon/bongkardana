package o;

import id.dana.di.modules.SplitBillSectionModule;
import o.PopManager;
import o.b;

public final class getSaveImageFilePath implements getAdapterPosition<PopManager.PopBean.getMax> {
    private final b.C0007b<dismissAll> getMin;
    private final SplitBillSectionModule setMin;

    private getSaveImageFilePath(SplitBillSectionModule splitBillSectionModule, b.C0007b<dismissAll> bVar) {
        this.setMin = splitBillSectionModule;
        this.getMin = bVar;
    }

    public static getSaveImageFilePath length(SplitBillSectionModule splitBillSectionModule, b.C0007b<dismissAll> bVar) {
        return new getSaveImageFilePath(splitBillSectionModule, bVar);
    }

    public final /* synthetic */ Object get() {
        PopManager.PopBean.getMax min = this.setMin.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
