package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/twilio/verify/models/UpdatePushFactorPayload;", "Lcom/twilio/verify/models/UpdateFactorPayload;", "sid", "", "pushToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getPushToken", "()Ljava/lang/String;", "getSid", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getPaddingRight implements getPaddingLeft {
    @NotNull
    public final String getMin;
    @NotNull
    private final String setMax;

    public getPaddingRight(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(str2, "pushToken");
        this.setMax = str;
        this.getMin = str2;
    }

    @NotNull
    public final String setMin() {
        return this.setMax;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePushFactorPayload(sid=");
        sb.append(this.setMax);
        sb.append(", pushToken=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPaddingRight)) {
            return false;
        }
        getPaddingRight getpaddingright = (getPaddingRight) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) getpaddingright.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) getpaddingright.getMin);
    }
}
