package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lid/dana/data/electronicmoney/network/request/EmoneyConfirmBalanceRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "cardType", "", "cardProvider", "data", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCardProvider", "()Ljava/lang/String;", "getCardType", "getData", "()Ljava/util/Map;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class Visit extends BaseRpcRequest {
    @NotNull
    private final String cardProvider;
    @NotNull
    private final String cardType;
    @NotNull
    private final Map<String, String> data;

    @NotNull
    public final String getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getCardProvider() {
        return this.cardProvider;
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    public Visit(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        this.cardType = str;
        this.cardProvider = str2;
        this.data = map;
    }
}
