package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.widget.TextViewCompat;
import o.getChangingConfigurations;

public class EmojiButton extends Button {
    private boolean getMax;
    private getChangingConfigurations getMin;

    public EmojiButton(Context context) {
        super(context);
        if (!this.getMax) {
            this.getMax = true;
            if (this.getMin == null) {
                this.getMin = new getChangingConfigurations(this);
            }
            this.getMin.getMin.getMax();
        }
    }

    public EmojiButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.getMax) {
            this.getMax = true;
            if (this.getMin == null) {
                this.getMin = new getChangingConfigurations(this);
            }
            this.getMin.getMin.getMax();
        }
    }

    public EmojiButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.getMax) {
            this.getMax = true;
            if (this.getMin == null) {
                this.getMin = new getChangingConfigurations(this);
            }
            this.getMin.getMin.getMax();
        }
    }

    @RequiresApi(21)
    public EmojiButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.getMax) {
            this.getMax = true;
            if (this.getMin == null) {
                this.getMin = new getChangingConfigurations(this);
            }
            this.getMin.getMin.getMax();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.getMin == null) {
            this.getMin = new getChangingConfigurations(this);
        }
        this.getMin.getMin.setMax(z);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.length((TextView) this, callback));
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        if (this.getMin == null) {
            this.getMin = new getChangingConfigurations(this);
        }
        super.setFilters(this.getMin.getMin.setMax(inputFilterArr));
    }
}
