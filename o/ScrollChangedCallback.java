package o;

import android.content.Context;
import o.b;

public final class ScrollChangedCallback implements getAdapterPosition<onScroll> {
    private final b.C0007b<ColorSchemeModelTemplate> equals;
    private final b.C0007b<RemoteCallbackPool> getMax;
    private final b.C0007b<BackKeyDownPoint> getMin;
    private final b.C0007b<onAppResume> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<getList> setMin;

    private ScrollChangedCallback(b.C0007b<Context> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getList> bVar4, b.C0007b<RemoteCallbackPool> bVar5, b.C0007b<ColorSchemeModelTemplate> bVar6) {
        this.setMax = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
        this.setMin = bVar4;
        this.getMax = bVar5;
        this.equals = bVar6;
    }

    public static ScrollChangedCallback length(b.C0007b<Context> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getList> bVar4, b.C0007b<RemoteCallbackPool> bVar5, b.C0007b<ColorSchemeModelTemplate> bVar6) {
        return new ScrollChangedCallback(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public final /* synthetic */ Object get() {
        return new onScroll(this.setMax.get(), this.length.get(), this.getMin.get(), this.setMin.get(), this.getMax.get(), this.equals.get());
    }
}
