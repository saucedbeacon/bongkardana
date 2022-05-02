package o;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000CB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00105\u001a\u00020\u00128D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00128D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b7\u00106R\u0016\u00108\u001a\u00020\u00128D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0016\u00109\u001a\u00020\u00128D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b9\u00106R\u0016\u0010:\u001a\u00020\u00128V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0016\u0010;\u001a\u00020\u00128V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0016\u0010<\u001a\u00020\u00128V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b<\u00106R\u001a\u0010?\u001a\u00060=j\u0002`>8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010A¨\u0006B"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "currentSize", "element", "enqueueElement", "(ILjava/lang/Object;)V", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "ensureCapacity", "(I)V", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "I", "head", "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "isFull", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, k = 1, mv = {1, 4, 2})
public final class transfereTo<E> extends configureBlocking<E> {
    private final int isInside;
    private Object[] length;
    private int setMax;
    private final ReentrantLock setMin;
    private volatile /* synthetic */ int size;
    private final BufferOverflow toIntRange;

    /* access modifiers changed from: protected */
    public final boolean setMin() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange() {
        return false;
    }

    public transfereTo(int i, @NotNull BufferOverflow bufferOverflow) {
        this.isInside = i;
        this.toIntRange = bufferOverflow;
        if (i > 0) {
            this.setMin = new ReentrantLock();
            Object[] objArr = new Object[Math.min(this.isInside, 8)];
            ArraysKt.fill$default(objArr, (Object) isInboundDone.getMax, 0, 0, 6, (Object) null);
            Unit unit = Unit.INSTANCE;
            this.length = objArr;
            this.size = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("ArrayChannel capacity must be at least 1, but ");
        sb.append(this.isInside);
        sb.append(" was specified");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* access modifiers changed from: protected */
    public final boolean getMax() {
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    public final boolean toIntRange() {
        return this.size == this.isInside && this.toIntRange == BufferOverflow.SUSPEND;
    }

    public final boolean length() {
        Lock lock = this.setMin;
        lock.lock();
        try {
            return super.length();
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setMax(E r8) {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.setMin
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            int r1 = r7.size     // Catch:{ all -> 0x00de }
            o.batch r2 = r7.IsOverlapping()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x0013
            r0.unlock()
            return r2
        L_0x0013:
            int r2 = r7.isInside     // Catch:{ all -> 0x00de }
            r3 = 0
            r4 = 1
            if (r1 >= r2) goto L_0x001f
            int r2 = r1 + 1
            r7.size = r2     // Catch:{ all -> 0x00de }
        L_0x001d:
            r2 = r3
            goto L_0x003d
        L_0x001f:
            kotlinx.coroutines.channels.BufferOverflow r2 = r7.toIntRange     // Catch:{ all -> 0x00de }
            int[] r5 = o.finishConnect.length     // Catch:{ all -> 0x00de }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x00de }
            r2 = r5[r2]     // Catch:{ all -> 0x00de }
            if (r2 == r4) goto L_0x003b
            r5 = 2
            if (r2 == r5) goto L_0x0038
            r5 = 3
            if (r2 != r5) goto L_0x0032
            goto L_0x001d
        L_0x0032:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00de }
            r8.<init>()     // Catch:{ all -> 0x00de }
            throw r8     // Catch:{ all -> 0x00de }
        L_0x0038:
            o.closeBlocking r2 = o.isInboundDone.length     // Catch:{ all -> 0x00de }
            goto L_0x003d
        L_0x003b:
            o.closeBlocking r2 = o.isInboundDone.getMin     // Catch:{ all -> 0x00de }
        L_0x003d:
            if (r2 == 0) goto L_0x0043
            r0.unlock()
            return r2
        L_0x0043:
            r2 = 0
            if (r1 != 0) goto L_0x008f
        L_0x0046:
            o.isClosed r5 = r7.equals()     // Catch:{ all -> 0x00de }
            if (r5 != 0) goto L_0x004d
            goto L_0x008f
        L_0x004d:
            boolean r6 = r5 instanceof o.batch     // Catch:{ all -> 0x00de }
            if (r6 == 0) goto L_0x005a
            r7.size = r1     // Catch:{ all -> 0x00de }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ all -> 0x00de }
            r0.unlock()
            return r5
        L_0x005a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ all -> 0x00de }
            o.closeBlocking r6 = r5.getMin(r8)     // Catch:{ all -> 0x00de }
            if (r6 == 0) goto L_0x0046
            boolean r8 = o.getApdidToken.setMax()     // Catch:{ all -> 0x00de }
            if (r8 == 0) goto L_0x007a
            o.closeBlocking r8 = o.cy3.getMax     // Catch:{ all -> 0x00de }
            if (r6 != r8) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            if (r4 == 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x00de }
            r8.<init>()     // Catch:{ all -> 0x00de }
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x00de }
            throw r8     // Catch:{ all -> 0x00de }
        L_0x007a:
            r7.size = r1     // Catch:{ all -> 0x00de }
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00de }
            r0.unlock()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r5.D_()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.Object r8 = r5.setMin()
            return r8
        L_0x008f:
            int r5 = r7.isInside     // Catch:{ all -> 0x00de }
            if (r1 >= r5) goto L_0x00a2
            r7.getMax((int) r1)     // Catch:{ all -> 0x00de }
            java.lang.Object[] r2 = r7.length     // Catch:{ all -> 0x00de }
            int r3 = r7.setMax     // Catch:{ all -> 0x00de }
            int r3 = r3 + r1
            java.lang.Object[] r1 = r7.length     // Catch:{ all -> 0x00de }
            int r1 = r1.length     // Catch:{ all -> 0x00de }
            int r3 = r3 % r1
            r2[r3] = r8     // Catch:{ all -> 0x00de }
            goto L_0x00d8
        L_0x00a2:
            boolean r5 = o.getApdidToken.setMax()     // Catch:{ all -> 0x00de }
            if (r5 == 0) goto L_0x00ba
            kotlinx.coroutines.channels.BufferOverflow r5 = r7.toIntRange     // Catch:{ all -> 0x00de }
            kotlinx.coroutines.channels.BufferOverflow r6 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST     // Catch:{ all -> 0x00de }
            if (r5 != r6) goto L_0x00af
            r2 = 1
        L_0x00af:
            if (r2 == 0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x00de }
            r8.<init>()     // Catch:{ all -> 0x00de }
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x00de }
            throw r8     // Catch:{ all -> 0x00de }
        L_0x00ba:
            java.lang.Object[] r2 = r7.length     // Catch:{ all -> 0x00de }
            int r5 = r7.setMax     // Catch:{ all -> 0x00de }
            java.lang.Object[] r6 = r7.length     // Catch:{ all -> 0x00de }
            int r6 = r6.length     // Catch:{ all -> 0x00de }
            int r5 = r5 % r6
            r2[r5] = r3     // Catch:{ all -> 0x00de }
            java.lang.Object[] r2 = r7.length     // Catch:{ all -> 0x00de }
            int r3 = r7.setMax     // Catch:{ all -> 0x00de }
            int r3 = r3 + r1
            java.lang.Object[] r1 = r7.length     // Catch:{ all -> 0x00de }
            int r1 = r1.length     // Catch:{ all -> 0x00de }
            int r3 = r3 % r1
            r2[r3] = r8     // Catch:{ all -> 0x00de }
            int r8 = r7.setMax     // Catch:{ all -> 0x00de }
            int r8 = r8 + r4
            java.lang.Object[] r1 = r7.length     // Catch:{ all -> 0x00de }
            int r1 = r1.length     // Catch:{ all -> 0x00de }
            int r8 = r8 % r1
            r7.setMax = r8     // Catch:{ all -> 0x00de }
        L_0x00d8:
            o.closeBlocking r8 = o.isInboundDone.length     // Catch:{ all -> 0x00de }
            r0.unlock()
            return r8
        L_0x00de:
            r8 = move-exception
            r0.unlock()
            goto L_0x00e4
        L_0x00e3:
            throw r8
        L_0x00e4:
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.transfereTo.setMax(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Object getMax(@NotNull getDraft getdraft) {
        Lock lock = this.setMin;
        lock.lock();
        try {
            return super.getMax(getdraft);
        } finally {
            lock.unlock();
        }
    }

    private final void getMax(int i) {
        Object[] objArr = this.length;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.isInside);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.length;
                objArr2[i2] = objArr3[(this.setMax + i2) % objArr3.length];
            }
            ArraysKt.fill((T[]) objArr2, isInboundDone.getMax, i, min);
            this.length = objArr2;
            this.setMax = 0;
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Object setMax() {
        Lock lock = this.setMin;
        lock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object IsOverlapping = IsOverlapping();
                if (IsOverlapping == null) {
                    IsOverlapping = isInboundDone.setMax;
                }
                return IsOverlapping;
            }
            Object obj = this.length[this.setMax];
            getDraft getdraft = null;
            this.length[this.setMax] = null;
            this.size = i - 1;
            Object obj2 = isInboundDone.setMax;
            boolean z = false;
            if (i == this.isInside) {
                while (true) {
                    getDraft doubleRange = toDoubleRange();
                    if (doubleRange == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(doubleRange);
                    closeBlocking min = doubleRange.getMin();
                    if (min != null) {
                        if (getApdidToken.setMax()) {
                            if (min == cy3.getMax) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        Intrinsics.checkNotNull(doubleRange);
                        obj2 = doubleRange.setMax();
                        getdraft = doubleRange;
                        z = true;
                    } else {
                        Intrinsics.checkNotNull(doubleRange);
                        doubleRange.getMax();
                        getdraft = doubleRange;
                    }
                }
            }
            if (obj2 != isInboundDone.setMax && !(obj2 instanceof batch)) {
                this.size = i;
                this.length[(this.setMax + i) % this.length.length] = obj2;
            }
            this.setMax = (this.setMax + 1) % this.length.length;
            Unit unit = Unit.INSTANCE;
            lock.unlock();
            if (z) {
                Intrinsics.checkNotNull(getdraft);
                getdraft.length();
            }
            return obj;
        } finally {
            lock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean length(@NotNull getLocalSocketAddress<? super E> getlocalsocketaddress) {
        Lock lock = this.setMin;
        lock.lock();
        try {
            return super.length(getlocalsocketaddress);
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void getMin(boolean z) {
        Function1 function1 = this.getMax;
        Lock lock = this.setMin;
        lock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.length[this.setMax];
                if (!(function1 == null || obj == isInboundDone.getMax)) {
                    undeliveredElementException = AbstractClientProxyChannel.getMax(function1, obj, undeliveredElementException);
                }
                this.length[this.setMax] = isInboundDone.getMax;
                this.setMax = (this.setMax + 1) % this.length.length;
            }
            this.size = 0;
            Unit unit = Unit.INSTANCE;
            lock.unlock();
            super.getMin(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String invoke() {
        StringBuilder sb = new StringBuilder("(buffer:capacity=");
        sb.append(this.isInside);
        sb.append(",size=");
        sb.append(this.size);
        sb.append(')');
        return sb.toString();
    }
}
