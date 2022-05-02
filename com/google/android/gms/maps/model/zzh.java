package com.google.android.gms.maps.model;

import android.os.Parcelable;

public final class zzh implements Parcelable.Creator<MarkerOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r23)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = r3
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 1056964608(0x3f000000, float:0.5)
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
        L_0x0021:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0081
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r23)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto L_0x0077;
                case 3: goto L_0x0072;
                case 4: goto L_0x006d;
                case 5: goto L_0x0068;
                case 6: goto L_0x0063;
                case 7: goto L_0x005e;
                case 8: goto L_0x0059;
                case 9: goto L_0x0054;
                case 10: goto L_0x004f;
                case 11: goto L_0x004a;
                case 12: goto L_0x0045;
                case 13: goto L_0x0040;
                case 14: goto L_0x003b;
                case 15: goto L_0x0036;
                default: goto L_0x0032;
            }
        L_0x0032:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0021
        L_0x0036:
            float r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0021
        L_0x003b:
            float r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0021
        L_0x0040:
            float r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0021
        L_0x0045:
            float r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0021
        L_0x004a:
            float r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0021
        L_0x004f:
            boolean r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0021
        L_0x0054:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0021
        L_0x0059:
            boolean r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0021
        L_0x005e:
            float r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0021
        L_0x0063:
            float r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0021
        L_0x0068:
            android.os.IBinder r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            goto L_0x0021
        L_0x006d:
            java.lang.String r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0021
        L_0x0072:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0021
        L_0x0077:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r8 = r2
            com.google.android.gms.maps.model.LatLng r8 = (com.google.android.gms.maps.model.LatLng) r8
            goto L_0x0021
        L_0x0081:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.maps.model.MarkerOptions r0 = new com.google.android.gms.maps.model.MarkerOptions
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzh.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
