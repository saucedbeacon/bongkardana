package o;

import android.content.Context;
import o.b;
import o.isMainThread;

public final class onPreMigrate implements getAdapterPosition<createQuery> {
    private final b.C0007b<isMainThread.getMin> getMin;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<handleTinyAppKeyEvent> setMin;

    private onPreMigrate(b.C0007b<Context> bVar, b.C0007b<isMainThread.getMin> bVar2, b.C0007b<handleTinyAppKeyEvent> bVar3) {
        this.setMax = bVar;
        this.getMin = bVar2;
        this.setMin = bVar3;
    }

    public static onPreMigrate setMax(b.C0007b<Context> bVar, b.C0007b<isMainThread.getMin> bVar2, b.C0007b<handleTinyAppKeyEvent> bVar3) {
        return new onPreMigrate(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new createQuery(this.setMax.get(), this.getMin.get(), this.setMin.get());
    }
}
