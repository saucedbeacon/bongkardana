package com.alipay.iap.android.aplog.api;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.alipay.iap.android.aplog.api.abtest.AbtestInfoGetter;
import com.alipay.iap.android.aplog.core.appender.LogEvent;
import com.alipay.iap.android.aplog.core.filter.Filter;
import com.alipay.iap.android.aplog.core.filter.LogCustomizeControl;
import com.alipay.iap.android.aplog.core.uploader.rpc.RpcClient;
import com.alipay.iap.android.aplog.log.BaseLogInfo;
import com.alipay.iap.android.aplog.log.spm.ISpmMonitor;
import com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback;
import java.util.LinkedList;
import java.util.Map;

public interface LogContext {
    public static final String ACTION_INIT_TOOLS_PROCESS = ".INIT_TOOLS_PROCESS";
    public static final String ACTION_NATIVE_CRASH = ".NATIVE_CRASH";
    public static final String ACTION_UPDATE_LOG_STRATEGY = ".UPDATE_LOG_STRATEGY";
    public static final String ACTION_UPDATE_USERID = ".UPDATE_USERID";
    public static final String ACTION_UPLOAD_MDAPLOG = ".UPLOAD_LOG";
    public static final String NEED_MOVE = "needMove";
    public static final String RELEASETYPE_DEV = "dev";
    public static final String RELEASETYPE_RC = "rc";
    public static final String RELEASETYPE_RCPRE = "rcpre";
    public static final String RELEASETYPE_TEST = "test";
    public static final String RELEASETYPE_TESTPRE = "testpre";
    public static final String SYNC_ALL_LOG = "syncAllLog";
    public static final String TOOLS_SERVICE_CLASS_NAME = "com.alipay.iap.android.aplog.service.LogServiceInToolsProcess";

    void addAutoLogActivity(String str);

    void addPage(String str);

    void addSPMPage(String str);

    void adjustUploadCoreByCategoryDirectly(String str, String str2, Bundle bundle);

    void appendLog(BaseLogInfo baseLogInfo);

    void appendLogEvent(LogEvent logEvent);

    void diagnoseLog(long j, long j2, UploadTaskStatusCallback uploadTaskStatusCallback);

    void flush();

    void flush(String str);

    void flush(String str, Bundle bundle);

    void flush(boolean z);

    AbtestInfoGetter getAbtestInfoGetter();

    String getAppKey();

    String getAppVersion();

    Context getApplicationContext();

    LinkedList<String> getAutoLogActivities();

    Map<String, String> getBizExternParams();

    String getClientID();

    String getConfigRequestTimeSpan(long j);

    String getDeviceID();

    Filter getFilter();

    String getLanguage();

    String getLastPage();

    String getLastSPMPage();

    String getLayoutType();

    long getLogAliveInterval();

    String getLogConfigHost();

    LogCustomizeControl getLogCustomizeControl();

    LogEncryptClient getLogEncryptClient();

    String getLogHost();

    RpcClient getLogUploadRpcClient();

    String getProductID();

    String getProductVersion();

    String getReleaseType();

    String getSessionID();

    ISpmMonitor getSpmMonitor();

    Uploader getUploader();

    String getUserID();

    boolean isZipAndSevenZip();

    void notifyClientEvent(String str, Object obj);

    void putBizExternParams(String str, String str2);

    void refreshSessionID();

    void setAbtestInfoGetter(AbtestInfoGetter abtestInfoGetter);

    void setAppKey(String str);

    void setAppVersion(String str);

    void setConfigRequestTimeSpan(long j);

    void setDeviceIdProvider(DeviceIdProvider deviceIdProvider);

    void setFilter(Filter filter);

    void setLayoutType(String str);

    void setLogAliveInterval(Long l);

    void setLogConfigHost(String str);

    void setLogCustomizeControl(LogCustomizeControl logCustomizeControl);

    void setLogEncryptClient(LogEncryptClient logEncryptClient);

    void setLogHost(String str);

    void setLogUploadRpcClient(RpcClient rpcClient);

    void setMaxLogSize(int i);

    void setProductID(String str);

    void setReleaseType(String str);

    void setSpmMonitor(ISpmMonitor iSpmMonitor);

    void setUploader(@NonNull Uploader uploader);

    void setUserID(String str);

    void syncAppendLog(BaseLogInfo baseLogInfo);

    void takeDownCrashReport();

    void updateLogStrategy(String str);

    void upload(String str);

    void upload(String str, String str2);

    void upload(String str, String str2, Bundle bundle);

    void uploadAll();
}
