package com.alibaba.ariver.app.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.kernel.api.annotation.Local;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.node.ValueStore;
import com.alibaba.fastjson.JSONObject;

public interface Page extends DataNode, Scope, ValueStore {

    public static class AnimStore {
        public boolean disableEnter = false;
        public boolean disableExit = false;
    }

    public interface ExitListener {
        void onExit();
    }

    public interface RenderReadyListener {
        void onRenderReady();
    }

    void addRenderReadyListener(RenderReadyListener renderReadyListener);

    boolean backPressed();

    void bindContext(PageContext pageContext);

    void destroy();

    void enter();

    void exit(boolean z);

    @Local
    App getApp();

    EmbedType getEmbedType();

    ExtensionManager getExtensionManager();

    @Local
    String getOriginalURI();

    @Nullable
    PageContext getPageContext();

    int getPageId();

    @Local
    String getPageType();

    String getPageURI();

    Render getRender();

    @Local
    Bundle getSceneParams();

    @Local
    Bundle getStartParams();

    void hide();

    boolean isDestroyed();

    boolean isExited();

    boolean isPageLoaded();

    boolean isRenderReady();

    boolean isShadowNode();

    boolean isUseForEmbed();

    void pause();

    void resume();

    void setExitListener(ExitListener exitListener);

    void setPageLoaded();

    void show(@Nullable JSONObject jSONObject);
}
