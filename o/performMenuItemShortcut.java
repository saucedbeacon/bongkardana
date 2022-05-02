package o;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class performMenuItemShortcut implements getSupportActionBar {
    @Nullable
    public final ContentInfoCompat setMin(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        CharSequence charSequence;
        if (contentInfoCompat.getMin() == 2) {
            return contentInfoCompat;
        }
        ClipData max = contentInfoCompat.getMax();
        int length = contentInfoCompat.length();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < max.getItemCount(); i++) {
            ClipData.Item itemAt = max.getItemAt(i);
            if (Build.VERSION.SDK_INT >= 16) {
                charSequence = setMin.getMax(context, itemAt, length);
            } else {
                charSequence = setMax.length(context, itemAt, length);
            }
            if (charSequence != null) {
                if (!z) {
                    setMax(editable, charSequence);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequence);
                }
            }
        }
        return null;
    }

    private static void setMax(@NonNull Editable editable, @NonNull CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @RequiresApi(16)
    static final class setMin {
        static CharSequence getMax(@NonNull Context context, @NonNull ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    static final class setMax {
        static CharSequence length(@NonNull Context context, @NonNull ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }
}
