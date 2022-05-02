package o;

import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.concurrent.Callable;

public final class pack implements Callable {
    private final ConfigStorageClient length;

    public pack(ConfigStorageClient configStorageClient) {
        this.length = configStorageClient;
    }

    public final Object call() {
        return this.length.read();
    }
}
