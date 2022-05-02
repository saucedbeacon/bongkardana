package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class notifyChildrenChanged extends AudioAttributesImplBase<CharSequence> {
    private final TextView view;

    notifyChildrenChanged(TextView textView) {
        this.view = textView;
    }

    public final void subscribeListener(GriverProgressBar<? super CharSequence> griverProgressBar) {
        getMax getmax = new getMax(this.view, griverProgressBar);
        griverProgressBar.onSubscribe(getmax);
        this.view.addTextChangedListener(getmax);
    }

    /* access modifiers changed from: protected */
    public final CharSequence getInitialValue() {
        return this.view.getText();
    }

    static final class getMax extends access$801 implements TextWatcher {
        private final GriverProgressBar<? super CharSequence> observer;
        private final TextView view;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        getMax(TextView textView, GriverProgressBar<? super CharSequence> griverProgressBar) {
            this.view = textView;
            this.observer = griverProgressBar;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.observer.onNext(charSequence);
            }
        }

        public final void onDispose() {
            this.view.removeTextChangedListener(this);
        }
    }
}
