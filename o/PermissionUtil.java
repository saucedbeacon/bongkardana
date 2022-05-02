package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lid/dana/data/electronicmoney/network/request/EmoneyInquiryRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "cardProvider", "", "data", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getCardProvider", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PermissionUtil extends BaseRpcRequest {
    @NotNull
    private final String cardProvider;
    @NotNull
    private final Map<String, String> data;

    @NotNull
    public final String getCardProvider() {
        return this.cardProvider;
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    public PermissionUtil(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        this.cardProvider = str;
        this.data = map;
    }
}
