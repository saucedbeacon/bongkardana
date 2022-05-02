package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class addSubscription extends AudioAttributesImplBase<isValidPackage> {
    private final TextView view;

    addSubscription(TextView textView) {
        this.view = textView;
    }

    public final void subscribeListener(GriverProgressBar<? super isValidPackage> griverProgressBar) {
        setMax setmax = new setMax(this.view, griverProgressBar);
        griverProgressBar.onSubscribe(setmax);
        this.view.addTextChangedListener(setmax);
    }

    /* access modifiers changed from: protected */
    public final isValidPackage getInitialValue() {
        TextView textView = this.view;
        return isValidPackage.create(textView, textView.getText(), 0, 0, 0);
    }

    static final class setMax extends access$801 implements TextWatcher {
        private final GriverProgressBar<? super isValidPackage> observer;
        private final TextView view;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        setMax(TextView textView, GriverProgressBar<? super isValidPackage> griverProgressBar) {
            this.view = textView;
            this.observer = griverProgressBar;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.observer.onNext(isValidPackage.create(this.view, charSequence, i, i2, i3));
            }
        }

        public final void onDispose() {
            this.view.removeTextChangedListener(this);
        }
    }
}
