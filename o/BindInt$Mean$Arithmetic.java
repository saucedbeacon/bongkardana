package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.model.ThirdPartyService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.NullBeaconDataFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/services/ServicesPresenter$mergeWithFavoriteServices$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "onError", "", "e", "", "onNext", "favoriteService", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BindInt$Mean$Arithmetic extends GriverAppVirtualHostProxy<NullBeaconDataFactory.AnonymousClass1> {
    final /* synthetic */ BindInt getMax;
    final /* synthetic */ boolean getMin;
    final /* synthetic */ List length;

    BindInt$Mean$Arithmetic(BindInt bindInt, List list, boolean z) {
        this.getMax = bindInt;
        this.length = list;
        this.getMin = z;
    }

    public final /* synthetic */ void onNext(Object obj) {
        NullBeaconDataFactory.AnonymousClass1 r4 = (NullBeaconDataFactory.AnonymousClass1) obj;
        Intrinsics.checkNotNullParameter(r4, "favoriteService");
        BindInt.setMin(this.length, r4);
        this.getMax.length.setMin((List<ThirdPartyService>) CollectionsKt.toMutableList(this.getMax.toIntRange.getMax(this.length, this.getMin, false)));
    }

    public final void onError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "e");
        super.onError(th);
        updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.FAVORITE_SERVICES_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
        this.getMax.length.setMin((List<ThirdPartyService>) CollectionsKt.toMutableList(this.getMax.toIntRange.getMax(this.length, true, this.getMin)));
    }
}
