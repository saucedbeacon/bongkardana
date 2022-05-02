package o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
final class draw implements TextWatcher {
    private int getMin = 0;
    private int length = Integer.MAX_VALUE;
    private final EditText setMax;
    private EmojiCompat.length setMin;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    draw(EditText editText) {
        this.setMax = editText;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(int i) {
        this.length = i;
    }

    /* access modifiers changed from: package-private */
    public final void getMax(int i) {
        this.getMin = i;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.setMax.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int max = EmojiCompat.getMax().setMax();
            if (max != 0) {
                if (max == 1) {
                    EmojiCompat.getMax().getMin((CharSequence) (Spannable) charSequence, i, i + i3, this.length, this.getMin);
                    return;
                } else if (max != 3) {
                    return;
                }
            }
            EmojiCompat.getMax().setMin(length());
        }
    }

    private EmojiCompat.length length() {
        if (this.setMin == null) {
            this.setMin = new length(this.setMax);
        }
        return this.setMin;
    }

    static class length extends EmojiCompat.length {
        private final Reference<EditText> setMax;

        length(EditText editText) {
            this.setMax = new WeakReference(editText);
        }

        public final void getMax() {
            super.getMax();
            EditText editText = this.setMax.get();
            if (editText != null && editText.isAttachedToWindow()) {
                Editable editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                EmojiCompat.getMax().setMax((CharSequence) editableText);
                verifyNotNull.getMax(editableText, selectionStart, selectionEnd);
            }
        }
    }
}
