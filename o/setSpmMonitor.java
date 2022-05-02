package o;

import java.util.Arrays;

public final class setSpmMonitor {
    public static final setSpmMonitor equals = new setSpmMonitor("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
    public static final setSpmMonitor getMax = new setSpmMonitor("\u0000\r\n  ");
    public static final setSpmMonitor getMin = new setSpmMonitor("\t \u0000\r\n  ");
    public static final setSpmMonitor isInside = new setSpmMonitor("\u0000 \t");
    public static final setSpmMonitor length = new setSpmMonitor("\n  ");
    public static final setSpmMonitor setMax = new setSpmMonitor(" \u0000\r\n  ");
    public static final setSpmMonitor setMin = new setSpmMonitor("\r\n  ");
    public static final setSpmMonitor toIntRange = new setSpmMonitor("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
    boolean IsOverlapping = false;
    private String hashCode;
    boolean[] toFloatRange;

    private setSpmMonitor(String str) {
        boolean[] zArr = new boolean[128];
        this.toFloatRange = zArr;
        Arrays.fill(zArr, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 128) {
                this.toFloatRange[codePointAt] = true;
            } else {
                sb.appendCodePoint(codePointAt);
            }
        }
        if (sb.length() > 0) {
            this.IsOverlapping = true;
            this.hashCode = sb.toString();
        }
    }

    public final boolean length(int i) {
        if (i < 128) {
            return this.toFloatRange[i];
        }
        return this.IsOverlapping && this.hashCode.indexOf(i, 0) != -1;
    }

    public final boolean getMin(int i) {
        return !length(i);
    }

    public final boolean getMin(int i, String str) {
        return length(i) || str.indexOf(i, 0) != -1;
    }

    public final boolean getMax(int i, String str) {
        return !getMin(i, str);
    }
}
