package o;

import android.graphics.Canvas;
import com.github.mikephil.charting.data.Entry;

public interface removeDrawerListener {
    void draw(Canvas canvas, float f, float f2);

    void refreshContent(Entry entry, addFocusables addfocusables);
}
