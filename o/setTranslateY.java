package o;

import id.dana.contract.globalsearch.GlobalSearchBottomSheetModule;
import o.getTranslateY;

public final class setTranslateY implements getAdapterPosition<getTranslateY.getMax> {
    private final GlobalSearchBottomSheetModule getMin;

    private setTranslateY(GlobalSearchBottomSheetModule globalSearchBottomSheetModule) {
        this.getMin = globalSearchBottomSheetModule;
    }

    public static setTranslateY setMin(GlobalSearchBottomSheetModule globalSearchBottomSheetModule) {
        return new setTranslateY(globalSearchBottomSheetModule);
    }

    public final /* synthetic */ Object get() {
        getTranslateY.getMax max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
