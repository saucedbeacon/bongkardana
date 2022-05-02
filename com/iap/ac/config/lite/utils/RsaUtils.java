package com.iap.ac.config.lite.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

public class RsaUtils {
    public static final String RSA_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIaB21XkZFG26yYECzcZ78CW6xs9NcqGm6Vdgqx0uTGQ0YdmUovODF9uo+6H8ML5SphEuU8H4LERhDQcI169OzWnfPe3g3mtxE9Webu2bs/87ajgAUIPk73AeUSswuq58kVaDzmqL3dr/s7+yB/3hDyuIrU0+D/G0MWNIesN6qzVAgMBAAECgYBjlwpbUjuk9RaukxfquF1370YsaOnHBlt/2PjDz7i/Jka9RdmggfNPRZBDMIvnEMVWcKv0BBUthZapLpxRrTKErlAMAUm/LTJhmZmptzTiH0euDI95CYTt9q1UEzYX1M4MTHJ5FEKaSTMwFOFCyB9BGg0v4L4rW+fO7lX89B1NEQJBAPQK2ZtABXHPVPZS28XSZdJEPYpAKgy0qDhROgBylHK5HIsw8WzCXU7tGdmZHDEZrEDrBzM1gI/cxRpD0053SU8CQQCNGQ0H9AUh+JJmws7iVOkvO0wJu78OmCOBDGdFIUhQWdeR0uu1zJRXynp1IrwPVly3rYIqdSE0sxL3Pdc0M5abAkEA2n5sXadwOHlcpD2DLxY0u5EFWCYif8WvZtyyhXwQlLZPa/+h57INQIDfyAZhS0SlCGpkw+B+/k622dEn+vSp2QJAXoMoOmqXQZEap+DX6b2M0Ql8PozXRrRcG+YuCp1nrgLwJgrNvuJBf6jubCYPKIrl4ldD+KKq0n0dOCXhUGM5/wJBAObU6ALewga/6/tNFpbkbfSpsqXhj9GOG4Pbwfp9MAl6U2khdsQwnlvxX/7SaFPvF8uGIr5Z1iEThtbfYp1ceZM=";
    public static final String TRANSFORMATION = "RSA/None/PKCS1Padding";
    private static int getMax = 0;
    private static boolean getMin = true;
    private static char[] length = {298, 297, 283, 258, 269};
    private static int setMax = 213;
    private static boolean setMin = true;
    private static int toFloatRange = 1;

    public static String decrypt(String str, String str2) throws Exception {
        PrivateKey generatePrivate = KeyFactory.getInstance(SuperGwUtils.SIGN_TYPE).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 0)));
        Cipher instance = Cipher.getInstance(TRANSFORMATION);
        instance.init(2, generatePrivate);
        String str3 = new String(instance.doFinal(Base64.decode(str, 0)), length(new byte[]{-123, -124, -125, -126, -127}, TextUtils.indexOf("", "", 0, 0) + 127, (int[]) null, (char[]) null).intern());
        int i = getMax + 5;
        toFloatRange = i % 128;
        int i2 = i % 2;
        return str3;
    }

    private static String length(byte[] bArr, int i, int[] iArr, char[] cArr) {
        try {
            int i2 = getMax + 81;
            toFloatRange = i2 % 128;
            int i3 = i2 % 2;
            char[] cArr2 = length;
            int i4 = setMax;
            int i5 = 0;
            if ((setMin ? '^' : 22) != 22) {
                int i6 = toFloatRange + 45;
                try {
                    getMax = i6 % 128;
                    int i7 = i6 % 2;
                    int length2 = bArr.length;
                    char[] cArr3 = new char[length2];
                    while (i5 < length2) {
                        cArr3[i5] = (char) (cArr2[bArr[(length2 - 1) - i5] + i] - i4);
                        i5++;
                    }
                    return new String(cArr3);
                } catch (Exception e) {
                    throw e;
                }
            } else if (getMin) {
                int i8 = getMax + 97;
                toFloatRange = i8 % 128;
                int i9 = i8 % 2;
                int length3 = cArr.length;
                char[] cArr4 = new char[length3];
                while (i5 < length3) {
                    cArr4[i5] = (char) (cArr2[cArr[(length3 - 1) - i5] - i] - i4);
                    i5++;
                }
                return new String(cArr4);
            } else {
                int length4 = iArr.length;
                char[] cArr5 = new char[length4];
                while (true) {
                    if ((i5 < length4 ? 'Z' : 10) != 10) {
                        int i10 = getMax + 75;
                        toFloatRange = i10 % 128;
                        int i11 = i10 % 2;
                        cArr5[i5] = (char) (cArr2[iArr[(length4 - 1) - i5] - i] - i4);
                        i5++;
                    } else {
                        String str = new String(cArr5);
                        int i12 = getMax + 77;
                        toFloatRange = i12 % 128;
                        int i13 = i12 % 2;
                        return str;
                    }
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
