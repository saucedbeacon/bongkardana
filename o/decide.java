package o;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface decide {
    @Query("SELECT * FROM SecureRecentBankEntity ORDER BY alias ASC")
    List<RemoteNormalExtensionInvoker> getListRecentBank();

    @Query("SELECT * FROM SecureRecentBankEntity WHERE alias LIKE '%' || :filter || '%' OR bankName LIKE '%' || :filter || '%' OR bankNumber LIKE '%' || :filter || '%' OR instLocalName LIKE '%' || :filter || '%' ORDER BY alias ASC LIMIT :maxRecentRecipient")
    List<RemoteNormalExtensionInvoker> getListRecentBank(String str, int i);

    @Query("SELECT * FROM SecureRecentBankEntity ORDER BY CASE WHEN :isAsc = 1 THEN lastUpdated END ASC,CASE WHEN :isAsc = 0 THEN lastUpdated END DESC")
    List<RemoteNormalExtensionInvoker> getListRecentBankByLastUpdate(boolean z);

    @Query("SELECT * from SecureRecentBankEntity ORDER BY CASE WHEN :isAsc = 1 THEN transactionCount END ASC, CASE WHEN :isAsc = 0 THEN transactionCount END DESC")
    List<RemoteNormalExtensionInvoker> getListRecentBankByTransactionCount(boolean z);

    @Query("SELECT * FROM RecentBankEntity ORDER BY alias ASC")
    List<InvokeException> getOldListRecentBank();

    @Insert(onConflict = 1)
    Long insertOrUpdateRecentBank(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker);

    @Insert(onConflict = 1)
    Long[] insertOrUpdateRecentBank(List<RemoteNormalExtensionInvoker> list);

    @Query("DELETE FROM SecureRecentBankEntity")
    void removeAllRecentBank();

    @Delete
    void removeSingleRecentBank(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker);
}
