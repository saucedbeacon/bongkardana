package o;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b2\u0006\u0010\t\u001a\u00020\nH'J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/source/persistence/dao/FollowerDao;", "", "clearFollower", "", "getFollowerItemEntityList", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "getSelectedFollower", "Lio/reactivex/Observable;", "userId", "", "insertFollowerItem", "", "followerItemEntity", "(Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;)Ljava/lang/Long;", "insertFollowerItemList", "", "followerItemEntityList", "(Ljava/util/List;)[Ljava/lang/Long;", "updateModifiedRelation", "targetUserId", "modifiedRelation", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setSuccessScopes {
    @Query("DELETE FROM FollowerItemEntity")
    void clearFollower();

    @NotNull
    @Query("SELECT * FROM FollowerItemEntity ORDER BY nickName ASC")
    List<AuthSkipResultModel> getFollowerItemEntityList();

    @NotNull
    @Query("SELECT * FROM FollowerItemEntity WHERE userId = :userId")
    TitleBarRightButtonView.AnonymousClass1<List<AuthSkipResultModel>> getSelectedFollower(@NotNull String str);

    @Nullable
    @Insert(onConflict = 1)
    Long insertFollowerItem(@NotNull AuthSkipResultModel authSkipResultModel);

    @Nullable
    @Insert(onConflict = 1)
    Long[] insertFollowerItemList(@NotNull List<AuthSkipResultModel> list);

    @Query("UPDATE FollowerItemEntity SET status = :modifiedRelation WHERE userId = :targetUserId")
    void updateModifiedRelation(@NotNull String str, @NotNull String str2);
}
