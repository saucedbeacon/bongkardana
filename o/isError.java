package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/data/recentrecipient/model/BankCardConversionRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "cardCredential", "", "cardNo", "instId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardCredential", "()Ljava/lang/String;", "getCardNo", "getInstId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isError extends BaseRpcRequest {
    @NotNull
    private final String cardCredential;
    @NotNull
    private final String cardNo;
    @NotNull
    private final String instId;

    public static /* synthetic */ isError copy$default(isError iserror, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iserror.cardCredential;
        }
        if ((i & 2) != 0) {
            str2 = iserror.cardNo;
        }
        if ((i & 4) != 0) {
            str3 = iserror.instId;
        }
        return iserror.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.cardCredential;
    }

    @NotNull
    public final String component2() {
        return this.cardNo;
    }

    @NotNull
    public final String component3() {
        return this.instId;
    }

    @NotNull
    public final isError copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "cardCredential");
        Intrinsics.checkNotNullParameter(str2, "cardNo");
        Intrinsics.checkNotNullParameter(str3, UrlTag.INSTID);
        return new isError(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isError)) {
            return false;
        }
        isError iserror = (isError) obj;
        return Intrinsics.areEqual((Object) this.cardCredential, (Object) iserror.cardCredential) && Intrinsics.areEqual((Object) this.cardNo, (Object) iserror.cardNo) && Intrinsics.areEqual((Object) this.instId, (Object) iserror.instId);
    }

    public final int hashCode() {
        String str = this.cardCredential;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.cardNo;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.instId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankCardConversionRequest(cardCredential=");
        sb.append(this.cardCredential);
        sb.append(", cardNo=");
        sb.append(this.cardNo);
        sb.append(", instId=");
        sb.append(this.instId);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getCardCredential() {
        return this.cardCredential;
    }

    @NotNull
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final String getInstId() {
        return this.instId;
    }

    public isError(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "cardCredential");
        Intrinsics.checkNotNullParameter(str2, "cardNo");
        Intrinsics.checkNotNullParameter(str3, UrlTag.INSTID);
        this.cardCredential = str;
        this.cardNo = str2;
        this.instId = str3;
    }
}
