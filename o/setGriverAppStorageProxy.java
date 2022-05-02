package o;

import javax.inject.Inject;
import o.GriverAMCSAppUpdater;
import o.TitleBarRightButtonView;

public class setGriverAppStorageProxy extends parseFailed<GriverAppInfoDBHelper, setMin> {
    private final GriverAMCSAppUpdater.AnonymousClass1 promoQuestRepository;

    @Inject
    public setGriverAppStorageProxy(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAMCSAppUpdater.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.promoQuestRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverAppInfoDBHelper> buildUseCaseObservable(setMin setmin) {
        return this.promoQuestRepository.trackQuestUser(setmin.missionId, setmin.questId, setmin.autoRedeem);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public boolean autoRedeem;
        /* access modifiers changed from: private */
        public String missionId;
        /* access modifiers changed from: private */
        public String questId;

        private setMin(String str, String str2, boolean z) {
            this.missionId = str;
            this.questId = str2;
            this.autoRedeem = z;
        }

        public static setMin forTrackUserQuest(String str, String str2, boolean z) {
            return new setMin(str, str2, z);
        }
    }
}
