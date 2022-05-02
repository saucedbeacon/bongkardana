package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;

@SuppressLint({"InlinedApi"})
public final class ActionBar$LayoutParams {
    @NonNull
    public static Spanned length(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
