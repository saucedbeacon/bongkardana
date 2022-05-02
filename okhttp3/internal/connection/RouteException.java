package okhttp3.internal.connection;

import java.io.IOException;
import o.initCloseCode;

public final class RouteException extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public final IOException getFirstConnectException() {
        return this.firstException;
    }

    public final IOException getLastConnectException() {
        return this.lastException;
    }

    public final void addConnectException(IOException iOException) {
        initCloseCode.getMin((Throwable) this.firstException, (Throwable) iOException);
        this.lastException = iOException;
    }
}
