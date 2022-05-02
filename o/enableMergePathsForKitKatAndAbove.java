package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/autoroute/model/UserAutorouteInitRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "needAssetCheck", "", "(Z)V", "getNeedAssetCheck", "()Z", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class enableMergePathsForKitKatAndAbove extends BaseRpcRequest {
    private final boolean needAssetCheck;

    public final boolean getNeedAssetCheck() {
        return this.needAssetCheck;
    }

    public enableMergePathsForKitKatAndAbove(boolean z) {
        this.needAssetCheck = z;
    }
}
