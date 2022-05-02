package o;

import o.GriverSecurity;
import o.b;

public final class DeviceUtils implements getAdapterPosition<getIMEI> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<setStorageProxy> merchantInfoRepositoryProvider;
    private final b.C0007b<GriverSecurity.AnonymousClass1> merchantReviewFormRepositoryProvider;

    public DeviceUtils(b.C0007b<GriverSecurity.AnonymousClass1> bVar, b.C0007b<setStorageProxy> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        this.merchantReviewFormRepositoryProvider = bVar;
        this.merchantInfoRepositoryProvider = bVar2;
        this.featureConfigRepositoryProvider = bVar3;
    }

    public final getIMEI get() {
        return newInstance(this.merchantReviewFormRepositoryProvider.get(), this.merchantInfoRepositoryProvider.get(), this.featureConfigRepositoryProvider.get());
    }

    public static DeviceUtils create(b.C0007b<GriverSecurity.AnonymousClass1> bVar, b.C0007b<setStorageProxy> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        return new DeviceUtils(bVar, bVar2, bVar3);
    }

    public static getIMEI newInstance(GriverSecurity.AnonymousClass1 r1, setStorageProxy setstorageproxy, setDefaultFontSize setdefaultfontsize) {
        return new getIMEI(r1, setstorageproxy, setdefaultfontsize);
    }
}
