package o;

import android.content.Context;
import o.b;

public final class getValidSubResMimeList implements getAdapterPosition<setNativeApiScopeConfig> {
    private final b.C0007b<onAppResume> getMax;
    private final b.C0007b<setIsUrgentResource> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<appxLoadFailed> setMin;

    private getValidSubResMimeList(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.length = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
        this.setMax = bVar4;
    }

    public static getValidSubResMimeList getMax(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new getValidSubResMimeList(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new setNativeApiScopeConfig(this.length.get(), this.setMin.get(), this.getMax.get(), this.setMax.get());
    }
}
