package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class sendStorage implements isRemoteDebugMode {
    private final RoomDatabase __db;
    private final setHeaderTitle<sendNetworkResponse> __insertionAdapterOfSplitBillHistoryEntity;
    private final startActionModeForChild __preparedStmtOfClearAll;
    private final startActionModeForChild __preparedStmtOfDeleteOldSplitBillHistories;
    private final setHeaderIcon<sendNetworkResponse> __updateAdapterOfSplitBillHistoryEntity;

    public sendStorage(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSplitBillHistoryEntity = new setHeaderTitle<sendNetworkResponse>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR ABORT INTO `SplitBillHistoryEntity` (`uid`,`comment`,`deepLinkUrl`,`payers`,`lastUpdated`,`splitBillId`,`createdDate`,`status`,`totalAmount`,`payeeIndex`,`payerIndex`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                sendNetworkResponse sendnetworkresponse = (sendNetworkResponse) obj;
                supportSQLiteStatement.bindLong(1, (long) sendnetworkresponse.getUid());
                if (sendnetworkresponse.getComment() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sendnetworkresponse.getComment());
                }
                if (sendnetworkresponse.getDeepLinkUrl() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, sendnetworkresponse.getDeepLinkUrl());
                }
                if (sendnetworkresponse.getPayers() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, sendnetworkresponse.getPayers());
                }
                supportSQLiteStatement.bindLong(5, sendnetworkresponse.getLastUpdated());
                if (sendnetworkresponse.getSplitBillId() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, sendnetworkresponse.getSplitBillId());
                }
                supportSQLiteStatement.bindLong(7, sendnetworkresponse.getCreatedDate());
                if (sendnetworkresponse.getStatus() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, sendnetworkresponse.getStatus());
                }
                if (sendnetworkresponse.getTotalAmount() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, sendnetworkresponse.getTotalAmount());
                }
                supportSQLiteStatement.bindLong(10, (long) sendnetworkresponse.getPayeeIndex());
                supportSQLiteStatement.bindLong(11, (long) sendnetworkresponse.getPayerIndex());
            }
        };
        this.__updateAdapterOfSplitBillHistoryEntity = new setHeaderIcon<sendNetworkResponse>(roomDatabase) {
            public final String createQuery() {
                return "UPDATE OR ABORT `SplitBillHistoryEntity` SET `uid` = ?,`comment` = ?,`deepLinkUrl` = ?,`payers` = ?,`lastUpdated` = ?,`splitBillId` = ?,`createdDate` = ?,`status` = ?,`totalAmount` = ?,`payeeIndex` = ?,`payerIndex` = ? WHERE `uid` = ?";
            }

            public final /* synthetic */ void setMax(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                sendNetworkResponse sendnetworkresponse = (sendNetworkResponse) obj;
                supportSQLiteStatement.bindLong(1, (long) sendnetworkresponse.getUid());
                if (sendnetworkresponse.getComment() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, sendnetworkresponse.getComment());
                }
                if (sendnetworkresponse.getDeepLinkUrl() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, sendnetworkresponse.getDeepLinkUrl());
                }
                if (sendnetworkresponse.getPayers() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, sendnetworkresponse.getPayers());
                }
                supportSQLiteStatement.bindLong(5, sendnetworkresponse.getLastUpdated());
                if (sendnetworkresponse.getSplitBillId() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, sendnetworkresponse.getSplitBillId());
                }
                supportSQLiteStatement.bindLong(7, sendnetworkresponse.getCreatedDate());
                if (sendnetworkresponse.getStatus() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, sendnetworkresponse.getStatus());
                }
                if (sendnetworkresponse.getTotalAmount() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, sendnetworkresponse.getTotalAmount());
                }
                supportSQLiteStatement.bindLong(10, (long) sendnetworkresponse.getPayeeIndex());
                supportSQLiteStatement.bindLong(11, (long) sendnetworkresponse.getPayerIndex());
                supportSQLiteStatement.bindLong(12, (long) sendnetworkresponse.getUid());
            }
        };
        this.__preparedStmtOfDeleteOldSplitBillHistories = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM SplitBillHistoryEntity where uid NOT IN (SELECT uid from SplitBillHistoryEntity ORDER BY uid DESC LIMIT 10)";
            }
        };
        this.__preparedStmtOfClearAll = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM SplitBillHistoryEntity";
            }
        };
    }

    public final Long saveSplitBillHistory(sendNetworkResponse sendnetworkresponse) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfSplitBillHistoryEntity.insertAndReturnId(sendnetworkresponse);
            this.__db.setTransactionSuccessful();
            return Long.valueOf(insertAndReturnId);
        } finally {
            this.__db.endTransaction();
        }
    }

    public final int updateSplitBillHistoryEntity(sendNetworkResponse sendnetworkresponse) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int min = this.__updateAdapterOfSplitBillHistoryEntity.setMin(sendnetworkresponse) + 0;
            this.__db.setTransactionSuccessful();
            return min;
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void deleteOldSplitBillHistories() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteOldSplitBillHistories.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteOldSplitBillHistories.release(acquire);
        }
    }

    public final void clearAll() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfClearAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfClearAll.release(acquire);
        }
    }

    public final List<sendNetworkResponse> getSplitBillHistories() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM SplitBillHistoryEntity ORDER BY lastUpdated DESC LIMIT 10 ", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "uid");
            int max4 = getTitle.setMax(max2, "comment");
            int max5 = getTitle.setMax(max2, "deepLinkUrl");
            int max6 = getTitle.setMax(max2, "payers");
            int max7 = getTitle.setMax(max2, "lastUpdated");
            int max8 = getTitle.setMax(max2, "splitBillId");
            int max9 = getTitle.setMax(max2, "createdDate");
            int max10 = getTitle.setMax(max2, "status");
            int max11 = getTitle.setMax(max2, "totalAmount");
            int max12 = getTitle.setMax(max2, "payeeIndex");
            int max13 = getTitle.setMax(max2, "payerIndex");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                sendNetworkResponse sendnetworkresponse = new sendNetworkResponse();
                sendnetworkresponse.setUid(max2.getInt(max3));
                String str6 = null;
                if (max2.isNull(max4)) {
                    str = null;
                } else {
                    str = max2.getString(max4);
                }
                sendnetworkresponse.setComment(str);
                if (max2.isNull(max5)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max5);
                }
                sendnetworkresponse.setDeepLinkUrl(str2);
                if (max2.isNull(max6)) {
                    str3 = null;
                } else {
                    str3 = max2.getString(max6);
                }
                sendnetworkresponse.setPayers(str3);
                int i = max3;
                sendnetworkresponse.setLastUpdated(max2.getLong(max7));
                if (max2.isNull(max8)) {
                    str4 = null;
                } else {
                    str4 = max2.getString(max8);
                }
                sendnetworkresponse.setSplitBillId(str4);
                sendnetworkresponse.setCreatedDate(max2.getLong(max9));
                if (max2.isNull(max10)) {
                    str5 = null;
                } else {
                    str5 = max2.getString(max10);
                }
                sendnetworkresponse.setStatus(str5);
                if (!max2.isNull(max11)) {
                    str6 = max2.getString(max11);
                }
                sendnetworkresponse.setTotalAmount(str6);
                sendnetworkresponse.setPayeeIndex(max2.getInt(max12));
                sendnetworkresponse.setPayerIndex(max2.getInt(max13));
                arrayList.add(sendnetworkresponse);
                max3 = i;
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: o.sendNetworkResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.sendNetworkResponse getHistoryById(java.lang.String r15) {
        /*
            r14 = this;
            r0 = 1
            java.lang.String r1 = "SELECT * FROM SplitBillHistoryEntity WHERE splitBillId = ?"
            o.setSplitBackground r1 = o.setSplitBackground.setMax(r1, r0)
            if (r15 != 0) goto L_0x000d
            r1.bindNull(r0)
            goto L_0x0010
        L_0x000d:
            r1.bindString(r0, r15)
        L_0x0010:
            androidx.room.RoomDatabase r15 = r14.__db
            r15.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r15 = r14.__db
            r0 = 0
            android.database.Cursor r15 = o.setSubtitle.getMax(r15, r1, r0)
            java.lang.String r0 = "uid"
            int r0 = o.getTitle.setMax(r15, r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = "comment"
            int r2 = o.getTitle.setMax(r15, r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = "deepLinkUrl"
            int r3 = o.getTitle.setMax(r15, r3)     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = "payers"
            int r4 = o.getTitle.setMax(r15, r4)     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = "lastUpdated"
            int r5 = o.getTitle.setMax(r15, r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r6 = "splitBillId"
            int r6 = o.getTitle.setMax(r15, r6)     // Catch:{ all -> 0x00ee }
            java.lang.String r7 = "createdDate"
            int r7 = o.getTitle.setMax(r15, r7)     // Catch:{ all -> 0x00ee }
            java.lang.String r8 = "status"
            int r8 = o.getTitle.setMax(r15, r8)     // Catch:{ all -> 0x00ee }
            java.lang.String r9 = "totalAmount"
            int r9 = o.getTitle.setMax(r15, r9)     // Catch:{ all -> 0x00ee }
            java.lang.String r10 = "payeeIndex"
            int r10 = o.getTitle.setMax(r15, r10)     // Catch:{ all -> 0x00ee }
            java.lang.String r11 = "payerIndex"
            int r11 = o.getTitle.setMax(r15, r11)     // Catch:{ all -> 0x00ee }
            boolean r12 = r15.moveToFirst()     // Catch:{ all -> 0x00ee }
            r13 = 0
            if (r12 == 0) goto L_0x00e7
            o.sendNetworkResponse r12 = new o.sendNetworkResponse     // Catch:{ all -> 0x00ee }
            r12.<init>()     // Catch:{ all -> 0x00ee }
            int r0 = r15.getInt(r0)     // Catch:{ all -> 0x00ee }
            r12.setUid(r0)     // Catch:{ all -> 0x00ee }
            boolean r0 = r15.isNull(r2)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0079
            r0 = r13
            goto L_0x007d
        L_0x0079:
            java.lang.String r0 = r15.getString(r2)     // Catch:{ all -> 0x00ee }
        L_0x007d:
            r12.setComment(r0)     // Catch:{ all -> 0x00ee }
            boolean r0 = r15.isNull(r3)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0088
            r0 = r13
            goto L_0x008c
        L_0x0088:
            java.lang.String r0 = r15.getString(r3)     // Catch:{ all -> 0x00ee }
        L_0x008c:
            r12.setDeepLinkUrl(r0)     // Catch:{ all -> 0x00ee }
            boolean r0 = r15.isNull(r4)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0097
            r0 = r13
            goto L_0x009b
        L_0x0097:
            java.lang.String r0 = r15.getString(r4)     // Catch:{ all -> 0x00ee }
        L_0x009b:
            r12.setPayers(r0)     // Catch:{ all -> 0x00ee }
            long r2 = r15.getLong(r5)     // Catch:{ all -> 0x00ee }
            r12.setLastUpdated(r2)     // Catch:{ all -> 0x00ee }
            boolean r0 = r15.isNull(r6)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ad
            r0 = r13
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r0 = r15.getString(r6)     // Catch:{ all -> 0x00ee }
        L_0x00b1:
            r12.setSplitBillId(r0)     // Catch:{ all -> 0x00ee }
            long r2 = r15.getLong(r7)     // Catch:{ all -> 0x00ee }
            r12.setCreatedDate(r2)     // Catch:{ all -> 0x00ee }
            boolean r0 = r15.isNull(r8)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00c3
            r0 = r13
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r0 = r15.getString(r8)     // Catch:{ all -> 0x00ee }
        L_0x00c7:
            r12.setStatus(r0)     // Catch:{ all -> 0x00ee }
            boolean r0 = r15.isNull(r9)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            java.lang.String r13 = r15.getString(r9)     // Catch:{ all -> 0x00ee }
        L_0x00d5:
            r12.setTotalAmount(r13)     // Catch:{ all -> 0x00ee }
            int r0 = r15.getInt(r10)     // Catch:{ all -> 0x00ee }
            r12.setPayeeIndex(r0)     // Catch:{ all -> 0x00ee }
            int r0 = r15.getInt(r11)     // Catch:{ all -> 0x00ee }
            r12.setPayerIndex(r0)     // Catch:{ all -> 0x00ee }
            r13 = r12
        L_0x00e7:
            r15.close()
            r1.getMin()
            return r13
        L_0x00ee:
            r0 = move-exception
            r15.close()
            r1.getMin()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendStorage.getHistoryById(java.lang.String):o.sendNetworkResponse");
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
