package com.iap.ac.android.acs.plugin.downgrade.jsapi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.downgrade.amcs.JSAPIModeManager;
import com.iap.ac.android.acs.plugin.downgrade.resource.JSAPIModeResourceManager;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.DeviceUtils;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.List;

public class JSAPIRegisterUtils {
    @NonNull
    public static JSAPIRegisterBean getJSAPIRegisterList(Context context, String str) {
        String str2;
        List arrayList = new ArrayList();
        List whiteList = JSAPIModeManager.getInstance().getWhiteList();
        List blackList = JSAPIModeManager.getInstance().getBlackList();
        int size = whiteList.size();
        String str3 = JSAPIRegisterBean.WHITE_LIST;
        if (size <= 0 || blackList.size() != 0) {
            str2 = JSAPIRegisterBean.NOT_CONFIG;
        } else {
            arrayList = whiteList;
            str2 = str3;
        }
        int size2 = whiteList.size();
        String str4 = JSAPIRegisterBean.BLACK_LIST;
        if (size2 == 0 && blackList.size() > 0) {
            arrayList = blackList;
            str2 = str4;
        }
        if (whiteList.size() > 0 && blackList.size() > 0) {
            if (!DeviceUtils.isApkInDebug(context)) {
                MonitorUtil.monitorJSAPIListError("JSAPIRegisterUtils#getJSAPIRegisterList: AMCS config error, there is also a black and white list.");
            } else {
                ACLog.e(Constants.TAG, "JSAPIRegisterUtils#getJSAPIRegisterList: AMCS config error, there is also a black and white list.");
                throw new AssertionError("JSAPIRegisterUtils#getJSAPIRegisterList: AMCS config error, there is also a black and white list.");
            }
        }
        if (arrayList.size() == 0) {
            JSAPIModeResourceManager jSAPIModeResourceManager = new JSAPIModeResourceManager(context, str);
            List jSAPIWhiteList = jSAPIModeResourceManager.getJSAPIWhiteList();
            List jSAPIBlackList = jSAPIModeResourceManager.getJSAPIBlackList();
            if (jSAPIWhiteList.size() <= 0 || jSAPIBlackList.size() != 0) {
                str3 = str2;
            } else {
                arrayList = jSAPIWhiteList;
            }
            if (jSAPIWhiteList.size() != 0 || jSAPIBlackList.size() <= 0) {
                str4 = str3;
            } else {
                arrayList = jSAPIBlackList;
            }
        } else {
            str4 = str2;
        }
        return new JSAPIRegisterBean(str4, arrayList);
    }
}
