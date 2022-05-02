package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/data/userconsent/repository/source/network/RecordAgreementRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "agreementKey", "", "userAgree", "", "(Ljava/lang/String;Z)V", "getAgreementKey", "()Ljava/lang/String;", "getUserAgree", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getHttpLinkSubResMimeList extends BaseRpcRequest {
    @NotNull
    private final String agreementKey;
    private final boolean userAgree;

    public static /* synthetic */ getHttpLinkSubResMimeList copy$default(getHttpLinkSubResMimeList gethttplinksubresmimelist, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gethttplinksubresmimelist.agreementKey;
        }
        if ((i & 2) != 0) {
            z = gethttplinksubresmimelist.userAgree;
        }
        return gethttplinksubresmimelist.copy(str, z);
    }

    @NotNull
    public final String component1() {
        return this.agreementKey;
    }

    public final boolean component2() {
        return this.userAgree;
    }

    @NotNull
    public final getHttpLinkSubResMimeList copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "agreementKey");
        return new getHttpLinkSubResMimeList(str, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHttpLinkSubResMimeList)) {
            return false;
        }
        getHttpLinkSubResMimeList gethttplinksubresmimelist = (getHttpLinkSubResMimeList) obj;
        return Intrinsics.areEqual((Object) this.agreementKey, (Object) gethttplinksubresmimelist.agreementKey) && this.userAgree == gethttplinksubresmimelist.userAgree;
    }

    public final int hashCode() {
        String str = this.agreementKey;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.userAgree;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordAgreementRequest(agreementKey=");
        sb.append(this.agreementKey);
        sb.append(", userAgree=");
        sb.append(this.userAgree);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getAgreementKey() {
        return this.agreementKey;
    }

    public final boolean getUserAgree() {
        return this.userAgree;
    }

    public getHttpLinkSubResMimeList(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "agreementKey");
        this.agreementKey = str;
        this.userAgree = z;
    }
}
