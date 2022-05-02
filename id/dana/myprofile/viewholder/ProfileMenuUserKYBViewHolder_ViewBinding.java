package id.dana.myprofile.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.KybCardView;
import o.drawDividersHorizontal;

public class ProfileMenuUserKYBViewHolder_ViewBinding implements Unbinder {
    private ProfileMenuUserKYBViewHolder getMax;

    @UiThread
    public ProfileMenuUserKYBViewHolder_ViewBinding(ProfileMenuUserKYBViewHolder profileMenuUserKYBViewHolder, View view) {
        this.getMax = profileMenuUserKYBViewHolder;
        profileMenuUserKYBViewHolder.kybCardView = (KybCardView) drawDividersHorizontal.setMin(view, R.id.f37572131362212, "field 'kybCardView'", KybCardView.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileMenuUserKYBViewHolder profileMenuUserKYBViewHolder = this.getMax;
        if (profileMenuUserKYBViewHolder != null) {
            this.getMax = null;
            profileMenuUserKYBViewHolder.kybCardView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
