package o;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.List;

public interface onRequestSendAccessibilityEvent {
    public static final onRequestSendAccessibilityEvent length = new onRequestSendAccessibilityEvent() {
        public final List<Drawable> getMin() {
            return Collections.EMPTY_LIST;
        }
    };

    List<Drawable> getMin();
}
