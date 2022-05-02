package o;

import android.content.Context;
import o.b;

public final class retryIPCCall implements getAdapterPosition<LocalCallManager> {
    private final b.C0007b<Context> contextProvider;

    public retryIPCCall(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final LocalCallManager get() {
        return newInstance(this.contextProvider.get());
    }

    public static retryIPCCall create(b.C0007b<Context> bVar) {
        return new retryIPCCall(bVar);
    }

    public static LocalCallManager newInstance(Context context) {
        return new LocalCallManager(context);
    }
}
