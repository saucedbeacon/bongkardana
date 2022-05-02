package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/data/geofence/repository/source/network/request/PoiNotificationRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "Ljava/io/Serializable;", "pois", "", "Lid/dana/data/geofence/model/PoiNotificationInfo;", "(Ljava/util/List;)V", "getPois", "()Ljava/util/List;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PagePushInterceptPoint extends BaseRpcRequest implements Serializable {
    @NotNull
    private final List<handleBackPressed> pois;

    public PagePushInterceptPoint() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public PagePushInterceptPoint(@NotNull List<handleBackPressed> list) {
        Intrinsics.checkNotNullParameter(list, "pois");
        this.pois = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagePushInterceptPoint(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<handleBackPressed> getPois() {
        return this.pois;
    }
}
