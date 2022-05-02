package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/twilio/repository/source/network/request/VerifyPushEnrollRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "securityId", "", "source", "(Ljava/lang/String;Ljava/lang/String;)V", "getSecurityId", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onInputException extends BaseRpcRequest {
    @Nullable
    private final String securityId;
    @Nullable
    private final String source;

    public onInputException() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onInputException copy$default(onInputException oninputexception, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oninputexception.securityId;
        }
        if ((i & 2) != 0) {
            str2 = oninputexception.source;
        }
        return oninputexception.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.securityId;
    }

    @Nullable
    public final String component2() {
        return this.source;
    }

    @NotNull
    public final onInputException copy(@Nullable String str, @Nullable String str2) {
        return new onInputException(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onInputException)) {
            return false;
        }
        onInputException oninputexception = (onInputException) obj;
        return Intrinsics.areEqual((Object) this.securityId, (Object) oninputexception.securityId) && Intrinsics.areEqual((Object) this.source, (Object) oninputexception.source);
    }

    public final int hashCode() {
        String str = this.securityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.source;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyPushEnrollRequest(securityId=");
        sb.append(this.securityId);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onInputException(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public onInputException(@Nullable String str, @Nullable String str2) {
        this.securityId = str;
        this.source = str2;
    }
}
