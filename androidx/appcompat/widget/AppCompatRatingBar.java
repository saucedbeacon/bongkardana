package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.ITrustedWebActivityCallback;
import o.getShuffleMode;
import o.registerCallbackListener;

public class AppCompatRatingBar extends RatingBar {
    private final registerCallbackListener setMin;

    public AppCompatRatingBar(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRatingBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.getInterfaceDescriptor);
    }

    public AppCompatRatingBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getShuffleMode.getMax(getContext());
        registerCallbackListener registercallbacklistener = new registerCallbackListener(this);
        this.setMin = registercallbacklistener;
        registercallbacklistener.getMax(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap max = this.setMin.getMax();
        if (max != null) {
            setMeasuredDimension(View.resolveSizeAndState(max.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
