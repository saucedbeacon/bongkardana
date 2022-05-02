package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import o.getPlaybackState;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout implements getPlaybackState {
    private getPlaybackState.setMin setMax;

    public FitWindowsLinearLayout(@NonNull Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(getPlaybackState.setMin setmin) {
        this.setMax = setmin;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        getPlaybackState.setMin setmin = this.setMax;
        if (setmin != null) {
            setmin.setMin(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
