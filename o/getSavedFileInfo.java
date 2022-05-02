package o;

import com.google.common.base.Ascii;

final class getSavedFileInfo {
    static byte[] length(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    static String setMax(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : str.getBytes()) {
            sb.append(new String(new char[]{Character.forDigit((b >> 4) & 15, 16), Character.forDigit(b & Ascii.SI, 16)}));
        }
        return sb.toString();
    }
}
