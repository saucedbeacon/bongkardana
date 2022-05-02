package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/QueryLastSuccessfulTransactionRequest;", "", "profileKey", "", "(Ljava/lang/String;)V", "getProfileKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setNode {
    @NotNull
    private final String profileKey;

    public static /* synthetic */ setNode copy$default(setNode setnode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setnode.profileKey;
        }
        return setnode.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.profileKey;
    }

    @NotNull
    public final setNode copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "profileKey");
        return new setNode(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setNode) && Intrinsics.areEqual((Object) this.profileKey, (Object) ((setNode) obj).profileKey);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.profileKey;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryLastSuccessfulTransactionRequest(profileKey=");
        sb.append(this.profileKey);
        sb.append(")");
        return sb.toString();
    }

    public setNode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "profileKey");
        this.profileKey = str;
    }

    @NotNull
    public final String getProfileKey() {
        return this.profileKey;
    }
}
