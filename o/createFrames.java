package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o.WebSocketClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020*B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\r*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "fair", "add", "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "addLast", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "pollBuffer", "queue", "pollTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "victim", "", "tryStealBlockingFrom", "(Lkotlinx/coroutines/scheduling/WorkQueue;)J", "tryStealFrom", "blockingOnly", "tryStealLastScheduled", "(Lkotlinx/coroutines/scheduling/WorkQueue;Z)J", "decrementIfBlocking", "(Lkotlinx/coroutines/scheduling/Task;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "", "getBufferSize$kotlinx_coroutines_core", "()I", "bufferSize", "getSize$kotlinx_coroutines_core", "size", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 4, 2})
public final class createFrames {
    private static final /* synthetic */ AtomicIntegerFieldUpdater getMin;
    private static final /* synthetic */ AtomicIntegerFieldUpdater length;
    private static final /* synthetic */ AtomicIntegerFieldUpdater setMax;
    public static final /* synthetic */ AtomicReferenceFieldUpdater setMin;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    public volatile /* synthetic */ int consumerIndex = 0;
    private final AtomicReferenceArray<readStringLine> getMax = new AtomicReferenceArray<>(128);
    public volatile /* synthetic */ Object lastScheduledTask = null;
    public volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<createFrames> cls = createFrames.class;
        setMin = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        length = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        getMin = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        setMax = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    @Nullable
    public final readStringLine setMin() {
        readStringLine readstringline = (readStringLine) setMin.getAndSet(this, (Object) null);
        return readstringline == null ? getMin() : readstringline;
    }

    @Nullable
    public final readStringLine getMin(@NotNull readStringLine readstringline, boolean z) {
        if (z) {
            return setMax(readstringline);
        }
        readStringLine readstringline2 = (readStringLine) setMin.getAndSet(this, readstringline);
        if (readstringline2 == null) {
            return null;
        }
        return setMax(readstringline2);
    }

    public final long setMax(@NotNull createFrames createframes) {
        boolean z = true;
        if (getApdidToken.setMax()) {
            if (!(this.producerIndex - this.consumerIndex == 0)) {
                throw new AssertionError();
            }
        }
        readStringLine min = createframes.getMin();
        if (min == null) {
            return length(createframes, false);
        }
        readStringLine length2 = getMin(min, false);
        if (!getApdidToken.setMax()) {
            return -1;
        }
        if (length2 != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }

    public final long getMin(@NotNull createFrames createframes) {
        if (getApdidToken.setMax()) {
            if (!(this.producerIndex - this.consumerIndex == 0)) {
                throw new AssertionError();
            }
        }
        int i = createframes.producerIndex;
        AtomicReferenceArray<readStringLine> atomicReferenceArray = createframes.getMax;
        for (int i2 = createframes.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (createframes.blockingTasksInBuffer == 0) {
                break;
            }
            readStringLine readstringline = atomicReferenceArray.get(i3);
            if (readstringline != null) {
                if ((readstringline.toIntRange.getMax() == 1) && atomicReferenceArray.compareAndSet(i3, readstringline, (Object) null)) {
                    setMax.decrementAndGet(createframes);
                    readStringLine unused = getMin(readstringline, false);
                    return -1;
                }
            }
        }
        return length(createframes, true);
    }

    public final void getMax(@NotNull WebSocketClient.WebsocketWriteThread websocketWriteThread) {
        readStringLine readstringline = (readStringLine) setMin.getAndSet(this, (Object) null);
        if (readstringline != null) {
            websocketWriteThread.length(readstringline);
        }
        do {
        } while (getMin(websocketWriteThread));
    }

    private final long length(createFrames createframes, boolean z) {
        readStringLine readstringline;
        do {
            readstringline = (readStringLine) createframes.lastScheduledTask;
            if (readstringline == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (readstringline.toIntRange.getMax() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long max = createHandshake.equals.getMax() - readstringline.equals;
            if (max < createHandshake.getMax) {
                return createHandshake.getMax - max;
            }
        } while (!setMin.compareAndSet(createframes, readstringline, (Object) null));
        getMin(readstringline, false);
        return -1;
    }

    private final boolean getMin(WebSocketClient.WebsocketWriteThread websocketWriteThread) {
        readStringLine min = getMin();
        if (min == null) {
            return false;
        }
        websocketWriteThread.length(min);
        return true;
    }

    public final readStringLine getMin() {
        readStringLine andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (getMin.compareAndSet(this, i, i + 1) && (andSet = this.getMax.getAndSet(i2, (Object) null)) != null) {
                getMax(andSet);
                return andSet;
            }
        }
    }

    private final readStringLine setMax(readStringLine readstringline) {
        boolean z = true;
        if (readstringline.toIntRange.getMax() != 1) {
            z = false;
        }
        if (z) {
            setMax.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return readstringline;
        }
        int i = this.producerIndex & 127;
        while (this.getMax.get(i) != null) {
            Thread.yield();
        }
        this.getMax.lazySet(i, readstringline);
        length.incrementAndGet(this);
        return null;
    }

    private final void getMax(readStringLine readstringline) {
        if (readstringline != null) {
            boolean z = false;
            if (readstringline.toIntRange.getMax() == 1) {
                int decrementAndGet = setMax.decrementAndGet(this);
                if (getApdidToken.setMax()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }
}
