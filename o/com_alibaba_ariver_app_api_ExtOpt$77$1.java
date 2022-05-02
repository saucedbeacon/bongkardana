package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/data/loyalty/repository/source/local/dao/LoyaltyReceiptDao;", "", "deleteReceipt", "", "userLoyaltyId", "", "getReceiptByUserLoyaltyId", "Lid/dana/data/loyalty/repository/source/local/entity/LoyaltyReceiptEntity;", "insertReceipt", "", "loyaltyReceiptEntity", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface com_alibaba_ariver_app_api_ExtOpt$77$1 {
    @Query("DELETE FROM LoyaltyReceiptEntity WHERE userLoyaltyId = :userLoyaltyId")
    int deleteReceipt(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM LoyaltyReceiptEntity WHERE userLoyaltyId = :userLoyaltyId")
    com_alibaba_ariver_app_api_ExtOpt$80$1 getReceiptByUserLoyaltyId(@NotNull String str);

    @Insert(onConflict = 1)
    long insertReceipt(@NotNull com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1);
}
