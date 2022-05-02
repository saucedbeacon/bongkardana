package o;

import com.github.mikephil.charting.data.Entry;

public interface EmojiAppCompatButton<T extends Entry> extends EmojiAppCompatTextView<T> {
    int getMin();
}
