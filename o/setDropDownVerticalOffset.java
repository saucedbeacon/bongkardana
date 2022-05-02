package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface setDropDownVerticalOffset {
    @Insert(onConflict = 1)
    void getMin(@NonNull getPopupContext getpopupcontext);

    @Nullable
    @Query("SELECT long_value FROM Preference where `key`=:key")
    Long setMin(@NonNull String str);
}
