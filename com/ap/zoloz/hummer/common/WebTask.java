package com.ap.zoloz.hummer.common;

import com.alipay.mobile.security.bio.utils.StringUtil;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.biz.HummerZCodeConstant;
import java.util.HashMap;
import java.util.Map;

public class WebTask extends TaskTracker {
    private String url = "";

    public void run(HummerContext hummerContext, TaskConfig taskConfig, ITaskTrackerCallback iTaskTrackerCallback) {
    }

    public String getUrl() {
        return this.url;
    }

    public void run(HummerContext hummerContext, final TaskConfig taskConfig, UIConfig uIConfig, ITaskTrackerCallback iTaskTrackerCallback) {
        this.mITaskTrackerCallback = iTaskTrackerCallback;
        this.mTaskConfig = taskConfig;
        this.isLive = true;
        if (taskConfig != null && hummerContext != null) {
            this.mHummerContext = hummerContext;
            this.mHummerContext.add(HummerConstants.CURRENT_TASK_NAME, HummerConstants.CONTEXT, taskConfig.name);
            this.mIAlertManagerCallback = new IAlertManagerCallback() {
                public void onHandelNetworkError(boolean z) {
                }

                public void onHandelSystemError() {
                    if (taskConfig.navigateConfig.containsKey("error")) {
                        WebTask.this.mITaskTrackerCallback.onCompletion(WebTask.this.mHummerContext, ((Integer) ((Map) taskConfig.navigateConfig.get("error")).get("index")).intValue());
                    }
                }
            };
            if (!taskConfig.inputParams.containsKey("url")) {
                this.mHummerContext.updateZStack(taskConfig.name, HummerZCodeConstant.URL_PATTERN_ERROR_CODE);
                this.mHummerContext.recordSystemError(taskConfig.name, HummerZCodeConstant.URL_PATTERN_ERROR_CODE);
                AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
                return;
            }
            String str = (String) this.mHummerContext.query(String.valueOf(((Map) taskConfig.inputParams.get("url")).get("value")));
            this.url = str;
            if (StringUtil.isNullorEmpty(str)) {
                this.mHummerContext.updateZStack(taskConfig.name, HummerZCodeConstant.URL_ERROR_CODE);
                this.mHummerContext.recordSystemError(taskConfig.name, HummerZCodeConstant.URL_ERROR_CODE);
                AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
            } else if (!WebPageManager.getInstance().isPageAlreadyExit(this.url)) {
                HashMap hashMap = new HashMap();
                if (uIConfig != null && uIConfig.H5Config.size() > 0) {
                    hashMap.putAll(uIConfig.H5Config);
                }
                hashMap.put("url", this.url);
                WebPageManager.getInstance().openUrl(hashMap);
            }
        }
    }

    public void forceQuit() {
        if (this.isLive) {
            StringBuilder sb = new StringBuilder("Webtask ");
            sb.append(this.mTaskConfig.name);
            sb.append(" forceQuit");
            HummerLogger.i(sb.toString());
            HashMap hashMap = new HashMap();
            StringBuilder sb2 = new StringBuilder("exit ");
            sb2.append(this.mTaskConfig.name);
            hashMap.put("extInfo", sb2.toString());
            RecordManager.getInstance().record("techSeed", hashMap);
            WebPageManager.getInstance().exitSession();
            this.isLive = false;
        }
    }

    public void handleResult(int i, String str) {
        if (this.mTaskConfig != null && this.mHummerContext != null) {
            HummerLogger.i("endWebTask result = ".concat(String.valueOf(i)));
            if (i == 0) {
                if (StringUtil.isNullorEmpty(str)) {
                    this.mHummerContext.updateZStack(this.mTaskConfig.name, HummerZCodeConstant.END_WEBTASK_ERROR);
                    this.mHummerContext.recordSystemError(this.mTaskConfig.name, HummerZCodeConstant.END_WEBTASK_ERROR);
                    AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
                    return;
                }
                i = this.mHummerContext.getNextIndex(str);
            }
            if (this.mITaskTrackerCallback != null) {
                this.mITaskTrackerCallback.onCompletion(this.mHummerContext, i);
            }
        }
    }
}
