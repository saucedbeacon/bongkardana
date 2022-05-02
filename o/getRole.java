package o;

import java.io.IOException;

public interface getRole {
    void onFailure(checkAlloc checkalloc, IOException iOException);

    void onResponse(checkAlloc checkalloc, InvalidHandshakeException invalidHandshakeException) throws IOException;
}
