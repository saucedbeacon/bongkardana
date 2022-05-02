package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/senddigitalmoney/repository/model/request/CardPrefixQueryRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "cardIndexNo", "", "(Ljava/lang/String;)V", "getCardIndexNo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SecurityUtils extends BaseRpcRequest {
    @NotNull
    private final String cardIndexNo;

    public static /* synthetic */ SecurityUtils copy$default(SecurityUtils securityUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = securityUtils.cardIndexNo;
        }
        return securityUtils.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.cardIndexNo;
    }

    @NotNull
    public final SecurityUtils copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "cardIndexNo");
        return new SecurityUtils(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof SecurityUtils) && Intrinsics.areEqual((Object) this.cardIndexNo, (Object) ((SecurityUtils) obj).cardIndexNo);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.cardIndexNo;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPrefixQueryRequest(cardIndexNo=");
        sb.append(this.cardIndexNo);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public SecurityUtils(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "cardIndexNo");
        this.cardIndexNo = str;
    }
}
