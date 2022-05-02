package o;

import com.google.common.base.Strings;

public class dynamicDecryptByteArrayDDp {
    private static final String SPLIT_KEY_SEPARATOR = ":";

    public String buildSplitKeyName(String str, String str2) {
        if (Strings.isNullOrEmpty(str)) {
            return null;
        }
        if (Strings.isNullOrEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(SPLIT_KEY_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    public String getSplitName(String str) {
        if (Strings.isNullOrEmpty(str)) {
            return null;
        }
        return str.split(SPLIT_KEY_SEPARATOR)[0];
    }
}
