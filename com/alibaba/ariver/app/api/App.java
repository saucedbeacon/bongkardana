package com.alibaba.ariver.app.api;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.kernel.api.annotation.Local;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.node.ValueStore;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import com.alibaba.fastjson.JSONObject;

public interface App extends DataNode, Scope, ValueStore {

    public interface PageReadyListener {
        void onPageReady(Page page);
    }

    void addPageReadyListener(PageReadyListener pageReadyListener);

    boolean backPressed();

    void bindContext(AppContext appContext);

    void exit();

    @Nullable
    Page getActivePage();

    int getAlivePageCount();

    @Nullable
    AppContext getAppContext();

    @Local
    String getAppId();

    @Local
    String getAppType();

    @Local
    String getAppVersion();

    RVEngine getEngineProxy();

    ExtensionManager getExtensionManager();

    IpcMessageHandler getMsgHandler();

    Page getPageByIndex(int i);

    Page getPageByNodeId(long j);

    @Local
    Bundle getSceneParams();

    @Local
    Bundle getStartParams();

    @Local
    long getStartToken();

    @Local
    String getStartUrl();

    void init(String str, Bundle bundle, Bundle bundle2);

    boolean isDestroyed();

    boolean isExited();

    boolean isFirstPage();

    boolean isShadowNode();

    boolean isTinyApp();

    void onConfigurationChanged(Configuration configuration);

    void onUserInteraction();

    void onUserLeaveHint();

    void pause();

    void performBack();

    void popPage(@Nullable JSONObject jSONObject);

    void popTo(int i, boolean z, @Nullable JSONObject jSONObject);

    Page preCreatePage();

    boolean pushPage(String str, Bundle bundle, Bundle bundle2);

    void relaunchToUrl(String str, Bundle bundle, Bundle bundle2);

    void removePage(Page page, boolean z);

    void restart(Bundle bundle, Bundle bundle2);

    void restartFromServer(@Nullable Bundle bundle);

    void resume();

    void setAppType(String str);

    void start();

    @Keep
    public static class ResumeParams {
        public JSONObject data;

        public ResumeParams(JSONObject jSONObject) {
            this.data = jSONObject;
        }
    }

    @Keep
    public static class PopParams {
        public JSONObject data;

        public PopParams(JSONObject jSONObject) {
            this.data = jSONObject;
        }
    }
}
