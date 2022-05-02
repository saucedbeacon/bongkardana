package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class onSearch extends AudioAttributesImplBase<getSessionToken> {
    private final TextView view;

    onSearch(TextView textView) {
        this.view = textView;
    }

    public final void subscribeListener(GriverProgressBar<? super getSessionToken> griverProgressBar) {
        getMin getmin = new getMin(this.view, griverProgressBar);
        griverProgressBar.onSubscribe(getmin);
        this.view.addTextChangedListener(getmin);
    }

    /* access modifiers changed from: protected */
    public final getSessionToken getInitialValue() {
        TextView textView = this.view;
        return getSessionToken.create(textView, textView.getText(), 0, 0, 0);
    }

    static final class getMin extends access$801 implements TextWatcher {
        private final GriverProgressBar<? super getSessionToken> observer;
        private final TextView view;

        public final void afterTextChanged(Editable editable) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        getMin(TextView textView, GriverProgressBar<? super getSessionToken> griverProgressBar) {
            this.view = textView;
            this.observer = griverProgressBar;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.observer.onNext(getSessionToken.create(this.view, charSequence, i, i2, i3));
            }
        }

        public final void onDispose() {
            this.view.removeTextChangedListener(this);
        }
    }
}
