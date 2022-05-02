package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lid/dana/data/electronicmoney/network/request/ElectronicMoneyBizIdRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "bizEventName", "", "(Ljava/lang/String;)V", "getBizEventName", "()Ljava/lang/String;", "setBizEventName", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ActivityAnimBean extends BaseRpcRequest {
    @NotNull
    private String bizEventName;

    @NotNull
    public final String getBizEventName() {
        return this.bizEventName;
    }

    public final void setBizEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bizEventName = str;
    }

    public ActivityAnimBean(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "bizEventName");
        this.bizEventName = str;
    }
}
