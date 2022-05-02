package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lid/dana/data/autoroute/model/SecurityContextResult;", "", "pubKey", "", "(Ljava/lang/String;)V", "getPubKey", "()Ljava/lang/String;", "setPubKey", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getLastWidth {
    @Nullable
    private String pubKey;

    public getLastWidth() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getLastWidth copy$default(getLastWidth getlastwidth, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getlastwidth.pubKey;
        }
        return getlastwidth.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.pubKey;
    }

    @NotNull
    public final getLastWidth copy(@Nullable String str) {
        return new getLastWidth(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof getLastWidth) && Intrinsics.areEqual((Object) this.pubKey, (Object) ((getLastWidth) obj).pubKey);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.pubKey;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SecurityContextResult(pubKey=");
        sb.append(this.pubKey);
        sb.append(")");
        return sb.toString();
    }

    public getLastWidth(@Nullable String str) {
        this.pubKey = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getLastWidth(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Nullable
    public final String getPubKey() {
        return this.pubKey;
    }

    public final void setPubKey(@Nullable String str) {
        this.pubKey = str;
    }
}
