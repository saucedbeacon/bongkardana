package o;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;

public final class getStatusBarBackgroundDrawable extends checkDrawerViewAbsoluteGravity<getEmojiReplaceStrategy> {
    public final getEmojiReplaceStrategy toDoubleRange() {
        return (getEmojiReplaceStrategy) this.toFloatRange.get(0);
    }

    public final getEmojiReplaceStrategy getMax(int i) {
        if (i == 0) {
            return (getEmojiReplaceStrategy) this.toFloatRange.get(0);
        }
        return null;
    }

    public final Entry setMax(addFocusables addfocusables) {
        return ((getEmojiReplaceStrategy) this.toFloatRange.get(0)).toIntRange((int) addfocusables.setMax);
    }

    public final float values() {
        float f = 0.0f;
        for (int i = 0; i < ((getEmojiReplaceStrategy) this.toFloatRange.get(0)).ICustomTabsCallback(); i++) {
            f += ((PieEntry) ((getEmojiReplaceStrategy) this.toFloatRange.get(0)).toIntRange(i)).getMin();
        }
        return f;
    }

    public final /* synthetic */ EmojiAppCompatTextView setMin(int i) {
        if (i == 0) {
            return (getEmojiReplaceStrategy) this.toFloatRange.get(0);
        }
        return null;
    }
}
