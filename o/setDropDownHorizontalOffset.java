package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = getInternalPopup.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
public final class setDropDownHorizontalOffset {
    @ColumnInfo(name = "name")
    @NonNull
    public final String getMax;
    @ColumnInfo(name = "work_spec_id")
    @NonNull
    public final String getMin;

    public setDropDownHorizontalOffset(@NonNull String str, @NonNull String str2) {
        this.getMax = str;
        this.getMin = str2;
    }
}
