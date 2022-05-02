package o;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
final class verifyNotNull implements InputFilter {
    private final TextView getMax;
    private EmojiCompat.length getMin;

    verifyNotNull(@NonNull TextView textView) {
        this.getMax = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.getMax.isInEditMode()) {
            return charSequence;
        }
        int max = EmojiCompat.getMax().setMax();
        if (max != 0) {
            boolean z = true;
            if (max == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.getMax.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.getMax().getMin(charSequence, 0, charSequence.length());
            } else if (max != 3) {
                return charSequence;
            }
        }
        EmojiCompat.getMax().setMin(setMax());
        return charSequence;
    }

    private EmojiCompat.length setMax() {
        if (this.getMin == null) {
            this.getMin = new setMax(this.getMax);
        }
        return this.getMin;
    }

    static class setMax extends EmojiCompat.length {
        private final Reference<TextView> getMax;

        setMax(TextView textView) {
            this.getMax = new WeakReference(textView);
        }

        public final void getMax() {
            super.getMax();
            TextView textView = this.getMax.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence max = EmojiCompat.getMax().setMax(textView.getText());
                int selectionStart = Selection.getSelectionStart(max);
                int selectionEnd = Selection.getSelectionEnd(max);
                textView.setText(max);
                if (max instanceof Spannable) {
                    verifyNotNull.getMax((Spannable) max, selectionStart, selectionEnd);
                }
            }
        }
    }

    static void getMax(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }
}
