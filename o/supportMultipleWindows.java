package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lid/dana/domain/electronicmoney/model/response/EmoneyGenerateTransId;", "", "bizId", "", "(Ljava/lang/String;)V", "getBizId", "()Ljava/lang/String;", "setBizId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class supportMultipleWindows {
    @NotNull
    private String bizId;

    public supportMultipleWindows() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ supportMultipleWindows copy$default(supportMultipleWindows supportmultiplewindows, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportmultiplewindows.bizId;
        }
        return supportmultiplewindows.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.bizId;
    }

    @NotNull
    public final supportMultipleWindows copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "bizId");
        return new supportMultipleWindows(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof supportMultipleWindows) && Intrinsics.areEqual((Object) this.bizId, (Object) ((supportMultipleWindows) obj).bizId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.bizId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyGenerateTransId(bizId=");
        sb.append(this.bizId);
        sb.append(")");
        return sb.toString();
    }

    public supportMultipleWindows(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "bizId");
        this.bizId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ supportMultipleWindows(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @NotNull
    public final String getBizId() {
        return this.bizId;
    }

    public final void setBizId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bizId = str;
    }
}
