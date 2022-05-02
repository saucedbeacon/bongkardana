package o;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

public final class isDrawerVisible extends cancelChildViewTouch {
    public isDrawerVisible(EmojiCompat$LoadStrategy emojiCompat$LoadStrategy) {
        super(emojiCompat$LoadStrategy);
    }

    public final addFocusables setMax(float f, float f2) {
        getDrawerTitle barData = ((EmojiCompat$LoadStrategy) this.getMin).getBarData();
        isStateSaved min = setMin(f2, f);
        addFocusables length = length((float) min.getMin, f2, f);
        if (length == null) {
            return null;
        }
        EmojiAppCompatEditText emojiAppCompatEditText = (EmojiAppCompatEditText) barData.setMin(length.equals);
        if (emojiAppCompatEditText.IsOverlapping()) {
            return getMin(length, emojiAppCompatEditText, (float) min.getMin, (float) min.length);
        }
        isStateSaved.getMax(min);
        return length;
    }

    /* access modifiers changed from: protected */
    public final List<addFocusables> getMax(EmojiAppCompatTextView emojiAppCompatTextView, int i, float f, DataSet.Rounding rounding) {
        Entry min;
        ArrayList arrayList = new ArrayList();
        List<Entry> min2 = emojiAppCompatTextView.setMin(f);
        if (min2.size() == 0 && (min = emojiAppCompatTextView.getMin(f, rounding)) != null) {
            min2 = emojiAppCompatTextView.setMin(min.length());
        }
        if (min2.size() == 0) {
            return arrayList;
        }
        for (Entry entry : min2) {
            isStateSaved max = ((EmojiCompat$LoadStrategy) this.getMin).getTransformer(emojiAppCompatTextView.getCause()).getMax(entry.getMin(), entry.length());
            arrayList.add(new addFocusables(entry.length(), entry.getMin(), (float) max.length, (float) max.getMin, i, emojiAppCompatTextView.getCause()));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final float setMax(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }
}
