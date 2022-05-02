package com.otaliastudios.cameraview.markers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import o.invalidateGlows;

public class MarkerLayout extends FrameLayout {
    public static final int TYPE_AUTOFOCUS = 1;
    @SuppressLint({"UseSparseArrays"})
    private final HashMap<Integer, View> getMax = new HashMap<>();

    public MarkerLayout(@NonNull Context context) {
        super(context);
    }

    public void onMarker(int i, @Nullable invalidateGlows invalidateglows) {
        View min;
        View view = this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            removeView(view);
        }
        if (invalidateglows != null && (min = invalidateglows.setMin(getContext(), this)) != null) {
            this.getMax.put(Integer.valueOf(i), min);
            addView(min);
        }
    }

    public void onEvent(int i, @NonNull PointF[] pointFArr) {
        View view = this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            view.clearAnimation();
            if (i == 1) {
                PointF pointF = pointFArr[0];
                view.setTranslationX((float) ((int) (pointF.x - ((float) (view.getWidth() / 2)))));
                view.setTranslationY((float) ((int) (pointF.y - ((float) (view.getHeight() / 2)))));
            }
        }
    }
}
