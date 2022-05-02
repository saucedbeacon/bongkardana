package o;

import id.dana.statement.model.StatementViewModel;
import id.dana.statement.model.UserStatementModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"toListStatementViewModel", "", "Lid/dana/statement/model/StatementViewModel;", "Lid/dana/statement/model/UserStatementModel;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class AUAttrsUtils {
    @NotNull
    public static final List<StatementViewModel> setMax(@NotNull List<UserStatementModel> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListStatementViewModel");
        Iterable<UserStatementModel> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (UserStatementModel max : iterable) {
            arrayList.add(adptApMinMax.setMax(max));
        }
        return (List) arrayList;
    }
}
