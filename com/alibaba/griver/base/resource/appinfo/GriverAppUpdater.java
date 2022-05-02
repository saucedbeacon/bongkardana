package com.alibaba.griver.base.resource.appinfo;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.resource.appinfo.GriverAppUpdaterProxy;
import com.alibaba.griver.api.resource.appinfo.UpdateAppCallback;
import com.alibaba.griver.api.resource.appinfo.UpdateAppException;
import com.alibaba.griver.api.resource.appinfo.UpdateAppParam;
import com.alibaba.griver.base.common.constants.AMCSConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GriverAppUpdater {

    /* renamed from: a  reason: collision with root package name */
    private static GriverAppUpdaterProxy f9172a = getDefaultProxy();

    public static GriverAppUpdaterProxy getDefaultProxy() {
        try {
            Class.forName(AMCSConstants.AMCS_LITE_MAIN_CLASS);
            GriverLogger.d("GriverAppUpdater", "use amcs lite");
            return new GriverAMCSLiteAppUpdater();
        } catch (Exception unused) {
            return new GriverAppUpdaterProxy() {
                public final void updateApp(UpdateAppParam updateAppParam, UpdateAppCallback updateAppCallback) {
                    GriverLogger.e("GriverAppUpdater", "you need to implement GriverAppUpdaterProxy first");
                    updateAppCallback.onFailure(new UpdateAppException((Throwable) new Exception()));
                }
            };
        }
    }

    public static void updateApp(UpdateAppParam updateAppParam, UpdateAppCallback updateAppCallback) {
        if (updateAppParam == null) {
            updateAppCallback.onFailure(new UpdateAppException("0", "param is null"));
            return;
        }
        final Map<String, String> requestApps = updateAppParam.getRequestApps();
        if (requestApps == null || requestApps.size() == 0) {
            updateAppCallback.onFailure(new UpdateAppException("0", "param is null"));
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final UpdateAppParam updateAppParam2 = updateAppParam;
        final UpdateAppCallback updateAppCallback2 = updateAppCallback;
        f9172a.updateApp(updateAppParam, new UpdateAppCallback() {
            public final void onSuccess(List<AppModel> list) {
                boolean z;
                if (list == null || list.size() == 0) {
                    GriverLogger.d("GriverAppUpdater", "app info not exist");
                    a("1", "app info not exist");
                    return;
                }
                LinkedList<AppModel> linkedList = new LinkedList<>();
                Bundle extras = updateAppParam2.getExtras();
                ArrayList<AppModel> arrayList = new ArrayList<>();
                if (extras == null || (!AppInfoScene.isDevSource(extras) && TextUtils.isEmpty(GriverEnv.getEnvironment()))) {
                    for (AppModel next : list) {
                        if (next.getAppInfoModel() == null) {
                            arrayList.add(next);
                        } else {
                            next.setAppInfoModel(next.getAppInfoModel());
                            if (!AppInfoUtils.isValid(next) || 2 != AppInfoUtils.getAppType(next)) {
                                arrayList.add(next);
                            } else {
                                if (AppInfoUtils.isEmbeddedApp(next)) {
                                    next.getAppInfoModel().setMainUrl(AppInfoUtils.getEmbeddedAppMainUrl(next));
                                }
                                List<AppModel> queryAppInfo = GriverAppCenter.queryAppInfo(next.getAppId());
                                if (queryAppInfo != null && queryAppInfo.size() > 0) {
                                    Iterator<AppModel> it = queryAppInfo.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (RVResourceUtils.compareVersion(it.next().getAppVersion(), next.getAppInfoModel().getVersion()) > 0) {
                                                arrayList.add(next);
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z = true;
                                if (z) {
                                    linkedList.add(next);
                                } else {
                                    StringBuilder sb = new StringBuilder("received a low version of ");
                                    sb.append(next.getAppVersion());
                                    RVLogger.w("GriverAppUpdater", sb.toString());
                                    if (GriverEnv.isDebuggable()) {
                                        Application applicationContext = GriverEnv.getApplicationContext();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(next.getAppId());
                                        sb2.append(" is not the latest version.");
                                        ToastUtils.showToast(applicationContext, sb2.toString(), 0);
                                    }
                                }
                            }
                        }
                    }
                    GriverAppCenter.saveAppInfos(linkedList);
                } else {
                    for (AppModel next2 : list) {
                        if (next2.getAppInfoModel() == null) {
                            arrayList.add(next2);
                        } else {
                            next2.setAppInfoModel(next2.getAppInfoModel());
                            if (!AppInfoUtils.isValid(next2) || 2 != AppInfoUtils.getAppType(next2)) {
                                arrayList.add(next2);
                            } else {
                                linkedList.add(next2);
                            }
                        }
                    }
                }
                if (linkedList.size() == 0) {
                    GriverLogger.w("GriverAppUpdater", "no valid app info");
                    a("1", "no valid app info");
                    return;
                }
                if (arrayList.size() > 0) {
                    for (AppModel appModel : arrayList) {
                        MonitorMap.Builder builder = new MonitorMap.Builder();
                        builder.appId(appModel.getAppId()).version(appModel).needAsynAppType(true);
                        builder.message("no valid app info").code("1");
                        builder.cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        GriverMonitor.error(GriverMonitorConstants.ERROR_FETCH_APP_EXCEPTION, "GriverAppContainer", builder.build());
                    }
                }
                updateAppCallback2.onSuccess(linkedList);
                for (AppModel appModel2 : linkedList) {
                    MonitorMap.Builder builder2 = new MonitorMap.Builder();
                    builder2.appId(appModel2.getAppId()).version(appModel2).needAsynAppType(true).cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    GriverMonitor.event(GriverMonitorConstants.EVENT_FETCH_APP_SUCCESS, "GriverAppContainer", builder2.build());
                }
            }

            public final void onFailure(UpdateAppException updateAppException) {
                UpdateAppCallback updateAppCallback = updateAppCallback2;
                if (updateAppCallback != null) {
                    updateAppCallback.onFailure(updateAppException);
                }
            }

            private void a(String str, String str2) {
                onFailure(new UpdateAppException(str, str2));
                for (Map.Entry entry : requestApps.entrySet()) {
                    MonitorMap.Builder builder = new MonitorMap.Builder();
                    builder.appId((String) entry.getKey()).version((String) entry.getValue()).deployVersion((String) entry.getValue()).needAsynAppType(true);
                    builder.message(str2).code(str);
                    builder.cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    GriverMonitor.error(GriverMonitorConstants.ERROR_FETCH_APP_EXCEPTION, "GriverAppContainer", builder.build());
                }
            }
        });
    }

    public static void setGriverAppUpdateProxy(GriverAppUpdaterProxy griverAppUpdaterProxy) {
        if (griverAppUpdaterProxy != null) {
            f9172a = griverAppUpdaterProxy;
        } else {
            GriverLogger.e("GriverAppUpdater", "should not set null GriverAppUpdaterProxy");
        }
    }
}
