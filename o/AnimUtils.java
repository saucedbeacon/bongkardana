package o;

import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lid/dana/data/electronicmoney/network/request/BrizziManualReversalRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "data", "", "responseCode", "reversalInfo", "Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;)V", "getData", "()Ljava/lang/String;", "getResponseCode", "getReversalInfo", "()Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AnimUtils extends BaseRpcRequest {
    @Nullable
    private final String data;
    @NotNull
    private final String responseCode;
    @NotNull
    private final getTextSize reversalInfo;

    @Nullable
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getResponseCode() {
        return this.responseCode;
    }

    @NotNull
    public final getTextSize getReversalInfo() {
        return this.reversalInfo;
    }

    public AnimUtils(@Nullable String str, @NotNull String str2, @NotNull getTextSize gettextsize) {
        Intrinsics.checkNotNullParameter(str2, ZimMessageChannel.K_RPC_RES_CODE);
        Intrinsics.checkNotNullParameter(gettextsize, "reversalInfo");
        this.data = str;
        this.responseCode = str2;
        this.reversalInfo = gettextsize;
    }
}
