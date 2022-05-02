package o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lid/dana/data/merchant/repository/source/network/response/CreateProductOrderResult;", "Ljava/io/Serializable;", "acquirementId", "", "checkoutUrl", "orderId", "success", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAcquirementId", "()Ljava/lang/String;", "getCheckoutUrl", "getOrderId", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lid/dana/data/merchant/repository/source/network/response/CreateProductOrderResult;", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendMsgToConsole implements Serializable {
    @SerializedName("acquir ementId")
    @Nullable
    private final String acquirementId;
    @SerializedName("checkoutUrl")
    @Nullable
    private final String checkoutUrl;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName("success")
    @Nullable
    private final Boolean success;

    public sendMsgToConsole() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ sendMsgToConsole copy$default(sendMsgToConsole sendmsgtoconsole, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendmsgtoconsole.acquirementId;
        }
        if ((i & 2) != 0) {
            str2 = sendmsgtoconsole.checkoutUrl;
        }
        if ((i & 4) != 0) {
            str3 = sendmsgtoconsole.orderId;
        }
        if ((i & 8) != 0) {
            bool = sendmsgtoconsole.success;
        }
        return sendmsgtoconsole.copy(str, str2, str3, bool);
    }

    @Nullable
    public final String component1() {
        return this.acquirementId;
    }

    @Nullable
    public final String component2() {
        return this.checkoutUrl;
    }

    @Nullable
    public final String component3() {
        return this.orderId;
    }

    @Nullable
    public final Boolean component4() {
        return this.success;
    }

    @NotNull
    public final sendMsgToConsole copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        return new sendMsgToConsole(str, str2, str3, bool);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendMsgToConsole)) {
            return false;
        }
        sendMsgToConsole sendmsgtoconsole = (sendMsgToConsole) obj;
        return Intrinsics.areEqual((Object) this.acquirementId, (Object) sendmsgtoconsole.acquirementId) && Intrinsics.areEqual((Object) this.checkoutUrl, (Object) sendmsgtoconsole.checkoutUrl) && Intrinsics.areEqual((Object) this.orderId, (Object) sendmsgtoconsole.orderId) && Intrinsics.areEqual((Object) this.success, (Object) sendmsgtoconsole.success);
    }

    public final int hashCode() {
        String str = this.acquirementId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.checkoutUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.orderId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.success;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateProductOrderResult(acquirementId=");
        sb.append(this.acquirementId);
        sb.append(", checkoutUrl=");
        sb.append(this.checkoutUrl);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(")");
        return sb.toString();
    }

    public sendMsgToConsole(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        this.acquirementId = str;
        this.checkoutUrl = str2;
        this.orderId = str3;
        this.success = bool;
    }

    @Nullable
    public final String getAcquirementId() {
        return this.acquirementId;
    }

    @Nullable
    public final String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sendMsgToConsole(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Boolean.FALSE : bool);
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }
}
