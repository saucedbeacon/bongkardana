package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lid/dana/domain/twilio/model/DerollInfo;", "", "securityId", "", "verificationMethodInfos", "", "success", "", "(Ljava/lang/String;Ljava/util/List;Z)V", "getSecurityId", "()Ljava/lang/String;", "setSecurityId", "(Ljava/lang/String;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getVerificationMethodInfos", "()Ljava/util/List;", "setVerificationMethodInfos", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getEndIndex {
    @Nullable
    private String securityId;
    private boolean success;
    @Nullable
    private List<String> verificationMethodInfos;

    public getEndIndex() {
        this((String) null, (List) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getEndIndex copy$default(getEndIndex getendindex, String str, List<String> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getendindex.securityId;
        }
        if ((i & 2) != 0) {
            list = getendindex.verificationMethodInfos;
        }
        if ((i & 4) != 0) {
            z = getendindex.success;
        }
        return getendindex.copy(str, list, z);
    }

    @Nullable
    public final String component1() {
        return this.securityId;
    }

    @Nullable
    public final List<String> component2() {
        return this.verificationMethodInfos;
    }

    public final boolean component3() {
        return this.success;
    }

    @NotNull
    public final getEndIndex copy(@Nullable String str, @Nullable List<String> list, boolean z) {
        return new getEndIndex(str, list, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEndIndex)) {
            return false;
        }
        getEndIndex getendindex = (getEndIndex) obj;
        return Intrinsics.areEqual((Object) this.securityId, (Object) getendindex.securityId) && Intrinsics.areEqual((Object) this.verificationMethodInfos, (Object) getendindex.verificationMethodInfos) && this.success == getendindex.success;
    }

    public final int hashCode() {
        String str = this.securityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.verificationMethodInfos;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.success;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DerollInfo(securityId=");
        sb.append(this.securityId);
        sb.append(", verificationMethodInfos=");
        sb.append(this.verificationMethodInfos);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(")");
        return sb.toString();
    }

    public getEndIndex(@Nullable String str, @Nullable List<String> list, boolean z) {
        this.securityId = str;
        this.verificationMethodInfos = list;
        this.success = z;
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        this.securityId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getEndIndex(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z);
    }

    @Nullable
    public final List<String> getVerificationMethodInfos() {
        return this.verificationMethodInfos;
    }

    public final void setVerificationMethodInfos(@Nullable List<String> list) {
        this.verificationMethodInfos = list;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }
}
