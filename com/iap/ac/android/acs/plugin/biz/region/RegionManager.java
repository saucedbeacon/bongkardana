package com.iap.ac.android.acs.plugin.biz.region;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.biz.region.config.RegionRPCConfigCenter;
import com.iap.ac.android.acs.plugin.biz.region.foundation.RegionFoundationProxy;
import com.iap.ac.android.acs.plugin.biz.region.menu.RegionMenuProvider;
import com.iap.ac.android.acs.plugin.biz.region.miniprogram.MiniProgramOpenContainerListener;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.FetchLaunchableGroupsCallback;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.LaunchableGroupManager;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableGroup;
import com.iap.ac.android.acs.plugin.biz.region.utils.RegionUtils;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.biz.common.proxy.common.CommonRegionNetworkProxy;
import com.iap.ac.android.biz.common.proxy.common.NetworkProxy;
import com.iap.ac.android.biz.common.proxy.common.ProxyScene;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.provider.ui.ContainerUIProvider;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;
import java.util.Map;

public class RegionManager implements IRegionManager {
    private static volatile IRegionManager mInstance;
    private Context application;
    private boolean isInit = false;
    /* access modifiers changed from: private */
    public MiniProgramOpenContainerListener miniProgramOpenContainerListener = new MiniProgramOpenContainerListener();
    /* access modifiers changed from: private */
    public RegionMenuProvider provider = new RegionMenuProvider();

    public static IRegionManager getInstance() {
        if (mInstance == null) {
            synchronized (RegionManager.class) {
                if (mInstance == null) {
                    mInstance = new RegionManager();
                }
            }
        }
        return mInstance;
    }

    public void initRegion(Context context, InitConfig initConfig) {
        ACLog.i(RegionConstants.TAG, "initRegion begin");
        if (!this.isInit || !RegionRPCConfigCenter.INSTANCE.getRegionBizToggle()) {
            this.isInit = true;
            this.application = context;
            RegionFoundationProxy.getInstance().init(context, ACManager.getInstance().getCommonConfig());
            NetworkProxy commonNetworkProxy = initConfig.getCommonNetworkProxy(ProxyScene.PROXY_SCENE_MINI_PROGRAM);
            if (commonNetworkProxy != null && RegionRPCConfigCenter.INSTANCE.isAllowRegisterCommonNetwork()) {
                CommonRegionNetworkProxy.getInstance().setHttpTransporter(ProxyScene.PROXY_SCENE_MINI_PROGRAM, commonNetworkProxy);
            }
            WebContainer.getInstance("ac_biz").setProvider(ContainerUIProvider.class.getName(), this.provider);
            WebContainer.getInstance("ac_biz").registerContainerListener(new IContainerListener() {
                public void onContainerCreated(@NonNull Bundle bundle) {
                    RegionManager.this.miniProgramOpenContainerListener.onContainerCreated(bundle);
                    RegionManager.this.provider.onContainerCreated(bundle);
                }

                public void onContainerDestroyed(@NonNull Bundle bundle) {
                    RegionManager.this.miniProgramOpenContainerListener.onContainerDestroyed(bundle);
                    RegionManager.this.provider.onContainerDestroyed(bundle);
                }
            });
        }
    }

    public Context getContext() {
        return this.application;
    }

    public boolean isRegionMiniProgram(String str, String str2) {
        return RegionUtils.isRegionMiniProgram(str, str2);
    }

    public void fetchLaunchableGroupsWithCodes(List<String> list, FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        if (this.isInit) {
            LaunchableGroupManager.getInstance().fetchLaunchableGroupsWithCodes(list, fetchLaunchableGroupsCallback);
        }
    }
}
