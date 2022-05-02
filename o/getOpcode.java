package o;

import java.io.IOException;
import o.InvalidHandshakeException;

public interface getOpcode {
    NotSendableException getMax(InvalidHandshakeException invalidHandshakeException) throws IOException;

    void getMax();

    void getMin() throws IOException;

    void length(InvalidDataException invalidDataException) throws IOException;

    InvalidHandshakeException.getMin setMax(boolean z) throws IOException;

    recordDnsTime setMax(InvalidDataException invalidDataException, long j);

    void setMin() throws IOException;
}
