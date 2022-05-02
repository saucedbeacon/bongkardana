package o;

import javax.annotation.Nullable;

public final class Appender<T> {
    @Nullable
    private final Throwable length;
    @Nullable
    private final getAppenderManager<T> setMin;

    public static <T> Appender<T> getMin(Throwable th) {
        if (th != null) {
            return new Appender<>((getAppenderManager) null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> Appender<T> getMax(getAppenderManager<T> getappendermanager) {
        if (getappendermanager != null) {
            return new Appender<>(getappendermanager, (Throwable) null);
        }
        throw new NullPointerException("response == null");
    }

    private Appender(@Nullable getAppenderManager<T> getappendermanager, @Nullable Throwable th) {
        this.setMin = getappendermanager;
        this.length = th;
    }
}
