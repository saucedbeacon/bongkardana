package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.CharCompanionObject;
import ru.noties.markwon.html.impl.jsoup.UncheckedIOException;

public final class LogFileLogAppender implements Iterable<handleExtrasOnGetNewFile>, Cloneable {
    private static final String[] getMax = new String[0];
    public String[] getMin;
    public String[] length;
    public int setMin = 0;

    static String length(String str) {
        return str == null ? "" : str;
    }

    public LogFileLogAppender() {
        String[] strArr = getMax;
        this.length = strArr;
        this.getMin = strArr;
    }

    /* renamed from: o.LogFileLogAppender$2  reason: invalid class name */
    public final class AnonymousClass2 {
        private int IsOverlapping;
        private int equals;
        public final String[] getMax;
        public final char[] getMin;
        int length;
        public int setMax;
        int setMin;
        private final Reader toIntRange;

        private AnonymousClass2(Reader reader) {
            this.getMax = new String[128];
            if (reader.markSupported()) {
                this.toIntRange = reader;
                this.getMin = new char[4096];
                toDoubleRange();
                return;
            }
            throw new IllegalArgumentException("Must be true");
        }

        public AnonymousClass2(String str) {
            this((Reader) new StringReader(str));
        }

        private void toDoubleRange() {
            int i = this.setMax;
            if (i >= this.equals) {
                try {
                    this.toIntRange.skip((long) i);
                    this.toIntRange.mark(4096);
                    int read = this.toIntRange.read(this.getMin);
                    this.toIntRange.reset();
                    if (read != -1) {
                        this.IsOverlapping = read;
                        this.length += this.setMax;
                        this.setMax = 0;
                        this.setMin = 0;
                        if (read > 3072) {
                            read = 3072;
                        }
                        this.equals = read;
                    }
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
        }

        public final boolean setMax() {
            toDoubleRange();
            return this.setMax >= this.IsOverlapping;
        }

        private boolean valueOf() {
            return this.setMax >= this.IsOverlapping;
        }

        public final char getMax() {
            toDoubleRange();
            return valueOf() ? CharCompanionObject.MAX_VALUE : this.getMin[this.setMax];
        }

        public final char setMin() {
            toDoubleRange();
            char c = valueOf() ? CharCompanionObject.MAX_VALUE : this.getMin[this.setMax];
            this.setMax++;
            return c;
        }

        private int setMax(char c) {
            toDoubleRange();
            for (int i = this.setMax; i < this.IsOverlapping; i++) {
                if (c == this.getMin[i]) {
                    return i - this.setMax;
                }
            }
            return -1;
        }

        public final int setMax(CharSequence charSequence) {
            toDoubleRange();
            char charAt = charSequence.charAt(0);
            int i = this.setMax;
            while (i < this.IsOverlapping) {
                int i2 = 1;
                if (charAt != this.getMin[i]) {
                    do {
                        i++;
                        if (i >= this.IsOverlapping) {
                            break;
                        }
                    } while (charAt == this.getMin[i]);
                }
                int i3 = i + 1;
                int length2 = (charSequence.length() + i3) - 1;
                int i4 = this.IsOverlapping;
                if (i < i4 && length2 <= i4) {
                    int i5 = i3;
                    while (i5 < length2 && charSequence.charAt(i2) == this.getMin[i5]) {
                        i5++;
                        i2++;
                    }
                    if (i5 == length2) {
                        return i - this.setMax;
                    }
                }
                i = i3;
            }
            return -1;
        }

        public final String length(char c) {
            int max = setMax(c);
            if (max == -1) {
                return toFloatRange();
            }
            String max2 = setMax(this.getMin, this.getMax, this.setMax, max);
            this.setMax += max;
            return max2;
        }

        public final String getMin(char... cArr) {
            toDoubleRange();
            int i = this.setMax;
            int i2 = this.IsOverlapping;
            char[] cArr2 = this.getMin;
            loop0:
            while (this.setMax < i2) {
                for (char c : cArr) {
                    if (cArr2[this.setMax] == c) {
                        break loop0;
                    }
                }
                this.setMax++;
            }
            int i3 = this.setMax;
            return i3 > i ? setMax(this.getMin, this.getMax, i, i3 - i) : "";
        }

        public final String length(char... cArr) {
            toDoubleRange();
            int i = this.setMax;
            int i2 = this.IsOverlapping;
            char[] cArr2 = this.getMin;
            while (true) {
                int i3 = this.setMax;
                if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                    int i4 = this.setMax;
                } else {
                    this.setMax++;
                }
            }
            int i42 = this.setMax;
            return i42 > i ? setMax(this.getMin, this.getMax, i, i42 - i) : "";
        }

        public final String length() {
            char c;
            toDoubleRange();
            int i = this.setMax;
            int i2 = this.IsOverlapping;
            char[] cArr = this.getMin;
            while (true) {
                int i3 = this.setMax;
                if (i3 >= i2 || (c = cArr[i3]) == '&' || c == '<' || c == 0) {
                    int i4 = this.setMax;
                } else {
                    this.setMax = i3 + 1;
                }
            }
            int i42 = this.setMax;
            return i42 > i ? setMax(this.getMin, this.getMax, i, i42 - i) : "";
        }

        public final String getMin() {
            char c;
            toDoubleRange();
            int i = this.setMax;
            int i2 = this.IsOverlapping;
            char[] cArr = this.getMin;
            while (true) {
                int i3 = this.setMax;
                if (i3 >= i2 || (c = cArr[i3]) == 9 || c == 10 || c == 13 || c == 12 || c == ' ' || c == '/' || c == '>' || c == 0) {
                    int i4 = this.setMax;
                } else {
                    this.setMax = i3 + 1;
                }
            }
            int i42 = this.setMax;
            return i42 > i ? setMax(this.getMin, this.getMax, i, i42 - i) : "";
        }

        public final String toFloatRange() {
            toDoubleRange();
            char[] cArr = this.getMin;
            String[] strArr = this.getMax;
            int i = this.setMax;
            String max = setMax(cArr, strArr, i, this.IsOverlapping - i);
            this.setMax = this.IsOverlapping;
            return max;
        }

        public final String toIntRange() {
            char c;
            toDoubleRange();
            int i = this.setMax;
            while (true) {
                int i2 = this.setMax;
                if (i2 < this.IsOverlapping && (((c = this.getMin[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                    this.setMax++;
                }
            }
            return setMax(this.getMin, this.getMax, i, this.setMax - i);
        }

        /* access modifiers changed from: package-private */
        public final String IsOverlapping() {
            char c;
            toDoubleRange();
            int i = this.setMax;
            while (true) {
                int i2 = this.setMax;
                if (i2 < this.IsOverlapping && (((c = this.getMin[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                    this.setMax++;
                }
            }
            while (!valueOf() && (r1 = this.getMin[r2]) >= '0' && r1 <= '9') {
                this.setMax = (r2 = this.setMax) + 1;
            }
            return setMax(this.getMin, this.getMax, i, this.setMax - i);
        }

        /* access modifiers changed from: package-private */
        public final String isInside() {
            char c;
            toDoubleRange();
            int i = this.setMax;
            while (true) {
                int i2 = this.setMax;
                if (i2 < this.IsOverlapping && (((c = this.getMin[i2]) >= '0' && c <= '9') || ((c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')))) {
                    this.setMax++;
                }
            }
            return setMax(this.getMin, this.getMax, i, this.setMax - i);
        }

        /* access modifiers changed from: package-private */
        public final String equals() {
            char c;
            toDoubleRange();
            int i = this.setMax;
            while (true) {
                int i2 = this.setMax;
                if (i2 < this.IsOverlapping && (c = this.getMin[i2]) >= '0' && c <= '9') {
                    this.setMax = i2 + 1;
                }
            }
            return setMax(this.getMin, this.getMax, i, this.setMax - i);
        }

        public final boolean getMin(char c) {
            return !setMax() && this.getMin[this.setMax] == c;
        }

        private boolean getMin(String str) {
            toDoubleRange();
            int length2 = str.length();
            if (length2 > this.IsOverlapping - this.setMax) {
                return false;
            }
            for (int i = 0; i < length2; i++) {
                if (str.charAt(i) != this.getMin[this.setMax + i]) {
                    return false;
                }
            }
            return true;
        }

        private boolean setMax(String str) {
            toDoubleRange();
            int length2 = str.length();
            if (length2 > this.IsOverlapping - this.setMax) {
                return false;
            }
            for (int i = 0; i < length2; i++) {
                if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.getMin[this.setMax + i])) {
                    return false;
                }
            }
            return true;
        }

        public final boolean getMax(char... cArr) {
            if (setMax()) {
                return false;
            }
            toDoubleRange();
            char c = this.getMin[this.setMax];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean setMax(char[] cArr) {
            toDoubleRange();
            return !setMax() && Arrays.binarySearch(cArr, this.getMin[this.setMax]) >= 0;
        }

        public final boolean FastBitmap$CoordinateSystem() {
            if (setMax()) {
                return false;
            }
            char c = this.getMin[this.setMax];
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
            if ((c < 'a' || c > 'z') && !Character.isLetter(c)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean values() {
            char c;
            if (!setMax() && (c = this.getMin[this.setMax]) >= '0' && c <= '9') {
                return true;
            }
            return false;
        }

        public final boolean getMax(String str) {
            toDoubleRange();
            if (!getMin(str)) {
                return false;
            }
            this.setMax += str.length();
            return true;
        }

        public final boolean setMin(String str) {
            if (!setMax(str)) {
                return false;
            }
            this.setMax += str.length();
            return true;
        }

        public final boolean length(String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(210031883, oncanceled);
                onCancelLoad.getMin(210031883, oncanceled);
            }
            return setMax((CharSequence) str.toLowerCase(Locale.ENGLISH)) >= 0 || setMax((CharSequence) str.toUpperCase(Locale.ENGLISH)) >= 0;
        }

        public final String toString() {
            char[] cArr = this.getMin;
            int i = this.setMax;
            return new String(cArr, i, this.IsOverlapping - i);
        }

        public static String setMax(char[] cArr, String[] strArr, int i, int i2) {
            if (i2 > 12) {
                return new String(cArr, i, i2);
            }
            if (i2 <= 0) {
                return "";
            }
            int i3 = 0;
            int i4 = i;
            int i5 = 0;
            while (i3 < i2) {
                i5 = (i5 * 31) + cArr[i4];
                i3++;
                i4++;
            }
            int length2 = (strArr.length - 1) & i5;
            String str = strArr[length2];
            if (str == null) {
                String str2 = new String(cArr, i, i2);
                strArr[length2] = str2;
                return str2;
            } else if (length(cArr, i, i2, str)) {
                return str;
            } else {
                String str3 = new String(cArr, i, i2);
                strArr[length2] = str3;
                return str3;
            }
        }

        private static boolean length(char[] cArr, int i, int i2, String str) {
            if (i2 != str.length()) {
                return false;
            }
            int i3 = 0;
            while (true) {
                int i4 = i2 - 1;
                if (i2 == 0) {
                    return true;
                }
                int i5 = i + 1;
                int i6 = i3 + 1;
                if (cArr[i] != str.charAt(i3)) {
                    return false;
                }
                i = i5;
                i2 = i4;
                i3 = i6;
            }
        }
    }

    public static String[] getMax(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    public final int setMin(String str) {
        if (str != null) {
            for (int i = 0; i < this.setMin; i++) {
                if (str.equals(this.length[i])) {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final Iterator<handleExtrasOnGetNewFile> iterator() {
        return new Iterator<handleExtrasOnGetNewFile>() {
            int getMax = 0;

            public final boolean hasNext() {
                return this.getMax < LogFileLogAppender.this.setMin;
            }

            public final void remove() {
                LogFileLogAppender logFileLogAppender = LogFileLogAppender.this;
                int i = this.getMax - 1;
                this.getMax = i;
                LogFileLogAppender.setMax(logFileLogAppender, i);
            }

            public final /* synthetic */ Object next() {
                String str = LogFileLogAppender.this.getMin[this.getMax];
                String str2 = LogFileLogAppender.this.length[this.getMax];
                if (str == null) {
                    str = "";
                }
                handleExtrasOnGetNewFile handleextrasongetnewfile = new handleExtrasOnGetNewFile(str2, str, LogFileLogAppender.this);
                this.getMax++;
                return handleextrasongetnewfile;
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogFileLogAppender logFileLogAppender = (LogFileLogAppender) obj;
        if (this.setMin == logFileLogAppender.setMin && Arrays.equals(this.length, logFileLogAppender.length)) {
            return Arrays.equals(this.getMin, logFileLogAppender.getMin);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.setMin * 31) + Arrays.hashCode(this.length)) * 31) + Arrays.hashCode(this.getMin);
    }

    /* access modifiers changed from: private */
    /* renamed from: setMax */
    public LogFileLogAppender clone() {
        try {
            LogFileLogAppender logFileLogAppender = (LogFileLogAppender) super.clone();
            logFileLogAppender.setMin = this.setMin;
            String[] strArr = this.length;
            int i = this.setMin;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.length = strArr2;
            String[] strArr3 = this.getMin;
            int i2 = this.setMin;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.getMin = strArr4;
            return logFileLogAppender;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    static /* synthetic */ void setMax(LogFileLogAppender logFileLogAppender, int i) {
        if (!(i >= logFileLogAppender.setMin)) {
            int i2 = (logFileLogAppender.setMin - i) - 1;
            if (i2 > 0) {
                String[] strArr = logFileLogAppender.length;
                int i3 = i + 1;
                System.arraycopy(strArr, i3, strArr, i, i2);
                String[] strArr2 = logFileLogAppender.getMin;
                System.arraycopy(strArr2, i3, strArr2, i, i2);
            }
            int i4 = logFileLogAppender.setMin - 1;
            logFileLogAppender.setMin = i4;
            logFileLogAppender.length[i4] = null;
            logFileLogAppender.getMin[i4] = null;
            return;
        }
        throw new IllegalArgumentException("Must be false");
    }
}
