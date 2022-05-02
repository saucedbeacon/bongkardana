package o;

import o.b;

public final class getExtendInfoFromApp implements getAdapterPosition<Constants> {
    private final b.C0007b<GriverSwtich> referralRepositoryProvider;

    public getExtendInfoFromApp(b.C0007b<GriverSwtich> bVar) {
        this.referralRepositoryProvider = bVar;
    }

    public final Constants get() {
        return newInstance(this.referralRepositoryProvider.get());
    }

    public static getExtendInfoFromApp create(b.C0007b<GriverSwtich> bVar) {
        return new getExtendInfoFromApp(bVar);
    }

    public static Constants newInstance(GriverSwtich griverSwtich) {
        return new Constants(griverSwtich);
    }
}
