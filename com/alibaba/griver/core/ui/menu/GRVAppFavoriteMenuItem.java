package com.alibaba.griver.core.ui.menu;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItem;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItemPriority;
import com.alibaba.griver.core.R;
import com.iap.ac.android.acs.plugin.biz.region.bean.MenuExtraInfo;
import id.dana.tracker.mixpanel.RegistrationEvent;

public class GRVAppFavoriteMenuItem extends GRVMPMoreMenuItem {
    public Status status = Status.GRVAppFavoriteStatusUnKnow;

    public enum Status {
        GRVAppFavoriteStatusUnKnow(-1),
        GRVAppFavoriteStatusUncollected(0),
        GRVAppFavoriteStatusCollected(1);
        
        int value;

        private Status(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public final Status parseValue(int i) {
            Status status = GRVAppFavoriteStatusUnKnow;
            if (i == -1) {
                return status;
            }
            if (i == 0) {
                return GRVAppFavoriteStatusUncollected;
            }
            if (i != 1) {
                return status;
            }
            return GRVAppFavoriteStatusCollected;
        }
    }

    public GRVAppFavoriteMenuItem() {
        this.identifier = MenuExtraInfo.MENU_ID_COLLECT;
        this.priority = GRVMPMoreMenuItemPriority.GRVMPMoreMenuItemPriorityHigh;
        a(this.status);
        this.row = 1;
    }

    /* renamed from: com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$griver$core$ui$menu$GRVAppFavoriteMenuItem$Status;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem$Status[] r0 = com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$griver$core$ui$menu$GRVAppFavoriteMenuItem$Status = r0
                com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem$Status r1 = com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusUnKnow     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$griver$core$ui$menu$GRVAppFavoriteMenuItem$Status     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem$Status r1 = com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusCollected     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$griver$core$ui$menu$GRVAppFavoriteMenuItem$Status     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem$Status r1 = com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem.Status.GRVAppFavoriteStatusUncollected     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.menu.GRVAppFavoriteMenuItem.AnonymousClass1.<clinit>():void");
        }
    }

    private void a(Status status2) {
        this.status = status2;
        int i = AnonymousClass1.$SwitchMap$com$alibaba$griver$core$ui$menu$GRVAppFavoriteMenuItem$Status[status2.ordinal()];
        if (i == 1) {
            this.name = RegistrationEvent.ProfilePhotoSource.NO_ANSWER;
            this.iconDrawable = R.drawable.griver_core_menu_favorites_error;
        } else if (i == 2) {
            this.name = "Remove\nfrom Favorites";
            this.iconDrawable = R.drawable.griver_core_menu_favorites_remove;
        } else if (i == 3) {
            this.name = "Add to\nFavorites";
            this.iconDrawable = R.drawable.griver_core_menu_favorites_add;
        }
    }

    public void notifyDataSetChanged() {
        a(this.status);
        super.notifyDataSetChanged();
    }

    public boolean canShow(Page page) {
        return this.status != Status.GRVAppFavoriteStatusUnKnow;
    }
}
