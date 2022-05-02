package o;

import android.view.View;
import java.util.List;
import o.FitWindowsLinearLayout;
import o.setOnFitSystemWindowsListener;

public final class setDividerDrawable extends FitWindowsLinearLayout<View> {
    private FitWindowsLinearLayout.length<View> getMin;
    private FitWindowsLinearLayout.getMax<View> setMax;
    private List<setOnFitSystemWindowsListener.setMax<View>> setMin;

    public setDividerDrawable(int i, List<setOnFitSystemWindowsListener.setMax<View>> list) {
        if (i == 0) {
            this.setMax = getDividerDrawable.getMin;
        } else if (i == 4) {
            this.getMin = setDividerPadding.setMin;
        } else if (i == 8) {
            this.getMin = getDividerPadding.setMax;
        }
        this.setMin = list;
    }

    public final List<setOnFitSystemWindowsListener.setMax<View>> setMax() {
        return this.setMin;
    }

    public final FitWindowsLinearLayout.length<View> getMax() {
        return this.getMin;
    }

    public final FitWindowsLinearLayout.getMax<View> setMin() {
        return this.setMax;
    }
}
