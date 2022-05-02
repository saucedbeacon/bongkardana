package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class sendNetworkError implements exitRemoteDebug {
    private final RoomDatabase __db;
    private final setHeaderTitle<RemoteDebugUtils> __insertionAdapterOfRecentPayerSplitBillEntity;
    private final startActionModeForChild __preparedStmtOfDeleteOldRecentPayer;
    private final startActionModeForChild __preparedStmtOfRemoveAllRecentContact;
    private final setHeaderIcon<RemoteDebugUtils> __updateAdapterOfRecentPayerSplitBillEntity;

    public sendNetworkError(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfRecentPayerSplitBillEntity = new setHeaderTitle<RemoteDebugUtils>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR ABORT INTO `RecentPayerSplitBillEntity` (`uid`,`userId`,`userPhoneNumber`,`userNickname`,`avatar`,`lastUpdated`,`shownName`,`shownNumber`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                RemoteDebugUtils remoteDebugUtils = (RemoteDebugUtils) obj;
                supportSQLiteStatement.bindLong(1, (long) remoteDebugUtils.getUid());
                if (remoteDebugUtils.getUserId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, remoteDebugUtils.getUserId());
                }
                if (remoteDebugUtils.getUserPhoneNumber() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, remoteDebugUtils.getUserPhoneNumber());
                }
                if (remoteDebugUtils.getUserNickname() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, remoteDebugUtils.getUserNickname());
                }
                if (remoteDebugUtils.getAvatar() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, remoteDebugUtils.getAvatar());
                }
                supportSQLiteStatement.bindLong(6, remoteDebugUtils.getLastUpdated());
                if (remoteDebugUtils.getShownName() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, remoteDebugUtils.getShownName());
                }
                if (remoteDebugUtils.getShownNumber() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, remoteDebugUtils.getShownNumber());
                }
            }
        };
        this.__updateAdapterOfRecentPayerSplitBillEntity = new setHeaderIcon<RemoteDebugUtils>(roomDatabase) {
            public final String createQuery() {
                return "UPDATE OR ABORT `RecentPayerSplitBillEntity` SET `uid` = ?,`userId` = ?,`userPhoneNumber` = ?,`userNickname` = ?,`avatar` = ?,`lastUpdated` = ?,`shownName` = ?,`shownNumber` = ? WHERE `uid` = ?";
            }

            public final /* synthetic */ void setMax(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                RemoteDebugUtils remoteDebugUtils = (RemoteDebugUtils) obj;
                supportSQLiteStatement.bindLong(1, (long) remoteDebugUtils.getUid());
                if (remoteDebugUtils.getUserId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, remoteDebugUtils.getUserId());
                }
                if (remoteDebugUtils.getUserPhoneNumber() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, remoteDebugUtils.getUserPhoneNumber());
                }
                if (remoteDebugUtils.getUserNickname() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, remoteDebugUtils.getUserNickname());
                }
                if (remoteDebugUtils.getAvatar() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, remoteDebugUtils.getAvatar());
                }
                supportSQLiteStatement.bindLong(6, remoteDebugUtils.getLastUpdated());
                if (remoteDebugUtils.getShownName() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, remoteDebugUtils.getShownName());
                }
                if (remoteDebugUtils.getShownNumber() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, remoteDebugUtils.getShownNumber());
                }
                supportSQLiteStatement.bindLong(9, (long) remoteDebugUtils.getUid());
            }
        };
        this.__preparedStmtOfDeleteOldRecentPayer = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM RecentPayerSplitBillEntity where uid NOT IN (SELECT uid from RecentPayerSplitBillEntity ORDER BY lastUpdated DESC LIMIT 10)";
            }
        };
        this.__preparedStmtOfRemoveAllRecentContact = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM RecentPayerSplitBillEntity";
            }
        };
    }

    public final Long saveRecentContactSplitBill(RemoteDebugUtils remoteDebugUtils) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfRecentPayerSplitBillEntity.insertAndReturnId(remoteDebugUtils);
            this.__db.setTransactionSuccessful();
            return Long.valueOf(insertAndReturnId);
        } finally {
            this.__db.endTransaction();
        }
    }

    public final int updateRecentContact(RemoteDebugUtils remoteDebugUtils) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int min = this.__updateAdapterOfRecentPayerSplitBillEntity.setMin(remoteDebugUtils) + 0;
            this.__db.setTransactionSuccessful();
            return min;
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void deleteOldRecentPayer() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteOldRecentPayer.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteOldRecentPayer.release(acquire);
        }
    }

    public final void removeAllRecentContact() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfRemoveAllRecentContact.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveAllRecentContact.release(acquire);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: o.RemoteDebugUtils} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.RemoteDebugUtils getRecentContactByPhoneNumber(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r1 = "SELECT * FROM RecentPayerSplitBillEntity WHERE userPhoneNumber = ?"
            o.setSplitBackground r1 = o.setSplitBackground.setMax(r1, r0)
            if (r12 != 0) goto L_0x000d
            r1.bindNull(r0)
            goto L_0x0010
        L_0x000d:
            r1.bindString(r0, r12)
        L_0x0010:
            androidx.room.RoomDatabase r12 = r11.__db
            r12.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r12 = r11.__db
            r0 = 0
            android.database.Cursor r12 = o.setSubtitle.getMax(r12, r1, r0)
            java.lang.String r0 = "uid"
            int r0 = o.getTitle.setMax(r12, r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "userId"
            int r2 = o.getTitle.setMax(r12, r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = "userPhoneNumber"
            int r3 = o.getTitle.setMax(r12, r3)     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "userNickname"
            int r4 = o.getTitle.setMax(r12, r4)     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = "avatar"
            int r5 = o.getTitle.setMax(r12, r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = "lastUpdated"
            int r6 = o.getTitle.setMax(r12, r6)     // Catch:{ all -> 0x00c7 }
            java.lang.String r7 = "shownName"
            int r7 = o.getTitle.setMax(r12, r7)     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = "shownNumber"
            int r8 = o.getTitle.setMax(r12, r8)     // Catch:{ all -> 0x00c7 }
            boolean r9 = r12.moveToFirst()     // Catch:{ all -> 0x00c7 }
            r10 = 0
            if (r9 == 0) goto L_0x00c0
            o.RemoteDebugUtils r9 = new o.RemoteDebugUtils     // Catch:{ all -> 0x00c7 }
            r9.<init>()     // Catch:{ all -> 0x00c7 }
            int r0 = r12.getInt(r0)     // Catch:{ all -> 0x00c7 }
            r9.setUid(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r2)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0067
            r0 = r10
            goto L_0x006b
        L_0x0067:
            java.lang.String r0 = r12.getString(r2)     // Catch:{ all -> 0x00c7 }
        L_0x006b:
            r9.setUserId(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r3)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0076
            r0 = r10
            goto L_0x007a
        L_0x0076:
            java.lang.String r0 = r12.getString(r3)     // Catch:{ all -> 0x00c7 }
        L_0x007a:
            r9.setUserPhoneNumber(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r4)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0085
            r0 = r10
            goto L_0x0089
        L_0x0085:
            java.lang.String r0 = r12.getString(r4)     // Catch:{ all -> 0x00c7 }
        L_0x0089:
            r9.setUserNickname(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r5)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0094
            r0 = r10
            goto L_0x0098
        L_0x0094:
            java.lang.String r0 = r12.getString(r5)     // Catch:{ all -> 0x00c7 }
        L_0x0098:
            r9.setAvatar(r0)     // Catch:{ all -> 0x00c7 }
            long r2 = r12.getLong(r6)     // Catch:{ all -> 0x00c7 }
            r9.setLastUpdated(r2)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r7)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00aa
            r0 = r10
            goto L_0x00ae
        L_0x00aa:
            java.lang.String r0 = r12.getString(r7)     // Catch:{ all -> 0x00c7 }
        L_0x00ae:
            r9.setShownName(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r8)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            java.lang.String r10 = r12.getString(r8)     // Catch:{ all -> 0x00c7 }
        L_0x00bc:
            r9.setShownNumber(r10)     // Catch:{ all -> 0x00c7 }
            r10 = r9
        L_0x00c0:
            r12.close()
            r1.getMin()
            return r10
        L_0x00c7:
            r0 = move-exception
            r12.close()
            r1.getMin()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendNetworkError.getRecentContactByPhoneNumber(java.lang.String):o.RemoteDebugUtils");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: o.RemoteDebugUtils} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.RemoteDebugUtils getRecentContactByUserId(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r1 = "SELECT * FROM RecentPayerSplitBillEntity WHERE userId = ?"
            o.setSplitBackground r1 = o.setSplitBackground.setMax(r1, r0)
            if (r12 != 0) goto L_0x000d
            r1.bindNull(r0)
            goto L_0x0010
        L_0x000d:
            r1.bindString(r0, r12)
        L_0x0010:
            androidx.room.RoomDatabase r12 = r11.__db
            r12.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r12 = r11.__db
            r0 = 0
            android.database.Cursor r12 = o.setSubtitle.getMax(r12, r1, r0)
            java.lang.String r0 = "uid"
            int r0 = o.getTitle.setMax(r12, r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "userId"
            int r2 = o.getTitle.setMax(r12, r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = "userPhoneNumber"
            int r3 = o.getTitle.setMax(r12, r3)     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "userNickname"
            int r4 = o.getTitle.setMax(r12, r4)     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = "avatar"
            int r5 = o.getTitle.setMax(r12, r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = "lastUpdated"
            int r6 = o.getTitle.setMax(r12, r6)     // Catch:{ all -> 0x00c7 }
            java.lang.String r7 = "shownName"
            int r7 = o.getTitle.setMax(r12, r7)     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = "shownNumber"
            int r8 = o.getTitle.setMax(r12, r8)     // Catch:{ all -> 0x00c7 }
            boolean r9 = r12.moveToFirst()     // Catch:{ all -> 0x00c7 }
            r10 = 0
            if (r9 == 0) goto L_0x00c0
            o.RemoteDebugUtils r9 = new o.RemoteDebugUtils     // Catch:{ all -> 0x00c7 }
            r9.<init>()     // Catch:{ all -> 0x00c7 }
            int r0 = r12.getInt(r0)     // Catch:{ all -> 0x00c7 }
            r9.setUid(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r2)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0067
            r0 = r10
            goto L_0x006b
        L_0x0067:
            java.lang.String r0 = r12.getString(r2)     // Catch:{ all -> 0x00c7 }
        L_0x006b:
            r9.setUserId(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r3)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0076
            r0 = r10
            goto L_0x007a
        L_0x0076:
            java.lang.String r0 = r12.getString(r3)     // Catch:{ all -> 0x00c7 }
        L_0x007a:
            r9.setUserPhoneNumber(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r4)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0085
            r0 = r10
            goto L_0x0089
        L_0x0085:
            java.lang.String r0 = r12.getString(r4)     // Catch:{ all -> 0x00c7 }
        L_0x0089:
            r9.setUserNickname(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r5)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0094
            r0 = r10
            goto L_0x0098
        L_0x0094:
            java.lang.String r0 = r12.getString(r5)     // Catch:{ all -> 0x00c7 }
        L_0x0098:
            r9.setAvatar(r0)     // Catch:{ all -> 0x00c7 }
            long r2 = r12.getLong(r6)     // Catch:{ all -> 0x00c7 }
            r9.setLastUpdated(r2)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r7)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00aa
            r0 = r10
            goto L_0x00ae
        L_0x00aa:
            java.lang.String r0 = r12.getString(r7)     // Catch:{ all -> 0x00c7 }
        L_0x00ae:
            r9.setShownName(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r12.isNull(r8)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            java.lang.String r10 = r12.getString(r8)     // Catch:{ all -> 0x00c7 }
        L_0x00bc:
            r9.setShownNumber(r10)     // Catch:{ all -> 0x00c7 }
            r10 = r9
        L_0x00c0:
            r12.close()
            r1.getMin()
            return r10
        L_0x00c7:
            r0 = move-exception
            r12.close()
            r1.getMin()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendNetworkError.getRecentContactByUserId(java.lang.String):o.RemoteDebugUtils");
    }

    public final List<RemoteDebugUtils> getSomeRecentPayer(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM RecentPayerSplitBillEntity ORDER BY lastUpdated DESC LIMIT ?", 1);
        max.bindLong(1, (long) i);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "uid");
            int max4 = getTitle.setMax(max2, "userId");
            int max5 = getTitle.setMax(max2, "userPhoneNumber");
            int max6 = getTitle.setMax(max2, "userNickname");
            int max7 = getTitle.setMax(max2, "avatar");
            int max8 = getTitle.setMax(max2, "lastUpdated");
            int max9 = getTitle.setMax(max2, "shownName");
            int max10 = getTitle.setMax(max2, "shownNumber");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                RemoteDebugUtils remoteDebugUtils = new RemoteDebugUtils();
                remoteDebugUtils.setUid(max2.getInt(max3));
                if (max2.isNull(max4)) {
                    str = null;
                } else {
                    str = max2.getString(max4);
                }
                remoteDebugUtils.setUserId(str);
                if (max2.isNull(max5)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max5);
                }
                remoteDebugUtils.setUserPhoneNumber(str2);
                if (max2.isNull(max6)) {
                    str3 = null;
                } else {
                    str3 = max2.getString(max6);
                }
                remoteDebugUtils.setUserNickname(str3);
                if (max2.isNull(max7)) {
                    str4 = null;
                } else {
                    str4 = max2.getString(max7);
                }
                remoteDebugUtils.setAvatar(str4);
                remoteDebugUtils.setLastUpdated(max2.getLong(max8));
                if (max2.isNull(max9)) {
                    str5 = null;
                } else {
                    str5 = max2.getString(max9);
                }
                remoteDebugUtils.setShownName(str5);
                if (max2.isNull(max10)) {
                    str6 = null;
                } else {
                    str6 = max2.getString(max10);
                }
                remoteDebugUtils.setShownNumber(str6);
                arrayList.add(remoteDebugUtils);
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
