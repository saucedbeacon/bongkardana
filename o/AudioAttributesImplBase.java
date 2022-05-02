package o;

import o.TitleBarRightButtonView;

public abstract class AudioAttributesImplBase<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    /* access modifiers changed from: protected */
    public abstract T getInitialValue();

    /* access modifiers changed from: protected */
    public abstract void subscribeListener(GriverProgressBar<? super T> griverProgressBar);

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        subscribeListener(griverProgressBar);
        griverProgressBar.onNext(getInitialValue());
    }

    public final TitleBarRightButtonView.AnonymousClass1<T> skipInitialValue() {
        return new setMin();
    }

    final class setMin extends TitleBarRightButtonView.AnonymousClass1<T> {
        setMin() {
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            AudioAttributesImplBase.this.subscribeListener(griverProgressBar);
        }
    }
}
