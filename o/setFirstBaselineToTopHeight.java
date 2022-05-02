package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface setFirstBaselineToTopHeight {
    @Insert(onConflict = 5)
    void length(setPrompt setprompt);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> setMax(String str);
}
