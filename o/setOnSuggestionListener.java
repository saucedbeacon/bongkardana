package o;

import java.util.List;

public final class setOnSuggestionListener extends setOnCloseListener<onFocusChanged> {
    private final onFocusChanged getMax;

    public setOnSuggestionListener(List<setTitleMarginTop<onFocusChanged>> list) {
        super(list);
        int i = 0;
        onFocusChanged onfocuschanged = (onFocusChanged) list.get(0).setMax;
        i = onfocuschanged != null ? onfocuschanged.length.length : i;
        this.getMax = new onFocusChanged(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        onFocusChanged onfocuschanged = this.getMax;
        onFocusChanged onfocuschanged2 = (onFocusChanged) settitlemargintop.setMax;
        onFocusChanged onfocuschanged3 = (onFocusChanged) settitlemargintop.getMin;
        if (onfocuschanged2.length.length == onfocuschanged3.length.length) {
            for (int i = 0; i < onfocuschanged2.length.length; i++) {
                onfocuschanged.setMin[i] = getTitleMarginTop.getMin(onfocuschanged2.setMin[i], onfocuschanged3.setMin[i], f);
                onfocuschanged.length[i] = getTitleMarginStart.getMax(f, onfocuschanged2.length[i], onfocuschanged3.length[i]);
            }
            return this.getMax;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(onfocuschanged2.length.length);
        sb.append(" vs ");
        sb.append(onfocuschanged3.length.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
