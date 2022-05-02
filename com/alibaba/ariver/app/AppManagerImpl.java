package com.alibaba.ariver.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.point.app.AppCreatePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.app.proxy.RVAppFactory;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import java.util.Iterator;
import java.util.Stack;

@Keep
public final class AppManagerImpl extends NodeInstance implements AppManager {
    public static final Parcelable.Creator<AppManagerImpl> CREATOR = new Parcelable.Creator<AppManagerImpl>() {
        public final AppManagerImpl createFromParcel(Parcel parcel) {
            return new AppManagerImpl(parcel);
        }

        public final AppManagerImpl[] newArray(int i) {
            return new AppManagerImpl[i];
        }
    };
    private final Stack<App> mAppStack = new Stack<>();

    public AppManagerImpl() {
    }

    public AppManagerImpl(Parcel parcel) {
        super(parcel);
    }

    public final synchronized Stack<App> getAppStack() {
        Stack<App> stack;
        stack = new Stack<>();
        Iterator it = this.mAppStack.iterator();
        while (it.hasNext()) {
            stack.push((App) it.next());
        }
        return stack;
    }

    public final synchronized App startApp(String str, Bundle bundle, Bundle bundle2) {
        App findAppByToken;
        RVLogger.printPerformanceLog("App", "Start create app");
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_App_createApp);
        findAppByToken = findAppByToken(BundleUtils.getLong(bundle2, RVConstants.EXTRA_START_TOKEN, 0));
        if (findAppByToken != null) {
            findAppByToken.init(str, bundle, bundle2);
        } else {
            findAppByToken = ((RVAppFactory) RVProxy.get(RVAppFactory.class)).createApp();
            RVTraceUtils.traceEndSection(RVTraceKey.RV_App_createApp);
            findAppByToken.init(str, bundle, bundle2);
            pushChild(findAppByToken);
        }
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_App_onAppStart);
        ExtensionPoint.as(AppStartPoint.class).node(findAppByToken).create().onAppStart(findAppByToken);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_App_onAppStart);
        this.mAppStack.push(findAppByToken);
        return findAppByToken;
    }

    public final synchronized App preCreateApp(String str, Bundle bundle, Bundle bundle2) {
        AppNode createApp;
        createApp = ((RVAppFactory) RVProxy.get(RVAppFactory.class)).createApp();
        createApp.preCreateInit(str, bundle, bundle2);
        ExtensionPoint.as(AppCreatePoint.class).node(createApp).create().onAppCreate(createApp);
        pushChild(createApp);
        return createApp;
    }

    public final synchronized App findApp(long j) {
        return (App) getChild(j);
    }

    public final synchronized App findAppByToken(long j) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            App app = (App) getChildAt(i);
            if (app.getStartToken() == j) {
                return app;
            }
        }
        return null;
    }

    public final synchronized void exitApp(long j) {
        App findApp = findApp(j);
        if (findApp != null) {
            findApp.exit();
            this.mAppStack.remove(findApp);
        }
        if (findApp != null) {
            removeChild(findApp);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
