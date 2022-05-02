package com.alibaba.ariver.integration.ipc.server.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.BaseRenderImpl;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.bridge.RenderBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.ScrollChangedCallback;
import com.alibaba.ariver.kernel.api.node.DataNode;

public class c extends BaseRenderImpl {
    @Nullable
    public Bitmap getCapture(int i) {
        return null;
    }

    public int getPageId() {
        return 0;
    }

    public RenderBridge getRenderBridge() {
        return null;
    }

    public int getScrollY() {
        return 0;
    }

    public View getView() {
        return null;
    }

    public void init() {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void setScrollChangedCallback(ScrollChangedCallback scrollChangedCallback) {
    }

    public void showErrorView(View view) {
    }

    public c(RVEngine rVEngine, Activity activity, DataNode dataNode, CreateParams createParams) {
        super(rVEngine, activity, dataNode, createParams);
    }
}
