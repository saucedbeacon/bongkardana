package com.iap.ac.android.container.adapter.griver.extension;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.menu.GriverACMenuExtension;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import com.alibaba.griver.api.common.menu.OnMenuItemClickListener;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem;
import com.alibaba.griver.core.ui.menu.GRVNotificationBoxMenuItem;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.provider.ui.AppFavoriteStatus;
import com.iap.ac.android.common.container.provider.ui.ContainerMenuDataChangeListener;
import com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType;
import com.iap.ac.android.common.container.provider.ui.ContainerUIProvider;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.adapter.griver.event.AppEventHandler;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomMenuExtensionImpl implements GriverACMenuExtension {
    private static final String TAG = "CustomMenuExtensionImpl";
    public static final String TYPE_FAVORITE = "Favorite";
    public static final String TYPE_NOTIFICATION = "Notification";
    /* access modifiers changed from: private */
    public static Map<String, GriverMenuItem> menuItemMap = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public ContainerUIProvider provider;

    public CustomMenuExtensionImpl(ContainerUIProvider containerUIProvider) {
        this.provider = containerUIProvider;
        containerUIProvider.addMenuDataChangeListener(new ContainerMenuDataChangeListener() {
            public void onMenuDataChange(String str, Bundle bundle) {
                GriverMenuItem access$100;
                int i = AnonymousClass6.$SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType[ContainerMoreMenuItemType.parseValue(bundle.getInt(ContainerUIProvider.KEY_MENU_TYPE)).ordinal()];
                if (i == 1) {
                    GriverMenuItem access$000 = CustomMenuExtensionImpl.this.getFavoriteMenuItem(str);
                    if (access$000 != null) {
                        GRVAppFavoriteMenuItem gRVAppFavoriteMenuItem = (GRVAppFavoriteMenuItem) access$000;
                        AppFavoriteStatus parseValue = AppFavoriteStatus.parseValue(bundle.getInt(ContainerUIProvider.KEY_FAVORITE_STATUS));
                        if (parseValue == AppFavoriteStatus.Unknow) {
                            gRVAppFavoriteMenuItem.status = GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusUnKnow;
                        } else if (parseValue == AppFavoriteStatus.Collected) {
                            gRVAppFavoriteMenuItem.status = GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusCollected;
                        } else if (parseValue == AppFavoriteStatus.Uncollected) {
                            gRVAppFavoriteMenuItem.status = GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusUncollected;
                        }
                        gRVAppFavoriteMenuItem.notifyDataSetChanged();
                    }
                } else if (i == 2 && (access$100 = CustomMenuExtensionImpl.this.getNotificationMenuItem(str)) != null) {
                    GRVNotificationBoxMenuItem gRVNotificationBoxMenuItem = (GRVNotificationBoxMenuItem) access$100;
                    gRVNotificationBoxMenuItem.showBadge = bundle.getBoolean("redDot");
                    gRVNotificationBoxMenuItem.notifyDataSetChanged();
                }
            }
        });
        AppEventHandler.addContainerListener(new IContainerListener() {
            public void onContainerCreated(@NonNull Bundle bundle) {
            }

            public void onContainerDestroyed(@NonNull Bundle bundle) {
                String string = bundle.getString("appId");
                if (!TextUtils.isEmpty(string)) {
                    Map access$200 = CustomMenuExtensionImpl.menuItemMap;
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append("Notification");
                    access$200.remove(sb.toString());
                    Map access$2002 = CustomMenuExtensionImpl.menuItemMap;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(CustomMenuExtensionImpl.TYPE_FAVORITE);
                    access$2002.remove(sb2.toString());
                }
            }
        });
    }

    /* renamed from: com.iap.ac.android.container.adapter.griver.extension.CustomMenuExtensionImpl$6  reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType[] r0 = com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType = r0
                com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType r1 = com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType.Favorite     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$container$provider$ui$ContainerMoreMenuItemType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType r1 = com.iap.ac.android.common.container.provider.ui.ContainerMoreMenuItemType.Notification     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.adapter.griver.extension.CustomMenuExtensionImpl.AnonymousClass6.<clinit>():void");
        }
    }

    public List<GriverMenuItem> getMenuList(Page page) {
        String appId = page.getApp().getAppId();
        LinkedList linkedList = new LinkedList();
        GriverMenuItem favoriteMenuItem = getFavoriteMenuItem(appId);
        if (favoriteMenuItem != null) {
            linkedList.add(favoriteMenuItem);
        }
        GriverMenuItem notificationMenuItem = getNotificationMenuItem(appId);
        if (notificationMenuItem != null) {
            linkedList.add(notificationMenuItem);
        }
        GriverMenuItem feedbackMenuItem = getFeedbackMenuItem(appId);
        if (feedbackMenuItem != null) {
            linkedList.add(feedbackMenuItem);
        }
        return linkedList;
    }

    /* access modifiers changed from: private */
    public GriverMenuItem getNotificationMenuItem(String str) {
        ContainerUIProvider containerUIProvider = this.provider;
        if (containerUIProvider == null) {
            ACLog.e(TAG, "ContainerUIProvider#getNotificationMenuItem is null.");
            return null;
        } else if (!containerUIProvider.itemShowFilter(str, ContainerMoreMenuItemType.Notification)) {
            ACLog.e(TAG, "ContainerUIProvider#getNotificationMenuItem Notification menu toggle is false.");
            return null;
        } else {
            Map<String, GriverMenuItem> map = menuItemMap;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("Notification");
            GriverMenuItem griverMenuItem = map.get(sb.toString());
            if (griverMenuItem == null) {
                griverMenuItem = new GRVNotificationBoxMenuItem();
                final GRVNotificationBoxMenuItem gRVNotificationBoxMenuItem = (GRVNotificationBoxMenuItem) griverMenuItem;
                if (this.provider.itemShowRedDot(str, ContainerMoreMenuItemType.Notification)) {
                    gRVNotificationBoxMenuItem.enableBadge(str);
                }
                gRVNotificationBoxMenuItem.listener = new OnMenuItemClickListener() {
                    public void onItemClick(Page page, String str) {
                        String appId = page.getApp().getAppId();
                        AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
                        CustomMenuExtensionImpl.this.provider.onContainerNotificationMenuClick(appId, (appModel == null || appModel.getAppInfoModel() == null) ? "" : appModel.getAppInfoModel().getName(), new Bundle());
                        gRVNotificationBoxMenuItem.notifyDataSetChanged();
                    }
                };
                Map<String, GriverMenuItem> map2 = menuItemMap;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("Notification");
                map2.put(sb2.toString(), griverMenuItem);
            }
            return griverMenuItem;
        }
    }

    /* access modifiers changed from: private */
    public GriverMenuItem getFavoriteMenuItem(String str) {
        ContainerUIProvider containerUIProvider = this.provider;
        if (containerUIProvider == null) {
            ACLog.e(TAG, "ContainerUIProvider#getFavoriteMenuItem is null.");
            return null;
        } else if (!containerUIProvider.itemShowFilter(str, ContainerMoreMenuItemType.Favorite)) {
            ACLog.e(TAG, "ContainerUIProvider#getFavoriteMenuItem Favorite menu toggle is false.");
            return null;
        } else {
            Map<String, GriverMenuItem> map = menuItemMap;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(TYPE_FAVORITE);
            GriverMenuItem griverMenuItem = map.get(sb.toString());
            if (griverMenuItem == null) {
                griverMenuItem = new GRVAppFavoriteMenuItem();
                final GRVAppFavoriteMenuItem gRVAppFavoriteMenuItem = (GRVAppFavoriteMenuItem) griverMenuItem;
                if (this.provider.itemShowRedDot(str, ContainerMoreMenuItemType.Favorite)) {
                    gRVAppFavoriteMenuItem.enableBadge(str);
                }
                gRVAppFavoriteMenuItem.listener = new OnMenuItemClickListener() {
                    public void onItemClick(Page page, String str) {
                        AppFavoriteStatus appFavoriteStatus;
                        String appId = page.getApp().getAppId();
                        AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
                        String name = (appModel == null || appModel.getAppInfoModel() == null) ? "" : appModel.getAppInfoModel().getName();
                        GRVAppFavoriteMenuItem.Status status = gRVAppFavoriteMenuItem.status;
                        if (status == GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusCollected) {
                            appFavoriteStatus = AppFavoriteStatus.Collected;
                            PageContext pageContext = page.getPageContext();
                            if (!(pageContext == null || pageContext.getActivity() == null)) {
                                ToastUtils.showToast(pageContext.getActivity(), "Removed", "success", 0);
                            }
                        } else if (status == GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusUncollected) {
                            appFavoriteStatus = AppFavoriteStatus.Uncollected;
                            PageContext pageContext2 = page.getPageContext();
                            if (!(pageContext2 == null || pageContext2.getActivity() == null)) {
                                ToastUtils.showToast(pageContext2.getActivity(), "Added", "success", 0);
                            }
                        } else {
                            appFavoriteStatus = AppFavoriteStatus.Unknow;
                        }
                        CustomMenuExtensionImpl.this.provider.onContainerFavoriteMenuClick(appId, name, appFavoriteStatus, new Bundle());
                        gRVAppFavoriteMenuItem.notifyDataSetChanged();
                    }
                };
                Map<String, GriverMenuItem> map2 = menuItemMap;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(TYPE_FAVORITE);
                map2.put(sb2.toString(), griverMenuItem);
            }
            return griverMenuItem;
        }
    }

    private GriverMenuItem getFeedbackMenuItem(String str) {
        ContainerUIProvider containerUIProvider = this.provider;
        if (containerUIProvider == null) {
            ACLog.e(TAG, "ContainerUIProvider#getFeedbackMenuItem is null.");
            return null;
        } else if (!containerUIProvider.itemShowFilter(str, ContainerMoreMenuItemType.Feedback)) {
            ACLog.e(TAG, "ContainerUIProvider#getFeedbackMenuItem Feedback menu toggle is false.");
            return null;
        } else {
            CustomFeedBackMenu customFeedBackMenu = new CustomFeedBackMenu();
            customFeedBackMenu.listener = new OnMenuItemClickListener() {
                public void onItemClick(Page page, String str) {
                    String appId = page.getApp().getAppId();
                    AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
                    CustomMenuExtensionImpl.this.provider.onContainerFeedbackMenuClick(appId, (appModel == null || appModel.getAppInfoModel() == null) ? "" : appModel.getAppInfoModel().getName(), new Bundle());
                }
            };
            return customFeedBackMenu;
        }
    }
}
