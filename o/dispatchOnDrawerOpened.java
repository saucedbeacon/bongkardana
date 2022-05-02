package o;

import android.graphics.Color;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

public abstract class dispatchOnDrawerOpened<T extends Entry> extends DataSet<T> implements EmojiAppCompatButton<T> {
    protected int length = Color.rgb(255, 187, 115);

    public dispatchOnDrawerOpened(List<T> list, String str) {
        super(list, str);
    }

    public final void length(int i) {
        this.length = i;
    }

    public final int getMin() {
        return this.length;
    }
}
