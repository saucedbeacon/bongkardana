package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import o.calculateDyToMakeVisible;

public final class setOnScrollListener {
    public setChildDrawingOrderCallback length = null;

    public setOnScrollListener(@NonNull TypedArray typedArray) {
        try {
            this.length = (setChildDrawingOrderCallback) Class.forName(typedArray.getString(calculateDyToMakeVisible.setMax.IsOverlapping)).newInstance();
        } catch (Exception unused) {
            this.length = new clearOnScrollListeners();
        }
    }
}
