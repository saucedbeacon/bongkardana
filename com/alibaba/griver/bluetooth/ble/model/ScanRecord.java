package com.alibaba.griver.bluetooth.ble.model;

import android.util.SparseArray;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothLeUtils;
import java.util.List;
import java.util.Map;

public final class ScanRecord {

    /* renamed from: a  reason: collision with root package name */
    private final int f10281a;
    private final List<String> b;
    private final SparseArray<byte[]> c;
    private final Map<String, String> d;
    private final int e;
    private final String f;
    private final byte[] g;

    private ScanRecord(List<String> list, SparseArray<byte[]> sparseArray, Map<String, String> map, int i, int i2, String str, byte[] bArr) {
        this.b = list;
        this.c = sparseArray;
        this.d = map;
        this.f = str;
        this.f10281a = i;
        this.e = i2;
        this.g = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091 A[Catch:{ Exception -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[Catch:{ Exception -> 0x009c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.griver.bluetooth.ble.model.ScanRecord parseFromBytes(byte[] r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            r2 = -1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r11 = r0
            r9 = -1
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x001b:
            int r2 = r13.length     // Catch:{ Exception -> 0x009c }
            if (r1 >= r2) goto L_0x008b
            int r2 = r1 + 1
            byte r1 = r13[r1]     // Catch:{ Exception -> 0x009c }
            r4 = 255(0xff, float:3.57E-43)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x008b
            int r1 = r1 + -1
            int r5 = r2 + 1
            byte r2 = r13[r2]     // Catch:{ Exception -> 0x009c }
            r2 = r2 & r4
            r6 = 22
            r12 = 2
            if (r2 == r6) goto L_0x0072
            if (r2 == r4) goto L_0x005b
            switch(r2) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0052;
                case 3: goto L_0x0052;
                case 4: goto L_0x004d;
                case 5: goto L_0x004d;
                case 6: goto L_0x0047;
                case 7: goto L_0x0047;
                case 8: goto L_0x003d;
                case 9: goto L_0x003d;
                case 10: goto L_0x0039;
                default: goto L_0x0038;
            }     // Catch:{ Exception -> 0x009c }
        L_0x0038:
            goto L_0x0089
        L_0x0039:
            byte r2 = r13[r5]     // Catch:{ Exception -> 0x009c }
            r10 = r2
            goto L_0x0089
        L_0x003d:
            java.lang.String r11 = new java.lang.String     // Catch:{ Exception -> 0x009c }
            byte[] r2 = a(r13, r5, r1)     // Catch:{ Exception -> 0x009c }
            r11.<init>(r2)     // Catch:{ Exception -> 0x009c }
            goto L_0x0089
        L_0x0047:
            r2 = 16
            a(r13, r5, r1, r2, r3)     // Catch:{ Exception -> 0x009c }
            goto L_0x0089
        L_0x004d:
            r2 = 4
            a(r13, r5, r1, r2, r3)     // Catch:{ Exception -> 0x009c }
            goto L_0x0089
        L_0x0052:
            a(r13, r5, r1, r12, r3)     // Catch:{ Exception -> 0x009c }
            goto L_0x0089
        L_0x0056:
            byte r2 = r13[r5]     // Catch:{ Exception -> 0x009c }
            r2 = r2 & r4
            r9 = r2
            goto L_0x0089
        L_0x005b:
            int r2 = r5 + 1
            byte r2 = r13[r2]     // Catch:{ Exception -> 0x009c }
            r2 = r2 & r4
            int r2 = r2 << 8
            byte r6 = r13[r5]     // Catch:{ Exception -> 0x009c }
            r4 = r4 & r6
            int r2 = r2 + r4
            int r4 = r5 + 2
            int r6 = r1 + -2
            byte[] r4 = a(r13, r4, r6)     // Catch:{ Exception -> 0x009c }
            r7.put(r2, r4)     // Catch:{ Exception -> 0x009c }
            goto L_0x0089
        L_0x0072:
            byte[] r2 = a(r13, r5, r12)     // Catch:{ Exception -> 0x009c }
            int r4 = r5 + 2
            int r6 = r1 + -2
            byte[] r4 = a(r13, r4, r6)     // Catch:{ Exception -> 0x009c }
            java.lang.String r2 = com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper.bytesToHexStringInReverse(r2)     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper.bytesToHexString(r4)     // Catch:{ Exception -> 0x009c }
            r8.put(r2, r4)     // Catch:{ Exception -> 0x009c }
        L_0x0089:
            int r1 = r1 + r5
            goto L_0x001b
        L_0x008b:
            boolean r1 = r3.isEmpty()     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x0093
            r6 = r0
            goto L_0x0094
        L_0x0093:
            r6 = r3
        L_0x0094:
            com.alibaba.griver.bluetooth.ble.model.ScanRecord r0 = new com.alibaba.griver.bluetooth.ble.model.ScanRecord     // Catch:{ Exception -> 0x009c }
            r5 = r0
            r12 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x009c }
            return r0
        L_0x009c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unable to parse scan record: "
            r0.<init>(r1)
            java.lang.String r1 = java.util.Arrays.toString(r13)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ScanRecord"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r0)
            com.alibaba.griver.bluetooth.ble.model.ScanRecord r0 = new com.alibaba.griver.bluetooth.ble.model.ScanRecord
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = -1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r2 = r0
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.ble.model.ScanRecord.parseFromBytes(byte[]):com.alibaba.griver.bluetooth.ble.model.ScanRecord");
    }

    private static int a(byte[] bArr, int i, int i2, int i3, List<String> list) {
        while (i2 > 0) {
            byte[] a2 = a(bArr, i, i3);
            if (i3 == 2 || i3 == 4) {
                list.add(BluetoothHelper.bytesToHexStringInReverse(a2));
            } else {
                list.add(BluetoothUuid.parseUuidFrom(a2).toString());
            }
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final int getAdvertiseFlags() {
        return this.f10281a;
    }

    public final List<String> getServiceUuids() {
        return this.b;
    }

    public final SparseArray<byte[]> getManufacturerSpecificData() {
        return this.c;
    }

    public final byte[] getManufacturerSpecificData(int i) {
        return this.c.get(i);
    }

    public final Map<String, String> getServiceData() {
        return this.d;
    }

    public final int getTxPowerLevel() {
        return this.e;
    }

    public final String getDeviceName() {
        return this.f;
    }

    public final byte[] getBytes() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScanRecord [mAdvertiseFlags=");
        sb.append(this.f10281a);
        sb.append(", mServiceUuids=");
        sb.append(BluetoothLeUtils.toString(this.b));
        sb.append(", mManufacturerSpecificData=");
        sb.append(BluetoothLeUtils.toString(this.c));
        sb.append(", mServiceData=");
        sb.append(BluetoothLeUtils.toString(this.d));
        sb.append(", mTxPowerLevel=");
        sb.append(this.e);
        sb.append(", mDeviceName=");
        sb.append(this.f);
        sb.append("]");
        return sb.toString();
    }
}
