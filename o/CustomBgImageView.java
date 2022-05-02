package o;

import id.dana.savings.model.SavingCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toSavingCategoryModel", "Lid/dana/savings/model/SavingCategoryModel;", "Lid/dana/domain/saving/model/SavingCategory;", "toSavingCategoryModels", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class CustomBgImageView {
    @NotNull
    public static final List<SavingCategoryModel> getMin(@NotNull List<setDebug> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toSavingCategoryModels");
        Iterable<setDebug> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (setDebug max : iterable) {
            arrayList.add(setMax(max));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final SavingCategoryModel setMax(@NotNull setDebug setdebug) {
        Intrinsics.checkNotNullParameter(setdebug, "$this$toSavingCategoryModel");
        return new SavingCategoryModel(setdebug.getCategoryCode(), setdebug.getName(), setdebug.getIconUrlDefault(), setdebug.getIconUrlSelected(), setdebug.getIconUrlLevel1(), setdebug.getIconUrlLevel2(), setdebug.getIconUrlLevel3(), setdebug.getIconUrlLevel4(), setdebug.getIconUrlLevel5());
    }
}
