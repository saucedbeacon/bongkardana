package o;

import com.j256.ormlite.stmt.query.SimpleComparison;

public class MoneyKeyListener {
    protected MoneyKeyListener() {
    }

    public static void getMin(String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }

    public static void length(String str, Object obj, Object obj2) {
        if (!length(obj, obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                String min = setMin(str, obj, obj2);
                if (min == null) {
                    throw new AssertionError();
                }
                throw new AssertionError(min);
            }
            if (str == null) {
                str = "";
            }
            throw new isBindKeyboard(str, (String) obj, (String) obj2);
        }
    }

    private static boolean length(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return getMax(obj, obj2);
    }

    private static boolean getMax(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static void getMax(String str, Object obj, Object obj2) {
        String str2;
        if (length(obj, obj2)) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(". ");
                str2 = sb.toString();
            } else {
                str2 = "Values should be different. ";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("Actual: ");
            sb2.append(obj2);
            String obj3 = sb2.toString();
            if (obj3 == null) {
                throw new AssertionError();
            }
            throw new AssertionError(obj3);
        }
    }

    static String setMin(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            str2 = sb.toString();
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("expected: ");
            sb2.append(length(obj, valueOf));
            sb2.append(" but was: ");
            sb2.append(length(obj2, valueOf2));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("expected:<");
        sb3.append(valueOf);
        sb3.append("> but was:<");
        sb3.append(valueOf2);
        sb3.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb3.toString();
    }

    private static String length(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(SimpleComparison.LESS_THAN_OPERATION);
        sb.append(str);
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }

    public static void setMax(String str, Object obj) {
        if (obj != null) {
            return;
        }
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }

    public static void setMin(String str, Object obj) {
        String str2;
        if (obj != null) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                str2 = sb.toString();
            } else {
                str2 = "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("expected null, but was:<");
            sb2.append(obj);
            sb2.append(SimpleComparison.GREATER_THAN_OPERATION);
            String obj2 = sb2.toString();
            if (obj2 == null) {
                throw new AssertionError();
            }
            throw new AssertionError(obj2);
        }
    }

    public static void getMin(String str, Object obj, Object obj2) {
        String str2;
        if (obj != obj2) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                str2 = sb.toString();
            } else {
                str2 = "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("expected same:<");
            sb2.append(obj);
            sb2.append("> was not:<");
            sb2.append(obj2);
            sb2.append(SimpleComparison.GREATER_THAN_OPERATION);
            String obj3 = sb2.toString();
            if (obj3 == null) {
                throw new AssertionError();
            }
            throw new AssertionError(obj3);
        }
    }

    public static void setMax(String str, Object obj, Object obj2) {
        String str2;
        if (obj == obj2) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                str2 = sb.toString();
            } else {
                str2 = "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("expected not same");
            String obj3 = sb2.toString();
            if (obj3 == null) {
                throw new AssertionError();
            }
            throw new AssertionError(obj3);
        }
    }
}
