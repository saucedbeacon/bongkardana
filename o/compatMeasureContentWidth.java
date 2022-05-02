package o;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.work.WorkInfo;
import java.util.List;
import o.getInternalPopup;

@Dao
@SuppressLint({"UnknownNullness"})
public interface compatMeasureContentWidth {
    @Transaction
    @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    LiveData<List<getInternalPopup.length>> IsOverlapping(String str);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> equals(@NonNull String str);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<getInternalPopup> getMax();

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<getInternalPopup.setMax> getMax(String str);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int getMin(@NonNull String str, long j);

    @Query("SELECT * FROM workspec WHERE state=1")
    List<getInternalPopup> getMin();

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<getInternalPopup> getMin(int i);

    @Query("DELETE FROM workspec WHERE id=:id")
    void getMin(String str);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void getMin(String str, updateAppearance updateappearance);

    @Transaction
    @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<getInternalPopup.length> isInside(String str);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> length();

    @Query("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    List<getInternalPopup> length(long j);

    @Query("SELECT * FROM workspec WHERE id=:id")
    getInternalPopup length(String str);

    @Query("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void length(String str, long j);

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int setMax(String str);

    @Query("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    List<getInternalPopup> setMax();

    @Insert(onConflict = 5)
    void setMax(getInternalPopup getinternalpopup);

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int setMin();

    @Query("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int setMin(WorkInfo.State state, String... strArr);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int setMin(String str);

    @Query("SELECT state FROM workspec WHERE id=:id")
    WorkInfo.State toFloatRange(String str);

    @Query("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<updateAppearance> toIntRange(String str);
}
