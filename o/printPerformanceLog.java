package o;

import o.b;

public final class printPerformanceLog implements getAdapterPosition<RVLogger> {
    private final b.C0007b<getCORSUrl> sendMoneyPreferenceProvider;

    public printPerformanceLog(b.C0007b<getCORSUrl> bVar) {
        this.sendMoneyPreferenceProvider = bVar;
    }

    public final RVLogger get() {
        return newInstance(this.sendMoneyPreferenceProvider.get());
    }

    public static printPerformanceLog create(b.C0007b<getCORSUrl> bVar) {
        return new printPerformanceLog(bVar);
    }

    public static RVLogger newInstance(getCORSUrl getcorsurl) {
        return new RVLogger(getcorsurl);
    }
}
