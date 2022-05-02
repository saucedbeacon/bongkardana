package o;

import android.content.Context;
import o.b;

public final class DefaultEngineRouter implements getAdapterPosition<hasTriggeredLoad> {
    private final b.C0007b<Context> length;

    private DefaultEngineRouter(b.C0007b<Context> bVar) {
        this.length = bVar;
    }

    public static DefaultEngineRouter setMin(b.C0007b<Context> bVar) {
        return new DefaultEngineRouter(bVar);
    }

    public final /* synthetic */ Object get() {
        return new hasTriggeredLoad(this.length.get());
    }
}
