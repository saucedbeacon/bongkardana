package com.alibaba.griver.core.ui.menu;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.menu.GriverBaseMenuItem;
import com.alibaba.griver.api.common.menu.OnMenuItemClickListener;
import com.alibaba.griver.api.ui.share.GriverShareSchemeExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.R;

public class ShareMenu extends GriverBaseMenuItem {
    public ShareMenu() {
        this.name = "Share";
        this.identifier = "Share";
        this.row = 1;
        this.iconDrawable = R.drawable.griver_core_menu_grv_share;
        this.listener = new OnMenuItemClickListener() {
            public void onItemClick(Page page, String str) {
                JSONObject jSONObject = new JSONObject();
                page.putStringValue("from", "menu");
                EngineUtils.sendToRender(page.getRender(), "onShare", jSONObject, (SendToRenderCallback) null);
            }
        };
    }

    public boolean canShow(Page page) {
        if (!TextUtils.isEmpty(((GriverShareSchemeExtension) RVProxy.get(GriverShareSchemeExtension.class)).getScheme())) {
            return true;
        }
        GriverLogger.w("ShareMenu", "share scheme is not integrated, do not show");
        return false;
    }
}
