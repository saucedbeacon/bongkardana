package o;

import android.content.Context;
import io.branch.referral.Branch;

public final class setRightButtonView extends TinyMenuFunctionModel<setRightButtonView> {
    public setRightButtonView(Context context) {
        super(context);
    }

    public final setRightButtonView setMin(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1465735979, oncanceled);
            onCancelLoad.getMin(1465735979, oncanceled);
        }
        this.IsOverlapping = str;
        return this;
    }

    public final setRightButtonView length(String str) {
        this.length = str;
        return this;
    }

    public final setRightButtonView setMin(int i) {
        this.isInside = i;
        return this;
    }

    public final setRightButtonView setMax(String str) {
        this.setMin = str;
        return this;
    }

    public final setRightButtonView getMax(String str) {
        this.getMin = str;
        return this;
    }

    public final setRightButtonView getMin(String str) {
        this.getMax = str;
        return this;
    }

    public final void setMax(Branch.getMin getmin) {
        super.getMax(getmin);
    }
}
