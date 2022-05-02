package o;

import java.io.IOException;
import javax.annotation.Nullable;

public interface translateFrame {
    public static final translateFrame getMax = new translateFrame() {
        public final InvalidDataException authenticate(@Nullable getCloseCode getclosecode, InvalidHandshakeException invalidHandshakeException) {
            return null;
        }
    };

    @Nullable
    InvalidDataException authenticate(@Nullable getCloseCode getclosecode, InvalidHandshakeException invalidHandshakeException) throws IOException;
}
