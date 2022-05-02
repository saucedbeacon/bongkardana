package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfo;

final class zzu {
    final /* synthetic */ zzy zza;
    private zzfo zzb;
    private Long zzc;
    private long zzd;

    /* synthetic */ zzu(zzy zzy, zzs zzs) {
        this.zza = zzy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        if (r14 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0100, code lost:
        if (r14 != null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzfo zza(java.lang.String r18, com.google.android.gms.internal.measurement.zzfo r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.zzd()
            java.util.List r9 = r19.zza()
            com.google.android.gms.measurement.internal.zzy r2 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r2 = r2.zzf
            r2.zzm()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzkp.zzB(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x023b
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01ee
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r0 = r0.zzf
            r0.zzm()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzkp.zzB(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzc()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.zzb(r2, r4)
            return r5
        L_0x0055:
            com.google.android.gms.internal.measurement.zzfo r0 = r1.zzb
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.zzc
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.zzc
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
        L_0x006d:
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r0 = r0.zzf
            com.google.android.gms.measurement.internal.zzai r13 = r0.zzi()
            r13.zzg()
            r13.zzZ()
            android.database.sqlite.SQLiteDatabase r0 = r13.zze()     // Catch:{ SQLiteException -> 0x00ef, all -> 0x00eb }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00ef, all -> 0x00eb }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00ef, all -> 0x00eb }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ef, all -> 0x00eb }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00ef, all -> 0x00eb }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00ef, all -> 0x00eb }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e9 }
            if (r0 != 0) goto L_0x00ac
            com.google.android.gms.measurement.internal.zzfu r0 = r13.zzs     // Catch:{ SQLiteException -> 0x00e9 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ SQLiteException -> 0x00e9 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzk()     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r15 = "Main event not found"
            r0.zza(r15)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r14 == 0) goto L_0x00aa
            r14.close()
        L_0x00aa:
            r0 = r5
            goto L_0x0106
        L_0x00ac:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e9 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e9 }
            com.google.android.gms.internal.measurement.zzfn r5 = com.google.android.gms.internal.measurement.zzfo.zzk()     // Catch:{ IOException -> 0x00d2 }
            com.google.android.gms.internal.measurement.zzlh r0 = com.google.android.gms.measurement.internal.zzkp.zzt(r5, r0)     // Catch:{ IOException -> 0x00d2 }
            com.google.android.gms.internal.measurement.zzfn r0 = (com.google.android.gms.internal.measurement.zzfn) r0     // Catch:{ IOException -> 0x00d2 }
            com.google.android.gms.internal.measurement.zzkd r0 = r0.zzaA()     // Catch:{ IOException -> 0x00d2 }
            com.google.android.gms.internal.measurement.zzfo r0 = (com.google.android.gms.internal.measurement.zzfo) r0     // Catch:{ IOException -> 0x00d2 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r14 == 0) goto L_0x0106
            r14.close()
            goto L_0x0106
        L_0x00d2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r5 = r13.zzs     // Catch:{ SQLiteException -> 0x00e9 }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ SQLiteException -> 0x00e9 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzb()     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzem.zzl(r18)     // Catch:{ SQLiteException -> 0x00e9 }
            r5.zzd(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r14 == 0) goto L_0x0105
            goto L_0x0102
        L_0x00e9:
            r0 = move-exception
            goto L_0x00f1
        L_0x00eb:
            r0 = move-exception
            r5 = 0
            goto L_0x01e8
        L_0x00ef:
            r0 = move-exception
            r14 = 0
        L_0x00f1:
            com.google.android.gms.measurement.internal.zzfu r5 = r13.zzs     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzb()     // Catch:{ all -> 0x01e6 }
            java.lang.String r12 = "Error selecting main event"
            r5.zzb(r12, r0)     // Catch:{ all -> 0x01e6 }
            if (r14 == 0) goto L_0x0105
        L_0x0102:
            r14.close()
        L_0x0105:
            r0 = 0
        L_0x0106:
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x010e
            goto L_0x01d3
        L_0x010e:
            java.lang.Object r5 = r0.first
            com.google.android.gms.internal.measurement.zzfo r5 = (com.google.android.gms.internal.measurement.zzfo) r5
            r1.zzb = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.zzd = r12
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r0 = r0.zzf
            r0.zzm()
            com.google.android.gms.internal.measurement.zzfo r0 = r1.zzb
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzkp.zzB(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.zzc = r0
        L_0x012f:
            long r12 = r1.zzd
            r14 = -1
            long r12 = r12 + r14
            r1.zzd = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0174
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r0 = r0.zzf
            com.google.android.gms.measurement.internal.zzai r2 = r0.zzi()
            r2.zzg()
            com.google.android.gms.measurement.internal.zzfu r0 = r2.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzk()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.zzb(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.zze()     // Catch:{ SQLiteException -> 0x0163 }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0163 }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0163 }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x0163 }
            goto L_0x0185
        L_0x0163:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()
            java.lang.String r3 = "Error clearing complex main event"
            r2.zzb(r3, r0)
            goto L_0x0185
        L_0x0174:
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r0 = r0.zzf
            com.google.android.gms.measurement.internal.zzai r2 = r0.zzi()
            long r5 = r1.zzd
            com.google.android.gms.internal.measurement.zzfo r7 = r1.zzb
            r3 = r18
            r2.zzJ(r3, r4, r5, r7)
        L_0x0185:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.zzfo r2 = r1.zzb
            java.util.List r2 = r2.zza()
            java.util.Iterator r2 = r2.iterator()
        L_0x0194:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3
            com.google.android.gms.measurement.internal.zzy r4 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r4 = r4.zzf
            r4.zzm()
            java.lang.String r4 = r3.zzb()
            com.google.android.gms.internal.measurement.zzfs r4 = com.google.android.gms.measurement.internal.zzkp.zzA(r8, r4)
            if (r4 != 0) goto L_0x0194
            r0.add(r3)
            goto L_0x0194
        L_0x01b5:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01c0
            r0.addAll(r9)
            r9 = r0
            goto L_0x01d1
        L_0x01c0:
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzc()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.zzb(r2, r10)
        L_0x01d1:
            r0 = r10
            goto L_0x023b
        L_0x01d3:
            com.google.android.gms.measurement.internal.zzy r0 = r1.zza
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzc()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.zzc(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01e6:
            r0 = move-exception
            r5 = r14
        L_0x01e8:
            if (r5 == 0) goto L_0x01ed
            r5.close()
        L_0x01ed:
            throw r0
        L_0x01ee:
            r1.zzc = r4
            r1.zzb = r8
            com.google.android.gms.measurement.internal.zzy r2 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r2 = r2.zzf
            r2.zzm()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzkp.zzB(r8, r5)
            if (r5 == 0) goto L_0x0206
            r2 = r5
        L_0x0206:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.zzd = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0224
            com.google.android.gms.measurement.internal.zzy r2 = r1.zza
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzc()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.zzb(r3, r0)
            goto L_0x023b
        L_0x0224:
            com.google.android.gms.measurement.internal.zzy r2 = r1.zza
            com.google.android.gms.measurement.internal.zzkn r2 = r2.zzf
            com.google.android.gms.measurement.internal.zzai r2 = r2.zzi()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.zzd
            r3 = r18
            r7 = r19
            r2.zzJ(r3, r4, r5, r7)
        L_0x023b:
            com.google.android.gms.internal.measurement.zzjz r2 = r19.zzbu()
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2
            r2.zzl(r0)
            r2.zzi()
            r2.zzh(r9)
            com.google.android.gms.internal.measurement.zzkd r0 = r2.zzaA()
            com.google.android.gms.internal.measurement.zzfo r0 = (com.google.android.gms.internal.measurement.zzfo) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.zza(java.lang.String, com.google.android.gms.internal.measurement.zzfo):com.google.android.gms.internal.measurement.zzfo");
    }
}
