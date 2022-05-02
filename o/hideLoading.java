package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hideLoading implements showLoading {
    private final RoomDatabase __db;
    private final setHeaderTitle<PageShowLoadingPoint> __insertionAdapterOfRecentPoiEntity;

    public hideLoading(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfRecentPoiEntity = new setHeaderTitle<PageShowLoadingPoint>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `RecentPoiEntity` (`poiId`,`radius`,`longitude`,`latitude`,`lastPoiNotified`) VALUES (?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                PageShowLoadingPoint pageShowLoadingPoint = (PageShowLoadingPoint) obj;
                if (pageShowLoadingPoint.getPoiId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, pageShowLoadingPoint.getPoiId());
                }
                supportSQLiteStatement.bindLong(2, (long) pageShowLoadingPoint.getRadius());
                supportSQLiteStatement.bindDouble(3, pageShowLoadingPoint.getLongitude());
                supportSQLiteStatement.bindDouble(4, pageShowLoadingPoint.getLatitude());
                if (pageShowLoadingPoint.getLastPoiNotified() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindLong(5, pageShowLoadingPoint.getLastPoiNotified().longValue());
                }
            }
        };
    }

    public final long[] insertPois(List<PageShowLoadingPoint> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long[] insertAndReturnIdsArray = this.__insertionAdapterOfRecentPoiEntity.insertAndReturnIdsArray(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsArray;
        } finally {
            this.__db.endTransaction();
        }
    }

    public final List<PageShowLoadingPoint> hasNotifiedToday(String str, long j) {
        String str2;
        String str3 = str;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM RecentPoiEntity WHERE poiId = ? AND lastPoiNotified = ? LIMIT 1", 2);
        if (str3 == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str3);
        }
        max.bindLong(2, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "poiId");
            int max4 = getTitle.setMax(max2, "radius");
            int max5 = getTitle.setMax(max2, "longitude");
            int max6 = getTitle.setMax(max2, "latitude");
            int max7 = getTitle.setMax(max2, "lastPoiNotified");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                Long l = null;
                if (max2.isNull(max3)) {
                    str2 = null;
                } else {
                    str2 = max2.getString(max3);
                }
                int i = max2.getInt(max4);
                double d = max2.getDouble(max5);
                double d2 = max2.getDouble(max6);
                if (!max2.isNull(max7)) {
                    l = Long.valueOf(max2.getLong(max7));
                }
                arrayList.add(new PageShowLoadingPoint(str2, i, d, d2, l));
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<PageShowLoadingPoint> getAllPois() {
        String str;
        setSplitBackground max = setSplitBackground.setMax("SELECT * FROM RecentPoiEntity", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.__db, max, false);
        try {
            int max3 = getTitle.setMax(max2, "poiId");
            int max4 = getTitle.setMax(max2, "radius");
            int max5 = getTitle.setMax(max2, "longitude");
            int max6 = getTitle.setMax(max2, "latitude");
            int max7 = getTitle.setMax(max2, "lastPoiNotified");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                Long l = null;
                if (max2.isNull(max3)) {
                    str = null;
                } else {
                    str = max2.getString(max3);
                }
                int i = max2.getInt(max4);
                double d = max2.getDouble(max5);
                double d2 = max2.getDouble(max6);
                if (!max2.isNull(max7)) {
                    l = Long.valueOf(max2.getLong(max7));
                }
                arrayList.add(new PageShowLoadingPoint(str, i, d, d2, l));
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final int updateLastNotification(List<String> list, long j) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder length = closeMode.length();
        length.append("UPDATE RecentPoiEntity SET lastPoiNotified = ");
        length.append("?");
        length.append(" WHERE poiId IN (");
        closeMode.getMin(length, list.size());
        length.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(length.toString());
        compileStatement.bindLong(1, j);
        int i = 2;
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
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
