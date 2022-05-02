package com.google.android.play.core.ktx;

import com.google.android.play.core.tasks.Task;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.cy1;
import o.getNativeProp;
import o.getReadyState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a%\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0000¢\u0006\u0002\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"runTask", "T", "task", "Lcom/google/android/play/core/tasks/Task;", "onCanceled", "Lkotlin/Function0;", "", "(Lcom/google/android/play/core/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryOffer", "", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "tmp.wkwm2e3_release"}, k = 2, mv = {1, 1, 16})
public final class TaskUtilsKt {
    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = TaskUtilsKt$runTask$2.INSTANCE;
        }
        return runTask(task, function0, continuation);
    }

    public static final <E> boolean tryOffer(@NotNull getReadyState<? super E> getreadystate, E e) {
        Intrinsics.checkParameterIsNotNull(getreadystate, "$this$tryOffer");
        try {
            return getreadystate.setMin(e);
        } catch (Exception unused) {
            return false;
        }
    }

    @Nullable
    public static final <T> Object runTask(@NotNull Task<T> task, @NotNull Function0<Unit> function0, @NotNull Continuation<? super T> continuation) {
        getNativeProp getnativeprop = new getNativeProp(IntrinsicsKt.intercepted(continuation), 1);
        getnativeprop.length();
        cy1 cy1 = getnativeprop;
        cy1.getMin(new TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1(function0, task));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new TaskUtilsKt$runTask$3$2(cy1));
            Intrinsics.checkExpressionValueIsNotNull(task.addOnFailureListener(new TaskUtilsKt$runTask$3$3(cy1)), "task.addOnFailureListene…ithException(exception) }");
        } else if (task.isSuccessful()) {
            T result = task.getResult();
            Result.Companion companion = Result.Companion;
            cy1.resumeWith(Result.m1constructorimpl(result));
        } else {
            Continuation continuation2 = cy1;
            Exception exception = task.getException();
            if (exception == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(exception, "task.exception!!");
            Result.Companion companion2 = Result.Companion;
            continuation2.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(exception)));
        }
        Object min = getnativeprop.setMin();
        if (min == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return min;
    }
}
