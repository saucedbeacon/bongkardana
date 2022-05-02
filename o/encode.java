package o;

import android.content.Context;
import o.b;

public final class encode implements getAdapterPosition<getHash> {
    private final b.C0007b<Context> contextProvider;

    public encode(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final getHash get() {
        return newInstance(this.contextProvider.get());
    }

    public static encode create(b.C0007b<Context> bVar) {
        return new encode(bVar);
    }

    public static getHash newInstance(Context context) {
        return new getHash(context);
    }
}
