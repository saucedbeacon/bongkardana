package o;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import o.WebSocket;
import o.getWebSocketContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000005:\u0004abcdB)\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00032\u0018\u0010$\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`#H\u0016¢\u0006\u0004\b%\u0010\u0007J\u0019\u0010&\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102JX\u00108\u001a\u00020\u0003\"\u0004\b\u0001\u001032\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010,2\u0006\u0010\u0010\u001a\u00028\u00002(\u00107\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000106\u0012\u0006\u0012\u0004\u0018\u00010\u001a04H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010:J\u001d\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010;2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b>\u0010:J\u0017\u0010?\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;H\u0014¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ+\u0010F\u001a\u00020\u0003*\u0006\u0012\u0002\b\u0003062\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020C8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\bH\u0010ER\u001c\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001c\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0016\u0010O\u001a\u00020\n8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\n8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010PR\u0013\u0010R\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0016\u0010S\u001a\u00020\n8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bS\u0010PR\u0016\u0010T\u001a\u00020\n8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bT\u0010PR%\u0010X\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000050U8F@\u0006¢\u0006\u0006\u001a\u0004\bV\u0010WR0\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00048\u0004@\u0005X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010YR\u001c\u0010[\u001a\u00020Z8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020C8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b_\u0010E\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "", "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "helpCloseAndGetSendException", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", "", "toString", "()Ljava/lang/String;", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "isBufferAlwaysFull", "()Z", "isBufferFull", "isClosedForSend", "isFull", "isFullImpl", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public abstract class socket<E> implements getReadyState<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater setMax = AtomicReferenceFieldUpdater.newUpdater(socket.class, Object.class, "onCloseHandler");
    @Nullable
    @JvmField
    protected final Function1<E, Unit> getMax = null;
    private volatile /* synthetic */ Object onCloseHandler = null;
    @NotNull
    private final onFragment setMin = new onFragment();

    /* access modifiers changed from: protected */
    @NotNull
    public String invoke() {
        return "";
    }

    /* access modifiers changed from: protected */
    public abstract boolean toFloatRange();

    /* access modifiers changed from: protected */
    public abstract boolean toIntRange();

    /* access modifiers changed from: protected */
    @NotNull
    public final onFragment isInside() {
        return this.setMin;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public Object setMax(E e) {
        isClosed equals;
        closeBlocking min;
        do {
            equals = equals();
            if (equals == null) {
                return isInboundDone.getMin;
            }
            min = equals.getMin(e);
        } while (min == null);
        if (getApdidToken.setMax()) {
            if (!(min == cy3.getMax)) {
                throw new AssertionError();
            }
        }
        equals.D_();
        return equals.setMin();
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final batch<?> IsOverlapping() {
        onFragment onfragment = this.setMin;
        getWebSocketContext values = onfragment.values();
        if (values == null) {
            values = getWebSocketContext.setMin((getWebSocketContext) onfragment._prev);
        }
        if (!(values instanceof batch)) {
            values = null;
        }
        batch<?> batch = (batch) values;
        if (batch == null) {
            return null;
        }
        setMax(batch);
        return batch;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class length extends getWebSocketContext.length {
        final /* synthetic */ getWebSocketContext getMin;
        final /* synthetic */ socket setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(getWebSocketContext getwebsocketcontext, getWebSocketContext getwebsocketcontext2, socket socket) {
            super(getwebsocketcontext2);
            this.getMin = getwebsocketcontext;
            this.setMin = socket;
        }

        public final /* synthetic */ Object setMin() {
            if (this.setMin.toIntRange()) {
                return null;
            }
            return cancelTimeoutScheduleFuture.setMax();
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final batch<?> values() {
        Object obj;
        onFragment onfragment = this.setMin;
        while (true) {
            obj = onfragment._next;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(onfragment);
        }
        getWebSocketContext max = cancelTimeoutScheduleFuture.setMax(obj);
        if (!(max instanceof batch)) {
            max = null;
        }
        batch<?> batch = (batch) max;
        if (batch == null) {
            return null;
        }
        setMax(batch);
        return batch;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final getDraft toDoubleRange() {
        getWebSocketContext getwebsocketcontext;
        getWebSocketContext IsOverlapping;
        getWebSocketContext getwebsocketcontext2 = this.setMin;
        while (true) {
            Object obj = getwebsocketcontext2._next;
            if (obj instanceof WebSocketContext) {
                ((WebSocketContext) obj).setMax(getwebsocketcontext2);
            } else if (obj != null) {
                getwebsocketcontext = (getWebSocketContext) obj;
                if (getwebsocketcontext != getwebsocketcontext2 && (getwebsocketcontext instanceof getDraft)) {
                    if (((((getDraft) getwebsocketcontext) instanceof batch) && !getwebsocketcontext.z_()) || (IsOverlapping = getwebsocketcontext.IsOverlapping()) == null) {
                        break;
                    }
                    IsOverlapping.FastBitmap$CoordinateSystem();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        getwebsocketcontext = null;
        return (getDraft) getwebsocketcontext;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final isClosed<?> length(E e) {
        getWebSocketContext values;
        getWebSocketContext getwebsocketcontext = this.setMin;
        getWebSocketContext getmax = new getMax(e);
        do {
            values = getwebsocketcontext.values();
            if (values == null) {
                values = getWebSocketContext.setMin((getWebSocketContext) getwebsocketcontext._prev);
            }
            if (values instanceof isClosed) {
                return (isClosed) values;
            }
        } while (!values.setMax(getmax, getwebsocketcontext));
        return null;
    }

    public final boolean FastBitmap$CoordinateSystem() {
        return IsOverlapping() != null;
    }

    private boolean setMax() {
        Object obj;
        onFragment onfragment = this.setMin;
        while (true) {
            obj = onfragment._next;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(onfragment);
        }
        return !(cancelTimeoutScheduleFuture.setMax(obj) instanceof isClosed) && toIntRange();
    }

    @Nullable
    public final Object getMin(E e, @NotNull Continuation<? super Unit> continuation) {
        WebSocket.Role role;
        if (setMax(e) == isInboundDone.length) {
            return Unit.INSTANCE;
        }
        getNativeProp<? super Unit> max = JNIBridge.getMax(IntrinsicsKt.intercepted(continuation));
        cy1 cy1 = max;
        while (true) {
            if (setMax()) {
                if (this.getMax == null) {
                    role = new WebSocket.Role(e, cy1);
                } else {
                    role = new WebSocket.READYSTATE(e, cy1, this.getMax);
                }
                Object max2 = getMax((getDraft) role);
                if (max2 == null) {
                    cy1.getMin(new onLostFocus(role));
                    break;
                } else if (max2 instanceof batch) {
                    setMin(cy1, e, (batch) max2);
                    break;
                } else if (max2 != isInboundDone.setMin && !(max2 instanceof getLocalSocketAddress)) {
                    throw new IllegalStateException("enqueueSend returned ".concat(String.valueOf(max2)).toString());
                }
            }
            Object max3 = setMax(e);
            if (max3 == isInboundDone.length) {
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                cy1.resumeWith(Result.m1constructorimpl(unit));
                break;
            } else if (max3 != isInboundDone.getMin) {
                if (max3 instanceof batch) {
                    setMin(cy1, e, (batch) max3);
                } else {
                    throw new IllegalStateException("offerInternal returned ".concat(String.valueOf(max3)).toString());
                }
            }
        }
        Object min = max.setMin();
        if (min == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return min == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? min : Unit.INSTANCE;
    }

    public final boolean setMin(E e) {
        Object max = setMax(e);
        if (max == isInboundDone.length) {
            return true;
        }
        if (max == isInboundDone.getMin) {
            batch<?> IsOverlapping = IsOverlapping();
            if (IsOverlapping == null) {
                return false;
            }
            throw WebSocketCallbackAdapter.getMin(setMin(e, IsOverlapping));
        } else if (max instanceof batch) {
            throw WebSocketCallbackAdapter.getMin(setMin(e, (batch) max));
        } else {
            throw new IllegalStateException("offerInternal returned ".concat(String.valueOf(max)).toString());
        }
    }

    private final Throwable setMin(E e, batch<?> batch) {
        UndeliveredElementException max;
        setMax(batch);
        Function1<E, Unit> function1 = this.getMax;
        if (function1 == null || (max = AbstractClientProxyChannel.getMax(function1, e, (UndeliveredElementException) null)) == null) {
            Throwable th = batch.setMax;
            return th == null ? new ClosedSendChannelException("Channel was closed") : th;
        }
        Throwable th2 = max;
        Throwable th3 = batch.setMax;
        if (th3 == null) {
            th3 = new ClosedSendChannelException("Channel was closed");
        }
        ExceptionsKt.addSuppressed(th2, th3);
        throw th2;
    }

    private final void setMin(Continuation<?> continuation, E e, batch<?> batch) {
        UndeliveredElementException max;
        setMax(batch);
        Throwable th = batch.setMax;
        if (th == null) {
            th = new ClosedSendChannelException("Channel was closed");
        }
        Function1<E, Unit> function1 = this.getMax;
        if (function1 == null || (max = AbstractClientProxyChannel.getMax(function1, e, (UndeliveredElementException) null)) == null) {
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(th)));
            return;
        }
        Throwable th2 = max;
        ExceptionsKt.addSuppressed(th2, th);
        Result.Companion companion2 = Result.Companion;
        continuation.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(th2)));
    }

    /* access modifiers changed from: protected */
    @Nullable
    public Object getMax(@NotNull getDraft getdraft) {
        boolean z;
        getWebSocketContext values;
        if (toFloatRange()) {
            getWebSocketContext getwebsocketcontext = this.setMin;
            do {
                values = getwebsocketcontext.values();
                if (values == null) {
                    values = getWebSocketContext.setMin((getWebSocketContext) getwebsocketcontext._prev);
                }
                if (values instanceof isClosed) {
                    return values;
                }
            } while (!values.setMax(getdraft, getwebsocketcontext));
            return null;
        }
        getWebSocketContext getwebsocketcontext2 = this.setMin;
        getWebSocketContext getwebsocketcontext3 = getdraft;
        getWebSocketContext.length length2 = new length(getwebsocketcontext3, getwebsocketcontext3, this);
        while (true) {
            getWebSocketContext values2 = getwebsocketcontext2.values();
            if (values2 == null) {
                values2 = getWebSocketContext.setMin((getWebSocketContext) getwebsocketcontext2._prev);
            }
            if (!(values2 instanceof isClosed)) {
                int min = values2.setMin(getwebsocketcontext3, getwebsocketcontext2, length2);
                z = true;
                if (min != 1) {
                    if (min == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return values2;
            }
        }
        if (!z) {
            return isInboundDone.setMin;
        }
        return null;
    }

    public final boolean getMax(@Nullable Throwable th) {
        boolean z;
        Object obj;
        batch batch = new batch(th);
        getWebSocketContext getwebsocketcontext = this.setMin;
        while (true) {
            getWebSocketContext values = getwebsocketcontext.values();
            if (values == null) {
                values = getWebSocketContext.setMin((getWebSocketContext) getwebsocketcontext._prev);
            }
            if (!(values instanceof batch)) {
                if (values.setMax(batch, getwebsocketcontext)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            onFragment onfragment = this.setMin;
            Object values2 = onfragment.values();
            if (values2 == null) {
                values2 = getWebSocketContext.setMin((getWebSocketContext) onfragment._prev);
            }
            if (values2 != null) {
                batch = (batch) values2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
            }
        }
        setMax((batch<?>) batch);
        if (z && (obj = this.onCloseHandler) != null && obj != isInboundDone.isInside && setMax.compareAndSet(this, obj, isInboundDone.isInside)) {
            ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(th);
        }
        return z;
    }

    public final void getMin(@NotNull Function1<? super Throwable, Unit> function1) {
        if (!setMax.compareAndSet(this, (Object) null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == isInboundDone.isInside) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: ".concat(String.valueOf(obj)));
        }
        batch<?> IsOverlapping = IsOverlapping();
        if (IsOverlapping != null && setMax.compareAndSet(this, function1, isInboundDone.isInside)) {
            function1.invoke(IsOverlapping.setMax);
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public isClosed<E> equals() {
        getWebSocketContext getwebsocketcontext;
        getWebSocketContext IsOverlapping;
        getWebSocketContext getwebsocketcontext2 = this.setMin;
        while (true) {
            Object obj = getwebsocketcontext2._next;
            if (obj instanceof WebSocketContext) {
                ((WebSocketContext) obj).setMax(getwebsocketcontext2);
            } else if (obj != null) {
                getwebsocketcontext = (getWebSocketContext) obj;
                if (getwebsocketcontext != getwebsocketcontext2 && (getwebsocketcontext instanceof isClosed)) {
                    if (((((isClosed) getwebsocketcontext) instanceof batch) && !getwebsocketcontext.z_()) || (IsOverlapping = getwebsocketcontext.IsOverlapping()) == null) {
                        break;
                    }
                    IsOverlapping.FastBitmap$CoordinateSystem();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        getwebsocketcontext = null;
        return (isClosed) getwebsocketcontext;
    }

    @NotNull
    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('{');
        getWebSocketContext isInside = this.setMin.isInside();
        if (isInside == this.setMin) {
            str = "EmptyQueue";
        } else {
            if (isInside instanceof batch) {
                str2 = isInside.toString();
            } else if (isInside instanceof getLocalSocketAddress) {
                str2 = "ReceiveQueued";
            } else if (isInside instanceof getDraft) {
                str2 = "SendQueued";
            } else {
                str2 = "UNEXPECTED:".concat(String.valueOf(isInside));
            }
            getWebSocketContext equals = this.setMin.equals();
            if (equals != isInside) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(",queueSize=");
                sb2.append(length());
                str = sb2.toString();
                if (equals instanceof batch) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(",closedForSend=");
                    sb3.append(equals);
                    str = sb3.toString();
                }
            } else {
                str = str2;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(invoke());
        return sb.toString();
    }

    private final int length() {
        Object obj;
        onFragment onfragment = this.setMin;
        while (true) {
            obj = onfragment._next;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(onfragment);
        }
        if (obj != null) {
            int i = 0;
            for (getWebSocketContext getwebsocketcontext = (getWebSocketContext) obj; !Intrinsics.areEqual((Object) getwebsocketcontext, (Object) onfragment); getwebsocketcontext = getwebsocketcontext.isInside()) {
                if (getwebsocketcontext instanceof getWebSocketContext) {
                    i++;
                }
            }
            return i;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class getMax<E> extends getDraft {
        @JvmField
        public final E getMax;

        public final void length() {
        }

        public getMax(E e) {
            this.getMax = e;
        }

        @Nullable
        public final Object setMax() {
            return this.getMax;
        }

        @Nullable
        public final closeBlocking getMin() {
            return cy3.getMax;
        }

        public final void getMin(@NotNull batch<?> batch) {
            if (getApdidToken.setMax()) {
                throw new AssertionError();
            }
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SendBuffered@");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append('(');
            sb.append(this.getMax);
            sb.append(')');
            return sb.toString();
        }
    }

    private static void setMax(batch<?> batch) {
        Object obj;
        Object obj2 = null;
        while (true) {
            getWebSocketContext values = batch.values();
            if (values == null) {
                values = getWebSocketContext.setMin((getWebSocketContext) batch._prev);
            }
            if (!(values instanceof getLocalSocketAddress)) {
                values = null;
            }
            getLocalSocketAddress getlocalsocketaddress = (getLocalSocketAddress) values;
            if (getlocalsocketaddress == null) {
                if (obj2 == null) {
                    return;
                }
                if (!(obj2 instanceof ArrayList)) {
                    ((getLocalSocketAddress) obj2).setMin(batch);
                    return;
                } else if (obj2 != null) {
                    ArrayList arrayList = (ArrayList) obj2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((getLocalSocketAddress) arrayList.get(size)).setMin(batch);
                    }
                    return;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
                }
            } else if (!getlocalsocketaddress.A_()) {
                while (true) {
                    obj = getlocalsocketaddress._next;
                    if (!(obj instanceof WebSocketContext)) {
                        break;
                    }
                    ((WebSocketContext) obj).setMax(getlocalsocketaddress);
                }
                if (obj != null) {
                    ((WSContextConstant) obj).setMin.values();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
                }
            } else {
                obj2 = setWebSocketContext.getMax(obj2, getlocalsocketaddress);
            }
        }
    }
}
