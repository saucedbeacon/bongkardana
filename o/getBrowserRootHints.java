package o;

import android.view.KeyEvent;
import android.widget.TextView;
import o.TitleBarRightButtonView;

final class getBrowserRootHints extends TitleBarRightButtonView.AnonymousClass1<setSessionToken> {
    private final getChildren<? super setSessionToken> handled;
    private final TextView view;

    getBrowserRootHints(TextView textView, getChildren<? super setSessionToken> getchildren) {
        this.view = textView;
        this.handled = getchildren;
    }

    public final void subscribeActual(GriverProgressBar<? super setSessionToken> griverProgressBar) {
        if (AudioAttributesImplBaseParcelizer.checkMainThread(griverProgressBar)) {
            getMax getmax = new getMax(this.view, griverProgressBar, this.handled);
            griverProgressBar.onSubscribe(getmax);
            this.view.setOnEditorActionListener(getmax);
        }
    }

    static final class getMax extends access$801 implements TextView.OnEditorActionListener {
        private final getChildren<? super setSessionToken> handled;
        private final GriverProgressBar<? super setSessionToken> observer;
        private final TextView view;

        getMax(TextView textView, GriverProgressBar<? super setSessionToken> griverProgressBar, getChildren<? super setSessionToken> getchildren) {
            this.view = textView;
            this.observer = griverProgressBar;
            this.handled = getchildren;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            setSessionToken create = setSessionToken.create(this.view, i, keyEvent);
            try {
                if (isDisposed() || !this.handled.test(create)) {
                    return false;
                }
                this.observer.onNext(create);
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
