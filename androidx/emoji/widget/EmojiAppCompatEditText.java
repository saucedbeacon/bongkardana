package androidx.emoji.widget;

import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import o.ITrustedWebActivityCallback;
import o.createViewFromTag;
import o.themifyContext;

public class EmojiAppCompatEditText extends AppCompatEditText {
    private themifyContext getMin;
    private boolean setMax;

    public EmojiAppCompatEditText(Context context) {
        super(context);
        length((AttributeSet) null, 0);
    }

    public EmojiAppCompatEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        length(attributeSet, ITrustedWebActivityCallback.Stub.getMin.extraCallback);
    }

    public EmojiAppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length(attributeSet, i);
    }

    private void length(@Nullable AttributeSet attributeSet, int i) {
        if (!this.setMax) {
            this.setMax = true;
            setMaxEmojiCount(new createViewFromTag(this, attributeSet, i, 0).getMax);
            setKeyListener(super.getKeyListener());
        }
    }

    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (keyListener != null) {
            themifyContext max = getMax();
            if (keyListener != null) {
                keyListener = max.setMax.setMax(keyListener);
            } else {
                throw new NullPointerException("keyListener cannot be null");
            }
        }
        super.setKeyListener(keyListener);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        themifyContext max = getMax();
        if (onCreateInputConnection == null) {
            return null;
        }
        return max.setMax.length(onCreateInputConnection, editorInfo);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i) {
        themifyContext max = getMax();
        if (i >= 0) {
            max.getMin = i;
            max.setMax.length(i);
            return;
        }
        throw new IllegalArgumentException("maxEmojiCount should be greater than 0");
    }

    public int getMaxEmojiCount() {
        return getMax().getMin;
    }

    private themifyContext getMax() {
        if (this.getMin == null) {
            this.getMin = new themifyContext(this);
        }
        return this.getMin;
    }
}
