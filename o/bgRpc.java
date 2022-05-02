package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/data/saving/repository/source/network/request/SavingWithdrawInitEntityRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "savingId", "", "withdrawMethod", "(Ljava/lang/String;Ljava/lang/String;)V", "getSavingId", "()Ljava/lang/String;", "getWithdrawMethod", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class bgRpc extends BaseRpcRequest {
    @NotNull
    private final String savingId;
    @NotNull
    private final String withdrawMethod;

    @NotNull
    public final String getSavingId() {
        return this.savingId;
    }

    @NotNull
    public final String getWithdrawMethod() {
        return this.withdrawMethod;
    }

    public bgRpc(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "withdrawMethod");
        this.savingId = str;
        this.withdrawMethod = str2;
    }
}
