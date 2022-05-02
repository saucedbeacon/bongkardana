package o;

import java.io.IOException;

public interface getPayloadData {
    void length(InvalidDataException invalidDataException) throws IOException;

    void length(setCodeAndMessage setcodeandmessage);

    InvalidHandshakeException setMax(InvalidDataException invalidDataException) throws IOException;

    WebsocketNotConnectedException setMax(InvalidHandshakeException invalidHandshakeException) throws IOException;

    void setMax();

    void setMin(InvalidHandshakeException invalidHandshakeException, InvalidHandshakeException invalidHandshakeException2);
}
