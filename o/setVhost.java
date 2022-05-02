package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/data/user/source/network/request/CheckUserInfoRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "scopes", "", "clientId", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getScopes", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setVhost extends BaseRpcRequest {
    @Nullable
    private final String clientId;
    @Nullable
    private final String scopes;
    @NotNull
    private final String userId;

    public static /* synthetic */ setVhost copy$default(setVhost setvhost, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setvhost.scopes;
        }
        if ((i & 2) != 0) {
            str2 = setvhost.clientId;
        }
        if ((i & 4) != 0) {
            str3 = setvhost.userId;
        }
        return setvhost.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.scopes;
    }

    @Nullable
    public final String component2() {
        return this.clientId;
    }

    @NotNull
    public final String component3() {
        return this.userId;
    }

    @NotNull
    public final setVhost copy(@Nullable String str, @Nullable String str2, @NotNull String str3) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(7408800, oncanceled);
            onCancelLoad.getMin(7408800, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str3, "userId");
        return new setVhost(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setVhost)) {
            return false;
        }
        setVhost setvhost = (setVhost) obj;
        return Intrinsics.areEqual((Object) this.scopes, (Object) setvhost.scopes) && Intrinsics.areEqual((Object) this.clientId, (Object) setvhost.clientId) && Intrinsics.areEqual((Object) this.userId, (Object) setvhost.userId);
    }

    public final int hashCode() {
        String str = this.scopes;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.clientId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.userId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckUserInfoRequest(scopes=");
        sb.append(this.scopes);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getScopes() {
        return this.scopes;
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public setVhost(@Nullable String str, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "userId");
        this.scopes = str;
        this.clientId = str2;
        this.userId = str3;
    }
}
