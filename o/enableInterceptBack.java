package o;

import android.content.Context;
import o.b;

public final class enableInterceptBack implements getAdapterPosition<CommonBackPerform> {
    private final b.C0007b<Context> setMax;

    private enableInterceptBack(b.C0007b<Context> bVar) {
        this.setMax = bVar;
    }

    public static enableInterceptBack setMax(b.C0007b<Context> bVar) {
        return new enableInterceptBack(bVar);
    }

    public final /* synthetic */ Object get() {
        return new CommonBackPerform(this.setMax.get());
    }
}
