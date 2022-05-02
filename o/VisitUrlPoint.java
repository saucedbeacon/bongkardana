package o;

import android.app.Application;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogHelper;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.behavior.AliveReportLog;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.common.log.IMonitor;
import com.alipay.iap.android.common.log.MonitorWrapper;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.ap.zoloz.hummer.api.EkycFacade;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class VisitUrlPoint {
    private static final String CONFIG_HOST = "https://a.m.dana.id/app/android/skywalker";
    private static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCpffOiYcozIfgIiaOPWsmfktv7Sl/9Af3mIgYz7vkTXoGq4iMN+t5BLV6KjddVEI/9oLtAYV8qx7FhFrUoi3smcYfX35ETPUiHi1gLizeXKVSRYhIm2kiDF5lGfDgcS7uJZvmKjbdYy/RphnH+WQvQyeEH+4rjYSkdhIRE2W52BwIDAQAB";
    private static final String TAG = "ApLogFacade";
    private final Application application;

    @Inject
    public VisitUrlPoint(Application application2) {
        this.application = application2;
        init();
    }

    private void init() {
        LoggerFactory.init(this.application, getActionSheet.APP_ID, PUBLIC_KEY);
        LoggingUtil.setDebuggable(false);
        if (LoggerFactory.getLogContext() != null) {
            LoggerFactory.getLogContext().setLogHost(getActionSheet.getLogHost());
            LoggerFactory.getLogContext().setLogConfigHost(CONFIG_HOST);
            LoggerFactory.getLogContext().setProductID(getActionSheet.PRODUCT_ID);
            LoggerFactory.getLogContext().setUserID(UserInfoManager.instance().getUserId());
            EkycFacade.init(this.application);
            MonitorWrapper.customizeMonitor(new IMonitor() {
                @Deprecated
                public final void performance(String str, String str2, String str3, Map<String, String> map) {
                    updateActionSheetContent.e(VisitUrlPoint.TAG, "MonitorWrapper-->performance -- Deprecated");
                }

                public final void aliveReport() {
                    updateActionSheetContent.d(VisitUrlPoint.TAG, "MonitorWrapper-->aliveReport");
                    if (LoggerFactory.getLogContext() != null) {
                        LoggerFactory.getLogContext().appendLog(new AliveReportLog());
                    }
                }

                public final void behaviour(String str, Map<String, String> map) {
                    updateActionSheetContent.d(VisitUrlPoint.TAG, "behaviour: [seedId= ".concat(String.valueOf(str)));
                    behaviour(str, (String) null, map);
                }

                public final void behaviour(String str, String str2, Map<String, String> map) {
                    StringBuilder sb = new StringBuilder("behaviour: [seedId= ");
                    sb.append(str);
                    sb.append("\t , bizType= ");
                    sb.append(str2);
                    updateActionSheetContent.d(VisitUrlPoint.TAG, sb.toString());
                    BehaviourLog behaviourLog = new BehaviourLog();
                    behaviourLog.setSeedID(str);
                    behaviourLog.setBizType(str2);
                    if (map != null && map.size() > 0) {
                        for (String next : map.keySet()) {
                            if (!TextUtils.isEmpty(next)) {
                                String str3 = map.get(next);
                                if (!TextUtils.isEmpty(str3)) {
                                    behaviourLog.putExtParam(next, str3);
                                }
                            }
                        }
                    }
                    if (LoggerFactory.getLogContext() != null) {
                        LoggerFactory.getLogContext().appendLog(behaviourLog);
                    }
                }

                public final void flush() {
                    updateActionSheetContent.d(VisitUrlPoint.TAG, "MonitorWrapper-->flush");
                    if (LoggerFactory.getLogContext() != null) {
                        LoggerFactory.getLogContext().flush();
                    }
                }

                public final void pageOnStart(Object obj, String str) {
                    StringBuilder sb = new StringBuilder("MonitorWrapper-->pageOnStart: [page= ");
                    sb.append(obj);
                    sb.append("\t , spmId= ");
                    sb.append(str);
                    updateActionSheetContent.d(VisitUrlPoint.TAG, sb.toString());
                    if (VisitUrlPoint.checkLoggerFactory()) {
                        LoggerFactory.getLogContext().getSpmMonitor().pageOnStart(obj, str);
                    }
                }

                public final void pageOnEnd(Object obj, String str, String str2, Map<String, String> map) {
                    StringBuilder sb = new StringBuilder("MonitorWrapper-->pageOnEnd: [page= ");
                    sb.append(obj);
                    sb.append("\t ,spmId= ");
                    sb.append(str);
                    sb.append("\t , bizCode= ");
                    sb.append(str2);
                    updateActionSheetContent.d(VisitUrlPoint.TAG, sb.toString());
                    if (VisitUrlPoint.checkLoggerFactory()) {
                        LoggerFactory.getLogContext().getSpmMonitor().pageOnEnd(obj, str, str2, map);
                    }
                }

                public final void pageOnDestroy(Object obj) {
                    updateActionSheetContent.d(VisitUrlPoint.TAG, "MonitorWrapper-->pageOnDestroy: [page= ".concat(String.valueOf(obj)));
                    if (VisitUrlPoint.checkLoggerFactory()) {
                        LoggerFactory.getLogContext().getSpmMonitor().pageOnDestroy(obj);
                    }
                }

                public final void spmClick(Object obj, String str, String str2, Map<String, String> map) {
                    StringBuilder sb = new StringBuilder("spmClick: [page= ");
                    sb.append(obj);
                    sb.append("\t ,spmId= ");
                    sb.append(str);
                    sb.append("\t , bizCode= ");
                    sb.append(str2);
                    updateActionSheetContent.d(VisitUrlPoint.TAG, sb.toString());
                    if (VisitUrlPoint.checkLoggerFactory()) {
                        LoggerFactory.getLogContext().getSpmMonitor().spmClick(obj, str, str2, map);
                    }
                }

                public final void spmExpose(Object obj, String str, String str2, Map<String, String> map) {
                    StringBuilder sb = new StringBuilder("spmExpose: [page= ");
                    sb.append(obj);
                    sb.append("\t ,spmId= ");
                    sb.append(str);
                    sb.append("\t , bizCode= ");
                    sb.append(str2);
                    updateActionSheetContent.d(VisitUrlPoint.TAG, sb.toString());
                    if (VisitUrlPoint.checkLoggerFactory()) {
                        LoggerFactory.getLogContext().getSpmMonitor().spmExpose(obj, str, str2, map);
                    }
                }

                @Deprecated
                public final void exception(String str, String str2, Map<String, String> map) {
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put("exceptionType", str);
                    exception(str2, map);
                }

                public final void exception(String str, Map<String, String> map) {
                    LogHelper.exception(str, map);
                }

                public final void performance(String str, String str2, Map<String, String> map) {
                    StringBuilder sb = new StringBuilder("MonitorWrapper-->performance: [performanceID= ");
                    sb.append(str);
                    sb.append("\t ,subType=");
                    sb.append(str2);
                    sb.append("\t ,extparams=");
                    sb.append(map);
                    updateActionSheetContent.d(VisitUrlPoint.TAG, sb.toString());
                    LogHelper.performance(str, str2, map);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static boolean checkLoggerFactory() {
        return (LoggerFactory.getLogContext() == null || LoggerFactory.getLogContext().getSpmMonitor() == null) ? false : true;
    }

    public static void behaviour(String str, String str2, Map<String, String> map) {
        MonitorWrapper.behaviour(str, str2, map);
    }

    public static void pageOnStart(Object obj, String str) {
        MonitorWrapper.pageOnStart(obj, str);
    }

    public static void pageOnEnd(Object obj, String str, String str2, Map<String, String> map) {
        MonitorWrapper.pageOnEnd(obj, str, str2, map);
    }

    public static void pageOnDestroy(Object obj) {
        MonitorWrapper.pageOnDestroy(obj);
    }

    public static void spmClick(Object obj, String str, String str2, Map<String, String> map) {
        MonitorWrapper.spmClick(obj, str, str2, map);
    }

    public static void spmExpose(Object obj, String str, String str2, Map<String, String> map) {
        MonitorWrapper.spmExpose(obj, str, str2, map);
    }

    public static void aliveReport() {
        MonitorWrapper.aliveReport();
    }

    public static void performance(String str, String str2, Map<String, String> map) {
        MonitorWrapper.performance(str, str2, map);
    }
}
