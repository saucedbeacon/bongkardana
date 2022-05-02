package o;

import android.view.RenderNode;
import android.view.View;
import androidx.annotation.Nullable;

public final class performActionForChild extends performActionForHost {
    @Nullable
    public static requestAccessibilityFocus getMin(String str) {
        try {
            getMax();
            if (length) {
                return new performActionForChild(RenderNode.create(str, (View) null));
            }
        } catch (Throwable unused) {
            setMin = true;
        }
        return null;
    }

    private performActionForChild(RenderNode renderNode) {
        super(renderNode);
    }
}
