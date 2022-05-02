package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface setPopupBackgroundResource {
    @Insert(onConflict = 1)
    void getMax(@NonNull getDropDownVerticalOffset getdropdownverticaloffset);

    @NonNull
    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> getMin();

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void setMax(@NonNull String str);

    @Nullable
    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    getDropDownVerticalOffset setMin(@NonNull String str);
}
