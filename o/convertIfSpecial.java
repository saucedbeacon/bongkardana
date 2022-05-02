package o;

public interface convertIfSpecial {
    void defineConst(String str, LogUtils logUtils);

    boolean isConst(String str);

    void putConst(String str, LogUtils logUtils, Object obj);
}
