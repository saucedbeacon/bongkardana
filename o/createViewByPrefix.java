package o;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
final class createViewByPrefix extends InputConnectionWrapper {
    private final TextView getMax;

    createViewByPrefix(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        super(inputConnection, false);
        this.getMax = textView;
        EmojiCompat.getMax().getMin(editorInfo);
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (EmojiCompat.getMin((InputConnection) this, length(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (EmojiCompat.getMin((InputConnection) this, length(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }

    private Editable length() {
        return this.getMax.getEditableText();
    }
}
