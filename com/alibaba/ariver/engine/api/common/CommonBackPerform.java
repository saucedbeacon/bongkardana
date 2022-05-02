package com.alibaba.ariver.engine.api.common;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.extensions.back.BackInterceptPoint;
import com.alibaba.ariver.engine.api.point.PageBackInterceptPoint;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public abstract class CommonBackPerform {
    public static int BACK = 1;
    public static int FINISHED = 4;
    public static int NONE;
    public static int POP;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f8975a = "AriverEngine:BackPerform";
    /* access modifiers changed from: private */
    public BackHandler b = new BackHandler();
    protected int backBehavior;
    private int c = NONE;
    /* access modifiers changed from: private */
    public Render d;
    private PageBackInterceptPoint e;
    /* access modifiers changed from: private */
    public Boolean f = null;

    /* access modifiers changed from: protected */
    public abstract void performBack(GoBackCallback goBackCallback);

    public CommonBackPerform(Render render) {
        this.d = render;
        this.e = ExtensionPoint.as(PageBackInterceptPoint.class).node(this.d.getPage()).create();
    }

    public boolean enableInterceptBack(Render render) {
        return a(this.d.getAppId(), JSONUtils.getJSONArray(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_eventThroughWorker"), "back", (JSONArray) null));
    }

    private boolean a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return false;
        }
        String str2 = this.f8975a;
        StringBuilder sb = new StringBuilder("isAppIdInWhiteList, appId = ");
        sb.append(str);
        sb.append(", appIdWhiteList = ");
        sb.append(jSONArray);
        RVLogger.d(str2, sb.toString());
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (TextUtils.equals(string, ".*") || TextUtils.equals(string, str)) {
                return true;
            }
        }
        return false;
    }

    public void setBackBehavior(String str) {
        RVLogger.d(this.f8975a, "setBackBehavior ".concat(String.valueOf(str)));
        if (RVStartParams.BACK_BEHAVIOR_POP.equals(str)) {
            this.backBehavior = POP;
        } else {
            this.backBehavior = BACK;
        }
    }

    public void updatePageStatus(int i) {
        this.c = i;
    }

    public void goBack(GoBackCallback goBackCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        BackInterceptPoint create = ExtensionPoint.as(BackInterceptPoint.class).node(this.d.getPage()).create();
        if (create == null || !create.intercepted(this.d, this.c, this.b, goBackCallback)) {
            boolean z = false;
            boolean z2 = this.c == FINISHED && !this.b.waiting;
            boolean z3 = currentTimeMillis - this.b.lastBack > 500;
            if (!z2 || !z3) {
                z = true;
            }
            if (!z) {
                RVLogger.d(this.f8975a, "send back event to bridge!");
                this.b.waiting = true;
                this.b.lastBack = currentTimeMillis;
                this.b.setGoBackCallback(goBackCallback);
                a(goBackCallback);
                return;
            }
            RVLogger.d(this.f8975a, "ignore bridge, perform goBack!");
            performBack(goBackCallback);
            return;
        }
        String str = this.f8975a;
        StringBuilder sb = new StringBuilder("goBack has been intercepted by ");
        sb.append(create.getClass().getName());
        RVLogger.d(str, sb.toString());
    }

    private void a(final GoBackCallback goBackCallback) {
        if (this.e.interceptBackEvent(new GoBackCallback() {
            public void afterProcess(boolean z) {
                if (!z) {
                    CommonBackPerform.this.performBack(goBackCallback);
                } else {
                    RVLogger.d(CommonBackPerform.this.f8975a, "sendBackEvent prevented!");
                }
            }
        })) {
            this.b.waiting = false;
        } else {
            EngineUtils.sendToRender(this.d, "back", (JSONObject) null, new SendToRenderCallback() {
                public void onCallBack(JSONObject jSONObject) {
                    if (CommonBackPerform.this.b != null) {
                        CommonBackPerform.this.b.onCallBack(jSONObject);
                    }
                }
            });
        }
    }

    public class BackHandler implements SendToRenderCallback {
        public GoBackCallback callback;
        public long lastBack = 0;
        public boolean waiting = false;

        public BackHandler() {
        }

        public void setGoBackCallback(GoBackCallback goBackCallback) {
            this.callback = goBackCallback;
        }

        public void onCallBack(JSONObject jSONObject) {
            boolean z = false;
            this.waiting = false;
            if (CommonBackPerform.this.f == null) {
                CommonBackPerform commonBackPerform = CommonBackPerform.this;
                Boolean unused = commonBackPerform.f = Boolean.valueOf(commonBackPerform.enableInterceptBack(commonBackPerform.d));
            }
            if (JSONUtils.getBoolean(jSONObject, "prevent", false) || JSONUtils.getBoolean(jSONObject, RVConstants.EXTRA_PREVENTED, false)) {
                z = true;
            }
            String access$000 = CommonBackPerform.this.f8975a;
            StringBuilder sb = new StringBuilder("goBack event prevent ");
            sb.append(z);
            sb.append(" with cfgOpen: ");
            sb.append(CommonBackPerform.this.f);
            RVLogger.d(access$000, sb.toString());
            if (!z || !CommonBackPerform.this.f.booleanValue()) {
                ExecutorUtils.runOnMain(new Runnable() {
                    public void run() {
                        CommonBackPerform.this.performBack(BackHandler.this.callback);
                    }
                });
            }
        }
    }

    public int getBackBehavior() {
        return this.backBehavior;
    }
}
