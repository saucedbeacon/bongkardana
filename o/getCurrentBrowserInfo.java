package o;

import android.view.KeyEvent;
import android.widget.TextView;
import o.TitleBarRightButtonView;

final class getCurrentBrowserInfo extends TitleBarRightButtonView.AnonymousClass1<Integer> {
    private final getChildren<? super Integer> handled;
    private final TextView view;

    getCurrentBrowserInfo(TextView textView, getChildren<? super Integer> getchildren) {
        this.view = textView;
        this.handled = getchildren;
    }

    public final void subscribeActual(GriverProgressBar<? super Integer> griverProgressBar) {
        if (AudioAttributesImplBaseParcelizer.checkMainThread(griverProgressBar)) {
            length length2 = new length(this.view, griverProgressBar, this.handled);
            griverProgressBar.onSubscribe(length2);
            this.view.setOnEditorActionListener(length2);
        }
    }

    static final class length extends access$801 implements TextView.OnEditorActionListener {
        private final getChildren<? super Integer> handled;
        private final GriverProgressBar<? super Integer> observer;
        private final TextView view;

        length(TextView textView, GriverProgressBar<? super Integer> griverProgressBar, getChildren<? super Integer> getchildren) {
            this.view = textView;
            this.observer = griverProgressBar;
            this.handled = getchildren;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            try {
                if (isDisposed() || !this.handled.test(Integer.valueOf(i))) {
                    return false;
                }
                this.observer.onNext(Integer.valueOf(i));
                return true;
            } catch (Exception e) {
                this.observer.onError(e);
                dispose();
                return false;
            }
        }

        public final void onDispose() {
            this.view.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        }
    }
}
