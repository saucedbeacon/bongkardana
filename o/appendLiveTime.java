package o;

public final class appendLiveTime {
    static Class FastBitmap$CoordinateSystem;
    public static final Class IsOverlapping;
    static Class Mean$Arithmetic;
    public static final Class equals;
    public static final Class getMax;
    public static final Class getMin;
    static Class hashCode;
    static Class invokeSuspend;
    static Class isInside;
    public static final Class length;
    public static final Class setMax;
    public static final Class setMin;
    static Class toDoubleRange;
    public static final Class toFloatRange;
    public static final Class toIntRange;
    static Class toString;
    static Class valueOf;
    static Class values;

    static {
        Class cls = isInside;
        if (cls == null) {
            cls = length("java.lang.String");
            isInside = cls;
        }
        setMax = cls;
        Class cls2 = FastBitmap$CoordinateSystem;
        if (cls2 == null) {
            cls2 = length("java.lang.Object");
            FastBitmap$CoordinateSystem = cls2;
        }
        length = cls2;
        Class cls3 = hashCode;
        if (cls3 == null) {
            cls3 = length("java.lang.Number");
            hashCode = cls3;
        }
        setMin = cls3;
        Class cls4 = toDoubleRange;
        if (cls4 == null) {
            cls4 = length("java.util.Date");
            toDoubleRange = cls4;
        }
        getMin = cls4;
        Class cls5 = toString;
        if (cls5 == null) {
            cls5 = length("java.lang.Class");
            toString = cls5;
        }
        getMax = cls5;
        Class cls6 = values;
        if (cls6 == null) {
            cls6 = length("java.io.FileInputStream");
            values = cls6;
        }
        toIntRange = cls6;
        Class cls7 = Mean$Arithmetic;
        if (cls7 == null) {
            cls7 = length("java.io.File");
            Mean$Arithmetic = cls7;
        }
        equals = cls7;
        Class cls8 = valueOf;
        if (cls8 == null) {
            cls8 = length("[Ljava.io.File;");
            valueOf = cls8;
        }
        toFloatRange = cls8;
        Class cls9 = invokeSuspend;
        if (cls9 == null) {
            cls9 = length("java.net.URL");
            invokeSuspend = cls9;
        }
        IsOverlapping = cls9;
    }

    private static Class length(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
