package o;

import o.b;

public final class getParcelable implements getAdapterPosition<RVScheduleType> {
    private final b.C0007b<isBackgroundRunning> couponChannelInfoResultMapperProvider;

    public getParcelable(b.C0007b<isBackgroundRunning> bVar) {
        this.couponChannelInfoResultMapperProvider = bVar;
    }

    public final RVScheduleType get() {
        return newInstance(this.couponChannelInfoResultMapperProvider.get());
    }

    public static getParcelable create(b.C0007b<isBackgroundRunning> bVar) {
        return new getParcelable(bVar);
    }

    public static RVScheduleType newInstance(isBackgroundRunning isbackgroundrunning) {
        return new RVScheduleType(isbackgroundrunning);
    }
}
