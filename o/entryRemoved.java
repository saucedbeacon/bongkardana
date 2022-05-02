package o;

import java.io.Closeable;
import java.io.Flushable;

public interface entryRemoved extends Closeable, Flushable {
    void close();

    void flush();

    void setMax(maxSize maxsize, long j);

    loadParameters setMin();
}
