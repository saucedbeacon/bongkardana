package o;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/anggrayudi/storage/media/FileDescription;", "", "name", "", "subFolder", "mimeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "fullName", "getFullName", "()Ljava/lang/String;", "getMimeType", "setMimeType", "(Ljava/lang/String;)V", "getName", "setName", "getSubFolder", "setSubFolder", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getCurrentContentInsetRight {
    @NotNull
    public String getMin;
    @NotNull
    public String length;
    @NotNull
    String setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentContentInsetRight)) {
            return false;
        }
        getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) getcurrentcontentinsetright.length) && Intrinsics.areEqual((Object) this.setMax, (Object) getcurrentcontentinsetright.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) getcurrentcontentinsetright.getMin);
    }

    public final int hashCode() {
        return (((this.length.hashCode() * 31) + this.setMax.hashCode()) * 31) + this.getMin.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FileDescription(name=");
        sb.append(this.length);
        sb.append(", subFolder=");
        sb.append(this.setMax);
        sb.append(", mimeType=");
        sb.append(this.getMin);
        sb.append(')');
        return sb.toString();
    }

    @JvmOverloads
    public getCurrentContentInsetRight(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "subFolder");
        Intrinsics.checkNotNullParameter(str3, "mimeType");
        this.length = str;
        this.setMax = str2;
        this.getMin = str3;
    }
}
