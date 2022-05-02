package com.google.android.gms.safetynet;

import android.os.Parcelable;

public final class zze implements Parcelable.Creator<zzd> {
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = r2
            r8 = r4
            r9 = 0
            r10 = 0
        L_0x000c:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0043
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L_0x003e
            r3 = 3
            if (r2 == r3) goto L_0x0034
            r3 = 4
            if (r2 == r3) goto L_0x002f
            r3 = 5
            if (r2 == r3) goto L_0x002a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto L_0x000c
        L_0x002a:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto L_0x000c
        L_0x002f:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            goto L_0x000c
        L_0x0034:
            android.os.Parcelable$Creator<com.google.android.gms.safetynet.HarmfulAppsData> r2 = com.google.android.gms.safetynet.HarmfulAppsData.CREATOR
            java.lang.Object[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r12, r1, r2)
            r8 = r1
            com.google.android.gms.safetynet.HarmfulAppsData[] r8 = (com.google.android.gms.safetynet.HarmfulAppsData[]) r8
            goto L_0x000c
        L_0x003e:
            long r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r1)
            goto L_0x000c
        L_0x0043:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.safetynet.zzd r12 = new com.google.android.gms.safetynet.zzd
            r5 = r12
            r5.<init>(r6, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.zze.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
