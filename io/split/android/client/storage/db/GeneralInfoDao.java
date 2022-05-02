package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface GeneralInfoDao {
    @Query("SELECT name, stringValue, longValue, updated_at FROM general_info WHERE name = :name")
    GeneralInfoEntity getByName(String str);

    @Insert(onConflict = 1)
    void update(GeneralInfoEntity generalInfoEntity);
}
