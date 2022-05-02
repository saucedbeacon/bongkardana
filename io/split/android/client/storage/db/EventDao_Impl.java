package io.split.android.client.storage.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import o.closeMode;
import o.dispatchOnCancelled;
import o.getTitle;
import o.onCancelLoad;
import o.onCanceled;
import o.setHeaderTitle;
import o.setSplitBackground;
import o.setSubtitle;
import o.startActionModeForChild;

public final class EventDao_Impl implements EventDao {
    private final RoomDatabase __db;
    private final setHeaderTitle<EventEntity> __insertionAdapterOfEventEntity;
    private final startActionModeForChild __preparedStmtOfDeleteByStatus;
    private final startActionModeForChild __preparedStmtOfDeleteOutdated;

    public EventDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfEventEntity = new setHeaderTitle<EventEntity>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR ABORT INTO `events` (`id`,`body`,`created_at`,`status`) VALUES (nullif(?, 0),?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, EventEntity eventEntity) {
                supportSQLiteStatement.bindLong(1, eventEntity.getId());
                if (eventEntity.getBody() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, eventEntity.getBody());
                }
                supportSQLiteStatement.bindLong(3, eventEntity.getCreatedAt());
                supportSQLiteStatement.bindLong(4, (long) eventEntity.getStatus());
            }
        };
        this.__preparedStmtOfDeleteOutdated = new startActionModeForChild(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM events WHERE created_at < ?";
            }
        };
        this.__preparedStmtOfDeleteByStatus = new startActionModeForChild(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM events WHERE  status = ? AND created_at < ? AND EXISTS(SELECT 1 FROM events AS eve  WHERE eve.id = events.id LIMIT ?)";
            }
        };
    }

    public final void insert(EventEntity eventEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEventEntity.insert(eventEntity);
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
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2050439657, oncanceled);
            onCancelLoad.getMin(-2050439657, oncanceled);
        }
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

    public final List<EventEntity> getBy(long j, int i, int i2) {
        setSplitBackground max = setSplitBackground.setMax("SELECT id, body, created_at, status FROM events WHERE created_at >= ? AND status = ? ORDER BY created_at LIMIT ?", 3);
        max.bindLong(1, j);
        max.bindLong(2, (long) i);
        max.bindLong(3, (long) i2);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "id");
            int max4 = getTitle.setMax(max2, TtmlNode.TAG_BODY);
            int max5 = getTitle.setMax(max2, "created_at");
            int max6 = getTitle.setMax(max2, "status");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                EventEntity eventEntity = new EventEntity();
                eventEntity.setId(max2.getLong(max3));
                eventEntity.setBody(max2.getString(max4));
                eventEntity.setCreatedAt(max2.getLong(max5));
                eventEntity.setStatus(max2.getInt(max6));
                arrayList.add(eventEntity);
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
        length.append("UPDATE events SET status = ");
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
        length.append("DELETE FROM events WHERE id IN (");
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
