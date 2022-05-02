package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import o.calculateDyToMakeVisible;

public final class isPreferredNextFocus {
    public ensureBottomGlow length = null;

    public isPreferredNextFocus(@NonNull TypedArray typedArray) {
        String string = typedArray.getString(calculateDyToMakeVisible.setMax.getMax);
        if (string != null) {
            try {
                this.length = (ensureBottomGlow) Class.forName(string).newInstance();
            } catch (Exception unused) {
            }
        }
    }
}
