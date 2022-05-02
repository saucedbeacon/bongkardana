package o;

import java.util.List;
import o.TitleBarRightButtonView;

public class unRegisterRule implements releaseResourcePackages {
    public TitleBarRightButtonView.AnonymousClass1<updateApp> syncContact(List<String> list) {
        return TitleBarRightButtonView.AnonymousClass1.just(getSyncContactRpcResult(list));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSyncProcessCompleted() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveSyncProcessStatusComplete() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<setSnapshotTitleBarParams> getLastSyncedContact() {
        return TitleBarRightButtonView.AnonymousClass1.just(new setSnapshotTitleBarParams());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastSyncedContact(setSnapshotTitleBarParams setsnapshottitlebarparams) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    private updateApp getSyncContactRpcResult(List<String> list) {
        updateApp updateapp = new updateApp();
        updateapp.registeredUsers = list;
        updateapp.success = true;
        return updateapp;
    }
}
