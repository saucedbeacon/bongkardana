package o;

import io.reactivex.annotations.Nullable;
import o.GriverPullRefreshService;
import o.TitleBarRightButtonView;

public final class getPopMenu extends TitleBarRightButtonView.AnonymousClass1<Integer> {
    private final int getMax;
    private final long length;

    public getPopMenu(int i, int i2) {
        this.getMax = i;
        this.length = ((long) i) + ((long) i2);
    }

    public final void subscribeActual(GriverProgressBar<? super Integer> griverProgressBar) {
        getMin getmin = new getMin(griverProgressBar, (long) this.getMax, this.length);
        griverProgressBar.onSubscribe(getmin);
        getmin.run();
    }

    static final class getMin extends GriverPullRefreshService.IGriverRefreshState<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final GriverProgressBar<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        getMin(GriverProgressBar<? super Integer> griverProgressBar, long j, long j2) {
            this.downstream = griverProgressBar;
            this.index = j;
            this.end = j2;
        }

        /* access modifiers changed from: package-private */
        public final void run() {
            if (!this.fused) {
                GriverProgressBar<? super Integer> griverProgressBar = this.downstream;
                long j = this.end;
                for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                    griverProgressBar.onNext(Integer.valueOf((int) j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    griverProgressBar.onComplete();
                }
            }
        }

        @Nullable
        public final Integer poll() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        public final boolean isEmpty() {
            return this.index == this.end;
        }

        public final void clear() {
            this.index = this.end;
            lazySet(1);
        }

        public final void dispose() {
            set(1);
        }

        public final boolean isDisposed() {
            return get() != 0;
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }
    }
}
