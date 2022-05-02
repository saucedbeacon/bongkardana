package com.google.android.play.core.ktx;

import com.google.android.play.core.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "com/google/android/play/core/ktx/TaskUtilsKt$runTask$3$1"}, k = 3, mv = {1, 1, 16})
final class TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Function0 $onCanceled$inlined;
    final /* synthetic */ Task $task$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1(Function0 function0, Task task) {
        super(1);
        this.$onCanceled$inlined = function0;
        this.$task$inlined = task;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        this.$onCanceled$inlined.invoke();
    }
}
