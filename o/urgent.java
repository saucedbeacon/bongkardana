package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/data/saving/repository/source/network/request/SavingDetailRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "savingId", "", "topUpViewsPage", "", "topUpViewsSize", "(Ljava/lang/String;JJ)V", "getSavingId", "()Ljava/lang/String;", "getTopUpViewsPage", "()J", "getTopUpViewsSize", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class urgent extends BaseRpcRequest {
    @NotNull
    private final String savingId;
    private final long topUpViewsPage;
    private final long topUpViewsSize;

    public static /* synthetic */ urgent copy$default(urgent urgent, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urgent.savingId;
        }
        if ((i & 2) != 0) {
            j = urgent.topUpViewsPage;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = urgent.topUpViewsSize;
        }
        return urgent.copy(str, j3, j2);
    }

    @NotNull
    public final String component1() {
        return this.savingId;
    }

    public final long component2() {
        return this.topUpViewsPage;
    }

    public final long component3() {
        return this.topUpViewsSize;
    }

    @NotNull
    public final urgent copy(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        return new urgent(str, j, j2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urgent)) {
            return false;
        }
        urgent urgent = (urgent) obj;
        return Intrinsics.areEqual((Object) this.savingId, (Object) urgent.savingId) && this.topUpViewsPage == urgent.topUpViewsPage && this.topUpViewsSize == urgent.topUpViewsSize;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingDetailRequest(savingId=");
        sb.append(this.savingId);
        sb.append(", topUpViewsPage=");
        sb.append(this.topUpViewsPage);
        sb.append(", topUpViewsSize=");
        sb.append(this.topUpViewsSize);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getSavingId() {
        return this.savingId;
    }

    public final long getTopUpViewsPage() {
        return this.topUpViewsPage;
    }

    public final long getTopUpViewsSize() {
        return this.topUpViewsSize;
    }

    public urgent(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        this.savingId = str;
        this.topUpViewsPage = j;
        this.topUpViewsSize = j2;
    }

    public final int hashCode() {
        String str = this.savingId;
        return ((((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.topUpViewsPage).hashCode()) * 31) + Long.valueOf(this.topUpViewsSize).hashCode();
    }
}
