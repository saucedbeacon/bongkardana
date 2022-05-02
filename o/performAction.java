package o;

import android.graphics.Canvas;
import android.view.DisplayList;
import javax.annotation.Nullable;

public final class performAction extends createNodeForHost {
    private performAction(DisplayList displayList) {
        super(displayList);
    }

    @Nullable
    public static requestAccessibilityFocus setMin(String str) {
        DisplayList min = getMin(str);
        if (min == null) {
            return null;
        }
        return new performAction(min);
    }

    public final Canvas getMax(int i, int i2) {
        return this.length.start(i, i2);
    }

    public final void length(Canvas canvas) {
        this.length.end();
    }

    public final void length(int i, int i2, int i3, int i4) {
        this.length.setLeftTopRightBottom(i, i2, i3, i4);
        this.length.setClipToBounds(false);
    }
}
