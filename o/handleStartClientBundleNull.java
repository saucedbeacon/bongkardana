package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.VisitNode;

@Singleton
public class handleStartClientBundleNull implements setPageId {
    private final onRequestPermissionResult deepLinkPreferences;

    @Inject
    public handleStartClientBundleNull(onRequestPermissionResult onrequestpermissionresult) {
        this.deepLinkPreferences = onrequestpermissionresult;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveProfileQrDeepLink(String str, boolean z) {
        this.deepLinkPreferences.saveProfileDeepLinkUrl(str, z);
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateReferralDeepLink(String str) {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateTransferQrDeepLink(String str, String str2, String str3, String str4, String str5) {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateProfileQrDeepLink(String str, String str2, String str3, String str4, String str5, boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1(this.deepLinkPreferences.getProfileDeepLinkUrl(isWithReferral(str3, z))));
    }

    public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateSplitBillQrDeepLink(String str, String str2, String str3, String str4, String str5, String str6) {
        throw new UnsupportedOperationException();
    }

    private boolean isWithReferral(String str, boolean z) {
        return z || !str.isEmpty();
    }

    public TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateSplitBillDetailDeepLink(String str) {
        throw new UnsupportedOperationException();
    }
}
