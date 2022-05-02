package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.widget.TextViewCompat;
import o.createViewFromTag;
import o.themifyContext;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class EmojiExtractEditText extends ExtractEditText {
    private boolean getMax;
    private themifyContext setMax;

    public EmojiExtractEditText(Context context) {
        super(context);
        setMax((AttributeSet) null, 0, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMax(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMax(attributeSet, i, 0);
    }

    @RequiresApi(21)
    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setMax(attributeSet, i, i2);
    }

    private void setMax(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (!this.getMax) {
            this.getMax = true;
            setMaxEmojiCount(new createViewFromTag(this, attributeSet, i, i2).getMax);
            setKeyListener(super.getKeyListener());
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.setMax == null) {
            this.setMax = new themifyContext(this);
        }
        themifyContext themifycontext = this.setMax;
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
            if (this.setMax == null) {
                this.setMax = new themifyContext(this);
            }
            themifyContext themifycontext = this.setMax;
            if (keyListener != null) {
                keyListener = themifycontext.setMax.setMax(keyListener);
            } else {
                throw new NullPointerException("keyListener cannot be null");
            }
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i) {
        if (this.setMax == null) {
            this.setMax = new themifyContext(this);
        }
        themifyContext themifycontext = this.setMax;
        if (i >= 0) {
            themifycontext.getMin = i;
            themifycontext.setMax.length(i);
            return;
        }
        throw new IllegalArgumentException("maxEmojiCount should be greater than 0");
    }

    public void setEmojiReplaceStrategy(int i) {
        if (this.setMax == null) {
            this.setMax = new themifyContext(this);
        }
        themifyContext themifycontext = this.setMax;
        themifycontext.getMax = i;
        themifycontext.setMax.setMin(i);
    }

    public int getEmojiReplaceStrategy() {
        if (this.setMax == null) {
            this.setMax = new themifyContext(this);
        }
        return this.setMax.getMax;
    }

    public int getMaxEmojiCount() {
        if (this.setMax == null) {
            this.setMax = new themifyContext(this);
        }
        return this.setMax.getMin;
    }
}
