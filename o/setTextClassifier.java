package o;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;

public interface setTextClassifier<T> {
    @MainThread
    void setMax(@Nullable T t);
}
