package o;

public interface tick {
    void delete(record record);

    Object get(record record, LogUtils logUtils);

    boolean has(record record, LogUtils logUtils);

    void put(record record, LogUtils logUtils, Object obj);
}
