package o;

import android.content.Context;
import o.b;

public final class onSwitchToBlueTheme implements getAdapterPosition<CustomPopMenuExtension> {
    private final b.C0007b<Context> getMin;
    private final b.C0007b<getPerformanceTracker> length;
    private final b.C0007b<isInnerApp> setMin;

    private onSwitchToBlueTheme(b.C0007b<isInnerApp> bVar, b.C0007b<getPerformanceTracker> bVar2, b.C0007b<Context> bVar3) {
        this.setMin = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
    }

    public static onSwitchToBlueTheme length(b.C0007b<isInnerApp> bVar, b.C0007b<getPerformanceTracker> bVar2, b.C0007b<Context> bVar3) {
        return new onSwitchToBlueTheme(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new CustomPopMenuExtension(this.setMin.get(), this.length.get(), this.getMin.get());
    }
}
