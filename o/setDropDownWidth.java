package o;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface setDropDownWidth {
    @Insert(onConflict = 5)
    void getMax(setDropDownHorizontalOffset setdropdownhorizontaloffset);

    @NonNull
    @Query("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> setMax(@NonNull String str);
}
