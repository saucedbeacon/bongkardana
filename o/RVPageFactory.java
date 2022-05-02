package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lid/dana/data/investment/repository/source/network/request/AccountInvestmentRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "userId", "", "goodsId", "(Ljava/lang/String;Ljava/lang/String;)V", "getGoodsId", "()Ljava/lang/String;", "setGoodsId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVPageFactory extends BaseRpcRequest {
    @NotNull
    private String goodsId;
    @NotNull
    private String userId;

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    public final void setGoodsId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.goodsId = str;
    }

    public RVPageFactory(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        this.userId = str;
        this.goodsId = str2;
    }
}
