package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ErrId;
import org.jetbrains.annotations.NotNull;

public final class PerfId implements ErrId.ErrValue {
    private final RoomDatabase __db;
    private final setHeaderTitle<NodeAware> __insertionAdapterOfRecentContactEntity;
    private final startActionModeForChild __preparedStmtOfRemoveAllRecentContact;
    private final setHeaderIcon<NodeAware> __updateAdapterOfRecentContactEntity;

    @Singleton
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/recentrecipient/BankCardConversionFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/recentrecipient/source/BankCardConversionEntityData;", "networkBankCardConversionEntityData", "Lid/dana/data/recentrecipient/source/network/NetworkBankCardConversionEntityData;", "(Lid/dana/data/recentrecipient/source/network/NetworkBankCardConversionEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class PerfValue extends uncheckItems<getAttrData> {
        private final toMap networkBankCardConversionEntityData;

        @Inject
        public PerfValue(@NotNull toMap tomap) {
            Intrinsics.checkNotNullParameter(tomap, "networkBankCardConversionEntityData");
            this.networkBankCardConversionEntityData = tomap;
        }

        @NotNull
        public final getAttrData createData(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "source");
            if (str.hashCode() == 3357066 && str.equals("mock")) {
                return new putAttr();
            }
            return this.networkBankCardConversionEntityData;
        }
    }

    public PerfId(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfRecentContactEntity = new setHeaderTitle<NodeAware>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR ABORT INTO `RecentContactEntity` (`uid`,`userId`,`userPhoneNumber`,`userNickName`,`avatar`,`lastUpdated`,`transactionCount`,`visibleInQuickSend`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                NodeAware nodeAware = (NodeAware) obj;
                supportSQLiteStatement.bindLong(1, (long) nodeAware.getUid());
                if (nodeAware.getUserId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, nodeAware.getUserId());
                }
                if (nodeAware.getUserPhoneNumber() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, nodeAware.getUserPhoneNumber());
                }
                if (nodeAware.getUserNickName() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, nodeAware.getUserNickName());
                }
                if (nodeAware.getAvatar() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, nodeAware.getAvatar());
                }
                supportSQLiteStatement.bindLong(6, nodeAware.getLastUpdated());
                supportSQLiteStatement.bindLong(7, (long) nodeAware.getTransactionCount());
                supportSQLiteStatement.bindLong(8, nodeAware.isVisibleInQuickSend() ? 1 : 0);
            }
        };
        this.__updateAdapterOfRecentContactEntity = new setHeaderIcon<NodeAware>(roomDatabase) {
            public final String createQuery() {
                return "UPDATE OR ABORT `RecentContactEntity` SET `uid` = ?,`userId` = ?,`userPhoneNumber` = ?,`userNickName` = ?,`avatar` = ?,`lastUpdated` = ?,`transactionCount` = ?,`visibleInQuickSend` = ? WHERE `uid` = ?";
            }

            public final /* synthetic */ void setMax(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                NodeAware nodeAware = (NodeAware) obj;
                supportSQLiteStatement.bindLong(1, (long) nodeAware.getUid());
                if (nodeAware.getUserId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, nodeAware.getUserId());
                }
                if (nodeAware.getUserPhoneNumber() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, nodeAware.getUserPhoneNumber());
                }
                if (nodeAware.getUserNickName() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, nodeAware.getUserNickName());
                }
                if (nodeAware.getAvatar() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, nodeAware.getAvatar());
                }
                supportSQLiteStatement.bindLong(6, nodeAware.getLastUpdated());
                supportSQLiteStatement.bindLong(7, (long) nodeAware.getTransactionCount());
                supportSQLiteStatement.bindLong(8, nodeAware.isVisibleInQuickSend() ? 1 : 0);
                supportSQLiteStatement.bindLong(9, (long) nodeAware.getUid());
            }
        };
        this.__preparedStmtOfRemoveAllRecentContact = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM RecentContactEntity";
            }
        };
    }

    public final Long insertRecentContact(NodeAware nodeAware) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfRecentContactEntity.insertAndReturnId(nodeAware);
            this.__db.setTransactionSuccessful();
            return Long.valueOf(insertAndReturnId);
        } finally {
            this.__db.endTransaction();
        }
    }

    public final int updateRecentContact(NodeAware nodeAware) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int min = this.__updateAdapterOfRecentContactEntity.setMin(nodeAware) + 0;
            this.__db.setTransactionSuccessful();
            return min;
        } finally {
            this.__db.endTransaction();
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

    public final List<NodeAware> getListRecentContact() {
        String str;
        String str2;
        String str3;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM RecentContactEntity", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "uid");
            int max4 = getTitle.setMax(max2, "userId");
            int max5 = getTitle.setMax(max2, "userPhoneNumber");
            int max6 = getTitle.setMax(max2, "userNickName");
            int max7 = getTitle.setMax(max2, "avatar");
            int max8 = getTitle.setMax(max2, "lastUpdated");
            int max9 = getTitle.setMax(max2, "transactionCount");
            int max10 = getTitle.setMax(max2, "visibleInQuickSend");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                NodeAware nodeAware = new NodeAware();
                nodeAware.setUid(max2.getInt(max3));
                String str4 = null;
                if (max2.isNull(max4)) {
                    str = null;
                } else {
                    str = max2.getString(max4);
                }
                nodeAware.setUserId(str);
                if (max2.isNull(max5)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max5);
                }
                nodeAware.setUserPhoneNumber(str2);
                if (max2.isNull(max6)) {
                    str3 = null;
                } else {
                    str3 = max2.getString(max6);
                }
                nodeAware.setUserNickName(str3);
                if (!max2.isNull(max7)) {
                    str4 = max2.getString(max7);
                }
                nodeAware.setAvatar(str4);
                nodeAware.setLastUpdated(max2.getLong(max8));
                nodeAware.setTransactionCount(max2.getInt(max9));
                nodeAware.setVisibleInQuickSend(max2.getInt(max10) != 0);
                arrayList.add(nodeAware);
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: o.NodeAware} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.NodeAware getRecentContactByUserId(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.String r1 = "SELECT * FROM RecentContactEntity WHERE userId = ?"
            o.setSplitBackground r1 = o.setSplitBackground.setMax(r1, r0)
            if (r14 != 0) goto L_0x000d
            r1.bindNull(r0)
            goto L_0x0010
        L_0x000d:
            r1.bindString(r0, r14)
        L_0x0010:
            androidx.room.RoomDatabase r14 = r13.__db
            r14.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r14 = r13.__db
            r2 = 0
            android.database.Cursor r14 = o.setSubtitle.getMax(r14, r1, r2)
            java.lang.String r3 = "uid"
            int r3 = o.getTitle.setMax(r14, r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = "userId"
            int r4 = o.getTitle.setMax(r14, r4)     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "userPhoneNumber"
            int r5 = o.getTitle.setMax(r14, r5)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "userNickName"
            int r6 = o.getTitle.setMax(r14, r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = "avatar"
            int r7 = o.getTitle.setMax(r14, r7)     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = "lastUpdated"
            int r8 = o.getTitle.setMax(r14, r8)     // Catch:{ all -> 0x00bb }
            java.lang.String r9 = "transactionCount"
            int r9 = o.getTitle.setMax(r14, r9)     // Catch:{ all -> 0x00bb }
            java.lang.String r10 = "visibleInQuickSend"
            int r10 = o.getTitle.setMax(r14, r10)     // Catch:{ all -> 0x00bb }
            boolean r11 = r14.moveToFirst()     // Catch:{ all -> 0x00bb }
            r12 = 0
            if (r11 == 0) goto L_0x00b4
            o.NodeAware r11 = new o.NodeAware     // Catch:{ all -> 0x00bb }
            r11.<init>()     // Catch:{ all -> 0x00bb }
            int r3 = r14.getInt(r3)     // Catch:{ all -> 0x00bb }
            r11.setUid(r3)     // Catch:{ all -> 0x00bb }
            boolean r3 = r14.isNull(r4)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x0067
            r3 = r12
            goto L_0x006b
        L_0x0067:
            java.lang.String r3 = r14.getString(r4)     // Catch:{ all -> 0x00bb }
        L_0x006b:
            r11.setUserId(r3)     // Catch:{ all -> 0x00bb }
            boolean r3 = r14.isNull(r5)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x0076
            r3 = r12
            goto L_0x007a
        L_0x0076:
            java.lang.String r3 = r14.getString(r5)     // Catch:{ all -> 0x00bb }
        L_0x007a:
            r11.setUserPhoneNumber(r3)     // Catch:{ all -> 0x00bb }
            boolean r3 = r14.isNull(r6)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x0085
            r3 = r12
            goto L_0x0089
        L_0x0085:
            java.lang.String r3 = r14.getString(r6)     // Catch:{ all -> 0x00bb }
        L_0x0089:
            r11.setUserNickName(r3)     // Catch:{ all -> 0x00bb }
            boolean r3 = r14.isNull(r7)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            java.lang.String r12 = r14.getString(r7)     // Catch:{ all -> 0x00bb }
        L_0x0097:
            r11.setAvatar(r12)     // Catch:{ all -> 0x00bb }
            long r3 = r14.getLong(r8)     // Catch:{ all -> 0x00bb }
            r11.setLastUpdated(r3)     // Catch:{ all -> 0x00bb }
            int r3 = r14.getInt(r9)     // Catch:{ all -> 0x00bb }
            r11.setTransactionCount(r3)     // Catch:{ all -> 0x00bb }
            int r3 = r14.getInt(r10)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            r11.setVisibleInQuickSend(r0)     // Catch:{ all -> 0x00bb }
            r12 = r11
        L_0x00b4:
            r14.close()
            r1.getMin()
            return r12
        L_0x00bb:
            r0 = move-exception
            r14.close()
            r1.getMin()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PerfId.getRecentContactByUserId(java.lang.String):o.NodeAware");
    }

    public final List<NodeAware> getSomeRecentContact(int i) {
        String str;
        String str2;
        String str3;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM RecentContactEntity ORDER BY lastUpdated DESC LIMIT ?", 1);
        max.bindLong(1, (long) i);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "uid");
            int max4 = getTitle.setMax(max2, "userId");
            int max5 = getTitle.setMax(max2, "userPhoneNumber");
            int max6 = getTitle.setMax(max2, "userNickName");
            int max7 = getTitle.setMax(max2, "avatar");
            int max8 = getTitle.setMax(max2, "lastUpdated");
            int max9 = getTitle.setMax(max2, "transactionCount");
            int max10 = getTitle.setMax(max2, "visibleInQuickSend");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                NodeAware nodeAware = new NodeAware();
                nodeAware.setUid(max2.getInt(max3));
                String str4 = null;
                if (max2.isNull(max4)) {
                    str = null;
                } else {
                    str = max2.getString(max4);
                }
                nodeAware.setUserId(str);
                if (max2.isNull(max5)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max5);
                }
                nodeAware.setUserPhoneNumber(str2);
                if (max2.isNull(max6)) {
                    str3 = null;
                } else {
                    str3 = max2.getString(max6);
                }
                nodeAware.setUserNickName(str3);
                if (!max2.isNull(max7)) {
                    str4 = max2.getString(max7);
                }
                nodeAware.setAvatar(str4);
                nodeAware.setLastUpdated(max2.getLong(max8));
                nodeAware.setTransactionCount(max2.getInt(max9));
                nodeAware.setVisibleInQuickSend(max2.getInt(max10) != 0);
                arrayList.add(nodeAware);
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<NodeAware> getListRecentContactByTransactionCount(boolean z) {
        String str;
        String str2;
        String str3;
        boolean z2 = z;
        setSplitBackground max = setSplitBackground.setMax("SELECT * from RecentContactEntity ORDER BY CASE WHEN ? = 1 THEN transactionCount END ASC, CASE WHEN ? = 0 THEN transactionCount END DESC", 2);
        max.bindLong(1, z2 ? 1 : 0);
        max.bindLong(2, z2 ? 1 : 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "uid");
            int max4 = getTitle.setMax(max2, "userId");
            int max5 = getTitle.setMax(max2, "userPhoneNumber");
            int max6 = getTitle.setMax(max2, "userNickName");
            int max7 = getTitle.setMax(max2, "avatar");
            int max8 = getTitle.setMax(max2, "lastUpdated");
            int max9 = getTitle.setMax(max2, "transactionCount");
            int max10 = getTitle.setMax(max2, "visibleInQuickSend");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                NodeAware nodeAware = new NodeAware();
                nodeAware.setUid(max2.getInt(max3));
                String str4 = null;
                if (max2.isNull(max4)) {
                    str = null;
                } else {
                    str = max2.getString(max4);
                }
                nodeAware.setUserId(str);
                if (max2.isNull(max5)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max5);
                }
                nodeAware.setUserPhoneNumber(str2);
                if (max2.isNull(max6)) {
                    str3 = null;
                } else {
                    str3 = max2.getString(max6);
                }
                nodeAware.setUserNickName(str3);
                if (!max2.isNull(max7)) {
                    str4 = max2.getString(max7);
                }
                nodeAware.setAvatar(str4);
                int i = max5;
                nodeAware.setLastUpdated(max2.getLong(max8));
                nodeAware.setTransactionCount(max2.getInt(max9));
                nodeAware.setVisibleInQuickSend(max2.getInt(max10) != 0);
                arrayList.add(nodeAware);
                max5 = i;
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
