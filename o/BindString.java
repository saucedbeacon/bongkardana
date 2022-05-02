package o;

import android.content.Context;
import o.BindDimen;
import o.OrientationDetector;
import o.b;

public final class BindString implements getAdapterPosition<BindColor> {
    private final b.C0007b<BindDimen.setMin> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<OrientationDetector.OrientationListener> length;
    private final b.C0007b<toHexString> setMax;

    private BindString(b.C0007b<BindDimen.setMin> bVar, b.C0007b<toHexString> bVar2, b.C0007b<OrientationDetector.OrientationListener> bVar3, b.C0007b<Context> bVar4) {
        this.getMax = bVar;
        this.setMax = bVar2;
        this.length = bVar3;
        this.getMin = bVar4;
    }

    public static BindString length(b.C0007b<BindDimen.setMin> bVar, b.C0007b<toHexString> bVar2, b.C0007b<OrientationDetector.OrientationListener> bVar3, b.C0007b<Context> bVar4) {
        return new BindString(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new BindColor(this.getMax.get(), this.setMax.get(), this.length.get(), this.getMin.get());
    }
}
