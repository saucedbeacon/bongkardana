package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@GwtCompatible
@Beta
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    /* access modifiers changed from: protected */
    public abstract char[] escape(int i);

    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        int nextEscapeIndex = nextEscapeIndex(str, 0, length);
        if (nextEscapeIndex == length) {
            return str;
        }
        return escapeSlow(str, nextEscapeIndex);
    }

    /* access modifiers changed from: protected */
    public int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int codePointAt = codePointAt(charSequence, i, i2);
            if (codePointAt < 0 || escape(codePointAt) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final String escapeSlow(String str, int i) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1107220883, oncanceled);
            onCancelLoad.getMin(-1107220883, oncanceled);
        }
        int length2 = str.length();
        char[] charBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int i2 = 0;
        int i3 = 0;
        while (i < length2) {
            int codePointAt = codePointAt(str, i, length2);
            if (codePointAt >= 0) {
                char[] escape = escape(codePointAt);
                int i4 = (Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1) + i;
                if (escape != null) {
                    int i5 = i - i2;
                    int i6 = i3 + i5;
                    int length3 = escape.length + i6;
                    if (charBufferFromThreadLocal.length < length3) {
                        charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i3, length3 + (length2 - i) + 32);
                    }
                    if (i5 > 0) {
                        str.getChars(i2, i, charBufferFromThreadLocal, i3);
                        i3 = i6;
                    }
                    if (escape.length > 0) {
                        System.arraycopy(escape, 0, charBufferFromThreadLocal, i3, escape.length);
                        i3 += escape.length;
                    }
                    i2 = i4;
                }
                i = nextEscapeIndex(str, i4, length2);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i7 = length2 - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (charBufferFromThreadLocal.length < i8) {
                charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i3, i8);
            }
            str.getChars(i2, length2, charBufferFromThreadLocal, i3);
            i3 = i8;
        }
        return new String(charBufferFromThreadLocal, 0, i3);
    }

    protected static int codePointAt(CharSequence charSequence, int i, int i2) {
        Preconditions.checkNotNull(charSequence);
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
                sb.append(" in '");
                sb.append(charSequence);
                sb.append("'");
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
                sb2.append(" in '");
                sb2.append(charSequence);
                sb2.append("'");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    private static char[] growBuffer(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }
}
