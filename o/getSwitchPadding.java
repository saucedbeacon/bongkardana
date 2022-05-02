package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public interface getSwitchPadding extends Closeable {
    boolean getMax();

    @Nullable
    String getMin();

    @NonNull
    InputStream length() throws IOException;

    @Nullable
    String setMax();
}
