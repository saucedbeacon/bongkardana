package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/source/persistence/dao/FollowingDao;", "", "clearFollowing", "", "getFollowingItemEntityList", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "getSelectedFollowing", "Lio/reactivex/Observable;", "userId", "", "insertFollowingItem", "followingItemEntity", "insertFollowingItemList", "followingItemEntityList", "updateModifiedRelation", "targetUserId", "modifiedRelation", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setCanSkipAuth {
    @Query("DELETE FROM FollowingItemEntity")
    void clearFollowing();

    @NotNull
    @Query("SELECT * FROM FollowingItemEntity ORDER BY nickName ASC")
    List<setShowType> getFollowingItemEntityList();

    @NotNull
    @Query("SELECT * FROM FollowingItemEntity WHERE userId = :userId")
    TitleBarRightButtonView.AnonymousClass1<List<setShowType>> getSelectedFollowing(@NotNull String str);

    @Insert(onConflict = 1)
    void insertFollowingItem(@NotNull setShowType setshowtype);

    @Insert(onConflict = 1)
    void insertFollowingItemList(@NotNull List<setShowType> list);

    @Query("UPDATE FollowingItemEntity SET status = :modifiedRelation WHERE userId = :targetUserId")
    void updateModifiedRelation(@NotNull String str, @NotNull String str2);
}
