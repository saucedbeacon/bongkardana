package io.split.android.client.storage.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import o.getTitle;
import o.setHeaderTitle;
import o.setSplitBackground;
import o.setSubtitle;

public final class MySegmentDao_Impl implements MySegmentDao {
    private final RoomDatabase __db;
    private final setHeaderTitle<MySegmentEntity> __insertionAdapterOfMySegmentEntity;

    public MySegmentDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfMySegmentEntity = new setHeaderTitle<MySegmentEntity>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `my_segments` (`user_key`,`segment_list`,`updated_at`) VALUES (?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, MySegmentEntity mySegmentEntity) {
                if (mySegmentEntity.getUserKey() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, mySegmentEntity.getUserKey());
                }
                if (mySegmentEntity.getSegmentList() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, mySegmentEntity.getSegmentList());
                }
                supportSQLiteStatement.bindLong(3, mySegmentEntity.getUpdatedAt());
            }
        };
    }

    public final void update(MySegmentEntity mySegmentEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMySegmentEntity.insert(mySegmentEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public final MySegmentEntity getByUserKeys(String str) {
        MySegmentEntity mySegmentEntity;
        setSplitBackground max = setSplitBackground.setMax("SELECT user_key, segment_list, updated_at FROM my_segments WHERE user_key = ?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "user_key");
            int max4 = getTitle.setMax(max2, "segment_list");
            int max5 = getTitle.setMax(max2, "updated_at");
            if (max2.moveToFirst()) {
                mySegmentEntity = new MySegmentEntity();
                mySegmentEntity.setUserKey(max2.getString(max3));
                mySegmentEntity.setSegmentList(max2.getString(max4));
                mySegmentEntity.setUpdatedAt(max2.getLong(max5));
            } else {
                mySegmentEntity = null;
            }
            return mySegmentEntity;
        } finally {
            max2.close();
            max.getMin();
        }
    }
}
