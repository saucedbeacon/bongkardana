package o;

import javax.inject.Inject;
import o.GriverAMCSAppUpdater;
import o.TitleBarRightButtonView;

public class queryAppInfos extends parseFailed<GriverAppSQLiteStorage, getMax> {
    private final GriverAMCSAppUpdater.AnonymousClass1 questRepository;

    @Inject
    public queryAppInfos(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAMCSAppUpdater.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.questRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverAppSQLiteStorage> buildUseCaseObservable(getMax getmax) {
        return this.questRepository.redeemQuest(getmax.missionId, getmax.questId);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public String missionId;
        /* access modifiers changed from: private */
        public String questId;

        private getMax(String str, String str2) {
            this.missionId = str;
            this.questId = str2;
        }

        public static getMax forRedeemQuest(String str, String str2) {
            return new getMax(str, str2);
        }
    }
}
