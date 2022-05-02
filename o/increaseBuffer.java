package o;

import java.io.IOException;
import javax.annotation.Nullable;
import o.Draft;

public interface increaseBuffer {

    public interface setMax {
        int getMax();

        InvalidHandshakeException getMax(InvalidDataException invalidDataException) throws IOException;

        InvalidDataException getMin();

        int length();

        int setMax();

        @Nullable
        Draft.HandshakeState setMin();
    }

    InvalidHandshakeException getMax(setMax setmax) throws IOException;
}
