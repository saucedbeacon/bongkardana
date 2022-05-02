package o;

import android.graphics.Canvas;
import com.facebook.litho.displaylist.DisplayListException;

public interface requestAccessibilityFocus {
    Canvas getMax(int i, int i2) throws DisplayListException;

    void getMin(float f) throws DisplayListException;

    boolean getMin();

    void length(int i, int i2, int i3, int i4) throws DisplayListException;

    void length(Canvas canvas) throws DisplayListException;

    void setMax(float f) throws DisplayListException;

    void setMin(Canvas canvas) throws DisplayListException;
}
