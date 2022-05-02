package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/domain/twilio/model/EnrollInfo;", "", "succes", "", "accessToken", "", "identity", "serviceSid", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getIdentity", "getServiceSid", "getSucces", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class enableBluetooth {
    @NotNull
    private final String accessToken;
    @Nullable
    private final String identity;
    @Nullable
    private final String serviceSid;
    private final boolean succes;

    public static /* synthetic */ enableBluetooth copy$default(enableBluetooth enablebluetooth, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = enablebluetooth.succes;
        }
        if ((i & 2) != 0) {
            str = enablebluetooth.accessToken;
        }
        if ((i & 4) != 0) {
            str2 = enablebluetooth.identity;
        }
        if ((i & 8) != 0) {
            str3 = enablebluetooth.serviceSid;
        }
        return enablebluetooth.copy(z, str, str2, str3);
    }

    public final boolean component1() {
        return this.succes;
    }

    @NotNull
    public final String component2() {
        return this.accessToken;
    }

    @Nullable
    public final String component3() {
        return this.identity;
    }

    @Nullable
    public final String component4() {
        return this.serviceSid;
    }

    @NotNull
    public final enableBluetooth copy(boolean z, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        return new enableBluetooth(z, str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableBluetooth)) {
            return false;
        }
        enableBluetooth enablebluetooth = (enableBluetooth) obj;
        return this.succes == enablebluetooth.succes && Intrinsics.areEqual((Object) this.accessToken, (Object) enablebluetooth.accessToken) && Intrinsics.areEqual((Object) this.identity, (Object) enablebluetooth.identity) && Intrinsics.areEqual((Object) this.serviceSid, (Object) enablebluetooth.serviceSid);
    }

    public final int hashCode() {
        boolean z = this.succes;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.accessToken;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.identity;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.serviceSid;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EnrollInfo(succes=");
        sb.append(this.succes);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", identity=");
        sb.append(this.identity);
        sb.append(", serviceSid=");
        sb.append(this.serviceSid);
        sb.append(")");
        return sb.toString();
    }

    public enableBluetooth(boolean z, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        this.succes = z;
        this.accessToken = str;
        this.identity = str2;
        this.serviceSid = str3;
    }

    public final boolean getSucces() {
        return this.succes;
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getIdentity() {
        return this.identity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enableBluetooth(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    @Nullable
    public final String getServiceSid() {
        return this.serviceSid;
    }
}
