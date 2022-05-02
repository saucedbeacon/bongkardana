package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class getColumnCountForAccessibility extends ContextWrapper {
    public static final String TAG = "Backstack.KEY";
    final Object key;
    LayoutInflater layoutInflater;

    public getColumnCountForAccessibility(Context context, @NonNull Object obj) {
        super(context);
        if (obj != null) {
            this.key = obj;
            return;
        }
        throw new IllegalArgumentException("Key cannot be null!");
    }

    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.layoutInflater == null) {
                this.layoutInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.layoutInflater;
        } else if (TAG.equals(str)) {
            return this.key;
        } else {
            return super.getSystemService(str);
        }
    }

    @SuppressLint({"WrongConstant"})
    @Nullable
    public static <T> T getKey(Context context) {
        return context.getSystemService(TAG);
    }
}
