package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0014\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\fH'J1\u0010\u0010\u001a\u00020\f2'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0\u0012j\u0002`\u0015H&J:\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u00002#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H'¢\u0006\u0002\u0010\u0019J#\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00028\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0002\u0010\u001cJF\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H'¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\nH'J\u0019\u0010 \u001a\u00020\f*\u00020!2\u0006\u0010\u0017\u001a\u00028\u0000H'¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\f*\u00020!2\u0006\u0010\u001f\u001a\u00020\nH'R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006$"}, d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", "cancel", "cause", "", "completeResume", "", "token", "", "initCancellability", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "resume", "value", "onCancellation", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "tryResume", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeWithException", "exception", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public interface cy1<T> extends Continuation<T> {
    @InternalCoroutinesApi
    void getMax(@NotNull Object obj);

    void getMin(@NotNull Function1<? super Throwable, Unit> function1);

    @ExperimentalCoroutinesApi
    void setMax(T t, @Nullable Function1<? super Throwable, Unit> function1);

    @ExperimentalCoroutinesApi
    void setMax(@NotNull APExpansion.AnonymousClass1 r1, T t);

    boolean setMax(@Nullable Throwable th);

    @Nullable
    @InternalCoroutinesApi
    Object setMin(T t);

    @Nullable
    @InternalCoroutinesApi
    Object setMin(T t, @Nullable Function1<? super Throwable, Unit> function1);
}
