package com.alibaba.ariver.console;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.console.view.IConsoleView;
import com.alibaba.ariver.console.view.a;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.DisplayUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.R;
import com.alibaba.fastjson.JSONObject;
import java.lang.ref.WeakReference;

public class DebugConsoleExtension implements View.OnClickListener, DebugConsolePoint, NodeAware<App> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<App> f10052a;
    /* access modifiers changed from: private */
    public IConsoleView b;
    private ViewGroup c;
    private a d;
    /* access modifiers changed from: private */
    public boolean e;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void sendMsgToConsoleView(JSONObject jSONObject) {
        IConsoleView iConsoleView = this.b;
        if (iConsoleView != null) {
            iConsoleView.sendMsg("onTinyDebugConsole", jSONObject);
        }
    }

    public void showToggleButton(boolean z) {
        App d2 = d();
        if (d2 == null) {
            RVLogger.e("AriverRemoteDebug:DebugConsoleExtension", "showToggleButton app is null.");
        } else if (this.d != null || !z) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.setVisibility(z ? 0 : 8);
            }
            ((RVDebugConsoleProxy) RVProxy.get(RVDebugConsoleProxy.class)).setToggleButtonVisible(d2.getAppId(), z);
        } else {
            c();
            ((RVDebugConsoleProxy) RVProxy.get(RVDebugConsoleProxy.class)).setToggleButtonVisible(d2.getAppId(), true);
            a();
        }
    }

    public void toggleConsoleView() {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || this.b == null || this.e) {
            RVLogger.e("AriverRemoteDebug:DebugConsoleExtension", "Console View is not created!");
            return;
        }
        int i = 0;
        boolean z = viewGroup.getVisibility() == 0;
        ViewGroup viewGroup2 = this.c;
        if (z) {
            i = 8;
        }
        viewGroup2.setVisibility(i);
    }

    public boolean isDebugPanelExists() {
        return this.b != null && !this.e;
    }

    private void a() {
        Activity e2 = e();
        if (e2 != null) {
            if (this.e) {
                RVLogger.d("AriverRemoteDebug:DebugConsoleExtension", "[createConsoleView] view creating!");
                return;
            }
            App d2 = d();
            if (d2 == null) {
                RVLogger.d("AriverRemoteDebug:DebugConsoleExtension", "[createConsoleView] app is null.");
                return;
            }
            this.e = true;
            ((RVDebugConsoleProxy) RVProxy.get(RVDebugConsoleProxy.class)).initConsoleView(e2, d2.getStartToken(), new ConsoleViewCreateCallback() {
                public void onConsoleViewCreated(IConsoleView iConsoleView) {
                    IConsoleView unused = DebugConsoleExtension.this.b = iConsoleView;
                    DebugConsoleExtension.this.b();
                    boolean unused2 = DebugConsoleExtension.this.e = false;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        Activity e2;
        IConsoleView iConsoleView = this.b;
        if (iConsoleView != null && iConsoleView.getView() != null && (e2 = e()) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = DisplayUtils.getTitleAndStatusBarHeight(e2);
            FrameLayout frameLayout = new FrameLayout(e2);
            frameLayout.setVisibility(8);
            ((ViewGroup) e2.findViewById(16908290)).addView(frameLayout, layoutParams);
            frameLayout.setBackgroundColor(1996488704);
            frameLayout.bringToFront();
            frameLayout.setOnClickListener(this);
            this.c = frameLayout;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, ((RVDebugConsoleProxy) RVProxy.get(RVDebugConsoleProxy.class)).getDebugConsoleViewHeight(e2));
            layoutParams2.gravity = 80;
            frameLayout.addView(this.b.getView(), layoutParams2);
        }
    }

    private void c() {
        RVLogger.d("AriverRemoteDebug:DebugConsoleExtension", "[initToggleButton]");
        Activity e2 = e();
        if (e2 != null) {
            this.d = new a(e2);
            this.d.setBackgroundColor(e2.getResources().getColor(R.color.console_toggle_button_background));
            this.d.setText(R.string.console_toggle_button_text);
            this.d.setTextSize(15.0f);
            this.d.setTextColor(-1);
            this.d.setPadding(18, 12, 18, 12);
            int titleAndStatusBarHeight = DisplayUtils.getTitleAndStatusBarHeight(e2);
            this.d.a(DimensionUtil.getScreenWidth(e2), DimensionUtil.getScreenHeight(e2) - titleAndStatusBarHeight);
            this.d.setOnClickListener(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = 200;
            layoutParams.rightMargin = 30;
            ((ViewGroup) e2.findViewById(16908290)).addView(this.d, layoutParams);
            this.d.bringToFront();
        }
    }

    @Nullable
    private App d() {
        WeakReference<App> weakReference = this.f10052a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private Activity e() {
        AppContext appContext;
        App d2 = d();
        if (d2 == null || (appContext = d2.getAppContext()) == null) {
            return null;
        }
        Context context = appContext.getContext();
        if (!(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }

    public void setNode(WeakReference<App> weakReference) {
        this.f10052a = weakReference;
    }

    public Class<App> getNodeType() {
        return App.class;
    }

    public void onClick(View view) {
        if (view == this.d) {
            toggleConsoleView();
        } else if (view == this.c) {
            toggleConsoleView();
        }
    }
}
