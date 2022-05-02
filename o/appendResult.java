package o;

final class appendResult {
    appendResult() {
    }

    static void setMin(String str) throws IllegalArgumentException {
        if (str != null) {
            int i = 0;
            if (str.length() == 1) {
                char charAt = str.charAt(0);
                if (!getMax(charAt)) {
                    StringBuffer stringBuffer = new StringBuffer("illegal option value '");
                    stringBuffer.append(charAt);
                    stringBuffer.append("'");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                return;
            }
            char[] charArray = str.toCharArray();
            while (i < charArray.length) {
                if (setMin(charArray[i])) {
                    i++;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer("opt contains illegal character value '");
                    stringBuffer2.append(charArray[i]);
                    stringBuffer2.append("'");
                    throw new IllegalArgumentException(stringBuffer2.toString());
                }
            }
        }
    }

    private static boolean getMax(char c) {
        return setMin(c) || c == ' ' || c == '?' || c == '@';
    }

    private static boolean setMin(char c) {
        return Character.isJavaIdentifierPart(c);
    }
}
