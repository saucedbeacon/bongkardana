package com.alibaba.griver.ui.popmenu;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class CornerMarkingDataProvider {
    public void getData(String str, JSONObject jSONObject, Callback<List<CornerMarkingData>> callback) {
        final String userId = GriverAccount.getUserId();
        if (TextUtils.isEmpty(userId) || TextUtils.isEmpty(str)) {
            callback.callback(null);
            return;
        }
        final String str2 = str;
        final Callback<List<CornerMarkingData>> callback2 = callback;
        final JSONObject jSONObject2 = jSONObject;
        ExecutorUtils.runNotOnMain(ExecutorType.IO, new Runnable() {
            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                sb.append("_");
                sb.append(str2);
                sb.append("_corner");
                SharedPreferences access$000 = CornerMarkingDataProvider.this.a((Context) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), sb.toString());
                if (access$000 == null) {
                    callback2.callback(null);
                    return;
                }
                try {
                    if (!JSONUtils.getBoolean(jSONObject2, "success", false)) {
                        callback2.callback(null);
                        return;
                    }
                    JSONObject jSONObject = jSONObject2.getJSONObject("result");
                    if (jSONObject == null) {
                        callback2.callback(null);
                        return;
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("menus");
                    if (jSONArray == null) {
                        callback2.callback(null);
                    } else {
                        callback2.callback(CornerMarkingDataProvider.this.a(jSONArray, access$000));
                    }
                } catch (Exception unused) {
                    callback2.callback(null);
                }
            }
        });
    }

    public void click(final String str, final String str2) {
        final String userId = GriverAccount.getUserId();
        if (!TextUtils.isEmpty(userId) && !TextUtils.isEmpty(str)) {
            ExecutorUtils.runNotOnMain(ExecutorType.IO, new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(userId);
                    sb.append("_");
                    sb.append(str);
                    sb.append("_corner");
                    SharedPreferences access$000 = CornerMarkingDataProvider.this.a((Context) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), sb.toString());
                    if (access$000 == null) {
                        RVLogger.e("CornerMarkingDataProvider", "APSharedPreferences is null");
                        return;
                    }
                    SharedPreferences.Editor edit = access$000.edit();
                    StringBuilder sb2 = new StringBuilder("click_");
                    sb2.append(str2);
                    edit.putString(sb2.toString(), "1");
                    edit.apply();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public List<CornerMarkingData> a(JSONArray jSONArray, SharedPreferences sharedPreferences) {
        boolean z;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            CornerMarkingData cornerMarkingData = new CornerMarkingData();
            cornerMarkingData.superscript = jSONObject.getString("superscript");
            if (!TextUtils.isEmpty(cornerMarkingData.superscript)) {
                cornerMarkingData.noticeId = jSONObject.getString("noticeId");
                if (sharedPreferences != null) {
                    StringBuilder sb = new StringBuilder("click_");
                    sb.append(cornerMarkingData.noticeId);
                    if ("1".equals(sharedPreferences.getString(sb.toString(), "0"))) {
                    }
                }
                if (sharedPreferences != null) {
                    StringBuilder sb2 = new StringBuilder("expose_");
                    sb2.append(cornerMarkingData.noticeId);
                    if ("1".equals(sharedPreferences.getString(sb2.toString(), "0"))) {
                        z = true;
                        cornerMarkingData.exposed = z;
                        cornerMarkingData.action = jSONObject.getString("action");
                        cornerMarkingData.callback = jSONObject.getString("callback");
                        cornerMarkingData.icon = jSONObject.getString("icon");
                        cornerMarkingData.menuIconUrl = jSONObject.getString("menuIconUrl");
                        cornerMarkingData.mid = jSONObject.getString("mid");
                        cornerMarkingData.name = jSONObject.getString("name");
                        cornerMarkingData.options = jSONObject.getString(SecurityConstants.KEY_OPTIONS);
                        arrayList.add(cornerMarkingData);
                    }
                }
                z = false;
                cornerMarkingData.exposed = z;
                cornerMarkingData.action = jSONObject.getString("action");
                cornerMarkingData.callback = jSONObject.getString("callback");
                cornerMarkingData.icon = jSONObject.getString("icon");
                cornerMarkingData.menuIconUrl = jSONObject.getString("menuIconUrl");
                cornerMarkingData.mid = jSONObject.getString("mid");
                cornerMarkingData.name = jSONObject.getString("name");
                cornerMarkingData.options = jSONObject.getString(SecurityConstants.KEY_OPTIONS);
                arrayList.add(cornerMarkingData);
            }
        }
        return arrayList;
    }

    public void expose(final String str, final List<CornerMarkingData> list) {
        final String userId = GriverAccount.getUserId();
        if (!TextUtils.isEmpty(userId) && !TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            boolean z = false;
            for (CornerMarkingData next : list) {
                if (!next.exposed) {
                    next.exposed = true;
                    z = true;
                }
            }
            if (z) {
                ExecutorUtils.runNotOnMain(ExecutorType.IO, new Runnable() {
                    public void run() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(userId);
                        sb.append("_");
                        sb.append(str);
                        sb.append("_corner");
                        SharedPreferences access$000 = CornerMarkingDataProvider.this.a((Context) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), sb.toString());
                        if (access$000 == null) {
                            RVLogger.e("CornerMarkingDataProvider", "APSharedPreferences is null");
                            return;
                        }
                        SharedPreferences.Editor edit = access$000.edit();
                        for (CornerMarkingData cornerMarkingData : list) {
                            StringBuilder sb2 = new StringBuilder("expose_");
                            sb2.append(cornerMarkingData.noticeId);
                            edit.putString(sb2.toString(), "1");
                        }
                        edit.apply();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    @Nullable
    public SharedPreferences a(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1576184211, oncanceled);
                onCancelLoad.getMin(1576184211, oncanceled);
            }
        }
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
