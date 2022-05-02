package com.google.android.gms.maps;

import android.os.Parcelable;

public final class zzaa implements Parcelable.Creator<GoogleMapOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            r23 = this;
            r0 = r24
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r24)
            r2 = 0
            r3 = -1
            r4 = 0
            r9 = r2
            r19 = r9
            r20 = r19
            r21 = r20
            r6 = -1
            r7 = -1
            r8 = 0
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r22 = -1
        L_0x0021:
            int r2 = r24.dataPosition()
            if (r2 >= r1) goto L_0x0096
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r24)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto L_0x0091;
                case 3: goto L_0x008c;
                case 4: goto L_0x0087;
                case 5: goto L_0x007d;
                case 6: goto L_0x0078;
                case 7: goto L_0x0073;
                case 8: goto L_0x006e;
                case 9: goto L_0x0069;
                case 10: goto L_0x0064;
                case 11: goto L_0x005f;
                case 12: goto L_0x005a;
                case 13: goto L_0x0032;
                case 14: goto L_0x0055;
                case 15: goto L_0x0050;
                case 16: goto L_0x004b;
                case 17: goto L_0x0046;
                case 18: goto L_0x003b;
                case 19: goto L_0x0036;
                default: goto L_0x0032;
            }
        L_0x0032:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0021
        L_0x0036:
            byte r22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x003b:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLngBounds> r3 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r21 = r2
            com.google.android.gms.maps.model.LatLngBounds r21 = (com.google.android.gms.maps.model.LatLngBounds) r21
            goto L_0x0021
        L_0x0046:
            java.lang.Float r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(r0, r2)
            goto L_0x0021
        L_0x004b:
            java.lang.Float r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(r0, r2)
            goto L_0x0021
        L_0x0050:
            byte r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x0055:
            byte r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x005a:
            byte r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x005f:
            byte r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x0064:
            byte r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x0069:
            byte r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x006e:
            byte r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x0073:
            byte r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x0078:
            byte r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x007d:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.CameraPosition> r3 = com.google.android.gms.maps.model.CameraPosition.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r9 = r2
            com.google.android.gms.maps.model.CameraPosition r9 = (com.google.android.gms.maps.model.CameraPosition) r9
            goto L_0x0021
        L_0x0087:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0021
        L_0x008c:
            byte r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x0091:
            byte r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(r0, r2)
            goto L_0x0021
        L_0x0096:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.maps.GoogleMapOptions r0 = new com.google.android.gms.maps.GoogleMapOptions
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.zzaa.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
