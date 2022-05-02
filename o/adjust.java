package o;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.concurrent.Callable;

public final class adjust implements Callable {
    private final RemoteConfigComponent setMax;

    public adjust(RemoteConfigComponent remoteConfigComponent) {
        this.setMax = remoteConfigComponent;
    }

    public final Object call() {
        return this.setMax.getDefault();
    }
}
