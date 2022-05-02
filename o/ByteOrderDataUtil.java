package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/promocode/repository/source/network/request/PromoCodeRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "promoCode", "", "(Ljava/lang/String;)V", "getPromoCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ByteOrderDataUtil extends BaseRpcRequest {
    @NotNull
    private final String promoCode;

    public static /* synthetic */ ByteOrderDataUtil copy$default(ByteOrderDataUtil byteOrderDataUtil, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = byteOrderDataUtil.promoCode;
        }
        return byteOrderDataUtil.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.promoCode;
    }

    @NotNull
    public final ByteOrderDataUtil copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "promoCode");
        return new ByteOrderDataUtil(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof ByteOrderDataUtil) && Intrinsics.areEqual((Object) this.promoCode, (Object) ((ByteOrderDataUtil) obj).promoCode);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.promoCode;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeRequest(promoCode=");
        sb.append(this.promoCode);
        sb.append(")");
        return sb.toString();
    }

    public ByteOrderDataUtil(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "promoCode");
        this.promoCode = str;
    }

    @NotNull
    public final String getPromoCode() {
        return this.promoCode;
    }
}
