package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;

@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzg();
    private static final String TAG = MapStyleOptions.class.getSimpleName();
    private static char[] getMin = null;
    private static int length = 0;
    private static int setMin = 1;
    @SafeParcelable.Field(getter = "getJson", id = 2)
    private String zzdl;

    @SafeParcelable.Constructor
    public MapStyleOptions(@SafeParcelable.Param(id = 2) String str) {
        try {
            this.zzdl = str;
        } catch (Exception e) {
            throw e;
        }
    }

    static void setMin() {
        getMin = new char[]{28, '2', '9', 'M', 'T'};
    }

    public static MapStyleOptions loadRawResourceStyle(Context context, int i) throws Resources.NotFoundException {
        try {
            MapStyleOptions mapStyleOptions = new MapStyleOptions(new String(IOUtils.readInputStreamFully(context.getResources().openRawResource(i)), setMax(new int[]{0, 5, 0, 0}, new byte[]{0, 1, 1, 0, 1}, !KeyEvent.isGamepadButton(0)).intern()));
            int i2 = length + 125;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            return mapStyleOptions;
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Failed to read resource ");
            sb.append(i);
            sb.append(": ");
            sb.append(valueOf);
            throw new Resources.NotFoundException(sb.toString());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader;
        String str;
        boolean z;
        int i2 = setMin + 115;
        length = i2 % 128;
        int i3 = 2;
        if ((i2 % 2 != 0 ? 15 : 'P') != 'P') {
            beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            i3 = 5;
            str = this.zzdl;
            z = true;
        } else {
            beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            str = this.zzdl;
            z = false;
        }
        SafeParcelWriter.writeString(parcel, i3, str, z);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    static {
        setMin();
        int i = setMin + 59;
        length = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r13[r7] == 1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if ((r13[r7] != 1) != true) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r1[r7] = (char) ((r8[r7] << 1) - r9);
        r9 = length + 69;
        setMin = r9 % 128;
        r9 = r9 % 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int[] r12, byte[] r13, boolean r14) {
        /*
            r0 = 0
            r1 = r12[r0]
            r2 = 1
            r3 = r12[r2]
            r4 = 2
            r5 = r12[r4]
            r6 = 3
            r6 = r12[r6]
            char[] r7 = getMin
            char[] r8 = new char[r3]
            java.lang.System.arraycopy(r7, r1, r8, r0, r3)
            if (r13 == 0) goto L_0x0076
            char[] r1 = new char[r3]
            r7 = 0
            r9 = 0
        L_0x0019:
            if (r7 >= r3) goto L_0x0075
            int r10 = length     // Catch:{ Exception -> 0x0073 }
            int r10 = r10 + 19
            int r11 = r10 % 128
            setMin = r11     // Catch:{ Exception -> 0x0071 }
            int r10 = r10 % 2
            if (r10 != 0) goto L_0x002c
            byte r10 = r13[r7]
            if (r10 != r2) goto L_0x0053
            goto L_0x0035
        L_0x002c:
            byte r10 = r13[r7]
            if (r10 != r2) goto L_0x0032
            r10 = 0
            goto L_0x0033
        L_0x0032:
            r10 = 1
        L_0x0033:
            if (r10 == r2) goto L_0x0053
        L_0x0035:
            int r10 = setMin     // Catch:{ Exception -> 0x0071 }
            int r10 = r10 + 53
            int r11 = r10 % 128
            length = r11     // Catch:{ Exception -> 0x0071 }
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x004a
            char r10 = r8[r7]
            int r10 = r10 >>> r0
            int r10 = r10 - r0
            int r10 = r10 / r9
            char r9 = (char) r10
            r1[r7] = r9
            goto L_0x0063
        L_0x004a:
            char r10 = r8[r7]
            int r10 = r10 << r2
            int r10 = r10 + r2
            int r10 = r10 - r9
            char r9 = (char) r10
            r1[r7] = r9
            goto L_0x0063
        L_0x0053:
            char r10 = r8[r7]
            int r10 = r10 << r2
            int r10 = r10 - r9
            char r9 = (char) r10
            r1[r7] = r9
            int r9 = length
            int r9 = r9 + 69
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % r4
        L_0x0063:
            char r9 = r1[r7]
            int r7 = r7 + 1
            int r10 = length
            int r10 = r10 + 19
            int r11 = r10 % 128
            setMin = r11
            int r10 = r10 % r4
            goto L_0x0019
        L_0x0071:
            r12 = move-exception
            throw r12
        L_0x0073:
            r12 = move-exception
            throw r12
        L_0x0075:
            r8 = r1
        L_0x0076:
            if (r6 <= 0) goto L_0x00a9
            int r13 = length
            int r13 = r13 + 97
            int r1 = r13 % 128
            setMin = r1
            int r13 = r13 % r4
            r1 = 35
            if (r13 != 0) goto L_0x0088
            r13 = 35
            goto L_0x008a
        L_0x0088:
            r13 = 70
        L_0x008a:
            if (r13 == r1) goto L_0x009a
            char[] r13 = new char[r3]
            java.lang.System.arraycopy(r8, r0, r13, r0, r3)
            int r1 = r3 - r6
            java.lang.System.arraycopy(r13, r0, r8, r1, r6)
            java.lang.System.arraycopy(r13, r6, r8, r0, r1)
            goto L_0x00a9
        L_0x009a:
            char[] r13 = new char[r3]
            java.lang.System.arraycopy(r8, r2, r13, r2, r3)
            int r1 = r3 >> r6
            java.lang.System.arraycopy(r13, r0, r8, r1, r6)
            int r1 = r3 / r6
            java.lang.System.arraycopy(r13, r6, r8, r2, r1)
        L_0x00a9:
            if (r14 == 0) goto L_0x00bb
            char[] r13 = new char[r3]
            r14 = 0
        L_0x00ae:
            if (r14 >= r3) goto L_0x00ba
            int r1 = r3 - r14
            int r1 = r1 - r2
            char r1 = r8[r1]
            r13[r14] = r1
            int r14 = r14 + 1
            goto L_0x00ae
        L_0x00ba:
            r8 = r13
        L_0x00bb:
            if (r5 <= 0) goto L_0x00d1
            r13 = 0
        L_0x00be:
            if (r13 >= r3) goto L_0x00c2
            r14 = 0
            goto L_0x00c3
        L_0x00c2:
            r14 = 1
        L_0x00c3:
            if (r14 == 0) goto L_0x00c6
            goto L_0x00d1
        L_0x00c6:
            char r14 = r8[r13]
            r1 = r12[r4]
            int r14 = r14 - r1
            char r14 = (char) r14
            r8[r13] = r14
            int r13 = r13 + 1
            goto L_0x00be
        L_0x00d1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.MapStyleOptions.setMax(int[], byte[], boolean):java.lang.String");
    }
}
