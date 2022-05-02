package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyConfig;", "Ljava/io/Serializable;", "enable", "", "name", "", "(ZLjava/lang/String;)V", "getEnable", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setSupportMultipleWindows implements Serializable {
    private final boolean enable;
    @Nullable
    private final String name;

    public static /* synthetic */ setSupportMultipleWindows copy$default(setSupportMultipleWindows setsupportmultiplewindows, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setsupportmultiplewindows.enable;
        }
        if ((i & 2) != 0) {
            str = setsupportmultiplewindows.name;
        }
        return setsupportmultiplewindows.copy(z, str);
    }

    public final boolean component1() {
        return this.enable;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final setSupportMultipleWindows copy(boolean z, @Nullable String str) {
        return new setSupportMultipleWindows(z, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSupportMultipleWindows)) {
            return false;
        }
        setSupportMultipleWindows setsupportmultiplewindows = (setSupportMultipleWindows) obj;
        return this.enable == setsupportmultiplewindows.enable && Intrinsics.areEqual((Object) this.name, (Object) setsupportmultiplewindows.name);
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.name;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ElectronicMoneyConfig(enable=");
        sb.append(this.enable);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(")");
        return sb.toString();
    }

    public setSupportMultipleWindows(boolean z, @Nullable String str) {
        this.enable = z;
        this.name = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setSupportMultipleWindows(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }
}
