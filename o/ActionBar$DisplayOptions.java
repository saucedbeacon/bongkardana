package o;

import android.text.SpannableStringBuilder;
import com.google.common.base.Ascii;
import java.util.Locale;
import kotlin.text.Typography;

public final class ActionBar$DisplayOptions {
    static final ActionBar$DisplayOptions getMax = new ActionBar$DisplayOptions(false, 2, length);
    static final setCustomTitle length = getContext.setMax;
    static final ActionBar$DisplayOptions setMax = new ActionBar$DisplayOptions(true, 2, length);
    private static final String setMin = Character.toString(8206);
    private static final String toFloatRange = Character.toString(8207);
    private final boolean IsOverlapping;
    public final setCustomTitle getMin;
    private final int toIntRange;

    public static final class getMin {
        setCustomTitle getMax = ActionBar$DisplayOptions.length;
        boolean length = ActionBar$DisplayOptions.length(Locale.getDefault());
        int setMin = 2;
    }

    public static ActionBar$DisplayOptions getMax() {
        getMin getmin = new getMin();
        if (getmin.setMin != 2 || getmin.getMax != length) {
            return new ActionBar$DisplayOptions(getmin.length, getmin.setMin, getmin.getMax);
        }
        if (getmin.length) {
            return setMax;
        }
        return getMax;
    }

    private ActionBar$DisplayOptions(boolean z, int i, setCustomTitle setcustomtitle) {
        this.IsOverlapping = z;
        this.toIntRange = i;
        this.getMin = setcustomtitle;
    }

    private boolean getMin() {
        return (this.toIntRange & 2) != 0;
    }

    private String length(CharSequence charSequence, setCustomTitle setcustomtitle) {
        boolean min = setcustomtitle.setMin(charSequence, 0, charSequence.length());
        if (!this.IsOverlapping && (min || new setMax(charSequence).length() == 1)) {
            return setMin;
        }
        if (this.IsOverlapping) {
            return (!min || new setMax(charSequence).length() == -1) ? toFloatRange : "";
        }
        return "";
    }

    private String getMax(CharSequence charSequence, setCustomTitle setcustomtitle) {
        boolean min = setcustomtitle.setMin(charSequence, 0, charSequence.length());
        if (!this.IsOverlapping && (min || new setMax(charSequence).setMax() == 1)) {
            return setMin;
        }
        if (this.IsOverlapping) {
            return (!min || new setMax(charSequence).setMax() == -1) ? toFloatRange : "";
        }
        return "";
    }

    public final CharSequence getMin(CharSequence charSequence, setCustomTitle setcustomtitle) {
        if (charSequence == null) {
            return null;
        }
        boolean min = setcustomtitle.setMin(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getMin()) {
            spannableStringBuilder.append(getMax(charSequence, min ? getContext.getMin : getContext.setMin));
        }
        if (min != this.IsOverlapping) {
            spannableStringBuilder.append(min ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        spannableStringBuilder.append(length(charSequence, min ? getContext.getMin : getContext.setMin));
        return spannableStringBuilder;
    }

    static boolean length(Locale locale) {
        return setTitle.setMax(locale) == 1;
    }

    static class setMax {
        private static final byte[] getMin = new byte[1792];
        private char equals;
        private final boolean getMax = false;
        private int length;
        private final int setMax;
        private final CharSequence setMin;

        static {
            for (int i = 0; i < 1792; i++) {
                getMin[i] = Character.getDirectionality(i);
            }
        }

        setMax(CharSequence charSequence) {
            this.setMin = charSequence;
            this.setMax = charSequence.length();
        }

        /* access modifiers changed from: package-private */
        public final int setMax() {
            this.length = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.length < this.setMax && i == 0) {
                byte max = getMax();
                if (max != 0) {
                    if (max == 1 || max == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (max != 9) {
                        switch (max) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.length > 0) {
                switch (getMin()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int length() {
            /*
                r7 = this;
                int r0 = r7.setMax
                r7.length = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.length
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.getMin()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ActionBar$DisplayOptions.setMax.length():int");
        }

        private static byte setMax(char c) {
            return c < 1792 ? getMin[c] : Character.getDirectionality(c);
        }

        private byte getMax() {
            char charAt = this.setMin.charAt(this.length);
            this.equals = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.setMin, this.length);
                this.length += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.length++;
            byte max = setMax(this.equals);
            if (!this.getMax) {
                return max;
            }
            char c = this.equals;
            if (c == '<') {
                return setMin();
            }
            return c == '&' ? toFloatRange() : max;
        }

        private byte getMin() {
            char charAt = this.setMin.charAt(this.length - 1);
            this.equals = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.setMin, this.length);
                this.length -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.length--;
            byte max = setMax(this.equals);
            if (!this.getMax) {
                return max;
            }
            char c = this.equals;
            if (c == '>') {
                return isInside();
            }
            return c == ';' ? equals() : max;
        }

        private byte setMin() {
            char charAt;
            int i = this.length;
            while (true) {
                int i2 = this.length;
                if (i2 < this.setMax) {
                    CharSequence charSequence = this.setMin;
                    this.length = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.equals = charAt2;
                    if (charAt2 == '>') {
                        return Ascii.FF;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c = this.equals;
                        do {
                            int i3 = this.length;
                            if (i3 >= this.setMax) {
                                break;
                            }
                            CharSequence charSequence2 = this.setMin;
                            this.length = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.equals = charAt;
                        } while (charAt != c);
                    }
                } else {
                    this.length = i;
                    this.equals = Typography.less;
                    return 13;
                }
            }
        }

        private byte isInside() {
            char charAt;
            int i = this.length;
            while (true) {
                int i2 = this.length;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.setMin;
                int i3 = i2 - 1;
                this.length = i3;
                char charAt2 = charSequence.charAt(i3);
                this.equals = charAt2;
                if (charAt2 != '<') {
                    if (charAt2 == '>') {
                        break;
                    } else if (charAt2 == '\"' || charAt2 == '\'') {
                        char c = this.equals;
                        do {
                            int i4 = this.length;
                            if (i4 <= 0) {
                                break;
                            }
                            CharSequence charSequence2 = this.setMin;
                            int i5 = i4 - 1;
                            this.length = i5;
                            charAt = charSequence2.charAt(i5);
                            this.equals = charAt;
                        } while (charAt != c);
                    }
                } else {
                    return Ascii.FF;
                }
            }
            this.length = i;
            this.equals = Typography.greater;
            return 13;
        }

        private byte toFloatRange() {
            char charAt;
            do {
                int i = this.length;
                if (i >= this.setMax) {
                    return Ascii.FF;
                }
                CharSequence charSequence = this.setMin;
                this.length = i + 1;
                charAt = charSequence.charAt(i);
                this.equals = charAt;
            } while (charAt != ';');
            return Ascii.FF;
        }

        private byte equals() {
            char charAt;
            int i = this.length;
            do {
                int i2 = this.length;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.setMin;
                int i3 = i2 - 1;
                this.length = i3;
                charAt = charSequence.charAt(i3);
                this.equals = charAt;
                if (charAt == '&') {
                    return Ascii.FF;
                }
            } while (charAt != ';');
            this.length = i;
            this.equals = ';';
            return 13;
        }
    }
}
