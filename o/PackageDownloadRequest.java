package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import o.DownloadInstallCallback;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/data/statement/repository/source/network/response/StatementDetailResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "userAccumulateDetails", "", "Lid/dana/data/statement/repository/source/network/response/UserAccumulateDetail;", "(Ljava/util/List;)V", "getUserAccumulateDetails", "()Ljava/util/List;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PackageDownloadRequest extends BaseRpcResult {
    @Nullable
    private final List<DownloadInstallCallback.AnonymousClass1> userAccumulateDetails;

    @Nullable
    public final List<DownloadInstallCallback.AnonymousClass1> getUserAccumulateDetails() {
        return this.userAccumulateDetails;
    }

    public PackageDownloadRequest(@Nullable List<DownloadInstallCallback.AnonymousClass1> list) {
        this.userAccumulateDetails = list;
    }
}
