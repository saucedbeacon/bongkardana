package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzeg extends zzf {
    private final zzef zza;
    private boolean zzb;

    zzeg(zzfu zzfu) {
        super(zzfu);
        Context zzax = this.zzs.zzax();
        this.zzs.zzc();
        this.zza = new zzef(this, zzax, "google_app_measurement_local.db");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119 A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzq(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.zzg()
            boolean r0 = r1.zzb
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs
            r0.zzc()
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0028:
            if (r5 >= r4) goto L_0x012d
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.zzo()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c2, all -> 0x00bf }
            if (r9 != 0) goto L_0x0035
            r1.zzb = r7     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            r11 = 0
            if (r10 == 0) goto L_0x0054
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0054
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            goto L_0x0121
        L_0x0050:
            r0 = move-exception
            goto L_0x00b9
        L_0x0052:
            r0 = move-exception
            goto L_0x00bd
        L_0x0054:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009f
            com.google.android.gms.measurement.internal.zzfu r15 = r1.zzs     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.zzem r15 = r15.zzau()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.zzek r15 = r15.zzb()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r15.zza(r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.measurement.internal.zzfu r4 = r1.zzs     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzau()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.zzek r4 = r4.zzb()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4.zzd(r15, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
        L_0x009f:
            r9.insertOrThrow(r0, r8, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            r9.close()
            r2 = 1
            return r2
        L_0x00b2:
            r8 = r10
            goto L_0x00ea
        L_0x00b4:
            r0 = move-exception
            goto L_0x0122
        L_0x00b7:
            r0 = move-exception
            r10 = r8
        L_0x00b9:
            r8 = r9
            goto L_0x00c4
        L_0x00bb:
            r0 = move-exception
            r10 = r8
        L_0x00bd:
            r8 = r9
            goto L_0x00fd
        L_0x00bf:
            r0 = move-exception
            r9 = r8
            goto L_0x0122
        L_0x00c2:
            r0 = move-exception
            r10 = r8
        L_0x00c4:
            if (r8 == 0) goto L_0x00cf
            boolean r2 = r8.inTransaction()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x00cf
            r8.endTransaction()     // Catch:{ all -> 0x011f }
        L_0x00cf:
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzs     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry to local database"
            r2.zzb(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.zzb = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x00e6
            r10.close()
        L_0x00e6:
            if (r8 == 0) goto L_0x0119
            goto L_0x0116
        L_0x00e9:
            r9 = r8
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b4 }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00f5
            r8.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0119
            r9.close()
            goto L_0x0119
        L_0x00fb:
            r0 = move-exception
            r10 = r8
        L_0x00fd:
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzs     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.zzb(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.zzb = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x0114
            r10.close()
        L_0x0114:
            if (r8 == 0) goto L_0x0119
        L_0x0116:
            r8.close()
        L_0x0119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x011f:
            r0 = move-exception
            r9 = r8
        L_0x0121:
            r8 = r10
        L_0x0122:
            if (r8 == 0) goto L_0x0127
            r8.close()
        L_0x0127:
            if (r9 == 0) goto L_0x012c
            r9.close()
        L_0x012c:
            throw r0
        L_0x012d:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzk()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.zza(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeg.zzq(int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean zze() {
        return false;
    }

    @WorkerThread
    public final void zzh() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzo = zzo();
            if (zzo != null && (delete = zzo.delete("messages", (String) null, (String[]) null)) > 0) {
                this.zzs.zzau().zzk().zzb("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.zzs.zzau().zzb().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzi(zzas zzas) {
        Parcel obtain = Parcel.obtain();
        zzat.zza(zzas, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(0, marshall);
        }
        this.zzs.zzau().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzkq zzkq) {
        Parcel obtain = Parcel.obtain();
        zzkr.zza(zzkq, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzs.zzau().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(zzaa zzaa) {
        byte[] zzX = this.zzs.zzl().zzX(zzaa);
        if (zzX.length <= 131072) {
            return zzq(2, zzX);
        }
        this.zzs.zzau().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:70|71|72|73) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:85|86|87|88) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:57|58|59|60|202) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r1.zzs.zzau().zzb().zza("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1.zzs.zzau().zzb().zza("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r1.zzs.zzau().zzb().zza("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x010c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0144 */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01e0 A[SYNTHETIC, Splitter:B:128:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0205 A[SYNTHETIC, Splitter:B:156:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0252 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzl(int r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "Error reading entries from local database"
            r22.zzg()
            boolean r0 = r1.zzb
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r22.zzp()
            if (r0 == 0) goto L_0x0273
            r6 = 5
            r7 = 0
            r8 = 0
            r9 = 5
        L_0x001e:
            if (r8 >= r6) goto L_0x0263
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r22.zzo()     // Catch:{ SQLiteFullException -> 0x0238, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x0200, all -> 0x01fd }
            if (r15 != 0) goto L_0x002a
            r1.zzb = r10     // Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f4, SQLiteException -> 0x01ef, all -> 0x01ea }
            return r4
        L_0x002a:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f4, SQLiteException -> 0x01ef, all -> 0x01ea }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[]{r2}     // Catch:{ all -> 0x01db }
            java.lang.String r14 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01db }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r11 = r15
            r23 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01d7 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01d3 }
            r20 = -1
            if (r0 == 0) goto L_0x005d
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01d3 }
            if (r11 == 0) goto L_0x0078
            r11.close()     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            goto L_0x0078
        L_0x005d:
            if (r11 == 0) goto L_0x0076
            r11.close()     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            goto L_0x0076
        L_0x0063:
            r0 = move-exception
            r14 = r23
            goto L_0x01ec
        L_0x0068:
            r0 = move-exception
            r14 = r23
            goto L_0x01f1
        L_0x006d:
            r14 = r23
            goto L_0x01f5
        L_0x0071:
            r0 = move-exception
            r14 = r23
            goto L_0x01fa
        L_0x0076:
            r12 = r20
        L_0x0078:
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            r14 = r0
            r15 = r11
            goto L_0x008b
        L_0x0089:
            r14 = r4
            r15 = r14
        L_0x008b:
            java.lang.String r0 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r13 = new java.lang.String[]{r2, r0, r11}     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            java.lang.String r12 = "messages"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid asc"
            r0 = 100
            java.lang.String r19 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            r11 = r23
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
        L_0x00a7:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            if (r0 == 0) goto L_0x0187
            long r20 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r12 = 2
            byte[] r13 = r11.getBlob(r12)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            if (r0 != 0) goto L_0x00f1
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00da }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00da }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00da }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzas> r0 = com.google.android.gms.measurement.internal.zzas.CREATOR     // Catch:{ ParseException -> 0x00da }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00da }
            com.google.android.gms.measurement.internal.zzas r0 = (com.google.android.gms.measurement.internal.zzas) r0     // Catch:{ ParseException -> 0x00da }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            if (r0 == 0) goto L_0x00a7
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x00d8:
            r0 = move-exception
            goto L_0x00ed
        L_0x00da:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs     // Catch:{ all -> 0x00d8 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x00d8 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = "Failed to load event from local database"
            r0.zza(r13)     // Catch:{ all -> 0x00d8 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x00ed:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
        L_0x00f1:
            if (r0 != r10) goto L_0x0129
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x010c }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x010c }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x010c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzkq> r0 = com.google.android.gms.measurement.internal.zzkq.CREATOR     // Catch:{ ParseException -> 0x010c }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x010c }
            com.google.android.gms.measurement.internal.zzkq r0 = (com.google.android.gms.measurement.internal.zzkq) r0     // Catch:{ ParseException -> 0x010c }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x011f
        L_0x010a:
            r0 = move-exception
            goto L_0x0125
        L_0x010c:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs     // Catch:{ all -> 0x010a }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x010a }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ all -> 0x010a }
            java.lang.String r13 = "Failed to load user property from local database"
            r0.zza(r13)     // Catch:{ all -> 0x010a }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r0 = r4
        L_0x011f:
            if (r0 == 0) goto L_0x00a7
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x0125:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
        L_0x0129:
            if (r0 != r12) goto L_0x0162
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x0144 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x0144 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x0144 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaa> r0 = com.google.android.gms.measurement.internal.zzaa.CREATOR     // Catch:{ ParseException -> 0x0144 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x0144 }
            com.google.android.gms.measurement.internal.zzaa r0 = (com.google.android.gms.measurement.internal.zzaa) r0     // Catch:{ ParseException -> 0x0144 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x0157
        L_0x0142:
            r0 = move-exception
            goto L_0x015e
        L_0x0144:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs     // Catch:{ all -> 0x0142 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x0142 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ all -> 0x0142 }
            java.lang.String r13 = "Failed to load conditional user property from local database"
            r0.zza(r13)     // Catch:{ all -> 0x0142 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r0 = r4
        L_0x0157:
            if (r0 == 0) goto L_0x00a7
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x015e:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
        L_0x0162:
            r12 = 3
            if (r0 != r12) goto L_0x0176
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zze()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = "Skipping app launch break"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x0176:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = "Unknown record type in local database"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x0187:
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = java.lang.Long.toString(r20)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r0[r7] = r12     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = "messages"
            java.lang.String r13 = "rowid <= ?"
            r14 = r23
            int r0 = r14.delete(r12, r13, r0)     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            int r12 = r5.size()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            if (r0 >= r12) goto L_0x01ae
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            java.lang.String r12 = "Fewer entries removed from local database than expected"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
        L_0x01ae:
            r14.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            r14.endTransaction()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            if (r11 == 0) goto L_0x01b9
            r11.close()
        L_0x01b9:
            r14.close()
            return r5
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c6
        L_0x01bf:
            r0 = move-exception
            goto L_0x01f2
        L_0x01c1:
            r0 = move-exception
            goto L_0x01fb
        L_0x01c3:
            r0 = move-exception
            r14 = r23
        L_0x01c6:
            r4 = r11
            goto L_0x01ec
        L_0x01c8:
            r0 = move-exception
            r14 = r23
            goto L_0x01f2
        L_0x01cc:
            r14 = r23
            goto L_0x01f6
        L_0x01cf:
            r0 = move-exception
            r14 = r23
            goto L_0x01fb
        L_0x01d3:
            r0 = move-exception
            r14 = r23
            goto L_0x01de
        L_0x01d7:
            r0 = move-exception
            r14 = r23
            goto L_0x01dd
        L_0x01db:
            r0 = move-exception
            r14 = r15
        L_0x01dd:
            r11 = r4
        L_0x01de:
            if (r11 == 0) goto L_0x01e3
            r11.close()     // Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01e6, all -> 0x01e4 }
        L_0x01e3:
            throw r0     // Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01e6, all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e6:
            r0 = move-exception
            goto L_0x01f1
        L_0x01e8:
            r0 = move-exception
            goto L_0x01fa
        L_0x01ea:
            r0 = move-exception
            r14 = r15
        L_0x01ec:
            r15 = r14
            goto L_0x0258
        L_0x01ef:
            r0 = move-exception
            r14 = r15
        L_0x01f1:
            r11 = r4
        L_0x01f2:
            r15 = r14
            goto L_0x0203
        L_0x01f4:
            r14 = r15
        L_0x01f5:
            r11 = r4
        L_0x01f6:
            r15 = r14
            goto L_0x0227
        L_0x01f8:
            r0 = move-exception
            r14 = r15
        L_0x01fa:
            r11 = r4
        L_0x01fb:
            r15 = r14
            goto L_0x023b
        L_0x01fd:
            r0 = move-exception
            r15 = r4
            goto L_0x0258
        L_0x0200:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x0203:
            if (r15 == 0) goto L_0x020e
            boolean r12 = r15.inTransaction()     // Catch:{ all -> 0x0256 }
            if (r12 == 0) goto L_0x020e
            r15.endTransaction()     // Catch:{ all -> 0x0256 }
        L_0x020e:
            com.google.android.gms.measurement.internal.zzfu r12 = r1.zzs     // Catch:{ all -> 0x0256 }
            com.google.android.gms.measurement.internal.zzem r12 = r12.zzau()     // Catch:{ all -> 0x0256 }
            com.google.android.gms.measurement.internal.zzek r12 = r12.zzb()     // Catch:{ all -> 0x0256 }
            r12.zzb(r3, r0)     // Catch:{ all -> 0x0256 }
            r1.zzb = r10     // Catch:{ all -> 0x0256 }
            if (r11 == 0) goto L_0x0222
            r11.close()
        L_0x0222:
            if (r15 == 0) goto L_0x0252
            goto L_0x0234
        L_0x0225:
            r11 = r4
            r15 = r11
        L_0x0227:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0256 }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x0232
            r11.close()
        L_0x0232:
            if (r15 == 0) goto L_0x0252
        L_0x0234:
            r15.close()
            goto L_0x0252
        L_0x0238:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x023b:
            com.google.android.gms.measurement.internal.zzfu r12 = r1.zzs     // Catch:{ all -> 0x0256 }
            com.google.android.gms.measurement.internal.zzem r12 = r12.zzau()     // Catch:{ all -> 0x0256 }
            com.google.android.gms.measurement.internal.zzek r12 = r12.zzb()     // Catch:{ all -> 0x0256 }
            r12.zzb(r3, r0)     // Catch:{ all -> 0x0256 }
            r1.zzb = r10     // Catch:{ all -> 0x0256 }
            if (r11 == 0) goto L_0x024f
            r11.close()
        L_0x024f:
            if (r15 == 0) goto L_0x0252
            goto L_0x0234
        L_0x0252:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0256:
            r0 = move-exception
            r4 = r11
        L_0x0258:
            if (r4 == 0) goto L_0x025d
            r4.close()
        L_0x025d:
            if (r15 == 0) goto L_0x0262
            r15.close()
        L_0x0262:
            throw r0
        L_0x0263:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zze()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.zza(r2)
            return r4
        L_0x0273:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeg.zzl(int):java.util.List");
    }

    @WorkerThread
    public final boolean zzm() {
        return zzq(3, new byte[0]);
    }

    @WorkerThread
    public final boolean zzn() {
        zzg();
        if (!this.zzb && zzp()) {
            int i = 0;
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase zzo = zzo();
                    if (zzo == null) {
                        this.zzb = true;
                        return false;
                    }
                    zzo.beginTransaction();
                    zzo.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    zzo.setTransactionSuccessful();
                    zzo.endTransaction();
                    zzo.close();
                    return true;
                } catch (SQLiteFullException e) {
                    this.zzs.zzau().zzb().zzb("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteException e2) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.zzs.zzau().zzb().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.zzs.zzau().zze().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    public final SQLiteDatabase zzo() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean zzp() {
        Context zzax = this.zzs.zzax();
        this.zzs.zzc();
        return zzax.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
