package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toQrisCrossBorderContent", "Lid/dana/domain/qriscrossborder/model/QrisCrossBorderContent;", "Lid/dana/data/config/source/amcs/result/QrisCrossBorderContentResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class forId {
    @NotNull
    public static final setConfigUnits toQrisCrossBorderContent(@NotNull initResult initresult) {
        Intrinsics.checkNotNullParameter(initresult, "$this$toQrisCrossBorderContent");
        return new setConfigUnits(initresult.getTitle(), initresult.getSubtitle(), initresult.getButtonTitle(), initresult.getImageUrl(), initresult.getDescription());
    }
}
