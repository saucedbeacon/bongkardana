package o;

import android.content.Context;
import o.b;

public final class getBadgeAreaView implements getAdapterPosition<getIconAreaView> {
    private final b.C0007b<Context> getMax;
    private final b.C0007b<appxLoadFailed> getMin;
    private final b.C0007b<onAppResume> length;
    private final b.C0007b<setIsUrgentResource> setMax;

    private getBadgeAreaView(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.setMax = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.getMax = bVar4;
    }

    public static getBadgeAreaView setMin(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new getBadgeAreaView(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getIconAreaView(this.setMax.get(), this.getMin.get(), this.length.get(), this.getMax.get());
    }
}
