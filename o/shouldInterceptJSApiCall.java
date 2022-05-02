package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPaginator", "Lid/dana/domain/social/model/Paginator;", "Lid/dana/data/social/repository/source/persistence/entity/PaginatorEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class shouldInterceptJSApiCall {
    @NotNull
    public static final setExtraDataBeaconTracker toPaginator(@NotNull setAuthContentResult setauthcontentresult) {
        Intrinsics.checkNotNullParameter(setauthcontentresult, "$this$toPaginator");
        return new setExtraDataBeaconTracker(setauthcontentresult.getBeginIndex(), setauthcontentresult.getEndIndex(), setauthcontentresult.getFirstPage(), setauthcontentresult.getItems(), setauthcontentresult.getItemsPerPage(), setauthcontentresult.getLastPage(), setauthcontentresult.getLength(), setauthcontentresult.getNextPage(), setauthcontentresult.getOffset(), setauthcontentresult.getPage(), setauthcontentresult.getPages(), setauthcontentresult.getPreviousPage(), (ArrayList) null, 4096, (DefaultConstructorMarker) null);
    }
}
