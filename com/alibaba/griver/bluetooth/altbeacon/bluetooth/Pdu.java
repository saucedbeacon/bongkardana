package com.alibaba.griver.bluetooth.altbeacon.bluetooth;

import android.annotation.TargetApi;

public class Pdu {
    public static final byte GATT_SERVICE_UUID_PDU_TYPE = 22;
    public static final byte MANUFACTURER_DATA_PDU_TYPE = -1;

    /* renamed from: a  reason: collision with root package name */
    private byte f10277a;
    private int b;
    private int c;
    private int d;
    private byte[] e;

    @TargetApi(9)
    public static Pdu parse(byte[] bArr, int i) {
        byte b2;
        if (bArr.length - i >= 2 && (b2 = bArr[i]) > 0) {
            byte b3 = bArr[i + 1];
            int i2 = i + 2;
            if (i2 < bArr.length) {
                Pdu pdu = new Pdu();
                int i3 = i + b2;
                pdu.d = i3;
                if (i3 >= bArr.length) {
                    pdu.d = bArr.length - 1;
                }
                pdu.f10277a = b3;
                pdu.b = b2;
                pdu.c = i2;
                pdu.e = bArr;
                return pdu;
            }
        }
        return null;
    }

    public byte getType() {
        return this.f10277a;
    }

    public int getDeclaredLength() {
        return this.b;
    }

    public int getActualLength() {
        return (this.d - this.c) + 1;
    }

    public int getStartIndex() {
        return this.c;
    }

    public int getEndIndex() {
        return this.d;
    }
}
