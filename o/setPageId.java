package o;

import o.TitleBarRightButtonView;
import o.VisitNode;

public interface setPageId {
    TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateProfileQrDeepLink(String str, String str2, String str3, String str4, String str5, boolean z);

    TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateReferralDeepLink(String str);

    TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateSplitBillDetailDeepLink(String str);

    TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateSplitBillQrDeepLink(String str, String str2, String str3, String str4, String str5, String str6);

    TitleBarRightButtonView.AnonymousClass1<VisitNode.AnonymousClass1> generateTransferQrDeepLink(String str, String str2, String str3, String str4, String str5);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveProfileQrDeepLink(String str, boolean z);
}
