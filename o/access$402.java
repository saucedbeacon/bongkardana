package o;

import android.content.Context;
import o.b;

public final class access$402 implements getAdapterPosition<pauseRender> {
    private final b.C0007b<Context> getMin;

    private access$402(b.C0007b<Context> bVar) {
        this.getMin = bVar;
    }

    public static access$402 setMin(b.C0007b<Context> bVar) {
        return new access$402(bVar);
    }

    public final /* synthetic */ Object get() {
        return new pauseRender(this.getMin.get());
    }
}
