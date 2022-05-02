package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface recordDnsTime extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    recordSSLTime getMin();

    void setMin(submitLazy submitlazy, long j) throws IOException;
}
