package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public final class zzaj {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r0 == false) goto L_0x0041;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[Catch:{ all -> 0x00e7, SQLiteException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc A[Catch:{ all -> 0x00e7, SQLiteException -> 0x00ec }, LOOP:1: B:32:0x00bc->B:37:0x00ce, LOOP_START, PHI: r12 
      PHI: (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:31:0x00ba, B:37:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7 A[Catch:{ all -> 0x00e7, SQLiteException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[Catch:{  }, RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void zza(com.google.android.gms.measurement.internal.zzem r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) throws android.database.sqlite.SQLiteException {
        /*
            r9 = r15
            r10 = r16
            r11 = r19
            if (r14 == 0) goto L_0x00ff
            r12 = 0
            r13 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0031, all -> 0x002e }
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0031, all -> 0x002e }
            r5[r12] = r10     // Catch:{ SQLiteException -> 0x0031, all -> 0x002e }
            java.lang.String r2 = "SQLITE_MASTER"
            java.lang.String r4 = "name=?"
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r15
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0031, all -> 0x002e }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002c }
            if (r1 == 0) goto L_0x0029
            r1.close()
        L_0x0029:
            if (r0 != 0) goto L_0x0046
            goto L_0x0041
        L_0x002c:
            r0 = move-exception
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            goto L_0x00f9
        L_0x0031:
            r0 = move-exception
            r1 = r13
        L_0x0033:
            com.google.android.gms.measurement.internal.zzek r2 = r14.zze()     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = "Error querying for table"
            r2.zzc(r3, r10, r0)     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            r1 = r17
            r15.execSQL(r1)
        L_0x0046:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00ec }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00ec }
            int r1 = r16.length()     // Catch:{ SQLiteException -> 0x00ec }
            int r1 = r1 + 22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ec }
            r2.<init>(r1)     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r1 = "SELECT * FROM "
            r2.append(r1)     // Catch:{ SQLiteException -> 0x00ec }
            r2.append(r10)     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r1 = " LIMIT 0"
            r2.append(r1)     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r1 = r2.toString()     // Catch:{ SQLiteException -> 0x00ec }
            android.database.Cursor r1 = r15.rawQuery(r1, r13)     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String[] r2 = r1.getColumnNames()     // Catch:{ all -> 0x00e7 }
            java.util.Collections.addAll(r0, r2)     // Catch:{ all -> 0x00e7 }
            r1.close()     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = r2.split(r1)     // Catch:{ SQLiteException -> 0x00ec }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x00ec }
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00ba
            r4 = r1[r3]     // Catch:{ SQLiteException -> 0x00ec }
            boolean r5 = r0.remove(r4)     // Catch:{ SQLiteException -> 0x00ec }
            if (r5 == 0) goto L_0x008c
            int r3 = r3 + 1
            goto L_0x007f
        L_0x008c:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00ec }
            int r1 = r16.length()     // Catch:{ SQLiteException -> 0x00ec }
            int r1 = r1 + 35
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ec }
            int r2 = r2.length()     // Catch:{ SQLiteException -> 0x00ec }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ec }
            r2.<init>(r1)     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r1 = "Table "
            r2.append(r1)     // Catch:{ SQLiteException -> 0x00ec }
            r2.append(r10)     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r1 = " is missing required column: "
            r2.append(r1)     // Catch:{ SQLiteException -> 0x00ec }
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r1 = r2.toString()     // Catch:{ SQLiteException -> 0x00ec }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x00ec }
            throw r0     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00ba:
            if (r11 == 0) goto L_0x00d1
        L_0x00bc:
            int r1 = r11.length     // Catch:{ SQLiteException -> 0x00ec }
            if (r12 >= r1) goto L_0x00d1
            r1 = r11[r12]     // Catch:{ SQLiteException -> 0x00ec }
            boolean r1 = r0.remove(r1)     // Catch:{ SQLiteException -> 0x00ec }
            if (r1 != 0) goto L_0x00ce
            int r1 = r12 + 1
            r1 = r11[r1]     // Catch:{ SQLiteException -> 0x00ec }
            r15.execSQL(r1)     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00ce:
            int r12 = r12 + 2
            goto L_0x00bc
        L_0x00d1:
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00ec }
            if (r1 != 0) goto L_0x00e6
            com.google.android.gms.measurement.internal.zzek r1 = r14.zze()     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r2 = "Table has extra columns. table, columns"
            java.lang.String r3 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r3, r0)     // Catch:{ SQLiteException -> 0x00ec }
            r1.zzc(r2, r10, r0)     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00e6:
            return
        L_0x00e7:
            r0 = move-exception
            r1.close()     // Catch:{ SQLiteException -> 0x00ec }
            throw r0     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzek r1 = r14.zzb()
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.zzb(r2, r10)
            throw r0
        L_0x00f7:
            r0 = move-exception
            r13 = r1
        L_0x00f9:
            if (r13 == 0) goto L_0x00fe
            r13.close()
        L_0x00fe:
            throw r0
        L_0x00ff:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            goto L_0x0108
        L_0x0107:
            throw r0
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zza(com.google.android.gms.measurement.internal.zzem, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    static void zzb(zzem zzem, SQLiteDatabase sQLiteDatabase) {
        if (zzem != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzem.zze().zza("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzem.zze().zza("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzem.zze().zza("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzem.zze().zza("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
