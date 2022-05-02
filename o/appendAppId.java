package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class appendAppId {
    protected Comparator IsOverlapping = new length((byte) 0);
    public String equals = "--";
    public int getMax = 74;
    public String getMin = "usage: ";
    public String isInside = "-";
    public int length = 1;
    public int setMax = 3;
    public String setMin = System.getProperty("line.separator");
    public String toIntRange = "arg";

    public final StringBuffer setMax(StringBuffer stringBuffer, int i, appendUpMsgLens appendupmsglens, int i2, int i3) {
        String max = getMax(i2);
        String max2 = getMax(i3);
        ArrayList arrayList = new ArrayList();
        List<appendCode> helpOptions = appendupmsglens.helpOptions();
        Collections.sort(helpOptions, this.IsOverlapping);
        int i4 = 0;
        int i5 = 0;
        for (appendCode appendcode : helpOptions) {
            StringBuffer stringBuffer2 = new StringBuffer(8);
            if (appendcode.getOpt() == null) {
                stringBuffer2.append(max);
                StringBuffer stringBuffer3 = new StringBuffer("   ");
                stringBuffer3.append(this.equals);
                stringBuffer2.append(stringBuffer3.toString());
                stringBuffer2.append(appendcode.getLongOpt());
            } else {
                stringBuffer2.append(max);
                stringBuffer2.append(this.isInside);
                stringBuffer2.append(appendcode.getOpt());
                if (appendcode.hasLongOpt()) {
                    stringBuffer2.append(',');
                    stringBuffer2.append(this.equals);
                    stringBuffer2.append(appendcode.getLongOpt());
                }
            }
            if (appendcode.hasArg()) {
                if (appendcode.hasArgName()) {
                    stringBuffer2.append(" <");
                    stringBuffer2.append(appendcode.getArgName());
                    stringBuffer2.append(SimpleComparison.GREATER_THAN_OPERATION);
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > i5) {
                i5 = stringBuffer2.length();
            }
        }
        Iterator it = helpOptions.iterator();
        while (it.hasNext()) {
            appendCode appendcode2 = (appendCode) it.next();
            int i6 = i4 + 1;
            StringBuffer stringBuffer4 = new StringBuffer(arrayList.get(i4).toString());
            if (stringBuffer4.length() < i5) {
                stringBuffer4.append(getMax(i5 - stringBuffer4.length()));
            }
            stringBuffer4.append(max2);
            int i7 = i5 + i3;
            if (appendcode2.getDescription() != null) {
                stringBuffer4.append(appendcode2.getDescription());
            }
            getMin(stringBuffer, i, i7, stringBuffer4.toString());
            if (it.hasNext()) {
                stringBuffer.append(this.setMin);
            }
            i4 = i6;
        }
        return stringBuffer;
    }

    private StringBuffer getMin(StringBuffer stringBuffer, int i, int i2, String str) {
        int length2 = length(str, i);
        if (length2 == -1) {
            stringBuffer.append(length(str));
            return stringBuffer;
        }
        stringBuffer.append(length(str.substring(0, length2)));
        stringBuffer.append(this.setMin);
        if (i2 >= i) {
            i2 = 1;
        }
        String max = getMax(i2);
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(max);
            stringBuffer2.append(str.substring(length2).trim());
            str = stringBuffer2.toString();
            length2 = length(str, i);
            if (length2 == -1) {
                stringBuffer.append(str);
                return stringBuffer;
            }
            if (str.length() > i && length2 == i2 - 1) {
                length2 = i;
            }
            stringBuffer.append(length(str.substring(0, length2)));
            stringBuffer.append(this.setMin);
        }
    }

    private static int length(String str, int i) {
        int indexOf = str.indexOf(10, 0);
        if ((indexOf != -1 && indexOf <= i) || ((indexOf = str.indexOf(9, 0)) != -1 && indexOf <= i)) {
            return indexOf + 1;
        }
        int i2 = i + 0;
        if (i2 >= str.length()) {
            return -1;
        }
        int i3 = i2;
        while (i3 >= 0 && (r5 = str.charAt(i3)) != ' ' && r5 != 10 && r5 != 13) {
            i3--;
        }
        if (i3 > 0) {
            return i3;
        }
        while (i2 <= str.length() && (r0 = str.charAt(i2)) != ' ' && r0 != 10 && r0 != 13) {
            i2++;
        }
        if (i2 == str.length()) {
            return -1;
        }
        return i2;
    }

    private static String getMax(int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    private static String length(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length2 = str.length();
        while (length2 > 0 && Character.isWhitespace(str.charAt(length2 - 1))) {
            length2--;
        }
        return str.substring(0, length2);
    }

    static class length implements Comparator {
        private length() {
        }

        length(byte b) {
            this();
        }

        public final int compare(Object obj, Object obj2) {
            return ((appendCode) obj).getKey().compareToIgnoreCase(((appendCode) obj2).getKey());
        }
    }
}
