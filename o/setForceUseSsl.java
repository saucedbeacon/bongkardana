package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.PermissionModel;
import o.TitleBarRightButtonView;

@Singleton
public class setForceUseSsl implements setValidSubResMimeList {
    private final PermissionModel.AnonymousClass1 userEducationPreference;

    @Inject
    public setForceUseSsl(PermissionModel.AnonymousClass1 r1) {
        this.userEducationPreference = r1;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowToolTip(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(!this.userEducationPreference.getToolTipShow(str, str2)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowToolTip(boolean z, String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.userEducationPreference.saveToolTipShow(z, str, str2)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowBottomSheetOnBoarding(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.userEducationPreference.getBottomSheetOnBoardingShow(str, str2)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowBottomSheetOnBoarding(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.userEducationPreference.saveBottomSheetOnBoardingShow(str, str2)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setMobileDataPermissionAccepted(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.userEducationPreference.setMobileDataPermissionAccepted(str)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> checkMobileDataPermissionAccepted(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.userEducationPreference.checkMobileDataPermissionAccepted(str)));
    }
}
