package o;

import android.content.Context;
import o.b;

public final class markSupported implements getAdapterPosition<available> {
    private final b.C0007b<setIsUrgentResource> getMax;
    private final b.C0007b<appxLoadFailed> getMin;
    private final b.C0007b<Context> length;
    private final b.C0007b<onAppResume> setMax;

    private markSupported(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4) {
        this.length = bVar;
        this.getMax = bVar2;
        this.getMin = bVar3;
        this.setMax = bVar4;
    }

    public static markSupported setMin(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4) {
        return new markSupported(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new available(this.length.get(), this.getMax.get(), this.getMin.get(), this.setMax.get());
    }
}
