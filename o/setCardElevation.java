package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class setCardElevation {
    public final String[] setMin;

    public /* synthetic */ setCardElevation(setMax setmax, byte b) {
        this(setmax);
    }

    private setCardElevation(setMax setmax) {
        this.setMin = (String[]) setmax.getMax.toArray(new String[setmax.getMax.size()]);
    }

    public final String setMax(String str) {
        return setMax(this.setMin, str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof setCardElevation) && Arrays.equals(((setCardElevation) obj).setMin, this.setMin);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.setMin);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.setMin.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            sb.append(this.setMin[i2]);
            sb.append(": ");
            sb.append(this.setMin[i2 + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String setMax(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static final class setMax {
        public final List<String> getMax = new ArrayList(20);

        public final setMax setMax(String str, String str2) {
            setMin(str, str2);
            this.getMax.add(str);
            this.getMax.add(str2.trim());
            return this;
        }

        public final setMax getMin(String str) {
            int i = 0;
            while (i < this.getMax.size()) {
                if (str.equalsIgnoreCase(this.getMax.get(i))) {
                    this.getMax.remove(i);
                    this.getMax.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final setMax length(String str, String str2) {
            setMin(str, str2);
            getMin(str);
            this.getMax.add(str);
            this.getMax.add(str2.trim());
            return this;
        }

        public static void setMin(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(CustomTabsIntent$ShareState.getMin("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(CustomTabsIntent$ShareState.getMin("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                        }
                    }
                    return;
                }
                throw new NullPointerException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }
    }
}
