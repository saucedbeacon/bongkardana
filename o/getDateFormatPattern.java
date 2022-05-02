package o;

import id.dana.di.modules.BottomSheetOnBoardingModule;
import o.getSelectedIndex;

public final class getDateFormatPattern implements getAdapterPosition<getSelectedIndex.setMax> {
    private final BottomSheetOnBoardingModule getMax;

    private getDateFormatPattern(BottomSheetOnBoardingModule bottomSheetOnBoardingModule) {
        this.getMax = bottomSheetOnBoardingModule;
    }

    public static getDateFormatPattern getMin(BottomSheetOnBoardingModule bottomSheetOnBoardingModule) {
        return new getDateFormatPattern(bottomSheetOnBoardingModule);
    }

    public final /* synthetic */ Object get() {
        getSelectedIndex.setMax min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
