package o;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

public abstract class getShowsDialog extends createFragmentContainer {
    protected getMax isInside = new getMax();

    public getShowsDialog(setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
    }

    protected static boolean getMin(EmojiAppCompatTextView emojiAppCompatTextView) {
        if (emojiAppCompatTextView.b()) {
            return emojiAppCompatTextView.Mean$Arithmetic() || emojiAppCompatTextView.create();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean setMax(Entry entry, EmojiAppCompatButton emojiAppCompatButton) {
        if (entry == null) {
            return false;
        }
        float min = (float) emojiAppCompatButton.getMin(entry);
        if (entry == null || min >= ((float) emojiAppCompatButton.ICustomTabsCallback()) * this.equals.getMin()) {
            return false;
        }
        return true;
    }

    protected class getMax {
        public int getMin;
        public int length;
        public int setMin;

        protected getMax() {
        }

        public final void getMax(EmojiCompat$ReplaceStrategy emojiCompat$ReplaceStrategy, EmojiAppCompatButton emojiAppCompatButton) {
            int i;
            float max = Math.max(0.0f, Math.min(1.0f, getShowsDialog.this.equals.getMin()));
            float lowestVisibleX = emojiCompat$ReplaceStrategy.getLowestVisibleX();
            float highestVisibleX = emojiCompat$ReplaceStrategy.getHighestVisibleX();
            Entry min = emojiAppCompatButton.getMin(lowestVisibleX, DataSet.Rounding.DOWN);
            Entry min2 = emojiAppCompatButton.getMin(highestVisibleX, DataSet.Rounding.UP);
            int i2 = 0;
            if (min == null) {
                i = 0;
            } else {
                i = emojiAppCompatButton.getMin(min);
            }
            this.setMin = i;
            if (min2 != null) {
                i2 = emojiAppCompatButton.getMin(min2);
            }
            this.getMin = i2;
            this.length = (int) (((float) (i2 - this.setMin)) * max);
        }
    }
}
