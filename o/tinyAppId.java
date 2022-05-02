package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/data/saving/repository/source/network/request/SavingTopUpSubmitRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "savingId", "", "fundAmount", "requestId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFundAmount", "()Ljava/lang/String;", "getRequestId", "getSavingId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class tinyAppId extends BaseRpcRequest {
    @NotNull
    private final String fundAmount;
    @NotNull
    private final String requestId;
    @NotNull
    private final String savingId;

    public static /* synthetic */ tinyAppId copy$default(tinyAppId tinyappid, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tinyappid.savingId;
        }
        if ((i & 2) != 0) {
            str2 = tinyappid.fundAmount;
        }
        if ((i & 4) != 0) {
            str3 = tinyappid.requestId;
        }
        return tinyappid.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.savingId;
    }

    @NotNull
    public final String component2() {
        return this.fundAmount;
    }

    @NotNull
    public final String component3() {
        return this.requestId;
    }

    @NotNull
    public final tinyAppId copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1056005964, oncanceled);
            onCancelLoad.getMin(-1056005964, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "fundAmount");
        Intrinsics.checkNotNullParameter(str3, "requestId");
        return new tinyAppId(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tinyAppId)) {
            return false;
        }
        tinyAppId tinyappid = (tinyAppId) obj;
        return Intrinsics.areEqual((Object) this.savingId, (Object) tinyappid.savingId) && Intrinsics.areEqual((Object) this.fundAmount, (Object) tinyappid.fundAmount) && Intrinsics.areEqual((Object) this.requestId, (Object) tinyappid.requestId);
    }

    public final int hashCode() {
        String str = this.savingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.fundAmount;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.requestId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingTopUpSubmitRequest(savingId=");
        sb.append(this.savingId);
        sb.append(", fundAmount=");
        sb.append(this.fundAmount);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getSavingId() {
        return this.savingId;
    }

    @NotNull
    public final String getFundAmount() {
        return this.fundAmount;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public tinyAppId(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "fundAmount");
        Intrinsics.checkNotNullParameter(str3, "requestId");
        this.savingId = str;
        this.fundAmount = str2;
        this.requestId = str3;
    }
}
