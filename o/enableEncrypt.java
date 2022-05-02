package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/SavingTopUpSubmitResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "checkoutUrl", "", "(Ljava/lang/String;)V", "getCheckoutUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class enableEncrypt extends BaseRpcResult {
    @NotNull
    private final String checkoutUrl;

    public static /* synthetic */ enableEncrypt copy$default(enableEncrypt enableencrypt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enableencrypt.checkoutUrl;
        }
        return enableencrypt.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.checkoutUrl;
    }

    @NotNull
    public final enableEncrypt copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "checkoutUrl");
        return new enableEncrypt(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof enableEncrypt) && Intrinsics.areEqual((Object) this.checkoutUrl, (Object) ((enableEncrypt) obj).checkoutUrl);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.checkoutUrl;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingTopUpSubmitResult(checkoutUrl=");
        sb.append(this.checkoutUrl);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    public enableEncrypt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "checkoutUrl");
        this.checkoutUrl = str;
    }
}
