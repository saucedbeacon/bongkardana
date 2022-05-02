package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPaginator", "Lid/dana/domain/social/model/Paginator;", "Lid/dana/data/social/repository/source/network/response/PaginatorResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class EmbedWebViewJsApiPermissionProxy {
    @NotNull
    public static final setExtraDataBeaconTracker toPaginator(@NotNull setIsvAgentDesc setisvagentdesc) {
        Intrinsics.checkNotNullParameter(setisvagentdesc, "$this$toPaginator");
        return new setExtraDataBeaconTracker(setisvagentdesc.getBeginIndex(), setisvagentdesc.getEndIndex(), setisvagentdesc.getFirstPage(), setisvagentdesc.getItems(), setisvagentdesc.getItemsPerPage(), setisvagentdesc.getLastPage(), setisvagentdesc.getLength(), setisvagentdesc.getNextPage(), setisvagentdesc.getOffset(), setisvagentdesc.getPage(), setisvagentdesc.getPages(), setisvagentdesc.getPreviousPage(), (ArrayList) null, 4096, (DefaultConstructorMarker) null);
    }
}
