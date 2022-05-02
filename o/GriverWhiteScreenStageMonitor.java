package o;

import java.util.List;
import o.TitleBarRightButtonView;

public interface GriverWhiteScreenStageMonitor {
    TitleBarRightButtonView.AnonymousClass1<getMonitorToken> convertCardIndexNo(getMonitorToken getmonitortoken);

    TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentRecipient();

    TitleBarRightButtonView.AnonymousClass1<Integer> getMaxSavedBank();

    TitleBarRightButtonView.AnonymousClass1<List<ErrorPageUtils>> getRecentBank(String str);

    TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getRecentRecipient(int i, int i2, int i3);

    TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getRecentRecipientAll();

    TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getRecentTransaction();

    TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getSecureRecentRecipient(int i, int i2, int i3);

    setFavoriteBtnVisibility migrateRoomToUserConfig();

    TitleBarRightButtonView.AnonymousClass1<Boolean> removeRecentBankAndSyncToUserConfig(GriverFullLinkStageMonitor griverFullLinkStageMonitor);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveRecentBank(GriverFullLinkStageMonitor griverFullLinkStageMonitor);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveRecentContact(unRegisterStageMonitor unregisterstagemonitor);

    TitleBarRightButtonView.AnonymousClass1<Boolean> storeLocalSecureUserConfig(List<getMonitorToken> list);

    TitleBarRightButtonView.AnonymousClass1<Boolean> storeSecureUserConfig(List<getMonitorToken> list);

    TitleBarRightButtonView.AnonymousClass1<Boolean> storeUserConfig(List<getMonitorToken> list);
}
