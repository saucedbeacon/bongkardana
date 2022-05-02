package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import o.ITrustedWebActivityCallback;
import o.dispatchKeyEvent;
import o.prepareFromUri;

class AppCompatPopupWindow extends PopupWindow {
    private static final boolean length = (Build.VERSION.SDK_INT < 21);
    private boolean getMax;

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        getMax(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        getMax(context, attributeSet, i, i2);
    }

    private void getMax(Context context, AttributeSet attributeSet, int i, int i2) {
        prepareFromUri min = prepareFromUri.getMin(context, attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.rateWithExtras, i, i2);
        if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.setShuffleMode)) {
            getMax(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.setShuffleMode, false));
        }
        setBackgroundDrawable(min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.setRepeatMode));
        min.setMin.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (length && this.getMax) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (length && this.getMax) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (length && this.getMax) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private void getMax(boolean z) {
        if (length) {
            this.getMax = z;
        } else {
            dispatchKeyEvent.setMax(this, z);
        }
    }
}
