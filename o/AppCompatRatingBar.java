package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface AppCompatRatingBar {
    @Query("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean length(String str);

    @Query("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean setMax(String str);

    @Query("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> setMin(String str);

    @Insert(onConflict = 5)
    void setMin(AppCompatSpinner appCompatSpinner);
}
