package o;

public final class ContextInfo {
    public static <T extends Enum<T>> T getMin(Class<T> cls, String str) {
        for (T t : (Enum[]) cls.getEnumConstants()) {
            if (t.name().compareToIgnoreCase(str) == 0) {
                return t;
            }
        }
        StringBuilder sb = new StringBuilder("No enum constant ");
        sb.append(cls.getCanonicalName());
        sb.append(".");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
