package o;

import o.TitleBarRightButtonView;

public final class EllipsizeGroupLayout<R, T> extends onLoadMoreStateChanged<T, R> {
    final TitleBarRightButtonView.AnonymousClass3<? extends R, ? super T> setMax;

    public EllipsizeGroupLayout(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass3<? extends R, ? super T> r2) {
        super(r1);
        this.setMax = r2;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        try {
            GriverProgressBar<? super Object> max = this.setMax.getMax();
            StringBuilder sb = new StringBuilder("Operator ");
            sb.append(this.setMax);
            sb.append(" returned a null Observer");
            this.setMin.subscribe((GriverProgressBar) setRefreshAnimation.getMax(max, sb.toString()));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            registerNode.getMax(th);
            SecuritySignature.getMax(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
