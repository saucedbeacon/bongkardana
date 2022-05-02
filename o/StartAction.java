package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "bizId", "", "(Ljava/lang/String;)V", "getBizId", "()Ljava/lang/String;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StartAction extends BaseRpcResult {
    @NotNull
    private final String bizId;

    @NotNull
    public final String getBizId() {
        return this.bizId;
    }

    public StartAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "bizId");
        this.bizId = str;
    }
}
