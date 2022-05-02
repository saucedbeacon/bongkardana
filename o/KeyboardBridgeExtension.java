package o;

import androidx.annotation.Nullable;

public interface KeyboardBridgeExtension<T> {
    void onComplete(String str, @Nullable T t);

    void onError();
}
