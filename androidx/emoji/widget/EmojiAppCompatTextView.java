package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import o.getChangingConfigurations;

public class EmojiAppCompatTextView extends AppCompatTextView {
    private getChangingConfigurations length;
    private boolean setMax;

    public EmojiAppCompatTextView(Context context) {
        super(context);
        getMin();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin();
    }

    private void getMin() {
        if (!this.setMax) {
            this.setMax = true;
            setMax().getMin.getMax();
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(setMax().getMin.setMax(inputFilterArr));
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        setMax().getMin.setMax(z);
    }

    private getChangingConfigurations setMax() {
        if (this.length == null) {
            this.length = new getChangingConfigurations(this);
        }
        return this.length;
    }
}
