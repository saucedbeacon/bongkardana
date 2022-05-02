package com.iap.ac.android.common.task;

import android.os.Bundle;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.threadpool.LifoBlockingDeque;
import com.iap.ac.android.common.task.threadpool.ScheduledPoolExecutor;
import com.iap.ac.android.common.task.threadpool.TaskFactory;
import com.iap.ac.android.common.task.threadpool.TaskPoolDiagnose;
import com.iap.ac.android.common.task.threadpool.TaskPoolExecutor;
import com.iap.ac.android.common.task.threadpool.TaskPoolRunnable;
import com.iap.ac.android.common.task.transaction.Transaction;
import com.iap.ac.android.common.utils.DeviceUtils;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TaskScheduleService {
    private static final int CPU_IDLE_COUNT = 2;
    private static final int CPU_IDLE_PERCENT = 50;
    private static final int IDLE_CHECK_PERIOD = 10;
    private static final int IDLE_TIMEOUT = 180;
    private static final int MAX_SIZE = 32;
    public static final int MAX_TASK_WEIGHT = 10;
    public static final int MIN_TASK_WEIGHT = -10;
    public static final int NORMAL_TASK_WEIGHT = 0;
    private static final String PIPELINE_NAME = TaskScheduleService.class.getName();
    private static final long PIPELINE_TIMEOUT = TimeUnit.SECONDS.toMillis(10);
    private static final String TAG = "TaskScheduleService";
    private int allPipelineFinished;
    private int cpuCoresNumber;
    private HashMap<ScheduleType, ThreadPoolExecutor> executorsMap = new HashMap<>();
    private ScheduledFuture<?> idleCheckTaskFuture;
    private PoolCfg ioPoolCfg;
    private boolean isExecuteIdleTasks;
    private AsyncTaskExecutor mAsyncTaskExecutor;
    private PoolCfg mmsDjangoPoolCfg;
    private PoolCfg mmsHttpPoolCfg;
    private PoolCfg normalPoolCfg;
    private OrderedExecutor<String> orderedExecutor;
    private ThreadPoolExecutor orderedExecutorCore;
    private PoolCfg orderedThreadPoolCfg;
    private PoolCfg rpcPoolCfg;
    private ScheduledThreadPoolExecutor scheduledExecutor;
    private PoolCfg urgentDisplayThreadPoolCfg;
    private PoolCfg urgentPoolCfg;

    public enum ScheduleType {
        UNKNOWN,
        URGENT_DISPLAY,
        URGENT,
        NORMAL,
        IO,
        RPC,
        SYNC,
        MMS_HTTP,
        MMS_DJANGO,
        ORDERED
    }

    public TaskScheduleService() {
        try {
            this.cpuCoresNumber = DeviceUtils.getNumberOfCPUCores();
        } catch (Throwable th) {
            ACLog.e(TAG, "in constructor", th);
        }
        if (this.cpuCoresNumber <= 0) {
            StringBuilder sb = new StringBuilder("revise to dual core, cpuCoresNumber: ");
            sb.append(this.cpuCoresNumber);
            ACLog.e(TAG, sb.toString());
            this.cpuCoresNumber = 2;
        }
        this.mAsyncTaskExecutor = AsyncTaskExecutor.getInstance();
        initializeThreadPools();
    }

    public void serialExecute(Runnable runnable) {
        this.mAsyncTaskExecutor.executeSerially(runnable);
    }

    public void parallelExecute(Runnable runnable) {
        this.mAsyncTaskExecutor.execute(runnable);
    }

    public void serialExecute(Runnable runnable, String str) {
        this.mAsyncTaskExecutor.executeSerially(runnable, str);
    }

    public void parallelExecute(Runnable runnable, String str) {
        this.mAsyncTaskExecutor.execute(runnable, str);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, String str, long j, TimeUnit timeUnit) {
        return this.mAsyncTaskExecutor.schedule(runnable, str, j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, String str, long j, long j2, TimeUnit timeUnit) {
        return this.mAsyncTaskExecutor.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, String str, long j, long j2, TimeUnit timeUnit) {
        return this.mAsyncTaskExecutor.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    /* access modifiers changed from: protected */
    public void onDestroy(Bundle bundle) {
        shutdownExecutorCommonly(this.mAsyncTaskExecutor);
        shutdownExecutorCommonly(this.scheduledExecutor);
        shutdownExecutorCommonly(this.orderedExecutorCore);
        synchronized (this.executorsMap) {
            for (ThreadPoolExecutor shutdownExecutorCommonly : this.executorsMap.values()) {
                shutdownExecutorCommonly(shutdownExecutorCommonly);
            }
        }
    }

    private void shutdownExecutorCommonly(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof TaskPoolExecutor) {
                    ((TaskPoolExecutor) obj).shutdownValidly();
                } else if (obj instanceof ScheduledPoolExecutor) {
                    ((ScheduledPoolExecutor) obj).shutdownValidly();
                } else if (obj instanceof ThreadPoolExecutor) {
                    ((ThreadPoolExecutor) obj).shutdown();
                } else if (obj instanceof AsyncTaskExecutor) {
                    ((AsyncTaskExecutor) obj).shutdown();
                } else {
                    ACLog.e(TAG, "shutdownExecutorCommonly, no such type: ".concat(String.valueOf(obj.getClass().getName())));
                }
            } catch (Throwable th) {
                ACLog.e(TAG, "", th);
            }
        }
    }

    public String addTransaction(Transaction transaction) {
        return this.mAsyncTaskExecutor.addTransaction(transaction);
    }

    public void removeTransaction(String str) {
        this.mAsyncTaskExecutor.removeTransaction(str);
    }

    private void initializeThreadPools() {
        this.ioPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.IO);
        this.urgentPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.URGENT);
        this.normalPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.NORMAL);
        this.rpcPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.RPC);
        this.mmsHttpPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.MMS_HTTP);
        this.mmsDjangoPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.MMS_DJANGO);
        this.orderedThreadPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.ORDERED);
        this.urgentDisplayThreadPoolCfg = new PoolCfg(TaskPoolRunnable.TaskType.URGENT_DISPLAY);
        this.ioPoolCfg = createIoPoolCfg(this.ioPoolCfg);
        this.urgentPoolCfg = createUrgentPoolCfg(this.urgentPoolCfg);
        this.normalPoolCfg = createNormalPoolCfg(this.normalPoolCfg);
        this.rpcPoolCfg = createRpcPoolCfg(this.rpcPoolCfg);
        this.mmsHttpPoolCfg = createMmsPoolCfg(this.mmsHttpPoolCfg, "HTTP");
        this.mmsDjangoPoolCfg = createMmsPoolCfg(this.mmsDjangoPoolCfg, "DJANGO");
        this.orderedThreadPoolCfg = createOrderedThreadPoolCfg(this.orderedThreadPoolCfg);
        this.urgentDisplayThreadPoolCfg = createUrgentDisplayPoolCfg(this.urgentDisplayThreadPoolCfg);
    }

    private PoolCfg createIoPoolCfg(PoolCfg poolCfg) {
        if (poolCfg.pushed_coreSize < 0) {
            int i = this.cpuCoresNumber;
            if (i <= 2) {
                poolCfg.coreSize = i;
            } else {
                poolCfg.coreSize = i;
            }
        } else {
            poolCfg.coreSize = Math.max(this.cpuCoresNumber, poolCfg.pushed_coreSize);
        }
        if (poolCfg.pushed_maxSize >= 0) {
            poolCfg.maxSize = Math.max(poolCfg.coreSize, poolCfg.pushed_maxSize);
        } else if (this.cpuCoresNumber <= 2) {
            poolCfg.maxSize = Math.max(poolCfg.coreSize, this.cpuCoresNumber + 1);
        } else {
            poolCfg.maxSize = Math.max(poolCfg.coreSize, this.cpuCoresNumber * 2);
        }
        if (poolCfg.pushed_keepAlive < 0) {
            poolCfg.keepAlive = 45;
        } else {
            poolCfg.keepAlive = poolCfg.pushed_keepAlive;
        }
        if (poolCfg.pushed_workQueue < 0) {
            poolCfg.workQueue = new LinkedBlockingQueue();
        } else {
            poolCfg.workQueue = new LinkedBlockingQueue(poolCfg.pushed_workQueue);
        }
        poolCfg.rejectHandler = new DiscardOldestPolicyWithStatics(poolCfg.taskType);
        poolCfg.factory = new TaskFactory("IO_THREAD_", 1);
        return poolCfg;
    }

    private PoolCfg createUrgentDisplayPoolCfg(PoolCfg poolCfg) {
        if (poolCfg.pushed_coreSize < 0) {
            int i = this.cpuCoresNumber;
            if (i <= 2) {
                poolCfg.coreSize = i;
            } else {
                poolCfg.coreSize = i * 2;
            }
            if (poolCfg.coreSize > 16) {
                poolCfg.coreSize = 16;
            }
        } else {
            poolCfg.coreSize = Math.max(this.cpuCoresNumber, poolCfg.pushed_coreSize);
        }
        if (poolCfg.pushed_maxSize < 0) {
            poolCfg.maxSize = 32;
        } else {
            poolCfg.maxSize = Math.max(poolCfg.coreSize, poolCfg.pushed_maxSize);
        }
        if (poolCfg.pushed_keepAlive < 0) {
            poolCfg.keepAlive = 3;
        } else {
            poolCfg.keepAlive = poolCfg.pushed_keepAlive;
        }
        if (poolCfg.pushed_workQueue < 0) {
            poolCfg.workQueue = new ArrayBlockingQueue(1);
        } else {
            poolCfg.workQueue = new ArrayBlockingQueue(poolCfg.pushed_workQueue, true);
        }
        poolCfg.rejectHandler = new DiscardOldestPolicyWithStatics(poolCfg.taskType);
        poolCfg.factory = new TaskFactory("URGENT_DISPLAY_THREAD_", 10);
        return poolCfg;
    }

    private PoolCfg createUrgentPoolCfg(PoolCfg poolCfg) {
        if (poolCfg.pushed_coreSize < 0) {
            poolCfg.coreSize = this.cpuCoresNumber;
            if (poolCfg.coreSize > 8) {
                poolCfg.coreSize = 8;
            }
        } else {
            poolCfg.coreSize = Math.max(this.cpuCoresNumber, poolCfg.pushed_coreSize);
        }
        if (poolCfg.pushed_maxSize < 0) {
            poolCfg.maxSize = 32;
        } else {
            poolCfg.maxSize = Math.max(poolCfg.coreSize, poolCfg.pushed_maxSize);
        }
        if (poolCfg.pushed_keepAlive < 0) {
            poolCfg.keepAlive = 3;
        } else {
            poolCfg.keepAlive = poolCfg.pushed_keepAlive;
        }
        if (poolCfg.pushed_workQueue < 0) {
            poolCfg.workQueue = new ArrayBlockingQueue(1);
        } else {
            poolCfg.workQueue = new ArrayBlockingQueue(poolCfg.pushed_workQueue, true);
        }
        poolCfg.rejectHandler = new DiscardOldestPolicyWithStatics(poolCfg.taskType);
        poolCfg.factory = new TaskFactory("URGENT_THREAD_", 5);
        return poolCfg;
    }

    private PoolCfg createNormalPoolCfg(PoolCfg poolCfg) {
        if (poolCfg.pushed_coreSize < 0) {
            poolCfg.coreSize = Math.min(4, this.cpuCoresNumber);
        } else {
            poolCfg.coreSize = Math.max(this.cpuCoresNumber, poolCfg.pushed_coreSize);
        }
        if (poolCfg.pushed_maxSize < 0) {
            poolCfg.maxSize = Integer.MAX_VALUE;
        } else {
            poolCfg.maxSize = Math.max(poolCfg.coreSize, poolCfg.pushed_maxSize);
        }
        if (poolCfg.pushed_keepAlive < 0) {
            poolCfg.keepAlive = 5;
        } else {
            poolCfg.keepAlive = poolCfg.pushed_keepAlive;
        }
        if (poolCfg.pushed_workQueue < 0) {
            poolCfg.workQueue = new LinkedBlockingQueue();
        } else {
            poolCfg.workQueue = new LinkedBlockingQueue(poolCfg.pushed_workQueue);
        }
        poolCfg.rejectHandler = new DiscardOldestPolicyWithStatics(poolCfg.taskType);
        poolCfg.factory = new TaskFactory("NORMAL_THREAD_", 1);
        return poolCfg;
    }

    private PoolCfg createRpcPoolCfg(PoolCfg poolCfg) {
        if (poolCfg.pushed_coreSize < 0) {
            poolCfg.coreSize = this.cpuCoresNumber;
            if (poolCfg.coreSize > 8) {
                poolCfg.coreSize = 8;
            }
        } else {
            poolCfg.coreSize = Math.max(this.cpuCoresNumber, poolCfg.pushed_coreSize);
        }
        if (poolCfg.pushed_maxSize < 0) {
            poolCfg.maxSize = 32;
        } else {
            poolCfg.maxSize = Math.max(poolCfg.coreSize, poolCfg.pushed_maxSize);
        }
        if (poolCfg.pushed_keepAlive < 0) {
            poolCfg.keepAlive = 10;
        } else {
            poolCfg.keepAlive = poolCfg.pushed_keepAlive;
        }
        if (poolCfg.pushed_workQueue < 0) {
            poolCfg.workQueue = new ArrayBlockingQueue(1);
        } else {
            poolCfg.workQueue = new LinkedBlockingQueue(poolCfg.pushed_workQueue);
        }
        poolCfg.rejectHandler = new DiscardOldestPolicyWithStatics(poolCfg.taskType);
        poolCfg.factory = new TaskFactory("RPC_INVOKER_THREAD_", 1);
        return poolCfg;
    }

    private PoolCfg createMmsPoolCfg(PoolCfg poolCfg, String str) {
        if (poolCfg.pushed_coreSize < 0) {
            int i = this.cpuCoresNumber;
            if (i <= 2) {
                poolCfg.coreSize = Math.min(i, 3);
            } else {
                poolCfg.coreSize = Math.min(i, 3);
            }
        } else {
            poolCfg.coreSize = Math.min(this.cpuCoresNumber, poolCfg.pushed_coreSize);
        }
        if (poolCfg.pushed_maxSize < 0) {
            int i2 = this.cpuCoresNumber;
            if (i2 <= 2) {
                poolCfg.maxSize = Math.min(i2, 3);
            } else {
                poolCfg.maxSize = Math.min(i2, 3);
            }
        } else {
            poolCfg.maxSize = Math.min(this.cpuCoresNumber, poolCfg.pushed_maxSize);
        }
        if (poolCfg.pushed_keepAlive < 0) {
            poolCfg.keepAlive = 20;
        } else {
            poolCfg.keepAlive = poolCfg.pushed_keepAlive;
        }
        poolCfg.workQueue = new LifoBlockingDeque();
        poolCfg.rejectHandler = new DiscardOldestPolicyWithStatics(poolCfg.taskType);
        StringBuilder sb = new StringBuilder("MMS_");
        sb.append(str);
        sb.append("_THREAD_");
        poolCfg.factory = new TaskFactory(sb.toString(), 1);
        return poolCfg;
    }

    private PoolCfg createOrderedThreadPoolCfg(PoolCfg poolCfg) {
        if (poolCfg.pushed_coreSize < 0) {
            int i = this.cpuCoresNumber;
            if (i <= 2) {
                poolCfg.coreSize = Math.max(i, 4);
            } else {
                poolCfg.coreSize = Math.max(i, 4);
            }
        } else {
            poolCfg.coreSize = Math.max(this.cpuCoresNumber, poolCfg.pushed_coreSize);
        }
        if (poolCfg.pushed_maxSize < 0) {
            int i2 = this.cpuCoresNumber;
            if (i2 <= 2) {
                poolCfg.maxSize = 4;
            } else {
                poolCfg.maxSize = i2 * 2;
            }
        } else {
            poolCfg.maxSize = Math.max(this.cpuCoresNumber, poolCfg.pushed_maxSize);
        }
        if (poolCfg.pushed_keepAlive < 0) {
            poolCfg.keepAlive = 10;
        } else {
            poolCfg.keepAlive = poolCfg.pushed_keepAlive;
        }
        if (poolCfg.pushed_workQueue < 0) {
            poolCfg.workQueue = new ArrayBlockingQueue(30);
        } else {
            poolCfg.workQueue = new ArrayBlockingQueue(poolCfg.pushed_workQueue);
        }
        poolCfg.rejectHandler = new DiscardOldestPolicyWithStatics(poolCfg.taskType);
        poolCfg.factory = new TaskFactory("ORDERED_THREAD_", 1);
        return poolCfg;
    }

    public ThreadPoolExecutor acquireExecutor(ScheduleType scheduleType) {
        if (scheduleType == ScheduleType.URGENT_DISPLAY) {
            ACLog.w(TAG, "acquire URGENT_DISPLAY executor, pls ensure your usage!!");
            ACLog.w(TAG, "acquire URGENT_DISPLAY executor, pls ensure your usage!!");
        }
        ThreadPoolExecutor threadPoolExecutor = this.executorsMap.get(scheduleType);
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        synchronized (this.executorsMap) {
            ThreadPoolExecutor threadPoolExecutor2 = this.executorsMap.get(scheduleType);
            if (threadPoolExecutor2 != null) {
                return threadPoolExecutor2;
            }
            ACLog.i(TAG, "acquireExecutor: ".concat(String.valueOf(scheduleType)));
            switch (AnonymousClass1.$SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType[scheduleType.ordinal()]) {
                case 1:
                    threadPoolExecutor2 = createExecutor(this.ioPoolCfg);
                    break;
                case 2:
                    threadPoolExecutor2 = createExecutor(this.urgentDisplayThreadPoolCfg);
                    break;
                case 3:
                    threadPoolExecutor2 = createExecutor(this.urgentPoolCfg);
                    break;
                case 4:
                    threadPoolExecutor2 = createExecutor(this.normalPoolCfg);
                    break;
                case 5:
                    threadPoolExecutor2 = createExecutor(this.rpcPoolCfg);
                    break;
                case 6:
                    throw new IllegalArgumentException("The ThreadPool of type SYNC is not supported yet, please considering another type!");
                case 7:
                    threadPoolExecutor2 = createExecutor(this.mmsHttpPoolCfg);
                    break;
                case 8:
                    threadPoolExecutor2 = createExecutor(this.mmsDjangoPoolCfg);
                    break;
            }
            if (threadPoolExecutor2 != null) {
                this.executorsMap.put(scheduleType, threadPoolExecutor2);
                return threadPoolExecutor2;
            }
            StringBuilder sb = new StringBuilder("create executor of type: ");
            sb.append(scheduleType);
            sb.append(" failed!");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: com.iap.ac.android.common.task.TaskScheduleService$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType;

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
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType[] r0 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType = r0
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.IO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.URGENT_DISPLAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.URGENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.RPC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.SYNC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.MMS_HTTP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$iap$ac$android$common$task$TaskScheduleService$ScheduleType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.iap.ac.android.common.task.TaskScheduleService$ScheduleType r1 = com.iap.ac.android.common.task.TaskScheduleService.ScheduleType.MMS_DJANGO     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.common.task.TaskScheduleService.AnonymousClass1.<clinit>():void");
        }
    }

    private ThreadPoolExecutor createExecutor(PoolCfg poolCfg) {
        if (poolCfg != null) {
            ACLog.i(TAG, "createExecutor: ".concat(String.valueOf(poolCfg)));
            return new TaskPoolExecutor(poolCfg.taskType, poolCfg.coreSize, poolCfg.maxSize, (long) poolCfg.keepAlive, poolCfg.timeunit, poolCfg.allowCoreTimeout, poolCfg.workQueue, poolCfg.factory, poolCfg.rejectHandler);
        }
        throw new IllegalArgumentException("cfg is null");
    }

    public ScheduledThreadPoolExecutor acquireScheduledExecutor() {
        if (this.scheduledExecutor == null) {
            synchronized (this) {
                if (this.scheduledExecutor == null) {
                    TaskFactory taskFactory = new TaskFactory("SCHEDULED_THREAD_", 5);
                    ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
                    int i = 8;
                    if (this.cpuCoresNumber <= 8) {
                        i = this.cpuCoresNumber;
                    }
                    this.scheduledExecutor = new ScheduledPoolExecutor(TaskPoolRunnable.TaskType.SCHEDULED, i, taskFactory, discardOldestPolicy);
                }
            }
        }
        return this.scheduledExecutor;
    }

    public OrderedExecutor<String> acquireOrderedExecutor() {
        if (this.orderedExecutor == null) {
            synchronized (this) {
                if (this.orderedExecutor == null) {
                    ThreadPoolExecutor createExecutor = createExecutor(this.orderedThreadPoolCfg);
                    this.orderedExecutorCore = createExecutor;
                    this.orderedExecutor = new OrderedExecutor<>(createExecutor);
                }
            }
        }
        return this.orderedExecutor;
    }

    public ThreadPoolExecutor getOrderedExecutorCore() {
        acquireOrderedExecutor();
        return this.orderedExecutorCore;
    }

    public Bundle dump() {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        synchronized (this.executorsMap) {
            for (ScheduleType next : this.executorsMap.keySet()) {
                bundle.putString(next.toString(), this.executorsMap.get(next).toString());
            }
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.scheduledExecutor;
        if (scheduledThreadPoolExecutor == null) {
            str = "NULL";
        } else {
            str = scheduledThreadPoolExecutor.toString();
        }
        bundle.putString("SCHEDULED_EXECUTOR", str);
        OrderedExecutor<String> orderedExecutor2 = this.orderedExecutor;
        if (orderedExecutor2 == null) {
            str2 = "NULL";
        } else {
            str2 = orderedExecutor2.toString();
        }
        bundle.putString("GLOBAL_HANDLER_THREAD", str2);
        return bundle;
    }

    public void pause(ScheduleType scheduleType) {
        try {
            ThreadPoolExecutor acquireExecutor = acquireExecutor(scheduleType);
            if (acquireExecutor instanceof TaskPoolExecutor) {
                ((TaskPoolExecutor) acquireExecutor).pause();
            }
        } catch (IllegalStateException e) {
            if (scheduleType != ScheduleType.ORDERED) {
                StringBuilder sb = new StringBuilder("pause executor:");
                sb.append(scheduleType);
                sb.append(" failed.");
                ACLog.e(TAG, sb.toString(), e);
            }
        }
        if (ScheduleType.ORDERED.equals(scheduleType)) {
            Executor executor = acquireOrderedExecutor().getExecutor();
            if (executor instanceof TaskPoolExecutor) {
                ((TaskPoolExecutor) executor).pause();
            }
        }
    }

    public void resume(ScheduleType scheduleType) {
        try {
            ThreadPoolExecutor acquireExecutor = acquireExecutor(scheduleType);
            if (acquireExecutor instanceof TaskPoolExecutor) {
                ((TaskPoolExecutor) acquireExecutor).resume();
            }
        } catch (IllegalStateException e) {
            if (scheduleType != ScheduleType.ORDERED) {
                StringBuilder sb = new StringBuilder("resume executor:");
                sb.append(scheduleType);
                sb.append(" failed.");
                ACLog.e(TAG, sb.toString(), e);
            }
        }
        if (ScheduleType.ORDERED.equals(scheduleType)) {
            Executor executor = acquireOrderedExecutor().getExecutor();
            if (executor instanceof TaskPoolExecutor) {
                ((TaskPoolExecutor) executor).resume();
            }
        }
    }

    static class PoolCfg {
        public boolean allowCoreTimeout = true;
        public int coreSize;
        public ThreadFactory factory;
        public int keepAlive;
        public int maxSize;
        public int pushed_coreSize = -1;
        public int pushed_keepAlive = -1;
        public int pushed_maxSize = -1;
        public int pushed_workQueue = -1;
        public RejectedExecutionHandler rejectHandler;
        public TaskPoolRunnable.TaskType taskType;
        public TimeUnit timeunit = TimeUnit.SECONDS;
        public BlockingQueue<Runnable> workQueue;

        public PoolCfg(TaskPoolRunnable.TaskType taskType2) {
            this.taskType = taskType2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PoolCfg{taskType=");
            sb.append(this.taskType);
            sb.append(",coreSize=");
            sb.append(this.coreSize);
            sb.append(",maxSize=");
            sb.append(this.maxSize);
            sb.append(",keepAlive=");
            sb.append(this.keepAlive);
            sb.append(",timeunit=");
            sb.append(this.timeunit);
            sb.append(",allowCoreTimeout=");
            sb.append(this.allowCoreTimeout);
            sb.append(",workQueueSize=");
            BlockingQueue<Runnable> blockingQueue = this.workQueue;
            sb.append(blockingQueue == null ? 0 : blockingQueue.size());
            sb.append(",factory=");
            ThreadFactory threadFactory = this.factory;
            String str = "null";
            sb.append(threadFactory == null ? str : threadFactory.getClass().getName());
            sb.append(",rejectHandler=");
            RejectedExecutionHandler rejectedExecutionHandler = this.rejectHandler;
            if (rejectedExecutionHandler != null) {
                str = rejectedExecutionHandler.getClass().getName();
            }
            sb.append(str);
            sb.append(",pushed_coreSize=");
            sb.append(this.pushed_coreSize);
            sb.append(",pushed_maxSize=");
            sb.append(this.pushed_maxSize);
            sb.append(",pushed_workQueue=");
            sb.append(this.pushed_workQueue);
            sb.append(",pushed_keepAlive=");
            sb.append(this.pushed_keepAlive);
            sb.append("}");
            return sb.toString();
        }
    }

    static class DiscardOldestPolicyWithStatics extends ThreadPoolExecutor.DiscardOldestPolicy {
        TaskPoolRunnable.TaskType taskType;

        DiscardOldestPolicyWithStatics(TaskPoolRunnable.TaskType taskType2) {
            this.taskType = taskType2;
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            TaskPoolDiagnose.taskWasDiscard(this.taskType, runnable);
        }
    }
}
