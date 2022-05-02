package o;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class LiteVMInstance {
    private final ConcurrentHashMap<getMin, AtomicInteger> mCounts = new ConcurrentHashMap<>();

    public static class getMin {
        /* access modifiers changed from: private */
        public final String featureName;
        /* access modifiers changed from: private */
        public final long timeFrame;

        public getMin(String str, long j) {
            this.featureName = (String) Preconditions.checkNotNull(str);
            this.timeFrame = j;
        }

        public String featureName() {
            return this.featureName;
        }

        public long timeFrame() {
            return this.timeFrame;
        }

        public int hashCode() {
            return String.format("%s%d", new Object[]{this.featureName, Long.valueOf(this.timeFrame)}).hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                getMin getmin = (getMin) obj;
                return this.featureName.equals(getmin.featureName) && this.timeFrame == getmin.timeFrame;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r5 = new java.util.concurrent.atomic.AtomicInteger();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inc(java.lang.String r5, long r6, int r8) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0007
            int r0 = r5.length()
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            int r1 = o.dispatchOnCancelled.setMax(r0)
            if (r0 == r1) goto L_0x001d
            o.onCanceled r2 = new o.onCanceled
            r3 = 1
            r2.<init>(r0, r1, r3)
            r0 = 1966359788(0x753444ec, float:2.285184E32)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x001d:
            o.LiteVMInstance$getMin r0 = new o.LiteVMInstance$getMin
            long r6 = o.callLiteVMLongMethod.truncateTimeframe(r6)
            r0.<init>(r5, r6)
            java.util.concurrent.ConcurrentHashMap<o.LiteVMInstance$getMin, java.util.concurrent.atomic.AtomicInteger> r5 = r4.mCounts
            java.lang.Object r5 = r5.get(r0)
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            if (r5 != 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            java.util.concurrent.ConcurrentHashMap<o.LiteVMInstance$getMin, java.util.concurrent.atomic.AtomicInteger> r6 = r4.mCounts
            java.lang.Object r6 = r6.putIfAbsent(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            if (r6 == 0) goto L_0x0040
            r5 = r6
        L_0x0040:
            r5.addAndGet(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LiteVMInstance.inc(java.lang.String, long, int):void");
    }

    public List<reloadLiteVMInstance> popAll() {
        ArrayList arrayList = new ArrayList();
        for (getMin getmin : new ArrayList(this.mCounts.keySet())) {
            AtomicInteger remove = this.mCounts.remove(getmin);
            if (remove != null) {
                arrayList.add(new reloadLiteVMInstance(getmin.featureName, getmin.timeFrame, remove.get()));
            }
        }
        return arrayList;
    }

    public boolean isEmpty() {
        return this.mCounts.isEmpty();
    }
}
