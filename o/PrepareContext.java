package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;

public final class PrepareContext {
    private static final int LAST_12_CHAR_INDEX = 12;
    private static final int LAST_13_CHAR_INDEX = 13;
    private static final int LAST_3_CHAR_INDEX = 3;
    private static final int RADIX_36 = 36;

    public static String generateStaticCode(String str, boolean z) {
        int i = z ? 12 : 13;
        return (TextUtils.isEmpty(str) || str.length() - i <= 0) ? "" : generateUniqueCode(str.substring(str.length() - i));
    }

    static String generateUniqueCode(@NonNull String str) {
        StringBuilder sb = new StringBuilder();
        int subStringLengthPer9Digit = getSubStringLengthPer9Digit(str);
        int i = 0;
        for (int i2 = 0; i2 < getSubStringLengthPer9Digit(str); i2++) {
            boolean z = true;
            if (i2 != subStringLengthPer9Digit - 1) {
                z = false;
            }
            String subStringPer9Digit = getSubStringPer9Digit(str, i, z);
            i += 9;
            sb.append(Integer.toString(Integer.parseInt(subStringPer9Digit), 36));
        }
        return sb.toString();
    }

    private static int getSubStringLengthPer9Digit(String str) {
        return (str.length() / 9) + (str.length() % 9 == 0 ? 0 : 1);
    }

    private static String getSubStringPer9Digit(String str, int i, boolean z) {
        if (str.length() % 9 == 0) {
            return str.substring(i, i + 9);
        }
        if (z) {
            return str.substring(i);
        }
        return str.substring(i, i + 9);
    }

    public static String generateDynamicCode(String str) {
        if (TextUtils.isEmpty(str) || str.length() - 3 <= 0) {
            return "";
        }
        String l = Long.toString(System.currentTimeMillis());
        String substring = str.substring(str.length() - 3);
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(substring);
        return generateUniqueCode(sb.toString());
    }
}
