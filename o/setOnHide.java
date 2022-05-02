package o;

public interface setOnHide {
    <T> T getMax(Class<T> cls);

    <T> T length(int i, Class<T> cls);

    void setMax();

    void setMin(int i);

    <T> void setMin(T t);
}
