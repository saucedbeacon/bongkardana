package o;

import android.view.View;
import android.view.ViewGroup;

public class layoutDependsOn {
    private static final String toFloatRange = layoutDependsOn.class.getName();
    final ViewGroup.LayoutParams IsOverlapping;
    final int equals;
    int getMax = -1;
    final View getMin;
    int isInside = 0;
    View length;
    ViewGroup setMax;
    View setMin;

    public layoutDependsOn(View view) {
        this.getMin = view;
        this.IsOverlapping = view.getLayoutParams();
        View view2 = this.getMin;
        this.setMin = view2;
        this.equals = view2.getId();
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        if (this.setMax != null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) this.getMin.getParent();
        this.setMax = viewGroup;
        if (viewGroup == null) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.getMin == this.setMax.getChildAt(i)) {
                this.isInside = i;
                return true;
            }
        }
        return true;
    }
}
