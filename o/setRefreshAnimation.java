package o;

public final class setRefreshAnimation {
    static final setBounds<Object, Object> setMin = new getMax();

    public static int getMax(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int setMin(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static <T> T getMax(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean getMin(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> setBounds<T, T> getMax() {
        return setMin;
    }

    public static int getMax(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static long setMin(long j, String str) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    static final class getMax implements setBounds<Object, Object> {
        getMax() {
        }

        public final boolean getMin(Object obj, Object obj2) {
            return setRefreshAnimation.getMin(obj, obj2);
        }
    }
}
