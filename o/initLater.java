package o;

import java.io.IOException;

public interface initLater<T> extends Cloneable {
    getAppenderManager<T> getMax() throws IOException;

    boolean getMin();

    void length();

    initLater<T> setMin();

    void setMin(initToolsProcessIfNeeded<T> inittoolsprocessifneeded);
}
