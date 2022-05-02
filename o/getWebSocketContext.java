package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0017\u0018\u00002\u00020C:\u0005JKLMNB\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\rH\b¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\f\b\u0000\u0010\u001c*\u00060\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00030 ¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00060\u0000j\u0002`\u00032\n\u0010#\u001a\u00060\u0000j\u0002`\u0003H\u0010¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0002J\u000f\u0010(\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0002J,\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J.\u00100\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rH\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0001¢\u0006\u0004\b3\u0010-J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00032\u0006\u0010:\u001a\u00020)H\u0001¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020\u00052\n\u0010>\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\t8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010/R\u0013\u0010\u0013\u001a\u00020C8F@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010G\u001a\u00060\u0000j\u0002`\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0017\u0010I\u001a\u00060\u0000j\u0002`\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010-¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "finishAdd", "helpRemove", "helpRemovePrev", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "remove", "()Z", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removeOrNext", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
@InternalCoroutinesApi
public class getWebSocketContext {
    static final /* synthetic */ AtomicReferenceFieldUpdater IsOverlapping;
    static final /* synthetic */ AtomicReferenceFieldUpdater equals;
    private static final /* synthetic */ AtomicReferenceFieldUpdater getMin;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    static {
        Class<getWebSocketContext> cls = getWebSocketContext.class;
        IsOverlapping = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        equals = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_prev");
        getMin = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_removedRef");
    }

    private final WSContextConstant setMax() {
        WSContextConstant wSContextConstant = (WSContextConstant) this._removedRef;
        if (wSContextConstant != null) {
            return wSContextConstant;
        }
        WSContextConstant wSContextConstant2 = new WSContextConstant(this);
        getMin.lazySet(this, wSContextConstant2);
        return wSContextConstant2;
    }

    @PublishedApi
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static abstract class length extends connectBlocking<getWebSocketContext> {
        @Nullable
        @JvmField
        public getWebSocketContext IsOverlapping;
        @NotNull
        @JvmField
        public final getWebSocketContext toIntRange;

        public final /* synthetic */ void setMin(Object obj, Object obj2) {
            getWebSocketContext getwebsocketcontext = (getWebSocketContext) obj;
            boolean z = obj2 == null;
            getWebSocketContext getwebsocketcontext2 = z ? this.toIntRange : this.IsOverlapping;
            if (getwebsocketcontext2 != null && getWebSocketContext.IsOverlapping.compareAndSet(getwebsocketcontext, this, getwebsocketcontext2) && z) {
                getWebSocketContext getwebsocketcontext3 = this.toIntRange;
                getWebSocketContext getwebsocketcontext4 = this.IsOverlapping;
                Intrinsics.checkNotNull(getwebsocketcontext4);
                getwebsocketcontext3.setMax(getwebsocketcontext4);
            }
        }

        public length(@NotNull getWebSocketContext getwebsocketcontext) {
            this.toIntRange = getwebsocketcontext;
        }
    }

    @NotNull
    public final getWebSocketContext equals() {
        getWebSocketContext values = values();
        if (values != null) {
            return values;
        }
        Object obj = this._prev;
        while (true) {
            getWebSocketContext getwebsocketcontext = (getWebSocketContext) obj;
            if (!getwebsocketcontext.z_()) {
                return getwebsocketcontext;
            }
            obj = getwebsocketcontext._prev;
        }
    }

    public static getWebSocketContext setMin(getWebSocketContext getwebsocketcontext) {
        while (getwebsocketcontext.z_()) {
            getwebsocketcontext = (getWebSocketContext) getwebsocketcontext._prev;
        }
        return getwebsocketcontext;
    }

    public final boolean getMax(@NotNull getWebSocketContext getwebsocketcontext) {
        equals.lazySet(getwebsocketcontext, this);
        IsOverlapping.lazySet(getwebsocketcontext, this);
        while (true) {
            Object obj = this._next;
            if (obj instanceof WebSocketContext) {
                ((WebSocketContext) obj).setMax(this);
            } else if (obj != this) {
                return false;
            } else {
                if (IsOverlapping.compareAndSet(this, this, getwebsocketcontext)) {
                    getwebsocketcontext.setMax(this);
                    return true;
                }
            }
        }
    }

    @PublishedApi
    public final boolean setMax(@NotNull getWebSocketContext getwebsocketcontext, @NotNull getWebSocketContext getwebsocketcontext2) {
        equals.lazySet(getwebsocketcontext, this);
        IsOverlapping.lazySet(getwebsocketcontext, getwebsocketcontext2);
        if (!IsOverlapping.compareAndSet(this, getwebsocketcontext2, getwebsocketcontext)) {
            return false;
        }
        getwebsocketcontext.setMax(getwebsocketcontext2);
        return true;
    }

    @PublishedApi
    public final int setMin(@NotNull getWebSocketContext getwebsocketcontext, @NotNull getWebSocketContext getwebsocketcontext2, @NotNull length length2) {
        equals.lazySet(getwebsocketcontext, this);
        IsOverlapping.lazySet(getwebsocketcontext, getwebsocketcontext2);
        length2.IsOverlapping = getwebsocketcontext2;
        if (!IsOverlapping.compareAndSet(this, getwebsocketcontext2, length2)) {
            return 0;
        }
        return length2.setMax(this) == null ? 1 : 2;
    }

    public boolean A_() {
        return IsOverlapping() == null;
    }

    @PublishedApi
    public final void FastBitmap$CoordinateSystem() {
        getWebSocketContext getwebsocketcontext = this;
        while (true) {
            Object obj = getwebsocketcontext._next;
            if (obj instanceof WebSocketContext) {
                ((WebSocketContext) obj).setMax(getwebsocketcontext);
            } else if (obj instanceof WSContextConstant) {
                getwebsocketcontext = ((WSContextConstant) obj).setMin;
            } else {
                getwebsocketcontext.values();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (IsOverlapping.compareAndSet(r3, r2, ((o.WSContextConstant) r4).setMin) == false) goto L_0x0000;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.getWebSocketContext values() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._prev
            o.getWebSocketContext r0 = (o.getWebSocketContext) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            r5 = r6
            o.getWebSocketContext r5 = (o.getWebSocketContext) r5
            if (r4 != r5) goto L_0x001a
            if (r0 != r2) goto L_0x0011
            return r2
        L_0x0011:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = equals
            boolean r0 = r1.compareAndSet(r6, r0, r2)
            if (r0 == 0) goto L_0x0000
            return r2
        L_0x001a:
            boolean r5 = r6.z_()
            if (r5 == 0) goto L_0x0021
            return r1
        L_0x0021:
            if (r4 != 0) goto L_0x0024
            return r2
        L_0x0024:
            boolean r5 = r4 instanceof o.WebSocketContext
            if (r5 == 0) goto L_0x002e
            o.WebSocketContext r4 = (o.WebSocketContext) r4
            r4.setMax(r2)
            goto L_0x0000
        L_0x002e:
            boolean r5 = r4 instanceof o.WSContextConstant
            if (r5 == 0) goto L_0x0045
            if (r3 == 0) goto L_0x0042
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = IsOverlapping
            o.WSContextConstant r4 = (o.WSContextConstant) r4
            o.getWebSocketContext r4 = r4.setMin
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 == 0) goto L_0x0000
            r2 = r3
            goto L_0x0006
        L_0x0042:
            java.lang.Object r4 = r2._prev
            goto L_0x0048
        L_0x0045:
            if (r4 == 0) goto L_0x004c
            r3 = r2
        L_0x0048:
            r2 = r4
            o.getWebSocketContext r2 = (o.getWebSocketContext) r2
            goto L_0x0007
        L_0x004c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r0.<init>(r1)
            goto L_0x0055
        L_0x0054:
            throw r0
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getWebSocketContext.values():o.getWebSocketContext");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    @NotNull
    public final Object toFloatRange() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof WebSocketContext)) {
                return obj;
            }
            ((WebSocketContext) obj).setMax(this);
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(getWebSocketContext getwebsocketcontext) {
        getWebSocketContext getwebsocketcontext2;
        Object obj;
        do {
            getwebsocketcontext2 = (getWebSocketContext) getwebsocketcontext._prev;
            while (true) {
                obj = this._next;
                if (!(obj instanceof WebSocketContext)) {
                    break;
                }
                ((WebSocketContext) obj).setMax(this);
            }
            if (obj != getwebsocketcontext) {
                return;
            }
        } while (!equals.compareAndSet(getwebsocketcontext, getwebsocketcontext2, this));
        if (z_()) {
            getwebsocketcontext.values();
        }
    }

    public boolean z_() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof WebSocketContext)) {
                return obj instanceof WSContextConstant;
            }
            ((WebSocketContext) obj).setMax(this);
        }
    }

    @NotNull
    public final getWebSocketContext isInside() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof WebSocketContext)) {
                return cancelTimeoutScheduleFuture.setMax(obj);
            }
            ((WebSocketContext) obj).setMax(this);
        }
    }

    @Nullable
    @PublishedApi
    public final getWebSocketContext IsOverlapping() {
        while (true) {
            Object obj = this._next;
            if (obj instanceof WebSocketContext) {
                ((WebSocketContext) obj).setMax(this);
            } else if (obj instanceof WSContextConstant) {
                return ((WSContextConstant) obj).setMin;
            } else {
                if (obj == this) {
                    return (getWebSocketContext) obj;
                }
                if (obj != null) {
                    getWebSocketContext getwebsocketcontext = (getWebSocketContext) obj;
                    if (IsOverlapping.compareAndSet(this, obj, getwebsocketcontext.setMax())) {
                        getwebsocketcontext.values();
                        return null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            }
        }
    }

    public final void toIntRange() {
        Object obj;
        while (true) {
            obj = this._next;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(this);
        }
        if (obj != null) {
            ((WSContextConstant) obj).setMin.values();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
    }
}
