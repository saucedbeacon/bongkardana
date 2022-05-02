package com.alipay.alipaysecuritysdk.common.collector;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;

public class DeviceInfo2 {
    public static void write(int i, byte[] bArr, int i2) {
        bArr[i2 + 0] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public static byte[] toBytes(int i) {
        byte[] bArr = new byte[4];
        write(i, bArr, 0);
        return bArr;
    }

    public static byte[] getApkKeyHashBytes(Context context, String str) {
        byte[] encoded = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())).getEncoded();
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(encoded);
        return instance.digest();
    }

    public static byte[] getHeader(Context context, int i) {
        try {
            byte[] apkKeyHashBytes = getApkKeyHashBytes(context, context.getPackageName());
            byte[] bytes = context.getPackageName().getBytes();
            int length = apkKeyHashBytes.length;
            int length2 = bytes.length;
            int i2 = length + 8;
            int i3 = i2 + 4;
            int i4 = i3 + length2;
            byte[] bArr = new byte[(i4 + 4)];
            System.arraycopy(toBytes(1), 0, bArr, 0, 4);
            System.arraycopy(toBytes(length), 0, bArr, 4, 4);
            System.arraycopy(apkKeyHashBytes, 0, bArr, 8, length);
            System.arraycopy(toBytes(length2), 0, bArr, i2, 4);
            System.arraycopy(bytes, 0, bArr, i3, length2);
            System.arraycopy(toBytes(i), 0, bArr, i4, 4);
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }
}
