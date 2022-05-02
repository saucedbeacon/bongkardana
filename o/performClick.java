package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = getInternalPopup.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
public final class performClick {
    @ColumnInfo(name = "work_spec_id")
    @NonNull
    @PrimaryKey
    public final String getMax;
    @ColumnInfo(name = "progress")
    @NonNull
    public final updateAppearance getMin;

    public performClick(@NonNull String str, @NonNull updateAppearance updateappearance) {
        this.getMax = str;
        this.getMin = updateappearance;
    }
}
