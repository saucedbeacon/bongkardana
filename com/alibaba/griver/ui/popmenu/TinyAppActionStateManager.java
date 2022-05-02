package com.alibaba.griver.ui.popmenu;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TinyAppActionStateManager {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, TinyAppActionStateController> f10592a;

    private TinyAppActionStateManager() {
        this.f10592a = new ConcurrentHashMap();
    }

    public static TinyAppActionStateManager getInstance() {
        return Holder.f10593a;
    }

    public void registerStateListener(Page page, TinyAppActionStateListener tinyAppActionStateListener) {
        if (tinyAppActionStateListener != null && page != null) {
            TinyAppActionStateController tinyAppActionStateController = this.f10592a.get(Integer.valueOf(page.getPageId()));
            if (tinyAppActionStateController == null) {
                tinyAppActionStateController = new TinyAppActionStateController();
                this.f10592a.put(Integer.valueOf(page.getPageId()), tinyAppActionStateController);
            }
            tinyAppActionStateController.registerListener(tinyAppActionStateListener);
        }
    }

    public void setActionOn(Page page, String str) {
        setActionOn(page, str, "");
    }

    public void setActionOff(Page page, String str) {
        setActionOff(page, str, "");
    }

    public void setActionOn(Page page, String str, String str2) {
        TinyAppActionStateController tinyAppActionStateController;
        if (page != null && !TextUtils.isEmpty(str) && (tinyAppActionStateController = this.f10592a.get(Integer.valueOf(page.getPageId()))) != null) {
            tinyAppActionStateController.setStateOn(str, str2);
        }
    }

    public void removeAction(Page page, String str) {
        TinyAppActionStateController tinyAppActionStateController;
        if (page != null && !TextUtils.isEmpty(str) && (tinyAppActionStateController = this.f10592a.get(Integer.valueOf(page.getPageId()))) != null) {
            tinyAppActionStateController.removeAction(str);
        }
    }

    public void setActionOff(Page page, String str, String str2) {
        TinyAppActionStateController tinyAppActionStateController;
        if (page != null && !TextUtils.isEmpty(str) && (tinyAppActionStateController = this.f10592a.get(Integer.valueOf(page.getPageId()))) != null) {
            tinyAppActionStateController.setStateOff(str, str2);
        }
    }

    public TinyAppActionState getCurrentState(Page page) {
        TinyAppActionStateController tinyAppActionStateController;
        if (page == null || (tinyAppActionStateController = this.f10592a.get(Integer.valueOf(page.getPageId()))) == null) {
            return null;
        }
        return tinyAppActionStateController.getCurrentState();
    }

    public void destroy(Page page) {
        TinyAppActionStateController remove;
        if (page != null && (remove = this.f10592a.remove(Integer.valueOf(page.getPageId()))) != null) {
            remove.destroy();
        }
    }

    static class Holder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static TinyAppActionStateManager f10593a = new TinyAppActionStateManager();

        private Holder() {
        }
    }
}
