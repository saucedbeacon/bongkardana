package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MySegmentDao {
    @Query("SELECT user_key, segment_list, updated_at FROM my_segments WHERE user_key = :userKey")
    MySegmentEntity getByUserKeys(String str);

    @Insert(onConflict = 1)
    void update(MySegmentEntity mySegmentEntity);
}
