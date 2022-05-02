package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class onLoadItem extends AudioAttributesImplBase<onCustomAction> {
    private final TextView view;

    onLoadItem(TextView textView) {
        this.view = textView;
    }

    public final void subscribeListener(GriverProgressBar<? super onCustomAction> griverProgressBar) {
        getMax getmax = new getMax(this.view, griverProgressBar);
        griverProgressBar.onSubscribe(getmax);
        this.view.addTextChangedListener(getmax);
    }

    /* access modifiers changed from: protected */
    public final onCustomAction getInitialValue() {
        TextView textView = this.view;
        return onCustomAction.create(textView, textView.getEditableText());
    }

    static final class getMax extends access$801 implements TextWatcher {
        private final GriverProgressBar<? super onCustomAction> observer;
        private final TextView view;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        getMax(TextView textView, GriverProgressBar<? super onCustomAction> griverProgressBar) {
            this.view = textView;
            this.observer = griverProgressBar;
        }

        public final void afterTextChanged(Editable editable) {
            this.observer.onNext(onCustomAction.create(this.view, editable));
        }

        public final void onDispose() {
            this.view.removeTextChangedListener(this);
        }
    }
}
