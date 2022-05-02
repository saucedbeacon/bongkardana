package o;

import o.b;

public final class getInstallEndTime implements getAdapterPosition<setDownloadEndTime> {
    private final b.C0007b<onCallBack> length;
    private final b.C0007b<getDownloadTime> setMin;

    private getInstallEndTime(b.C0007b<onCallBack> bVar, b.C0007b<getDownloadTime> bVar2) {
        this.length = bVar;
        this.setMin = bVar2;
    }

    public static getInstallEndTime getMin(b.C0007b<onCallBack> bVar, b.C0007b<getDownloadTime> bVar2) {
        return new getInstallEndTime(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new setDownloadEndTime(this.length.get(), this.setMin.get());
    }
}
