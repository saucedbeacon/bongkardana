package o;

import id.dana.contract.globalsearch.GlobalSearchBottomSheetModule;
import o.b;
import o.getTranslateY;

public final class getPathData implements getAdapterPosition<getTranslateY.setMax> {
    private final b.C0007b<getRootAlpha> getMax;
    private final GlobalSearchBottomSheetModule getMin;

    private getPathData(GlobalSearchBottomSheetModule globalSearchBottomSheetModule, b.C0007b<getRootAlpha> bVar) {
        this.getMin = globalSearchBottomSheetModule;
        this.getMax = bVar;
    }

    public static getPathData setMin(GlobalSearchBottomSheetModule globalSearchBottomSheetModule, b.C0007b<getRootAlpha> bVar) {
        return new getPathData(globalSearchBottomSheetModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getTranslateY.setMax max = this.getMin.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
