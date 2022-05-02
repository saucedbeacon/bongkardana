package id.dana.social;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public final class ReciprocalBottomSheetDialog_ViewBinding implements Unbinder {
    private ReciprocalBottomSheetDialog getMin;

    @UiThread
    public ReciprocalBottomSheetDialog_ViewBinding(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, View view) {
        this.getMin = reciprocalBottomSheetDialog;
        reciprocalBottomSheetDialog.clFriendlist = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f39572131362436, "field 'clFriendlist'", CoordinatorLayout.class);
        reciprocalBottomSheetDialog.cvFriendlist = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f41592131362646, "field 'cvFriendlist'", FrameLayout.class);
    }

    public final void setMax() {
        ReciprocalBottomSheetDialog reciprocalBottomSheetDialog = this.getMin;
        if (reciprocalBottomSheetDialog != null) {
            this.getMin = null;
            reciprocalBottomSheetDialog.clFriendlist = null;
            reciprocalBottomSheetDialog.cvFriendlist = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
