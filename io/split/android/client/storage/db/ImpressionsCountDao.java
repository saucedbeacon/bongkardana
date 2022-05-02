package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface ImpressionsCountDao {
    @Query("DELETE FROM impressions_count WHERE id IN (:ids)")
    void delete(List<Long> list);

    @Query("DELETE FROM impressions_count WHERE  status = :status AND created_at < :maxTimestamp AND EXISTS(SELECT 1 FROM impressions_count AS imp  WHERE imp.id = impressions_count.id LIMIT :maxRows)")
    int deleteByStatus(int i, long j, int i2);

    @Query("DELETE FROM impressions_count WHERE created_at < :timestamp")
    void deleteOutdated(long j);

    @Query("SELECT id, body, created_at, status FROM impressions_count WHERE created_at >= :timestamp AND status = :status ORDER BY created_at LIMIT :maxRows")
    List<ImpressionsCountEntity> getBy(long j, int i, int i2);

    @Insert
    void insert(ImpressionsCountEntity impressionsCountEntity);

    @Insert
    void insert(List<ImpressionsCountEntity> list);

    @Query("UPDATE impressions_count SET status = :status  WHERE id IN (:ids)")
    void updateStatus(List<Long> list, int i);
}
