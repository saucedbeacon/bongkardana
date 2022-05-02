package com.iap.ac.android.acs.plugin.biz.region.menu;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.biz.region.RegionManager;
import com.iap.ac.android.acs.plugin.biz.region.bean.AddFavoriteResult;
import com.iap.ac.android.acs.plugin.biz.region.bean.FetchMenuExtraInfoResult;
import com.iap.ac.android.acs.plugin.biz.region.bean.MenuExtraInfo;
import com.iap.ac.android.acs.plugin.biz.region.bean.RemoveFavoriteResult;
import com.iap.ac.android.acs.plugin.biz.region.config.RegionRPCConfigCenter;
import com.iap.ac.android.acs.plugin.biz.region.menu.repository.AddFavoriteRepository;
import com.iap.ac.android.acs.plugin.biz.region.menu.repository.FetchMenuExtraInfoRepository;
import com.iap.ac.android.acs.plugin.biz.region.menu.repository.RemoveFavoriteRepository;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus;
import com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType;
import com.iap.ac.android.common.container.provider.ui.ContainerUIProvider;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class RegionMenuProvider extends ContainerUIProvider implements IContainerListener {
    public void onContainerDestroyed(@NonNull Bundle bundle) {
    }

    public void onContainerFeedbackMenuClick(String str, String str2, Bundle bundle) {
        String feedbackItemAppId = RegionRPCConfigCenter.INSTANCE.getFeedbackItemAppId();
        Context context = RegionManager.getInstance().getContext();
        if (!TextUtils.isEmpty(feedbackItemAppId) && context != null) {
            ContainerParams createForMniProgram = ContainerParams.createForMniProgram(feedbackItemAppId);
            createForMniProgram.containerBundle = new Bundle();
            Bundle bundle2 = createForMniProgram.containerBundle;
            StringBuilder sb = new StringBuilder("appId=");
            sb.append(str);
            sb.append("&appName=");
            sb.append(str2);
            bundle2.putString("query", sb.toString());
            WebContainer.getInstance("ac_biz").startContainer(context, createForMniProgram);
        }
    }

    public void onContainerFavoriteMenuClick(final String str, String str2, final AppFavoriteStatus appFavoriteStatus, Bundle bundle) {
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                int i = AnonymousClass3.$SwitchMap$com$iap$ac$android$common$container$provider$ui$AppFavoriteStatus[appFavoriteStatus.ordinal()];
                if (i == 2) {
                    RegionMenuProvider.this.setFavoriteStatus(str, AppFavoriteStatus.Collected);
                    AddFavoriteResult addFavorite = new AddFavoriteRepository().addFavorite(str);
                    if (addFavorite == null || !addFavorite.success) {
                        RegionMenuProvider.this.setFavoriteStatus(str, appFavoriteStatus);
                    } else {
                        RegionMenuProvider.this.setFavoriteStatus(str, AppFavoriteStatus.Collected);
                    }
                } else if (i == 3) {
                    RegionMenuProvider.this.setFavoriteStatus(str, AppFavoriteStatus.Uncollected);
                    RemoveFavoriteResult removeFavorite = new RemoveFavoriteRepository().removeFavorite(str);
                    if (removeFavorite == null || !removeFavorite.success) {
                        RegionMenuProvider.this.setFavoriteStatus(str, appFavoriteStatus);
                    } else {
                        RegionMenuProvider.this.setFavoriteStatus(str, AppFavoriteStatus.Uncollected);
                    }
                }
            }
        });
    }

    public void onContainerNotificationMenuClick(String str, String str2, Bundle bundle) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(2062486079, oncanceled);
            onCancelLoad.getMin(2062486079, oncanceled);
        }
        String notificationBoxItemAppId = RegionRPCConfigCenter.INSTANCE.getNotificationBoxItemAppId();
        Context context = RegionManager.getInstance().getContext();
        if (!TextUtils.isEmpty(notificationBoxItemAppId) && context != null) {
            ContainerParams createForMniProgram = ContainerParams.createForMniProgram(notificationBoxItemAppId);
            createForMniProgram.containerBundle = new Bundle();
            Bundle bundle2 = createForMniProgram.containerBundle;
            StringBuilder sb = new StringBuilder("appId=");
            sb.append(str);
            sb.append("&appName=");
            sb.append(str2);
            bundle2.putString("query", sb.toString());
            WebContainer.getInstance("ac_biz").startContainer(context, createForMniProgram);
            setShowRedDot(str, ContainerMoreMenuItemType.Notification, false);
        }
    }

    /* renamed from: com.iap.ac.android.acs.plugin.biz.region.menu.RegionMenuProvider$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$iap$ac$android$common$container$provider$ui$AppFavoriteStatus;
        static final /* synthetic */ int[] $SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType[] r0 = com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType = r0
                r1 = 1
                com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType r2 = com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType.Notification     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType r3 = com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType.Feedback     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType r4 = com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType.Favorite     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus[] r3 = com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$iap$ac$android$common$container$provider$ui$AppFavoriteStatus = r3
                com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus r4 = com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus.Unknow     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$iap$ac$android$common$container$provider$ui$AppFavoriteStatus     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus r3 = com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus.Uncollected     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$container$provider$ui$AppFavoriteStatus     // Catch:{ NoSuchFieldError -> 0x004d }
                com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus r1 = com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus.Collected     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.biz.region.menu.RegionMenuProvider.AnonymousClass3.<clinit>():void");
        }
    }

    public boolean itemShowFilter(String str, ContainerMoreMenuItemType containerMoreMenuItemType) {
        int i = AnonymousClass3.$SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType[containerMoreMenuItemType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return RegionRPCConfigCenter.INSTANCE.getShowFavoriteItem();
            } else if (str.equals(RegionRPCConfigCenter.INSTANCE.getFeedbackItemAppId())) {
                return false;
            } else {
                return RegionRPCConfigCenter.INSTANCE.getShowFeedBackItem();
            }
        } else if (str.equals(RegionRPCConfigCenter.INSTANCE.getNotificationBoxItemAppId())) {
            return false;
        } else {
            return RegionRPCConfigCenter.INSTANCE.getShowNotificationBoxItem();
        }
    }

    public boolean itemShowRedDot(String str, ContainerMoreMenuItemType containerMoreMenuItemType) {
        if (AnonymousClass3.$SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType[containerMoreMenuItemType.ordinal()] != 1) {
            return false;
        }
        return RegionRPCConfigCenter.INSTANCE.getNotificationBoxRedDotEnabled();
    }

    public void onContainerCreated(@NonNull final Bundle bundle) {
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                String string = bundle.getString("appId");
                FetchMenuExtraInfoResult fetchMenuExtraInfo = new FetchMenuExtraInfoRepository().fetchMenuExtraInfo(string);
                if (fetchMenuExtraInfo != null && fetchMenuExtraInfo.success) {
                    for (Map.Entry next : fetchMenuExtraInfo.menuExtraInfos.entrySet()) {
                        String str = (String) next.getKey();
                        char c = 65535;
                        int hashCode = str.hashCode();
                        if (hashCode != -1774510696) {
                            if (hashCode == -1307328690 && str.equals(MenuExtraInfo.MENU_ID_NOTIFICATION)) {
                                c = 0;
                            }
                        } else if (str.equals(MenuExtraInfo.MENU_ID_COLLECT)) {
                            c = 1;
                        }
                        if (c == 0) {
                            RegionMenuProvider.this.setShowRedDot(string, ContainerMoreMenuItemType.Notification, ((MenuExtraInfo) next.getValue()).showRedDot);
                        } else if (c == 1) {
                            Object obj = ((MenuExtraInfo) next.getValue()).customData.get(MenuExtraInfo.CUSTOM_DATA_COLLECTED_STATUS);
                            if (obj instanceof Boolean) {
                                if (((Boolean) obj).booleanValue()) {
                                    RegionMenuProvider.this.setFavoriteStatus(string, AppFavoriteStatus.Collected);
                                } else {
                                    RegionMenuProvider.this.setFavoriteStatus(string, AppFavoriteStatus.Uncollected);
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}
