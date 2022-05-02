package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import id.dana.data.constant.BranchLinkConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public final class getCanSkipAuth implements setSuccessScopes {
    /* access modifiers changed from: private */
    public final RoomDatabase __db;
    private final setHeaderTitle<AuthSkipResultModel> __insertionAdapterOfFollowerItemEntity;
    private final startActionModeForChild __preparedStmtOfClearFollower;
    private final startActionModeForChild __preparedStmtOfUpdateModifiedRelation;

    public getCanSkipAuth(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfFollowerItemEntity = new setHeaderTitle<AuthSkipResultModel>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `FollowerItemEntity` (`userId`,`loginId`,`nickName`,`status`,`gmtCreate`,`gmtModified`,`avatar`,`username`) VALUES (?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                AuthSkipResultModel authSkipResultModel = (AuthSkipResultModel) obj;
                if (authSkipResultModel.getUserId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, authSkipResultModel.getUserId());
                }
                if (authSkipResultModel.getLoginId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, authSkipResultModel.getLoginId());
                }
                if (authSkipResultModel.getNickName() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, authSkipResultModel.getNickName());
                }
                if (authSkipResultModel.getStatus() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, authSkipResultModel.getStatus());
                }
                supportSQLiteStatement.bindLong(5, authSkipResultModel.getGmtCreate());
                supportSQLiteStatement.bindLong(6, authSkipResultModel.getGmtModified());
                if (authSkipResultModel.getAvatar() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, authSkipResultModel.getAvatar());
                }
                if (authSkipResultModel.getUsername() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, authSkipResultModel.getUsername());
                }
            }
        };
        this.__preparedStmtOfUpdateModifiedRelation = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "UPDATE FollowerItemEntity SET status = ? WHERE userId = ?";
            }
        };
        this.__preparedStmtOfClearFollower = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM FollowerItemEntity";
            }
        };
    }

    public final Long insertFollowerItem(AuthSkipResultModel authSkipResultModel) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfFollowerItemEntity.insertAndReturnId(authSkipResultModel);
            this.__db.setTransactionSuccessful();
            return Long.valueOf(insertAndReturnId);
        } finally {
            this.__db.endTransaction();
        }
    }

    public final Long[] insertFollowerItemList(List<AuthSkipResultModel> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Long[] insertAndReturnIdsArrayBox = this.__insertionAdapterOfFollowerItemEntity.insertAndReturnIdsArrayBox(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsArrayBox;
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void updateModifiedRelation(String str, String str2) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateModifiedRelation.acquire();
        if (str2 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str2);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateModifiedRelation.release(acquire);
        }
    }

    public final void clearFollower() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfClearFollower.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfClearFollower.release(acquire);
        }
    }

    public final List<AuthSkipResultModel> getFollowerItemEntityList() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM FollowerItemEntity ORDER BY nickName ASC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "userId");
            int max4 = getTitle.setMax(max2, BranchLinkConstant.Params.LOGIN_ID);
            int max5 = getTitle.setMax(max2, "nickName");
            int max6 = getTitle.setMax(max2, "status");
            int max7 = getTitle.setMax(max2, "gmtCreate");
            int max8 = getTitle.setMax(max2, "gmtModified");
            int max9 = getTitle.setMax(max2, "avatar");
            int max10 = getTitle.setMax(max2, setBuildNumber.USERNAME_KEY);
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                String str6 = null;
                if (max2.isNull(max3)) {
                    str = null;
                } else {
                    str = max2.getString(max3);
                }
                if (max2.isNull(max4)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max4);
                }
                if (max2.isNull(max5)) {
                    str3 = null;
                } else {
                    str3 = max2.getString(max5);
                }
                if (max2.isNull(max6)) {
                    str4 = null;
                } else {
                    str4 = max2.getString(max6);
                }
                long j = max2.getLong(max7);
                long j2 = max2.getLong(max8);
                if (max2.isNull(max9)) {
                    str5 = null;
                } else {
                    str5 = max2.getString(max9);
                }
                if (!max2.isNull(max10)) {
                    str6 = max2.getString(max10);
                }
                arrayList.add(new AuthSkipResultModel(str, str2, str3, str4, j, j2, str5, str6));
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final TitleBarRightButtonView.AnonymousClass1<List<AuthSkipResultModel>> getSelectedFollower(String str) {
        final setSplitBackground max = setSplitBackground.setMax("SELECT * FROM FollowerItemEntity WHERE userId = ?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        return setTabContainer.setMin(this.__db, new String[]{"FollowerItemEntity"}, new Callable<List<AuthSkipResultModel>>() {
            /* access modifiers changed from: private */
            /* renamed from: getMin */
            public List<AuthSkipResultModel> call() throws Exception {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Cursor max = setSubtitle.getMax(getCanSkipAuth.this.__db, max, false);
                try {
                    int max2 = getTitle.setMax(max, "userId");
                    int max3 = getTitle.setMax(max, BranchLinkConstant.Params.LOGIN_ID);
                    int max4 = getTitle.setMax(max, "nickName");
                    int max5 = getTitle.setMax(max, "status");
                    int max6 = getTitle.setMax(max, "gmtCreate");
                    int max7 = getTitle.setMax(max, "gmtModified");
                    int max8 = getTitle.setMax(max, "avatar");
                    int max9 = getTitle.setMax(max, setBuildNumber.USERNAME_KEY);
                    ArrayList arrayList = new ArrayList(max.getCount());
                    while (max.moveToNext()) {
                        String str6 = null;
                        if (max.isNull(max2)) {
                            str = null;
                        } else {
                            str = max.getString(max2);
                        }
                        if (max.isNull(max3)) {
                            str2 = null;
                        } else {
                            str2 = max.getString(max3);
                        }
                        if (max.isNull(max4)) {
                            str3 = null;
                        } else {
                            str3 = max.getString(max4);
                        }
                        if (max.isNull(max5)) {
                            str4 = null;
                        } else {
                            str4 = max.getString(max5);
                        }
                        long j = max.getLong(max6);
                        long j2 = max.getLong(max7);
                        if (max.isNull(max8)) {
                            str5 = null;
                        } else {
                            str5 = max.getString(max8);
                        }
                        if (!max.isNull(max9)) {
                            str6 = max.getString(max9);
                        }
                        arrayList.add(new AuthSkipResultModel(str, str2, str3, str4, j, j2, str5, str6));
                    }
                    return arrayList;
                } finally {
                    max.close();
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                max.getMin();
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
