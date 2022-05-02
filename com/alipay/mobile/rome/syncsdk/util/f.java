package com.alipay.mobile.rome.syncsdk.util;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9462a = f.class.getSimpleName();

    public static <T extends Message> T a(byte[] bArr, Class<T> cls) {
        try {
            return new Wire((Class<?>[]) new Class[0]).parseFrom(Arrays.copyOfRange(bArr, 0, bArr.length), cls);
        } catch (IOException unused) {
            c.d(f9462a, "parsePBObject thrown exception after parse: ".concat(String.valueOf(cls)));
            return null;
        }
    }

    public static int a(byte[] bArr) {
        return (bArr[2] & 255) | ((bArr[1] & 255) << 8);
    }

    public static byte[] a(Message message, int i) {
        byte[] bArr = null;
        if (message == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.write(1);
            dataOutputStream.writeShort(i);
            dataOutputStream.write(message.toByteArray());
            dataOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
            dataOutputStream.close();
            return bArr;
        } catch (IOException unused) {
            c.d(f9462a, "convertPBToByteArray: ".concat(String.valueOf(i)));
            return bArr;
        }
    }

    public static byte[] a(Message message) {
        byte[] bArr;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(message.toByteArray());
            dataOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
            try {
                dataOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            bArr = null;
            c.d(f9462a, "convertLinkPBToByteArray  ");
            return bArr;
        }
        return bArr;
    }

    public static boolean b(byte[] bArr) {
        byte b = bArr[0] & 255;
        String str = f9462a;
        String concat = "syncMsg version is: ".concat(String.valueOf(b));
        if (c.f9459a == null) {
            c.f9459a = LoggerFactory.getTraceLogger();
        }
        c.f9459a.verbose("sync_".concat(String.valueOf(str)), concat);
        if (b == 1) {
            return true;
        }
        return false;
    }
}
