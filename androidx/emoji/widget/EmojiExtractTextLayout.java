package androidx.emoji.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.InputMethodService;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C;
import o.createSpinner;

public class EmojiExtractTextLayout extends LinearLayout {
    private EmojiExtractEditText getMax;
    private ViewGroup getMin;
    private ExtractButtonCompat length;
    private boolean setMax;
    private View.OnClickListener setMin;

    public EmojiExtractTextLayout(Context context) {
        super(context);
        getMin(context, (AttributeSet) null, 0, 0);
    }

    public EmojiExtractTextLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(context, attributeSet, 0, 0);
    }

    public EmojiExtractTextLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(context, attributeSet, i, 0);
    }

    @RequiresApi(api = 21)
    public EmojiExtractTextLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        getMin(context, attributeSet, i, i2);
    }

    private void getMin(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        if (!this.setMax) {
            this.setMax = true;
            setOrientation(0);
            View inflate = LayoutInflater.from(context).inflate(createSpinner.setMin.input_method_extract_view, this, true);
            this.getMin = (ViewGroup) inflate.findViewById(createSpinner.getMin.getMin);
            this.length = (ExtractButtonCompat) inflate.findViewById(createSpinner.getMin.length);
            this.getMax = (EmojiExtractEditText) inflate.findViewById(16908325);
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, createSpinner.setMax.setMin, i, i2);
                ViewCompat.getMax(this, context, createSpinner.setMax.setMin, attributeSet, obtainStyledAttributes, i, i2);
                this.getMax.setEmojiReplaceStrategy(obtainStyledAttributes.getInteger(createSpinner.setMax.length, 0));
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setEmojiReplaceStrategy(int i) {
        this.getMax.setEmojiReplaceStrategy(i);
    }

    public int getEmojiReplaceStrategy() {
        return this.getMax.getEmojiReplaceStrategy();
    }

    public void onUpdateExtractingViews(InputMethodService inputMethodService, EditorInfo editorInfo) {
        if (inputMethodService.isExtractViewShown() && this.getMin != null) {
            boolean z = true;
            if (editorInfo.actionLabel == null && ((editorInfo.imeOptions & 255) == 1 || (editorInfo.imeOptions & C.ENCODING_PCM_A_LAW) != 0 || editorInfo.inputType == 0)) {
                z = false;
            }
            if (z) {
                this.getMin.setVisibility(0);
                if (this.length != null) {
                    if (editorInfo.actionLabel != null) {
                        this.length.setText(editorInfo.actionLabel);
                    } else {
                        this.length.setText(inputMethodService.getTextForImeAction(editorInfo.imeOptions));
                    }
                    ExtractButtonCompat extractButtonCompat = this.length;
                    if (this.setMin == null) {
                        this.setMin = new setMin(inputMethodService);
                    }
                    extractButtonCompat.setOnClickListener(this.setMin);
                    return;
                }
                return;
            }
            this.getMin.setVisibility(8);
            ExtractButtonCompat extractButtonCompat2 = this.length;
            if (extractButtonCompat2 != null) {
                extractButtonCompat2.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    static final class setMin implements View.OnClickListener {
        private final InputMethodService setMax;

        setMin(InputMethodService inputMethodService) {
            this.setMax = inputMethodService;
        }

        public final void onClick(View view) {
            EditorInfo currentInputEditorInfo = this.setMax.getCurrentInputEditorInfo();
            InputConnection currentInputConnection = this.setMax.getCurrentInputConnection();
            if (currentInputEditorInfo != null && currentInputConnection != null) {
                if (currentInputEditorInfo.actionId != 0) {
                    currentInputConnection.performEditorAction(currentInputEditorInfo.actionId);
                } else if ((currentInputEditorInfo.imeOptions & 255) != 1) {
                    currentInputConnection.performEditorAction(currentInputEditorInfo.imeOptions & 255);
                }
            }
        }
    }
}
