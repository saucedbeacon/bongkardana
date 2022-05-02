package o;

import id.dana.model.PayMethodModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\f"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/helper/ChangePayMethodViewHelper;", "", "()V", "findDefaultCard", "", "payMethodModel", "Lid/dana/model/PayMethodModel;", "defaultCardIndxNo", "", "getDefaultCard", "payMethodAdapter", "Lid/dana/sendmoney/paymethod/PayMethodAdapter;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCurrY {
    @NotNull
    public static final getCurrY setMin = new getCurrY();

    private getCurrY() {
    }

    @Nullable
    public static PayMethodModel setMax(@NotNull PhotoInfo photoInfo, @NotNull String str) {
        Intrinsics.checkNotNullParameter(photoInfo, "payMethodAdapter");
        Intrinsics.checkNotNullParameter(str, "defaultCardIndxNo");
        List<PayMethodModel> max = photoInfo.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "payMethodAdapter.items");
        for (PayMethodModel payMethodModel : max) {
            Intrinsics.checkNotNullExpressionValue(payMethodModel, "it");
            if (setMin(payMethodModel, str)) {
                return payMethodModel;
            }
        }
        return null;
    }

    private static boolean setMin(PayMethodModel payMethodModel, String str) {
        String str2 = payMethodModel.getMin;
        if (str2 == null) {
            str2 = "";
        }
        return Intrinsics.areEqual((Object) str2, (Object) str);
    }
}
