package o;

import androidx.annotation.Nullable;
import o.IconCompatParcelizer;

public interface getSmallIconBitmap {
    void onSupportActionModeFinished(IconCompatParcelizer iconCompatParcelizer);

    void onSupportActionModeStarted(IconCompatParcelizer iconCompatParcelizer);

    @Nullable
    IconCompatParcelizer onWindowStartingSupportActionMode(IconCompatParcelizer.getMin getmin);
}
