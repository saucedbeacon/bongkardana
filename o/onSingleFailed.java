package o;

public interface onSingleFailed {
    void clearAllData();

    void clearData(String str);

    Boolean getBoolean(String str);

    Boolean getBoolean(String str, boolean z);

    Float getFloat(String str);

    Integer getInteger(String str);

    Long getLong(String str);

    <T> T getObject(String str, Class<T> cls);

    String getString(String str);

    void saveData(String str, Boolean bool);

    void saveData(String str, Float f);

    void saveData(String str, Integer num);

    void saveData(String str, Long l);

    <T> void saveData(String str, T t);

    void saveData(String str, String str2);
}
