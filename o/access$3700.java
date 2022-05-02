package o;

import android.content.Context;
import o.b;

public final class access$3700 implements getAdapterPosition<access$3600> {
    private final b.C0007b<Context> getMax;

    private access$3700(b.C0007b<Context> bVar) {
        this.getMax = bVar;
    }

    public static access$3700 getMax(b.C0007b<Context> bVar) {
        return new access$3700(bVar);
    }

    public final /* synthetic */ Object get() {
        return new access$3600(this.getMax.get());
    }
}
