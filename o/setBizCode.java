package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.PrivacySettingActivity;
import o.AUHorizontalListView;
import o.getTitleBarRelative;

public final class setBizCode implements getBindingAdapter<PrivacySettingActivity> {
    @InjectedFieldSignature("id.dana.social.PrivacySettingActivity.presenter")
    public static void getMin(PrivacySettingActivity privacySettingActivity, getTitleBarRelative.setMin setmin) {
        privacySettingActivity.presenter = setmin;
    }

    @InjectedFieldSignature("id.dana.social.PrivacySettingActivity.friendshipAnalyticTracker")
    public static void getMin(PrivacySettingActivity privacySettingActivity, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        privacySettingActivity.friendshipAnalyticTracker = selectionNotifier;
    }
}
