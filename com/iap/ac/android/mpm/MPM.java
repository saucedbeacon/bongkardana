package com.iap.ac.android.mpm;

import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.container.IContainer;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.provider.ContainerUaProvider;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;
import com.iap.ac.android.common.container.utils.ContainerUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.ACContainer;
import com.iap.ac.android.container.adapter.appcontainer.AppContainerImpl;
import com.iap.ac.android.container.adapter.griver.GriverContainerImpl;
import com.iap.ac.android.l0.a;
import com.iap.ac.android.mpm.interceptor.jsapi.TradePayPlugin;
import com.iap.ac.android.mpm.interceptor.provider.UAProvider;

public enum MPM {
    INSTANCE;
    

    /* renamed from: a  reason: collision with root package name */
    public boolean f9750a;

    public static MPM get() {
        return INSTANCE;
    }

    public final boolean a() {
        return ConfigCenter.INSTANCE.getACContainerToggle();
    }

    public final String getCnAcquireId() {
        return "1022088000000000001";
    }

    public final void initContainer() {
        if (!this.f9750a) {
            ACLog.i(Constants.TAG, "initContainer begin");
            if (Utils.checkClassExist("com.iap.ac.android.container.adapter.griver.GriverContainerImpl")) {
                ACLog.i(Constants.TAG, "initContainer using Griver");
                WebContainer.INSTANCE.setContainer(new GriverContainerImpl(), "ac_biz");
            } else if (ContainerUtils.isACContainerExist() && a()) {
                ACLog.i(Constants.TAG, "initContainer using ACContainer");
                WebContainer.INSTANCE.setContainer(ACContainer.INSTANCE, "ac_biz");
                WebContainer.getInstance("ac_biz").setProvider(JsApiPermissionProvider.class.getName(), new a());
            } else if (ContainerUtils.isAppContainerExist()) {
                ACLog.i(Constants.TAG, "initContainer using AppContainer");
                WebContainer.INSTANCE.setContainer(new AppContainerImpl(), "ac_biz");
            } else {
                ACLog.e(Constants.TAG, "initContainer: No container implementation found!");
            }
            IContainer instance = WebContainer.getInstance("ac_biz");
            if (instance != null) {
                instance.registerJSAPIPlugin(new TradePayPlugin());
                instance.registerPlugin(new com.iap.ac.android.k0.a());
                instance.setProvider(ContainerUaProvider.class.getName(), new UAProvider());
            }
            this.f9750a = true;
        }
    }
}
