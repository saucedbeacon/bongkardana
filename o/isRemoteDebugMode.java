package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface isRemoteDebugMode {
    @Query("DELETE FROM SplitBillHistoryEntity")
    void clearAll();

    @Query("DELETE FROM SplitBillHistoryEntity where uid NOT IN (SELECT uid from SplitBillHistoryEntity ORDER BY uid DESC LIMIT 10)")
    void deleteOldSplitBillHistories();

    @Query("SELECT * FROM SplitBillHistoryEntity WHERE splitBillId = :splitBillId")
    sendNetworkResponse getHistoryById(String str);

    @Query("SELECT * FROM SplitBillHistoryEntity ORDER BY lastUpdated DESC LIMIT 10 ")
    List<sendNetworkResponse> getSplitBillHistories();

    @Insert
    Long saveSplitBillHistory(sendNetworkResponse sendnetworkresponse);

    @Update
    int updateSplitBillHistoryEntity(sendNetworkResponse sendnetworkresponse);
}
