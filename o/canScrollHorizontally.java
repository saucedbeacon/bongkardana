package o;

import o.canScrollVertically;

final class canScrollHorizontally implements Runnable {
    private final canScrollVertically.AnonymousClass5 setMin;

    public canScrollHorizontally(canScrollVertically.AnonymousClass5 r1) {
        this.setMin = r1;
    }

    public final void run() {
        canScrollVertically.AnonymousClass5 r0 = this.setMin;
        boolean unused = canScrollVertically.this.length = false;
        canScrollVertically.this.setMax();
    }
}
