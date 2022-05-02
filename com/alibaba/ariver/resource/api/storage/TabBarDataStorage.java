package com.alibaba.ariver.resource.api.storage;

import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;

public class TabBarDataStorage {

    /* renamed from: a  reason: collision with root package name */
    private TabBarModel f10179a;
    private Listener b = null;

    public interface Listener {
        void onGetData(TabBarModel tabBarModel);
    }

    public synchronized boolean hasData() {
        return this.f10179a != null;
    }

    public synchronized void onGetData(TabBarModel tabBarModel) {
        this.f10179a = tabBarModel;
        if (this.b != null) {
            this.b.onGetData(tabBarModel);
            this.b = null;
        }
    }

    public synchronized void retrieveData(Listener listener) {
        if (this.f10179a != null) {
            listener.onGetData(this.f10179a);
        } else {
            this.b = listener;
        }
    }
}
