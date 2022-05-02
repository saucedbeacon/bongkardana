package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.annotation.Nullable;

public final class Draft_75 {
    public final String[] length;

    public Draft_75(length length2) {
        this.length = (String[]) length2.setMin.toArray(new String[length2.setMin.size()]);
    }

    private Draft_75(String[] strArr) {
        this.length = strArr;
    }

    @Nullable
    public final String length(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(638711914, oncanceled);
            onCancelLoad.getMin(638711914, oncanceled);
        }
        return length(this.length, str);
    }

    public final Set<String> getMin() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length2 = this.length.length / 2;
        for (int i = 0; i < length2; i++) {
            treeSet.add(this.length[i * 2]);
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof Draft_75) && Arrays.equals(((Draft_75) obj).length, this.length);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length2 = this.length.length / 2;
        for (int i = 0; i < length2; i++) {
            int i2 = i * 2;
            sb.append(this.length[i2]);
            sb.append(": ");
            sb.append(this.length[i2 + 1]);
            sb.append("\n");
        }
        return sb.toString();
    }

    private static String length(String[] strArr, String str) {
        for (int length2 = strArr.length - 2; length2 >= 0; length2 -= 2) {
            if (str.equalsIgnoreCase(strArr[length2])) {
                return strArr[length2 + 1];
            }
        }
        return null;
    }

    public static Draft_75 setMax(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        int i = 0;
        while (i < strArr2.length) {
            if (strArr2[i] != null) {
                strArr2[i] = strArr2[i].trim();
                i++;
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            setMin(str);
            setMax(str2, str);
        }
        return new Draft_75(strArr2);
    }

    public static void setMin(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length2 = str.length();
            for (int i = 0; i < length2; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(initCloseCode.length("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public static void setMax(String str, String str2) {
        if (str != null) {
            int length2 = str.length();
            int i = 0;
            while (i < length2) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(initCloseCode.length("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }

    public static final class length {
        public final List<String> setMin = new ArrayList(20);

        /* access modifiers changed from: package-private */
        public final length length(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                this.setMin.add(substring);
                this.setMin.add(substring2.trim());
                return this;
            } else if (str.startsWith(":")) {
                String substring3 = str.substring(1);
                this.setMin.add("");
                this.setMin.add(substring3.trim());
                return this;
            } else {
                this.setMin.add("");
                this.setMin.add(str.trim());
                return this;
            }
        }

        public final length getMax(String str, String str2) {
            Draft_75.setMin(str);
            Draft_75.setMax(str2, str);
            this.setMin.add(str);
            this.setMin.add(str2.trim());
            return this;
        }

        public final length length(String str, String str2) {
            Draft_75.setMin(str);
            this.setMin.add(str);
            this.setMin.add(str2.trim());
            return this;
        }

        public final length getMax(String str) {
            int i = 0;
            while (i < this.setMin.size()) {
                if (str.equalsIgnoreCase(this.setMin.get(i))) {
                    this.setMin.remove(i);
                    this.setMin.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final length setMin(String str, String str2) {
            Draft_75.setMin(str);
            Draft_75.setMax(str2, str);
            getMax(str);
            this.setMin.add(str);
            this.setMin.add(str2.trim());
            return this;
        }

        public final String setMin(String str) {
            for (int size = this.setMin.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.setMin.get(size))) {
                    return this.setMin.get(size + 1);
                }
            }
            return null;
        }
    }

    public final List<String> getMin(String str) {
        int length2 = this.length.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length2; i++) {
            int i2 = i * 2;
            if (str.equalsIgnoreCase(this.length[i2])) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(this.length[i2 + 1]);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }
}
