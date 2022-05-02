package o;

import android.content.Context;
import o.b;

public final class showError implements getAdapterPosition<SplashView> {
    private final b.C0007b<addEvent2Performance> getMax;
    private final b.C0007b<appxLoadFailed> getMin;
    private final b.C0007b<onAppResume> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<setIsUrgentResource> setMin;

    private showError(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<addEvent2Performance> bVar5) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMax = bVar4;
        this.getMax = bVar5;
    }

    public static showError getMin(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<addEvent2Performance> bVar5) {
        return new showError(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new SplashView(this.setMin.get(), this.getMin.get(), this.length.get(), this.setMax.get(), this.getMax.get());
    }
}
