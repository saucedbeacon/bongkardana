package o;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class removeQueueItemAt {
    public static void setMax(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            prepareFromSearch.getMin(view, charSequence);
        }
    }
}
