package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface exitRemoteDebug {
    @Query("DELETE FROM RecentPayerSplitBillEntity where uid NOT IN (SELECT uid from RecentPayerSplitBillEntity ORDER BY lastUpdated DESC LIMIT 10)")
    void deleteOldRecentPayer();

    @Query("SELECT * FROM RecentPayerSplitBillEntity WHERE userPhoneNumber = :userPhoneNumber")
    RemoteDebugUtils getRecentContactByPhoneNumber(String str);

    @Query("SELECT * FROM RecentPayerSplitBillEntity WHERE userId = :userId")
    RemoteDebugUtils getRecentContactByUserId(String str);

    @Query("SELECT * FROM RecentPayerSplitBillEntity ORDER BY lastUpdated DESC LIMIT :maxRecentRecipient")
    List<RemoteDebugUtils> getSomeRecentPayer(int i);

    @Query("DELETE FROM RecentPayerSplitBillEntity")
    void removeAllRecentContact();

    @Insert
    Long saveRecentContactSplitBill(RemoteDebugUtils remoteDebugUtils);

    @Update
    int updateRecentContact(RemoteDebugUtils remoteDebugUtils);
}
