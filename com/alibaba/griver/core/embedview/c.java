package com.alibaba.griver.core.embedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5BridgeContext;
import com.alibaba.griver.base.api.H5EmbededViewProvider;
import com.alibaba.griver.base.api.IH5EmbedView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setNegativeButton;

public class c implements H5EmbededViewProvider {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<setNegativeButton<H5BridgeContext, JSONObject>>> f10293a = new ConcurrentHashMap();
    private final Set<String> b = new HashSet<String>() {
        {
            add("map");
            add("input");
        }
    };
    private Context c;
    private Page d;
    private Map<String, IH5EmbedView> e;
    private List<String> f;

    public c(Context context, Page page) {
        this.c = context;
        this.d = page;
        this.e = new ConcurrentHashMap();
        this.f = new ArrayList();
    }

    public void addPendingMessage(String str, H5BridgeContext h5BridgeContext, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("addPendingMessage: ");
        sb.append(str);
        sb.append(", message: ");
        sb.append(jSONObject);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        synchronized (this.f10293a) {
            List list = this.f10293a.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f10293a.put(str, list);
            }
            list.add(new setNegativeButton(h5BridgeContext, jSONObject));
        }
    }

    public View getEmbedView(int i, int i2, String str, String str2, Map<String, String> map) {
        String str3 = str;
        Map<String, String> map2 = map;
        StringBuilder sb = new StringBuilder("H5EmbededViewProviderImpl getEmbedView, viewId ");
        sb.append(str3);
        sb.append(", mType ");
        sb.append(str2);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        if (map2 != null) {
            try {
                if (!map.isEmpty() && this.e != null) {
                    String str4 = map2.get("type");
                    String a2 = a(str3, map2);
                    if (!this.e.containsKey(a2)) {
                        RVLogger.d("H5EmbededViewProviderImpl", "H5EmbededViewProviderImpl getEmbedView init");
                        IH5EmbedView a3 = a(str4);
                        if (a3 != null) {
                            if (TextUtils.equals(str4, "newembedbase")) {
                                clearBaseView();
                                this.f.add(a2);
                            }
                            this.e.put(a2, a3);
                            View view = a3.getView(i, i2, str, str2, map);
                            if (!(this.d == null || this.d.getRender() == null)) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("elementid", (Object) a2);
                                EngineUtils.sendToRender(this.d.getRender(), RVEvents.NBCOMPONENT_CANRENDER, jSONObject, (SendToRenderCallback) null);
                            }
                            if ("canvas".equals(str4)) {
                                a(a2, a3);
                            }
                            return view;
                        }
                    } else {
                        RVLogger.d("H5EmbededViewProviderImpl", "H5EmbededViewProviderImpl getEmbedView reuse");
                        IH5EmbedView iH5EmbedView = this.e.get(a2);
                        if (this.b.contains(str4)) {
                            return iH5EmbedView.getSpecialRestoreView(i, i2, str, str2, map);
                        }
                        return iH5EmbedView.getView(i, i2, str, str2, map);
                    }
                }
            } catch (Throwable th) {
                RVLogger.e("H5EmbededViewProviderImpl", "getEmbedView catch throwable ", th);
            }
        }
        return null;
    }

    private void a(String str, IH5EmbedView iH5EmbedView) {
        int i;
        synchronized (this.f10293a) {
            List<setNegativeButton> remove = this.f10293a.remove(str);
            if (remove == null) {
                i = 0;
            } else {
                i = remove.size();
            }
            StringBuilder sb = new StringBuilder("flushPendingMessages id: ");
            sb.append(str);
            sb.append(" size: ");
            sb.append(i);
            RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
            if (remove != null) {
                for (setNegativeButton setnegativebutton : remove) {
                    String string = JSONUtils.getString((JSONObject) setnegativebutton.getMin, "actionType");
                    JSONObject jSONObject = JSONUtils.getJSONObject((JSONObject) setnegativebutton.getMin, "data", new JSONObject());
                    jSONObject.put("element", (Object) str);
                    iH5EmbedView.onReceivedMessage(string, jSONObject, (H5BridgeContext) setnegativebutton.setMax);
                }
            }
        }
    }

    public void onEmbedViewAttachedToWebView(int i, int i2, String str, String str2, Map<String, String> map) {
        IH5EmbedView iH5EmbedView;
        StringBuilder sb = new StringBuilder("H5EmbededViewProviderImpl onEmbedViewAttachedToWebView, viewId ");
        sb.append(str);
        sb.append(", mType ");
        sb.append(str2);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        if (map != null) {
            try {
                if (!map.isEmpty() && this.e != null && (iH5EmbedView = this.e.get(a(str, map))) != null) {
                    iH5EmbedView.onEmbedViewAttachedToWebView(i, i2, str, str2, map);
                }
            } catch (Throwable th) {
                RVLogger.e("H5EmbededViewProviderImpl", "onEmbedViewAttachedToWebView catch throwable ", th);
            }
        }
    }

    public void onEmbedViewDetachedFromWebView(int i, int i2, String str, String str2, Map<String, String> map) {
        IH5EmbedView iH5EmbedView;
        StringBuilder sb = new StringBuilder("H5EmbededViewProviderImpl onEmbedViewDetachedFromWebView, viewId ");
        sb.append(str);
        sb.append(", mType ");
        sb.append(str2);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        if (map != null) {
            try {
                if (!map.isEmpty() && this.e != null && (iH5EmbedView = this.e.get(a(str, map))) != null) {
                    iH5EmbedView.onEmbedViewDetachedFromWebView(i, i2, str, str2, map);
                }
            } catch (Throwable th) {
                RVLogger.e("H5EmbededViewProviderImpl", "onEmbedViewDetachedFromWebView catch throwable ", th);
            }
        }
    }

    public void onEmbedViewDestory(int i, int i2, String str, String str2, Map<String, String> map) {
        IH5EmbedView iH5EmbedView;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(488985049, oncanceled);
            onCancelLoad.getMin(488985049, oncanceled);
        }
        StringBuilder sb = new StringBuilder("H5EmbededViewProviderImpl onEmbedViewDestory, viewId ");
        sb.append(str);
        sb.append(", mType ");
        sb.append(str2);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        if (map != null) {
            try {
                if (!map.isEmpty() && this.e != null && (iH5EmbedView = this.e.get(a(str, map))) != null) {
                    iH5EmbedView.onEmbedViewDestory(i, i2, str, str2, map);
                }
            } catch (Throwable th) {
                RVLogger.e("H5EmbededViewProviderImpl", "onEmbedViewDestory catch throwable ", th);
            }
        }
    }

    public void onEmbedViewParamChanged(int i, int i2, String str, String str2, Map<String, String> map, String[] strArr, String[] strArr2) {
        IH5EmbedView iH5EmbedView;
        String str3 = str;
        Map<String, String> map2 = map;
        StringBuilder sb = new StringBuilder("H5EmbededViewProviderImpl onEmbedViewParamChanged, viewId ");
        sb.append(str);
        sb.append(", mType ");
        String str4 = str2;
        sb.append(str2);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        if (map2 != null) {
            try {
                if (!map.isEmpty() && this.e != null && (iH5EmbedView = this.e.get(a(str, map2))) != null) {
                    iH5EmbedView.onEmbedViewParamChanged(i, i2, str, str2, map, strArr, strArr2);
                }
            } catch (Throwable th) {
                RVLogger.e("H5EmbededViewProviderImpl", "onEmbedViewParamChanged catch throwable ", th);
            }
        }
    }

    public void onEmbedViewVisibilityChanged(int i, int i2, String str, String str2, Map<String, String> map, int i3) {
        IH5EmbedView iH5EmbedView;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1130478466, oncanceled);
            onCancelLoad.getMin(1130478466, oncanceled);
        }
        StringBuilder sb = new StringBuilder("H5EmbededViewProviderImpl onEmbedViewVisibilityChanged, viewId ");
        sb.append(str);
        sb.append(", mType ");
        sb.append(str2);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        if (map != null) {
            try {
                if (!map.isEmpty() && this.e != null && (iH5EmbedView = this.e.get(a(str, map))) != null) {
                    iH5EmbedView.onEmbedViewVisibilityChanged(i, i2, str, str2, map, i3);
                }
            } catch (Throwable th) {
                RVLogger.e("H5EmbededViewProviderImpl", "onEmbedViewVisibilityChanged catch throwable ", th);
            }
        }
    }

    public void onWebViewResume() {
        RVLogger.d("H5EmbededViewProviderImpl", "H5EmbededViewProviderImpl onWebViewResume");
        try {
            if (this.e != null) {
                for (String str : this.e.keySet()) {
                    IH5EmbedView iH5EmbedView = this.e.get(str);
                    if (iH5EmbedView != null) {
                        iH5EmbedView.onWebViewResume();
                    }
                }
            }
        } catch (Throwable th) {
            RVLogger.e("H5EmbededViewProviderImpl", "onWebViewResume catch throwable ", th);
        }
    }

    public void onWebViewPause() {
        RVLogger.d("H5EmbededViewProviderImpl", "H5EmbededViewProviderImpl onWebViewPause");
        try {
            if (this.e != null) {
                for (String str : this.e.keySet()) {
                    IH5EmbedView iH5EmbedView = this.e.get(str);
                    if (iH5EmbedView != null) {
                        iH5EmbedView.onWebViewPause();
                    }
                }
            }
        } catch (Throwable th) {
            RVLogger.e("H5EmbededViewProviderImpl", "onWebViewPause catch throwable ", th);
        }
    }

    public void onWebViewDestory() {
        RVLogger.d("H5EmbededViewProviderImpl", "H5EmbededViewProviderImpl onWebViewDestory");
        try {
            if (this.e != null) {
                for (String str : this.e.keySet()) {
                    IH5EmbedView iH5EmbedView = this.e.get(str);
                    if (iH5EmbedView != null) {
                        iH5EmbedView.onWebViewDestory();
                    }
                }
            }
        } catch (Throwable th) {
            RVLogger.e("H5EmbededViewProviderImpl", "onWebViewDestory catch throwable ", th);
        }
    }

    private IH5EmbedView a(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-457078005, oncanceled);
            onCancelLoad.getMin(-457078005, oncanceled);
        }
        a a2 = b.a().a(str);
        if (a2 == null) {
            return null;
        }
        a2.a();
        RVLogger.w("H5EmbededViewProviderImpl", "getEmbedViewWrapper reflect clazz == null ".concat(String.valueOf(a2.b())));
        return null;
    }

    public void releaseView() {
        RVLogger.d("H5EmbededViewProviderImpl", "releaseView");
        synchronized (this.f10293a) {
            this.f10293a.clear();
        }
        this.e.clear();
        this.e = null;
        this.c = null;
        this.d = null;
    }

    public void clearBaseView() {
        Map<String, IH5EmbedView> map = this.e;
        if (map != null && !map.isEmpty() && !this.f.isEmpty()) {
            for (String next : this.f) {
                if (!TextUtils.isEmpty(next)) {
                    this.e.remove(next);
                }
            }
            this.f.clear();
        }
    }

    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        Map<String, IH5EmbedView> map = this.e;
        if (map != null) {
            for (IH5EmbedView onRequestPermissionResult : map.values()) {
                onRequestPermissionResult.onRequestPermissionResult(i, strArr, iArr);
            }
        }
    }

    public IH5EmbedView getEmbedViewWrapperById(String str) {
        return this.e.get(str);
    }

    public Bitmap getSnapshot(int i, int i2, String str, String str2, Map<String, String> map) {
        IH5EmbedView iH5EmbedView;
        StringBuilder sb = new StringBuilder("H5EmbededViewProviderImpl getSnapshot, viewId ");
        sb.append(str);
        sb.append(", mType ");
        sb.append(str2);
        RVLogger.d("H5EmbededViewProviderImpl", sb.toString());
        if (map == null) {
            return null;
        }
        try {
            if (map.isEmpty() || (iH5EmbedView = this.e.get(a(str, map))) == null) {
                return null;
            }
            return iH5EmbedView.getSnapshot(i, i2, str, str2, map);
        } catch (Throwable th) {
            RVLogger.e("H5EmbededViewProviderImpl", "getSnapshot catch throwable ", th);
            return null;
        }
    }

    public void triggerPreSnapshot() {
        try {
            if (this.e != null && !this.e.isEmpty()) {
                for (IH5EmbedView triggerPreSnapshot : this.e.values()) {
                    triggerPreSnapshot.triggerPreSnapshot();
                }
            }
        } catch (Throwable th) {
            RVLogger.e("H5EmbededViewProviderImpl", "triggerPreSnapshot catch throwable ", th);
        }
    }

    private String a(String str, Map<String, String> map) {
        String str2 = map.get("type");
        return (TextUtils.equals("TINY_COMPONENT", str2) || TextUtils.equals("newembedbase", str2)) ? str : map.get("id");
    }
}
