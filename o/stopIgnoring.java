package o;

public final class stopIgnoring {
    public static <T> void setMin(T t, Class<T> cls) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }
    }
}
