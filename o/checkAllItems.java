package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/danah5/twilioverifysecurityproduct/VerifySecurityProductResult;", "", "verificationStatus", "", "(Ljava/lang/String;)V", "getVerificationStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class checkAllItems {
    @NotNull
    private final String verificationStatus;

    public static /* synthetic */ checkAllItems copy$default(checkAllItems checkallitems, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkallitems.verificationStatus;
        }
        return checkallitems.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.verificationStatus;
    }

    @NotNull
    public final checkAllItems copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "verificationStatus");
        return new checkAllItems(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof checkAllItems) && Intrinsics.areEqual((Object) this.verificationStatus, (Object) ((checkAllItems) obj).verificationStatus);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.verificationStatus;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifySecurityProductResult(verificationStatus=");
        sb.append(this.verificationStatus);
        sb.append(")");
        return sb.toString();
    }

    public checkAllItems(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "verificationStatus");
        this.verificationStatus = str;
    }

    @NotNull
    public final String getVerificationStatus() {
        return this.verificationStatus;
    }
}
