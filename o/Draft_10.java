package o;

import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.isFin;

public final class Draft_10 {
    static final Executor getMin = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), initCloseCode.getMax("OkHttp ConnectionPool", true));
    static final /* synthetic */ boolean toIntRange = (!Draft_10.class.desiredAssertionStatus());
    private final int equals;
    final Runnable getMax;
    boolean length;
    final Framedata setMax;
    final Deque<setFin> setMin;
    private final long toFloatRange;

    public final class IncompleteException extends getPart {
        private static final translateRegularFrame length = translateRegularFrame.getMin("application/x-www-form-urlencoded");
        private final List<String> getMax;
        private final List<String> getMin;

        public IncompleteException(List<String> list, List<String> list2) {
            this.getMax = initCloseCode.setMin(list);
            this.getMin = initCloseCode.setMin(list2);
        }

        public final translateRegularFrame setMax() {
            return length;
        }

        public final long setMin() {
            return getMax((executeSerial) null, true);
        }

        public final void getMin(executeSerial executeserial) throws IOException {
            getMax(executeserial, false);
        }

        private long getMax(@Nullable executeSerial executeserial, boolean z) {
            submitLazy submitlazy;
            if (z) {
                submitlazy = new submitLazy();
            } else {
                submitlazy = executeserial.getMax();
            }
            int size = this.getMax.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    submitlazy.equals(38);
                }
                String str = this.getMax.get(i);
                submitlazy.setMin(str, 0, str.length());
                submitlazy.equals(61);
                String str2 = this.getMin.get(i);
                submitlazy.setMin(str2, 0, str2.length());
            }
            if (!z) {
                return 0;
            }
            long j = submitlazy.setMax;
            try {
                submitlazy.isInside(submitlazy.setMax);
                return j;
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }

        public static final class getMin {
            public final List<String> getMin;
            private final Charset setMax;
            public final List<String> setMin;

            public getMin() {
                this((byte) 0);
            }

            private getMin(byte b) {
                this.setMin = new ArrayList();
                this.getMin = new ArrayList();
                this.setMax = null;
            }

            public final getMin setMax(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("name == null");
                } else if (str2 != null) {
                    this.setMin.add(Draft_76.setMax(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.setMax));
                    this.getMin.add(Draft_76.setMax(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.setMax));
                    return this;
                } else {
                    throw new NullPointerException("value == null");
                }
            }

            public final getMin getMin(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("name == null");
                } else if (str2 != null) {
                    this.setMin.add(Draft_76.setMax(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.setMax));
                    this.getMin.add(Draft_76.setMax(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.setMax));
                    return this;
                } else {
                    throw new NullPointerException("value == null");
                }
            }
        }
    }

    public Draft_10() {
        this(TimeUnit.MINUTES);
    }

    private Draft_10(TimeUnit timeUnit) {
        this.getMax = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                L_0x0000:
                    o.Draft_10 r0 = o.Draft_10.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.getMax(r1)
                    r2 = -1
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    o.Draft_10 r2 = o.Draft_10.this
                    monitor-enter(r2)
                    o.Draft_10 r3 = o.Draft_10.this     // Catch:{ InterruptedException -> 0x002b }
                    int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                    r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                    goto L_0x002b
                L_0x0029:
                    r0 = move-exception
                    goto L_0x002d
                L_0x002b:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    goto L_0x0000
                L_0x002d:
                    monitor-exit(r2)
                    goto L_0x0030
                L_0x002f:
                    throw r0
                L_0x0030:
                    goto L_0x002f
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Draft_10.AnonymousClass3.run():void");
            }
        };
        this.setMin = new ArrayDeque();
        this.setMax = new Framedata();
        this.equals = 5;
        this.toFloatRange = timeUnit.toNanos(5);
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax(setFin setfin) {
        if (!toIntRange && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (setfin.equals || this.equals == 0) {
            this.setMin.remove(setfin);
            return true;
        } else {
            notifyAll();
            return false;
        }
    }

    public final void length() {
        ArrayList<setFin> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<setFin> it = this.setMin.iterator();
            while (it.hasNext()) {
                setFin next = it.next();
                if (next.FastBitmap$CoordinateSystem.isEmpty()) {
                    next.equals = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        for (setFin setfin : arrayList) {
            initCloseCode.getMax(setfin.length);
        }
    }

    /* access modifiers changed from: package-private */
    public final long getMax(long j) {
        int size;
        synchronized (this) {
            setFin setfin = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (setFin next : this.setMin) {
                List<Reference<isFin>> list = next.FastBitmap$CoordinateSystem;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    Reference reference = list.get(i3);
                    if (reference.get() != null) {
                        i3++;
                    } else {
                        StringBuilder sb = new StringBuilder("A connection to ");
                        sb.append(next.getMax.setMax.setMax);
                        sb.append(" was leaked. Did you forget to close a response body?");
                        MPaaSSCLogCatImpl.toIntRange().getMax(sb.toString(), ((isFin.getMin) reference).setMax);
                        list.remove(i3);
                        next.equals = true;
                        if (list.isEmpty()) {
                            next.hashCode = j - this.toFloatRange;
                            size = 0;
                            break;
                        }
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.hashCode;
                    if (j3 > j2) {
                        setfin = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.toFloatRange) {
                if (i <= this.equals) {
                    if (i > 0) {
                        long j4 = this.toFloatRange - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.toFloatRange;
                        return j5;
                    } else {
                        this.length = false;
                        return -1;
                    }
                }
            }
            this.setMin.remove(setfin);
            initCloseCode.getMax(setfin.length);
            return 0;
        }
    }
}
