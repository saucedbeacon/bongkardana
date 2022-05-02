package com.alibaba.griver.base.common.monitor;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DebugMonitor {
    public static void reset() {
        final Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null && !a()) {
            GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                public final void run() {
                    synchronized (DebugMonitor.class) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(applicationContext.getExternalCacheDir());
                        sb.append("/griver/performance/");
                        File file = new File(sb.toString());
                        FileUtils.delete(file);
                        FileUtils.create(file.getAbsolutePath(), true);
                    }
                }
            });
        }
    }

    public static synchronized void writeDebugMonitor(String str, String str2, Map<String, String> map) {
        synchronized (DebugMonitor.class) {
            if (!a()) {
                if (TextUtils.equals(str, "RV_APP_STARTUP") || TextUtils.equals(str, "RV_APP_PAGE")) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("performanceId", str);
                    hashMap.put("bizType", str2);
                    hashMap.putAll(map);
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(JSON.toJSONString((Object) hashMap, true));
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append("\n##########\n");
                    a(sb2.toString());
                }
            }
        }
    }

    private static synchronized void a(final String str) {
        synchronized (DebugMonitor.class) {
            final Application applicationContext = GriverEnv.getApplicationContext();
            if (applicationContext != null) {
                try {
                    GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                        public final void run() {
                            synchronized (DebugMonitor.class) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(applicationContext.getExternalCacheDir());
                                sb.append("/griver/performance/mini_program_audit_performance.txt");
                                String obj = sb.toString();
                                File file = new File(obj);
                                if (!FileUtils.exists(file)) {
                                    FileUtils.create(file.getAbsolutePath(), true);
                                }
                                try {
                                    IOUtils.write(obj, str, true);
                                } catch (IOException e) {
                                    GriverLogger.e("DebugMonitor", "write file failed, just print", e);
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    GriverLogger.e("DebugMonitor", "write log failed, just print", th);
                }
            }
        }
    }

    private static boolean a() {
        return !TextUtils.equals(GriverInnerConfig.getConfig(GriverConfigConstants.KEY_WRITE_DEBUG_MONITOR), "YES");
    }
}
