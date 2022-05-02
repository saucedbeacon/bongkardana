package androidx.core.app;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.util.SparseArray;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.attributeId;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 '2\u00020\u0001:\u0007'()*+,-B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0004\n\u0002\b\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0018\u00010\u0014R\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Landroidx/core/app/DANAJobIntentService;", "Landroid/app/job/JobService;", "()V", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "TAG", "", "kotlin.jvm.PlatformType", "TAG$1", "getExecutor", "()Ljava/util/concurrent/Executor;", "handler", "Landroid/os/Handler;", "runningIntentCount", "", "runningJobList", "Landroid/util/SparseArray;", "Landroidx/core/app/DANAJobIntentService$JobRunnable;", "runningWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "onCreate", "", "onDestroy", "onHandleWork", "intent", "Landroid/content/Intent;", "onHandlerMessage", "", "msg", "Landroid/os/Message;", "onStartCommand", "flags", "startId", "onStartJob", "params", "Landroid/app/job/JobParameters;", "onStopJob", "Companion", "EnqueueCompat", "EnqueueCompatNew", "EnqueueCompatOld", "JobRunnable", "NewJobRunnable", "OldIntentRunnable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class DANAJobIntentService extends JobService {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public static final Object equals = new Object();
    /* access modifiers changed from: private */
    public static PowerManager.WakeLock isInside;
    private final SparseArray<setMax> getMax;
    private final String getMin;
    private int length;
    private PowerManager.WakeLock setMax;
    private final Handler setMin;
    @NotNull
    private final Executor toFloatRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Landroidx/core/app/DANAJobIntentService$EnqueueCompat;", "", "()V", "enqueueWork", "", "context", "Landroid/content/Context;", "cn", "Landroid/content/ComponentName;", "jobId", "", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static abstract class length {
        public abstract void setMax(@NotNull Context context, @NotNull ComponentName componentName, int i, @NotNull Intent intent);
    }

    public abstract void onHandleWork(@NotNull Intent intent);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Landroid/os/Message;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class isInside extends FunctionReferenceImpl implements Function1<Message, Boolean> {
        isInside(DANAJobIntentService dANAJobIntentService) {
            super(1, dANAJobIntentService, DANAJobIntentService.class, "onHandlerMessage", "onHandlerMessage(Landroid/os/Message;)Z", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((Message) obj));
        }

        public final boolean invoke(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "p1");
            return ((DANAJobIntentService) this.receiver).getMax(message);
        }
    }

    public DANAJobIntentService(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.toFloatRange = executor;
        this.getMin = DANAJobIntentService.class.getName();
        this.setMin = new Handler(new attributeId(new isInside(this)));
        this.getMax = new SparseArray<>();
    }

    @NotNull
    public final Executor getExecutor() {
        return this.toFloatRange;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DANAJobIntentService() {
        /*
            r2 = this;
            java.util.concurrent.Executor r0 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.String r1 = "AsyncTask.SERIAL_EXECUTOR"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.DANAJobIntentService.<init>():void");
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT < 26) {
            Object systemService = getApplicationContext().getSystemService("power");
            if (systemService != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getName());
                sb.append(":running");
                PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, sb.toString());
                newWakeLock.setReferenceCounted(false);
                Unit unit = Unit.INSTANCE;
                this.setMax = newWakeLock;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        PowerManager.WakeLock wakeLock = this.setMax;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
        this.setMax = null;
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return 2;
        }
        synchronized (equals) {
            PowerManager.WakeLock wakeLock = isInside;
            if (wakeLock != null && wakeLock.isHeld()) {
                try {
                    wakeLock.release();
                } catch (Exception e) {
                    updateActionSheetContent.e(this.getMin, e.getMessage());
                }
            }
        }
        if (intent == null) {
            return 2;
        }
        this.length++;
        PowerManager.WakeLock wakeLock2 = this.setMax;
        if (wakeLock2 != null) {
            wakeLock2.acquire(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        }
        this.toFloatRange.execute(new toFloatRange(this, this.setMin, intent, i2));
        return 3;
    }

    public boolean onStartJob(@Nullable JobParameters jobParameters) {
        AtomicBoolean max;
        if (jobParameters == null) {
            return false;
        }
        int jobId = jobParameters.getJobId();
        setMax setmax = this.getMax.get(jobId);
        if (!(setmax == null || (max = setmax.setMax()) == null)) {
            max.set(true);
        }
        IsOverlapping isOverlapping = Build.VERSION.SDK_INT >= 26 ? new IsOverlapping(this, this.setMin, jobParameters) : null;
        if (isOverlapping != null) {
            this.getMax.put(jobId, isOverlapping);
            this.toFloatRange.execute(isOverlapping);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = r3.getJobId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStopJob(@org.jetbrains.annotations.Nullable android.app.job.JobParameters r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001e
            int r3 = r3.getJobId()
            android.util.SparseArray<androidx.core.app.DANAJobIntentService$setMax> r0 = r2.getMax
            java.lang.Object r0 = r0.get(r3)
            androidx.core.app.DANAJobIntentService$setMax r0 = (androidx.core.app.DANAJobIntentService.setMax) r0
            if (r0 == 0) goto L_0x001e
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.setMax()
            r1 = 1
            r0.set(r1)
            android.util.SparseArray<androidx.core.app.DANAJobIntentService$setMax> r0 = r2.getMax
            r0.remove(r3)
            return r1
        L_0x001e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.DANAJobIntentService.onStopJob(android.app.job.JobParameters):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean getMax(Message message) {
        PowerManager.WakeLock wakeLock;
        int i = message.what;
        if (i == 0) {
            Object obj = message.obj;
            if (obj != null) {
                stopSelf(((toFloatRange) obj).setMin);
                int i2 = this.length - 1;
                this.length = i2;
                if (i2 == 0 && (wakeLock = this.setMax) != null && wakeLock.isHeld()) {
                    try {
                        wakeLock.release();
                    } catch (Exception e) {
                        updateActionSheetContent.e(this.getMin, e.getMessage());
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.core.app.DANAJobIntentService.OldIntentRunnable");
            }
        } else if (i != 1) {
            return false;
        } else {
            Object obj2 = message.obj;
            if (obj2 != null) {
                IsOverlapping isOverlapping = (IsOverlapping) obj2;
                int jobId = isOverlapping.length().getJobId();
                if (Intrinsics.areEqual((Object) this.getMax.get(jobId), (Object) isOverlapping)) {
                    this.getMax.remove(jobId);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.core.app.DANAJobIntentService.NewJobRunnable");
            }
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/core/app/DANAJobIntentService$OldIntentRunnable;", "Ljava/lang/Runnable;", "serviceDANA", "Landroidx/core/app/DANAJobIntentService;", "handler", "Landroid/os/Handler;", "intent", "Landroid/content/Intent;", "startId", "", "(Landroidx/core/app/DANAJobIntentService;Landroid/os/Handler;Landroid/content/Intent;I)V", "getHandler", "()Landroid/os/Handler;", "getIntent", "()Landroid/content/Intent;", "getServiceDANA", "()Landroidx/core/app/DANAJobIntentService;", "getStartId", "()I", "run", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class toFloatRange implements Runnable {
        @NotNull
        private final DANAJobIntentService getMax;
        @NotNull
        private final Intent length;
        @NotNull
        private final Handler setMax;
        final int setMin;

        public toFloatRange(@NotNull DANAJobIntentService dANAJobIntentService, @NotNull Handler handler, @NotNull Intent intent, int i) {
            Intrinsics.checkNotNullParameter(dANAJobIntentService, "serviceDANA");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
            this.getMax = dANAJobIntentService;
            this.setMax = handler;
            this.length = intent;
            this.setMin = i;
        }

        public final void run() {
            this.getMax.onHandleWork(this.length);
            this.setMax.obtainMessage(0, this).sendToTarget();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/core/app/DANAJobIntentService$JobRunnable;", "", "()V", "stopRequested", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStopRequested", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static class setMax {
        @NotNull
        private final AtomicBoolean setMax = new AtomicBoolean(false);

        @NotNull
        public final AtomicBoolean setMax() {
            return this.setMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/core/app/DANAJobIntentService$NewJobRunnable;", "Landroidx/core/app/DANAJobIntentService$JobRunnable;", "Ljava/lang/Runnable;", "serviceDANA", "Landroidx/core/app/DANAJobIntentService;", "handler", "Landroid/os/Handler;", "params", "Landroid/app/job/JobParameters;", "(Landroidx/core/app/DANAJobIntentService;Landroid/os/Handler;Landroid/app/job/JobParameters;)V", "getHandler", "()Landroid/os/Handler;", "getParams", "()Landroid/app/job/JobParameters;", "getServiceDANA", "()Landroidx/core/app/DANAJobIntentService;", "next", "Landroid/app/job/JobWorkItem;", "run", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @TargetApi(26)
    static final class IsOverlapping extends setMax implements Runnable {
        @NotNull
        private final JobParameters getMax;
        @NotNull
        private final Handler getMin;
        @NotNull
        private final DANAJobIntentService setMin;

        @NotNull
        public final JobParameters length() {
            return this.getMax;
        }

        public IsOverlapping(@NotNull DANAJobIntentService dANAJobIntentService, @NotNull Handler handler, @NotNull JobParameters jobParameters) {
            Intrinsics.checkNotNullParameter(dANAJobIntentService, "serviceDANA");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(jobParameters, "params");
            this.setMin = dANAJobIntentService;
            this.getMin = handler;
            this.getMax = jobParameters;
        }

        public final void run() {
            JobWorkItem max;
            while (!setMax().get() && (max = getMax()) != null) {
                DANAJobIntentService dANAJobIntentService = this.setMin;
                Intent intent = max.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "work.intent");
                dANAJobIntentService.onHandleWork(intent);
                try {
                    this.getMax.completeWork(max);
                } catch (Exception e) {
                    updateActionSheetContent.e("JobIntentServiceX", e.getMessage());
                }
            }
            this.getMin.obtainMessage(1, this).sendToTarget();
        }

        @Nullable
        public final JobWorkItem getMax() {
            try {
                return this.getMax.dequeueWork();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/core/app/DANAJobIntentService$EnqueueCompatOld;", "Landroidx/core/app/DANAJobIntentService$EnqueueCompat;", "()V", "enqueueWork", "", "context", "Landroid/content/Context;", "cn", "Landroid/content/ComponentName;", "jobId", "", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends length {
        public final void setMax(@NotNull Context context, @NotNull ComponentName componentName, int i, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(componentName, "cn");
            Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
            synchronized (DANAJobIntentService.equals) {
                PowerManager.WakeLock access$getStartingWakeLock$cp = DANAJobIntentService.isInside;
                if (access$getStartingWakeLock$cp == null) {
                    Object systemService = context.getApplicationContext().getSystemService("power");
                    if (systemService != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(DANAJobIntentService.class.getName());
                        sb.append(":start");
                        access$getStartingWakeLock$cp = ((PowerManager) systemService).newWakeLock(1, sb.toString());
                        DANAJobIntentService.isInside = access$getStartingWakeLock$cp;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
                    }
                }
                if (access$getStartingWakeLock$cp != null) {
                    access$getStartingWakeLock$cp.acquire(15000);
                    Unit unit = Unit.INSTANCE;
                }
            }
            Intent intent2 = new Intent(intent);
            intent2.setComponent(componentName);
            context.startService(intent2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/core/app/DANAJobIntentService$EnqueueCompatNew;", "Landroidx/core/app/DANAJobIntentService$EnqueueCompat;", "()V", "enqueueWork", "", "context", "Landroid/content/Context;", "cn", "Landroid/content/ComponentName;", "jobId", "", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @TargetApi(26)
    public static final class getMin extends length {
        public final void setMax(@NotNull Context context, @NotNull ComponentName componentName, int i, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(componentName, "cn");
            Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
            Object systemService = context.getApplicationContext().getSystemService("jobscheduler");
            if (systemService != null) {
                JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
                builder.setOverrideDeadline(0);
                ((JobScheduler) systemService).enqueue(builder.build(), new JobWorkItem(intent));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J6\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00182\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/core/app/DANAJobIntentService$Companion;", "", "()V", "TAG", "", "WHAT_NEW_JOB_RUNNABLE_DONE", "", "WHAT_OLD_INTENT_RUNNABLE_DONE", "startingWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "startingWakeLockLock", "enqueueWork", "", "context", "Landroid/content/Context;", "cn", "Landroid/content/ComponentName;", "jobId", "intent", "Landroid/content/Intent;", "T", "Landroidx/core/app/DANAJobIntentService;", "cls", "Ljava/lang/Class;", "makeEnqueueCompat", "Landroidx/core/app/DANAJobIntentService$EnqueueCompat;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
