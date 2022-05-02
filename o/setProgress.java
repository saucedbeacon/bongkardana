package o;

import androidx.annotation.NonNull;
import java.io.IOException;

public interface setProgress<T> {

    public interface getMin<T> {
        @NonNull
        setProgress<T> setMax(@NonNull T t);

        @NonNull
        Class<T> setMin();
    }

    void getMax();

    @NonNull
    T getMin() throws IOException;
}
