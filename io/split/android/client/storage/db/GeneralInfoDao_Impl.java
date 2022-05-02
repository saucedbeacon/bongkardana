package io.split.android.client.storage.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import o.getTitle;
import o.setHeaderTitle;
import o.setSplitBackground;
import o.setSubtitle;

public final class GeneralInfoDao_Impl implements GeneralInfoDao {
    private final RoomDatabase __db;
    private final setHeaderTitle<GeneralInfoEntity> __insertionAdapterOfGeneralInfoEntity;

    public GeneralInfoDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfGeneralInfoEntity = new setHeaderTitle<GeneralInfoEntity>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `general_info` (`name`,`stringValue`,`longValue`,`updated_at`) VALUES (?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, GeneralInfoEntity generalInfoEntity) {
                if (generalInfoEntity.getName() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, generalInfoEntity.getName());
                }
                if (generalInfoEntity.getStringValue() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, generalInfoEntity.getStringValue());
                }
                supportSQLiteStatement.bindLong(3, generalInfoEntity.getLongValue());
                supportSQLiteStatement.bindLong(4, generalInfoEntity.getUpdatedAt());
            }
        };
    }

    public final void update(GeneralInfoEntity generalInfoEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGeneralInfoEntity.insert(generalInfoEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public final GeneralInfoEntity getByName(String str) {
        GeneralInfoEntity generalInfoEntity;
        setSplitBackground max = setSplitBackground.setMax("SELECT name, stringValue, longValue, updated_at FROM general_info WHERE name = ?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "name");
            int max4 = getTitle.setMax(max2, "stringValue");
            int max5 = getTitle.setMax(max2, "longValue");
            int max6 = getTitle.setMax(max2, "updated_at");
            if (max2.moveToFirst()) {
                generalInfoEntity = new GeneralInfoEntity();
                generalInfoEntity.setName(max2.getString(max3));
                generalInfoEntity.setStringValue(max2.getString(max4));
                generalInfoEntity.setLongValue(max2.getLong(max5));
                generalInfoEntity.setUpdatedAt(max2.getLong(max6));
            } else {
                generalInfoEntity = null;
            }
            return generalInfoEntity;
        } finally {
            max2.close();
            max.getMin();
        }
    }
}
