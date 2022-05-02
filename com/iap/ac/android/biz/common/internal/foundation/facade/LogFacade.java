package com.iap.ac.android.biz.common.internal.foundation.facade;

import android.content.Context;
import android.text.TextUtils;
import com.iap.ac.android.a.a;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.IACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.PageLogEvent;
import com.iap.ac.android.loglite.api.AnalyticsConfig;
import com.iap.ac.android.loglite.api.CommonAnalyticsAgent;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import java.util.Map;
import java.util.Set;

public class LogFacade extends BaseFacade {
    public static boolean mInitialized = false;
    public CommonAnalyticsAgent commonAnalyticsAgent;

    /* renamed from: com.iap.ac.android.biz.common.internal.foundation.facade.LogFacade$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$iap$ac$android$common$log$event$LogEventType;
        public static final /* synthetic */ int[] $SwitchMap$com$iap$ac$android$common$log$event$PageLogEvent$PageEvent;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.iap.ac.android.common.log.event.PageLogEvent$PageEvent[] r0 = com.iap.ac.android.common.log.event.PageLogEvent.PageEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$iap$ac$android$common$log$event$PageLogEvent$PageEvent = r0
                r1 = 1
                com.iap.ac.android.common.log.event.PageLogEvent$PageEvent r2 = com.iap.ac.android.common.log.event.PageLogEvent.PageEvent.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$iap$ac$android$common$log$event$PageLogEvent$PageEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                com.iap.ac.android.common.log.event.PageLogEvent$PageEvent r3 = com.iap.ac.android.common.log.event.PageLogEvent.PageEvent.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = $SwitchMap$com$iap$ac$android$common$log$event$PageLogEvent$PageEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.iap.ac.android.common.log.event.PageLogEvent$PageEvent r3 = com.iap.ac.android.common.log.event.PageLogEvent.PageEvent.DESTORY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.iap.ac.android.common.log.event.LogEventType[] r2 = com.iap.ac.android.common.log.event.LogEventType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$iap$ac$android$common$log$event$LogEventType = r2
                com.iap.ac.android.common.log.event.LogEventType r3 = com.iap.ac.android.common.log.event.LogEventType.CRUCIAL_LOG     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$iap$ac$android$common$log$event$LogEventType     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.iap.ac.android.common.log.event.LogEventType r2 = com.iap.ac.android.common.log.event.LogEventType.PERFORMANCE_LOG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.biz.common.internal.foundation.facade.LogFacade.AnonymousClass2.<clinit>():void");
        }
    }

    public static void setLogStrategy(String str) {
        if (mInitialized && !TextUtils.isEmpty(str)) {
            ACLog.i(Constants.TAG, "setLogStrategy to Log component: ".concat(String.valueOf(str)));
            AnalyticsConfig.setStrategyConfig(str);
        }
    }

    public void initComponent(Context context, String str, CommonConfig commonConfig) {
        super.initComponent(context, str, commonConfig);
        synchronized (this) {
            mInitialized = false;
            if (!Utils.checkClassExist("com.iap.ac.android.loglite.api.AnalyticsConfig") || !Utils.checkClassExist("com.iap.ac.android.loglite.api.AnalyticsHelper")) {
                ACLog.e(Constants.TAG, "lite log init error, without dependent libraries");
                return;
            }
            AnalyticsConfig.init(context, commonConfig.getLogProductId(), commonConfig.logGatewayUrl);
            Set<String> set = commonConfig.crashWhiteListSet;
            if (set != null && set.size() > 0) {
                for (String addCrashWhiteList : set) {
                    AnalyticsConfig.addCrashWhiteList(addCrashWhiteList);
                }
            }
            AnalyticsConfig.registerBizTypeToUploadUrl(MultiLanguageLogger.BIZCODE_CENTER, commonConfig.logGatewayUrl);
            AnalyticsConfig.registerBizTypeToUploadUrl("crash", commonConfig.logGatewayUrl);
            AnalyticsConfig.registerBizTypeToUploadUrl(ConfigMonitor.EVENT_BIZ_TYPE, commonConfig.logGatewayUrl);
            ACLog.i(Constants.TAG, "Log component initialize finish");
            this.commonAnalyticsAgent = new CommonAnalyticsAgent(str);
            ACMonitor.setACMonitorImpl(new IACMonitor() {
                public void flush() {
                    LogFacade.this.commonAnalyticsAgent.flushLogs();
                }

                public void logEvent(LogEvent logEvent) {
                    if (logEvent != null) {
                        StringBuilder a2 = a.a("logBehavior to lite log, bizCode:");
                        a2.append(logEvent.bizCode);
                        ACLog.i(Constants.TAG, a2.toString());
                        int i = AnonymousClass2.$SwitchMap$com$iap$ac$android$common$log$event$LogEventType[logEvent.eventType.ordinal()];
                        if (i == 1) {
                            LogFacade.this.commonAnalyticsAgent.sendKeyBizExceptionLog(logEvent.eventName, logEvent.bizCode, logEvent.params);
                        } else if (i != 2) {
                            LogFacade.this.commonAnalyticsAgent.sendBehaviorLog(logEvent.eventName, logEvent.bizCode, logEvent.params);
                        } else {
                            LogFacade.this.commonAnalyticsAgent.sendPerformanceLog(logEvent.eventName, logEvent.bizCode, logEvent.params);
                        }
                    } else {
                        ACLog.i(Constants.TAG, "sendBehavior log error, event is null");
                    }
                }

                public void logPageEvent(PageLogEvent pageLogEvent) {
                    if (pageLogEvent == null) {
                        ACLog.e(Constants.TAG, "LogFacade, logPageEvent null");
                        return;
                    }
                    int i = AnonymousClass2.$SwitchMap$com$iap$ac$android$common$log$event$PageLogEvent$PageEvent[pageLogEvent.event.ordinal()];
                    if (i == 1) {
                        LogFacade.this.commonAnalyticsAgent.onPageStart(pageLogEvent.page, pageLogEvent.pageId);
                    } else if (i == 2) {
                        LogFacade.this.commonAnalyticsAgent.onPageEnd(pageLogEvent.page, pageLogEvent.pageId, pageLogEvent.bizCode, pageLogEvent.params);
                    } else if (i == 3) {
                        LogFacade.this.commonAnalyticsAgent.onPageDestroy(pageLogEvent.page);
                    }
                }

                public void setGlobalParameters(Map<String, String> map) {
                    AnalyticsContext.getInstance().setGlobalExtParam(map);
                }
            }, str);
            mInitialized = true;
        }
    }

    public boolean isInitialized() {
        return mInitialized;
    }
}
