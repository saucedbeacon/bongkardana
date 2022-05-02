package o;

public interface LogUtils {
    public static final Object getMax = ack.NOT_FOUND;

    void delete(int i);

    void delete(String str);

    Object get(int i, LogUtils logUtils);

    Object get(String str, LogUtils logUtils);

    String getClassName();

    Object getDefaultValue(Class<?> cls);

    Object[] getIds();

    LogUtils getParentScope();

    LogUtils getPrototype();

    boolean has(int i, LogUtils logUtils);

    boolean has(String str, LogUtils logUtils);

    boolean hasInstance(LogUtils logUtils);

    void put(int i, LogUtils logUtils, Object obj);

    void put(String str, LogUtils logUtils, Object obj);

    void setParentScope(LogUtils logUtils);

    void setPrototype(LogUtils logUtils);
}
