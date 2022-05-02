package o;

import android.content.Context;
import o.R;
import o.b;

public final class setupParams implements getAdapterPosition<R.raw> {
    private final b.C0007b<Context> contextProvider;

    public setupParams(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final R.raw get() {
        return newInstance(this.contextProvider.get());
    }

    public static setupParams create(b.C0007b<Context> bVar) {
        return new setupParams(bVar);
    }

    public static R.raw newInstance(Context context) {
        return new R.raw(context);
    }
}
