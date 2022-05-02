package o;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class getLaunchPendingIntent {
    @Nullable
    private TextClassifier length;
    @NonNull
    private TextView setMax;

    public getLaunchPendingIntent(@NonNull TextView textView) {
        if (textView != null) {
            this.setMax = textView;
            return;
        }
        throw null;
    }

    @RequiresApi(api = 26)
    public final void length(@Nullable TextClassifier textClassifier) {
        this.length = textClassifier;
    }

    @RequiresApi(api = 26)
    @NonNull
    public final TextClassifier setMin() {
        TextClassifier textClassifier = this.length;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.setMax.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
