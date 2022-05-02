package id.dana.richview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputEditText;

public class ForceImeEditText extends TextInputEditText {
    private int setMax = 6;

    public ForceImeEditText(Context context) {
        super(context);
    }

    public ForceImeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ForceImeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDefaultIme(int i) {
        this.setMax = i;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = editorInfo.imeOptions & 255;
        if ((this.setMax & i) != 0) {
            editorInfo.imeOptions = i ^ editorInfo.imeOptions;
            editorInfo.imeOptions |= this.setMax;
        }
        if ((editorInfo.imeOptions & 1073741824) != 0) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }
}
