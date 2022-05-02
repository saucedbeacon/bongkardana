package o;

import id.dana.ocr.model.SnapReceiptBroadcastData;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionHandlerException;
import o.APExpansion;
import o.APSecuritySdk;
import o.DeviceTokenClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\t\u0012\u0004\u0012\u00028\u00000\u00012\t\u0012\u0004\u0012\u00028\u00000\u00012\u00060rj\u0002`sB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0012\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\b¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00112!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0018J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010!J\u000f\u0010'\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010.\u001a\u00020\u0011H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001b\u0010:\u001a\u0004\u0018\u00010\u000f2\b\u00107\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b8\u00109J\u0011\u0010;\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u00107\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020\u0011H\u0016¢\u0006\u0004\bD\u0010-J8\u0010E\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001fH\u0002¢\u0006\u0004\bG\u0010(J8\u0010H\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\bH\u0010IJB\u0010J\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u00107\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0014¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020\u001fH\u0001¢\u0006\u0004\bR\u0010(J<\u0010T\u001a\u00020\u00112\u0006\u0010S\u001a\u00028\u00002#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bT\u0010UJH\u0010V\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bV\u0010WJ \u0010Z\u001a\u00020\u00112\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000XH\u0016ø\u0001\u0000¢\u0006\u0004\bZ\u0010+JZ\u0010]\u001a\u0004\u0018\u00010\b2\u0006\u00107\u001a\u00020[2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0011H\u0002¢\u0006\u0004\b_\u0010-J\u0011\u0010a\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b`\u0010<J\u000f\u0010b\u001a\u00020LH\u0016¢\u0006\u0004\bb\u0010NJ\u000f\u0010c\u001a\u00020\u001fH\u0002¢\u0006\u0004\bc\u0010(J#\u0010c\u001a\u0004\u0018\u00010\b2\u0006\u0010S\u001a\u00028\u00002\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bc\u0010dJH\u0010c\u001a\u0004\u0018\u00010\b2\u0006\u0010S\u001a\u00028\u00002\b\u0010\\\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bc\u0010eJJ\u0010g\u001a\u0004\u0018\u00010f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\\\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bg\u0010hJ\u0019\u0010j\u001a\u0004\u0018\u00010\b2\u0006\u0010i\u001a\u00020\u000fH\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u001fH\u0002¢\u0006\u0004\bl\u0010(J\u001b\u0010n\u001a\u00020\u0011*\u00020m2\u0006\u0010S\u001a\u00028\u0000H\u0016¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u00020\u0011*\u00020m2\u0006\u0010i\u001a\u00020\u000fH\u0016¢\u0006\u0004\bp\u0010qR\u001e\u0010v\u001a\n\u0018\u00010rj\u0004\u0018\u0001`s8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u001c\u0010x\u001a\u00020w8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010|\u001a\u0004\b}\u0010~R\u0016\u0010\u001a\u00020\u001f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0010(R\u0018\u0010\u0001\u001a\u00020\u001f8V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010(R\u0018\u0010\u0001\u001a\u00020\u001f8V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010(R/\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010S\u001a\u0005\u0018\u00010\u00018B@BX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0019\u00107\u001a\u0004\u0018\u00010\b8@@\u0000X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010<R\u0018\u0010\u0001\u001a\u00020L8B@\u0002X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010N\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "proposedUpdate", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlinx/coroutines/CancelHandler;", "handler", "", "cause", "", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "onCancellation", "callOnCancellation", "", "cancel", "(Ljava/lang/Throwable;)Z", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancelLater", "checkCompleted", "()Z", "token", "completeResume", "(Ljava/lang/Object;)V", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "state", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "", "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "resetStateReusable", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", "result", "resumeWith", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "setupCancellation", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "Lkotlinx/coroutines/DisposableHandle;", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setParentHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getStateDebugRepresentation", "stateDebugRepresentation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {1, 4, 2})
@PublishedApi
public class getNativeProp<T> extends createConfiguration<T> implements cy1<T>, CoroutineStackFrame {
    private static final /* synthetic */ AtomicReferenceFieldUpdater setMax;
    private static final /* synthetic */ AtomicIntegerFieldUpdater setMin;
    private volatile /* synthetic */ int _decision;
    volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;
    @NotNull
    private final CoroutineContext getMax;
    @NotNull
    private final Continuation<T> getMin;

    static {
        Class<getNativeProp> cls = getNativeProp.class;
        setMin = AtomicIntegerFieldUpdater.newUpdater(cls, "_decision");
        setMax = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @NotNull
    public final Continuation<T> toIntRange() {
        return this.getMin;
    }

    public getNativeProp(@NotNull Continuation<? super T> continuation, int i) {
        super(i);
        this.getMin = continuation;
        if (getApdidToken.setMax()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.getMax = this.getMin.getContext();
        this._decision = 0;
        this._state = ScanAttack.setMin;
        this._parentHandle = null;
    }

    @NotNull
    public CoroutineContext getContext() {
        return this.getMax;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        Continuation<T> continuation = this.getMin;
        return (continuation instanceof onSSLHandshake) && ((onSSLHandshake) continuation).length(this);
    }

    @JvmName(name = "resetStateReusable")
    public final boolean setMax() {
        if (getApdidToken.setMax()) {
            if (!(this.length == 2)) {
                throw new AssertionError();
            }
        }
        if (getApdidToken.setMax()) {
            if (!(((DeviceTokenClient.AnonymousClass1) this._parentHandle) != AbstractWrappedByteChannel.getMax)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (getApdidToken.setMax() && !(!(obj instanceof onTouchScreen))) {
            throw new AssertionError();
        } else if (!(obj instanceof getAD107) || ((getAD107) obj).getMin == null) {
            this._decision = 0;
            this._state = ScanAttack.setMin;
            return true;
        } else {
            DeviceTokenClient.AnonymousClass1 r0 = (DeviceTokenClient.AnonymousClass1) this._parentHandle;
            if (r0 != null) {
                r0.y_();
            }
            this._parentHandle = AbstractWrappedByteChannel.getMax;
            return false;
        }
    }

    public final void length() {
        DictionaryKeys dictionaryKeys;
        if (!isInside() && ((DeviceTokenClient.AnonymousClass1) this._parentHandle) == null && (dictionaryKeys = (DictionaryKeys) this.getMin.getContext().get(DictionaryKeys.getMax)) != null) {
            DeviceTokenClient.AnonymousClass1 max = dictionaryKeys.getMax(true, true, new vir1(this));
            this._parentHandle = max;
            if (equals() && !getMax()) {
                max.y_();
                this._parentHandle = AbstractWrappedByteChannel.getMax;
            }
        }
    }

    private final boolean isInside() {
        boolean equals = equals();
        if (!APSecuritySdk.TokenResult.setMin(this.length)) {
            return equals;
        }
        Continuation<T> continuation = this.getMin;
        Throwable th = null;
        if (!(continuation instanceof onSSLHandshake)) {
            continuation = null;
        }
        onSSLHandshake onsslhandshake = (onSSLHandshake) continuation;
        if (onsslhandshake == null) {
            return equals;
        }
        cy1 cy1 = this;
        while (true) {
            Object obj = onsslhandshake._reusableCancellableContinuation;
            if (obj == onClose.setMin) {
                if (onSSLHandshake.setMin.compareAndSet(onsslhandshake, onClose.setMin, cy1)) {
                    break;
                }
            } else if (obj != null) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
                } else if (onSSLHandshake.setMin.compareAndSet(onsslhandshake, obj, (Object) null)) {
                    th = (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        if (th == null) {
            return equals;
        }
        if (equals) {
            return true;
        }
        setMax(th);
        return true;
    }

    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.getMin;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(Throwable th) {
        if (!APSecuritySdk.TokenResult.setMin(this.length)) {
            return false;
        }
        Continuation<T> continuation = this.getMin;
        if (!(continuation instanceof onSSLHandshake)) {
            continuation = null;
        }
        onSSLHandshake onsslhandshake = (onSSLHandshake) continuation;
        if (onsslhandshake == null) {
            return false;
        }
        return onsslhandshake.setMax(th);
    }

    private void getMax(@NotNull xp3 xp3, @Nullable Throwable th) {
        try {
            xp3.setMin(th);
        } catch (Throwable th2) {
            APExpansion.AnonymousClass2.setMin(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for ".concat(String.valueOf(this)), th2));
        }
    }

    private void setMax(@NotNull Function1<? super Throwable, Unit> function1, @NotNull Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            APExpansion.AnonymousClass2.setMin(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for ".concat(String.valueOf(this)), th2));
        }
    }

    @NotNull
    public static Throwable length(@NotNull DictionaryKeys dictionaryKeys) {
        return dictionaryKeys.C_();
    }

    @Nullable
    @PublishedApi
    public final Object setMin() {
        DictionaryKeys dictionaryKeys;
        length();
        if (IsOverlapping()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object obj = this._state;
        if (obj instanceof APExpansion) {
            Throwable th = ((APExpansion) obj).setMax;
            Continuation continuation = this;
            if (getApdidToken.length() && (continuation instanceof CoroutineStackFrame)) {
                th = WebSocketCallbackAdapter.length(th, (CoroutineStackFrame) continuation);
            }
            throw th;
        } else if (!APSecuritySdk.TokenResult.getMax(this.length) || (dictionaryKeys = (DictionaryKeys) getContext().get(DictionaryKeys.getMax)) == null || dictionaryKeys.B_()) {
            return obj instanceof getAD107 ? ((getAD107) obj).getMax : obj;
        } else {
            Throwable C_ = dictionaryKeys.C_();
            setMin(obj, C_);
            Continuation continuation2 = this;
            if (getApdidToken.length() && (continuation2 instanceof CoroutineStackFrame)) {
                C_ = WebSocketCallbackAdapter.length(C_, (CoroutineStackFrame) continuation2);
            }
            throw C_;
        }
    }

    public void resumeWith(@NotNull Object obj) {
        cy1 cy1 = this;
        Throwable r1 = Result.m4exceptionOrNullimpl(obj);
        if (r1 != null) {
            Continuation continuation = cy1;
            if (getApdidToken.length()) {
                r1 = WebSocketCallbackAdapter.length(r1, (CoroutineStackFrame) continuation);
            }
            obj = new APExpansion(r1);
        }
        length(obj, this.length, (Function1<? super Throwable, Unit>) null);
    }

    public final void setMax(T t, @Nullable Function1<? super Throwable, Unit> function1) {
        length(t, this.length, function1);
    }

    private static void length(Function1<? super Throwable, Unit> function1, Object obj) {
        StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(function1);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static Object setMax(onTouchScreen ontouchscreen, Object obj, int i, Function1<? super Throwable, Unit> function1) {
        if (obj instanceof APExpansion) {
            getApdidToken.setMax();
            if (getApdidToken.setMax()) {
                if (!(function1 == null)) {
                    throw new AssertionError();
                }
            }
            return obj;
        } else if (!APSecuritySdk.TokenResult.getMax(i) || (function1 == null && (!(ontouchscreen instanceof xp3) || (ontouchscreen instanceof xp1)))) {
            return obj;
        } else {
            if (!(ontouchscreen instanceof xp3)) {
                ontouchscreen = null;
            }
            return new getAD107(obj, (xp3) ontouchscreen, function1, (Object) null, (Throwable) null, 16);
        }
    }

    @Nullable
    public final Object setMin(T t) {
        return length((Object) t, (Function1<? super Throwable, Unit>) null);
    }

    @Nullable
    public final Object setMin(T t, @Nullable Function1<? super Throwable, Unit> function1) {
        return length((Object) t, function1);
    }

    public final void getMax(@NotNull Object obj) {
        if (getApdidToken.setMax()) {
            if (!(obj == cy3.getMax)) {
                throw new AssertionError();
            }
        }
        int i = this.length;
        if (!toFloatRange()) {
            APSecuritySdk.TokenResult.getMin(this, i);
        }
    }

    public final void setMax(@NotNull APExpansion.AnonymousClass1 r4, T t) {
        APExpansion.AnonymousClass1 r0;
        Continuation<T> continuation = this.getMin;
        if (!(continuation instanceof onSSLHandshake)) {
            continuation = null;
        }
        onSSLHandshake onsslhandshake = (onSSLHandshake) continuation;
        if (onsslhandshake != null) {
            r0 = onsslhandshake.setMax;
        } else {
            r0 = null;
        }
        length(t, r0 == r4 ? 4 : this.length, (Function1<? super Throwable, Unit>) null);
    }

    public final <T> T getMin(@Nullable Object obj) {
        return obj instanceof getAD107 ? ((getAD107) obj).getMax : obj;
    }

    @Nullable
    public final Throwable length(@Nullable Object obj) {
        Throwable length = super.length(obj);
        if (length == null) {
            return null;
        }
        Continuation<T> continuation = this.getMin;
        return (!getApdidToken.length() || !(continuation instanceof CoroutineStackFrame)) ? length : WebSocketCallbackAdapter.length(length, (CoroutineStackFrame) continuation);
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(APSecuritySdk.InitResultListener.length(this.getMin));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof onTouchScreen) {
            str = "Active";
        } else {
            str = obj instanceof aesEncrypt ? "Cancelled" : SnapReceiptBroadcastData.Status.Completed;
        }
        sb.append(str);
        sb.append("}@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public final void setMin(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof onTouchScreen) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof APExpansion)) {
                if (obj2 instanceof getAD107) {
                    getAD107 getad107 = (getAD107) obj2;
                    if (!getad107.length()) {
                        if (setMax.compareAndSet(this, obj2, getAD107.setMin(getad107, (Object) null, (xp3) null, (Function1) null, (Object) null, th, 15))) {
                            xp3 xp3 = getad107.setMin;
                            if (xp3 != null) {
                                getMax(xp3, th);
                            }
                            Function1<Throwable, Unit> function1 = getad107.length;
                            if (function1 != null) {
                                setMax((Function1<? super Throwable, Unit>) function1, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (setMax.compareAndSet(this, obj2, new getAD107(obj2, (xp3) null, (Function1) null, (Object) null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean setMax(@Nullable Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof onTouchScreen)) {
                return false;
            }
            z = obj instanceof xp3;
        } while (!setMax.compareAndSet(this, obj, new aesEncrypt(this, th, z)));
        if (!z) {
            obj = null;
        }
        xp3 xp3 = (xp3) obj;
        if (xp3 != null) {
            getMax(xp3, th);
        }
        if (!getMax()) {
            DeviceTokenClient.AnonymousClass1 r5 = (DeviceTokenClient.AnonymousClass1) this._parentHandle;
            if (r5 != null) {
                r5.y_();
            }
            this._parentHandle = AbstractWrappedByteChannel.getMax;
        }
        int i = this.length;
        if (toFloatRange()) {
            return true;
        }
        APSecuritySdk.TokenResult.getMin(this, i);
        return true;
    }

    private final void getMax(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            APExpansion.AnonymousClass2.setMin(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for ".concat(String.valueOf(this)), th2));
        }
    }

    private final boolean IsOverlapping() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!setMin.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean toFloatRange() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!setMin.compareAndSet(this, 0, 2));
        return true;
    }

    private final void length(Object obj, int i, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof onTouchScreen) {
            } else {
                if (obj2 instanceof aesEncrypt) {
                    aesEncrypt aesencrypt = (aesEncrypt) obj2;
                    if (aesencrypt.getMax()) {
                        if (function1 != null) {
                            setMax(function1, aesencrypt.setMax);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)).toString());
            }
        } while (!setMax.compareAndSet(this, obj2, setMax((onTouchScreen) obj2, obj, i, function1)));
        if (!getMax()) {
            DeviceTokenClient.AnonymousClass1 r4 = (DeviceTokenClient.AnonymousClass1) this._parentHandle;
            if (r4 != null) {
                r4.y_();
            }
            this._parentHandle = AbstractWrappedByteChannel.getMax;
        }
        if (!toFloatRange()) {
            APSecuritySdk.TokenResult.getMin(this, i);
        }
    }

    private final closeBlocking length(Object obj, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof onTouchScreen) {
            } else {
                if (obj2 instanceof getAD107) {
                }
                return null;
            }
        } while (!setMax.compareAndSet(this, obj2, setMax((onTouchScreen) obj2, obj, this.length, function1)));
        if (!getMax()) {
            DeviceTokenClient.AnonymousClass1 r4 = (DeviceTokenClient.AnonymousClass1) this._parentHandle;
            if (r4 != null) {
                r4.y_();
            }
            this._parentHandle = AbstractWrappedByteChannel.getMax;
        }
        return cy3.getMax;
    }

    private boolean equals() {
        return !(this._state instanceof onTouchScreen);
    }

    @Nullable
    public final Object getMin() {
        return this._state;
    }

    public final void getMin(@NotNull Function1<? super Throwable, Unit> function1) {
        xp3 reportdynamicdata = function1 instanceof xp3 ? (xp3) function1 : new reportDynamicData(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof ScanAttack) {
                if (setMax.compareAndSet(this, obj, reportdynamicdata)) {
                    return;
                }
            } else if (obj instanceof xp3) {
                length(function1, obj);
            } else {
                boolean z = obj instanceof APExpansion;
                if (z) {
                    if (!((APExpansion) obj).getMin()) {
                        length(function1, obj);
                    }
                    if (obj instanceof aesEncrypt) {
                        Throwable th = null;
                        if (!z) {
                            obj = null;
                        }
                        APExpansion aPExpansion = (APExpansion) obj;
                        if (aPExpansion != null) {
                            th = aPExpansion.setMax;
                        }
                        getMax(function1, th);
                        return;
                    }
                    return;
                } else if (obj instanceof getAD107) {
                    getAD107 getad107 = (getAD107) obj;
                    if (getad107.setMin != null) {
                        length(function1, obj);
                    }
                    if (!(reportdynamicdata instanceof xp1)) {
                        if (getad107.length()) {
                            getMax(function1, getad107.setMax);
                            return;
                        } else {
                            if (setMax.compareAndSet(this, obj, getAD107.setMin(getad107, (Object) null, reportdynamicdata, (Function1) null, (Object) null, (Throwable) null, 29))) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else if (!(reportdynamicdata instanceof xp1)) {
                    if (setMax.compareAndSet(this, obj, new getAD107(obj, reportdynamicdata, (Function1) null, (Object) null, (Throwable) null, 28))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
