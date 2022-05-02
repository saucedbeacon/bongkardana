package o;

import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;

public interface dispatchKeyShortcutEvent {
    void receive(String str, FlipperReceiver flipperReceiver);

    void reportError(Throwable th);

    void setMax(String str, FlipperObject flipperObject);
}
