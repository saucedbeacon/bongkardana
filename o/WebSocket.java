package o;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt"}, k = 4, mv = {1, 4, 2})
public final class WebSocket {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\u00028\u0000X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/SendElement;", "E", "Lkotlinx/coroutines/channels/Send;", "pollResult", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public class Role<E> extends getDraft {
        private final E getMax;
        @NotNull
        @JvmField
        public final cy1<Unit> length;

        public final E setMax() {
            return this.getMax;
        }

        public Role(E e, @NotNull cy1<? super Unit> cy1) {
            this.getMax = e;
            this.length = cy1;
        }

        @Nullable
        public final closeBlocking getMin() {
            Object min = this.length.setMin(Unit.INSTANCE);
            if (min == null) {
                return null;
            }
            if (getApdidToken.setMax()) {
                if (!(min == cy3.getMax)) {
                    throw new AssertionError();
                }
            }
            return cy3.getMax;
        }

        public final void length() {
            this.length.getMax(cy3.getMax);
        }

        public final void getMin(@NotNull batch<?> batch) {
            Continuation continuation = this.length;
            Throwable th = batch.setMax;
            if (th == null) {
                th = new ClosedSendChannelException("Channel was closed");
            }
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(th)));
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append('(');
            sb.append(this.getMax);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016R&\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00028\u0000`\t8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/SendElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/SendElement;", "pollResult", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "onUndeliveredElement", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)V", "remove", "", "undeliveredElement", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public final class READYSTATE<E> extends Role<E> {
        @NotNull
        @JvmField
        public final Function1<E, Unit> setMax;

        public READYSTATE(E e, @NotNull cy1<? super Unit> cy1, @NotNull Function1<? super E, Unit> function1) {
            super(e, cy1);
            this.setMax = function1;
        }

        public final boolean A_() {
            if (!super.A_()) {
                return false;
            }
            Function1<E, Unit> function1 = this.setMax;
            Object max = setMax();
            CoroutineContext context = this.length.getContext();
            UndeliveredElementException max2 = AbstractClientProxyChannel.getMax(function1, max, (UndeliveredElementException) null);
            if (max2 == null) {
                return true;
            }
            APExpansion.AnonymousClass2.setMin(context, max2);
            return true;
        }

        public final void getMax() {
            Function1<E, Unit> function1 = this.setMax;
            Object max = setMax();
            CoroutineContext context = this.length.getContext();
            UndeliveredElementException max2 = AbstractClientProxyChannel.getMax(function1, max, (UndeliveredElementException) null);
            if (max2 != null) {
                APExpansion.AnonymousClass2.setMin(context, max2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.PublishedApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setMin(@org.jetbrains.annotations.NotNull o.isFlushAndClose<?> r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0017
            boolean r1 = r3 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r0 = r3
        L_0x0009:
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            if (r0 != 0) goto L_0x0017
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Channel was consumed, consumer had failed"
            r0.<init>(r1)
            r0.initCause(r3)
        L_0x0017:
            r2.getMin((java.util.concurrent.CancellationException) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebSocket.setMin(o.isFlushAndClose, java.lang.Throwable):void");
    }
}
