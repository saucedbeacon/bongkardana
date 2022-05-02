package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = getInternalPopup.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
public final class getDropDownVerticalOffset {
    @ColumnInfo(name = "system_id")
    public final int getMax;
    @ColumnInfo(name = "work_spec_id")
    @NonNull
    @PrimaryKey
    public final String length;

    public getDropDownVerticalOffset(@NonNull String str, int i) {
        this.length = str;
        this.getMax = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDropDownVerticalOffset)) {
            return false;
        }
        getDropDownVerticalOffset getdropdownverticaloffset = (getDropDownVerticalOffset) obj;
        if (this.getMax != getdropdownverticaloffset.getMax) {
            return false;
        }
        return this.length.equals(getdropdownverticaloffset.length);
    }

    public final int hashCode() {
        return (this.length.hashCode() * 31) + this.getMax;
    }
}
