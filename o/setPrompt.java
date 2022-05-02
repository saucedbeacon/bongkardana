package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = getInternalPopup.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
public final class setPrompt {
    @ColumnInfo(name = "tag")
    @NonNull
    public final String getMax;
    @ColumnInfo(name = "work_spec_id")
    @NonNull
    public final String setMin;

    public setPrompt(@NonNull String str, @NonNull String str2) {
        this.getMax = str;
        this.setMin = str2;
    }
}
