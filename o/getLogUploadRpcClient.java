package o;

public abstract class getLogUploadRpcClient implements adjustUploadCoreByCategoryDirectly {
    private static final ThreadLocal<char[]> getMin = new ThreadLocal<char[]>() {
        private static char[] setMax() {
            return new char[1024];
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return setMax();
        }
    };
    static final /* synthetic */ boolean setMax = (!getLogUploadRpcClient.class.desiredAssertionStatus());

    /* access modifiers changed from: protected */
    public abstract char[] setMin(int i);

    /* access modifiers changed from: protected */
    public int setMax(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int min = setMin(charSequence, i, i2);
            if (min < 0 || setMin(min) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(min) ? 2 : 1;
        }
        return i;
    }

    public String setMax(String str) {
        int length = str.length();
        int max = setMax(str, 0, length);
        if (max == length) {
            return str;
        }
        return getMax(str, max);
    }

    /* access modifiers changed from: protected */
    public final String getMax(String str, int i) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-671423167, oncanceled);
            onCancelLoad.getMin(-671423167, oncanceled);
        }
        int length2 = str.length();
        char[] cArr = getMin.get();
        int i2 = 0;
        int i3 = 0;
        while (i < length2) {
            int min = setMin(str, i, length2);
            if (min >= 0) {
                char[] min2 = setMin(min);
                if (min2 != null) {
                    int i4 = i - i2;
                    int i5 = i3 + i4;
                    int length3 = min2.length + i5;
                    if (cArr.length < length3) {
                        cArr = getMin(cArr, i3, length3 + (length2 - i) + 32);
                    }
                    if (i4 > 0) {
                        str.getChars(i2, i, cArr, i3);
                        i3 = i5;
                    }
                    if (min2.length > 0) {
                        System.arraycopy(min2, 0, cArr, i3, min2.length);
                        i3 += min2.length;
                    }
                }
                i2 = (Character.isSupplementaryCodePoint(min) ? 2 : 1) + i;
                i = setMax(str, i2, length2);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i6 = length2 - i2;
        if (i6 > 0) {
            int i7 = i6 + i3;
            if (cArr.length < i7) {
                cArr = getMin(cArr, i3, i7);
            }
            str.getChars(i2, length2, cArr, i3);
            i3 = i7;
        }
        return new String(cArr, 0, i3);
    }

    private static int setMin(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                StringBuilder sb = new StringBuilder("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append(charAt);
                sb.append(" at index ");
                sb.append(i3 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                StringBuilder sb2 = new StringBuilder("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append("' with value ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    private static final char[] getMin(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
