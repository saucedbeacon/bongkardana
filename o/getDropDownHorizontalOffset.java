package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface getDropDownHorizontalOffset {
    @Query("DELETE FROM WorkProgress")
    void getMax();

    @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void getMax(@NonNull String str);

    @Insert(onConflict = 1)
    void setMin(@NonNull performClick performclick);
}
