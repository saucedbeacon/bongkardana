package o;

import javax.inject.Inject;

public class isAppIdInPreDownloadConfig extends GriverAppxLoadFailedPoint<Boolean, Void> {
    private final setFireMoment qrPayRepository;

    @Inject
    public isAppIdInPreDownloadConfig(setFireMoment setfiremoment) {
        this.qrPayRepository = setfiremoment;
    }

    /* access modifiers changed from: protected */
    public Boolean buildUseCaseObservable(Void voidR) {
        return this.qrPayRepository.pause();
    }
}
