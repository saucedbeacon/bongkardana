package o;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface getPlaybackState {

    public interface setMin {
        void setMin(Rect rect);
    }

    void setOnFitSystemWindowsListener(setMin setmin);
}
