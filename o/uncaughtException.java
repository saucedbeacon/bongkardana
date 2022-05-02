package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/domain/kycrenewal/model/ShowDialogPreference;", "", "show", "", "timeStamp", "", "(ZJ)V", "getShow", "()Z", "getTimeStamp", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class uncaughtException {
    private final boolean show;
    private final long timeStamp;

    public static /* synthetic */ uncaughtException copy$default(uncaughtException uncaughtexception, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uncaughtexception.show;
        }
        if ((i & 2) != 0) {
            j = uncaughtexception.timeStamp;
        }
        return uncaughtexception.copy(z, j);
    }

    public final boolean component1() {
        return this.show;
    }

    public final long component2() {
        return this.timeStamp;
    }

    @NotNull
    public final uncaughtException copy(boolean z, long j) {
        return new uncaughtException(z, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uncaughtException)) {
            return false;
        }
        uncaughtException uncaughtexception = (uncaughtException) obj;
        return this.show == uncaughtexception.show && this.timeStamp == uncaughtexception.timeStamp;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowDialogPreference(show=");
        sb.append(this.show);
        sb.append(", timeStamp=");
        sb.append(this.timeStamp);
        sb.append(")");
        return sb.toString();
    }

    public uncaughtException(boolean z, long j) {
        this.show = z;
        this.timeStamp = j;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int hashCode() {
        boolean z = this.show;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + Long.valueOf(this.timeStamp).hashCode();
    }
}
