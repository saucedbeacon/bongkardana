package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/senddigitalmoney/model/CardPrefixQueryInfo;", "", "prefix", "", "(Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isScannerInDifferentProcess {
    @Nullable
    private final String prefix;

    public static /* synthetic */ isScannerInDifferentProcess copy$default(isScannerInDifferentProcess isscannerindifferentprocess, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = isscannerindifferentprocess.prefix;
        }
        return isscannerindifferentprocess.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.prefix;
    }

    @NotNull
    public final isScannerInDifferentProcess copy(@Nullable String str) {
        return new isScannerInDifferentProcess(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof isScannerInDifferentProcess) && Intrinsics.areEqual((Object) this.prefix, (Object) ((isScannerInDifferentProcess) obj).prefix);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.prefix;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPrefixQueryInfo(prefix=");
        sb.append(this.prefix);
        sb.append(")");
        return sb.toString();
    }

    public isScannerInDifferentProcess(@Nullable String str) {
        this.prefix = str;
    }

    @Nullable
    public final String getPrefix() {
        return this.prefix;
    }
}
