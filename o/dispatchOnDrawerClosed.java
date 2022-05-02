package o;

import com.github.mikephil.charting.data.Entry;
import java.util.List;
import o.EmojiAppCompatButton;

public abstract class dispatchOnDrawerClosed<T extends EmojiAppCompatButton<? extends Entry>> extends checkDrawerViewAbsoluteGravity<T> {
    public dispatchOnDrawerClosed() {
    }

    public dispatchOnDrawerClosed(List<T> list) {
        super(list);
    }
}
