package o;

import id.dana.data.config.source.amcs.result.OTCAcceptExpiryTimeConfigResult;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import o.GriverProgressBar;
import o.hasCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/domain/common/ScopeBackedScheduler;", "Lio/reactivex/Scheduler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "createWorker", "Lio/reactivex/Scheduler$Worker;", "ScopeBackedWorker", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class APWebBackForwardList extends hasCornerMarking {
    private final initToken scope;

    public APWebBackForwardList(@NotNull initToken inittoken) {
        Intrinsics.checkNotNullParameter(inittoken, "scope");
        this.scope = inittoken;
    }

    @NotNull
    public final hasCornerMarking.getMin createWorker() {
        return new length(this.scope);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/domain/common/ScopeBackedScheduler$ScopeBackedWorker;", "Lio/reactivex/Scheduler$Worker;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "dispose", "", "isDisposed", "", "schedule", "Lio/reactivex/disposables/Disposable;", "run", "Ljava/lang/Runnable;", "delay", "", "unit", "Ljava/util/concurrent/TimeUnit;", "domain_release"}, k = 1, mv = {1, 4, 2})
    static final class length extends hasCornerMarking.getMin {
        private final initToken getMin;
        private final getAD102 setMax;

        public length(@NotNull initToken inittoken) {
            Intrinsics.checkNotNullParameter(inittoken, "scope");
            this.getMin = inittoken;
            this.setMax = new readMore((DictionaryKeys) inittoken.getCoroutineContext().get(DictionaryKeys.getMax));
        }

        public final boolean isDisposed() {
            return !this.setMax.B_();
        }

        public final void dispose() {
            this.setMax.getMin((CancellationException) null);
        }

        @NotNull
        public final GriverProgressBar.UpdateRunnable setMin(@NotNull Runnable runnable, long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(runnable, "run");
            Intrinsics.checkNotNullParameter(timeUnit, OTCAcceptExpiryTimeConfigResult.JsonKey.UNIT);
            if (!isDisposed()) {
                return setCursiveFontFamily.asDisposable(xp4.getMin(this.getMin, this.setMax, (CoroutineStart) null, new C0052length(j, timeUnit, runnable, (Continuation) null), 2));
            }
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(emptyDisposable, "Disposables.disposed()");
            return emptyDisposable;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.domain.common.ScopeBackedScheduler$ScopeBackedWorker$schedule$1", f = "ScopeBackedScheduler.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.APWebBackForwardList$length$length  reason: collision with other inner class name */
        static final class C0052length extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
            final /* synthetic */ long $delay;
            final /* synthetic */ Runnable $run;
            final /* synthetic */ TimeUnit $unit;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0052length(long j, TimeUnit timeUnit, Runnable runnable, Continuation continuation) {
                super(2, continuation);
                this.$delay = j;
                this.$unit = timeUnit;
                this.$run = runnable;
            }

            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "completion");
                return new C0052length(this.$delay, this.$unit, this.$run, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0052length) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.$delay;
                    if (j > 0) {
                        long millis = this.$unit.toMillis(j);
                        this.label = 1;
                        if (getConfiguration.length(millis, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.$run.run();
                return Unit.INSTANCE;
            }
        }
    }
}
