package o;

import android.content.Context;
import o.b;

public final class LocalCallRetryHandler implements getAdapterPosition<UniformIpcUtils> {
    private final b.C0007b<Context> contextProvider;

    public LocalCallRetryHandler(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final UniformIpcUtils get() {
        return newInstance(this.contextProvider.get());
    }

    public static LocalCallRetryHandler create(b.C0007b<Context> bVar) {
        return new LocalCallRetryHandler(bVar);
    }

    public static UniformIpcUtils newInstance(Context context) {
        return new UniformIpcUtils(context);
    }
}
