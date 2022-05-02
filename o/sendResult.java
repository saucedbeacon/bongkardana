package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/data/social/model/ReactionCountResult;", "", "kind", "", "count", "", "(Ljava/lang/String;I)V", "getCount", "()I", "getKind", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toReactionCount", "Lid/dana/domain/social/model/ReactionCount;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendResult {
    private final int count;
    @NotNull
    private final String kind;

    public static /* synthetic */ sendResult copy$default(sendResult sendresult, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sendresult.kind;
        }
        if ((i2 & 2) != 0) {
            i = sendresult.count;
        }
        return sendresult.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.kind;
    }

    public final int component2() {
        return this.count;
    }

    @NotNull
    public final sendResult copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "kind");
        return new sendResult(str, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendResult)) {
            return false;
        }
        sendResult sendresult = (sendResult) obj;
        return Intrinsics.areEqual((Object) this.kind, (Object) sendresult.kind) && this.count == sendresult.count;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionCountResult(kind=");
        sb.append(this.kind);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(")");
        return sb.toString();
    }

    public sendResult(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "kind");
        this.kind = str;
        this.count = i;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final stopAndroidOBackgroundScan toReactionCount() {
        return new stopAndroidOBackgroundScan(this.kind, this.count);
    }

    public final int hashCode() {
        String str = this.kind;
        return ((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.count).hashCode();
    }
}
