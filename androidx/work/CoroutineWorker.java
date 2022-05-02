package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import o.APExpansion;
import o.AppCompatAutoCompleteTextView;
import o.DeviceTokenClient;
import o.DictionaryKeys;
import o.getAD102;
import o.getApkKeyHashBytes;
import o.getMinWidthMinor;
import o.getNativeProp;
import o.initToken;
import o.setAttachListener;
import o.setConfiguration;
import o.updateAppearance;
import o.xp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0016\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H@ø\u0001\u0000¢\u0006\u0002\u0010!J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0#R\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/CompletableJob;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStopped", "", "setForeground", "foregroundInfo", "Landroidx/work/ForegroundInfo;", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setProgress", "data", "Landroidx/work/Data;", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
public abstract class CoroutineWorker extends ListenableWorker {
    @NotNull
    private final APExpansion.AnonymousClass1 getMin;
    @NotNull
    final getAD102 length = new getApkKeyHashBytes((DictionaryKeys) null);
    @NotNull
    final setAttachListener<ListenableWorker.setMax> setMax;

    @Nullable
    public abstract Object getMin(@NotNull Continuation<? super ListenableWorker.setMax> continuation);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "params");
        setAttachListener<ListenableWorker.setMax> length2 = setAttachListener.length();
        Intrinsics.checkNotNullExpressionValue(length2, "SettableFuture.create()");
        this.setMax = length2;
        getMinWidthMinor taskExecutor = getTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(taskExecutor, "taskExecutor");
        length2.addListener(new Runnable(this) {
            final /* synthetic */ CoroutineWorker getMax;

            {
                this.getMax = r1;
            }

            public final void run() {
                if (this.getMax.setMax.isCancelled()) {
                    this.getMax.length.getMin((CancellationException) null);
                }
            }
        }, taskExecutor.getMin());
        this.getMin = DeviceTokenClient.getMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class getMin extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(CoroutineWorker coroutineWorker, Continuation continuation) {
            super(2, continuation);
            this.this$0 = coroutineWorker;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new getMin(this.this$0, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineWorker coroutineWorker = this.this$0;
                this.label = 1;
                obj = coroutineWorker.getMin(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    this.this$0.setMax.getMin(th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.setMax.getMax((ListenableWorker.setMax) obj);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public final Object getMin(@NotNull updateAppearance updateappearance, @NotNull Continuation<? super Unit> continuation) {
        Object obj;
        ListenableFuture<Void> progressAsync = setProgressAsync(updateappearance);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cause = e;
                }
                throw cause;
            }
        } else {
            getNativeProp getnativeprop = new getNativeProp(IntrinsicsKt.intercepted(continuation), 1);
            getnativeprop.length();
            progressAsync.addListener(new AppCompatAutoCompleteTextView.getMin(getnativeprop, progressAsync), DirectExecutor.INSTANCE);
            obj = getnativeprop.setMin();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    public final void onStopped() {
        super.onStopped();
        this.setMax.cancel(false);
    }

    @NotNull
    public final ListenableFuture<ListenableWorker.setMax> startWork() {
        xp4.getMin(setConfiguration.length(this.getMin.plus(this.length)), (CoroutineContext) null, (CoroutineStart) null, new getMin(this, (Continuation) null), 3);
        return this.setMax;
    }
}
