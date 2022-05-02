package o;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.WrappedByteChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ%\u0010\u001a\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J \u0010$\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0016ø\u0001\u0000¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0010H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0000X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collectContextSize", "", "completion", "Lkotlin/coroutines/Continuation;", "", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEmissionContext", "checkContext", "currentContext", "previousContext", "value", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "exceptionTransparencyViolated", "exception", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class BasicWebSocketContext<T> extends ContinuationImpl implements onWebsocketPong<T>, CoroutineStackFrame {
    @NotNull
    @JvmField
    public final CoroutineContext collectContext;
    @JvmField
    public final int collectContextSize;
    @NotNull
    @JvmField
    public final onWebsocketPong<T> collector;
    private Continuation<? super Unit> completion;
    private CoroutineContext lastEmissionContext;

    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "count", "<anonymous parameter 1>", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {
        public static final length INSTANCE = new length();

        length() {
            super(2);
        }

        public final int invoke(int i, @NotNull CoroutineContext.Element element) {
            return i + 1;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(invoke(((Number) obj).intValue(), (CoroutineContext.Element) obj2));
        }
    }

    public BasicWebSocketContext(@NotNull onWebsocketPong<? super T> onwebsocketpong, @NotNull CoroutineContext coroutineContext) {
        super(onWebsocketClose.length, EmptyCoroutineContext.INSTANCE);
        this.collector = onwebsocketpong;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, length.INSTANCE)).intValue();
    }

    @Nullable
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.completion;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getContext();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.CoroutineContext getContext() {
        /*
            r1 = this;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r1.completion
            if (r0 == 0) goto L_0x000a
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            if (r0 != 0) goto L_0x000e
        L_0x000a:
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BasicWebSocketContext.getContext():kotlin.coroutines.CoroutineContext");
    }

    @NotNull
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable r0 = Result.m4exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.lastEmissionContext = new onWebsocketCloseInitiated(r0);
        }
        Continuation<? super Unit> continuation = this.completion;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Nullable
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        try {
            Object emit = emit(continuation, t);
            if (emit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new onWebsocketCloseInitiated(th);
            throw th;
        }
    }

    private final Object emit(Continuation<? super Unit> continuation, T t) {
        CoroutineContext context = continuation.getContext();
        DictionaryKeys dictionaryKeys = (DictionaryKeys) context.get(DictionaryKeys.getMax);
        if (dictionaryKeys == null || dictionaryKeys.B_()) {
            CoroutineContext coroutineContext = this.lastEmissionContext;
            if (coroutineContext != context) {
                checkContext(context, coroutineContext, t);
            }
            this.completion = continuation;
            Function3 max = getAttribute.setMax;
            onWebsocketPong<T> onwebsocketpong = this.collector;
            if (onwebsocketpong != null) {
                return max.invoke(onwebsocketpong, t, this);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        }
        throw dictionaryKeys.C_();
    }

    private final void checkContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof onWebsocketCloseInitiated) {
            exceptionTransparencyViolated((onWebsocketCloseInitiated) coroutineContext2, t);
        }
        if (((Number) coroutineContext.fold(0, new WrappedByteChannel.setMin(this))).intValue() == this.collectContextSize) {
            this.lastEmissionContext = coroutineContext;
            return;
        }
        StringBuilder sb = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
        sb.append(this.collectContext);
        sb.append(",\n\t\tbut emission happened in ");
        sb.append(coroutineContext);
        sb.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(sb.toString().toString());
    }

    private final void exceptionTransparencyViolated(onWebsocketCloseInitiated onwebsocketcloseinitiated, Object obj) {
        StringBuilder sb = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        sb.append(onwebsocketcloseinitiated.getMax);
        sb.append(", but then emission attempt of value '");
        sb.append(obj);
        sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(StringsKt.trimIndent(sb.toString()).toString());
    }
}
