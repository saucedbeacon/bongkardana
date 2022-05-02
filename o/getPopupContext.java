package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Entity
public final class getPopupContext {
    @ColumnInfo(name = "long_value")
    @Nullable
    public Long length;
    @ColumnInfo(name = "key")
    @NonNull
    @PrimaryKey
    public String setMax;

    public getPopupContext(@NonNull String str) {
        this(str, 0);
    }

    public getPopupContext(@NonNull String str, long j) {
        this.setMax = str;
        this.length = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPopupContext)) {
            return false;
        }
        getPopupContext getpopupcontext = (getPopupContext) obj;
        if (!this.setMax.equals(getpopupcontext.setMax)) {
            return false;
        }
        Long l = this.length;
        Long l2 = getpopupcontext.length;
        if (l != null) {
            return l.equals(l2);
        }
        return l2 == null;
    }

    public final int hashCode() {
        int hashCode = this.setMax.hashCode() * 31;
        Long l = this.length;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
