package id.dana.social;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.annotation.UiThread;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public final class RelationshipBottomSheetDialog_ViewBinding implements Unbinder {
    private RelationshipBottomSheetDialog getMin;

    @UiThread
    public RelationshipBottomSheetDialog_ViewBinding(RelationshipBottomSheetDialog relationshipBottomSheetDialog, View view) {
        this.getMin = relationshipBottomSheetDialog;
        relationshipBottomSheetDialog.cvFriendship = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f41602131362647, "field 'cvFriendship'", FrameLayout.class);
        relationshipBottomSheetDialog.clFriendship = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f39592131362438, "field 'clFriendship'", CoordinatorLayout.class);
        relationshipBottomSheetDialog.vpFriendship = (ViewPager) drawDividersHorizontal.setMin(view, R.id.f73682131366003, "field 'vpFriendship'", ViewPager.class);
        relationshipBottomSheetDialog.rbFollower = (RadioButton) drawDividersHorizontal.setMin(view, R.id.f57432131364321, "field 'rbFollower'", RadioButton.class);
        relationshipBottomSheetDialog.rbFollowing = (RadioButton) drawDividersHorizontal.setMin(view, R.id.f57442131364322, "field 'rbFollowing'", RadioButton.class);
    }

    public final void setMax() {
        RelationshipBottomSheetDialog relationshipBottomSheetDialog = this.getMin;
        if (relationshipBottomSheetDialog != null) {
            this.getMin = null;
            relationshipBottomSheetDialog.cvFriendship = null;
            relationshipBottomSheetDialog.clFriendship = null;
            relationshipBottomSheetDialog.vpFriendship = null;
            relationshipBottomSheetDialog.rbFollower = null;
            relationshipBottomSheetDialog.rbFollowing = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
