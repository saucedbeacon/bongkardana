package o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.dana.R;
import o.RawQuery;

public class deleteAppInfoById {
    private Unbinder getMax;
    public isBaselineAligned length;
    private Activity setMin;

    public deleteAppInfoById(Activity activity) {
        View inflate = View.inflate(activity, R.layout.dialog_loading, (ViewGroup) null);
        this.setMin = activity;
        isBaselineAligned cancelable = new isBaselineAligned(activity, isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelable(false);
        this.length = cancelable;
        setBaselineAlignedChildIndex.customView(cancelable, (Integer) null, inflate, false, false, false, false);
        ButterKnife.setMin(inflate);
        this.getMax = ButterKnife.setMax((Object) this, inflate);
    }

    public final void getMin() {
        if (setTopBackgroundColor.getMin(this.setMin) && this.length.isShowing()) {
            try {
                this.length.dismiss();
            } catch (Exception unused) {
            }
            RawQuery.getMax(this.getMax, RawQuery.length.getMin);
        }
    }

    public final boolean setMin() {
        isBaselineAligned isbaselinealigned = this.length;
        return isbaselinealigned != null && isbaselinealigned.isShowing();
    }
}
