package com.alibaba.griver.core.ui.menu;

import android.content.Intent;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuPanelExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.iap.ac.android.container.constant.ContainerKeys;
import java.util.List;
import o.restorePresenterStates;

@Keep
public class GriverOptionMenuPanelExtensionImpl implements GriverOptionMenuPanelExtension {
    public void showOptionMenuPanel(Page page, List<GriverMenuItem> list) {
        Intent intent = new Intent("show_title_bar_menu");
        intent.putExtra("appId", page.getApp().getAppId());
        intent.putExtra(ContainerKeys.PARAM_PAGE_ID, page.getPageId());
        restorePresenterStates.length(GriverEnv.getApplicationContext()).setMin(intent);
    }
}
