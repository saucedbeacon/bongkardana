package o;

import o.b;
import o.isMainThread;

public final class Recreator implements getAdapterPosition<TypeConverters> {
    private final b.C0007b<isMainThread.getMin> getMax;
    private final b.C0007b<forceFlush> length;

    private Recreator(b.C0007b<forceFlush> bVar, b.C0007b<isMainThread.getMin> bVar2) {
        this.length = bVar;
        this.getMax = bVar2;
    }

    public static Recreator length(b.C0007b<forceFlush> bVar, b.C0007b<isMainThread.getMin> bVar2) {
        return new Recreator(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new TypeConverters(this.length.get(), this.getMax.get());
    }
}
