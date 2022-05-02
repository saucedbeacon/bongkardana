package com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.j256.ormlite.field.FieldType;
import id.dana.tracker.constant.TrackerType;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.shouldMeasureTwice;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MPDbAdapter {
    /* access modifiers changed from: private */
    public static final String IsOverlapping;
    /* access modifiers changed from: private */
    public static final String equals;
    /* access modifiers changed from: private */
    public static final String getMax;
    private static final Map<Context, MPDbAdapter> getMin = new HashMap();
    /* access modifiers changed from: private */
    public static final String isInside;
    /* access modifiers changed from: private */
    public static final String setMax;
    /* access modifiers changed from: private */
    public static final String setMin;
    /* access modifiers changed from: private */
    public static final String toFloatRange;
    /* access modifiers changed from: private */
    public static final String toIntRange;
    public final length length;

    static {
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(Table.EVENTS.getName());
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        setMax = sb.toString();
        StringBuilder sb2 = new StringBuilder("CREATE TABLE ");
        sb2.append(Table.PEOPLE.getName());
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        getMax = sb2.toString();
        StringBuilder sb3 = new StringBuilder("CREATE TABLE ");
        sb3.append(Table.GROUPS.getName());
        sb3.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        setMin = sb3.toString();
        StringBuilder sb4 = new StringBuilder("CREATE TABLE ");
        sb4.append(Table.ANONYMOUS_PEOPLE.getName());
        sb4.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        equals = sb4.toString();
        StringBuilder sb5 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb5.append(Table.EVENTS.getName());
        sb5.append(" (created_at);");
        toIntRange = sb5.toString();
        StringBuilder sb6 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb6.append(Table.PEOPLE.getName());
        sb6.append(" (created_at);");
        IsOverlapping = sb6.toString();
        StringBuilder sb7 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb7.append(Table.GROUPS.getName());
        sb7.append(" (created_at);");
        toFloatRange = sb7.toString();
        StringBuilder sb8 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb8.append(Table.ANONYMOUS_PEOPLE.getName());
        sb8.append(" (created_at);");
        isInside = sb8.toString();
    }

    public enum Table {
        EVENTS("events"),
        PEOPLE("people"),
        ANONYMOUS_PEOPLE("anonymous_people"),
        GROUPS("groups");
        
        private final String mTableName;

        private Table(String str) {
            this.mTableName = str;
        }

        public final String getName() {
            return this.mTableName;
        }
    }

    public static class length extends SQLiteOpenHelper {
        private final Context getMax;
        private final shouldMeasureTwice getMin;
        public final File length;

        length(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
            this.length = context.getDatabasePath(str);
            this.getMin = shouldMeasureTwice.getMax(context);
            this.getMax = context;
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            sQLiteDatabase.execSQL(MPDbAdapter.setMax);
            sQLiteDatabase.execSQL(MPDbAdapter.getMax);
            sQLiteDatabase.execSQL(MPDbAdapter.setMin);
            sQLiteDatabase.execSQL(MPDbAdapter.equals);
            sQLiteDatabase.execSQL(MPDbAdapter.toIntRange);
            sQLiteDatabase.execSQL(MPDbAdapter.IsOverlapping);
            sQLiteDatabase.execSQL(MPDbAdapter.toFloatRange);
            sQLiteDatabase.execSQL(MPDbAdapter.isInside);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3;
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            if (i < 4 || i2 > 7) {
                StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
                sb.append(Table.EVENTS.getName());
                sQLiteDatabase.execSQL(sb.toString());
                StringBuilder sb2 = new StringBuilder("DROP TABLE IF EXISTS ");
                sb2.append(Table.PEOPLE.getName());
                sQLiteDatabase.execSQL(sb2.toString());
                StringBuilder sb3 = new StringBuilder("DROP TABLE IF EXISTS ");
                sb3.append(Table.GROUPS.getName());
                sQLiteDatabase.execSQL(sb3.toString());
                StringBuilder sb4 = new StringBuilder("DROP TABLE IF EXISTS ");
                sb4.append(Table.ANONYMOUS_PEOPLE.getName());
                sQLiteDatabase.execSQL(sb4.toString());
                sQLiteDatabase.execSQL(MPDbAdapter.setMax);
                sQLiteDatabase.execSQL(MPDbAdapter.getMax);
                sQLiteDatabase.execSQL(MPDbAdapter.setMin);
                sQLiteDatabase.execSQL(MPDbAdapter.equals);
                sQLiteDatabase.execSQL(MPDbAdapter.toIntRange);
                sQLiteDatabase.execSQL(MPDbAdapter.IsOverlapping);
                sQLiteDatabase.execSQL(MPDbAdapter.toFloatRange);
                sQLiteDatabase.execSQL(MPDbAdapter.isInside);
                return;
            }
            if (i == 4) {
                StringBuilder sb5 = new StringBuilder("ALTER TABLE ");
                sb5.append(Table.EVENTS.getName());
                sb5.append(" ADD COLUMN automatic_data INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL(sb5.toString());
                StringBuilder sb6 = new StringBuilder("ALTER TABLE ");
                sb6.append(Table.PEOPLE.getName());
                sb6.append(" ADD COLUMN automatic_data INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL(sb6.toString());
                StringBuilder sb7 = new StringBuilder("ALTER TABLE ");
                sb7.append(Table.EVENTS.getName());
                sb7.append(" ADD COLUMN token STRING NOT NULL DEFAULT ''");
                sQLiteDatabase.execSQL(sb7.toString());
                StringBuilder sb8 = new StringBuilder("ALTER TABLE ");
                sb8.append(Table.PEOPLE.getName());
                sb8.append(" ADD COLUMN token STRING NOT NULL DEFAULT ''");
                sQLiteDatabase.execSQL(sb8.toString());
                StringBuilder sb9 = new StringBuilder("SELECT * FROM ");
                sb9.append(Table.EVENTS.getName());
                Cursor rawQuery = sQLiteDatabase.rawQuery(sb9.toString(), (String[]) null);
                while (true) {
                    int i4 = 0;
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    try {
                        String string = new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("data"))).getJSONObject("properties").getString("token");
                        i4 = rawQuery.getInt(rawQuery.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX));
                        StringBuilder sb10 = new StringBuilder("UPDATE ");
                        sb10.append(Table.EVENTS.getName());
                        sb10.append(" SET token = '");
                        sb10.append(string);
                        sb10.append("' WHERE _id = ");
                        sb10.append(i4);
                        sQLiteDatabase.execSQL(sb10.toString());
                    } catch (JSONException unused) {
                        sQLiteDatabase.delete(Table.EVENTS.getName(), "_id = ".concat(String.valueOf(i4)), (String[]) null);
                    }
                }
                StringBuilder sb11 = new StringBuilder("SELECT * FROM ");
                sb11.append(Table.PEOPLE.getName());
                Cursor rawQuery2 = sQLiteDatabase.rawQuery(sb11.toString(), (String[]) null);
                while (rawQuery2.moveToNext()) {
                    try {
                        String string2 = new JSONObject(rawQuery2.getString(rawQuery2.getColumnIndex("data"))).getString("$token");
                        i3 = rawQuery2.getInt(rawQuery2.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX));
                        try {
                            StringBuilder sb12 = new StringBuilder("UPDATE ");
                            sb12.append(Table.PEOPLE.getName());
                            sb12.append(" SET token = '");
                            sb12.append(string2);
                            sb12.append("' WHERE _id = ");
                            sb12.append(i3);
                            sQLiteDatabase.execSQL(sb12.toString());
                        } catch (JSONException unused2) {
                        }
                    } catch (JSONException unused3) {
                        i3 = 0;
                        sQLiteDatabase.delete(Table.PEOPLE.getName(), "_id = ".concat(String.valueOf(i3)), (String[]) null);
                    }
                }
                sQLiteDatabase.execSQL(MPDbAdapter.setMin);
                sQLiteDatabase.execSQL(MPDbAdapter.toFloatRange);
                setMin(sQLiteDatabase);
            }
            if (i == 5) {
                sQLiteDatabase.execSQL(MPDbAdapter.setMin);
                sQLiteDatabase.execSQL(MPDbAdapter.toFloatRange);
                setMin(sQLiteDatabase);
            }
            if (i == 6) {
                setMin(sQLiteDatabase);
            }
        }

        public final boolean getMax() {
            if (!this.length.exists() || Math.max(this.length.getUsableSpace(), (long) this.getMin.length) >= this.length.length()) {
                return true;
            }
            return false;
        }

        private void setMin(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(MPDbAdapter.equals);
            sQLiteDatabase.execSQL(MPDbAdapter.isInside);
            File file = new File(this.getMax.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (String split : file.list(new FilenameFilter() {
                    public final boolean accept(File file, String str) {
                        return str.startsWith("com.mixpanel.android.mpmetrics.MixpanelAPI_");
                    }
                })) {
                    SharedPreferences sharedPreferences = this.getMax.getSharedPreferences(split.split("\\.xml")[0], 0);
                    String string = sharedPreferences.getString("waiting_array", (String) null);
                    if (string != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            sQLiteDatabase.beginTransaction();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                                    String string2 = jSONObject.getString("$token");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("data", jSONObject.toString());
                                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("automatic_data", Boolean.FALSE);
                                    contentValues.put("token", string2);
                                    sQLiteDatabase.insert(Table.ANONYMOUS_PEOPLE.getName(), (String) null, contentValues);
                                } catch (JSONException unused) {
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (JSONException unused2) {
                        } catch (Throwable th) {
                            sQLiteDatabase.endTransaction();
                            throw th;
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove("waiting_array");
                        edit.apply();
                    }
                }
            }
        }
    }

    private MPDbAdapter(Context context) {
        this(context, TrackerType.MIXPANEL);
    }

    private MPDbAdapter(Context context, String str) {
        this.length = new length(context, str);
    }

    public static MPDbAdapter setMax(Context context) {
        MPDbAdapter mPDbAdapter;
        synchronized (getMin) {
            Context applicationContext = context.getApplicationContext();
            if (!getMin.containsKey(applicationContext)) {
                mPDbAdapter = new MPDbAdapter(applicationContext);
                getMin.put(applicationContext, mPDbAdapter);
            } else {
                mPDbAdapter = getMin.get(applicationContext);
            }
        }
        return mPDbAdapter;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|(1:17)(1:18)|19|20|(1:22)) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.values();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r7 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7 = r6.length;
        r7.close();
        r7.length.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r1 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r1 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r6.length.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int setMin(org.json.JSONObject r7, java.lang.String r8, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r6.toFloatRange()
            if (r0 != 0) goto L_0x000b
            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()
            r7 = -2
            return r7
        L_0x000b:
            java.lang.String r9 = r9.getName()
            r0 = -1
            r1 = 0
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r2 = r6.length     // Catch:{ SQLiteException -> 0x0073 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0073 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0073 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r4 = "data"
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0073 }
            r3.put(r4, r7)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r7 = "created_at"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0073 }
            r3.put(r7, r4)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r7 = "automatic_data"
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0073 }
            r3.put(r7, r10)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r7 = "token"
            r3.put(r7, r8)     // Catch:{ SQLiteException -> 0x0073 }
            r2.insert(r9, r1, r3)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r10 = "SELECT COUNT(*) FROM "
            r7.<init>(r10)     // Catch:{ SQLiteException -> 0x0073 }
            r7.append(r9)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r9 = " WHERE token='"
            r7.append(r9)     // Catch:{ SQLiteException -> 0x0073 }
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r8 = "'"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0073 }
            android.database.Cursor r7 = r2.rawQuery(r7, r1)     // Catch:{ SQLiteException -> 0x0073 }
            r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            r8 = 0
            int r0 = r7.getInt(r8)     // Catch:{ SQLiteException -> 0x0074 }
            if (r7 == 0) goto L_0x008d
            r7.close()
            goto L_0x008d
        L_0x0071:
            r8 = move-exception
            goto L_0x0095
        L_0x0073:
            r7 = r1
        L_0x0074:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x007d
            r7.close()     // Catch:{ all -> 0x0093 }
            goto L_0x007e
        L_0x007d:
            r1 = r7
        L_0x007e:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r7 = r6.length     // Catch:{ all -> 0x0071 }
            r7.close()     // Catch:{ all -> 0x0071 }
            java.io.File r7 = r7.length     // Catch:{ all -> 0x0071 }
            r7.delete()     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x008d
            r1.close()
        L_0x008d:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r7 = r6.length
            r7.close()
            return r0
        L_0x0093:
            r8 = move-exception
            r1 = r7
        L_0x0095:
            if (r1 == 0) goto L_0x009a
            r1.close()
        L_0x009a:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r7 = r6.length
            r7.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.setMin(org.json.JSONObject, java.lang.String, com.mixpanel.android.mpmetrics.MPDbAdapter$Table, boolean):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|47|45|10|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cf, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d3, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fc, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053 A[SYNTHETIC, Splitter:B:12:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int length(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "data"
            java.lang.String r1 = "token"
            java.lang.String r2 = "automatic_data"
            java.lang.String r3 = "created_at"
            boolean r4 = r10.toFloatRange()
            if (r4 != 0) goto L_0x0014
            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()
            r11 = -2
            return r11
        L_0x0014:
            r4 = -1
            r5 = 0
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r6 = r10.length     // Catch:{ SQLiteException -> 0x00d6 }
            android.database.sqlite.SQLiteDatabase r6 = r6.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.String r9 = "SELECT * FROM "
            r8.<init>(r9)     // Catch:{ SQLiteException -> 0x00d6 }
            com.mixpanel.android.mpmetrics.MPDbAdapter$Table r9 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.ANONYMOUS_PEOPLE     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.String r9 = r9.getName()     // Catch:{ SQLiteException -> 0x00d6 }
            r8.append(r9)     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.String r9 = " WHERE token = '"
            r8.append(r9)     // Catch:{ SQLiteException -> 0x00d6 }
            r8.append(r11)     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.String r11 = "'"
            r8.append(r11)     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.String r11 = r8.toString()     // Catch:{ SQLiteException -> 0x00d6 }
            r7.<init>(r11)     // Catch:{ SQLiteException -> 0x00d6 }
            java.lang.String r11 = r7.toString()     // Catch:{ SQLiteException -> 0x00d6 }
            android.database.Cursor r11 = r6.rawQuery(r11, r5)     // Catch:{ SQLiteException -> 0x00d6 }
            r6.beginTransaction()     // Catch:{ SQLiteException -> 0x00d7 }
        L_0x004d:
            boolean r7 = r11.moveToNext()     // Catch:{ all -> 0x00cf }
            if (r7 == 0) goto L_0x00c3
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ JSONException -> 0x004d }
            r7.<init>()     // Catch:{ JSONException -> 0x004d }
            int r8 = r11.getColumnIndex(r3)     // Catch:{ JSONException -> 0x004d }
            long r8 = r11.getLong(r8)     // Catch:{ JSONException -> 0x004d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ JSONException -> 0x004d }
            r7.put(r3, r8)     // Catch:{ JSONException -> 0x004d }
            int r8 = r11.getColumnIndex(r2)     // Catch:{ JSONException -> 0x004d }
            int r8 = r11.getInt(r8)     // Catch:{ JSONException -> 0x004d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x004d }
            r7.put(r2, r8)     // Catch:{ JSONException -> 0x004d }
            int r8 = r11.getColumnIndex(r1)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r8 = r11.getString(r8)     // Catch:{ JSONException -> 0x004d }
            r7.put(r1, r8)     // Catch:{ JSONException -> 0x004d }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004d }
            int r9 = r11.getColumnIndex(r0)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r9 = r11.getString(r9)     // Catch:{ JSONException -> 0x004d }
            r8.<init>(r9)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r9 = "$distinct_id"
            r8.put(r9, r12)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x004d }
            r7.put(r0, r8)     // Catch:{ JSONException -> 0x004d }
            com.mixpanel.android.mpmetrics.MPDbAdapter$Table r8 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.PEOPLE     // Catch:{ JSONException -> 0x004d }
            java.lang.String r8 = r8.getName()     // Catch:{ JSONException -> 0x004d }
            r6.insert(r8, r5, r7)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r7 = "_id"
            int r7 = r11.getColumnIndex(r7)     // Catch:{ JSONException -> 0x004d }
            int r7 = r11.getInt(r7)     // Catch:{ JSONException -> 0x004d }
            com.mixpanel.android.mpmetrics.MPDbAdapter$Table r8 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.ANONYMOUS_PEOPLE     // Catch:{ JSONException -> 0x004d }
            java.lang.String r8 = r8.getName()     // Catch:{ JSONException -> 0x004d }
            java.lang.String r9 = "_id = "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r7 = r9.concat(r7)     // Catch:{ JSONException -> 0x004d }
            r6.delete(r8, r7, r5)     // Catch:{ JSONException -> 0x004d }
            int r4 = r4 + 1
            goto L_0x004d
        L_0x00c3:
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x00cf }
            r6.endTransaction()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r11 == 0) goto L_0x00f5
            r11.close()
            goto L_0x00f5
        L_0x00cf:
            r12 = move-exception
            r6.endTransaction()     // Catch:{ SQLiteException -> 0x00d7 }
            throw r12     // Catch:{ SQLiteException -> 0x00d7 }
        L_0x00d4:
            r12 = move-exception
            goto L_0x00fd
        L_0x00d6:
            r11 = r5
        L_0x00d7:
            com.mixpanel.android.mpmetrics.MPDbAdapter$Table r12 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.ANONYMOUS_PEOPLE     // Catch:{ all -> 0x00fb }
            r12.getName()     // Catch:{ all -> 0x00fb }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00e5
            r11.close()     // Catch:{ all -> 0x00fb }
            goto L_0x00e6
        L_0x00e5:
            r5 = r11
        L_0x00e6:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r11 = r10.length     // Catch:{ all -> 0x00d4 }
            r11.close()     // Catch:{ all -> 0x00d4 }
            java.io.File r11 = r11.length     // Catch:{ all -> 0x00d4 }
            r11.delete()     // Catch:{ all -> 0x00d4 }
            if (r5 == 0) goto L_0x00f5
            r5.close()
        L_0x00f5:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r11 = r10.length
            r11.close()
            return r4
        L_0x00fb:
            r12 = move-exception
            r5 = r11
        L_0x00fd:
            if (r5 == 0) goto L_0x0102
            r5.close()
        L_0x0102:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r11 = r10.length
            r11.close()
            goto L_0x0109
        L_0x0108:
            throw r12
        L_0x0109:
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.length(java.lang.String, java.lang.String):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:12|13|(2:16|14)|51|17|18|50|49|10|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e5, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[SYNTHETIC, Splitter:B:12:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getMax(java.util.Map<java.lang.String, java.lang.String> r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "properties"
            java.lang.String r1 = "data"
            boolean r2 = r11.toFloatRange()
            if (r2 != 0) goto L_0x000f
            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()
            r12 = -2
            return r12
        L_0x000f:
            r2 = 0
            r3 = 0
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r4 = r11.length     // Catch:{ SQLiteException -> 0x00c5 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.String r7 = "SELECT * FROM "
            r6.<init>(r7)     // Catch:{ SQLiteException -> 0x00c5 }
            com.mixpanel.android.mpmetrics.MPDbAdapter$Table r7 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.EVENTS     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.String r7 = r7.getName()     // Catch:{ SQLiteException -> 0x00c5 }
            r6.append(r7)     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.String r7 = " WHERE token = '"
            r6.append(r7)     // Catch:{ SQLiteException -> 0x00c5 }
            r6.append(r13)     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.String r13 = "'"
            r6.append(r13)     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.String r13 = r6.toString()     // Catch:{ SQLiteException -> 0x00c5 }
            r5.<init>(r13)     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.String r13 = r5.toString()     // Catch:{ SQLiteException -> 0x00c5 }
            android.database.Cursor r13 = r4.rawQuery(r13, r3)     // Catch:{ SQLiteException -> 0x00c5 }
            r4.beginTransaction()     // Catch:{ SQLiteException -> 0x00c6 }
        L_0x0048:
            boolean r5 = r13.moveToNext()     // Catch:{ all -> 0x00be }
            if (r5 == 0) goto L_0x00b2
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ JSONException -> 0x0048 }
            r5.<init>()     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0048 }
            int r7 = r13.getColumnIndex(r1)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r7 = r13.getString(r7)     // Catch:{ JSONException -> 0x0048 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONObject r7 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x0048 }
            java.util.Set r8 = r12.entrySet()     // Catch:{ JSONException -> 0x0048 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x0048 }
        L_0x006c:
            boolean r9 = r8.hasNext()     // Catch:{ JSONException -> 0x0048 }
            if (r9 == 0) goto L_0x0088
            java.lang.Object r9 = r8.next()     // Catch:{ JSONException -> 0x0048 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ JSONException -> 0x0048 }
            java.lang.Object r10 = r9.getKey()     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x0048 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0048 }
            r7.put(r10, r9)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x006c
        L_0x0088:
            r6.put(r0, r7)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0048 }
            r5.put(r1, r6)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r6 = "_id"
            int r6 = r13.getColumnIndex(r6)     // Catch:{ JSONException -> 0x0048 }
            int r6 = r13.getInt(r6)     // Catch:{ JSONException -> 0x0048 }
            com.mixpanel.android.mpmetrics.MPDbAdapter$Table r7 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.EVENTS     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r7 = r7.getName()     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r8 = "_id = "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r6 = r8.concat(r6)     // Catch:{ JSONException -> 0x0048 }
            r4.update(r7, r5, r6, r3)     // Catch:{ JSONException -> 0x0048 }
            int r2 = r2 + 1
            goto L_0x0048
        L_0x00b2:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x00be }
            r4.endTransaction()     // Catch:{ SQLiteException -> 0x00c6 }
            if (r13 == 0) goto L_0x00df
            r13.close()
            goto L_0x00df
        L_0x00be:
            r12 = move-exception
            r4.endTransaction()     // Catch:{ SQLiteException -> 0x00c6 }
            throw r12     // Catch:{ SQLiteException -> 0x00c6 }
        L_0x00c3:
            r12 = move-exception
            goto L_0x00e7
        L_0x00c5:
            r13 = r3
        L_0x00c6:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x00e5 }
            if (r13 == 0) goto L_0x00cf
            r13.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00d0
        L_0x00cf:
            r3 = r13
        L_0x00d0:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r12 = r11.length     // Catch:{ all -> 0x00c3 }
            r12.close()     // Catch:{ all -> 0x00c3 }
            java.io.File r12 = r12.length     // Catch:{ all -> 0x00c3 }
            r12.delete()     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x00df
            r3.close()
        L_0x00df:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r12 = r11.length
            r12.close()
            return r2
        L_0x00e5:
            r12 = move-exception
            r3 = r13
        L_0x00e7:
            if (r3 == 0) goto L_0x00ec
            r3.close()
        L_0x00ec:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r13 = r11.length
            r13.close()
            goto L_0x00f3
        L_0x00f2:
            throw r12
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.getMax(java.util.Map, java.lang.String):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(java.lang.String r5, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r6, java.lang.String r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r6 = r6.getName()
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r0 = r4.length     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            java.lang.String r3 = "_id <= "
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            r2.append(r5)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            java.lang.String r5 = " AND token = '"
            r2.append(r5)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            r2.append(r7)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            java.lang.String r5 = "'"
            r2.append(r5)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            java.lang.String r5 = r2.toString()     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            r1.<init>(r5)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            if (r8 != 0) goto L_0x0031
            java.lang.String r5 = " AND automatic_data=0"
            r1.append(r5)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
        L_0x0031:
            java.lang.String r5 = r1.toString()     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
            r7 = 0
            r0.delete(r6, r5, r7)     // Catch:{ SQLiteException -> 0x004f, Exception -> 0x0041 }
        L_0x0039:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r5 = r4.length
            r5.close()
            return
        L_0x003f:
            r5 = move-exception
            goto L_0x005d
        L_0x0041:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x003f }
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r5 = r4.length     // Catch:{ all -> 0x003f }
            r5.close()     // Catch:{ all -> 0x003f }
            java.io.File r5 = r5.length     // Catch:{ all -> 0x003f }
            r5.delete()     // Catch:{ all -> 0x003f }
            goto L_0x0039
        L_0x004f:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x003f }
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r5 = r4.length     // Catch:{ all -> 0x003f }
            r5.close()     // Catch:{ all -> 0x003f }
            java.io.File r5 = r5.length     // Catch:{ all -> 0x003f }
            r5.delete()     // Catch:{ all -> 0x003f }
            goto L_0x0039
        L_0x005d:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r6 = r4.length
            r6.close()
            goto L_0x0064
        L_0x0063:
            throw r5
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.getMax(java.lang.String, com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.values();
        r3 = r2.length;
        r3.close();
        r3.length.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r2.length.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        throw r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(long r3, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r5) {
        /*
            r2 = this;
            java.lang.String r5 = r5.getName()
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r0 = r2.length     // Catch:{ SQLiteException -> 0x0020 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0020 }
            java.lang.String r1 = "created_at <= "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x0020 }
            java.lang.String r3 = r1.concat(r3)     // Catch:{ SQLiteException -> 0x0020 }
            r4 = 0
            r0.delete(r5, r3, r4)     // Catch:{ SQLiteException -> 0x0020 }
        L_0x0018:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r3 = r2.length
            r3.close()
            return
        L_0x001e:
            r3 = move-exception
            goto L_0x002e
        L_0x0020:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x001e }
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r3 = r2.length     // Catch:{ all -> 0x001e }
            r3.close()     // Catch:{ all -> 0x001e }
            java.io.File r3 = r3.length     // Catch:{ all -> 0x001e }
            r3.delete()     // Catch:{ all -> 0x001e }
            goto L_0x0018
        L_0x002e:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r4 = r2.length
            r4.close()
            goto L_0x0035
        L_0x0034:
            throw r3
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.getMax(long, com.mixpanel.android.mpmetrics.MPDbAdapter$Table):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.values();
        r4 = r3.length;
        r4.close();
        r4.length.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r3.length.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(com.mixpanel.android.mpmetrics.MPDbAdapter.Table r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r4 = r4.getName()
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r0 = r3.length     // Catch:{ SQLiteException -> 0x002a }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x002a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r2 = "token = '"
            r1.<init>(r2)     // Catch:{ SQLiteException -> 0x002a }
            r1.append(r5)     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r5 = "'"
            r1.append(r5)     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r5 = r1.toString()     // Catch:{ SQLiteException -> 0x002a }
            r1 = 0
            r0.delete(r4, r5, r1)     // Catch:{ SQLiteException -> 0x002a }
        L_0x0022:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r4 = r3.length
            r4.close()
            return
        L_0x0028:
            r4 = move-exception
            goto L_0x0038
        L_0x002a:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0028 }
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r4 = r3.length     // Catch:{ all -> 0x0028 }
            r4.close()     // Catch:{ all -> 0x0028 }
            java.io.File r4 = r4.length     // Catch:{ all -> 0x0028 }
            r4.delete()     // Catch:{ all -> 0x0028 }
            goto L_0x0022
        L_0x0038:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r5 = r3.length
            r5.close()
            goto L_0x003f
        L_0x003e:
            throw r4
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.length(com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String):void");
    }

    public final synchronized void setMin(String str) {
        setMin(Table.EVENTS, str);
        setMin(Table.PEOPLE, str);
        setMin(Table.GROUPS, str);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.values();
        r4 = r3.length;
        r4.close();
        r4.length.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        r3.length.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMin(com.mixpanel.android.mpmetrics.MPDbAdapter.Table r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r4 = r4.getName()
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r0 = r3.length     // Catch:{ SQLiteException -> 0x0029 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0029 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0029 }
            java.lang.String r2 = "automatic_data = 1 AND token = '"
            r1.<init>(r2)     // Catch:{ SQLiteException -> 0x0029 }
            r1.append(r5)     // Catch:{ SQLiteException -> 0x0029 }
            java.lang.String r5 = "'"
            r1.append(r5)     // Catch:{ SQLiteException -> 0x0029 }
            java.lang.String r5 = r1.toString()     // Catch:{ SQLiteException -> 0x0029 }
            r1 = 0
            r0.delete(r4, r5, r1)     // Catch:{ SQLiteException -> 0x0029 }
        L_0x0021:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r4 = r3.length
            r4.close()
            return
        L_0x0027:
            r4 = move-exception
            goto L_0x0037
        L_0x0029:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0027 }
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r4 = r3.length     // Catch:{ all -> 0x0027 }
            r4.close()     // Catch:{ all -> 0x0027 }
            java.io.File r4 = r4.length     // Catch:{ all -> 0x0027 }
            r4.delete()     // Catch:{ all -> 0x0027 }
            goto L_0x0021
        L_0x0037:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r5 = r3.length
            r5.close()
            goto L_0x003e
        L_0x003d:
            throw r4
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.setMin(com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String[]} */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:35|34|40|41|42|43|(1:45)|(1:47)|48|(0)|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f4, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        r4 = r11;
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        r12.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00cf */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] length(com.mixpanel.android.mpmetrics.MPDbAdapter.Table r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "' "
            java.lang.String r1 = " WHERE token = '"
            java.lang.String r11 = r11.getName()
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r2 = r10.length
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()
            r3 = 0
            r4 = 0
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r7 = "SELECT * FROM "
            r6.<init>(r7)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r6.append(r11)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r6.append(r1)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r6.append(r12)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r6.append(r0)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r6 = r6.toString()     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r8 = "SELECT COUNT(*) FROM "
            r7.<init>(r8)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r7.append(r11)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r7.append(r1)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r7.append(r12)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r7.append(r0)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r11 = r7.toString()     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r6.<init>(r11)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            if (r13 != 0) goto L_0x0054
            java.lang.String r11 = "AND automatic_data = 0 "
            r5.append(r11)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r11 = " AND automatic_data = 0"
            r6.append(r11)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
        L_0x0054:
            java.lang.String r11 = "ORDER BY created_at ASC LIMIT 50"
            r5.append(r11)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r11 = r5.toString()     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            android.database.Cursor r11 = r2.rawQuery(r11, r4)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r12 = r6.toString()     // Catch:{ SQLiteException -> 0x00c7, all -> 0x00c1 }
            android.database.Cursor r12 = r2.rawQuery(r12, r4)     // Catch:{ SQLiteException -> 0x00c7, all -> 0x00c1 }
            r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00bf }
            int r13 = r12.getInt(r3)     // Catch:{ SQLiteException -> 0x00bf }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ SQLiteException -> 0x00bf }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ SQLiteException -> 0x00cf }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00cf }
            r1 = r4
        L_0x007a:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00cf }
            if (r2 == 0) goto L_0x00a3
            boolean r2 = r11.isLast()     // Catch:{ SQLiteException -> 0x00cf }
            if (r2 == 0) goto L_0x0090
            java.lang.String r1 = "_id"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x00cf }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ SQLiteException -> 0x00cf }
        L_0x0090:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007a }
            java.lang.String r5 = "data"
            int r5 = r11.getColumnIndex(r5)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r5 = r11.getString(r5)     // Catch:{ JSONException -> 0x007a }
            r2.<init>(r5)     // Catch:{ JSONException -> 0x007a }
            r0.put(r2)     // Catch:{ JSONException -> 0x007a }
            goto L_0x007a
        L_0x00a3:
            int r2 = r0.length()     // Catch:{ SQLiteException -> 0x00cf }
            if (r2 <= 0) goto L_0x00ae
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x00cf }
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r2 = r10.length
            r2.close()
            if (r11 == 0) goto L_0x00b9
            r11.close()
        L_0x00b9:
            if (r12 == 0) goto L_0x00e3
            r12.close()
            goto L_0x00e3
        L_0x00bf:
            r13 = r4
            goto L_0x00cf
        L_0x00c1:
            r12 = move-exception
            r9 = r4
            r4 = r11
            r11 = r12
            r12 = r9
            goto L_0x00f7
        L_0x00c7:
            r12 = r4
            goto L_0x00ce
        L_0x00c9:
            r11 = move-exception
            r12 = r4
            goto L_0x00f7
        L_0x00cc:
            r11 = r4
            r12 = r11
        L_0x00ce:
            r13 = r12
        L_0x00cf:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x00f4 }
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r0 = r10.length
            r0.close()
            if (r11 == 0) goto L_0x00dc
            r11.close()
        L_0x00dc:
            if (r12 == 0) goto L_0x00e1
            r12.close()
        L_0x00e1:
            r0 = r4
            r1 = r0
        L_0x00e3:
            if (r1 == 0) goto L_0x00f3
            if (r0 == 0) goto L_0x00f3
            r11 = 3
            java.lang.String[] r11 = new java.lang.String[r11]
            r11[r3] = r1
            r12 = 1
            r11[r12] = r0
            r12 = 2
            r11[r12] = r13
            return r11
        L_0x00f3:
            return r4
        L_0x00f4:
            r13 = move-exception
            r4 = r11
            r11 = r13
        L_0x00f7:
            com.mixpanel.android.mpmetrics.MPDbAdapter$length r13 = r10.length
            r13.close()
            if (r4 == 0) goto L_0x0101
            r4.close()
        L_0x0101:
            if (r12 == 0) goto L_0x0106
            r12.close()
        L_0x0106:
            goto L_0x0108
        L_0x0107:
            throw r11
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.length(com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String, boolean):java.lang.String[]");
    }

    private boolean toFloatRange() {
        return this.length.getMax();
    }
}
