package o;

import java.io.IOException;

public interface checkAlloc extends Cloneable {

    public interface getMin {
        checkAlloc length(InvalidDataException invalidDataException);
    }

    boolean getMax();

    InvalidDataException getMin();

    InvalidHandshakeException length() throws IOException;

    void setMax();

    void setMin(getRole getrole);
}
