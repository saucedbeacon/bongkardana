package com.alipay.iap.android.aplog.core;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.aplog.api.DeviceIdProvider;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.api.LogEncryptClient;
import com.alipay.iap.android.aplog.api.LogEventType;
import com.alipay.iap.android.aplog.api.Uploader;
import com.alipay.iap.android.aplog.api.abtest.AbtestInfoGetter;
import com.alipay.iap.android.aplog.core.appender.AppenderManager;
import com.alipay.iap.android.aplog.core.appender.LogEvent;
import com.alipay.iap.android.aplog.core.filter.Filter;
import com.alipay.iap.android.aplog.core.filter.LogCustomizeControl;
import com.alipay.iap.android.aplog.core.filter.StrategyManager;
import com.alipay.iap.android.aplog.core.layout.LogLayout;
import com.alipay.iap.android.aplog.core.layout.LogLayoutManager;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.core.uploader.LogThreadPool;
import com.alipay.iap.android.aplog.core.uploader.UploadManager;
import com.alipay.iap.android.aplog.core.uploader.rpc.RpcClient;
import com.alipay.iap.android.aplog.log.BaseLogInfo;
import com.alipay.iap.android.aplog.log.FlushLog;
import com.alipay.iap.android.aplog.log.spm.ISpmMonitor;
import com.alipay.iap.android.aplog.log.spm.SpmMonitor;
import com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback;
import com.alipay.iap.android.aplog.network.NetWorkProvider;
import com.alipay.iap.android.aplog.util.DeviceHWInfo;
import com.alipay.iap.android.aplog.util.ServiceUtil;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import id.dana.utils.permission.ManifestPermission;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import o.IntRange;

public class LogContextImpl implements LogContext {
    public static final String TAG = "LogContextImpl";
    private AbtestInfoGetter abtestInfoGetter;
    private long aliveInterval = 1800000;
    private String appKey;
    private volatile AppendWorker appLogLogAppendWorker;
    private final ArrayBlockingQueue<BaseLogInfo> appLogQueue;
    private String appVersion;
    private AppenderManager appenderManager;
    private LinkedList<String> autoLogActivity = new LinkedList<>();
    private String clientID;
    private Context context;
    private DeviceIdProvider deviceIdProvider = new UtdidDeviceIdProvider();
    private Map<String, String> externParamMap = new ConcurrentHashMap();
    private Filter filter;
    private String layoutType = "MAS";
    private String logConfigHost;
    private LogCustomizeControl logCustomizeControl;
    private LogEncryptClient logEncryptClient;
    private String logHost;
    private ContextInfo mContextInfo;
    /* access modifiers changed from: private */
    public boolean mEventQueueFlag = true;
    private RpcClient mRpcClient;
    private ISpmMonitor mSpmMonitor = SpmMonitor.INTANCE;
    private volatile AppendWorker monitorLogAppendWorker;
    private final ArrayBlockingQueue<BaseLogInfo> monitorLogQueue;
    private LinkedList<String> pages = new LinkedList<>();
    private String productID;
    private String sessionID;
    private LinkedList<String> spmPages = new LinkedList<>();
    private StrategyManager strategyManager;
    private UploadManager uploadManager;
    private Uploader uploader;
    private String userID;

    public void diagnoseLog(long j, long j2, UploadTaskStatusCallback uploadTaskStatusCallback) {
    }

    public void updateLogStrategy(String str) {
    }

    public LogContextImpl(Context context2) {
        this.context = context2;
        this.mContextInfo = new ContextInfo(context2);
        this.appenderManager = AppenderManager.createInstance(this);
        UploadManager.createInstancecreateInstance(context2);
        this.uploadManager = UploadManager.getIntance();
        StrategyManager.createInstance(context2);
        StrategyManager instance = StrategyManager.getInstance();
        this.strategyManager = instance;
        setFilter(instance);
        NetWorkProvider.createInstance(context2);
        updateTimeZone();
        initExtParam();
        refreshSessionID();
        this.monitorLogQueue = new ArrayBlockingQueue<>(2048);
        this.appLogQueue = new ArrayBlockingQueue<>(2048);
    }

    public static boolean shouldLogCrash() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, 0);
        if (currentTimeMillis - sharedPreferences.getLong("lastCrashTime", 0) <= 3000) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("lastCrashTime", currentTimeMillis);
        edit.apply();
        return true;
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public LogCustomizeControl getLogCustomizeControl() {
        return this.logCustomizeControl;
    }

    public void setLogCustomizeControl(LogCustomizeControl logCustomizeControl2) {
        this.logCustomizeControl = logCustomizeControl2;
    }

    public void setMaxLogSize(int i) {
        this.uploadManager.setMaxUploadFileSize(i);
    }

    public String getProductVersion() {
        if (!TextUtils.isEmpty(this.appVersion)) {
            return this.appVersion;
        }
        return this.mContextInfo.getProductVersion();
    }

    public void flush() {
        appendLog(new FlushLog("flush"));
    }

    public void flush(boolean z) {
        if (z) {
            realAppendLog(new FlushLog("flush"));
        } else {
            flush();
        }
    }

    public void flush(String str) {
        appendLog(new FlushLog(LogEventType.CATEGORY_FLUSH_BY_TYPE, str));
    }

    public void flush(String str, Bundle bundle) {
        appendLog(new FlushLog(LogEventType.CATEGORY_FLUSH_BY_TYPE, str, bundle));
    }

    public void uploadAll() {
        flush();
        upload(LogCategory.LOG_ALIVEREPORT);
        upload(LogCategory.LOG_BEHAVIOUR_AUTO);
        upload(LogCategory.LOG_BEHAVIOUR_MANUAL);
        upload("crash");
        upload("performance");
        upload("exception");
    }

    public void upload(String str) {
        upload(str, (String) null);
    }

    public void upload(String str, String str2) {
        upload(str, str2, (Bundle) null);
    }

    public void upload(String str, String str2, Bundle bundle) {
        if (LoggerFactory.getProcessInfo().isMainProcess()) {
            Intent intent = new Intent();
            intent.setClassName(this.context, LogContext.TOOLS_SERVICE_CLASS_NAME);
            uploadCoreByStartService(intent, str, str2, bundle);
        } else if (LoggerFactory.getProcessInfo().isToolsProcess()) {
            adjustUploadCoreByCategoryDirectly(str, str2, bundle);
        }
    }

    private void uploadCoreByStartService(Intent intent, String str, String str2, Bundle bundle) {
        if (intent != null) {
            try {
                intent.setPackage(this.context.getPackageName());
            } catch (Throwable th) {
                LoggerFactory.getInnerTraceLogger().error(TAG, th);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.context.getPackageName());
            sb.append(LogContext.ACTION_UPLOAD_MDAPLOG);
            intent.setAction(sb.toString());
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("logCategory", str);
            intent.putExtra("uploadUrl", str2);
            intent.putExtra("invokerProcessAlias", LoggerFactory.getProcessInfo().getProcessAlias());
            boolean z = false;
            try {
                TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
                StringBuilder sb2 = new StringBuilder("uploadCoreByStartService start, action: ");
                sb2.append(this.context.getPackageName());
                sb2.append(LogContext.ACTION_UPLOAD_MDAPLOG);
                innerTraceLogger.debug(TAG, sb2.toString());
                ServiceUtil.startForegroundService(this.context, intent);
                z = true;
                LoggerFactory.getInnerTraceLogger().debug(TAG, "uploadCoreByStartService: true");
            } catch (Throwable th2) {
                LoggerFactory.getInnerTraceLogger().error(TAG, "uploadCoreByStartService", th2);
            }
            if (!z) {
                asyncUploadCoreByCategoryDirectly(str, str2, bundle);
            }
        }
    }

    public void adjustUploadCoreByCategoryDirectly(String str, String str2, Bundle bundle) {
        TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
        StringBuilder sb = new StringBuilder("adjustUploadCoreByCategoryDirectly ");
        sb.append(Thread.currentThread().getName());
        innerTraceLogger.debug(TAG, sb.toString());
        if ("main".equalsIgnoreCase(Thread.currentThread().getName())) {
            asyncUploadCoreByCategoryDirectly(str, str2, bundle);
        } else {
            syncUploadCoreByCategoryDirectly(str, str2, bundle);
        }
    }

    private void asyncUploadCoreByCategoryDirectly(final String str, final String str2, final Bundle bundle) {
        LoggerFactory.getInnerTraceLogger().debug(TAG, "asyncUploadCoreByCategoryDirectly: begin");
        LogThreadPool.newCachedThreadPool().submit(new Runnable() {
            public void run() {
                LogContextImpl.this.syncUploadCoreByCategoryDirectly(str, str2, bundle);
            }
        }, "LogContextImpl.upload");
    }

    /* access modifiers changed from: private */
    public void syncUploadCoreByCategoryDirectly(String str, String str2, Bundle bundle) {
        TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(LoggerFactory.getProcessInfo().getProcessAlias());
        sb.append(" syncUploadCoreByCategoryDirectly: ");
        sb.append(str);
        innerTraceLogger.debug(TAG, sb.toString());
        boolean z = true;
        boolean z2 = bundle != null && bundle.getBoolean(LogContext.SYNC_ALL_LOG);
        if (LoggerFactory.getProcessInfo().isMainProcess() || str != null) {
            z = false;
        }
        if (z || z2) {
            try {
                LoggerFactory.getInnerTraceLogger().info(TAG, "sync all log to upload dir...");
                this.uploadManager.syncLog();
            } catch (Throwable th) {
                LoggerFactory.getInnerTraceLogger().error(TAG, "syncUploadCoreByCategoryDirectly, syncLog: ".concat(String.valueOf(th)));
            }
        }
        try {
            LoggerFactory.getInnerTraceLogger().debug(TAG, "uploadManager.uploadLog");
            this.uploadManager.uploadLog(str, str2, bundle);
        } catch (Throwable th2) {
            LoggerFactory.getInnerTraceLogger().error(TAG, "syncUploadCoreByCategoryDirectly, uploadLog: ".concat(String.valueOf(th2)), th2);
        }
    }

    public void appendLogEvent(LogEvent logEvent) {
        this.appenderManager.appendEvent(logEvent);
    }

    public String getProductID() {
        return this.productID;
    }

    public void setProductID(String str) {
        this.productID = str;
    }

    public void setConfigRequestTimeSpan(long j) {
        StrategyManager.getInstance().setConfigRequestTimeSpan(j);
    }

    public String getConfigRequestTimeSpan(long j) {
        return StrategyManager.getInstance().getConfigRequestTimeSpan();
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String str) {
        this.userID = str;
        if (LoggerFactory.getProcessInfo().isMainProcess()) {
            Intent intent = new Intent();
            intent.setClassName(this.context, LogContext.TOOLS_SERVICE_CLASS_NAME);
            intent.setPackage(this.context.getPackageName());
            StringBuilder sb = new StringBuilder();
            sb.append(this.context.getPackageName());
            sb.append(LogContext.ACTION_UPDATE_USERID);
            intent.setAction(sb.toString());
            intent.putExtra("userID", str);
            ServiceUtil.startForegroundService(this.context, intent);
        }
    }

    public String getClientID() {
        return this.clientID;
    }

    public String getDeviceID() {
        try {
            return this.deviceIdProvider.getDeviceId();
        } catch (Exception e) {
            LoggerFactory.getInnerTraceLogger().error(TAG, (Throwable) e);
            return " ";
        }
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public void appendLog(@NonNull BaseLogInfo baseLogInfo) {
        if (baseLogInfo != null) {
            if (baseLogInfo.getLogCategory().equals("applog")) {
                appendAppLog(baseLogInfo);
            } else {
                appendMonitorLog(baseLogInfo);
            }
        }
    }

    private void appendAppLog(BaseLogInfo baseLogInfo) {
        if (this.appLogLogAppendWorker == null) {
            synchronized (this) {
                if (this.appLogLogAppendWorker == null) {
                    AppendWorker appendWorker = new AppendWorker(this.appLogQueue, 1);
                    appendWorker.setDaemon(true);
                    appendWorker.setName("AppLogAppendWorker");
                    appendWorker.start();
                    setAppLogAppendWorker(appendWorker);
                }
            }
        }
        try {
            if (!this.appLogQueue.add(baseLogInfo)) {
                StringBuilder sb = new StringBuilder("add log event to queue fail, current size: ");
                sb.append(this.appLogQueue.size());
                throw new RuntimeException(sb.toString());
            }
        } catch (Throwable th) {
            LoggerFactory.getInnerTraceLogger().error(TAG, "appendAppLogEvent", th);
        }
    }

    private void appendMonitorLog(BaseLogInfo baseLogInfo) {
        if (this.monitorLogAppendWorker == null) {
            synchronized (this) {
                if (this.monitorLogAppendWorker == null) {
                    AppendWorker appendWorker = new AppendWorker(this.monitorLogQueue, 0);
                    appendWorker.setDaemon(true);
                    appendWorker.setName("MonitorLogAppendWorker");
                    appendWorker.start();
                    setMonitorLogAppendWorker(appendWorker);
                }
            }
        }
        try {
            if (!this.monitorLogQueue.add(baseLogInfo)) {
                StringBuilder sb = new StringBuilder("add log event to queue fail, current size: ");
                sb.append(this.monitorLogQueue.size());
                throw new RuntimeException(sb.toString());
            }
        } catch (Throwable th) {
            LoggerFactory.getInnerTraceLogger().error(TAG, "appendMonitorLogEvent", th);
        }
    }

    public void syncAppendLog(BaseLogInfo baseLogInfo) {
        realAppendLog(baseLogInfo);
    }

    /* access modifiers changed from: private */
    public void realAppendLog(@NonNull BaseLogInfo baseLogInfo) {
        if (baseLogInfo.getLogCategory().equals("crash") && !shouldLogCrash()) {
            return;
        }
        if (baseLogInfo.getLogCategory().equals("flush")) {
            try {
                this.appenderManager.appendFlushLog((FlushLog) baseLogInfo);
            } catch (Exception e) {
                LoggerFactory.getInnerTraceLogger().error(TAG, e.getMessage());
            }
        } else {
            LogLayout logLayout = LogLayoutManager.getInstance().getLogLayout(baseLogInfo, getLayoutType());
            if (logLayout != null) {
                AppenderManager.getInstance().appendLog(logLayout);
            }
        }
    }

    public LogEncryptClient getLogEncryptClient() {
        return this.logEncryptClient;
    }

    public void setLogEncryptClient(LogEncryptClient logEncryptClient2) {
        this.logEncryptClient = logEncryptClient2;
    }

    public RpcClient getLogUploadRpcClient() {
        return this.mRpcClient;
    }

    public void setLogUploadRpcClient(RpcClient rpcClient) {
        this.mRpcClient = rpcClient;
    }

    public String getLogHost() {
        return this.logHost;
    }

    public void setLogHost(String str) {
        this.logHost = str;
    }

    public String getLogConfigHost() {
        return this.logConfigHost;
    }

    public void setLogConfigHost(String str) {
        this.logConfigHost = str;
    }

    public void putBizExternParams(String str, String str2) {
        if (str != null && str2 != null) {
            this.externParamMap.put(str, str2);
        }
    }

    public String getLanguage() {
        return Locale.getDefault().toString();
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public Map<String, String> getBizExternParams() {
        return this.externParamMap;
    }

    private void updateTimeZone() {
        try {
            putBizExternParams(H5GetLogInfoBridge.RESULT_TIMEZONE, TimeZone.getDefault().getID());
        } catch (Throwable th) {
            LoggerFactory.getInnerTraceLogger().error(TAG, th);
        }
    }

    private void initExtParam() {
        Location lastKnownLocation;
        String brandName = DeviceHWInfo.getBrandName();
        if (!TextUtils.isEmpty(brandName)) {
            putBizExternParams(H5GetLogInfoBridge.RESULT_BRAND, brandName);
        }
        int length = IntRange.length(getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION");
        int length2 = IntRange.length(getApplicationContext(), ManifestPermission.ACCESS_COARSE_LOCATION);
        if (length == 0 && length2 == 0) {
            LocationManager locationManager = (LocationManager) getApplicationContext().getSystemService("location");
            if (locationManager.isProviderEnabled("gps") && (lastKnownLocation = locationManager.getLastKnownLocation("gps")) != null) {
                LoggerFactory.getInnerTraceLogger().debug(TAG, "location not null");
                StringBuilder sb = new StringBuilder();
                sb.append(lastKnownLocation.getLatitude());
                putBizExternParams("latitude", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lastKnownLocation.getLongitude());
                putBizExternParams("longitude", sb2.toString());
            }
            AnonymousClass2 r6 = new LocationListener() {
                public void onLocationChanged(Location location) {
                }

                public void onProviderDisabled(String str) {
                }

                public void onProviderEnabled(String str) {
                }

                public void onStatusChanged(String str, int i, Bundle bundle) {
                }
            };
            Location location = null;
            if (locationManager.getAllProviders().contains("network")) {
                try {
                    locationManager.requestLocationUpdates("network", 1000, 0.0f, r6);
                    location = locationManager.getLastKnownLocation("network");
                } catch (Exception e) {
                    LoggerFactory.getInnerTraceLogger().error(TAG, e.getMessage());
                }
            }
            if (location != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(location.getLatitude());
                putBizExternParams("latitude", sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(location.getLongitude());
                putBizExternParams("longitude", sb4.toString());
            }
        }
    }

    public void refreshSessionID() {
        this.sessionID = UUID.randomUUID().toString();
    }

    public Filter getFilter() {
        Filter filter2 = this.filter;
        return filter2 == null ? this.strategyManager : filter2;
    }

    public void setFilter(Filter filter2) {
        this.filter = filter2;
    }

    public String getLayoutType() {
        return this.layoutType;
    }

    public void setLayoutType(String str) {
        this.layoutType = str;
    }

    public synchronized void addPage(String str) {
        if (this.pages == null) {
            this.pages = new LinkedList<>();
        }
        if (this.pages.size() >= 20) {
            this.pages.removeFirst();
        }
        this.pages.add(str);
    }

    public synchronized String getLastPage() {
        if (this.pages == null || this.pages.size() <= 0) {
            return null;
        }
        return this.pages.getLast();
    }

    public synchronized void addSPMPage(String str) {
        if (this.spmPages == null) {
            this.spmPages = new LinkedList<>();
        }
        if (this.spmPages.size() >= 20) {
            this.spmPages.removeFirst();
        }
        this.spmPages.add(str);
    }

    public synchronized String getLastSPMPage() {
        if (this.spmPages == null || this.spmPages.size() <= 0) {
            return null;
        }
        return this.spmPages.getLast();
    }

    public LinkedList<String> getAutoLogActivities() {
        return this.autoLogActivity;
    }

    public void addAutoLogActivity(String str) {
        this.autoLogActivity.add(str);
    }

    public Uploader getUploader() {
        return this.uploader;
    }

    public void setUploader(Uploader uploader2) {
        this.uploader = uploader2;
    }

    public long getLogAliveInterval() {
        return this.aliveInterval;
    }

    public void setLogAliveInterval(Long l) {
        this.aliveInterval = l.longValue();
    }

    public void notifyClientEvent(String str, Object obj) {
        if (str != null) {
            char c = 65535;
            if (str.hashCode() == 2115932913 && str.equals(LogEventType.ENVENT_GOTOBACKGROUND)) {
                c = 0;
            }
            if (c == 0) {
                LoggerFactory.getLogContext().flush();
                Bundle bundle = new Bundle();
                bundle.putString("event", LogEventType.ENVENT_GOTOBACKGROUND);
                LoggerFactory.getLogContext().upload("crash", (String) null, bundle);
                LoggerFactory.getLogContext().upload(LogCategory.LOG_BEHAVIOUR_MANUAL, (String) null, bundle);
                LoggerFactory.getLogContext().upload(LogCategory.LOG_BEHAVIOUR_AUTO, (String) null, bundle);
                LoggerFactory.getLogContext().upload(LogCategory.LOG_ALIVEREPORT, (String) null, bundle);
                LoggerFactory.getLogContext().upload(LogCategory.LOG_SPM, (String) null, bundle);
                LoggerFactory.getLogContext().upload(LogCategory.LOG_CATEGORY_HIGHAVAIL, (String) null, bundle);
                LoggerFactory.getLogContext().upload(LogCategory.LOG_CATEGORY_APM, (String) null, bundle);
                LoggerFactory.getLogContext().upload("exception", (String) null, bundle);
                LoggerFactory.getLogContext().upload("performance", (String) null, bundle);
            }
        }
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public String getReleaseType() {
        return this.mContextInfo.getReleaseType();
    }

    public void setReleaseType(String str) {
        this.mContextInfo.setReleaseType(str);
    }

    public void takeDownCrashReport() {
        try {
            Method declaredMethod = Class.forName("com.alipay.iap.android.aplog.core.logger.CrashLogBinder").getDeclaredMethod("takeDown", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            LoggerFactory.getInnerTraceLogger().error(TAG, TextUtils.isEmpty(e.getMessage()) ? "takeDown crashLog fail" : e.getMessage());
        }
    }

    public void setSpmMonitor(ISpmMonitor iSpmMonitor) {
        this.mSpmMonitor = iSpmMonitor;
    }

    public ISpmMonitor getSpmMonitor() {
        return this.mSpmMonitor;
    }

    public boolean isZipAndSevenZip() {
        return StrategyManager.getInstance().isZipAndSevenZip();
    }

    public void setAbtestInfoGetter(AbtestInfoGetter abtestInfoGetter2) {
        this.abtestInfoGetter = abtestInfoGetter2;
    }

    public AbtestInfoGetter getAbtestInfoGetter() {
        return this.abtestInfoGetter;
    }

    public class AppendWorker extends Thread {
        private ArrayBlockingQueue<BaseLogInfo> logQueue;
        private int type;

        public AppendWorker(ArrayBlockingQueue<BaseLogInfo> arrayBlockingQueue, int i) {
            this.logQueue = arrayBlockingQueue;
            this.type = i;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|(1:25)(2:26|(1:28))|29|(2:32|30)|36|33|39) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
            if (r4.type == 0) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
            com.alipay.iap.android.aplog.core.LogContextImpl.access$300(r4.this$0, (com.alipay.iap.android.aplog.core.LogContextImpl.AppendWorker) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
            if (r4.type == 1) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
            com.alipay.iap.android.aplog.core.LogContextImpl.access$400(r4.this$0, (com.alipay.iap.android.aplog.core.LogContextImpl.AppendWorker) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
            r0 = r4.logQueue.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
            if (r0.hasNext() != false) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
            r2 = r0.next();
            com.alipay.iap.android.aplog.core.LogContextImpl.access$500(r4.this$0, r2);
            r4.logQueue.remove(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
            com.alipay.iap.android.aplog.core.LogContextImpl.access$200(r4.this$0, (java.util.concurrent.ArrayBlockingQueue) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                java.lang.Thread r0 = r0.getThread()
                int r0 = r0.getPriority()
                int r0 = r0 + -2
                r1 = 5
                if (r0 >= r1) goto L_0x0012
                r0 = 5
            L_0x0012:
                r4.setPriority(r0)
            L_0x0015:
                r0 = 1
                r1 = 0
                com.alipay.iap.android.aplog.core.LogContextImpl r2 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x005d }
                boolean r2 = r2.mEventQueueFlag     // Catch:{ all -> 0x005d }
                if (r2 == 0) goto L_0x0027
                com.alipay.iap.android.aplog.core.LogContextImpl r2 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x005d }
                java.util.concurrent.ArrayBlockingQueue<com.alipay.iap.android.aplog.log.BaseLogInfo> r3 = r4.logQueue     // Catch:{ all -> 0x005d }
                r2.takeAndSync(r3)     // Catch:{ all -> 0x005d }
                goto L_0x0015
            L_0x0027:
                int r2 = r4.type     // Catch:{ all -> 0x005c }
                if (r2 != 0) goto L_0x0031
                com.alipay.iap.android.aplog.core.LogContextImpl r0 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x005c }
                r0.setMonitorLogAppendWorker(r1)     // Catch:{ all -> 0x005c }
                goto L_0x003a
            L_0x0031:
                int r2 = r4.type     // Catch:{ all -> 0x005c }
                if (r2 != r0) goto L_0x003a
                com.alipay.iap.android.aplog.core.LogContextImpl r0 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x005c }
                r0.setAppLogAppendWorker(r1)     // Catch:{ all -> 0x005c }
            L_0x003a:
                java.util.concurrent.ArrayBlockingQueue<com.alipay.iap.android.aplog.log.BaseLogInfo> r0 = r4.logQueue     // Catch:{ all -> 0x005c }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005c }
            L_0x0040:
                boolean r2 = r0.hasNext()     // Catch:{ all -> 0x005c }
                if (r2 == 0) goto L_0x0057
                java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x005c }
                com.alipay.iap.android.aplog.log.BaseLogInfo r2 = (com.alipay.iap.android.aplog.log.BaseLogInfo) r2     // Catch:{ all -> 0x005c }
                com.alipay.iap.android.aplog.core.LogContextImpl r3 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x005c }
                r3.realAppendLog(r2)     // Catch:{ all -> 0x005c }
                java.util.concurrent.ArrayBlockingQueue<com.alipay.iap.android.aplog.log.BaseLogInfo> r3 = r4.logQueue     // Catch:{ all -> 0x005c }
                r3.remove(r2)     // Catch:{ all -> 0x005c }
                goto L_0x0040
            L_0x0057:
                com.alipay.iap.android.aplog.core.LogContextImpl r0 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x005c }
                r0.takeAndSync(r1)     // Catch:{ all -> 0x005c }
            L_0x005c:
                return
            L_0x005d:
                int r2 = r4.type     // Catch:{ all -> 0x0092 }
                if (r2 != 0) goto L_0x0067
                com.alipay.iap.android.aplog.core.LogContextImpl r0 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x0092 }
                r0.setMonitorLogAppendWorker(r1)     // Catch:{ all -> 0x0092 }
                goto L_0x0070
            L_0x0067:
                int r2 = r4.type     // Catch:{ all -> 0x0092 }
                if (r2 != r0) goto L_0x0070
                com.alipay.iap.android.aplog.core.LogContextImpl r0 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x0092 }
                r0.setAppLogAppendWorker(r1)     // Catch:{ all -> 0x0092 }
            L_0x0070:
                java.util.concurrent.ArrayBlockingQueue<com.alipay.iap.android.aplog.log.BaseLogInfo> r0 = r4.logQueue     // Catch:{ all -> 0x0092 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0092 }
            L_0x0076:
                boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0092 }
                if (r2 == 0) goto L_0x008d
                java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0092 }
                com.alipay.iap.android.aplog.log.BaseLogInfo r2 = (com.alipay.iap.android.aplog.log.BaseLogInfo) r2     // Catch:{ all -> 0x0092 }
                com.alipay.iap.android.aplog.core.LogContextImpl r3 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x0092 }
                r3.realAppendLog(r2)     // Catch:{ all -> 0x0092 }
                java.util.concurrent.ArrayBlockingQueue<com.alipay.iap.android.aplog.log.BaseLogInfo> r3 = r4.logQueue     // Catch:{ all -> 0x0092 }
                r3.remove(r2)     // Catch:{ all -> 0x0092 }
                goto L_0x0076
            L_0x008d:
                com.alipay.iap.android.aplog.core.LogContextImpl r0 = com.alipay.iap.android.aplog.core.LogContextImpl.this     // Catch:{ all -> 0x0092 }
                r0.takeAndSync(r1)     // Catch:{ all -> 0x0092 }
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.LogContextImpl.AppendWorker.run():void");
        }
    }

    /* access modifiers changed from: private */
    public void takeAndSync(ArrayBlockingQueue<BaseLogInfo> arrayBlockingQueue) throws InterruptedException {
        if (arrayBlockingQueue != null) {
            realAppendLog(arrayBlockingQueue.take());
            this.mEventQueueFlag = true;
        }
    }

    /* access modifiers changed from: private */
    public synchronized void setMonitorLogAppendWorker(AppendWorker appendWorker) {
        this.monitorLogAppendWorker = appendWorker;
    }

    /* access modifiers changed from: private */
    public synchronized void setAppLogAppendWorker(AppendWorker appendWorker) {
        this.appLogLogAppendWorker = appendWorker;
    }

    public void setDeviceIdProvider(DeviceIdProvider deviceIdProvider2) {
        if (deviceIdProvider2 != null) {
            this.deviceIdProvider = deviceIdProvider2;
        }
    }
}
