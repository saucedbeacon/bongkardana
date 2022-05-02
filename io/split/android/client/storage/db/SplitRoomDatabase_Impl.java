package io.split.android.client.storage.db;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.HashMap;
import java.util.HashSet;
import o.generateDefaultLayoutParams;
import o.getAnimatedVisibility;
import o.jumpDrawablesToCurrentState;
import o.setOverrideVisibleItems;
import o.setSubtitle;

public final class SplitRoomDatabase_Impl extends SplitRoomDatabase {
    private volatile EventDao _eventDao;
    private volatile GeneralInfoDao _generalInfoDao;
    private volatile ImpressionDao _impressionDao;
    private volatile ImpressionsCountDao _impressionsCountDao;
    private volatile MySegmentDao _mySegmentDao;
    private volatile SplitDao _splitDao;

    public final SupportSQLiteOpenHelper createOpenHelper(setOverrideVisibleItems setoverridevisibleitems) {
        jumpDrawablesToCurrentState jumpdrawablestocurrentstate = new jumpDrawablesToCurrentState(setoverridevisibleitems, new jumpDrawablesToCurrentState.getMin(2) {
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `my_segments` (`user_key` TEXT NOT NULL, `segment_list` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`user_key`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `splits` (`name` TEXT NOT NULL, `body` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`name`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `body` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `status` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `impressions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `test_name` TEXT NOT NULL, `body` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `status` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `general_info` (`name` TEXT NOT NULL, `stringValue` TEXT, `longValue` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`name`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `impressions_count` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `body` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `status` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5d5c707f188e620d81e1aba5911902a8')");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `my_segments`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `splits`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `events`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `impressions`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `general_info`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `impressions_count`");
                if (SplitRoomDatabase_Impl.this.mCallbacks != null) {
                    int size = SplitRoomDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        SplitRoomDatabase_Impl.this.mCallbacks.get(i);
                    }
                }
            }

            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (SplitRoomDatabase_Impl.this.mCallbacks != null) {
                    int size = SplitRoomDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        SplitRoomDatabase_Impl.this.mCallbacks.get(i);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase unused = SplitRoomDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                SplitRoomDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (SplitRoomDatabase_Impl.this.mCallbacks != null) {
                    int size = SplitRoomDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.length) SplitRoomDatabase_Impl.this.mCallbacks.get(i)).length(supportSQLiteDatabase);
                    }
                }
            }

            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                setSubtitle.setMin(supportSQLiteDatabase);
            }

            public jumpDrawablesToCurrentState.setMax onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                HashMap hashMap = new HashMap(3);
                hashMap.put("user_key", new generateDefaultLayoutParams.getMax("user_key", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap.put("segment_list", new generateDefaultLayoutParams.getMax("segment_list", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap.put("updated_at", new generateDefaultLayoutParams.getMax("updated_at", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams = new generateDefaultLayoutParams("my_segments", hashMap, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams2 = new generateDefaultLayoutParams("my_segments", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "my_segments"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "my_segments"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "my_segments"));
                if (!generatedefaultlayoutparams.equals(generatedefaultlayoutparams2)) {
                    StringBuilder sb = new StringBuilder("my_segments(io.split.android.client.storage.db.MySegmentEntity).\n Expected:\n");
                    sb.append(generatedefaultlayoutparams);
                    sb.append("\n Found:\n");
                    sb.append(generatedefaultlayoutparams2);
                    return new jumpDrawablesToCurrentState.setMax(false, sb.toString());
                }
                HashMap hashMap2 = new HashMap(3);
                hashMap2.put("name", new generateDefaultLayoutParams.getMax("name", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap2.put(TtmlNode.TAG_BODY, new generateDefaultLayoutParams.getMax(TtmlNode.TAG_BODY, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap2.put("updated_at", new generateDefaultLayoutParams.getMax("updated_at", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams3 = new generateDefaultLayoutParams("splits", hashMap2, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams4 = new generateDefaultLayoutParams("splits", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "splits"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "splits"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "splits"));
                if (!generatedefaultlayoutparams3.equals(generatedefaultlayoutparams4)) {
                    StringBuilder sb2 = new StringBuilder("splits(io.split.android.client.storage.db.SplitEntity).\n Expected:\n");
                    sb2.append(generatedefaultlayoutparams3);
                    sb2.append("\n Found:\n");
                    sb2.append(generatedefaultlayoutparams4);
                    return new jumpDrawablesToCurrentState.setMax(false, sb2.toString());
                }
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put("id", new generateDefaultLayoutParams.getMax("id", "INTEGER", true, 1, (String) null, 1));
                hashMap3.put(TtmlNode.TAG_BODY, new generateDefaultLayoutParams.getMax(TtmlNode.TAG_BODY, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap3.put("created_at", new generateDefaultLayoutParams.getMax("created_at", "INTEGER", true, 0, (String) null, 1));
                hashMap3.put("status", new generateDefaultLayoutParams.getMax("status", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams5 = new generateDefaultLayoutParams("events", hashMap3, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams6 = new generateDefaultLayoutParams("events", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "events"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "events"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "events"));
                if (!generatedefaultlayoutparams5.equals(generatedefaultlayoutparams6)) {
                    StringBuilder sb3 = new StringBuilder("events(io.split.android.client.storage.db.EventEntity).\n Expected:\n");
                    sb3.append(generatedefaultlayoutparams5);
                    sb3.append("\n Found:\n");
                    sb3.append(generatedefaultlayoutparams6);
                    return new jumpDrawablesToCurrentState.setMax(false, sb3.toString());
                }
                HashMap hashMap4 = new HashMap(5);
                hashMap4.put("id", new generateDefaultLayoutParams.getMax("id", "INTEGER", true, 1, (String) null, 1));
                hashMap4.put("test_name", new generateDefaultLayoutParams.getMax("test_name", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap4.put(TtmlNode.TAG_BODY, new generateDefaultLayoutParams.getMax(TtmlNode.TAG_BODY, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap4.put("created_at", new generateDefaultLayoutParams.getMax("created_at", "INTEGER", true, 0, (String) null, 1));
                hashMap4.put("status", new generateDefaultLayoutParams.getMax("status", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams7 = new generateDefaultLayoutParams("impressions", hashMap4, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams8 = new generateDefaultLayoutParams("impressions", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "impressions"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "impressions"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "impressions"));
                if (!generatedefaultlayoutparams7.equals(generatedefaultlayoutparams8)) {
                    StringBuilder sb4 = new StringBuilder("impressions(io.split.android.client.storage.db.ImpressionEntity).\n Expected:\n");
                    sb4.append(generatedefaultlayoutparams7);
                    sb4.append("\n Found:\n");
                    sb4.append(generatedefaultlayoutparams8);
                    return new jumpDrawablesToCurrentState.setMax(false, sb4.toString());
                }
                HashMap hashMap5 = new HashMap(4);
                hashMap5.put("name", new generateDefaultLayoutParams.getMax("name", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap5.put("stringValue", new generateDefaultLayoutParams.getMax("stringValue", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap5.put("longValue", new generateDefaultLayoutParams.getMax("longValue", "INTEGER", true, 0, (String) null, 1));
                hashMap5.put("updated_at", new generateDefaultLayoutParams.getMax("updated_at", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams9 = new generateDefaultLayoutParams("general_info", hashMap5, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams10 = new generateDefaultLayoutParams("general_info", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "general_info"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "general_info"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "general_info"));
                if (!generatedefaultlayoutparams9.equals(generatedefaultlayoutparams10)) {
                    StringBuilder sb5 = new StringBuilder("general_info(io.split.android.client.storage.db.GeneralInfoEntity).\n Expected:\n");
                    sb5.append(generatedefaultlayoutparams9);
                    sb5.append("\n Found:\n");
                    sb5.append(generatedefaultlayoutparams10);
                    return new jumpDrawablesToCurrentState.setMax(false, sb5.toString());
                }
                HashMap hashMap6 = new HashMap(4);
                hashMap6.put("id", new generateDefaultLayoutParams.getMax("id", "INTEGER", true, 1, (String) null, 1));
                hashMap6.put(TtmlNode.TAG_BODY, new generateDefaultLayoutParams.getMax(TtmlNode.TAG_BODY, SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap6.put("created_at", new generateDefaultLayoutParams.getMax("created_at", "INTEGER", true, 0, (String) null, 1));
                hashMap6.put("status", new generateDefaultLayoutParams.getMax("status", "INTEGER", true, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams11 = new generateDefaultLayoutParams("impressions_count", hashMap6, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams12 = new generateDefaultLayoutParams("impressions_count", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "impressions_count"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "impressions_count"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "impressions_count"));
                if (generatedefaultlayoutparams11.equals(generatedefaultlayoutparams12)) {
                    return new jumpDrawablesToCurrentState.setMax(true, (String) null);
                }
                StringBuilder sb6 = new StringBuilder("impressions_count(io.split.android.client.storage.db.ImpressionsCountEntity).\n Expected:\n");
                sb6.append(generatedefaultlayoutparams11);
                sb6.append("\n Found:\n");
                sb6.append(generatedefaultlayoutparams12);
                return new jumpDrawablesToCurrentState.setMax(false, sb6.toString());
            }
        }, "5d5c707f188e620d81e1aba5911902a8", "7c57fe320a30783caad99b3da817b903");
        SupportSQLiteOpenHelper.Configuration.getMax min = SupportSQLiteOpenHelper.Configuration.setMin(setoverridevisibleitems.getMin);
        min.length = setoverridevisibleitems.length;
        min.getMax = jumpdrawablestocurrentstate;
        return setoverridevisibleitems.setMin.create(min.setMax());
    }

    public final getAnimatedVisibility createInvalidationTracker() {
        return new getAnimatedVisibility(this, new HashMap(0), new HashMap(0), "my_segments", "splits", "events", "impressions", "general_info", "impressions_count");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `my_segments`");
            writableDatabase.execSQL("DELETE FROM `splits`");
            writableDatabase.execSQL("DELETE FROM `events`");
            writableDatabase.execSQL("DELETE FROM `impressions`");
            writableDatabase.execSQL("DELETE FROM `general_info`");
            writableDatabase.execSQL("DELETE FROM `impressions_count`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    public final MySegmentDao mySegmentDao() {
        MySegmentDao mySegmentDao;
        if (this._mySegmentDao != null) {
            return this._mySegmentDao;
        }
        synchronized (this) {
            if (this._mySegmentDao == null) {
                this._mySegmentDao = new MySegmentDao_Impl(this);
            }
            mySegmentDao = this._mySegmentDao;
        }
        return mySegmentDao;
    }

    public final SplitDao splitDao() {
        SplitDao splitDao;
        if (this._splitDao != null) {
            return this._splitDao;
        }
        synchronized (this) {
            if (this._splitDao == null) {
                this._splitDao = new SplitDao_Impl(this);
            }
            splitDao = this._splitDao;
        }
        return splitDao;
    }

    public final EventDao eventDao() {
        EventDao eventDao;
        if (this._eventDao != null) {
            return this._eventDao;
        }
        synchronized (this) {
            if (this._eventDao == null) {
                this._eventDao = new EventDao_Impl(this);
            }
            eventDao = this._eventDao;
        }
        return eventDao;
    }

    public final ImpressionDao impressionDao() {
        ImpressionDao impressionDao;
        if (this._impressionDao != null) {
            return this._impressionDao;
        }
        synchronized (this) {
            if (this._impressionDao == null) {
                this._impressionDao = new ImpressionDao_Impl(this);
            }
            impressionDao = this._impressionDao;
        }
        return impressionDao;
    }

    public final GeneralInfoDao generalInfoDao() {
        GeneralInfoDao generalInfoDao;
        if (this._generalInfoDao != null) {
            return this._generalInfoDao;
        }
        synchronized (this) {
            if (this._generalInfoDao == null) {
                this._generalInfoDao = new GeneralInfoDao_Impl(this);
            }
            generalInfoDao = this._generalInfoDao;
        }
        return generalInfoDao;
    }

    public final ImpressionsCountDao impressionsCountDao() {
        ImpressionsCountDao impressionsCountDao;
        if (this._impressionsCountDao != null) {
            return this._impressionsCountDao;
        }
        synchronized (this) {
            if (this._impressionsCountDao == null) {
                this._impressionsCountDao = new ImpressionsCountDao_Impl(this);
            }
            impressionsCountDao = this._impressionsCountDao;
        }
        return impressionsCountDao;
    }
}
