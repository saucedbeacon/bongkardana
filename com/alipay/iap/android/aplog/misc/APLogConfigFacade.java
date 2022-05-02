package com.alipay.iap.android.aplog.misc;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.filter.LogCustomizeControl;
import com.alipay.iap.android.aplog.core.filter.LogUploadInfo;
import com.alipay.iap.android.aplog.core.filter.LogWriteInfo;
import com.alipay.iap.android.aplog.core.filter.StrategyManager;
import com.alipay.iap.android.aplog.core.filter.UploadResultInfo;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo;
import com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class APLogConfigFacade {
    public static final String TAG = "APLogConfigFacade";
    private static APLogConfigFacade apLogFacade = new APLogConfigFacade();
    /* access modifiers changed from: private */
    public static APLogConfigData configData = null;
    private static long configRefreshInterval = TimeUnit.MINUTES.toMillis(30);
    /* access modifiers changed from: private */
    public static boolean logEnable = true;
    private List<String> configkeywords;
    private List<String[]> keylists = new ArrayList();

    public static APLogConfigFacade getInstance() {
        return apLogFacade;
    }

    private void initFilter() {
        LoggerFactory.getLogContext().setLogCustomizeControl(new LogCustomizeControl() {
            public boolean shouldQueryStrategy() {
                return true;
            }

            public boolean isLogWrite(LogWriteInfo logWriteInfo) {
                if (logWriteInfo != null && !TextUtils.isEmpty(logWriteInfo.logCategory) && APLogConfigFacade.logEnable) {
                    if (APLogConfigFacade.configData == null) {
                        return true;
                    }
                    if (!(APLogConfigFacade.configData.logTypes == null || APLogConfigFacade.configData.logTypes.size() == 0 || !APLogConfigFacade.configData.logTypes.contains(logWriteInfo.logCategory))) {
                        return APLogConfigFacade.this.handleKeyWord(logWriteInfo);
                    }
                }
                return false;
            }

            public UploadResultInfo isLogUpload(LogUploadInfo logUploadInfo) {
                UploadResultInfo uploadResultInfo = new UploadResultInfo();
                uploadResultInfo.isUpload = true;
                return uploadResultInfo;
            }
        });
    }

    public void init(Application application) {
        addUserInfoListener();
        initFilter();
    }

    private void addUserInfoListener() {
        UserInfoManager.instance().addUserChangeObserver(new IAPUserChangeObserver() {
            public void onUserChanged(IAPLoginUserInfo iAPLoginUserInfo) {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                StringBuilder sb = new StringBuilder("onUserChanged");
                sb.append(iAPLoginUserInfo.userID);
                traceLogger.debug(APLogConfigFacade.TAG, sb.toString());
                LoggerFactory.getLogContext().setUserID(iAPLoginUserInfo.userID);
            }

            public void onUserLogin(IAPLoginUserInfo iAPLoginUserInfo) {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                StringBuilder sb = new StringBuilder("onUserLogin");
                sb.append(iAPLoginUserInfo.userID);
                traceLogger.debug(APLogConfigFacade.TAG, sb.toString());
                LoggerFactory.getLogContext().setUserID(iAPLoginUserInfo.userID);
            }

            public void onUserLogout() {
                LoggerFactory.getLogContext().setUserID((String) null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean handleKeyWord(@NonNull LogWriteInfo logWriteInfo) {
        for (String[] next : this.keylists) {
            if (next[0].equals(logWriteInfo.logCategory)) {
                String[] split = logWriteInfo.logContent.split("\\,");
                int parseInt = Integer.parseInt(next[1]);
                if (split.length > parseInt && next[2].equals(split[parseInt])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setAliveInterval(Long l) {
        LoggerFactory.getLogContext().setLogAliveInterval(l);
    }

    public long getConfigRefreshInterval() {
        return configRefreshInterval;
    }

    public void setConfigRefreshInterval(Long l) {
        StrategyManager.getInstance().setConfigRequestTimeSpan(l.longValue());
        configRefreshInterval = l.longValue();
    }

    private void handleConfig(APLogConfigData aPLogConfigData) {
        if (aPLogConfigData != null) {
            this.keylists.clear();
            configData = aPLogConfigData;
            setConfigRefreshInterval(Long.valueOf(aPLogConfigData.configRefreshInterval));
            setAliveInterval(Long.valueOf(configData.reportActiveInterval));
            logEnable = configData.logEnable;
            if (configData.keywords != null) {
                ArrayList<String> arrayList = configData.keywords;
                this.configkeywords = arrayList;
                for (String split : arrayList) {
                    String[] split2 = split.split("\\^");
                    if (split2 != null && split2.length > 2) {
                        this.keylists.add(split2);
                    }
                }
            }
        }
    }
}
