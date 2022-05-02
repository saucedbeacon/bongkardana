package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import o.getChangingConfigurations;

public class EmojiAppCompatButton extends AppCompatButton {
    private getChangingConfigurations setMax;
    private boolean setMin;

    public EmojiAppCompatButton(Context context) {
        super(context);
        setMin();
    }

    public EmojiAppCompatButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMin();
    }

    public EmojiAppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMin();
    }

    private void setMin() {
        if (!this.setMin) {
            this.setMin = true;
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
        if (this.setMax == null) {
            this.setMax = new getChangingConfigurations(this);
        }
        return this.setMax;
    }
}
