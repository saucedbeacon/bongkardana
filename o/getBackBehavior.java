package o;

import android.content.Context;
import o.b;

public final class getBackBehavior implements getAdapterPosition<getCallback> {
    private final b.C0007b<onAppResume> getMax;
    private final b.C0007b<ColorSchemeModelTemplate> getMin;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<BackKeyDownPoint> setMin;

    private getBackBehavior(b.C0007b<BackKeyDownPoint> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3, b.C0007b<ColorSchemeModelTemplate> bVar4) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
        this.getMin = bVar4;
    }

    public static getBackBehavior setMax(b.C0007b<BackKeyDownPoint> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3, b.C0007b<ColorSchemeModelTemplate> bVar4) {
        return new getBackBehavior(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getCallback(this.setMin.get(), this.getMax.get(), this.setMax.get(), this.getMin.get());
    }
}
