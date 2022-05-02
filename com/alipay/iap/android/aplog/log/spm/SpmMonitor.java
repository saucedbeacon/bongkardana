package com.alipay.iap.android.aplog.log.spm;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.behavior.BehaviorID;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public enum SpmMonitor implements ISpmMonitor {
    INTANCE;
    
    private static final String TAG = null;
    private WeakReference<Object> mTopPage;

    static {
        TAG = SpmMonitor.class.getName();
    }

    public final void pageOnStart(Object obj, String str) {
        this.mTopPage = new WeakReference<>(obj);
        if (!TextUtils.isEmpty(str)) {
            SpmTrackIntegrator.getInstance().logPageStartWithSpmId(str, obj);
        }
    }

    public final void pageOnEnd(Object obj, String str, String str2, Map<String, String> map) {
        LoggerFactory.getTraceLogger().debug(TAG, "pageOnPause spmId:".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("referSpm", TrackerHelper.instance.getReferSpm(obj));
            SpmTrackIntegrator.getInstance().logPageEndWithSpmId(str, obj, str2, map);
        }
    }

    public final void pageOnDestroy(Object obj) {
        SpmTrackIntegrator.getInstance().pageOnDestroy(obj);
    }

    public final void spmClick(Object obj, String str, String str2, Map<String, String> map) {
        setLastClickSpm(str);
        BehaviourLog.Builder behaviourBuilder = getBehaviourBuilder(obj, str, str2, map);
        behaviourBuilder.setBehaviourID(BehaviorID.CLICK);
        LoggerFactory.getLogContext().appendLog(behaviourBuilder.build());
    }

    private void setLastClickSpm(String str) {
        SpmTrackIntegrator.getInstance().setLastClickViewSpm(str);
    }

    public final void spmExpose(Object obj, String str, String str2, Map<String, String> map) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-346586063, oncanceled);
            onCancelLoad.getMin(-346586063, oncanceled);
        }
        BehaviourLog.Builder behaviourBuilder = getBehaviourBuilder(obj, str, str2, map);
        behaviourBuilder.setBehaviourID(BehaviorID.EXPOSURE);
        LoggerFactory.getLogContext().appendLog(behaviourBuilder.build());
    }

    public final Object getTopPage() {
        WeakReference<Object> weakReference = this.mTopPage;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private BehaviourLog.Builder getBehaviourBuilder(Object obj, String str, String str2, Map<String, String> map) {
        BehaviourLog.Builder builder = new BehaviourLog.Builder();
        String pageId = TrackerHelper.instance.getPageId(obj);
        builder.setPageId(pageId).setSeedID(str).setBizType(str2).addAllExtParam(map).setLastPage(LoggerFactory.getLogContext().getLastSPMPage());
        LoggerFactory.getLogContext().addSPMPage(pageId);
        return builder;
    }
}
