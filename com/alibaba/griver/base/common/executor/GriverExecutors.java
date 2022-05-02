package com.alibaba.griver.base.common.executor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.lang.Thread;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GriverExecutors {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Handler f9051a = new Handler(Looper.getMainLooper());
    private static ScheduledThreadPoolExecutor b = new ScheduledThreadPoolExecutor(20);
    private static Executor c = new Executor() {
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    };
    private static Executor d = new Executor() {
        public final void execute(@NonNull Runnable runnable) {
            GriverExecutors.f9051a.post(runnable);
        }
    };
    private static Executor e = new Executor() {
        public final void execute(@NonNull final Runnable runnable) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException unused) {
                    }
                    runnable.run();
                }
            }).start();
        }
    };
    private static Map<ExecutorType, Executor> f = new ConcurrentHashMap();
    private static Map<Integer, Executor> g = new ConcurrentHashMap();
    private static Executor h = null;

    /* renamed from: com.alibaba.griver.base.common.executor.GriverExecutors$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType[] r0 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType = r0
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.SYNC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.UI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.IDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT_DISPLAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.NORMAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.IO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.NETWORK     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.executor.GriverExecutors.AnonymousClass5.<clinit>():void");
        }
    }

    public static Executor getExecutor(final ExecutorType executorType) {
        GriverLogger.d("GriverExecutors", "get executor: ".concat(String.valueOf(executorType)));
        int i = AnonymousClass5.$SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType[executorType.ordinal()];
        if (i == 1) {
            return c;
        }
        if (i == 2) {
            return d;
        }
        if (i == 3) {
            return e;
        }
        Executor executor = f.get(executorType);
        if (executor != null) {
            return executor;
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 20, 1, TimeUnit.HOURS, new ArrayBlockingQueue(20), new ThreadFactory() {
            public final Thread newThread(@NonNull Runnable runnable) {
                return new Thread(runnable, executorType.name());
            }
        });
        f.put(executorType, threadPoolExecutor);
        return threadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getScheduledExecutor() {
        return b;
    }

    public static Executor getSingleMonitorThreadExecutor() {
        if (h == null) {
            h = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MINUTES, new ArrayBlockingQueue(40), new H5SingleThreadFactory("SingleOrderThreadExecutor"), new DiscardOldestPolicy());
        }
        return h;
    }

    public static synchronized Executor getSingleOrderThreadExecutorByName(String str) {
        synchronized (GriverExecutors.class) {
            if (str == null) {
                str = "";
            }
            Integer valueOf = Integer.valueOf(Math.abs(str.hashCode() % 32));
            if (g.containsKey(valueOf)) {
                Executor executor = g.get(valueOf);
                return executor;
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MINUTES, new PriorityBlockingQueue(40), new H5SingleThreadFactory("SingleOrderThreadExecutor_".concat(String.valueOf(valueOf))), new DiscardOldestPolicy());
            g.put(valueOf, threadPoolExecutor);
            return threadPoolExecutor;
        }
    }

    public static class DiscardOldestPolicy extends ThreadPoolExecutor.DiscardOldestPolicy {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            StringBuilder sb = new StringBuilder("Reject runnable ");
            sb.append(runnable);
            sb.append(" in ");
            sb.append(threadPoolExecutor);
            GriverLogger.d("GriverExecutors", sb.toString());
        }
    }

    public static class H5SingleThreadFactory implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f9162a;

        public H5SingleThreadFactory(String str) {
            this.f9162a = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9162a);
            sb.append("_");
            sb.append(thread.getId());
            thread.setName(sb.toString());
            thread.setPriority(5);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    GriverLogger.e("GriverExecutors", "H5SingleThreadFactory catchUncaughtException ".concat(String.valueOf(th)));
                }
            });
            return thread;
        }
    }
}
