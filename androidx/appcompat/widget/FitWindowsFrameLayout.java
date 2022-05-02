package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import o.getPlaybackState;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements getPlaybackState {
    private getPlaybackState.setMin setMin;

    public FitWindowsFrameLayout(@NonNull Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(getPlaybackState.setMin setmin) {
        this.setMin = setmin;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        getPlaybackState.setMin setmin = this.setMin;
        if (setmin != null) {
            setmin.setMin(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
