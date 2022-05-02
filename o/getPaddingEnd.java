package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/twilio/verify/networking/BasicAuthorization;", "", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "header", "Lkotlin/Pair;", "getHeader", "()Lkotlin/Pair;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getPaddingEnd {
    final String getMax;
    final String setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPaddingEnd)) {
            return false;
        }
        getPaddingEnd getpaddingend = (getPaddingEnd) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) getpaddingend.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) getpaddingend.getMax);
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BasicAuthorization(username=");
        sb.append(this.setMax);
        sb.append(", password=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public getPaddingEnd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, setBuildNumber.USERNAME_KEY);
        Intrinsics.checkParameterIsNotNull(str2, "password");
        this.setMax = str;
        this.getMax = str2;
    }
}
