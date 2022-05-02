package o;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class jumpDrawablesToCurrentState extends SupportSQLiteOpenHelper.setMax {
    @Nullable
    private setOverrideVisibleItems getMax;
    @NonNull
    private final String getMin;
    @NonNull
    private final String length;
    @NonNull
    private final getMin setMin;

    public jumpDrawablesToCurrentState(@NonNull setOverrideVisibleItems setoverridevisibleitems, @NonNull getMin getmin, @NonNull String str, @NonNull String str2) {
        super(getmin.version);
        this.getMax = setoverridevisibleitems;
        this.setMin = getmin;
        this.length = str;
        this.getMin = str2;
    }

    public final void length(SupportSQLiteDatabase supportSQLiteDatabase) {
        boolean min = getMin(supportSQLiteDatabase);
        this.setMin.createAllTables(supportSQLiteDatabase);
        if (!min) {
            setMax onValidateSchema = this.setMin.onValidateSchema(supportSQLiteDatabase);
            if (!onValidateSchema.length) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(onValidateSchema.getMin);
                throw new IllegalStateException(sb.toString());
            }
        }
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.length;
        StringBuilder sb2 = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb2.append(str);
        sb2.append("')");
        supportSQLiteDatabase.execSQL(sb2.toString());
        this.setMin.onCreate(supportSQLiteDatabase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(androidx.sqlite.db.SupportSQLiteDatabase r6, int r7, int r8) {
        /*
            r5 = this;
            o.setOverrideVisibleItems r0 = r5.getMax
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007b
            androidx.room.RoomDatabase$setMin r0 = r0.getMax
            if (r7 != r8) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x001d
        L_0x000f:
            if (r8 <= r7) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r0.length(r4, r3, r7, r8)
        L_0x001d:
            if (r0 == 0) goto L_0x007b
            o.jumpDrawablesToCurrentState$getMin r2 = r5.setMin
            r2.onPreMigrate(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r0.next()
            o.onLayout r2 = (o.onLayout) r2
            r2.getMin(r6)
            goto L_0x0028
        L_0x0038:
            o.jumpDrawablesToCurrentState$getMin r0 = r5.setMin
            o.jumpDrawablesToCurrentState$setMax r0 = r0.onValidateSchema(r6)
            boolean r2 = r0.length
            if (r2 == 0) goto L_0x0065
            o.jumpDrawablesToCurrentState$getMin r0 = r5.setMin
            r0.onPostMigrate(r6)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r6.execSQL(r0)
            java.lang.String r0 = r5.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "')"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.execSQL(r0)
            goto L_0x007c
        L_0x0065:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Migration didn't properly handle: "
            r7.<init>(r8)
            java.lang.String r8 = r0.getMin
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r1 != 0) goto L_0x00b4
            o.setOverrideVisibleItems r0 = r5.getMax
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.getMax(r7, r8)
            if (r0 != 0) goto L_0x0093
            o.jumpDrawablesToCurrentState$getMin r7 = r5.setMin
            r7.dropAllTables(r6)
            o.jumpDrawablesToCurrentState$getMin r7 = r5.setMin
            r7.createAllTables(r6)
            return
        L_0x0093:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " to "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jumpDrawablesToCurrentState.getMax(androidx.sqlite.db.SupportSQLiteDatabase, int, int):void");
    }

    public final void getMin(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        getMax(supportSQLiteDatabase, i, i2);
    }

    /* JADX INFO: finally extract failed */
    public final void getMax(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.getMax(supportSQLiteDatabase);
        if (setMin(supportSQLiteDatabase)) {
            Cursor query = supportSQLiteDatabase.query((SupportSQLiteQuery) new setTitleOptional("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = query.moveToFirst() ? query.getString(0) : null;
                query.close();
                if (!this.length.equals(string) && !this.getMin.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            setMax onValidateSchema = this.setMin.onValidateSchema(supportSQLiteDatabase);
            if (onValidateSchema.length) {
                this.setMin.onPostMigrate(supportSQLiteDatabase);
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                String str = this.length;
                StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
                sb.append(str);
                sb.append("')");
                supportSQLiteDatabase.execSQL(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb2.append(onValidateSchema.getMin);
                throw new IllegalStateException(sb2.toString());
            }
        }
        this.setMin.onOpen(supportSQLiteDatabase);
        this.getMax = null;
    }

    private static boolean setMin(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor query = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            query.close();
        }
    }

    private static boolean getMin(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor query = supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (query.moveToFirst() && query.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            query.close();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class getMin {
        public final int version;

        /* access modifiers changed from: protected */
        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        /* access modifiers changed from: protected */
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* access modifiers changed from: protected */
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public getMin(int i) {
            this.version = i;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        /* access modifiers changed from: protected */
        @NonNull
        public setMax onValidateSchema(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            validateMigration(supportSQLiteDatabase);
            return new setMax(true, (String) null);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class setMax {
        @Nullable
        public final String getMin;
        public final boolean length;

        public setMax(boolean z, @Nullable String str) {
            this.length = z;
            this.getMin = str;
        }
    }
}
