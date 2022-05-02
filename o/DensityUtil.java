package o;

import o.GriverSecurity;
import o.b;

public final class DensityUtil implements getAdapterPosition<CommonUtils> {
    private final b.C0007b<GriverSecurity.AnonymousClass1> merchantReviewFormRepositoryProvider;

    public DensityUtil(b.C0007b<GriverSecurity.AnonymousClass1> bVar) {
        this.merchantReviewFormRepositoryProvider = bVar;
    }

    public final CommonUtils get() {
        return newInstance(this.merchantReviewFormRepositoryProvider.get());
    }

    public static DensityUtil create(b.C0007b<GriverSecurity.AnonymousClass1> bVar) {
        return new DensityUtil(bVar);
    }

    public static CommonUtils newInstance(GriverSecurity.AnonymousClass1 r1) {
        return new CommonUtils(r1);
    }
}
