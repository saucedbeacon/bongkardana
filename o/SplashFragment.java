package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class SplashFragment<T, R> extends onLoadMoreStateChanged<T, R> {
    final RedDotDrawable<? super T, ? extends getFavorite<R>> length;

    public SplashFragment(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends getFavorite<R>> redDotDrawable) {
        super(r1);
        this.length = redDotDrawable;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        this.setMin.subscribe(new length(griverProgressBar, this.length));
    }

    static final class length<T, R> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        boolean getMax;
        final GriverProgressBar<? super R> length;
        final RedDotDrawable<? super T, ? extends getFavorite<R>> setMax;
        GriverProgressBar.UpdateRunnable setMin;

        length(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super T, ? extends getFavorite<R>> redDotDrawable) {
            this.length = griverProgressBar;
            this.setMax = redDotDrawable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMin, updateRunnable)) {
                this.setMin = updateRunnable;
                this.length.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.setMin.dispose();
        }

        public final boolean isDisposed() {
            return this.setMin.isDisposed();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Throwable} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r4) {
            /*
                r3 = this;
                boolean r0 = r3.getMax
                r1 = 0
                if (r0 == 0) goto L_0x0021
                boolean r0 = r4 instanceof o.getFavorite
                if (r0 == 0) goto L_0x0020
                o.getFavorite r4 = (o.getFavorite) r4
                boolean r0 = r4.setMin()
                if (r0 == 0) goto L_0x0020
                java.lang.Object r4 = r4.setMax
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r4)
                if (r0 == 0) goto L_0x001d
                java.lang.Throwable r1 = io.reactivex.internal.util.NotificationLite.getError(r4)
            L_0x001d:
                o.SecuritySignature.getMax((java.lang.Throwable) r1)
            L_0x0020:
                return
            L_0x0021:
                o.RedDotDrawable<? super T, ? extends o.getFavorite<R>> r0 = r3.setMax     // Catch:{ all -> 0x006b }
                java.lang.Object r4 = r0.apply(r4)     // Catch:{ all -> 0x006b }
                java.lang.String r0 = "The selector returned a null Notification"
                java.lang.Object r4 = o.setRefreshAnimation.getMax(r4, (java.lang.String) r0)     // Catch:{ all -> 0x006b }
                o.getFavorite r4 = (o.getFavorite) r4     // Catch:{ all -> 0x006b }
                boolean r0 = r4.setMin()
                if (r0 == 0) goto L_0x004a
                o.GriverProgressBar$UpdateRunnable r0 = r3.setMin
                r0.dispose()
                java.lang.Object r4 = r4.setMax
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r4)
                if (r0 == 0) goto L_0x0046
                java.lang.Throwable r1 = io.reactivex.internal.util.NotificationLite.getError(r4)
            L_0x0046:
                r3.onError(r1)
                return
            L_0x004a:
                boolean r0 = r4.getMin()
                if (r0 == 0) goto L_0x0059
                o.GriverProgressBar$UpdateRunnable r4 = r3.setMin
                r4.dispose()
                r3.onComplete()
                return
            L_0x0059:
                o.GriverProgressBar<? super R> r0 = r3.length
                java.lang.Object r2 = r4.setMax
                if (r2 == 0) goto L_0x0067
                boolean r2 = io.reactivex.internal.util.NotificationLite.isError(r2)
                if (r2 != 0) goto L_0x0067
                java.lang.Object r1 = r4.setMax
            L_0x0067:
                r0.onNext(r1)
                return
            L_0x006b:
                r4 = move-exception
                o.registerNode.getMax(r4)
                o.GriverProgressBar$UpdateRunnable r0 = r3.setMin
                r0.dispose()
                r3.onError(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SplashFragment.length.onNext(java.lang.Object):void");
        }

        public final void onError(Throwable th) {
            if (this.getMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.getMax = true;
            this.length.onError(th);
        }

        public final void onComplete() {
            if (!this.getMax) {
                this.getMax = true;
                this.length.onComplete();
            }
        }
    }
}
