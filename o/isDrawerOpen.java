package o;

import com.github.mikephil.charting.data.DataSet;
import java.util.List;

public final class isDrawerOpen extends findVisibleDrawer<setAllCaps> {
    protected cancelChildViewTouch getMax;

    public isDrawerOpen(setAllCaps setallcaps, EmojiCompat$LoadStrategy emojiCompat$LoadStrategy) {
        super(setallcaps);
        this.getMax = emojiCompat$LoadStrategy.getBarData() == null ? null : new cancelChildViewTouch(emojiCompat$LoadStrategy);
    }

    /* access modifiers changed from: protected */
    public final List<addFocusables> setMax(float f, float f2, float f3) {
        this.setMax.clear();
        List<dispatchOnDrawerClosed> values = ((setAllCaps) this.getMin).getCombinedData().values();
        for (int i = 0; i < values.size(); i++) {
            checkDrawerViewAbsoluteGravity checkdrawerviewabsolutegravity = values.get(i);
            cancelChildViewTouch cancelchildviewtouch = this.getMax;
            if (cancelchildviewtouch == null || !(checkdrawerviewabsolutegravity instanceof getDrawerTitle)) {
                int min = checkdrawerviewabsolutegravity.setMin();
                for (int i2 = 0; i2 < min; i2++) {
                    EmojiAppCompatTextView min2 = values.get(i).setMin(i2);
                    if (min2.toIntRange()) {
                        for (addFocusables next : getMax(min2, i2, f, DataSet.Rounding.CLOSEST)) {
                            next.length = i;
                            this.setMax.add(next);
                        }
                    }
                }
            } else {
                addFocusables max = cancelchildviewtouch.setMax(f2, f3);
                if (max != null) {
                    max.length = i;
                    this.setMax.add(max);
                }
            }
        }
        return this.setMax;
    }
}
