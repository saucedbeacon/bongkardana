package o;

import com.github.mikephil.charting.data.BarEntry;

public class cancelChildViewTouch extends findVisibleDrawer<EmojiCompat$LoadStrategy> {
    public cancelChildViewTouch(EmojiCompat$LoadStrategy emojiCompat$LoadStrategy) {
        super(emojiCompat$LoadStrategy);
    }

    public addFocusables setMax(float f, float f2) {
        addFocusables max = super.setMax(f, f2);
        if (max == null) {
            return null;
        }
        isStateSaved min = setMin(f, f2);
        EmojiAppCompatEditText emojiAppCompatEditText = (EmojiAppCompatEditText) ((EmojiCompat$LoadStrategy) this.getMin).getBarData().setMin(max.equals);
        if (emojiAppCompatEditText.IsOverlapping()) {
            return getMin(max, emojiAppCompatEditText, (float) min.length, (float) min.getMin);
        }
        isStateSaved.getMax(min);
        return max;
    }

    public final addFocusables getMin(addFocusables addfocusables, EmojiAppCompatEditText emojiAppCompatEditText, float f, float f2) {
        BarEntry barEntry = (BarEntry) emojiAppCompatEditText.length(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.setMin == null) {
            return addfocusables;
        }
        createFloatPropertyCompat[] createfloatpropertycompatArr = barEntry.setMax;
        if (createfloatpropertycompatArr.length <= 0) {
            return null;
        }
        int min = getMin(createfloatpropertycompatArr, f2);
        isStateSaved max = ((EmojiCompat$LoadStrategy) this.getMin).getTransformer(emojiAppCompatEditText.getCause()).getMax(addfocusables.setMax, createfloatpropertycompatArr[min].length);
        addFocusables addfocusables2 = new addFocusables(barEntry.length(), barEntry.getMin(), (float) max.length, (float) max.getMin, addfocusables.equals, min, addfocusables.toFloatRange);
        isStateSaved.getMax(max);
        return addfocusables2;
    }

    private static int getMin(createFloatPropertyCompat[] createfloatpropertycompatArr, float f) {
        if (!(createfloatpropertycompatArr == null || createfloatpropertycompatArr.length == 0)) {
            int i = 0;
            for (createFloatPropertyCompat min : createfloatpropertycompatArr) {
                if (min.setMin(f)) {
                    return i;
                }
                i++;
            }
            int max = Math.max(createfloatpropertycompatArr.length - 1, 0);
            if (f > createfloatpropertycompatArr[max].length) {
                return max;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float setMax(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    /* access modifiers changed from: protected */
    public final dispatchOnDrawerClosed getMin() {
        return ((EmojiCompat$LoadStrategy) this.getMin).getBarData();
    }
}
