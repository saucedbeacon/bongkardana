package com.alibaba.griver.base.resource.preset;

import android.app.Application;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.resource.extensions.GriverCommonResourceProxy;
import com.alibaba.griver.api.resource.preset.GriverResourcePresetProxy;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.AbstractPriorityRunnable;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.GriverResourceManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.upFrom;

public class GriverResourcePreset {
    public static final String DEFAULT_PRESET_PATH = "Griver";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static GriverResourcePresetProxy f9176a = new GriverResourcePresetProxy() {
        public final String getPresetResourcePath() {
            return "Griver";
        }
    };
    private static Map<String, AppModel> b;
    private static Map<String, RVResourcePresetProxy.PresetPackage> c;
    private static List<String> d;

    public static void setGriverResourcePresetProxy(GriverResourcePresetProxy griverResourcePresetProxy) {
        if (griverResourcePresetProxy != null) {
            f9176a = griverResourcePresetProxy;
        }
    }

    public static void savePresetConfiguration() {
        if (!ProcessUtils.isMainProcess()) {
            GriverLogger.w("GriverResourcePreset", "do not save preset configuration in non-main process");
        } else {
            GriverExecutors.getSingleOrderThreadExecutorByName("saveConfiguration").execute(new AbstractPriorityRunnable(10) {
                public final void runTask() {
                    long currentTimeMillis = System.currentTimeMillis();
                    final List access$000 = GriverResourcePreset.a();
                    RVProxy.set(GriverCommonResourceProxy.class, new GriverCommonResourceProxy() {
                        public List<String> getCommonResources() {
                            return access$000;
                        }
                    });
                    Map<String, AppModel> presetAppInfos = GriverResourcePreset.getPresetAppInfos();
                    if (presetAppInfos != null && presetAppInfos.size() > 0) {
                        GriverResourceManager.saveConfiguration(presetAppInfos, false);
                    }
                    StringBuilder sb = new StringBuilder("save preset configuration ends, cost: ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    GriverLogger.d("GriverResourcePreset", sb.toString());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static List<String> a() {
        if (d == null) {
            d = new ArrayList();
            Resources resources = GriverEnv.getResources();
            StringBuilder sb = new StringBuilder();
            sb.append(f9176a.getPresetResourcePath());
            sb.append("/applist.json");
            try {
                d = JSON.parseArray(JSON.toJSONString(JSON.parseObject(IOUtils.readAsset(resources, sb.toString())).get(GriverConfigConstants.KEY_APP_SHARED_PACKAGES)), String.class);
            } catch (Exception e) {
                GriverLogger.e("GriverResourcePreset", "parse preset shared package failed", e);
            }
        }
        return d;
    }

    public static Map<String, AppModel> getPresetAppInfos() {
        if (b == null) {
            b = new HashMap();
            try {
                b.putAll(GriverResourceManager.parseAppInfoFromJSONString(JSON.toJSONString(JSON.parseObject(IOUtils.readAsset(GriverEnv.getResources(), "Griver/appx.json")).get("mini"))));
                GriverLogger.d("GriverResourcePreset", "parse default appx appinfo success");
            } catch (Throwable th) {
                GriverLogger.e("GriverResourcePreset", "read appx configuration failed", th);
            }
            Resources resources = GriverEnv.getResources();
            StringBuilder sb = new StringBuilder();
            sb.append(f9176a.getPresetResourcePath());
            sb.append("/applist.json");
            try {
                JSONObject parseObject = JSON.parseObject(IOUtils.readAsset(resources, sb.toString()));
                b.putAll(GriverResourceManager.parseAppInfoFromJSONString(JSON.toJSONString(parseObject.get(GriverConfigConstants.KEY_APP_CONFIGURATION))));
                b.putAll(GriverResourceManager.parseAppInfoFromJSONString(JSON.toJSONString(parseObject.get("mini"))));
            } catch (Exception e) {
                GriverLogger.e("GriverResourcePreset", "parse preset config failed", e);
            }
        }
        return b;
    }

    public static Map<String, RVResourcePresetProxy.PresetPackage> getPresetPackage() {
        String[] list;
        if (c == null) {
            c = new HashMap();
            try {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.equals(f9176a.getPresetResourcePath(), "Griver") && (list = GriverEnv.getApplicationContext().getAssets().list("Griver")) != null && list.length > 0) {
                    GriverLogger.d("GriverResourcePreset", "add default path preset package");
                    arrayList.addAll(Arrays.asList(list));
                }
                String[] list2 = GriverEnv.getApplicationContext().getAssets().list(f9176a.getPresetResourcePath());
                if (list2 != null && list2.length > 0) {
                    GriverLogger.d("GriverResourcePreset", "add app path preset package");
                    arrayList.addAll(Arrays.asList(list2));
                }
                if (arrayList.size() > 0) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        final String str = (String) arrayList.get(i);
                        if (!TextUtils.isEmpty(str) && str.endsWith(".amr")) {
                            int lastIndexOf = str.lastIndexOf("_");
                            int lastIndexOf2 = str.lastIndexOf(".");
                            if (lastIndexOf > 0 && lastIndexOf2 > 0) {
                                String substring = str.substring(0, lastIndexOf);
                                String substring2 = str.substring(lastIndexOf + 1, lastIndexOf2);
                                StringBuilder sb = new StringBuilder("load preset appId: ");
                                sb.append(substring);
                                sb.append(", version: ");
                                sb.append(substring2);
                                GriverLogger.d("GriverResourcePreset", sb.toString());
                                c.put(substring, new RVResourcePresetProxy.PresetPackage(substring, substring2, new RVResourcePresetProxy.InputStreamGetter() {
                                    private static int getMin = 1;
                                    private static int length;

                                    public final InputStream onGetInputStream() {
                                        int i = getMin + 9;
                                        length = i % 128;
                                        int i2 = i % 2;
                                        try {
                                            Application applicationContext = GriverEnv.getApplicationContext();
                                            int i3 = getMin + 43;
                                            length = i3 % 128;
                                            int i4 = i3 % 2;
                                            AssetManager assets = ((Resources) Application.class.getMethod("getResources", (Class[]) null).invoke(applicationContext, (Object[]) null)).getAssets();
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(GriverResourcePreset.f9176a.getPresetResourcePath());
                                            sb.append(File.separator);
                                            sb.append(str);
                                            Object[] objArr = new Object[2];
                                            objArr[1] = sb.toString();
                                            objArr[0] = assets;
                                            return (InputStream) ((Class) upFrom.setMax(19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 56348))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
                                        } catch (IOException e) {
                                            GriverLogger.e("GriverResourcePreset", "onGetInputStream error", e);
                                            return null;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }));
                            }
                        }
                    }
                }
            } catch (Exception e) {
                GriverLogger.e("GriverResourcePreset", "get preset package failed", e);
            }
        }
        return c;
    }
}
