package o;

import id.dana.data.Source;
import id.dana.domain.version.Version;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public final class setDownloadEndTime implements disconnectBluetoothDevice {
    private final onCallBack setMax;
    private final getDownloadTime setMin;

    @Inject
    public setDownloadEndTime(onCallBack oncallback, getDownloadTime getdownloadtime) {
        this.setMax = oncallback;
        this.setMin = getdownloadtime;
    }

    public final TitleBarRightButtonView.AnonymousClass1<Integer> getStorageVersion() {
        return TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(this.setMin.setMin.getInteger("storage_version").intValue()));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setStorageVersion(int i) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.setMin.setMax(i)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Version> getAppVersion() {
        return this.setMax.createData(Source.SPLIT).getAppVersion().onErrorResumeNext(this.setMax.createData("amcs").getAppVersion());
    }
}
