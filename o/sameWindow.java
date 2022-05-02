package o;

import android.content.Context;
import o.AutoTransition;
import o.LocationBridgeExtension;
import o.b;

public final class sameWindow implements getAdapterPosition<AUIconDrawable> {
    private final b.C0007b<onMessage> getMax;
    private final b.C0007b<LocationBridgeExtension.AnonymousClass2> getMin;
    private final b.C0007b<Context> length;
    private final b.C0007b<getShortName> setMax;
    private final b.C0007b<AutoTransition.setMax> setMin;

    private sameWindow(b.C0007b<Context> bVar, b.C0007b<onMessage> bVar2, b.C0007b<AutoTransition.setMax> bVar3, b.C0007b<LocationBridgeExtension.AnonymousClass2> bVar4, b.C0007b<getShortName> bVar5) {
        this.length = bVar;
        this.getMax = bVar2;
        this.setMin = bVar3;
        this.getMin = bVar4;
        this.setMax = bVar5;
    }

    public static sameWindow getMax(b.C0007b<Context> bVar, b.C0007b<onMessage> bVar2, b.C0007b<AutoTransition.setMax> bVar3, b.C0007b<LocationBridgeExtension.AnonymousClass2> bVar4, b.C0007b<getShortName> bVar5) {
        return new sameWindow(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new AUIconDrawable(this.length.get(), this.getMax.get(), this.setMin.get(), this.getMin.get(), this.setMax.get());
    }
}
