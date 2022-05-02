package com.alibaba.ariver.integration;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.proxy.RVSinglePageAppProxy;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.integration.ipc.server.e;
import com.alibaba.ariver.integration.proxy.RVClientStarter;
import com.alibaba.ariver.integration.resource.a;
import com.alibaba.ariver.integration.resource.b;
import com.alibaba.ariver.integration.resource.c;
import com.alibaba.ariver.integration.resource.d;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallbackParam;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import o.PlaybackStateCompat;

@Keep
public class RVMain {
    private static final String TAG = "AriverInt:Main";
    private static PlaybackStateCompat.ShuffleMode<RVAppRecord> appRecords = new PlaybackStateCompat.ShuffleMode<>();

    public interface Callback {
        void onFragmentCreate(Fragment fragment);
    }

    static {
        IpcChannelManager.getInstance().registerClientListener(new IpcChannelManager.ClientListener() {
            public final void onRegister(long j, IIpcChannel iIpcChannel) {
                RVLogger.d(RVMain.TAG, "onClient register: ".concat(String.valueOf(j)));
            }

            public final void onUnRegister(long j) {
                RVLogger.d(RVMain.TAG, "onClient unRegister: ".concat(String.valueOf(j)));
                e.a().a(j);
                RVMain.removeAppRecord(j);
            }
        });
    }

    public static synchronized void startApp(Context context, @NonNull RVAppRecord rVAppRecord) {
        synchronized (RVMain.class) {
            RVInitializer.init(context);
            RVInitializer.setupOptimize();
            StringBuilder sb = new StringBuilder("startApp: ");
            sb.append(rVAppRecord.getAppId());
            RVLogger.d(TAG, sb.toString());
            rVAppRecord.getStartParams().putString(RVStartParams.KEY_START_SCENE, "startApp");
            rVAppRecord.getStartParams().putString(RVConstants.EXTRA_LAUNCH_URL, BundleUtils.getString(rVAppRecord.getStartParams(), "url"));
            rVAppRecord.getSceneParams().putLong(RVConstants.EXTRA_SETUP_TIMESTAMP, SystemClock.elapsedRealtime());
            RVTraceUtils.asyncTraceEnd(RVTraceKey.RV_preparePhase_before);
            RVTraceUtils.asyncTraceBegin(RVTraceKey.RV_preparePhase_setup);
            appRecords.setMax(rVAppRecord.getStartToken(), rVAppRecord);
            PrepareContext prepareContext = new PrepareContext(context, rVAppRecord.getAppId(), rVAppRecord.getStartParams(), rVAppRecord.getSceneParams());
            a aVar = new a(rVAppRecord, prepareContext);
            final PrepareController createPrepareController = ((RVClientStarter) RVProxy.get(RVClientStarter.class)).createPrepareController(prepareContext, aVar);
            if (createPrepareController == null) {
                aVar.startApp(new PrepareCallbackParam(prepareContext));
            } else {
                ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                    public final void run() {
                        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Prepare);
                        createPrepareController.start();
                        RVTraceUtils.traceEndSection(RVTraceKey.RV_Prepare);
                    }
                });
            }
        }
    }

    public static synchronized void startApp(Context context, String str, Bundle bundle, @Nullable Bundle bundle2) {
        synchronized (RVMain.class) {
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_Main_startApp);
            RVLogger.d(TAG, "startApp: ".concat(String.valueOf(str)));
            startApp(context, RVAppRecord.generate(str, BundleUtils.clone(bundle), BundleUtils.clone(bundle2)));
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Main_startApp);
        }
    }

    public static synchronized void createFragment(Context context, String str, Bundle bundle, @Nullable Bundle bundle2, Callback callback) {
        synchronized (RVMain.class) {
            RVLogger.d(TAG, "createFragment: ".concat(String.valueOf(str)));
            RVInitializer.init(context);
            RVInitializer.setupOptimize();
            Bundle clone = BundleUtils.clone(bundle);
            RVAppRecord generate = RVAppRecord.generate(str, clone, BundleUtils.clone(bundle2));
            generate.getStartParams().putString(RVConstants.EXTRA_LAUNCH_URL, BundleUtils.getString(clone, "url"));
            generate.getSceneParams().putLong(RVConstants.EXTRA_SETUP_TIMESTAMP, SystemClock.elapsedRealtime());
            appRecords.setMax(generate.getStartToken(), generate);
            PrepareContext prepareContext = new PrepareContext(context, generate.getAppId(), generate.getStartParams(), generate.getSceneParams());
            b bVar = new b(generate, prepareContext, callback);
            final PrepareController createPrepareController = ((RVClientStarter) RVProxy.get(RVClientStarter.class)).createPrepareController(prepareContext, bVar);
            if (createPrepareController == null) {
                bVar.startApp(new PrepareCallbackParam(prepareContext));
            } else {
                ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                    public final void run() {
                        createPrepareController.start();
                    }
                });
            }
        }
    }

    public static void startPage(Context context, RVAppRecord rVAppRecord, boolean z) {
        StringBuilder sb = new StringBuilder("startPage: ");
        sb.append(rVAppRecord.getAppId());
        RVLogger.d(TAG, sb.toString());
        RVInitializer.init(context.getApplicationContext());
        RVInitializer.setupOptimize();
        rVAppRecord.getStartParams().putString(RVStartParams.KEY_START_SCENE, RVStartParams.START_SCENE_START_PAGE);
        rVAppRecord.getStartParams().putString(RVConstants.EXTRA_LAUNCH_URL, BundleUtils.getString(rVAppRecord.getStartParams(), "url"));
        rVAppRecord.getSceneParams().putLong(RVConstants.EXTRA_SETUP_TIMESTAMP, SystemClock.elapsedRealtime());
        appRecords.setMax(rVAppRecord.getStartToken(), rVAppRecord);
        PrepareContext prepareContext = new PrepareContext(context, rVAppRecord.getAppId(), rVAppRecord.getStartParams(), rVAppRecord.getSceneParams());
        d dVar = new d(rVAppRecord, prepareContext);
        final PrepareController createPrepareController = ((RVClientStarter) RVProxy.get(RVClientStarter.class)).createPrepareController(prepareContext, dVar);
        if (!z || createPrepareController == null) {
            dVar.startApp(new PrepareCallbackParam(prepareContext));
        } else {
            ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                public final void run() {
                    createPrepareController.start();
                }
            });
        }
    }

    public static void createPage(Activity activity, String str, boolean z, Bundle bundle, Bundle bundle2, CreatePageCallback createPageCallback) {
        RVLogger.d(TAG, "createPage: ".concat(String.valueOf(str)));
        bundle.putString("appId", str);
        RVAppRecord generate = RVAppRecord.generate(str, BundleUtils.clone(bundle), BundleUtils.clone(bundle2));
        RVInitializer.init(activity.getApplicationContext());
        RVInitializer.setupOptimize();
        generate.getStartParams().putString(RVStartParams.KEY_START_SCENE, RVStartParams.START_SCENE_CREATE_PAGE);
        generate.getStartParams().putString(RVConstants.EXTRA_LAUNCH_URL, BundleUtils.getString(generate.getStartParams(), "url"));
        generate.getSceneParams().putLong(RVConstants.EXTRA_SETUP_TIMESTAMP, SystemClock.elapsedRealtime());
        appRecords.setMax(generate.getStartToken(), generate);
        PrepareContext prepareContext = new PrepareContext(activity, str, generate.getStartParams(), generate.getSceneParams());
        c cVar = new c(activity, generate, prepareContext, createPageCallback);
        final PrepareController createPrepareController = ((RVClientStarter) RVProxy.get(RVClientStarter.class)).createPrepareController(prepareContext, cVar);
        if (!z || createPrepareController == null) {
            cVar.startApp(new PrepareCallbackParam(prepareContext));
        } else {
            ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                public final void run() {
                    createPrepareController.start();
                }
            });
        }
    }

    public static Page createPageSync(Activity activity, String str, boolean z, Bundle bundle, Bundle bundle2) {
        Bundle clone = BundleUtils.clone(bundle);
        Bundle clone2 = BundleUtils.clone(bundle2);
        RVInitializer.init(activity.getApplicationContext());
        RVAppRecord generate = RVAppRecord.generate(str, clone, clone2);
        Bundle startParams = generate.getStartParams();
        Bundle sceneParams = generate.getSceneParams();
        startParams.putString(RVConstants.EXTRA_LAUNCH_URL, BundleUtils.getString(startParams, "url"));
        startParams.putLong(RVConstants.EXTRA_SETUP_TIMESTAMP, SystemClock.elapsedRealtime());
        startParams.putString(RVStartParams.KEY_START_SCENE, RVStartParams.START_SCENE_CREATE_PAGE);
        appRecords.setMax(generate.getStartToken(), generate);
        PrepareContext prepareContext = new PrepareContext(activity, str, startParams, sceneParams);
        if (z) {
            AppInfoQuery appInfoQuery = new AppInfoQuery(str);
            String string = BundleUtils.getString(prepareContext.getStartParams(), "appVersion");
            if (!TextUtils.isEmpty(string)) {
                appInfoQuery.version(string);
            }
            if (AppInfoScene.isDevSource(prepareContext.getStartParams())) {
                appInfoQuery.scene(AppInfoScene.extractScene(prepareContext.getStartParams()));
                appInfoQuery.version(AppInfoScene.extractSceneVersion(prepareContext.getStartParams()));
            }
            prepareContext.setAppInfoQuery(appInfoQuery);
            AppModel appModel = ((RVAppInfoManager) RVProxy.get(RVAppInfoManager.class)).getAppModel(appInfoQuery);
            if (!(appModel != null)) {
                return null;
            }
            prepareContext.setOriginHasAppInfo(true);
            prepareContext.setupAppInfo(appModel);
        }
        App startApp = ((AppManager) RVProxy.get(AppManager.class)).startApp(str, prepareContext.getStartParams(), prepareContext.getSceneParams());
        RVSinglePageAppProxy rVSinglePageAppProxy = (RVSinglePageAppProxy) RVProxy.get(RVSinglePageAppProxy.class);
        startApp.bindContext(rVSinglePageAppProxy.createAppContext(startApp, activity));
        Page preCreatePage = startApp.preCreatePage();
        preCreatePage.bindContext(rVSinglePageAppProxy.createPageContext(startApp, activity));
        startApp.start();
        return preCreatePage;
    }

    public static synchronized RVAppRecord getAppRecord(long j) {
        RVAppRecord max;
        synchronized (RVMain.class) {
            max = appRecords.getMax(j, null);
        }
        return max;
    }

    /* access modifiers changed from: private */
    public static synchronized void removeAppRecord(long j) {
        synchronized (RVMain.class) {
            RVLogger.d(TAG, "removeAppRecord: ".concat(String.valueOf(j)));
            appRecords.getMin(j);
        }
    }
}
