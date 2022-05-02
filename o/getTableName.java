package o;

import javax.inject.Inject;
import o.GriverAMCSAppUpdater;
import o.TitleBarRightButtonView;

public class getTableName extends parseFailed<GriverAppInfoPreDownloadStorage, getMax> {
    private final GriverAMCSAppUpdater.AnonymousClass1 questRepository;

    @Inject
    public getTableName(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAMCSAppUpdater.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.questRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverAppInfoPreDownloadStorage> buildUseCaseObservable(getMax getmax) {
        return this.questRepository.redeemMission(getmax.missionId);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public String missionId;

        private getMax(String str) {
            this.missionId = str;
        }

        public static getMax forRedeemMission(String str) {
            return new getMax(str);
        }
    }
}
