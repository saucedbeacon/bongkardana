package com.alibaba.griver.h5.extension;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.constants.GriverEvents;
import com.alibaba.griver.api.h5.point.GriverOptionMenuClickPoint;
import com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuEvent;
import com.alibaba.griver.api.ui.optionmenu.ToolbarMenu;
import java.lang.ref.WeakReference;

public class GriverOptionMenuClickExtension implements NodeAware<Page>, GriverOptionMenuClickPoint {
    WeakReference<Page> pageWeakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.pageWeakReference = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    public void menuClick(JSONObject jSONObject) {
        WeakReference<Page> weakReference = this.pageWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            Page page = this.pageWeakReference.get();
            if (TextUtils.equals("popmenu", jSONObject.getString("popMenuType"))) {
                EngineUtils.sendToRender(page.getRender(), GriverEvents.EVENT_OPTION_MENU_CLICK_POP_TYPE, jSONObject, (SendToRenderCallback) null);
                return;
            }
            if (BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false)) {
                ToolbarMenu toolbarMenu = new ToolbarMenu();
                toolbarMenu.setName(jSONObject.getString("name"));
                toolbarMenu.setIcon(jSONObject.getString("icon"));
                toolbarMenu.setTag(jSONObject.getString("tag"));
                ExtensionPoint.as(GriverOptionMenuEvent.class).node(page).create().toolbarMenuClicked(page.getOriginalURI(), toolbarMenu);
            }
            EngineUtils.sendToRender(page.getRender(), GriverEvents.EVENT_OPTION_MENU_CLICK_TOOLBAR_TYPE, jSONObject, (SendToRenderCallback) null);
        }
    }
}
