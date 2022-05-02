package o;

import io.reactivex.annotations.Nullable;
import o.GriverPullRefreshService;
import o.TitleBarRightButtonView;

public final class getToolbarMenu extends TitleBarRightButtonView.AnonymousClass1<Long> {
    private final long length;
    private final long setMax;

    public getToolbarMenu(long j, long j2) {
        this.length = j;
        this.setMax = j2;
    }

    public final void subscribeActual(GriverProgressBar<? super Long> griverProgressBar) {
        long j = this.length;
        getMin getmin = new getMin(griverProgressBar, j, j + this.setMax);
        griverProgressBar.onSubscribe(getmin);
        getmin.run();
    }

    static final class getMin extends GriverPullRefreshService.IGriverRefreshState<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final GriverProgressBar<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        getMin(GriverProgressBar<? super Long> griverProgressBar, long j, long j2) {
            this.downstream = griverProgressBar;
            this.index = j;
            this.end = j2;
        }

        /* access modifiers changed from: package-private */
        public final void run() {
            if (!this.fused) {
                GriverProgressBar<? super Long> griverProgressBar = this.downstream;
                long j = this.end;
                for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                    griverProgressBar.onNext(Long.valueOf(j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    griverProgressBar.onComplete();
                }
            }
        }

        @Nullable
        public final Long poll() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Long.valueOf(j);
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
