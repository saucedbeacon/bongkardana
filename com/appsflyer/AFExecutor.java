package com.appsflyer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.appsflyer.share.Constants;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.constants.AnalyticEventConstant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.IntRange;

public class AFExecutor {

    /* renamed from: ॱ  reason: contains not printable characters */
    private static AFExecutor f8549;

    /* renamed from: ˊ  reason: contains not printable characters */
    public ScheduledExecutorService f8550;

    /* renamed from: ˋ  reason: contains not printable characters */
    public final ThreadFactory f8551 = new AnonymousClass5();

    /* renamed from: ˎ  reason: contains not printable characters */
    public Executor f8552;

    /* renamed from: ˏ  reason: contains not printable characters */
    public ScheduledExecutorService f8553;

    /* renamed from: com.appsflyer.AFExecutor$5  reason: invalid class name */
    class AnonymousClass5 implements ThreadFactory {
        AnonymousClass5() {
        }

        /* renamed from: com.appsflyer.AFExecutor$5$3  reason: invalid class name */
        public class AnonymousClass3 implements Runnable {

            /* renamed from: ॱ  reason: contains not printable characters */
            private /* synthetic */ Runnable f8556;

            AnonymousClass3(Runnable runnable) {
                this.f8556 = runnable;
            }

            public final void run() {
                TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                this.f8556.run();
            }

            AnonymousClass3() {
            }

            /* renamed from: ॱ  reason: contains not printable characters */
            public static boolean m1121(Context context, String str) {
                int length = IntRange.length(context, str);
                StringBuilder sb = new StringBuilder("is Permission Available: ");
                sb.append(str);
                sb.append("; res: ");
                sb.append(length);
                AFLogger.afRDLog(sb.toString());
                return length == 0;
            }

            /* renamed from: ˏ  reason: contains not printable characters */
            static Map<String, String> m1120(Context context, Map<String, String> map, Uri uri) {
                boolean z;
                int i;
                if (uri.getQuery() != null) {
                    z = false;
                    for (String str : uri.getQuery().split("&")) {
                        int indexOf = str.indexOf(SimpleComparison.EQUAL_TO_OPERATION);
                        String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
                        if (!map.containsKey(substring)) {
                            if (substring.equals("c")) {
                                substring = "campaign";
                            } else if (substring.equals(Constants.URL_MEDIA_SOURCE)) {
                                substring = AnalyticEventConstant.AE_MEDIA_SOURCE;
                            } else if (substring.equals("af_prt")) {
                                z = true;
                                substring = "agency";
                            }
                            map.put(substring, "");
                        }
                        map.put(substring, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : str.substring(i));
                    }
                } else {
                    z = false;
                }
                try {
                    if (!map.containsKey("install_time")) {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j = packageInfo.firstInstallTime;
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        map.put("install_time", simpleDateFormat.format(new Date(j)));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e);
                }
                if (uri.getQueryParameter("af_deeplink") != null && !map.containsKey(AnalyticEventConstant.AE_AF_STATUS)) {
                    map.put(AnalyticEventConstant.AE_AF_STATUS, "Non-organic");
                }
                if (z) {
                    map.remove(AnalyticEventConstant.AE_MEDIA_SOURCE);
                }
                String path = uri.getPath();
                if (path != null) {
                    map.put("path", path);
                }
                String scheme = uri.getScheme();
                if (scheme != null) {
                    map.put("scheme", scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    map.put("host", host);
                }
                return map;
            }
        }

        public final Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new AnonymousClass3(runnable));
        }

        AnonymousClass5() {
        }

        /* renamed from: ˊ  reason: contains not printable characters */
        static Map<String, String> m1119(@NonNull Context context) {
            HashMap hashMap = new HashMap();
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
                hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
                hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
                hashMap.put(GriverMonitorConstants.KEY_SIZE, String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
                hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
                hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th);
            }
            return hashMap;
        }
    }

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f8549 == null) {
            f8549 = new AFExecutor();
        }
        return f8549;
    }

    public Executor getThreadPoolExecutor() {
        Executor executor = this.f8552;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f8552).isTerminated() || ((ThreadPoolExecutor) this.f8552).isTerminating()))) {
            this.f8552 = Executors.newFixedThreadPool(2, this.f8551);
        }
        return this.f8552;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˏ  reason: contains not printable characters */
    public final ScheduledThreadPoolExecutor m1118() {
        ScheduledExecutorService scheduledExecutorService = this.f8550;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f8550.isTerminated()) {
            this.f8550 = Executors.newScheduledThreadPool(2, this.f8551);
        }
        return (ScheduledThreadPoolExecutor) this.f8550;
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    public static void m1117(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
