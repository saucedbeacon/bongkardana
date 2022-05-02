package o;

import android.content.Context;
import o.b;

public final class purifyUrl implements getAdapterPosition<getCORSUrl> {
    private final b.C0007b<Context> contextProvider;

    public purifyUrl(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final getCORSUrl get() {
        return newInstance(this.contextProvider.get());
    }

    public static purifyUrl create(b.C0007b<Context> bVar) {
        return new purifyUrl(bVar);
    }

    public static getCORSUrl newInstance(Context context) {
        return new getCORSUrl(context);
    }
}
