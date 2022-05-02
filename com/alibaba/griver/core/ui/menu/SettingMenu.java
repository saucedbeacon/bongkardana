package com.alibaba.griver.core.ui.menu;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.menu.GriverBaseMenuItem;
import com.alibaba.griver.api.common.menu.OnMenuItemClickListener;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.core.R;
import com.alibaba.griver.device.proxy.GriverOpenSettingExtension;
import java.util.Map;

public class SettingMenu extends GriverBaseMenuItem {
    public SettingMenu() {
        this.identifier = "Setting";
        this.name = "Setting";
        this.row = 2;
        this.iconDrawable = R.drawable.griver_core_menu_settings;
        this.listener = new OnMenuItemClickListener() {
            public void onItemClick(Page page, String str) {
                App app = page.getApp();
                ((GriverOpenSettingExtension) RVProxy.get(GriverOpenSettingExtension.class)).showOpenSettingView(app.getActivePage().getPageContext().getActivity(), ((AuthenticationProxy) RVProxy.get(AuthenticationProxy.class)).getAllPermissions(GriverAccount.getUserId(), app.getAppId(), (AppModel) null, app.getActivePage()), (AppModel) app.getData(AppModel.class), new GriverOpenSettingExtension.SettingChangeCallback() {
                    public void onSettingChange(Map<String, Boolean> map) {
                    }
                });
            }
        };
    }
}
