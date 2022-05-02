package o;

import java.util.concurrent.Callable;

public interface switchStyle<T> extends Callable<T> {
    T call();
}
