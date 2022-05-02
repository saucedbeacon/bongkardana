package o;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class AppUpdaterFactory implements releaseResourcePackages {
    private final toFullString syncContactPreferences;

    @Inject
    public AppUpdaterFactory(toFullString tofullstring) {
        this.syncContactPreferences = tofullstring;
    }

    public TitleBarRightButtonView.AnonymousClass1<updateApp> syncContact(List<String> list) {
        throw new UnsupportedOperationException();
    }

    public class Rule extends setRepeatCount<UpdateAppException> implements releaseResourcePackages {
        @Inject
        public Rule(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
            super(setisurgentresource, appxloadfailed, onappresume, context);
        }

        public Class<UpdateAppException> getFacadeClass() {
            return UpdateAppException.class;
        }

        public TitleBarRightButtonView.AnonymousClass1<updateApp> syncContact(List<String> list) {
            setNeedShowError setneedshowerror = new setNeedShowError();
            setneedshowerror.phoneNumbers = list;
            setneedshowerror.envInfo = generateMobileEnvInfo();
            return wrapper(new findUpdater(setneedshowerror));
        }

        public TitleBarRightButtonView.AnonymousClass1<Boolean> isSyncProcessCompleted() {
            throw new UnsupportedOperationException();
        }

        public TitleBarRightButtonView.AnonymousClass1<Boolean> saveSyncProcessStatusComplete() {
            throw new UnsupportedOperationException();
        }

        public TitleBarRightButtonView.AnonymousClass1<setSnapshotTitleBarParams> getLastSyncedContact() {
            throw new UnsupportedOperationException();
        }

        public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastSyncedContact(setSnapshotTitleBarParams setsnapshottitlebarparams) {
            throw new UnsupportedOperationException();
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSyncProcessCompleted() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.syncContactPreferences.isSyncContactProgressDone()));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveSyncProcessStatusComplete() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.syncContactPreferences.saveSyncProcessCompleteStatus()));
    }

    public TitleBarRightButtonView.AnonymousClass1<setSnapshotTitleBarParams> getLastSyncedContact() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.syncContactPreferences.getLastSyncedContact());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastSyncedContact(setSnapshotTitleBarParams setsnapshottitlebarparams) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.syncContactPreferences.saveLastSyncedContact(setsnapshottitlebarparams)));
    }
}
