package com.alibaba.ariver.engine.api.common;

import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.ExitCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public abstract class CommonExitPerform {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f8976a = "AriverEngine:CommonExitPerform";
    /* access modifiers changed from: private */
    public CollectJsApiHandler b;
    private Render c;

    /* access modifiers changed from: protected */
    public abstract void checkDslErrorAndExit(ExitCallback exitCallback);

    /* access modifiers changed from: protected */
    public abstract void handleCollectedApi(String str, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract boolean needCheckDslError();

    /* access modifiers changed from: protected */
    public abstract boolean needCollectDestroyJsApi();

    public CommonExitPerform(Render render) {
        this.c = render;
    }

    public void runExit(ExitCallback exitCallback) {
        if (needCollectDestroyJsApi()) {
            a(exitCallback);
        } else if (needCheckDslError()) {
            checkDslErrorAndExit(exitCallback);
        } else {
            exitCallback.afterProcess(false);
        }
    }

    private void a(final ExitCallback exitCallback) {
        if (this.b == null && this.c != null) {
            CollectJsApiHandler collectJsApiHandler = new CollectJsApiHandler();
            this.b = collectJsApiHandler;
            collectJsApiHandler.waiting = true;
            this.b.exitCallback = exitCallback;
            EngineUtils.sendToRender(this.c, RVEvents.COLLECT_DESTROY_API, (JSONObject) null, this.b);
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (CommonExitPerform.this.b != null && CommonExitPerform.this.b.waiting) {
                        RVLogger.d(CommonExitPerform.this.f8976a, "collectJsApiHandler overtime, do exit");
                        exitCallback.afterProcess(false);
                    }
                }
            }, 1000);
        }
    }

    class CollectJsApiHandler implements SendToRenderCallback {
        public ExitCallback exitCallback;
        public boolean waiting = false;

        public CollectJsApiHandler() {
        }

        public void onCallBack(JSONObject jSONObject) {
            this.waiting = false;
            RVLogger.d(CommonExitPerform.this.f8976a, "collectJsApi param : ".concat(String.valueOf(jSONObject)));
            JSONArray jSONArray = JSONUtils.getJSONArray(jSONObject, "syncJsApis", (JSONArray) null);
            if (jSONArray != null && !jSONArray.isEmpty()) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        CommonExitPerform.this.handleCollectedApi(JSONUtils.getString(jSONObject2, "apiName"), JSONUtils.getJSONObject(jSONObject2, "params", (JSONObject) null));
                    }
                }
            }
            if (CommonExitPerform.this.needCheckDslError()) {
                CommonExitPerform.this.checkDslErrorAndExit(this.exitCallback);
            } else {
                this.exitCallback.afterProcess(false);
            }
        }
    }
}
