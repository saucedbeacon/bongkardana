package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/twilio/verify/data/Entry;", "", "key", "", "newValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getNewValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class RecyclerView$EdgeEffectFactory$EdgeDirection {
    @NotNull
    public final String getMax;
    @NotNull
    final String setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecyclerView$EdgeEffectFactory$EdgeDirection)) {
            return false;
        }
        RecyclerView$EdgeEffectFactory$EdgeDirection recyclerView$EdgeEffectFactory$EdgeDirection = (RecyclerView$EdgeEffectFactory$EdgeDirection) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) recyclerView$EdgeEffectFactory$EdgeDirection.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) recyclerView$EdgeEffectFactory$EdgeDirection.setMin);
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry(key=");
        sb.append(this.getMax);
        sb.append(", newValue=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public RecyclerView$EdgeEffectFactory$EdgeDirection(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "newValue");
        this.getMax = str;
        this.setMin = str2;
    }
}
