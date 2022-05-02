package com.iap.ac.android.diagnoselog.core;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.common.config.IConfigChangeListener;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.diagnoselog.a.a;
import com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage;
import com.iap.ac.android.diagnoselog.storage.DiagnoseStorage;
import com.iap.ac.android.diagnoselog.util.ProcessUtil;
import com.iap.ac.android.loglite.api.AnalyticsHelper;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import com.iap.ac.android.rpc.RpcProxyImpl;
import com.iap.ac.android.rpc.multigateway.RpcGatewayController;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class DiagnoseLogContext implements IConfigChangeListener {
    public static final BlockingQueue<Runnable> h = new LinkedBlockingQueue(1024);
    public static DiagnoseLogContext i;

    /* renamed from: a  reason: collision with root package name */
    public DiagnoseStorage f9702a;
    public TraceLoggerImpl b;
    public ThreadPoolExecutor c;
    public Application d;
    public boolean e = false;
    public JSONObject f;
    public String g;

    public DiagnoseLogContext(Application application) {
        this.d = application;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, h, new ThreadPoolExecutor.DiscardOldestPolicy());
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.g = ProcessUtil.a(application);
        this.f9702a = new DiagnoseFileStorage(application, this.g, this.c);
        this.b = new TraceLoggerImpl();
        a();
        a((Context) application);
        JSONObject jSONConfig = ACConfig.getJSONConfig("DIAGNOSE_LOG_COMMAND");
        this.f = jSONConfig;
        a(jSONConfig);
    }

    public static DiagnoseLogContext b() {
        DiagnoseLogContext diagnoseLogContext = i;
        if (diagnoseLogContext != null) {
            return diagnoseLogContext;
        }
        throw new IllegalStateException("you should init before get");
    }

    public final void a() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.d.getCacheDir());
            sb.append("/diagnoseLogZip");
            File[] listFiles = new File(sb.toString()).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public String c() {
        return this.g;
    }

    public void onConfigChanged(@NonNull String str, @Nullable Object obj) {
        if (TextUtils.equals(str, "DIAGNOSE_LOG_COMMAND")) {
            JSONObject jSONObject = (JSONObject) obj;
            this.f = jSONObject;
            a(jSONObject);
        }
    }

    public void onSectionConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject) {
    }

    public final void a(Context context) {
        RpcAppInfo rpcAppInfo = new RpcAppInfo();
        rpcAppInfo.rpcGateWayUrl = "https://gw.zamcs.com/mgw.htm";
        rpcAppInfo.appId = "RTC2347987";
        rpcAppInfo.addHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, "default");
        RpcProxyImpl instance = RpcProxyImpl.getInstance("diagnoselog_biz");
        instance.initialize(context, rpcAppInfo);
        RPCProxyHost.setRpcProxy(instance, "diagnoselog_biz");
        RpcGatewayController.initGatewayController(context, "diagnoselog_biz");
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            LoggerWrapper.i("DiagnoseLogContext", "receive diagnose command --> ".concat(String.valueOf(jSONObject)));
            HashMap hashMap = new HashMap();
            hashMap.put("command", jSONObject.toString());
            AnalyticsHelper.sendBehaviorLog("dl_receiveDiagnoseCommand", hashMap);
            this.c.execute(new a(this, jSONObject.toString()));
        }
    }
}
