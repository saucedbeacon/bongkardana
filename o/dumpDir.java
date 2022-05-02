package o;

import javax.inject.Inject;
import o.GriverWebviewSetting;
import o.TitleBarRightButtonView;

public class dumpDir extends parseFailed<Boolean, setMin> {
    private final GriverWebviewSetting.AnonymousClass1 permissionRepository;

    @Inject
    public dumpDir(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWebviewSetting.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.permissionRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMin setmin) {
        return this.permissionRepository.setDeniedLocationPermission(Boolean.valueOf(setmin.isPermissionDenied));
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public boolean isPermissionDenied;

        private setMin(boolean z) {
            this.isPermissionDenied = z;
        }

        public static setMin forDenyLocationPermission(boolean z) {
            return new setMin(z);
        }
    }
}
