package androidx.work.impl;

import android.os.Build;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o.AppCompatRatingBar;
import o.AppCompatSeekBar;
import o.AppCompatSpinner;
import o.compatMeasureContentWidth;
import o.generateDefaultLayoutParams;
import o.getAnimatedVisibility;
import o.getDropDownHorizontalOffset;
import o.getDropDownWidth;
import o.getPopupBackground;
import o.getPrompt;
import o.jumpDrawablesToCurrentState;
import o.setDropDownVerticalOffset;
import o.setDropDownWidth;
import o.setFirstBaselineToTopHeight;
import o.setLastBaselineToBottomHeight;
import o.setOverrideVisibleItems;
import o.setPopupBackgroundDrawable;
import o.setPopupBackgroundResource;
import o.setSubtitle;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile setDropDownVerticalOffset equals;
    private volatile setFirstBaselineToTopHeight getMax;
    private volatile compatMeasureContentWidth getMin;
    private volatile getDropDownHorizontalOffset isInside;
    private volatile setDropDownWidth length;
    private volatile setPopupBackgroundResource setMax;
    private volatile AppCompatRatingBar setMin;

    public final SupportSQLiteOpenHelper createOpenHelper(setOverrideVisibleItems setoverridevisibleitems) {
        jumpDrawablesToCurrentState jumpdrawablestocurrentstate = new jumpDrawablesToCurrentState(setoverridevisibleitems, new jumpDrawablesToCurrentState.getMin() {
            public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
            }

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
                if (WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        WorkDatabase_Impl.this.mCallbacks.get(i);
                    }
                }
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        WorkDatabase_Impl.this.mCallbacks.get(i);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase unused = WorkDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                supportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.length) WorkDatabase_Impl.this.mCallbacks.get(i)).length(supportSQLiteDatabase);
                    }
                }
            }

            public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                setSubtitle.setMin(supportSQLiteDatabase);
            }

            public final jumpDrawablesToCurrentState.setMax onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new generateDefaultLayoutParams.getMax("work_spec_id", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap.put("prerequisite_id", new generateDefaultLayoutParams.getMax("prerequisite_id", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 2, (String) null, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new generateDefaultLayoutParams.getMin("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                hashSet.add(new generateDefaultLayoutParams.getMin("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new generateDefaultLayoutParams.setMin("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                hashSet2.add(new generateDefaultLayoutParams.setMin("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
                generateDefaultLayoutParams generatedefaultlayoutparams = new generateDefaultLayoutParams("Dependency", hashMap, hashSet, hashSet2);
                generateDefaultLayoutParams generatedefaultlayoutparams2 = new generateDefaultLayoutParams("Dependency", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "Dependency"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "Dependency"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "Dependency"));
                if (!generatedefaultlayoutparams.equals(generatedefaultlayoutparams2)) {
                    StringBuilder sb = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                    sb.append(generatedefaultlayoutparams);
                    sb.append("\n Found:\n");
                    sb.append(generatedefaultlayoutparams2);
                    return new jumpDrawablesToCurrentState.setMax(false, sb.toString());
                }
                HashMap hashMap2 = new HashMap(24);
                hashMap2.put("id", new generateDefaultLayoutParams.getMax("id", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap2.put("state", new generateDefaultLayoutParams.getMax("state", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("worker_class_name", new generateDefaultLayoutParams.getMax("worker_class_name", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 0, (String) null, 1));
                hashMap2.put("input_merger_class_name", new generateDefaultLayoutParams.getMax("input_merger_class_name", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, false, 0, (String) null, 1));
                hashMap2.put("input", new generateDefaultLayoutParams.getMax("input", "BLOB", true, 0, (String) null, 1));
                hashMap2.put(TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, new generateDefaultLayoutParams.getMax(TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "BLOB", true, 0, (String) null, 1));
                hashMap2.put("initial_delay", new generateDefaultLayoutParams.getMax("initial_delay", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("interval_duration", new generateDefaultLayoutParams.getMax("interval_duration", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("flex_duration", new generateDefaultLayoutParams.getMax("flex_duration", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("run_attempt_count", new generateDefaultLayoutParams.getMax("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("backoff_policy", new generateDefaultLayoutParams.getMax("backoff_policy", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("backoff_delay_duration", new generateDefaultLayoutParams.getMax("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("period_start_time", new generateDefaultLayoutParams.getMax("period_start_time", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("minimum_retention_duration", new generateDefaultLayoutParams.getMax("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("schedule_requested_at", new generateDefaultLayoutParams.getMax("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("run_in_foreground", new generateDefaultLayoutParams.getMax("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("required_network_type", new generateDefaultLayoutParams.getMax("required_network_type", "INTEGER", false, 0, (String) null, 1));
                hashMap2.put("requires_charging", new generateDefaultLayoutParams.getMax("requires_charging", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("requires_device_idle", new generateDefaultLayoutParams.getMax("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("requires_battery_not_low", new generateDefaultLayoutParams.getMax("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("requires_storage_not_low", new generateDefaultLayoutParams.getMax("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("trigger_content_update_delay", new generateDefaultLayoutParams.getMax("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("trigger_max_content_delay", new generateDefaultLayoutParams.getMax("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("content_uri_triggers", new generateDefaultLayoutParams.getMax("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new generateDefaultLayoutParams.setMin("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
                hashSet4.add(new generateDefaultLayoutParams.setMin("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
                generateDefaultLayoutParams generatedefaultlayoutparams3 = new generateDefaultLayoutParams("WorkSpec", hashMap2, hashSet3, hashSet4);
                generateDefaultLayoutParams generatedefaultlayoutparams4 = new generateDefaultLayoutParams("WorkSpec", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "WorkSpec"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "WorkSpec"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "WorkSpec"));
                if (!generatedefaultlayoutparams3.equals(generatedefaultlayoutparams4)) {
                    StringBuilder sb2 = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    sb2.append(generatedefaultlayoutparams3);
                    sb2.append("\n Found:\n");
                    sb2.append(generatedefaultlayoutparams4);
                    return new jumpDrawablesToCurrentState.setMax(false, sb2.toString());
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new generateDefaultLayoutParams.getMax("tag", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap3.put("work_spec_id", new generateDefaultLayoutParams.getMax("work_spec_id", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 2, (String) null, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new generateDefaultLayoutParams.getMin("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new generateDefaultLayoutParams.setMin("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                generateDefaultLayoutParams generatedefaultlayoutparams5 = new generateDefaultLayoutParams("WorkTag", hashMap3, hashSet5, hashSet6);
                generateDefaultLayoutParams generatedefaultlayoutparams6 = new generateDefaultLayoutParams("WorkTag", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "WorkTag"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "WorkTag"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "WorkTag"));
                if (!generatedefaultlayoutparams5.equals(generatedefaultlayoutparams6)) {
                    StringBuilder sb3 = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                    sb3.append(generatedefaultlayoutparams5);
                    sb3.append("\n Found:\n");
                    sb3.append(generatedefaultlayoutparams6);
                    return new jumpDrawablesToCurrentState.setMax(false, sb3.toString());
                }
                HashMap hashMap4 = new HashMap(2);
                hashMap4.put("work_spec_id", new generateDefaultLayoutParams.getMax("work_spec_id", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap4.put("system_id", new generateDefaultLayoutParams.getMax("system_id", "INTEGER", true, 0, (String) null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new generateDefaultLayoutParams.getMin("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                generateDefaultLayoutParams generatedefaultlayoutparams7 = new generateDefaultLayoutParams("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams8 = new generateDefaultLayoutParams("SystemIdInfo", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "SystemIdInfo"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "SystemIdInfo"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "SystemIdInfo"));
                if (!generatedefaultlayoutparams7.equals(generatedefaultlayoutparams8)) {
                    StringBuilder sb4 = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                    sb4.append(generatedefaultlayoutparams7);
                    sb4.append("\n Found:\n");
                    sb4.append(generatedefaultlayoutparams8);
                    return new jumpDrawablesToCurrentState.setMax(false, sb4.toString());
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("name", new generateDefaultLayoutParams.getMax("name", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap5.put("work_spec_id", new generateDefaultLayoutParams.getMax("work_spec_id", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 2, (String) null, 1));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new generateDefaultLayoutParams.getMin("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new generateDefaultLayoutParams.setMin("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                generateDefaultLayoutParams generatedefaultlayoutparams9 = new generateDefaultLayoutParams("WorkName", hashMap5, hashSet8, hashSet9);
                generateDefaultLayoutParams generatedefaultlayoutparams10 = new generateDefaultLayoutParams("WorkName", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "WorkName"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "WorkName"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "WorkName"));
                if (!generatedefaultlayoutparams9.equals(generatedefaultlayoutparams10)) {
                    StringBuilder sb5 = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                    sb5.append(generatedefaultlayoutparams9);
                    sb5.append("\n Found:\n");
                    sb5.append(generatedefaultlayoutparams10);
                    return new jumpDrawablesToCurrentState.setMax(false, sb5.toString());
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("work_spec_id", new generateDefaultLayoutParams.getMax("work_spec_id", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap6.put(RVParams.PROGRESS, new generateDefaultLayoutParams.getMax(RVParams.PROGRESS, "BLOB", true, 0, (String) null, 1));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new generateDefaultLayoutParams.getMin("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                generateDefaultLayoutParams generatedefaultlayoutparams11 = new generateDefaultLayoutParams("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams12 = new generateDefaultLayoutParams("WorkProgress", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "WorkProgress"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "WorkProgress"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "WorkProgress"));
                if (!generatedefaultlayoutparams11.equals(generatedefaultlayoutparams12)) {
                    StringBuilder sb6 = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                    sb6.append(generatedefaultlayoutparams11);
                    sb6.append("\n Found:\n");
                    sb6.append(generatedefaultlayoutparams12);
                    return new jumpDrawablesToCurrentState.setMax(false, sb6.toString());
                }
                HashMap hashMap7 = new HashMap(2);
                hashMap7.put("key", new generateDefaultLayoutParams.getMax("key", SecurityConstants.KEY_DISPLAY_TYPE_TEXT, true, 1, (String) null, 1));
                hashMap7.put("long_value", new generateDefaultLayoutParams.getMax("long_value", "INTEGER", false, 0, (String) null, 1));
                generateDefaultLayoutParams generatedefaultlayoutparams13 = new generateDefaultLayoutParams("Preference", hashMap7, new HashSet(0), new HashSet(0));
                generateDefaultLayoutParams generatedefaultlayoutparams14 = new generateDefaultLayoutParams("Preference", generateDefaultLayoutParams.length(supportSQLiteDatabase2, "Preference"), generateDefaultLayoutParams.setMax(supportSQLiteDatabase2, "Preference"), generateDefaultLayoutParams.getMax(supportSQLiteDatabase2, "Preference"));
                if (generatedefaultlayoutparams13.equals(generatedefaultlayoutparams14)) {
                    return new jumpDrawablesToCurrentState.setMax(true, (String) null);
                }
                StringBuilder sb7 = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                sb7.append(generatedefaultlayoutparams13);
                sb7.append("\n Found:\n");
                sb7.append(generatedefaultlayoutparams14);
                return new jumpDrawablesToCurrentState.setMax(false, sb7.toString());
            }
        }, "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e");
        SupportSQLiteOpenHelper.Configuration.getMax min = SupportSQLiteOpenHelper.Configuration.setMin(setoverridevisibleitems.getMin);
        min.length = setoverridevisibleitems.length;
        min.getMax = jumpdrawablestocurrentstate;
        return setoverridevisibleitems.setMin.create(min.setMax());
    }

    public final getAnimatedVisibility createInvalidationTracker() {
        return new getAnimatedVisibility(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                writableDatabase.execSQL("PRAGMA foreign_keys = FALSE");
            } catch (Throwable th) {
                super.endTransaction();
                if (!z) {
                    writableDatabase.execSQL("PRAGMA foreign_keys = TRUE");
                }
                writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
                if (!writableDatabase.inTransaction()) {
                    writableDatabase.execSQL("VACUUM");
                }
                throw th;
            }
        }
        super.beginTransaction();
        if (z) {
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
        }
        writableDatabase.execSQL("DELETE FROM `Dependency`");
        writableDatabase.execSQL("DELETE FROM `WorkSpec`");
        writableDatabase.execSQL("DELETE FROM `WorkTag`");
        writableDatabase.execSQL("DELETE FROM `SystemIdInfo`");
        writableDatabase.execSQL("DELETE FROM `WorkName`");
        writableDatabase.execSQL("DELETE FROM `WorkProgress`");
        writableDatabase.execSQL("DELETE FROM `Preference`");
        super.setTransactionSuccessful();
        super.endTransaction();
        if (!z) {
            writableDatabase.execSQL("PRAGMA foreign_keys = TRUE");
        }
        writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
        if (!writableDatabase.inTransaction()) {
            writableDatabase.execSQL("VACUUM");
        }
    }

    public final compatMeasureContentWidth getMax() {
        compatMeasureContentWidth compatmeasurecontentwidth;
        if (this.getMin != null) {
            return this.getMin;
        }
        synchronized (this) {
            if (this.getMin == null) {
                this.getMin = new getPrompt(this);
            }
            compatmeasurecontentwidth = this.getMin;
        }
        return compatmeasurecontentwidth;
    }

    public final AppCompatRatingBar length() {
        AppCompatRatingBar appCompatRatingBar;
        if (this.setMin != null) {
            return this.setMin;
        }
        synchronized (this) {
            if (this.setMin == null) {
                this.setMin = new AppCompatSeekBar(this);
            }
            appCompatRatingBar = this.setMin;
        }
        return appCompatRatingBar;
    }

    public final setFirstBaselineToTopHeight setMin() {
        setFirstBaselineToTopHeight setfirstbaselinetotopheight;
        if (this.getMax != null) {
            return this.getMax;
        }
        synchronized (this) {
            if (this.getMax == null) {
                this.getMax = new setLastBaselineToBottomHeight(this);
            }
            setfirstbaselinetotopheight = this.getMax;
        }
        return setfirstbaselinetotopheight;
    }

    public final setPopupBackgroundResource getMin() {
        setPopupBackgroundResource setpopupbackgroundresource;
        if (this.setMax != null) {
            return this.setMax;
        }
        synchronized (this) {
            if (this.setMax == null) {
                this.setMax = new getPopupBackground(this);
            }
            setpopupbackgroundresource = this.setMax;
        }
        return setpopupbackgroundresource;
    }

    public final setDropDownWidth toIntRange() {
        setDropDownWidth setdropdownwidth;
        if (this.length != null) {
            return this.length;
        }
        synchronized (this) {
            if (this.length == null) {
                this.length = new getDropDownWidth(this);
            }
            setdropdownwidth = this.length;
        }
        return setdropdownwidth;
    }

    public final getDropDownHorizontalOffset equals() {
        getDropDownHorizontalOffset getdropdownhorizontaloffset;
        if (this.isInside != null) {
            return this.isInside;
        }
        synchronized (this) {
            if (this.isInside == null) {
                this.isInside = new AppCompatSpinner.SavedState(this);
            }
            getdropdownhorizontaloffset = this.isInside;
        }
        return getdropdownhorizontaloffset;
    }

    public final setDropDownVerticalOffset isInside() {
        setDropDownVerticalOffset setdropdownverticaloffset;
        if (this.equals != null) {
            return this.equals;
        }
        synchronized (this) {
            if (this.equals == null) {
                this.equals = new setPopupBackgroundDrawable(this);
            }
            setdropdownverticaloffset = this.equals;
        }
        return setdropdownverticaloffset;
    }
}
