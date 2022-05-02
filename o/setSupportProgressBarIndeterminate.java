package o;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class setSupportProgressBarIndeterminate {
    private static final String[] setMax = new String[0];

    private static boolean setMin(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void length(@NonNull EditorInfo editorInfo, @Nullable String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    @NonNull
    public static String[] length(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            if (strArr != null) {
                return strArr;
            }
            return setMax;
        } else if (editorInfo.extras == null) {
            return setMax;
        } else {
            String[] stringArray = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            if (stringArray == null) {
                stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            }
            if (stringArray != null) {
                return stringArray;
            }
            return setMax;
        }
    }

    public static void getMin(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            setMax.setMin(editorInfo, charSequence, 0);
        } else {
            setMax(editorInfo, charSequence, 0);
        }
    }

    public static void setMax(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence, int i) {
        int i2;
        int i3;
        if (charSequence == null) {
            throw null;
        } else if (Build.VERSION.SDK_INT >= 30) {
            setMax.setMin(editorInfo, charSequence, i);
        } else {
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i2 = editorInfo.initialSelEnd;
            } else {
                i2 = editorInfo.initialSelStart;
            }
            int i4 = i2 - i;
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i3 = editorInfo.initialSelStart;
            } else {
                i3 = editorInfo.initialSelEnd;
            }
            int i5 = i3 - i;
            int length = charSequence.length();
            if (i < 0 || i4 < 0 || i5 > length) {
                setMax(editorInfo, (CharSequence) null, 0, 0);
            } else if (setMin(editorInfo.inputType)) {
                setMax(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                setMax(editorInfo, charSequence, i4, i5);
            } else {
                length(editorInfo, charSequence, i4, i5);
            }
        }
    }

    private static void length(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        double d = (double) i5;
        Double.isNaN(d);
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (d * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (getMax(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (getMax(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i4 + min;
        if (i4 != i3) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)});
        } else {
            charSequence2 = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        setMax(editorInfo, charSequence2, i8, i4 + i8);
    }

    private static boolean getMax(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    private static void setMax(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    @RequiresApi(30)
    static class setMax {
        static void setMin(@NonNull EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }
}
