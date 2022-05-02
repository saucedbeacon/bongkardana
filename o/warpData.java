package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/openbankaccount/model/BankAccountInfoEntity;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "instId", "", "status", "bankName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "setBankName", "(Ljava/lang/String;)V", "getInstId", "setInstId", "getStatus", "setStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class warpData extends BaseRpcResult {
    @NotNull
    private String bankName;
    @NotNull
    private String instId;
    @NotNull
    private String status;

    public static /* synthetic */ warpData copy$default(warpData warpdata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = warpdata.instId;
        }
        if ((i & 2) != 0) {
            str2 = warpdata.status;
        }
        if ((i & 4) != 0) {
            str3 = warpdata.bankName;
        }
        return warpdata.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.instId;
    }

    @NotNull
    public final String component2() {
        return this.status;
    }

    @NotNull
    public final String component3() {
        return this.bankName;
    }

    @NotNull
    public final warpData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "status");
        Intrinsics.checkNotNullParameter(str3, "bankName");
        return new warpData(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof warpData)) {
            return false;
        }
        warpData warpdata = (warpData) obj;
        return Intrinsics.areEqual((Object) this.instId, (Object) warpdata.instId) && Intrinsics.areEqual((Object) this.status, (Object) warpdata.status) && Intrinsics.areEqual((Object) this.bankName, (Object) warpdata.bankName);
    }

    public final int hashCode() {
        String str = this.instId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.status;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bankName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankAccountInfoEntity(instId=");
        sb.append(this.instId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", bankName=");
        sb.append(this.bankName);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getInstId() {
        return this.instId;
    }

    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.instId = str;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    @NotNull
    public final String getBankName() {
        return this.bankName;
    }

    public final void setBankName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bankName = str;
    }

    public warpData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "status");
        Intrinsics.checkNotNullParameter(str3, "bankName");
        this.instId = str;
        this.status = str2;
        this.bankName = str3;
    }
}
