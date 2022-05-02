package com.iap.ac.android.acs.plugin.biz.region.miniprogram;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.biz.region.config.RegionRPCConfigCenter;
import com.iap.ac.android.acs.plugin.biz.region.miniprogram.repository.MiniProgramOpenReportProcessor;
import com.iap.ac.android.acs.plugin.biz.region.miniprogram.repository.MiniProgramOpenReportRpcResult;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MiniProgramOpenContainerListener implements IContainerListener {
    public static final String KEY_APP_ID = "appId";
    public static final String KEY_BIZ_QUERY = "bizQuery";
    public static final String KEY_CONTAINER_VERSION = "containerVersion";
    public static final String KEY_PATH = "path";
    public static final String KEY_SOURCE_INFO = "sourceInfo";
    private static final int MAX_RETRY_TIMES = 3;
    private static final int OFFSET_RETRY_TIMES = 0;
    private final Executor executor = Executors.newSingleThreadExecutor();

    public void onContainerDestroyed(@NonNull Bundle bundle) {
    }

    public void onContainerCreated(@NonNull Bundle bundle) {
        String string = bundle.getString("appId");
        if (TextUtils.isEmpty(string)) {
            ACLog.i(Constants.TAG, "report mini program open record fail,because app id is empty");
        } else if (!RegionRPCConfigCenter.INSTANCE.isEnableReport()) {
            ACLog.i(Constants.TAG, "report mini program open record fail,because region biz toggle is close");
        } else {
            this.executor.execute(new ReportMiniProgramOpenRecordRunnable(string, bundle));
        }
    }

    class ReportMiniProgramOpenRecordRunnable implements Runnable {
        private String appId;
        private Bundle bundle;

        public ReportMiniProgramOpenRecordRunnable(@NonNull String str, @NonNull Bundle bundle2) {
            this.appId = str;
            this.bundle = bundle2;
        }

        public void run() {
            int i = 0;
            do {
                i++;
                try {
                    if (MiniProgramOpenContainerListener.this.realReportOpenRecord(this.appId, this.bundle) || !RegionRPCConfigCenter.INSTANCE.isEnableRetryReport() || i >= 3) {
                    }
                    return;
                } catch (Exception e) {
                    ACLog.e(Constants.TAG, e.getMessage());
                    return;
                }
                i++;
            } while (i >= 3);
        }
    }

    /* access modifiers changed from: private */
    public boolean realReportOpenRecord(@NonNull String str, @NonNull Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str);
        if (bundle.containsKey("containerVersion")) {
            hashMap.put("containerVersion", bundle.getString("containerVersion", ""));
        }
        if (bundle.containsKey("path")) {
            hashMap.put("containerVersion", bundle.getString("path", ""));
        }
        if (bundle.containsKey("sourceInfo")) {
            hashMap.put("containerVersion", bundle.getString("sourceInfo", ""));
        }
        if (bundle.containsKey(KEY_BIZ_QUERY)) {
            hashMap.put(KEY_BIZ_QUERY, bundle.getString(KEY_BIZ_QUERY, ""));
        }
        MiniProgramOpenReportRpcResult openReport = new MiniProgramOpenReportProcessor().openReport(str, hashMap);
        if (openReport == null || !openReport.success) {
            ACLog.i(Constants.TAG, "report mini program open record fail");
            return false;
        }
        ACLog.i(Constants.TAG, "report mini program open record success");
        return true;
    }
}
