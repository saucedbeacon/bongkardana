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

public final class SplitDao_Impl implements SplitDao {
    private final RoomDatabase __db;
    private final setHeaderTitle<SplitEntity> __insertionAdapterOfSplitEntity;
    private final startActionModeForChild __preparedStmtOfDeleteAll;

    public SplitDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSplitEntity = new setHeaderTitle<SplitEntity>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `splits` (`name`,`body`,`updated_at`) VALUES (?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, SplitEntity splitEntity) {
                if (splitEntity.getName() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, splitEntity.getName());
                }
                if (splitEntity.getBody() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, splitEntity.getBody());
                }
                supportSQLiteStatement.bindLong(3, splitEntity.getUpdatedAt());
            }
        };
        this.__preparedStmtOfDeleteAll = new startActionModeForChild(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM splits";
            }
        };
    }

    public final void insert(List<SplitEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSplitEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public final void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    public final List<SplitEntity> getAll() {
        setSplitBackground max = setSplitBackground.setMax("SELECT name, body, updated_at FROM splits", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "name");
            int max4 = getTitle.setMax(max2, TtmlNode.TAG_BODY);
            int max5 = getTitle.setMax(max2, "updated_at");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                SplitEntity splitEntity = new SplitEntity();
                splitEntity.setName(max2.getString(max3));
                splitEntity.setBody(max2.getString(max4));
                splitEntity.setUpdatedAt(max2.getLong(max5));
                arrayList.add(splitEntity);
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final void delete(List<String> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder length = closeMode.length();
        length.append("DELETE FROM splits WHERE name IN (");
        closeMode.getMin(length, list.size());
        length.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(length.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, next);
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
