package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.APSecuritySdk;
import o.DeviceTokenClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000N2\u00060>j\u0002`?2\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000f\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020!2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010%JH\u0010,\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2%\b\b\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010(H\bø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010\bH\b¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\bø\u0001\u0000¢\u0006\u0004\b1\u00102J \u00103\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00102J\u0011\u00106\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b4\u00105J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001e\u0010:\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b:\u0010;\u0012\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0018\u00010>j\u0004\u0018\u0001`?8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0016\u0010F\u001a\u00020\b8\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\bF\u0010;R\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0019\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138F@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "Lkotlinx/coroutines/CancellableContinuation;", "checkPostponedCancellation", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "requester", "", "isReusable", "(Lkotlinx/coroutines/CancellableContinuationImpl;)Z", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "resumeCancellableWith", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "state", "resumeCancelled", "(Ljava/lang/Object;)Z", "resumeUndispatchedWith", "(Ljava/lang/Object;)V", "resumeWith", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "", "toString", "()Ljava/lang/String;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "()V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "countOrElement", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getReusableCancellableContinuation", "reusableCancellableContinuation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;"}, k = 1, mv = {1, 4, 2})
public final class onSSLHandshake<T> extends createConfiguration<T> implements CoroutineStackFrame, Continuation<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater setMin = AtomicReferenceFieldUpdater.newUpdater(onSSLHandshake.class, Object.class, "_reusableCancellableContinuation");
    public volatile /* synthetic */ Object _reusableCancellableContinuation = null;
    @Nullable
    @JvmField
    public Object getMax = onClose.length;
    @NotNull
    @JvmField
    public final Object getMin = WebSocketClient.getMin(getContext());
    @NotNull
    @JvmField
    public final APExpansion.AnonymousClass1 setMax;
    @NotNull
    @JvmField
    public final Continuation<T> toFloatRange;

    @NotNull
    public final CoroutineContext getContext() {
        return this.toFloatRange.getContext();
    }

    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public onSSLHandshake(@NotNull APExpansion.AnonymousClass1 r2, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.setMax = r2;
        this.toFloatRange = continuation;
    }

    @Nullable
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.toFloatRange;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    public final boolean length(@NotNull getNativeProp<?> getnativeprop) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof getNativeProp) || obj == getnativeprop) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object getMin() {
        Object obj = this.getMax;
        if (getApdidToken.setMax()) {
            if (!(obj != onClose.length)) {
                throw new AssertionError();
            }
        }
        this.getMax = onClose.length;
        return obj;
    }

    @NotNull
    public final Continuation<T> toIntRange() {
        return this;
    }

    public final void resumeWith(@NotNull Object obj) {
        Object obj2;
        CoroutineContext context;
        Object min;
        CoroutineContext context2 = this.toFloatRange.getContext();
        Throwable r1 = Result.m4exceptionOrNullimpl(obj);
        if (r1 == null) {
            obj2 = obj;
        } else {
            obj2 = new APExpansion(r1);
        }
        if (this.setMax.setMax()) {
            this.getMax = obj2;
            this.length = 0;
            this.setMax.getMin(context2, this);
            return;
        }
        getApdidToken.setMax();
        isNeedRead isneedread = isNeedRead.setMin;
        DeviceTokenClient.InitResultListener min2 = isNeedRead.getMin();
        if (min2.toIntRange()) {
            this.getMax = obj2;
            this.length = 0;
            createConfiguration createconfiguration = this;
            removeAttribute<createConfiguration<?>> removeattribute = min2.getMax;
            if (removeattribute == null) {
                removeattribute = new removeAttribute<>();
                min2.getMax = removeattribute;
            }
            removeattribute.setMin(createconfiguration);
            return;
        }
        createConfiguration createconfiguration2 = this;
        min2.setMin += 4294967296L;
        try {
            context = getContext();
            min = WebSocketClient.getMin(context, this.getMin);
            this.toFloatRange.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
            WebSocketClient.length(context, min);
            do {
            } while (min2.toFloatRange());
            min2.setMax(true);
        } catch (Throwable th) {
            try {
                createconfiguration2.getMin(th, (Throwable) null);
            } finally {
                min2.setMax(true);
            }
        }
    }

    public final void setMin(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof getAD108) {
            ((getAD108) obj).length.invoke(th);
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append(this.setMax);
        sb.append(", ");
        sb.append(APSecuritySdk.InitResultListener.length(this.toFloatRange));
        sb.append(']');
        return sb.toString();
    }

    public final boolean setMax(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (Intrinsics.areEqual(obj, (Object) onClose.setMin)) {
                if (setMin.compareAndSet(this, onClose.setMin, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (setMin.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }
}
