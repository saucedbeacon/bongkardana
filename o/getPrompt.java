package o;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import o.getFirstBaselineToTopHeight;
import o.getInternalPopup;

public final class getPrompt implements compatMeasureContentWidth {
    private final startActionModeForChild IsOverlapping;
    private final startActionModeForChild equals;
    private final setHeaderTitle<getInternalPopup> getMax;
    private final startActionModeForChild getMin;
    private final startActionModeForChild isInside;
    private final startActionModeForChild length;
    private final startActionModeForChild setMax;
    final RoomDatabase setMin;
    private final startActionModeForChild toFloatRange;
    private final startActionModeForChild toIntRange;

    public getPrompt(RoomDatabase roomDatabase) {
        this.setMin = roomDatabase;
        this.getMax = new setHeaderTitle<getInternalPopup>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                int i;
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                getInternalPopup getinternalpopup = (getInternalPopup) obj;
                int i2 = 1;
                if (getinternalpopup.getMax == null) {
                    supportSQLiteStatement2.bindNull(1);
                } else {
                    supportSQLiteStatement2.bindString(1, getinternalpopup.getMax);
                }
                supportSQLiteStatement2.bindLong(2, (long) getFirstBaselineToTopHeight.setMin(getinternalpopup.getMin));
                if (getinternalpopup.setMax == null) {
                    supportSQLiteStatement2.bindNull(3);
                } else {
                    supportSQLiteStatement2.bindString(3, getinternalpopup.setMax);
                }
                if (getinternalpopup.length == null) {
                    supportSQLiteStatement2.bindNull(4);
                } else {
                    supportSQLiteStatement2.bindString(4, getinternalpopup.length);
                }
                byte[] max = updateAppearance.setMax(getinternalpopup.setMin);
                if (max == null) {
                    supportSQLiteStatement2.bindNull(5);
                } else {
                    supportSQLiteStatement2.bindBlob(5, max);
                }
                byte[] max2 = updateAppearance.setMax(getinternalpopup.toIntRange);
                if (max2 == null) {
                    supportSQLiteStatement2.bindNull(6);
                } else {
                    supportSQLiteStatement2.bindBlob(6, max2);
                }
                supportSQLiteStatement2.bindLong(7, getinternalpopup.IsOverlapping);
                supportSQLiteStatement2.bindLong(8, getinternalpopup.isInside);
                supportSQLiteStatement2.bindLong(9, getinternalpopup.equals);
                supportSQLiteStatement2.bindLong(10, (long) getinternalpopup.values);
                BackoffPolicy backoffPolicy = getinternalpopup.FastBitmap$CoordinateSystem;
                int i3 = getFirstBaselineToTopHeight.AnonymousClass2.getMin[backoffPolicy.ordinal()];
                if (i3 == 1) {
                    i = 0;
                } else if (i3 == 2) {
                    i = 1;
                } else {
                    StringBuilder sb = new StringBuilder("Could not convert ");
                    sb.append(backoffPolicy);
                    sb.append(" to int");
                    throw new IllegalArgumentException(sb.toString());
                }
                supportSQLiteStatement2.bindLong(11, (long) i);
                supportSQLiteStatement2.bindLong(12, getinternalpopup.toString);
                supportSQLiteStatement2.bindLong(13, getinternalpopup.toDoubleRange);
                supportSQLiteStatement2.bindLong(14, getinternalpopup.hashCode);
                supportSQLiteStatement2.bindLong(15, getinternalpopup.invoke);
                supportSQLiteStatement2.bindLong(16, getinternalpopup.valueOf ? 1 : 0);
                setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = getinternalpopup.toFloatRange;
                if (setdefaultactionbuttoncontentdescription != null) {
                    NetworkType networkType = setdefaultactionbuttoncontentdescription.length;
                    int i4 = getFirstBaselineToTopHeight.AnonymousClass2.setMax[networkType.ordinal()];
                    if (i4 == 1) {
                        i2 = 0;
                    } else if (i4 != 2) {
                        if (i4 == 3) {
                            i2 = 2;
                        } else if (i4 == 4) {
                            i2 = 3;
                        } else if (i4 == 5) {
                            i2 = 4;
                        } else {
                            StringBuilder sb2 = new StringBuilder("Could not convert ");
                            sb2.append(networkType);
                            sb2.append(" to int");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                    supportSQLiteStatement2.bindLong(17, (long) i2);
                    supportSQLiteStatement2.bindLong(18, setdefaultactionbuttoncontentdescription.length() ? 1 : 0);
                    supportSQLiteStatement2.bindLong(19, setdefaultactionbuttoncontentdescription.setMin() ? 1 : 0);
                    supportSQLiteStatement2.bindLong(20, setdefaultactionbuttoncontentdescription.getMin() ? 1 : 0);
                    supportSQLiteStatement2.bindLong(21, setdefaultactionbuttoncontentdescription.getMax() ? 1 : 0);
                    supportSQLiteStatement2.bindLong(22, setdefaultactionbuttoncontentdescription.isInside);
                    supportSQLiteStatement2.bindLong(23, setdefaultactionbuttoncontentdescription.IsOverlapping);
                    byte[] max3 = getFirstBaselineToTopHeight.getMax(setdefaultactionbuttoncontentdescription.equals);
                    if (max3 == null) {
                        supportSQLiteStatement2.bindNull(24);
                    } else {
                        supportSQLiteStatement2.bindBlob(24, max3);
                    }
                } else {
                    supportSQLiteStatement2.bindNull(17);
                    supportSQLiteStatement2.bindNull(18);
                    supportSQLiteStatement2.bindNull(19);
                    supportSQLiteStatement2.bindNull(20);
                    supportSQLiteStatement2.bindNull(21);
                    supportSQLiteStatement2.bindNull(22);
                    supportSQLiteStatement2.bindNull(23);
                    supportSQLiteStatement2.bindNull(24);
                }
            }
        };
        this.setMax = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.getMin = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.length = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.isInside = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.toIntRange = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.IsOverlapping = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.toFloatRange = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.equals = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    public final void setMax(getInternalPopup getinternalpopup) {
        this.setMin.assertNotSuspendingTransaction();
        this.setMin.beginTransaction();
        try {
            this.getMax.insert(getinternalpopup);
            this.setMin.setTransactionSuccessful();
        } finally {
            this.setMin.endTransaction();
        }
    }

    public final void getMin(String str) {
        this.setMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.setMax.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.setMin.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
        } finally {
            this.setMin.endTransaction();
            this.setMax.release(acquire);
        }
    }

    public final void getMin(String str, updateAppearance updateappearance) {
        this.setMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.getMin.acquire();
        byte[] max = updateAppearance.setMax(updateappearance);
        if (max == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, max);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.setMin.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
        } finally {
            this.setMin.endTransaction();
            this.getMin.release(acquire);
        }
    }

    public final void length(String str, long j) {
        this.setMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.length.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.setMin.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
        } finally {
            this.setMin.endTransaction();
            this.length.release(acquire);
        }
    }

    public final int setMin(String str) {
        this.setMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.isInside.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.setMin.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.setMin.endTransaction();
            this.isInside.release(acquire);
        }
    }

    public final int setMax(String str) {
        this.setMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.toIntRange.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.setMin.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.setMin.endTransaction();
            this.toIntRange.release(acquire);
        }
    }

    public final int getMin(String str, long j) {
        this.setMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.IsOverlapping.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.setMin.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.setMin.endTransaction();
            this.IsOverlapping.release(acquire);
        }
    }

    public final int setMin() {
        this.setMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.toFloatRange.acquire();
        this.setMin.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.setMin.endTransaction();
            this.toFloatRange.release(acquire);
        }
    }

    public final getInternalPopup length(String str) {
        setSplitBackground setsplitbackground;
        getInternalPopup getinternalpopup;
        String str2 = str;
        setSplitBackground max = setSplitBackground.setMax("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str2);
        }
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            int max3 = getTitle.setMax(max2, "required_network_type");
            int max4 = getTitle.setMax(max2, "requires_charging");
            int max5 = getTitle.setMax(max2, "requires_device_idle");
            int max6 = getTitle.setMax(max2, "requires_battery_not_low");
            int max7 = getTitle.setMax(max2, "requires_storage_not_low");
            int max8 = getTitle.setMax(max2, "trigger_content_update_delay");
            int max9 = getTitle.setMax(max2, "trigger_max_content_delay");
            int max10 = getTitle.setMax(max2, "content_uri_triggers");
            int max11 = getTitle.setMax(max2, "id");
            int max12 = getTitle.setMax(max2, "state");
            int max13 = getTitle.setMax(max2, "worker_class_name");
            int max14 = getTitle.setMax(max2, "input_merger_class_name");
            int max15 = getTitle.setMax(max2, "input");
            int max16 = getTitle.setMax(max2, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "initial_delay");
                int max18 = getTitle.setMax(max2, "interval_duration");
                int max19 = getTitle.setMax(max2, "flex_duration");
                int max20 = getTitle.setMax(max2, "run_attempt_count");
                int max21 = getTitle.setMax(max2, "backoff_policy");
                int max22 = getTitle.setMax(max2, "backoff_delay_duration");
                int max23 = getTitle.setMax(max2, "period_start_time");
                int max24 = getTitle.setMax(max2, "minimum_retention_duration");
                int max25 = getTitle.setMax(max2, "schedule_requested_at");
                int max26 = getTitle.setMax(max2, "run_in_foreground");
                if (max2.moveToFirst()) {
                    String string = max2.getString(max11);
                    String string2 = max2.getString(max13);
                    int i = max26;
                    setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = new setDefaultActionButtonContentDescription();
                    setdefaultactionbuttoncontentdescription.length = getFirstBaselineToTopHeight.setMax(max2.getInt(max3));
                    setdefaultactionbuttoncontentdescription.setMax = max2.getInt(max4) != 0;
                    setdefaultactionbuttoncontentdescription.getMin = max2.getInt(max5) != 0;
                    setdefaultactionbuttoncontentdescription.setMin = max2.getInt(max6) != 0;
                    setdefaultactionbuttoncontentdescription.toFloatRange = max2.getInt(max7) != 0;
                    setdefaultactionbuttoncontentdescription.isInside = max2.getLong(max8);
                    setdefaultactionbuttoncontentdescription.IsOverlapping = max2.getLong(max9);
                    setdefaultactionbuttoncontentdescription.equals = getFirstBaselineToTopHeight.getMax(max2.getBlob(max10));
                    getinternalpopup = new getInternalPopup(string, string2);
                    getinternalpopup.getMin = getFirstBaselineToTopHeight.getMax(max2.getInt(max12));
                    getinternalpopup.length = max2.getString(max14);
                    getinternalpopup.setMin = updateAppearance.setMin(max2.getBlob(max15));
                    getinternalpopup.toIntRange = updateAppearance.setMin(max2.getBlob(max16));
                    getinternalpopup.IsOverlapping = max2.getLong(max17);
                    getinternalpopup.isInside = max2.getLong(max18);
                    getinternalpopup.equals = max2.getLong(max19);
                    getinternalpopup.values = max2.getInt(max20);
                    getinternalpopup.FastBitmap$CoordinateSystem = getFirstBaselineToTopHeight.setMin(max2.getInt(max21));
                    getinternalpopup.toString = max2.getLong(max22);
                    getinternalpopup.toDoubleRange = max2.getLong(max23);
                    getinternalpopup.hashCode = max2.getLong(max24);
                    getinternalpopup.invoke = max2.getLong(max25);
                    getinternalpopup.valueOf = max2.getInt(i) != 0;
                    getinternalpopup.toFloatRange = setdefaultactionbuttoncontentdescription;
                } else {
                    getinternalpopup = null;
                }
                max2.close();
                setsplitbackground.getMin();
                return getinternalpopup;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<getInternalPopup.setMax> getMax(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            int max3 = getTitle.setMax(max2, "id");
            int max4 = getTitle.setMax(max2, "state");
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                getInternalPopup.setMax setmax = new getInternalPopup.setMax();
                setmax.getMax = max2.getString(max3);
                setmax.setMin = getFirstBaselineToTopHeight.getMax(max2.getInt(max4));
                arrayList.add(setmax);
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final WorkInfo.State toFloatRange(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            return max2.moveToFirst() ? getFirstBaselineToTopHeight.getMax(max2.getInt(0)) : null;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final LiveData<List<getInternalPopup.length>> IsOverlapping(String str) {
        final setSplitBackground max = setSplitBackground.setMax("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        getAnimatedVisibility invalidationTracker = this.setMin.getInvalidationTracker();
        AnonymousClass5 r2 = new Callable<List<getInternalPopup.length>>() {
            /* access modifiers changed from: private */
            /* renamed from: setMin */
            public List<getInternalPopup.length> call() throws Exception {
                Cursor max;
                getPrompt.this.setMin.beginTransaction();
                try {
                    max = setSubtitle.getMax(getPrompt.this.setMin, max, true);
                    int max2 = getTitle.setMax(max, "id");
                    int max3 = getTitle.setMax(max, "state");
                    int max4 = getTitle.setMax(max, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
                    int max5 = getTitle.setMax(max, "run_attempt_count");
                    PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat();
                    PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat();
                    while (max.moveToNext()) {
                        if (!max.isNull(max2)) {
                            String string = max.getString(max2);
                            if (((ArrayList) playbackStateCompat.get(string)) == null) {
                                playbackStateCompat.put(string, new ArrayList());
                            }
                        }
                        if (!max.isNull(max2)) {
                            String string2 = max.getString(max2);
                            if (((ArrayList) playbackStateCompat2.get(string2)) == null) {
                                playbackStateCompat2.put(string2, new ArrayList());
                            }
                        }
                    }
                    max.moveToPosition(-1);
                    getPrompt.this.length((PlaybackStateCompat<String, ArrayList<String>>) playbackStateCompat);
                    getPrompt.this.getMax((PlaybackStateCompat<String, ArrayList<updateAppearance>>) playbackStateCompat2);
                    ArrayList arrayList = new ArrayList(max.getCount());
                    while (max.moveToNext()) {
                        ArrayList arrayList2 = null;
                        ArrayList arrayList3 = !max.isNull(max2) ? (ArrayList) playbackStateCompat.get(max.getString(max2)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        if (!max.isNull(max2)) {
                            arrayList2 = (ArrayList) playbackStateCompat2.get(max.getString(max2));
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        getInternalPopup.length length = new getInternalPopup.length();
                        length.setMin = max.getString(max2);
                        length.length = getFirstBaselineToTopHeight.getMax(max.getInt(max3));
                        length.getMin = updateAppearance.setMin(max.getBlob(max4));
                        length.setMax = max.getInt(max5);
                        length.getMax = arrayList3;
                        length.IsOverlapping = arrayList2;
                        arrayList.add(length);
                    }
                    getPrompt.this.setMin.setTransactionSuccessful();
                    max.close();
                    getPrompt.this.setMin.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    getPrompt.this.setMin.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                max.getMin();
            }
        };
        getParentMenu getparentmenu = invalidationTracker.toIntRange;
        String[] length2 = invalidationTracker.length(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"});
        int length3 = length2.length;
        int i = 0;
        while (i < length3) {
            String str2 = length2[i];
            if (invalidationTracker.setMax.containsKey(str2.toLowerCase(Locale.US))) {
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
        }
        return new setStackedBackground(getparentmenu.getMax, getparentmenu, r2, length2);
    }

    public final List<getInternalPopup.length> isInside(String str) {
        Cursor max;
        setSplitBackground max2 = setSplitBackground.setMax("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            max2.bindNull(1);
        } else {
            max2.bindString(1, str);
        }
        this.setMin.assertNotSuspendingTransaction();
        this.setMin.beginTransaction();
        try {
            max = setSubtitle.getMax(this.setMin, max2, true);
            int max3 = getTitle.setMax(max, "id");
            int max4 = getTitle.setMax(max, "state");
            int max5 = getTitle.setMax(max, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
            int max6 = getTitle.setMax(max, "run_attempt_count");
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat();
            PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat();
            while (max.moveToNext()) {
                if (!max.isNull(max3)) {
                    String string = max.getString(max3);
                    if (((ArrayList) playbackStateCompat.get(string)) == null) {
                        playbackStateCompat.put(string, new ArrayList());
                    }
                }
                if (!max.isNull(max3)) {
                    String string2 = max.getString(max3);
                    if (((ArrayList) playbackStateCompat2.get(string2)) == null) {
                        playbackStateCompat2.put(string2, new ArrayList());
                    }
                }
            }
            max.moveToPosition(-1);
            length((PlaybackStateCompat<String, ArrayList<String>>) playbackStateCompat);
            getMax((PlaybackStateCompat<String, ArrayList<updateAppearance>>) playbackStateCompat2);
            ArrayList arrayList = new ArrayList(max.getCount());
            while (max.moveToNext()) {
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = !max.isNull(max3) ? (ArrayList) playbackStateCompat.get(max.getString(max3)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                if (!max.isNull(max3)) {
                    arrayList2 = (ArrayList) playbackStateCompat2.get(max.getString(max3));
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                getInternalPopup.length length2 = new getInternalPopup.length();
                length2.setMin = max.getString(max3);
                length2.length = getFirstBaselineToTopHeight.getMax(max.getInt(max4));
                length2.getMin = updateAppearance.setMin(max.getBlob(max5));
                length2.setMax = max.getInt(max6);
                length2.getMax = arrayList3;
                length2.IsOverlapping = arrayList2;
                arrayList.add(length2);
            }
            this.setMin.setTransactionSuccessful();
            max.close();
            max2.getMin();
            this.setMin.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.setMin.endTransaction();
            throw th;
        }
    }

    public final List<updateAppearance> toIntRange(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                arrayList.add(updateAppearance.setMin(max2.getBlob(0)));
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<String> equals(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                arrayList.add(max2.getString(0));
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<String> length() {
        setSplitBackground max = setSplitBackground.setMax("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                arrayList.add(max2.getString(0));
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<getInternalPopup> getMin(int i) {
        setSplitBackground setsplitbackground;
        setSplitBackground max = setSplitBackground.setMax("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        max.bindLong(1, (long) i);
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            int max3 = getTitle.setMax(max2, "required_network_type");
            int max4 = getTitle.setMax(max2, "requires_charging");
            int max5 = getTitle.setMax(max2, "requires_device_idle");
            int max6 = getTitle.setMax(max2, "requires_battery_not_low");
            int max7 = getTitle.setMax(max2, "requires_storage_not_low");
            int max8 = getTitle.setMax(max2, "trigger_content_update_delay");
            int max9 = getTitle.setMax(max2, "trigger_max_content_delay");
            int max10 = getTitle.setMax(max2, "content_uri_triggers");
            int max11 = getTitle.setMax(max2, "id");
            int max12 = getTitle.setMax(max2, "state");
            int max13 = getTitle.setMax(max2, "worker_class_name");
            int max14 = getTitle.setMax(max2, "input_merger_class_name");
            int max15 = getTitle.setMax(max2, "input");
            int max16 = getTitle.setMax(max2, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "initial_delay");
                int max18 = getTitle.setMax(max2, "interval_duration");
                int max19 = getTitle.setMax(max2, "flex_duration");
                int max20 = getTitle.setMax(max2, "run_attempt_count");
                int max21 = getTitle.setMax(max2, "backoff_policy");
                int max22 = getTitle.setMax(max2, "backoff_delay_duration");
                int max23 = getTitle.setMax(max2, "period_start_time");
                int max24 = getTitle.setMax(max2, "minimum_retention_duration");
                int max25 = getTitle.setMax(max2, "schedule_requested_at");
                int max26 = getTitle.setMax(max2, "run_in_foreground");
                int i2 = max16;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String string = max2.getString(max11);
                    int i3 = max11;
                    String string2 = max2.getString(max13);
                    int i4 = max13;
                    setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = new setDefaultActionButtonContentDescription();
                    int i5 = max3;
                    setdefaultactionbuttoncontentdescription.length = getFirstBaselineToTopHeight.setMax(max2.getInt(max3));
                    setdefaultactionbuttoncontentdescription.setMax = max2.getInt(max4) != 0;
                    setdefaultactionbuttoncontentdescription.getMin = max2.getInt(max5) != 0;
                    setdefaultactionbuttoncontentdescription.setMin = max2.getInt(max6) != 0;
                    setdefaultactionbuttoncontentdescription.toFloatRange = max2.getInt(max7) != 0;
                    int i6 = max4;
                    setdefaultactionbuttoncontentdescription.isInside = max2.getLong(max8);
                    setdefaultactionbuttoncontentdescription.IsOverlapping = max2.getLong(max9);
                    setdefaultactionbuttoncontentdescription.equals = getFirstBaselineToTopHeight.getMax(max2.getBlob(max10));
                    getInternalPopup getinternalpopup = new getInternalPopup(string, string2);
                    getinternalpopup.getMin = getFirstBaselineToTopHeight.getMax(max2.getInt(max12));
                    getinternalpopup.length = max2.getString(max14);
                    getinternalpopup.setMin = updateAppearance.setMin(max2.getBlob(max15));
                    int i7 = i2;
                    getinternalpopup.toIntRange = updateAppearance.setMin(max2.getBlob(i7));
                    int i8 = max14;
                    i2 = i7;
                    int i9 = max17;
                    getinternalpopup.IsOverlapping = max2.getLong(i9);
                    max17 = i9;
                    int i10 = max18;
                    getinternalpopup.isInside = max2.getLong(i10);
                    max18 = i10;
                    int i11 = max19;
                    getinternalpopup.equals = max2.getLong(i11);
                    int i12 = max20;
                    getinternalpopup.values = max2.getInt(i12);
                    int i13 = max21;
                    max20 = i12;
                    getinternalpopup.FastBitmap$CoordinateSystem = getFirstBaselineToTopHeight.setMin(max2.getInt(i13));
                    max19 = i11;
                    int i14 = max5;
                    int i15 = max22;
                    getinternalpopup.toString = max2.getLong(i15);
                    max22 = i15;
                    int i16 = max23;
                    getinternalpopup.toDoubleRange = max2.getLong(i16);
                    max23 = i16;
                    int i17 = max24;
                    getinternalpopup.hashCode = max2.getLong(i17);
                    max24 = i17;
                    int i18 = i13;
                    int i19 = max25;
                    getinternalpopup.invoke = max2.getLong(i19);
                    int i20 = max26;
                    getinternalpopup.valueOf = max2.getInt(i20) != 0;
                    getinternalpopup.toFloatRange = setdefaultactionbuttoncontentdescription;
                    arrayList.add(getinternalpopup);
                    max26 = i20;
                    max25 = i19;
                    max14 = i8;
                    max11 = i3;
                    max13 = i4;
                    max4 = i6;
                    max3 = i5;
                    int i21 = i14;
                    max21 = i18;
                    max5 = i21;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<getInternalPopup> setMax() {
        setSplitBackground setsplitbackground;
        setSplitBackground max = setSplitBackground.setMax("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        max.bindLong(1, 200);
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            int max3 = getTitle.setMax(max2, "required_network_type");
            int max4 = getTitle.setMax(max2, "requires_charging");
            int max5 = getTitle.setMax(max2, "requires_device_idle");
            int max6 = getTitle.setMax(max2, "requires_battery_not_low");
            int max7 = getTitle.setMax(max2, "requires_storage_not_low");
            int max8 = getTitle.setMax(max2, "trigger_content_update_delay");
            int max9 = getTitle.setMax(max2, "trigger_max_content_delay");
            int max10 = getTitle.setMax(max2, "content_uri_triggers");
            int max11 = getTitle.setMax(max2, "id");
            int max12 = getTitle.setMax(max2, "state");
            int max13 = getTitle.setMax(max2, "worker_class_name");
            int max14 = getTitle.setMax(max2, "input_merger_class_name");
            int max15 = getTitle.setMax(max2, "input");
            int max16 = getTitle.setMax(max2, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "initial_delay");
                int max18 = getTitle.setMax(max2, "interval_duration");
                int max19 = getTitle.setMax(max2, "flex_duration");
                int max20 = getTitle.setMax(max2, "run_attempt_count");
                int max21 = getTitle.setMax(max2, "backoff_policy");
                int max22 = getTitle.setMax(max2, "backoff_delay_duration");
                int max23 = getTitle.setMax(max2, "period_start_time");
                int max24 = getTitle.setMax(max2, "minimum_retention_duration");
                int max25 = getTitle.setMax(max2, "schedule_requested_at");
                int max26 = getTitle.setMax(max2, "run_in_foreground");
                int i = max16;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String string = max2.getString(max11);
                    int i2 = max11;
                    String string2 = max2.getString(max13);
                    int i3 = max13;
                    setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = new setDefaultActionButtonContentDescription();
                    int i4 = max3;
                    setdefaultactionbuttoncontentdescription.length = getFirstBaselineToTopHeight.setMax(max2.getInt(max3));
                    setdefaultactionbuttoncontentdescription.setMax = max2.getInt(max4) != 0;
                    setdefaultactionbuttoncontentdescription.getMin = max2.getInt(max5) != 0;
                    setdefaultactionbuttoncontentdescription.setMin = max2.getInt(max6) != 0;
                    setdefaultactionbuttoncontentdescription.toFloatRange = max2.getInt(max7) != 0;
                    int i5 = max4;
                    setdefaultactionbuttoncontentdescription.isInside = max2.getLong(max8);
                    setdefaultactionbuttoncontentdescription.IsOverlapping = max2.getLong(max9);
                    setdefaultactionbuttoncontentdescription.equals = getFirstBaselineToTopHeight.getMax(max2.getBlob(max10));
                    getInternalPopup getinternalpopup = new getInternalPopup(string, string2);
                    getinternalpopup.getMin = getFirstBaselineToTopHeight.getMax(max2.getInt(max12));
                    getinternalpopup.length = max2.getString(max14);
                    getinternalpopup.setMin = updateAppearance.setMin(max2.getBlob(max15));
                    int i6 = i;
                    getinternalpopup.toIntRange = updateAppearance.setMin(max2.getBlob(i6));
                    int i7 = max14;
                    i = i6;
                    int i8 = max17;
                    getinternalpopup.IsOverlapping = max2.getLong(i8);
                    max17 = i8;
                    int i9 = max18;
                    getinternalpopup.isInside = max2.getLong(i9);
                    max18 = i9;
                    int i10 = max19;
                    getinternalpopup.equals = max2.getLong(i10);
                    int i11 = max20;
                    getinternalpopup.values = max2.getInt(i11);
                    int i12 = max21;
                    max20 = i11;
                    getinternalpopup.FastBitmap$CoordinateSystem = getFirstBaselineToTopHeight.setMin(max2.getInt(i12));
                    max19 = i10;
                    int i13 = max5;
                    int i14 = max22;
                    getinternalpopup.toString = max2.getLong(i14);
                    max22 = i14;
                    int i15 = max23;
                    getinternalpopup.toDoubleRange = max2.getLong(i15);
                    max23 = i15;
                    int i16 = max24;
                    getinternalpopup.hashCode = max2.getLong(i16);
                    max24 = i16;
                    int i17 = i12;
                    int i18 = max25;
                    getinternalpopup.invoke = max2.getLong(i18);
                    int i19 = max26;
                    getinternalpopup.valueOf = max2.getInt(i19) != 0;
                    getinternalpopup.toFloatRange = setdefaultactionbuttoncontentdescription;
                    arrayList.add(getinternalpopup);
                    max26 = i19;
                    max25 = i18;
                    max14 = i7;
                    max11 = i2;
                    max13 = i3;
                    max4 = i5;
                    max3 = i4;
                    int i20 = i13;
                    max21 = i17;
                    max5 = i20;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<getInternalPopup> getMax() {
        setSplitBackground setsplitbackground;
        setSplitBackground max = setSplitBackground.setMax("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            int max3 = getTitle.setMax(max2, "required_network_type");
            int max4 = getTitle.setMax(max2, "requires_charging");
            int max5 = getTitle.setMax(max2, "requires_device_idle");
            int max6 = getTitle.setMax(max2, "requires_battery_not_low");
            int max7 = getTitle.setMax(max2, "requires_storage_not_low");
            int max8 = getTitle.setMax(max2, "trigger_content_update_delay");
            int max9 = getTitle.setMax(max2, "trigger_max_content_delay");
            int max10 = getTitle.setMax(max2, "content_uri_triggers");
            int max11 = getTitle.setMax(max2, "id");
            int max12 = getTitle.setMax(max2, "state");
            int max13 = getTitle.setMax(max2, "worker_class_name");
            int max14 = getTitle.setMax(max2, "input_merger_class_name");
            int max15 = getTitle.setMax(max2, "input");
            int max16 = getTitle.setMax(max2, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "initial_delay");
                int max18 = getTitle.setMax(max2, "interval_duration");
                int max19 = getTitle.setMax(max2, "flex_duration");
                int max20 = getTitle.setMax(max2, "run_attempt_count");
                int max21 = getTitle.setMax(max2, "backoff_policy");
                int max22 = getTitle.setMax(max2, "backoff_delay_duration");
                int max23 = getTitle.setMax(max2, "period_start_time");
                int max24 = getTitle.setMax(max2, "minimum_retention_duration");
                int max25 = getTitle.setMax(max2, "schedule_requested_at");
                int max26 = getTitle.setMax(max2, "run_in_foreground");
                int i = max16;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String string = max2.getString(max11);
                    int i2 = max11;
                    String string2 = max2.getString(max13);
                    int i3 = max13;
                    setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = new setDefaultActionButtonContentDescription();
                    int i4 = max3;
                    setdefaultactionbuttoncontentdescription.length = getFirstBaselineToTopHeight.setMax(max2.getInt(max3));
                    setdefaultactionbuttoncontentdescription.setMax = max2.getInt(max4) != 0;
                    setdefaultactionbuttoncontentdescription.getMin = max2.getInt(max5) != 0;
                    setdefaultactionbuttoncontentdescription.setMin = max2.getInt(max6) != 0;
                    setdefaultactionbuttoncontentdescription.toFloatRange = max2.getInt(max7) != 0;
                    int i5 = max4;
                    setdefaultactionbuttoncontentdescription.isInside = max2.getLong(max8);
                    setdefaultactionbuttoncontentdescription.IsOverlapping = max2.getLong(max9);
                    setdefaultactionbuttoncontentdescription.equals = getFirstBaselineToTopHeight.getMax(max2.getBlob(max10));
                    getInternalPopup getinternalpopup = new getInternalPopup(string, string2);
                    getinternalpopup.getMin = getFirstBaselineToTopHeight.getMax(max2.getInt(max12));
                    getinternalpopup.length = max2.getString(max14);
                    getinternalpopup.setMin = updateAppearance.setMin(max2.getBlob(max15));
                    int i6 = i;
                    getinternalpopup.toIntRange = updateAppearance.setMin(max2.getBlob(i6));
                    int i7 = max15;
                    i = i6;
                    int i8 = max17;
                    getinternalpopup.IsOverlapping = max2.getLong(i8);
                    max17 = i8;
                    int i9 = max18;
                    getinternalpopup.isInside = max2.getLong(i9);
                    max18 = i9;
                    int i10 = max19;
                    getinternalpopup.equals = max2.getLong(i10);
                    int i11 = max20;
                    getinternalpopup.values = max2.getInt(i11);
                    int i12 = max21;
                    max20 = i11;
                    getinternalpopup.FastBitmap$CoordinateSystem = getFirstBaselineToTopHeight.setMin(max2.getInt(i12));
                    max19 = i10;
                    int i13 = max5;
                    int i14 = max22;
                    getinternalpopup.toString = max2.getLong(i14);
                    max22 = i14;
                    int i15 = max23;
                    getinternalpopup.toDoubleRange = max2.getLong(i15);
                    max23 = i15;
                    int i16 = max24;
                    getinternalpopup.hashCode = max2.getLong(i16);
                    max24 = i16;
                    int i17 = i12;
                    int i18 = max25;
                    getinternalpopup.invoke = max2.getLong(i18);
                    int i19 = max26;
                    getinternalpopup.valueOf = max2.getInt(i19) != 0;
                    getinternalpopup.toFloatRange = setdefaultactionbuttoncontentdescription;
                    arrayList.add(getinternalpopup);
                    max26 = i19;
                    max25 = i18;
                    max15 = i7;
                    max11 = i2;
                    max13 = i3;
                    max3 = i4;
                    max4 = i5;
                    int i20 = i13;
                    max21 = i17;
                    max5 = i20;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<getInternalPopup> getMin() {
        setSplitBackground setsplitbackground;
        setSplitBackground max = setSplitBackground.setMax("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            int max3 = getTitle.setMax(max2, "required_network_type");
            int max4 = getTitle.setMax(max2, "requires_charging");
            int max5 = getTitle.setMax(max2, "requires_device_idle");
            int max6 = getTitle.setMax(max2, "requires_battery_not_low");
            int max7 = getTitle.setMax(max2, "requires_storage_not_low");
            int max8 = getTitle.setMax(max2, "trigger_content_update_delay");
            int max9 = getTitle.setMax(max2, "trigger_max_content_delay");
            int max10 = getTitle.setMax(max2, "content_uri_triggers");
            int max11 = getTitle.setMax(max2, "id");
            int max12 = getTitle.setMax(max2, "state");
            int max13 = getTitle.setMax(max2, "worker_class_name");
            int max14 = getTitle.setMax(max2, "input_merger_class_name");
            int max15 = getTitle.setMax(max2, "input");
            int max16 = getTitle.setMax(max2, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "initial_delay");
                int max18 = getTitle.setMax(max2, "interval_duration");
                int max19 = getTitle.setMax(max2, "flex_duration");
                int max20 = getTitle.setMax(max2, "run_attempt_count");
                int max21 = getTitle.setMax(max2, "backoff_policy");
                int max22 = getTitle.setMax(max2, "backoff_delay_duration");
                int max23 = getTitle.setMax(max2, "period_start_time");
                int max24 = getTitle.setMax(max2, "minimum_retention_duration");
                int max25 = getTitle.setMax(max2, "schedule_requested_at");
                int max26 = getTitle.setMax(max2, "run_in_foreground");
                int i = max16;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String string = max2.getString(max11);
                    int i2 = max11;
                    String string2 = max2.getString(max13);
                    int i3 = max13;
                    setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = new setDefaultActionButtonContentDescription();
                    int i4 = max3;
                    setdefaultactionbuttoncontentdescription.length = getFirstBaselineToTopHeight.setMax(max2.getInt(max3));
                    setdefaultactionbuttoncontentdescription.setMax = max2.getInt(max4) != 0;
                    setdefaultactionbuttoncontentdescription.getMin = max2.getInt(max5) != 0;
                    setdefaultactionbuttoncontentdescription.setMin = max2.getInt(max6) != 0;
                    setdefaultactionbuttoncontentdescription.toFloatRange = max2.getInt(max7) != 0;
                    int i5 = max4;
                    setdefaultactionbuttoncontentdescription.isInside = max2.getLong(max8);
                    setdefaultactionbuttoncontentdescription.IsOverlapping = max2.getLong(max9);
                    setdefaultactionbuttoncontentdescription.equals = getFirstBaselineToTopHeight.getMax(max2.getBlob(max10));
                    getInternalPopup getinternalpopup = new getInternalPopup(string, string2);
                    getinternalpopup.getMin = getFirstBaselineToTopHeight.getMax(max2.getInt(max12));
                    getinternalpopup.length = max2.getString(max14);
                    getinternalpopup.setMin = updateAppearance.setMin(max2.getBlob(max15));
                    int i6 = i;
                    getinternalpopup.toIntRange = updateAppearance.setMin(max2.getBlob(i6));
                    int i7 = max15;
                    i = i6;
                    int i8 = max17;
                    getinternalpopup.IsOverlapping = max2.getLong(i8);
                    max17 = i8;
                    int i9 = max18;
                    getinternalpopup.isInside = max2.getLong(i9);
                    max18 = i9;
                    int i10 = max19;
                    getinternalpopup.equals = max2.getLong(i10);
                    int i11 = max20;
                    getinternalpopup.values = max2.getInt(i11);
                    int i12 = max21;
                    max20 = i11;
                    getinternalpopup.FastBitmap$CoordinateSystem = getFirstBaselineToTopHeight.setMin(max2.getInt(i12));
                    max19 = i10;
                    int i13 = max5;
                    int i14 = max22;
                    getinternalpopup.toString = max2.getLong(i14);
                    max22 = i14;
                    int i15 = max23;
                    getinternalpopup.toDoubleRange = max2.getLong(i15);
                    max23 = i15;
                    int i16 = max24;
                    getinternalpopup.hashCode = max2.getLong(i16);
                    max24 = i16;
                    int i17 = i12;
                    int i18 = max25;
                    getinternalpopup.invoke = max2.getLong(i18);
                    int i19 = max26;
                    getinternalpopup.valueOf = max2.getInt(i19) != 0;
                    getinternalpopup.toFloatRange = setdefaultactionbuttoncontentdescription;
                    arrayList.add(getinternalpopup);
                    max26 = i19;
                    max25 = i18;
                    max15 = i7;
                    max11 = i2;
                    max13 = i3;
                    max3 = i4;
                    max4 = i5;
                    int i20 = i13;
                    max21 = i17;
                    max5 = i20;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final List<getInternalPopup> length(long j) {
        setSplitBackground setsplitbackground;
        setSplitBackground max = setSplitBackground.setMax("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        max.bindLong(1, j);
        this.setMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
        try {
            int max3 = getTitle.setMax(max2, "required_network_type");
            int max4 = getTitle.setMax(max2, "requires_charging");
            int max5 = getTitle.setMax(max2, "requires_device_idle");
            int max6 = getTitle.setMax(max2, "requires_battery_not_low");
            int max7 = getTitle.setMax(max2, "requires_storage_not_low");
            int max8 = getTitle.setMax(max2, "trigger_content_update_delay");
            int max9 = getTitle.setMax(max2, "trigger_max_content_delay");
            int max10 = getTitle.setMax(max2, "content_uri_triggers");
            int max11 = getTitle.setMax(max2, "id");
            int max12 = getTitle.setMax(max2, "state");
            int max13 = getTitle.setMax(max2, "worker_class_name");
            int max14 = getTitle.setMax(max2, "input_merger_class_name");
            int max15 = getTitle.setMax(max2, "input");
            int max16 = getTitle.setMax(max2, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
            setsplitbackground = max;
            try {
                int max17 = getTitle.setMax(max2, "initial_delay");
                int max18 = getTitle.setMax(max2, "interval_duration");
                int max19 = getTitle.setMax(max2, "flex_duration");
                int max20 = getTitle.setMax(max2, "run_attempt_count");
                int max21 = getTitle.setMax(max2, "backoff_policy");
                int max22 = getTitle.setMax(max2, "backoff_delay_duration");
                int max23 = getTitle.setMax(max2, "period_start_time");
                int max24 = getTitle.setMax(max2, "minimum_retention_duration");
                int max25 = getTitle.setMax(max2, "schedule_requested_at");
                int max26 = getTitle.setMax(max2, "run_in_foreground");
                int i = max16;
                ArrayList arrayList = new ArrayList(max2.getCount());
                while (max2.moveToNext()) {
                    String string = max2.getString(max11);
                    int i2 = max11;
                    String string2 = max2.getString(max13);
                    int i3 = max13;
                    setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = new setDefaultActionButtonContentDescription();
                    int i4 = max3;
                    setdefaultactionbuttoncontentdescription.length = getFirstBaselineToTopHeight.setMax(max2.getInt(max3));
                    setdefaultactionbuttoncontentdescription.setMax = max2.getInt(max4) != 0;
                    setdefaultactionbuttoncontentdescription.getMin = max2.getInt(max5) != 0;
                    setdefaultactionbuttoncontentdescription.setMin = max2.getInt(max6) != 0;
                    setdefaultactionbuttoncontentdescription.toFloatRange = max2.getInt(max7) != 0;
                    int i5 = max4;
                    setdefaultactionbuttoncontentdescription.isInside = max2.getLong(max8);
                    setdefaultactionbuttoncontentdescription.IsOverlapping = max2.getLong(max9);
                    setdefaultactionbuttoncontentdescription.equals = getFirstBaselineToTopHeight.getMax(max2.getBlob(max10));
                    getInternalPopup getinternalpopup = new getInternalPopup(string, string2);
                    getinternalpopup.getMin = getFirstBaselineToTopHeight.getMax(max2.getInt(max12));
                    getinternalpopup.length = max2.getString(max14);
                    getinternalpopup.setMin = updateAppearance.setMin(max2.getBlob(max15));
                    int i6 = i;
                    getinternalpopup.toIntRange = updateAppearance.setMin(max2.getBlob(i6));
                    int i7 = max17;
                    int i8 = max14;
                    i = i6;
                    getinternalpopup.IsOverlapping = max2.getLong(i7);
                    int i9 = i7;
                    int i10 = max18;
                    getinternalpopup.isInside = max2.getLong(i10);
                    max18 = i10;
                    int i11 = max19;
                    getinternalpopup.equals = max2.getLong(i11);
                    int i12 = max20;
                    getinternalpopup.values = max2.getInt(i12);
                    int i13 = max21;
                    max20 = i12;
                    getinternalpopup.FastBitmap$CoordinateSystem = getFirstBaselineToTopHeight.setMin(max2.getInt(i13));
                    max19 = i11;
                    int i14 = max5;
                    int i15 = max22;
                    getinternalpopup.toString = max2.getLong(i15);
                    max22 = i15;
                    int i16 = max23;
                    getinternalpopup.toDoubleRange = max2.getLong(i16);
                    max23 = i16;
                    int i17 = max24;
                    getinternalpopup.hashCode = max2.getLong(i17);
                    max24 = i17;
                    int i18 = i13;
                    int i19 = max25;
                    getinternalpopup.invoke = max2.getLong(i19);
                    int i20 = max26;
                    getinternalpopup.valueOf = max2.getInt(i20) != 0;
                    getinternalpopup.toFloatRange = setdefaultactionbuttoncontentdescription;
                    arrayList.add(getinternalpopup);
                    max26 = i20;
                    max25 = i19;
                    max13 = i3;
                    max4 = i5;
                    max3 = i4;
                    max14 = i8;
                    max17 = i9;
                    max11 = i2;
                    int i21 = i14;
                    max21 = i18;
                    max5 = i21;
                }
                max2.close();
                setsplitbackground.getMin();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                max2.close();
                setsplitbackground.getMin();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            setsplitbackground = max;
            max2.close();
            setsplitbackground.getMin();
            throw th;
        }
    }

    public final int setMin(WorkInfo.State state, String... strArr) {
        this.setMin.assertNotSuspendingTransaction();
        StringBuilder length2 = closeMode.length();
        length2.append("UPDATE workspec SET state=");
        length2.append("?");
        length2.append(" WHERE id IN (");
        closeMode.getMin(length2, 1);
        length2.append(")");
        SupportSQLiteStatement compileStatement = this.setMin.compileStatement(length2.toString());
        compileStatement.bindLong(1, (long) getFirstBaselineToTopHeight.setMin(state));
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str == null) {
                compileStatement.bindNull(2);
            } else {
                compileStatement.bindString(2, str);
            }
        }
        this.setMin.beginTransaction();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.setMin.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.setMin.endTransaction();
        }
    }

    /* access modifiers changed from: private */
    public void length(PlaybackStateCompat<String, ArrayList<String>> playbackStateCompat) {
        ArrayList arrayList;
        int i;
        while (true) {
            Set<String> keySet = playbackStateCompat.keySet();
            if (!keySet.isEmpty()) {
                int i2 = 1;
                if (playbackStateCompat.size() > 999) {
                    PlaybackStateCompat<String, ArrayList<String>> playbackStateCompat2 = new PlaybackStateCompat<>(999);
                    int size = playbackStateCompat.size();
                    int i3 = 0;
                    while (true) {
                        i = 0;
                        while (i3 < size) {
                            int i4 = i3 << 1;
                            playbackStateCompat2.put((String) playbackStateCompat.isInside[i4], (ArrayList) playbackStateCompat.isInside[i4 + 1]);
                            i3++;
                            i++;
                            if (i == 999) {
                                length(playbackStateCompat2);
                                playbackStateCompat2 = new PlaybackStateCompat<>(999);
                            }
                        }
                        break;
                    }
                    if (i > 0) {
                        playbackStateCompat = playbackStateCompat2;
                    } else {
                        return;
                    }
                } else {
                    StringBuilder length2 = closeMode.length();
                    length2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
                    int size2 = keySet.size();
                    closeMode.getMin(length2, size2);
                    length2.append(")");
                    setSplitBackground max = setSplitBackground.setMax(length2.toString(), size2 + 0);
                    for (String next : keySet) {
                        if (next == null) {
                            max.bindNull(i2);
                        } else {
                            max.bindString(i2, next);
                        }
                        i2++;
                    }
                    Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
                    try {
                        int length3 = getTitle.length(max2, "work_spec_id");
                        if (length3 != -1) {
                            while (max2.moveToNext()) {
                                if (!max2.isNull(length3) && (arrayList = playbackStateCompat.get(max2.getString(length3))) != null) {
                                    arrayList.add(max2.getString(0));
                                }
                            }
                            max2.close();
                            return;
                        }
                        return;
                    } finally {
                        max2.close();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void getMax(PlaybackStateCompat<String, ArrayList<updateAppearance>> playbackStateCompat) {
        ArrayList arrayList;
        int i;
        while (true) {
            Set<String> keySet = playbackStateCompat.keySet();
            if (!keySet.isEmpty()) {
                int i2 = 1;
                if (playbackStateCompat.size() > 999) {
                    PlaybackStateCompat<String, ArrayList<updateAppearance>> playbackStateCompat2 = new PlaybackStateCompat<>(999);
                    int size = playbackStateCompat.size();
                    int i3 = 0;
                    while (true) {
                        i = 0;
                        while (i3 < size) {
                            int i4 = i3 << 1;
                            playbackStateCompat2.put((String) playbackStateCompat.isInside[i4], (ArrayList) playbackStateCompat.isInside[i4 + 1]);
                            i3++;
                            i++;
                            if (i == 999) {
                                getMax(playbackStateCompat2);
                                playbackStateCompat2 = new PlaybackStateCompat<>(999);
                            }
                        }
                        break;
                    }
                    if (i > 0) {
                        playbackStateCompat = playbackStateCompat2;
                    } else {
                        return;
                    }
                } else {
                    StringBuilder length2 = closeMode.length();
                    length2.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
                    int size2 = keySet.size();
                    closeMode.getMin(length2, size2);
                    length2.append(")");
                    setSplitBackground max = setSplitBackground.setMax(length2.toString(), size2 + 0);
                    for (String next : keySet) {
                        if (next == null) {
                            max.bindNull(i2);
                        } else {
                            max.bindString(i2, next);
                        }
                        i2++;
                    }
                    Cursor max2 = setSubtitle.getMax(this.setMin, max, false);
                    try {
                        int length3 = getTitle.length(max2, "work_spec_id");
                        if (length3 != -1) {
                            while (max2.moveToNext()) {
                                if (!max2.isNull(length3) && (arrayList = playbackStateCompat.get(max2.getString(length3))) != null) {
                                    arrayList.add(updateAppearance.setMin(max2.getBlob(0)));
                                }
                            }
                            max2.close();
                            return;
                        }
                        return;
                    } finally {
                        max2.close();
                    }
                }
            } else {
                return;
            }
        }
    }
}
