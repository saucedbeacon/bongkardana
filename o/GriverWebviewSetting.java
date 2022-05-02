package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class GriverWebviewSetting extends parseFailed<Boolean, Void> {
    private final AnonymousClass1 permissionRepository;

    /* renamed from: o.GriverWebviewSetting$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<Boolean> checkDeniedLocationPermission();

        TitleBarRightButtonView.AnonymousClass1<Boolean> checkMobileDataPermissionAccepted(String str);

        TitleBarRightButtonView.AnonymousClass1<Boolean> setDeniedLocationPermission(Boolean bool);

        TitleBarRightButtonView.AnonymousClass1<Boolean> setMobileDataPermissionAccepted(String str);
    }

    @Inject
    public GriverWebviewSetting(appxLoadFailed appxloadfailed, getScheme getscheme, AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.permissionRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.permissionRepository.checkDeniedLocationPermission();
    }
}
