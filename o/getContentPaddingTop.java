package o;

import java.util.concurrent.CountDownLatch;

final class getContentPaddingTop {
    final CountDownLatch getMin = new CountDownLatch(1);
    long length = -1;
    long setMin = -1;

    getContentPaddingTop() {
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        if (this.setMin == -1) {
            long j = this.length;
            if (j != -1) {
                this.setMin = j - 1;
                this.getMin.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }
}
