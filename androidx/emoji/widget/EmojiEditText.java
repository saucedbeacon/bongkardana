package androidx.emoji.widget;

import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.widget.TextViewCompat;
import o.createViewFromTag;
import o.themifyContext;

public class EmojiEditText extends EditText {
    private themifyContext length;
    private boolean setMin;

    public EmojiEditText(Context context) {
        super(context);
        getMin((AttributeSet) null, 0, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(attributeSet, 16842862, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(attributeSet, i, 0);
    }

    @RequiresApi(21)
    public EmojiEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        getMin(attributeSet, i, i2);
    }

    private void getMin(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (!this.setMin) {
            this.setMin = true;
            setMaxEmojiCount(new createViewFromTag(this, attributeSet, i, i2).getMax);
            setKeyListener(super.getKeyListener());
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.length == null) {
            this.length = new themifyContext(this);
        }
        themifyContext themifycontext = this.length;
        if (onCreateInputConnection == null) {
            return null;
        }
        return themifycontext.setMax.length(onCreateInputConnection, editorInfo);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.length((TextView) this, callback));
    }

    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (keyListener != null) {
            if (this.length == null) {
                this.length = new themifyContext(this);
            }
            themifyContext themifycontext = this.length;
            if (keyListener != null) {
                keyListener = themifycontext.setMax.setMax(keyListener);
            } else {
                throw new NullPointerException("keyListener cannot be null");
            }
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i) {
        if (this.length == null) {
            this.length = new themifyContext(this);
        }
        themifyContext themifycontext = this.length;
        if (i >= 0) {
            themifycontext.getMin = i;
            themifycontext.setMax.length(i);
            return;
        }
        throw new IllegalArgumentException("maxEmojiCount should be greater than 0");
    }

    public int getMaxEmojiCount() {
        if (this.length == null) {
            this.length = new themifyContext(this);
        }
        return this.length.getMin;
    }
}
