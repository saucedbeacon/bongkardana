package o;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\t\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\n\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0002¨\u0006\f"}, d2 = {"collapse", "", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "expandFull", "expandHalf", "hide", "isBottomsheetShown", "", "isDragging", "isFullyExpanded", "isHalfExpand", "isHidden", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getOpenHelper {
    public static final boolean setMin(@NotNull BottomSheetBehavior<?> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$isFullyExpanded");
        return bottomSheetBehavior.getState() == 3;
    }

    public static final boolean getMax(@NotNull BottomSheetBehavior<?> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$isHidden");
        return bottomSheetBehavior.getState() == 5;
    }

    public static final boolean length(@NotNull BottomSheetBehavior<?> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$this$isBottomsheetShown");
        return bottomSheetBehavior.getState() == 4 || bottomSheetBehavior.getState() == 6 || bottomSheetBehavior.getState() == 3;
    }
}
