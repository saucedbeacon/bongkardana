package o;

import java.util.concurrent.Callable;
import o.ExtensionOpt;

final class useCache implements Callable {
    private final ExtensionOpt.MismatchMethodException getMax;

    public useCache(ExtensionOpt.MismatchMethodException mismatchMethodException) {
        this.getMax = mismatchMethodException;
    }

    public final Object call() {
        return this.getMax.getMockedWhitelistedQrH5Container();
    }
}
