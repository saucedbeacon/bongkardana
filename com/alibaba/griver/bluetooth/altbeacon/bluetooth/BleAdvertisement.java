package com.alibaba.griver.bluetooth.altbeacon.bluetooth;

import java.util.List;

public class BleAdvertisement {

    /* renamed from: a  reason: collision with root package name */
    private List<Pdu> f10275a = a();
    private byte[] b;

    public BleAdvertisement(byte[] bArr) {
        this.b = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.alibaba.griver.bluetooth.altbeacon.bluetooth.Pdu> a() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x0006:
            byte[] r2 = r4.b
            com.alibaba.griver.bluetooth.altbeacon.bluetooth.Pdu r2 = com.alibaba.griver.bluetooth.altbeacon.bluetooth.Pdu.parse(r2, r1)
            if (r2 == 0) goto L_0x0018
            int r3 = r2.getDeclaredLength()
            int r1 = r1 + r3
            int r1 = r1 + 1
            r0.add(r2)
        L_0x0018:
            if (r2 == 0) goto L_0x001f
            byte[] r2 = r4.b
            int r2 = r2.length
            if (r1 < r2) goto L_0x0006
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.bluetooth.BleAdvertisement.a():java.util.List");
    }

    public List<Pdu> getPdus() {
        return this.f10275a;
    }
}
