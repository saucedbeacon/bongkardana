package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.gesture.GestureAction;
import o.calculateDyToMakeVisible;

public final class scrollByInternal {
    public int getMax;
    public int getMin;
    public int length;
    public int setMax;
    public int setMin;

    public scrollByInternal(@NonNull TypedArray typedArray) {
        this.setMax = typedArray.getInteger(calculateDyToMakeVisible.setMax.invoke, GestureAction.DEFAULT_TAP.value());
        this.length = typedArray.getInteger(calculateDyToMakeVisible.setMax.Mean$Arithmetic, GestureAction.DEFAULT_LONG_TAP.value());
        this.getMin = typedArray.getInteger(calculateDyToMakeVisible.setMax.valueOf, GestureAction.DEFAULT_PINCH.value());
        this.setMin = typedArray.getInteger(calculateDyToMakeVisible.setMax.invokeSuspend, GestureAction.DEFAULT_SCROLL_HORIZONTAL.value());
        this.getMax = typedArray.getInteger(calculateDyToMakeVisible.setMax.Grayscale$Algorithm, GestureAction.DEFAULT_SCROLL_VERTICAL.value());
    }
}
