package com.alipay.alipaysecuritysdk.common.a;

import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class a {
    public static String a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 58; i += 4) {
            sb.append("idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#".charAt(i));
        }
        return sb.toString();
    }

    public static String a(String str, String str2) {
        if (!e.c(str) && !e.c(str2)) {
            try {
                PBEKeySpec a2 = a(str);
                byte[] bytes = str2.getBytes();
                byte[] b = b();
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(a2).getEncoded(), "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, secretKeySpec, new IvParameterSpec(b));
                byte[] salt = a2.getSalt();
                ByteBuffer allocate = ByteBuffer.allocate(salt.length + instance.getOutputSize(bytes.length));
                allocate.put(salt);
                instance.doFinal(ByteBuffer.wrap(bytes), allocate);
                return a(allocate.array());
            } catch (Exception e) {
                b.a("SEC_SDK-tool", "Encrypt by new method ", e);
            }
        }
        return null;
    }

    public static String b(String str, String str2) {
        byte[] bArr;
        if (!e.c(str) && !e.c(str2)) {
            try {
                PBEKeySpec a2 = a(str);
                int length = str2.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr2[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
                }
                byte[] b = b();
                if (length <= 16) {
                    bArr = null;
                } else {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(a2.getPassword(), Arrays.copyOf(bArr2, 16), 10, 128)).getEncoded(), "AES");
                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance.init(2, secretKeySpec, new IvParameterSpec(b));
                    bArr = instance.doFinal(bArr2, 16, length - 16);
                }
                if (bArr == null) {
                    b.b("SEC_SDK-tool", "decrypt data failed, return data is null");
                    return null;
                }
                String str3 = new String(bArr);
                if (e.b(str3)) {
                    return str3;
                }
            } catch (Exception e) {
                b.a("SEC_SDK-tool", "Decrypt by new method ", e);
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static javax.crypto.spec.PBEKeySpec a(java.lang.String r7) {
        /*
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20="
            byte[] r1 = com.alipay.alipaysecuritysdk.common.b.a.a(r1)
            r0.<init>(r1)
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.Object r1 = r0.newInstance()
            r2 = 16
            byte[] r2 = new byte[r2]
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class r5 = r2.getClass()
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextBytes"
            java.lang.reflect.Method r0 = r0.getMethod(r5, r4)
            r0.setAccessible(r3)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r2
            r0.invoke(r1, r3)
            javax.crypto.spec.PBEKeySpec r0 = new javax.crypto.spec.PBEKeySpec
            char[] r7 = r7.toCharArray()
            r1 = 10
            r3 = 128(0x80, float:1.794E-43)
            r0.<init>(r7, r2, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.a.a.a(java.lang.String):javax.crypto.spec.PBEKeySpec");
    }

    private static byte[] b() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 48; i += 2) {
                sb.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i));
            }
            return com.alipay.alipaysecuritysdk.common.b.a.a(sb.toString());
        } catch (Exception e) {
            b.a("SEC_SDK-tool", (Throwable) e);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b & Ascii.SI));
        }
        return stringBuffer.toString();
    }
}
