package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0010\u001a\u00020\tH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lid/dana/data/geofence/repository/source/persistence/dao/GeofenceDao;", "", "getAllPois", "", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "hasNotifiedToday", "poiId", "", "now", "", "insertPois", "", "poiEntities", "updateLastNotification", "", "poiIds", "date", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface showLoading {
    @NotNull
    @Query("SELECT * FROM RecentPoiEntity")
    List<PageShowLoadingPoint> getAllPois();

    @NotNull
    @Query("SELECT * FROM RecentPoiEntity WHERE poiId = :poiId AND lastPoiNotified = :now LIMIT 1")
    List<PageShowLoadingPoint> hasNotifiedToday(@NotNull String str, long j);

    @NotNull
    @Insert(onConflict = 1)
    long[] insertPois(@NotNull List<PageShowLoadingPoint> list);

    @Query("UPDATE RecentPoiEntity SET lastPoiNotified = :date WHERE poiId IN (:poiIds)")
    int updateLastNotification(@NotNull List<String> list, long j);
}
