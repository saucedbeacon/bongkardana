package com.alibaba.griver.core.ui.menu;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItem;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItemPriority;
import com.alibaba.griver.core.R;
import com.iap.ac.android.acs.plugin.biz.region.bean.MenuExtraInfo;

public class GRVNotificationBoxMenuItem extends GRVMPMoreMenuItem {
    public boolean canShow(Page page) {
        return true;
    }

    public GRVNotificationBoxMenuItem() {
        this.name = "Notification";
        this.identifier = MenuExtraInfo.MENU_ID_NOTIFICATION;
        this.row = 1;
        this.priority = GRVMPMoreMenuItemPriority.GRVMPMoreMenuItemPriorityHigh;
        this.iconDrawable = R.drawable.griver_core_menu_notification;
    }
}
