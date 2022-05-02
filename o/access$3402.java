package o;

import android.content.Context;
import o.b;

public final class access$3402 implements getAdapterPosition<access$3800> {
    private final b.C0007b<access$3900> getMin;
    private final b.C0007b<Context> setMax;

    private access$3402(b.C0007b<Context> bVar, b.C0007b<access$3900> bVar2) {
        this.setMax = bVar;
        this.getMin = bVar2;
    }

    public static access$3402 getMax(b.C0007b<Context> bVar, b.C0007b<access$3900> bVar2) {
        return new access$3402(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new access$3800(this.setMax.get(), this.getMin.get());
    }
}
