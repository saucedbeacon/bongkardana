package com.google.android.gms.maps.model;

import android.os.Parcelable;

public final class zzc implements Parcelable.Creator<CircleOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r19) {
        /*
            r18 = this;
            r0 = r19
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r19)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = r3
            r17 = r8
            r9 = r5
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            int r2 = r19.dataPosition()
            if (r2 >= r1) goto L_0x005f
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r19)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto L_0x0055;
                case 3: goto L_0x0050;
                case 4: goto L_0x004b;
                case 5: goto L_0x0046;
                case 6: goto L_0x0041;
                case 7: goto L_0x003c;
                case 8: goto L_0x0037;
                case 9: goto L_0x0032;
                case 10: goto L_0x002b;
                default: goto L_0x0027;
            }
        L_0x0027:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0016
        L_0x002b:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.PatternItem> r3 = com.google.android.gms.maps.model.PatternItem.CREATOR
            java.util.ArrayList r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r0, r2, r3)
            goto L_0x0016
        L_0x0032:
            boolean r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0016
        L_0x0037:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0016
        L_0x003c:
            float r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0016
        L_0x0041:
            int r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0016
        L_0x0046:
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0016
        L_0x004b:
            float r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0016
        L_0x0050:
            double r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r0, r2)
            goto L_0x0016
        L_0x0055:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r8 = r2
            com.google.android.gms.maps.model.LatLng r8 = (com.google.android.gms.maps.model.LatLng) r8
            goto L_0x0016
        L_0x005f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.maps.model.CircleOptions r0 = new com.google.android.gms.maps.model.CircleOptions
            r7 = r0
            r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzc.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
