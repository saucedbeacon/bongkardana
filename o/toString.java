package o;

import id.dana.lib.electronicmoney.activity.BottomSheetActivity;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class toString implements toFloatRange {
    public final /* synthetic */ BottomSheetActivity getMin;

    public toString(BottomSheetActivity bottomSheetActivity) {
        this.getMin = bottomSheetActivity;
    }

    public final void getMax(@NotNull ICustomTabsCallback iCustomTabsCallback) {
        Intrinsics.checkNotNullParameter(iCustomTabsCallback, "balanceResult");
        boolean z = iCustomTabsCallback.setMax;
        if (z || (!z && CollectionsKt.contains(CollectionsKt.mutableListOf("009", "010"), iCustomTabsCallback.isInside))) {
            BottomSheetActivity.access$showSuccessCardReadState(this.getMin, iCustomTabsCallback, Intrinsics.areEqual((Object) iCustomTabsCallback.isInside, (Object) "009"));
            return;
        }
        BottomSheetActivity bottomSheetActivity = this.getMin;
        String str = iCustomTabsCallback.toFloatRange;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        BottomSheetActivity.access$showToastinDebugMode(bottomSheetActivity, str);
        BottomSheetActivity bottomSheetActivity2 = this.getMin;
        String str3 = iCustomTabsCallback.isInside;
        if (str3 != null) {
            str2 = str3;
        }
        bottomSheetActivity2.a(str2);
    }
}
