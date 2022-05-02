package o;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u001d\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0007*\u0004\u0018\u0001H\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"asDisposable", "Lio/reactivex/disposables/Disposable;", "Lkotlinx/coroutines/Job;", "asScheduler", "Lio/reactivex/Scheduler;", "Lkotlinx/coroutines/CoroutineScope;", "await", "T", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 2, mv = {1, 4, 2})
public final class setCursiveFontFamily {
    @NotNull
    public static final hasCornerMarking asScheduler(@NotNull initToken inittoken) {
        Intrinsics.checkNotNullParameter(inittoken, "$this$asScheduler");
        return new APWebBackForwardList(inittoken);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/domain/extension/CoroutinesExtKt$asDisposable$1", "Lio/reactivex/disposables/Disposable;", "dispose", "", "isDisposed", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements GriverProgressBar.UpdateRunnable {
        final /* synthetic */ DictionaryKeys $this_asDisposable;

        setMin(DictionaryKeys dictionaryKeys) {
            this.$this_asDisposable = dictionaryKeys;
        }

        public final boolean isDisposed() {
            return !this.$this_asDisposable.B_();
        }

        public final void dispose() {
            this.$this_asDisposable.getMin((CancellationException) null);
        }
    }

    @NotNull
    public static final GriverProgressBar.UpdateRunnable asDisposable(@NotNull DictionaryKeys dictionaryKeys) {
        Intrinsics.checkNotNullParameter(dictionaryKeys, "$this$asDisposable");
        return new setMin(dictionaryKeys);
    }

    @Nullable
    public static final <T> Object await(@Nullable T t, @NotNull Continuation<? super T> continuation) {
        getNativeProp getnativeprop = new getNativeProp(IntrinsicsKt.intercepted(continuation), 1);
        getnativeprop.length();
        cy1 cy1 = getnativeprop;
        if (t != null) {
            Result.Companion companion = Result.Companion;
            cy1.resumeWith(Result.m1constructorimpl(t));
        } else {
            Result.Companion companion2 = Result.Companion;
            cy1.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(new NullPointerException("Null return value"))));
        }
        Object min = getnativeprop.setMin();
        if (min == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return min;
    }
}
