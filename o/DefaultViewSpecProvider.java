package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.RVTabBarImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toEddInfoRequest", "Lid/dana/data/kycamledd/repository/source/network/request/EddInfoRequest;", "Lid/dana/domain/kycamledd/model/EddSubmitInfo;", "toEddSubmitInfoDTORequest", "Lid/dana/data/kycamledd/repository/source/network/request/EddSubmitInfoDTORequest;", "Lid/dana/domain/kycamledd/model/EddSubmitInfoDTO;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class DefaultViewSpecProvider {
    @NotNull
    public static final onBackgroundAlphaStatusChanged toEddInfoRequest(@NotNull runTask runtask) {
        Intrinsics.checkNotNullParameter(runtask, "$this$toEddInfoRequest");
        String amlOrderId = runtask.getAmlOrderId();
        Iterable<GriverExecutors> eddQuestionInfos = runtask.getEddQuestionInfos();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eddQuestionInfos, 10));
        for (GriverExecutors eddSubmitInfoDTORequest : eddQuestionInfos) {
            arrayList.add(toEddSubmitInfoDTORequest(eddSubmitInfoDTORequest));
        }
        return new onBackgroundAlphaStatusChanged(amlOrderId, (List) arrayList);
    }

    @NotNull
    public static final RVTabBarImpl.AnonymousClass3 toEddSubmitInfoDTORequest(@NotNull GriverExecutors griverExecutors) {
        Intrinsics.checkNotNullParameter(griverExecutors, "$this$toEddSubmitInfoDTORequest");
        return new RVTabBarImpl.AnonymousClass3(griverExecutors.getQuestionId(), griverExecutors.getAnswerId());
    }
}
