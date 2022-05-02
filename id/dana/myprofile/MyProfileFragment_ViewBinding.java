package id.dana.myprofile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseWithToolbarFragment_ViewBinding;
import id.dana.richview.SimpleProfileWithQrView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class MyProfileFragment_ViewBinding extends BaseWithToolbarFragment_ViewBinding {
    private MyProfileFragment getMin;
    private View length;

    @UiThread
    public MyProfileFragment_ViewBinding(final MyProfileFragment myProfileFragment, View view) {
        super(myProfileFragment, view);
        this.getMin = myProfileFragment;
        View max = drawDividersHorizontal.getMax(view, R.id.f37032131362155, "field 'buttonVerify' and method 'onKycClick'");
        myProfileFragment.buttonVerify = (Button) drawDividersHorizontal.getMin(max, R.id.f37032131362155, "field 'buttonVerify'", Button.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                myProfileFragment.onKycClick(view);
            }
        });
        myProfileFragment.nsvProfile = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f56122131364178, "field 'nsvProfile'", NestedScrollView.class);
        myProfileFragment.qrTapInfo = (TextView) drawDividersHorizontal.setMin(view, R.id.f50382131363593, "field 'qrTapInfo'", TextView.class);
        myProfileFragment.profileView = (SimpleProfileWithQrView) drawDividersHorizontal.setMin(view, R.id.f56972131364274, "field 'profileView'", SimpleProfileWithQrView.class);
        myProfileFragment.rvProfileSetting = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59602131364545, "field 'rvProfileSetting'", RecyclerView.class);
    }

    public final void setMax() {
        MyProfileFragment myProfileFragment = this.getMin;
        if (myProfileFragment != null) {
            this.getMin = null;
            myProfileFragment.buttonVerify = null;
            myProfileFragment.nsvProfile = null;
            myProfileFragment.qrTapInfo = null;
            myProfileFragment.profileView = null;
            myProfileFragment.rvProfileSetting = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
