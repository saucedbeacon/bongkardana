package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lid/dana/domain/twilio/model/TwilioInfo;", "", "registered", "", "registerAllowed", "securityId", "", "verificationMethodInfos", "", "(ZZLjava/lang/String;Ljava/util/List;)V", "getRegisterAllowed", "()Z", "getRegistered", "getSecurityId", "()Ljava/lang/String;", "getVerificationMethodInfos", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class disableBluetooth {
    private final boolean registerAllowed;
    private final boolean registered;
    @Nullable
    private final String securityId;
    @Nullable
    private final List<String> verificationMethodInfos;

    public static /* synthetic */ disableBluetooth copy$default(disableBluetooth disablebluetooth, boolean z, boolean z2, String str, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = disablebluetooth.registered;
        }
        if ((i & 2) != 0) {
            z2 = disablebluetooth.registerAllowed;
        }
        if ((i & 4) != 0) {
            str = disablebluetooth.securityId;
        }
        if ((i & 8) != 0) {
            list = disablebluetooth.verificationMethodInfos;
        }
        return disablebluetooth.copy(z, z2, str, list);
    }

    public final boolean component1() {
        return this.registered;
    }

    public final boolean component2() {
        return this.registerAllowed;
    }

    @Nullable
    public final String component3() {
        return this.securityId;
    }

    @Nullable
    public final List<String> component4() {
        return this.verificationMethodInfos;
    }

    @NotNull
    public final disableBluetooth copy(boolean z, boolean z2, @Nullable String str, @Nullable List<String> list) {
        return new disableBluetooth(z, z2, str, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disableBluetooth)) {
            return false;
        }
        disableBluetooth disablebluetooth = (disableBluetooth) obj;
        return this.registered == disablebluetooth.registered && this.registerAllowed == disablebluetooth.registerAllowed && Intrinsics.areEqual((Object) this.securityId, (Object) disablebluetooth.securityId) && Intrinsics.areEqual((Object) this.verificationMethodInfos, (Object) disablebluetooth.verificationMethodInfos);
    }

    public final int hashCode() {
        boolean z = this.registered;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.registerAllowed;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.securityId;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.verificationMethodInfos;
        if (list != null) {
            i3 = list.hashCode();
        }
        return hashCode + i3;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TwilioInfo(registered=");
        sb.append(this.registered);
        sb.append(", registerAllowed=");
        sb.append(this.registerAllowed);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(", verificationMethodInfos=");
        sb.append(this.verificationMethodInfos);
        sb.append(")");
        return sb.toString();
    }

    public disableBluetooth(boolean z, boolean z2, @Nullable String str, @Nullable List<String> list) {
        this.registered = z;
        this.registerAllowed = z2;
        this.securityId = str;
        this.verificationMethodInfos = list;
    }

    public final boolean getRegistered() {
        return this.registered;
    }

    public final boolean getRegisterAllowed() {
        return this.registerAllowed;
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ disableBluetooth(boolean z, boolean z2, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<String> getVerificationMethodInfos() {
        return this.verificationMethodInfos;
    }
}
