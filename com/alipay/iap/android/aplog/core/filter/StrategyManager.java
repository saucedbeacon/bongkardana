package com.alipay.iap.android.aplog.core.filter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.appender.AppenderManager;
import com.alipay.iap.android.aplog.core.appender.DiagnoseLogAppender;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.network.NetWorkProvider;
import com.alipay.iap.android.aplog.util.CommonUtils;
import com.alipay.iap.android.common.config.ConfigProxy;
import com.alipay.iap.android.common.config.ISectionConfigChangeListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class StrategyManager implements Filter {
    public static final String ACTION_TYPE_MDAPUPLOAD = "mdapupload";
    private static long CURRENT_REQUEST_TIME_SPAN = 0;
    private static long DEFAULT_REQUEST_TIME_SPAN = 0;
    private static final String DIAGNOSE_LOG_CONFIG = "diagnosticConfig";
    private static final int DISABLE_TOOLS_PROCESS_NO = 1;
    private static final int DISABLE_TOOLS_PROCESS_YES = 2;
    private static final int ENABLE_NOLOCK_LOG_NO = 2;
    private static final int ENABLE_NOLOCK_LOG_YES = 1;
    private static final int ENABLE_TRAFFIC_LIMIT_NO = 2;
    private static final int ENABLE_TRAFFIC_LIMIT_YES = 1;
    private static final String IAPLOG_SECTION_CONFIG = "IAPLogConfig";
    private static final String JSON_DATA_CONTENT = "content";
    private static final String KEY_CURRENT_REQUEST_TIMESPAN = "CurrentRequestTimeSpan";
    private static final String KEY_DISABLE_TOOLS_PROCESS = "DisableToolsProcess";
    private static final String KEY_ENABLE_NOLOCK_LOG = "Disable_NoLock_Log";
    private static final String KEY_ENABLE_TRAFFIC_LIMIT = "EnableTrafficLimit";
    private static final String KEY_POSITIVE_DIAGNOSE = "PositiveDiagnose";
    private static final String KEY_PREVIOUS_REQUEST_TIME = "PreviousRequestTime";
    private static final String KEY_STRATEG_CONFIG_CONTENT = "StrategConfigContent2nd";
    private static final String KEY_ZIP_AND_SEVENZIP = "ZipAndSevenZip";
    private static final long MAXIMAL_REQUEST_TIME_SPAN = TimeUnit.HOURS.toMillis(1);
    public static long MINIMUM_REQUEST_TIME_SPAN = TimeUnit.MINUTES.toMillis(3);
    private static final int PERFORMANCE_THRESHOLD = 10;
    private static final int POSITIVE_DIAGNOSE_ALL = 3;
    private static final int POSITIVE_DIAGNOSE_NO = 1;
    private static final int POSITIVE_DIAGNOSE_WIFI = 2;
    private static final long REQUEST_TWICE_SPAN = TimeUnit.SECONDS.toMillis(5);
    private static final String REQUEST_URL_SUFFIX = "/loggw/logConfig.do";
    private static final String SP_NAME_LOGSTRATEGY_CONFIG = "LogStrategyConfig";
    public static final String TAG = "StrategyManager";
    private static final String UPLOAD_STRATEGY = "uploadStrategy";
    private static final int ZIP_AND_SEVENZIP_NO = 1;
    private static final int ZIP_AND_SEVENZIP_YES = 2;
    private static StrategyManager strategyManager;
    private Context context;
    private int disableNoLockLog;
    private int disableToolsProcessTag;
    private int enableTrafficLimitTag;
    private boolean performanceLogEnable = false;
    private int positiveDiagnoseTag;
    private RealTimeConfig realTimeConfig = new RealTimeConfig();
    private int retryCount = 0;
    private Map<String, LogStrategyInfo> strategyDataMap = new ConcurrentHashMap();
    private int zipAndSevenZipTag;

    static /* synthetic */ int access$008(StrategyManager strategyManager2) {
        int i = strategyManager2.retryCount;
        strategyManager2.retryCount = i + 1;
        return i;
    }

    static {
        long millis = TimeUnit.MINUTES.toMillis(30);
        DEFAULT_REQUEST_TIME_SPAN = millis;
        CURRENT_REQUEST_TIME_SPAN = millis;
    }

    class DiagnoseConfig {
        static final String cleaningFileSize = "cleaningFileSize";
        static final String cleaningRate = "cleaningRate";
        static final String outdate = "outdate";

        private DiagnoseConfig() {
        }
    }

    private StrategyManager(Context context2) {
        this.context = context2;
        fetchLogConfig();
    }

    private void handleIapLogConfigRetry() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                StrategyManager.access$008(StrategyManager.this);
                StrategyManager.this.handleIapLogConfig();
            }
        }, 1500);
    }

    private void fetchLogConfig() {
        ConfigProxy.getInstance().addSectionConfigChangeListener(IAPLOG_SECTION_CONFIG, new ISectionConfigChangeListener() {
            public void onSectionConfigChange(@NonNull String str, @Nullable String str2) {
                try {
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    if (str.equals(StrategyManager.IAPLOG_SECTION_CONFIG)) {
                        JSONObject jSONObject = new JSONObject(str2);
                        StrategyManager.this.handleConfigData(jSONObject.getString(StrategyManager.UPLOAD_STRATEGY));
                        StrategyManager.this.handleDiagnoseConfig(jSONObject.getJSONObject(StrategyManager.DIAGNOSE_LOG_CONFIG));
                    }
                } catch (JSONException e) {
                    LoggerFactory.getTraceLogger().error(StrategyManager.TAG, CommonUtils.getExceptionMessage(e, "parseLogStrategy JSONException"));
                }
            }
        });
        handleIapLogConfig();
    }

    /* access modifiers changed from: private */
    public void handleIapLogConfig() {
        try {
            String sectionConfig = ConfigProxy.getInstance().getSectionConfig(IAPLOG_SECTION_CONFIG);
            if (!TextUtils.isEmpty(sectionConfig)) {
                JSONObject jSONObject = new JSONObject(sectionConfig);
                handleConfigData(jSONObject.getString(UPLOAD_STRATEGY));
                handleDiagnoseConfig(jSONObject.getJSONObject(DIAGNOSE_LOG_CONFIG));
            } else if (this.retryCount <= 0) {
                handleIapLogConfigRetry();
            }
        } catch (JSONException e) {
            LoggerFactory.getTraceLogger().error(TAG, CommonUtils.getExceptionMessage(e, "parseLogStrategy JSONException"));
        }
    }

    /* access modifiers changed from: private */
    public void handleDiagnoseConfig(JSONObject jSONObject) {
        DiagnoseLogAppender diagnoseLogAppender = AppenderManager.getInstance().getDiagnoseLogAppender();
        if (jSONObject != null && diagnoseLogAppender != null) {
            diagnoseLogAppender.setExpiredSize(jSONObject.optInt("cleaningFileSize"));
            diagnoseLogAppender.setExpiredTime(jSONObject.optInt("outdate"));
            diagnoseLogAppender.setCleaningRate(jSONObject.optDouble("cleaningRate"));
        }
    }

    /* access modifiers changed from: private */
    public void handleConfigData(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("content")) {
                LoggerFactory.getTraceLogger().info(TAG, "syncRequestLogConfig: has configs");
                parseLogStrategy(jSONObject.getString("content"));
            }
        } catch (JSONException e) {
            LoggerFactory.getTraceLogger().error(TAG, CommonUtils.getExceptionMessage(e, "FormatConfig JSONException"));
        }
    }

    public static StrategyManager createInstance(Context context2) {
        if (strategyManager == null) {
            strategyManager = new StrategyManager(context2);
        }
        return strategyManager;
    }

    public static StrategyManager getInstance() {
        StrategyManager strategyManager2 = strategyManager;
        if (strategyManager2 != null) {
            return strategyManager2;
        }
        throw new IllegalStateException("need createInstance before use");
    }

    public boolean isLogUpload(String str, int i) {
        int i2 = 10;
        if (LogCategory.LOG_BEHAVIOUR_MANUAL.equals(str) || LogCategory.LOG_BEHAVIOUR_AUTO.equals(str)) {
            i2 = 50;
        } else if (LogCategory.LOG_ALIVEREPORT.equals(str) || "crash".equals(str)) {
            i2 = 1;
        } else if (!LogCategory.LOG_CATEGORY_HIGHAVAIL.equals(str) && !LogCategory.LOG_CATEGORY_APM.equals(str)) {
            i2 = 100;
        }
        LogStrategyInfo logStrategyInfo = this.strategyDataMap.get(str);
        if (logStrategyInfo != null && logStrategyInfo.threshold > 0) {
            i2 = logStrategyInfo.threshold;
        }
        if (i >= i2) {
            return true;
        }
        return false;
    }

    public boolean needEncrypt(String str) {
        LogStrategyInfo logStrategyInfo;
        if (TextUtils.isEmpty(str) || (logStrategyInfo = this.strategyDataMap.get(str)) == null) {
            return false;
        }
        TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
        StringBuilder sb = new StringBuilder(" needEncrypt ");
        sb.append(logStrategyInfo.isEncrypt);
        innerTraceLogger.debug(TAG, sb.toString());
        return logStrategyInfo.isEncrypt;
    }

    public String isLogSend(String str, String str2) {
        LogStrategyInfo logStrategyInfo;
        String[] split = str.split("_");
        if (split.length < 3) {
            return null;
        }
        String str3 = split[2];
        if (str2 != null && !str2.equals(str3)) {
            return null;
        }
        String currentNetworkType2Str = NetWorkProvider.getInstance().getCurrentNetworkType2Str();
        if ("unknown".equals(currentNetworkType2Str) || (logStrategyInfo = this.strategyDataMap.get(str3)) == null || !logStrategyInfo.hasSendCondition) {
            return str3;
        }
        if ("4g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("4g")) {
            return null;
        }
        if ("3g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("3g")) {
            return null;
        }
        if ("2g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("2g")) {
            return null;
        }
        if (!"wifi".equals(currentNetworkType2Str) || logStrategyInfo.sendCondition.contains("wifi")) {
            return str3;
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(36:116|117|118|119|120|(1:122)|123|(2:124|125)|126|128|129|130|(2:131|132)|139|140|141|142|143|144|145|146|147|148|149|150|151|(16:152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167)|(4:172|173|174|(3:175|176|(6:178|179|180|181|(2:187|273)(1:274)|188)(4:272|189|(1:191)|192)))|197|198|(3:201|202|199)|275|203|205|206|(3:207|208|271)) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x020c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0217 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x0222 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x022d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x0239 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:197:0x0297 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:207:0x02b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00a9 */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x025a A[Catch:{ all -> 0x0295 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02a2 A[Catch:{ all -> 0x02ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0284 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf A[Catch:{ all -> 0x00e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseLogStrategy(java.lang.String r29) throws org.json.JSONException {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = "upInterval"
            java.lang.String r3 = "yes"
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            boolean r0 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()
            java.lang.String r4 = "StrategyManager"
            if (r0 == 0) goto L_0x0028
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r5 = java.lang.String.valueOf(r29)
            java.lang.String r6 = "parseLogStrategy: "
            java.lang.String r5 = r6.concat(r5)
            r0.info(r4, r5)
        L_0x0028:
            org.json.JSONObject r5 = new org.json.JSONObject
            r0 = r29
            r5.<init>(r0)
            java.util.Iterator r6 = r5.keys()
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0039:
            boolean r0 = r6.hasNext()
            java.lang.String r15 = "parseLogStrategy"
            if (r0 == 0) goto L_0x032d
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x030f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x030f }
            r16 = 0
            org.json.JSONObject r17 = r5.getJSONObject(r0)     // Catch:{ all -> 0x0050 }
            r7 = r17
            goto L_0x0052
        L_0x0050:
            r7 = r16
        L_0x0052:
            if (r7 != 0) goto L_0x0060
            r20 = r2
            r26 = r3
            r18 = r5
            r19 = r6
        L_0x005c:
            r24 = r14
            goto L_0x0321
        L_0x0060:
            java.lang.String r8 = "positiveDiagnoseLog"
            boolean r8 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x030f }
            r18 = r5
            java.lang.String r5 = "event"
            r19 = r6
            java.lang.String r6 = "send"
            if (r8 == 0) goto L_0x00f0
            boolean r0 = r7.has(r5)     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x00e6
            r0 = 3
            r1.positiveDiagnoseTag = r0     // Catch:{ all -> 0x0309 }
            boolean r0 = r7.has(r6)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            org.json.JSONArray r0 = r7.getJSONArray(r6)     // Catch:{ all -> 0x00a9 }
            r5 = 0
        L_0x0084:
            int r6 = r0.length()     // Catch:{ all -> 0x00a9 }
            if (r5 >= r6) goto L_0x00a9
            java.lang.String r6 = r0.getString(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "none"
            boolean r8 = r8.equalsIgnoreCase(r6)     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x009a
            r8 = 1
            r1.positiveDiagnoseTag = r8     // Catch:{ all -> 0x00a9 }
            goto L_0x00a9
        L_0x009a:
            java.lang.String r8 = "wifi"
            boolean r6 = r8.equalsIgnoreCase(r6)     // Catch:{ all -> 0x00a9 }
            if (r6 == 0) goto L_0x00a6
            r6 = 2
            r1.positiveDiagnoseTag = r6     // Catch:{ all -> 0x00a9 }
        L_0x00a6:
            int r5 = r5 + 1
            goto L_0x0084
        L_0x00a9:
            int r0 = r1.positiveDiagnoseTag     // Catch:{ all -> 0x00e9 }
            r5 = 1
            if (r0 == r5) goto L_0x00e9
            boolean r0 = r7.has(r2)     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x00e9
            long r5 = r7.getLong(r2)     // Catch:{ all -> 0x00e9 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x00e9 }
            r7 = 1
            long r7 = r0.toMillis(r7)     // Catch:{ all -> 0x00e9 }
            long r5 = r5 * r7
            CURRENT_REQUEST_TIME_SPAN = r5     // Catch:{ all -> 0x00e9 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00cf
            long r5 = DEFAULT_REQUEST_TIME_SPAN     // Catch:{ all -> 0x00e9 }
            CURRENT_REQUEST_TIME_SPAN = r5     // Catch:{ all -> 0x00e9 }
            goto L_0x00e4
        L_0x00cf:
            long r7 = MINIMUM_REQUEST_TIME_SPAN     // Catch:{ all -> 0x00e9 }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00da
            long r5 = MINIMUM_REQUEST_TIME_SPAN     // Catch:{ all -> 0x00e9 }
            CURRENT_REQUEST_TIME_SPAN = r5     // Catch:{ all -> 0x00e9 }
            goto L_0x00e4
        L_0x00da:
            long r7 = MAXIMAL_REQUEST_TIME_SPAN     // Catch:{ all -> 0x00e9 }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            long r5 = MAXIMAL_REQUEST_TIME_SPAN     // Catch:{ all -> 0x00e9 }
            CURRENT_REQUEST_TIME_SPAN = r5     // Catch:{ all -> 0x00e9 }
        L_0x00e4:
            r10 = 1
            goto L_0x00e9
        L_0x00e6:
            r5 = 1
            r1.positiveDiagnoseTag = r5     // Catch:{ all -> 0x0309 }
        L_0x00e9:
            r5 = r18
            r6 = r19
            r9 = 1
            goto L_0x0039
        L_0x00f0:
            java.lang.String r8 = "zipAndSevenZip"
            boolean r8 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0309 }
            if (r8 == 0) goto L_0x0103
            r8 = 2
            r1.zipAndSevenZipTag = r8     // Catch:{ all -> 0x0309 }
            r5 = r18
            r6 = r19
            r11 = 1
            goto L_0x0039
        L_0x0103:
            java.lang.String r8 = "disableToolsProcess"
            boolean r8 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0309 }
            if (r8 == 0) goto L_0x0115
            r8 = 2
            r1.disableToolsProcessTag = r8     // Catch:{ all -> 0x0309 }
            r5 = r18
            r6 = r19
            r12 = 1
            goto L_0x0039
        L_0x0115:
            java.lang.String r8 = "enableTrafficLimit"
            boolean r8 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0309 }
            if (r8 == 0) goto L_0x0127
            r8 = 1
            r1.enableTrafficLimitTag = r8     // Catch:{ all -> 0x0309 }
            r5 = r18
            r6 = r19
            r13 = 1
            goto L_0x0039
        L_0x0127:
            java.lang.String r8 = "disable_nolock_log"
            boolean r8 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0309 }
            if (r8 == 0) goto L_0x0139
            r8 = 1
            r1.disableNoLockLog = r8     // Catch:{ all -> 0x0309 }
            r5 = r18
            r6 = r19
            r14 = 1
            goto L_0x0039
        L_0x0139:
            java.lang.String r8 = "realtimeConfig"
            boolean r8 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0309 }
            if (r8 == 0) goto L_0x0173
            java.lang.String r0 = "interval"
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x014c }
            com.alipay.iap.android.aplog.core.filter.RealTimeConfig r5 = r1.realTimeConfig     // Catch:{ all -> 0x014c }
            r5.setInterval(r0)     // Catch:{ all -> 0x014c }
        L_0x014c:
            java.lang.String r0 = "enable"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x0303 }
            java.lang.String r5 = "no"
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x0303 }
            if (r5 != 0) goto L_0x016b
            java.lang.String r5 = "false"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x0163
            goto L_0x016b
        L_0x0163:
            com.alipay.iap.android.aplog.core.filter.RealTimeConfig r0 = r1.realTimeConfig     // Catch:{ all -> 0x0303 }
            r5 = 1
            r0.setEnable(r5)     // Catch:{ all -> 0x0303 }
            goto L_0x0303
        L_0x016b:
            com.alipay.iap.android.aplog.core.filter.RealTimeConfig r0 = r1.realTimeConfig     // Catch:{ all -> 0x0303 }
            r5 = 0
            r0.setEnable(r5)     // Catch:{ all -> 0x0303 }
            goto L_0x0303
        L_0x0173:
            java.lang.String r8 = "config"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x0303
            java.util.Iterator r0 = r7.keys()     // Catch:{ all -> 0x0309 }
        L_0x017f:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0309 }
            if (r8 == 0) goto L_0x0303
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x02e9 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x02e9 }
            org.json.JSONObject r8 = r7.getJSONObject(r8)     // Catch:{ all -> 0x0190 }
            goto L_0x0192
        L_0x0190:
            r8 = r16
        L_0x0192:
            if (r8 != 0) goto L_0x0195
            goto L_0x017f
        L_0x0195:
            java.util.Iterator r17 = r8.keys()     // Catch:{ all -> 0x02e9 }
        L_0x0199:
            boolean r20 = r17.hasNext()     // Catch:{ all -> 0x02e9 }
            if (r20 == 0) goto L_0x017f
            java.lang.Object r20 = r17.next()     // Catch:{ all -> 0x02cb }
            r21 = r0
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x02cd }
            r20 = r2
            org.json.JSONObject r2 = r8.getJSONObject(r0)     // Catch:{ all -> 0x02cf }
            r22 = r7
            com.alipay.iap.android.aplog.core.filter.LogStrategyInfo r7 = new com.alipay.iap.android.aplog.core.filter.LogStrategyInfo     // Catch:{ all -> 0x02c6 }
            r7.<init>()     // Catch:{ all -> 0x02c6 }
            r23 = r8
            java.lang.String r8 = "write"
            java.lang.String r8 = r2.getString(r8)     // Catch:{ all -> 0x02c1 }
            boolean r8 = r3.equalsIgnoreCase(r8)     // Catch:{ all -> 0x02c1 }
            r7.isWrite = r8     // Catch:{ all -> 0x02c1 }
            java.lang.String r8 = "apm"
            boolean r8 = r0.equals(r8)     // Catch:{ all -> 0x02c1 }
            if (r8 == 0) goto L_0x01d1
            boolean r8 = r7.isWrite     // Catch:{ all -> 0x02c1 }
            r1.performanceLogEnable = r8     // Catch:{ all -> 0x02c1 }
        L_0x01d1:
            java.lang.String r8 = "level"
            int r8 = r2.getInt(r8)     // Catch:{ all -> 0x01d9 }
            r7.level = r8     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            java.lang.String r8 = "realtime"
            java.lang.String r8 = r2.getString(r8)     // Catch:{ all -> 0x01f3 }
            boolean r8 = r3.equalsIgnoreCase(r8)     // Catch:{ all -> 0x01f3 }
            r7.realtime = r8     // Catch:{ all -> 0x01f3 }
            com.alipay.iap.android.aplog.core.filter.RealTimeConfig r8 = r1.realTimeConfig     // Catch:{ all -> 0x01f3 }
            java.util.Map r8 = r8.getRealtimeCategory()     // Catch:{ all -> 0x01f3 }
            r24 = r14
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01f5 }
            r8.put(r0, r14)     // Catch:{ all -> 0x01f5 }
            goto L_0x0201
        L_0x01f3:
            r24 = r14
        L_0x01f5:
            r8 = 0
            r7.realtime = r8     // Catch:{ all -> 0x02bc }
            com.alipay.iap.android.aplog.core.filter.RealTimeConfig r8 = r1.realTimeConfig     // Catch:{ all -> 0x02bc }
            java.util.Map r8 = r8.getRealtimeCategory()     // Catch:{ all -> 0x02bc }
            r8.remove(r0)     // Catch:{ all -> 0x02bc }
        L_0x0201:
            r8 = -1
            java.lang.String r14 = "uploadRate"
            int r14 = r2.getInt(r14)     // Catch:{ all -> 0x020c }
            r7.uploadRate = r14     // Catch:{ all -> 0x020c }
            goto L_0x020e
        L_0x020c:
            r7.uploadRate = r8     // Catch:{ all -> 0x02bc }
        L_0x020e:
            java.lang.String r14 = "levelRate1"
            int r14 = r2.getInt(r14)     // Catch:{ all -> 0x0217 }
            r7.levelRate1 = r14     // Catch:{ all -> 0x0217 }
            goto L_0x0219
        L_0x0217:
            r7.levelRate1 = r8     // Catch:{ all -> 0x02bc }
        L_0x0219:
            java.lang.String r14 = "levelRate2"
            int r14 = r2.getInt(r14)     // Catch:{ all -> 0x0222 }
            r7.levelRate2 = r14     // Catch:{ all -> 0x0222 }
            goto L_0x0224
        L_0x0222:
            r7.levelRate2 = r8     // Catch:{ all -> 0x02bc }
        L_0x0224:
            java.lang.String r14 = "levelRate3"
            int r14 = r2.getInt(r14)     // Catch:{ all -> 0x022d }
            r7.levelRate3 = r14     // Catch:{ all -> 0x022d }
            goto L_0x022f
        L_0x022d:
            r7.levelRate3 = r8     // Catch:{ all -> 0x02bc }
        L_0x022f:
            java.lang.String r14 = "uploadInterval"
            int r14 = r2.getInt(r14)     // Catch:{ all -> 0x0239 }
            r7.uploadInterval = r14     // Catch:{ all -> 0x0239 }
            goto L_0x023b
        L_0x0239:
            r7.uploadInterval = r8     // Catch:{ all -> 0x02bc }
        L_0x023b:
            java.lang.String r8 = "encrypt"
            java.lang.String r8 = r2.getString(r8)     // Catch:{ all -> 0x0249 }
            boolean r8 = r3.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0249 }
            r7.isEncrypt = r8     // Catch:{ all -> 0x0249 }
            r8 = 0
            goto L_0x024c
        L_0x0249:
            r8 = 0
            r7.isEncrypt = r8     // Catch:{ all -> 0x02bc }
        L_0x024c:
            org.json.JSONArray r14 = r2.getJSONArray(r6)     // Catch:{ all -> 0x0293 }
            r26 = r3
            r25 = 0
        L_0x0254:
            int r3 = r14.length()     // Catch:{ all -> 0x0295 }
            if (r8 >= r3) goto L_0x0284
            java.lang.String r3 = r14.getString(r8)     // Catch:{ all -> 0x0295 }
            r27 = r6
            java.util.List<java.lang.String> r6 = r7.sendCondition     // Catch:{ all -> 0x0297 }
            r6.add(r3)     // Catch:{ all -> 0x0297 }
            java.lang.String r6 = "2g"
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0297 }
            if (r6 != 0) goto L_0x027d
            java.lang.String r6 = "3g"
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0297 }
            if (r6 != 0) goto L_0x027d
            java.lang.String r6 = "4g"
            boolean r3 = r6.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0297 }
            if (r3 == 0) goto L_0x027f
        L_0x027d:
            r25 = 1
        L_0x027f:
            int r8 = r8 + 1
            r6 = r27
            goto L_0x0254
        L_0x0284:
            r27 = r6
            if (r25 == 0) goto L_0x028f
            java.util.List<java.lang.String> r3 = r7.sendCondition     // Catch:{ all -> 0x0297 }
            java.lang.String r6 = "mobile"
            r3.add(r6)     // Catch:{ all -> 0x0297 }
        L_0x028f:
            r3 = 1
            r7.hasSendCondition = r3     // Catch:{ all -> 0x0297 }
            goto L_0x0297
        L_0x0293:
            r26 = r3
        L_0x0295:
            r27 = r6
        L_0x0297:
            org.json.JSONArray r3 = r2.getJSONArray(r5)     // Catch:{ all -> 0x02ae }
            r6 = 0
        L_0x029c:
            int r8 = r3.length()     // Catch:{ all -> 0x02ae }
            if (r6 >= r8) goto L_0x02ae
            java.lang.String r8 = r3.getString(r6)     // Catch:{ all -> 0x02ae }
            java.util.List<java.lang.String> r14 = r7.uploadEvents     // Catch:{ all -> 0x02ae }
            r14.add(r8)     // Catch:{ all -> 0x02ae }
            int r6 = r6 + 1
            goto L_0x029c
        L_0x02ae:
            java.lang.String r3 = "maxLogCount"
            int r2 = r2.getInt(r3)     // Catch:{ all -> 0x02b6 }
            r7.threshold = r2     // Catch:{ all -> 0x02b6 }
        L_0x02b6:
            java.util.Map<java.lang.String, com.alipay.iap.android.aplog.core.filter.LogStrategyInfo> r2 = r1.strategyDataMap     // Catch:{ all -> 0x02d9 }
            r2.put(r0, r7)     // Catch:{ all -> 0x02d9 }
            goto L_0x02d9
        L_0x02bc:
            r26 = r3
            r27 = r6
            goto L_0x02d9
        L_0x02c1:
            r26 = r3
            r27 = r6
            goto L_0x02d7
        L_0x02c6:
            r26 = r3
            r27 = r6
            goto L_0x02d5
        L_0x02cb:
            r21 = r0
        L_0x02cd:
            r20 = r2
        L_0x02cf:
            r26 = r3
            r27 = r6
            r22 = r7
        L_0x02d5:
            r23 = r8
        L_0x02d7:
            r24 = r14
        L_0x02d9:
            r2 = r20
            r0 = r21
            r7 = r22
            r8 = r23
            r14 = r24
            r3 = r26
            r6 = r27
            goto L_0x0199
        L_0x02e9:
            r21 = r0
            r20 = r2
            r26 = r3
            r27 = r6
            r22 = r7
            r24 = r14
            r2 = r20
            r0 = r21
            r7 = r22
            r14 = r24
            r3 = r26
            r6 = r27
            goto L_0x017f
        L_0x0303:
            r20 = r2
            r26 = r3
            goto L_0x005c
        L_0x0309:
            r0 = move-exception
            r20 = r2
            r26 = r3
            goto L_0x0318
        L_0x030f:
            r0 = move-exception
            r20 = r2
            r26 = r3
            r18 = r5
            r19 = r6
        L_0x0318:
            r24 = r14
            com.alipay.iap.android.aplog.core.logger.TraceLogger r2 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            r2.error(r4, r15, r0)
        L_0x0321:
            r5 = r18
            r6 = r19
            r2 = r20
            r14 = r24
            r3 = r26
            goto L_0x0039
        L_0x032d:
            r24 = r14
            r2 = 1
            if (r9 != 0) goto L_0x0334
            r1.positiveDiagnoseTag = r2
        L_0x0334:
            int r0 = r1.positiveDiagnoseTag
            if (r0 == r2) goto L_0x033a
            if (r10 != 0) goto L_0x033e
        L_0x033a:
            long r5 = DEFAULT_REQUEST_TIME_SPAN
            CURRENT_REQUEST_TIME_SPAN = r5
        L_0x033e:
            if (r11 != 0) goto L_0x0342
            r1.zipAndSevenZipTag = r2
        L_0x0342:
            if (r12 != 0) goto L_0x0346
            r1.disableToolsProcessTag = r2
        L_0x0346:
            r0 = 2
            if (r13 != 0) goto L_0x034b
            r1.enableTrafficLimitTag = r0
        L_0x034b:
            if (r24 != 0) goto L_0x034f
            r1.disableNoLockLog = r0
        L_0x034f:
            android.content.Context r0 = r1.context
            r2 = 4
            java.lang.String r3 = "LogStrategyConfig"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            int r2 = r1.positiveDiagnoseTag
            java.lang.String r3 = "PositiveDiagnose"
            r0.putInt(r3, r2)
            long r2 = CURRENT_REQUEST_TIME_SPAN
            java.lang.String r5 = "CurrentRequestTimeSpan"
            r0.putLong(r5, r2)
            int r2 = r1.zipAndSevenZipTag
            java.lang.String r3 = "ZipAndSevenZip"
            r0.putInt(r3, r2)
            int r2 = r1.disableToolsProcessTag
            java.lang.String r3 = "DisableToolsProcess"
            r0.putInt(r3, r2)
            int r2 = r1.enableTrafficLimitTag
            java.lang.String r3 = "EnableTrafficLimit"
            r0.putInt(r3, r2)
            int r2 = r1.disableNoLockLog
            java.lang.String r3 = "Disable_NoLock_Log"
            r0.putInt(r3, r2)
            r0.apply()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r15)
            java.lang.String r2 = ", positiveDiagnoseTag: "
            r0.append(r2)
            int r2 = r1.positiveDiagnoseTag
            r0.append(r2)
            java.lang.String r2 = ", CURRENT_REQUEST_TIME_SPAN: "
            r0.append(r2)
            long r2 = CURRENT_REQUEST_TIME_SPAN
            r0.append(r2)
            java.lang.String r2 = ", zipAndSevenZipTag: "
            r0.append(r2)
            int r2 = r1.zipAndSevenZipTag
            r0.append(r2)
            java.lang.String r2 = ", disableToolsProcessTag: "
            r0.append(r2)
            int r2 = r1.disableToolsProcessTag
            r0.append(r2)
            java.lang.String r2 = ", enableTrafficLimitTag: "
            r0.append(r2)
            int r2 = r1.enableTrafficLimitTag
            r0.append(r2)
            java.lang.String r2 = ", disableNoLockLog: "
            r0.append(r2)
            int r2 = r1.disableNoLockLog
            r0.append(r2)
            com.alipay.iap.android.aplog.core.logger.TraceLogger r2 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r0 = r0.toString()
            r2.info(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.filter.StrategyManager.parseLogStrategy(java.lang.String):void");
    }

    public boolean shouldWrite(String str) {
        LogStrategyInfo logStrategyInfo = this.strategyDataMap.get(str);
        LogWriteInfo logWriteInfo = new LogWriteInfo();
        logWriteInfo.logCategory = str;
        if (LoggerFactory.getLogContext().getLogCustomizeControl() != null && !LoggerFactory.getLogContext().getLogCustomizeControl().isLogWrite(logWriteInfo)) {
            return false;
        }
        if (logStrategyInfo != null) {
            return logStrategyInfo.isWrite;
        }
        return true;
    }

    public boolean shouldUpload(String str, int i) {
        return isLogUpload(str, i);
    }

    public String getConfigRequestTimeSpan() {
        return String.valueOf(DEFAULT_REQUEST_TIME_SPAN);
    }

    public void setConfigRequestTimeSpan(long j) {
        DEFAULT_REQUEST_TIME_SPAN = j;
    }

    public boolean isZipAndSevenZip() {
        if (this.zipAndSevenZipTag == 0) {
            this.zipAndSevenZipTag = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).getInt(KEY_ZIP_AND_SEVENZIP, 1);
        }
        if (this.zipAndSevenZipTag == 2) {
            return true;
        }
        return false;
    }

    public boolean isPerformanceLogEnable() {
        return this.performanceLogEnable;
    }
}
