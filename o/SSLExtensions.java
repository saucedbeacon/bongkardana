package o;

public final class SSLExtensions {
    public static int setMax = 4;

    public static int setMin(int i) {
        return 4 - (i % 4);
    }

    public static int getMax(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == 10 || charAt == 13) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean getMin(CharSequence charSequence, int i) {
        return Character.isLetter(Character.codePointAt(charSequence, i));
    }

    public static boolean setMin(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
        return charAt == 9 || charAt == ' ';
    }

    public static CharSequence setMax(CharSequence charSequence) {
        StringBuilder sb = null;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charSequence.charAt(i) == 0) {
                if (sb == null) {
                    sb = new StringBuilder(charSequence.length());
                    sb.append(charSequence, 0, i);
                }
                sb.append(65533);
            } else if (sb != null) {
                sb.append(charAt);
            }
        }
        return sb != null ? sb.toString() : charSequence;
    }

    public static boolean length(CharSequence charSequence) {
        int i = 0;
        while (true) {
            if (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                if (charAt != ' ') {
                    switch (charAt) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                    }
                }
                i++;
            } else {
                i = -1;
            }
        }
        if (i == -1) {
            return true;
        }
        return false;
    }
}
