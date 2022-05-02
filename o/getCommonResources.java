package o;

import android.content.Context;
import java.io.File;
import o.TitleBarRightButtonView;

public interface getCommonResources {
    TitleBarRightButtonView.AnonymousClass1<Boolean> finishFirstTime();

    TitleBarRightButtonView.AnonymousClass1<GriverCommonResourceProxy> getAccount();

    TitleBarRightButtonView.AnonymousClass1<String> getAvatarUrl();

    TitleBarRightButtonView.AnonymousClass1<Boolean> getBalanceVisibility();

    TitleBarRightButtonView.AnonymousClass1<GriverCommonResourceProxy> getDrutherDataForUpdate(Context context);

    TitleBarRightButtonView.AnonymousClass1<String> getKycLevel();

    TitleBarRightButtonView.AnonymousClass1<GriverOptionMenuPanelExtension> getLastTransaction();

    TitleBarRightButtonView.AnonymousClass1<String> getNickname();

    TitleBarRightButtonView.AnonymousClass1<String> getPhoneNumber();

    TitleBarRightButtonView.AnonymousClass1<Long> getPocketLastTimestamp();

    TitleBarRightButtonView.AnonymousClass1<Integer> getPocketNumUpdated(String str);

    TitleBarRightButtonView.AnonymousClass1<String> getUUID();

    TitleBarRightButtonView.AnonymousClass1<String> getUserId();

    TitleBarRightButtonView.AnonymousClass1<Boolean> hasAccount();

    TitleBarRightButtonView.AnonymousClass1<Boolean> isFirstTime();

    TitleBarRightButtonView.AnonymousClass1<Boolean> isOverActiveTimestamp();

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveAccount(GriverCommonResourceProxy griverCommonResourceProxy);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastTransaction(GriverOptionMenuPanelExtension griverOptionMenuPanelExtension);

    TitleBarRightButtonView.AnonymousClass1<String> saveNickname(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> setBalanceVisibility(Boolean bool);

    TitleBarRightButtonView.AnonymousClass1<Long> setLastActiveTimestamp(Long l);

    TitleBarRightButtonView.AnonymousClass1<Long> setPocketLastTimestamp(long j);

    TitleBarRightButtonView.AnonymousClass1<String> uploadAvatar(File file);
}
