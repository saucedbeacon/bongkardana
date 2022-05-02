package o;

import android.content.Context;
import o.b;

public final class getImageAssetsFolder implements getAdapterPosition<setImageAssetsFolder> {
    private final b.C0007b<setIsUrgentResource> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<appxLoadFailed> length;
    private final b.C0007b<onAppResume> setMin;

    private getImageAssetsFolder(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.getMax = bVar;
        this.length = bVar2;
        this.setMin = bVar3;
        this.getMin = bVar4;
    }

    public static getImageAssetsFolder getMax(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new getImageAssetsFolder(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new setImageAssetsFolder(this.getMax.get(), this.length.get(), this.setMin.get(), this.getMin.get());
    }
}
