package com.alipay.iap.android.aplog.log.spm;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.log.behavior.SPMLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SpmTrackIntegrator {
    public static final String END_SEPARATOR_CHAR = "_";
    private static SpmTrackIntegrator INSTANCE = null;
    public static final String SEPARATOR_CHAR = "__";
    private static final String TAG = SpmTrackIntegrator.class.getSimpleName();
    private static Handler myHandler = new Handler(Looper.getMainLooper());
    public String lastClickViewSpm = "";
    private PageInfo mCurrentPageInfo;
    /* access modifiers changed from: private */
    public Map<String, PageInfo> pageInfos = new ConcurrentHashMap();

    public static synchronized SpmTrackIntegrator getInstance() {
        SpmTrackIntegrator spmTrackIntegrator;
        synchronized (SpmTrackIntegrator.class) {
            if (INSTANCE == null) {
                INSTANCE = new SpmTrackIntegrator();
            }
            spmTrackIntegrator = INSTANCE;
        }
        return spmTrackIntegrator;
    }

    public void logPageStartWithSpmId(String str, final Object obj) {
        if (obj == null || TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().info(TAG, "Start_view is null or spm is null");
            return;
        }
        final String viewKey = SpmUtils.getViewKey(obj);
        if (TextUtils.isEmpty(viewKey)) {
            LoggerFactory.getTraceLogger().info(TAG, "Start_view.toString() is null");
            return;
        }
        boolean checkIsPageBack = TrackerHelper.instance.checkIsPageBack(obj);
        PageInfo pageInfo = this.pageInfos.get(viewKey);
        if (pageInfo == null || pageInfo.isEnd) {
            PageInfo pageInfo2 = this.pageInfos.get(viewKey);
            if (pageInfo2 == null) {
                pageInfo2 = new PageInfo();
                PageInfo pageInfo3 = this.mCurrentPageInfo;
                if (pageInfo3 != null) {
                    pageInfo2.referPageInfo = PageInfo.clonePageInfo(pageInfo3);
                }
            }
            pageInfo2.pageRepeat = pageInfo2 == this.mCurrentPageInfo;
            pageInfo2.pageBack = checkIsPageBack;
            pageInfo2.isEnd = false;
            pageInfo2.pageStartTime10 = System.currentTimeMillis();
            pageInfo2.pageStartTime64 = SpmUtils.c10to64(pageInfo2.pageStartTime10);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(SEPARATOR_CHAR);
            sb.append(LoggerFactory.getLogContext().getDeviceID());
            sb.append(SEPARATOR_CHAR);
            sb.append(pageInfo2.pageStartTime64);
            sb.append("_");
            pageInfo2.pageId = sb.toString();
            pageInfo2.spm = str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(SEPARATOR_CHAR);
            sb2.append(pageInfo2.pageStartTime64);
            sb2.append("_");
            pageInfo2.miniPageId = sb2.toString();
            pageInfo2.referClickSpm = getLastClickViewSpm();
            this.pageInfos.put(viewKey, pageInfo2);
            this.mCurrentPageInfo = pageInfo2;
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            String str2 = TAG;
            StringBuilder sb3 = new StringBuilder("page start ");
            sb3.append(viewKey);
            sb3.append(" name = ");
            sb3.append(obj.getClass().getName());
            sb3.append(" spm = ");
            sb3.append(str);
            traceLogger.info(str2, sb3.toString());
            try {
                if (obj instanceof View) {
                    ((View) obj).addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                        public void onViewAttachedToWindow(View view) {
                        }

                        public void onViewDetachedFromWindow(View view) {
                            SpmTrackIntegrator.this.pageInfos.remove(viewKey);
                            ((View) obj).removeOnAttachStateChangeListener(this);
                        }
                    });
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error(TAG, th);
            }
        } else {
            LoggerFactory.getTraceLogger().info(TAG, "Start_not call end,and start twice,update spm");
            updateLastInfoSpm(pageInfo, str);
        }
    }

    public PageInfo logPageEndWithSpmId(String str, Object obj, String str2, Map<String, String> map) {
        if (obj == null || TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().info(TAG, "End_View is null or spm is null");
            return null;
        }
        String viewKey = SpmUtils.getViewKey(obj);
        if (TextUtils.isEmpty(viewKey)) {
            LoggerFactory.getTraceLogger().info(TAG, "End_view.toString() is null");
            return null;
        }
        PageInfo pageInfo = this.pageInfos.get(viewKey);
        if (pageInfo == null) {
            LoggerFactory.getTraceLogger().info(TAG, "End_pageInfo is null");
            return null;
        } else if (pageInfo.isEnd) {
            LoggerFactory.getTraceLogger().info(TAG, "is already call pageEnd");
            return pageInfo;
        } else {
            pageInfo.isEnd = true;
            SPMLog sPMLog = new SPMLog(str);
            sPMLog.setBizType(str2);
            sPMLog.setRefer(pageInfo.getRefer());
            sPMLog.putAllExtParam(map);
            sPMLog.setPageID(pageInfo.pageId);
            sPMLog.setStartTime(String.valueOf(pageInfo.pageStartTime10));
            sPMLog.setEndTime(String.valueOf(System.currentTimeMillis()));
            LoggerFactory.getLogContext().appendLog(sPMLog);
            return pageInfo;
        }
    }

    public void setLastClickViewSpm(String str) {
        this.lastClickViewSpm = str;
        PageInfo pageInfo = this.mCurrentPageInfo;
        if (pageInfo != null) {
            pageInfo.lastClickSpm = str;
        }
    }

    public String getLastClickViewSpm() {
        LoggerFactory.getTraceLogger().error(TAG, "getLastClickViewSpm");
        return this.lastClickViewSpm;
    }

    private void updateLastInfoSpm(PageInfo pageInfo, String str) {
        if (pageInfo == null || TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().info(TAG, "updateLastInfoSpm spm or lastInfo is null");
        } else {
            pageInfo.spm = str;
        }
    }

    public PageInfo getPageInfoByView(Object obj) {
        if (obj == null) {
            LoggerFactory.getTraceLogger().info(TAG, "getPageInfoByView is null or spm is null");
            return null;
        }
        String viewKey = SpmUtils.getViewKey(obj);
        if (TextUtils.isEmpty(viewKey)) {
            LoggerFactory.getTraceLogger().info(TAG, "getPageInfoByView() is null");
            return null;
        }
        PageInfo pageInfo = this.pageInfos.get(viewKey);
        if (pageInfo != null) {
            return pageInfo;
        }
        LoggerFactory.getTraceLogger().info(TAG, "getPageInfoByView view is null");
        return null;
    }

    public PageInfo getPageMonitorCurrentPageInfo() {
        return this.mCurrentPageInfo;
    }

    public void pageOnDestroy(Object obj) {
        final String viewKey = SpmUtils.getViewKey(obj);
        if (viewKey != null && this.pageInfos.get(viewKey) != null) {
            myHandler.postDelayed(new Runnable() {
                public void run() {
                    SpmTrackIntegrator.this.pageInfos.remove(viewKey);
                }
            }, 1000);
        }
    }
}
