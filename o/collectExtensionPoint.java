package o;

import android.content.Context;
import o.b;

public final class collectExtensionPoint implements getAdapterPosition<StringUtils> {
    private final b.C0007b<Context> contextProvider;

    public collectExtensionPoint(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final StringUtils get() {
        return newInstance(this.contextProvider.get());
    }

    public static collectExtensionPoint create(b.C0007b<Context> bVar) {
        return new collectExtensionPoint(bVar);
    }

    public static StringUtils newInstance(Context context) {
        return new StringUtils(context);
    }
}
