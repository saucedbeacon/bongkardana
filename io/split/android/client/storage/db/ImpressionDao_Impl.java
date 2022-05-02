package io.split.android.client.storage.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import o.closeMode;
import o.getTitle;
import o.setHeaderTitle;
import o.setSplitBackground;
import o.setSubtitle;
import o.startActionModeForChild;

public final class ImpressionDao_Impl implements ImpressionDao {
    private final RoomDatabase __db;
    private final setHeaderTitle<ImpressionEntity> __insertionAdapterOfImpressionEntity;
    private final startActionModeForChild __preparedStmtOfDeleteByStatus;
    private final startActionModeForChild __preparedStmtOfDeleteOutdated;

    public ImpressionDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfImpressionEntity = new setHeaderTitle<ImpressionEntity>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR ABORT INTO `impressions` (`id`,`test_name`,`body`,`created_at`,`status`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, ImpressionEntity impressionEntity) {
                supportSQLiteStatement.bindLong(1, impressionEntity.getId());
                if (impressionEntity.getTestName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, impressionEntity.getTestName());
                }
                if (impressionEntity.getBody() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, impressionEntity.getBody());
                }
                supportSQLiteStatement.bindLong(4, impressionEntity.getCreatedAt());
                supportSQLiteStatement.bindLong(5, (long) impressionEntity.getStatus());
            }
        };
        this.__preparedStmtOfDeleteOutdated = new startActionModeForChild(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM impressions WHERE created_at < ?";
            }
        };
        this.__preparedStmtOfDeleteByStatus = new startActionModeForChild(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM impressions WHERE  status = ? AND created_at < ? AND EXISTS(SELECT 1 FROM impressions AS imp  WHERE imp.id = impressions.id LIMIT ?)";
            }
        };
    }

    public final void insert(ImpressionEntity impressionEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfImpressionEntity.insert(impressionEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void insert(List<ImpressionEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfImpressionEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void deleteOutdated(long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteOutdated.acquire();
        acquire.bindLong(1, j);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteOutdated.release(acquire);
        }
    }

    public final int deleteByStatus(int i, long j, int i2) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteByStatus.acquire();
        acquire.bindLong(1, (long) i);
        acquire.bindLong(2, j);
        acquire.bindLong(3, (long) i2);
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByStatus.release(acquire);
        }
    }

    public final List<ImpressionEntity> getBy(long j, int i, int i2) {
        setSplitBackground max = setSplitBackground.setMax("SELECT id, test_name, body, created_at, status FROM impressions WHERE created_at >= ? AND status = ? ORDER BY created_at LIMIT ?", 3);
        max.bindLong(1, j);
        max.bindLong(2, (long) i);
        max.bindLong(3, (long) i2);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "id");
            int max4 = getTitle.setMax(max2, "test_name");
            int max5 = getTitle.setMax(max2, TtmlNode.TAG_BODY);
            int max6 = getTitle.setMax(max2, "created_at");
            int max7 = getTitle.setMax(max2, "status");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                ImpressionEntity impressionEntity = new ImpressionEntity();
                impressionEntity.setId(max2.getLong(max3));
                impressionEntity.setTestName(max2.getString(max4));
                impressionEntity.setBody(max2.getString(max5));
                impressionEntity.setCreatedAt(max2.getLong(max6));
                impressionEntity.setStatus(max2.getInt(max7));
                arrayList.add(impressionEntity);
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final void updateStatus(List<Long> list, int i) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder length = closeMode.length();
        length.append("UPDATE impressions SET status = ");
        length.append("?");
        length.append("  WHERE id IN (");
        closeMode.getMin(length, list.size());
        length.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(length.toString());
        compileStatement.bindLong(1, (long) i);
        int i2 = 2;
        for (Long next : list) {
            if (next == null) {
                compileStatement.bindNull(i2);
            } else {
                compileStatement.bindLong(i2, next.longValue());
            }
            i2++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void delete(List<Long> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder length = closeMode.length();
        length.append("DELETE FROM impressions WHERE id IN (");
        closeMode.getMin(length, list.size());
        length.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(length.toString());
        int i = 1;
        for (Long next : list) {
            if (next == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindLong(i, next.longValue());
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
