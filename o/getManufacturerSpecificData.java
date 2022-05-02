package o;

import id.dana.domain.authcode.interactor.GetAuthCode;
import o.APWebSettings;
import o.b;
import o.parseFromBytes;

public final class getManufacturerSpecificData implements getAdapterPosition<getAdvertiseFlags> {
    private final b.C0007b<getAllowContentAccess> getMax;
    private final b.C0007b<APWebSettings.ZoomDensity> length;
    private final b.C0007b<GetAuthCode> setMax;
    private final b.C0007b<parseFromBytes.getMin> setMin;

    private getManufacturerSpecificData(b.C0007b<parseFromBytes.getMin> bVar, b.C0007b<getAllowContentAccess> bVar2, b.C0007b<GetAuthCode> bVar3, b.C0007b<APWebSettings.ZoomDensity> bVar4) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
        this.length = bVar4;
    }

    public static getManufacturerSpecificData setMin(b.C0007b<parseFromBytes.getMin> bVar, b.C0007b<getAllowContentAccess> bVar2, b.C0007b<GetAuthCode> bVar3, b.C0007b<APWebSettings.ZoomDensity> bVar4) {
        return new getManufacturerSpecificData(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getAdvertiseFlags(this.setMin.get(), this.getMax.get(), this.setMax.get(), this.length.get());
    }
}
