package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class setHttpLinkSubResMimeList implements onDisconnect {
    private final DialogLayout accountEntityDataFactory;
    private final getIgnorePermissionCheck userEducationDataFactory;

    @Inject
    public setHttpLinkSubResMimeList(getIgnorePermissionCheck getignorepermissioncheck, DialogLayout dialogLayout) {
        this.userEducationDataFactory = getignorepermissioncheck;
        this.accountEntityDataFactory = dialogLayout;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowToolTip(String str) {
        return getPhoneNumber().flatMap(new setEnableProxy(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$isNeedToShowToolTip$0(String str, String str2) throws Exception {
        return createUserEducationData().isNeedToShowToolTip(str, str2);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowToolTip(boolean z, String str) {
        return getPhoneNumber().flatMap(new getEnableProxy(this, z, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveShowToolTip$1(boolean z, String str, String str2) throws Exception {
        return createUserEducationData().saveShowToolTip(z, str, str2);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowBottomSheetOnBoarding(String str) {
        return getPhoneNumber().flatMap(new getEventList(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$isNeedToShowBottomSheetOnBoarding$2(String str, String str2) throws Exception {
        return createUserEducationData().isNeedToShowBottomSheetOnBoarding(str, str2);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveDisplayedBottomSheetOnBoarding(String str) {
        return getPhoneNumber().flatMap(new setEventList(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveDisplayedBottomSheetOnBoarding$3(String str, String str2) throws Exception {
        return createUserEducationData().saveShowBottomSheetOnBoarding(str, str2);
    }

    private TitleBarRightButtonView.AnonymousClass1<String> getPhoneNumber() {
        return createAccountData().getAccount().map(setIgnorePermissionCheck.length);
    }

    private setValidSubResMimeList createUserEducationData() {
        return this.userEducationDataFactory.createData("local");
    }

    private setDrawDivider createAccountData() {
        return this.accountEntityDataFactory.createData("local");
    }
}
