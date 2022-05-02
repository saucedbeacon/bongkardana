package o;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 4, 2})
public final class isHandShakeComplete extends isConnected {
    private volatile isHandShakeComplete _immediate;
    /* access modifiers changed from: private */
    public final Handler getMax;
    @NotNull
    private final isHandShakeComplete getMin;
    private final boolean length;
    private final String setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMax implements Runnable {
        final /* synthetic */ cy1 getMax;
        final /* synthetic */ isHandShakeComplete length;

        public setMax(isHandShakeComplete ishandshakecomplete, cy1 cy1) {
            this.length = ishandshakecomplete;
            this.getMax = cy1;
        }

        public final void run() {
            this.getMax.setMax((APExpansion.AnonymousClass1) this.length, Unit.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Runnable $block;
        final /* synthetic */ isHandShakeComplete this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(isHandShakeComplete ishandshakecomplete, Runnable runnable) {
            super(1);
            this.this$0 = ishandshakecomplete;
            this.$block = runnable;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Throwable th) {
            this.this$0.getMax.removeCallbacks(this.$block);
        }
    }

    private isHandShakeComplete(Handler handler, String str, boolean z) {
        super((byte) 0);
        this.getMax = handler;
        this.setMin = str;
        this.length = z;
        this._immediate = z ? this : null;
        isHandShakeComplete ishandshakecomplete = this._immediate;
        if (ishandshakecomplete == null) {
            ishandshakecomplete = new isHandShakeComplete(this.getMax, this.setMin, true);
            this._immediate = ishandshakecomplete;
            Unit unit = Unit.INSTANCE;
        }
        this.getMin = ishandshakecomplete;
    }

    public /* synthetic */ isHandShakeComplete(Handler handler) {
        this(handler, (byte) 0);
    }

    private isHandShakeComplete(@NotNull Handler handler, byte b) {
        this(handler, (String) null, false);
    }

    public final boolean setMax() {
        return !this.length || (Intrinsics.areEqual((Object) Looper.myLooper(), (Object) this.getMax.getLooper()) ^ true);
    }

    public final void getMin(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.getMax.post(runnable);
    }

    @NotNull
    public final String toString() {
        String min = setMin();
        if (min != null) {
            return min;
        }
        isHandShakeComplete ishandshakecomplete = this;
        String str = ishandshakecomplete.setMin;
        if (str == null) {
            str = ishandshakecomplete.getMax.toString();
        }
        if (!ishandshakecomplete.length) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".immediate");
        return sb.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof isHandShakeComplete) && ((isHandShakeComplete) obj).getMax == this.getMax;
    }

    public final int hashCode() {
        return System.identityHashCode(this.getMax);
    }

    public final void setMin(long j, @NotNull cy1<? super Unit> cy1) {
        Runnable setmax = new setMax(this, cy1);
        this.getMax.postDelayed(setmax, RangesKt.coerceAtMost(j, 4611686018427387903L));
        cy1.getMin(new setMin(this, setmax));
    }

    public final /* bridge */ /* synthetic */ onPageEnd length() {
        return this.getMin;
    }
}
