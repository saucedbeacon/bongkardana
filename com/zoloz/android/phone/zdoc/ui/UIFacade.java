package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.zoloz.config.ConfigCenter;
import com.ap.zoloz.hot.reload.ViewLoadService;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.R2;
import java.util.HashMap;

public class UIFacade {
    protected static final int STATE_CAPTURE = 0;
    protected static final int STATE_CONFIRM = 1;
    private static String sPackageName;
    private static HashMap<String, SpecialUiTypeInfo> sSpecialUiInfos;

    public static void readSpecialInfos(Context context) {
        readSpecialInfos(context, false);
    }

    public static void readSpecialInfos(Context context, boolean z) {
        HashMap<String, SpecialUiTypeInfo> hashMap;
        if (z || (hashMap = sSpecialUiInfos) == null || hashMap.isEmpty()) {
            byte[] assetsData = FileUtil.getAssetsData(context.getApplicationContext().getResources(), "special_ui_type.json");
            String str = assetsData != null ? new String(assetsData) : "";
            if (!TextUtils.isEmpty(str)) {
                sSpecialUiInfos = (HashMap) JSON.parseObject(str, new TypeReference<HashMap<String, SpecialUiTypeInfo>>() {
                }, new Feature[0]);
            }
            String specialUiLayout = ((ViewLoadService) BioServiceManager.getCurrentInstance().getBioService(ViewLoadService.class)).getSpecialUiLayout();
            if (!StringUtil.isNullorEmpty(specialUiLayout)) {
                sSpecialUiInfos = (HashMap) JSON.parseObject(specialUiLayout, new TypeReference<HashMap<String, SpecialUiTypeInfo>>() {
                }, new Feature[0]);
            }
            if (sSpecialUiInfos == null) {
                sSpecialUiInfos = new HashMap<>();
            }
        }
    }

    public static int getLayoutId(Context context, int i, String str, int i2) {
        int compIdentifier = getCompIdentifier(context, "layout_manual_".concat(String.valueOf(i)), TtmlNode.TAG_LAYOUT);
        if (compIdentifier == 0) {
            compIdentifier = readSpecialUiType(context, generateKey(str, i2));
        }
        if (compIdentifier == 0) {
            compIdentifier = readSpecialUiType(context, String.valueOf(i));
        }
        return compIdentifier == 0 ? R.layout.layout_manual_stand_frame : compIdentifier;
    }

    private static String generateKey(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i);
        return sb.toString();
    }

    public static int readSpecialUiType(Context context, String str) {
        readSpecialInfos(context);
        SpecialUiTypeInfo specialUiTypeInfo = sSpecialUiInfos.get(str);
        if (specialUiTypeInfo != null) {
            return getCompIdentifier(context, specialUiTypeInfo.getLayout(), TtmlNode.TAG_LAYOUT);
        }
        return 0;
    }

    public static String getMainMessage(Context context, int i, String str, int i2) {
        readSpecialInfos(context);
        SpecialUiTypeInfo specialUiTypeInfo = sSpecialUiInfos.get(generateKey(str, i2));
        if (specialUiTypeInfo == null) {
            specialUiTypeInfo = sSpecialUiInfos.get(Integer.valueOf(i));
        }
        if (specialUiTypeInfo == null) {
            return getStringByType(context, "main_message_", String.valueOf(i));
        }
        return getStringByResName(context, specialUiTypeInfo.getTestResId());
    }

    public static String getControllMessage(Context context, int i, String str, int i2) {
        String str2 = "zdoc_capture_";
        if (i != 0 && i == 1) {
            str2 = "zdoc_confirm_";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        sb.append("_");
        sb.append(i2);
        String stringByResName = getStringByResName(context, sb.toString());
        if (!TextUtils.isEmpty(stringByResName)) {
            return stringByResName;
        }
        if (i == 0) {
            return R2.string.zdoc_capture();
        }
        return i == 1 ? R2.string.zdoc_confirm() : stringByResName;
    }

    private static String getStringByType(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return getStringByResName(context, sb.toString());
    }

    private static String getStringByResName(Context context, String str) {
        return getR2String(context, str);
    }

    private static String getR2String(Context context, String str) {
        ViewLoadService viewLoadService;
        if (BioServiceManager.getCurrentInstance() == null) {
            ConfigCenter.getInstance().getApplicationContext();
            viewLoadService = (ViewLoadService) BioServiceManager.getLocalService(context, ViewLoadService.class);
        } else {
            viewLoadService = (ViewLoadService) BioServiceManager.getCurrentInstance().getBioService(ViewLoadService.class);
        }
        return viewLoadService.getString(str, getCompIdentifier(context, str, "string"));
    }

    public static String getUploadingString(Context context) {
        return context == null ? "" : R2.string.zdoc_processing();
    }

    public static String getUploadEndString(Context context) {
        return context == null ? "" : R2.string.zdoc_success();
    }

    private static int getCompIdentifier(Context context, String str, String str2) {
        String str3 = sPackageName;
        if (TextUtils.isEmpty(str3)) {
            str3 = context.getPackageName();
        }
        return context.getResources().getIdentifier(str, str2, str3);
    }

    public static void setPackageName(String str) {
        sPackageName = str;
    }

    public static void release() {
        HashMap<String, SpecialUiTypeInfo> hashMap = sSpecialUiInfos;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
