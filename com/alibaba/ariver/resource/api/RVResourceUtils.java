package com.alibaba.ariver.resource.api;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.fastjson.JSONObject;
import java.io.File;

public class RVResourceUtils {
    public static boolean needSkipPermissionCheck(Node node) {
        AppModel appModel;
        JSONObject extendInfos;
        JSONObject jSONObject;
        App app = (App) node.bubbleFindNode(App.class);
        if (app == null || (appModel = (AppModel) app.getData(AppModel.class)) == null || (extendInfos = appModel.getExtendInfos()) == null || (jSONObject = JSONUtils.getJSONObject(extendInfos, RVConstants.EXTRA_RES_LAUNCH_PARAMS, (JSONObject) null)) == null) {
            return false;
        }
        return "NO".equalsIgnoreCase(JSONUtils.getString(jSONObject, "checkPermission", "YES"));
    }

    @Nullable
    public static File getExtDirectory(AppModel appModel, boolean z) {
        String installPath = ((RVResourceManager) RVProxy.get(RVResourceManager.class)).getInstallPath(appModel);
        StringBuilder sb = new StringBuilder("ariver_ext_");
        sb.append(appModel.getAppVersion());
        String combinePath = FileUtils.combinePath(installPath, sb.toString());
        if (TextUtils.isEmpty(combinePath)) {
            return null;
        }
        File file = new File(combinePath);
        if (!z || file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static int compareVersion(String str, String str2) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (str2 != null) {
                        if (str2.length() != 0) {
                            if (!str.contains("*")) {
                                if (!str2.contains("*")) {
                                    String[] split = str.split("\\.");
                                    String[] split2 = str2.split("\\.");
                                    int length = split.length;
                                    int length2 = split2.length;
                                    int min = Math.min(length, length2);
                                    for (int i = 0; i < min; i++) {
                                        long parseLong = TypeUtils.parseLong(split[i]);
                                        long parseLong2 = TypeUtils.parseLong(split2[i]);
                                        if (parseLong > parseLong2) {
                                            return 1;
                                        }
                                        if (parseLong < parseLong2) {
                                            return -1;
                                        }
                                    }
                                    if (length > length2) {
                                        while (min < length) {
                                            if (TypeUtils.parseLong(split[min]) > 0) {
                                                return 1;
                                            }
                                            min++;
                                        }
                                    } else if (length < length2) {
                                        while (min < length2) {
                                            if (TypeUtils.parseLong(split2[min]) > 0) {
                                                return -1;
                                            }
                                            min++;
                                        }
                                    }
                                }
                            }
                            return 0;
                        }
                    }
                    return 1;
                }
            } catch (Exception e) {
                RVLogger.e(RVConstants.RESOURCE_TAG, "compareVersion exception!", e);
            }
        }
        return (str2 == null || str2.length() == 0) ? 0 : -1;
    }
}
