package id.dana.referral;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.SearchView;
import id.dana.richview.contactselector.ContactSelectorView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class MyReferralDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MyReferralDetailActivity getMax;
    private View getMin;

    @UiThread
    public MyReferralDetailActivity_ViewBinding(final MyReferralDetailActivity myReferralDetailActivity, View view) {
        super(myReferralDetailActivity, view);
        this.getMax = myReferralDetailActivity;
        myReferralDetailActivity.referralCodeSectionView = (ReferralCodeSectionView) drawDividersHorizontal.setMin(view, R.id.f57502131364328, "field 'referralCodeSectionView'", ReferralCodeSectionView.class);
        myReferralDetailActivity.svSearch = (SearchView) drawDividersHorizontal.setMin(view, R.id.f73072131365942, "field 'svSearch'", SearchView.class);
        myReferralDetailActivity.contactSelectorView = (ContactSelectorView) drawDividersHorizontal.setMin(view, R.id.f41252131362611, "field 'contactSelectorView'", ContactSelectorView.class);
        myReferralDetailActivity.collapsingToolbarLayout = (CollapsingToolbarLayout) drawDividersHorizontal.setMin(view, R.id.f40682131362551, "field 'collapsingToolbarLayout'", CollapsingToolbarLayout.class);
        myReferralDetailActivity.ivBackgroundReferral = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48062131363359, "field 'ivBackgroundReferral'", ImageView.class);
        myReferralDetailActivity.tvReferralSearchTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68722131365499, "field 'tvReferralSearchTitle'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f52182131363774, "method 'closeToHome'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                myReferralDetailActivity.closeToHome(view);
            }
        });
    }

    public final void setMax() {
        MyReferralDetailActivity myReferralDetailActivity = this.getMax;
        if (myReferralDetailActivity != null) {
            this.getMax = null;
            myReferralDetailActivity.referralCodeSectionView = null;
            myReferralDetailActivity.svSearch = null;
            myReferralDetailActivity.contactSelectorView = null;
            myReferralDetailActivity.collapsingToolbarLayout = null;
            myReferralDetailActivity.ivBackgroundReferral = null;
            myReferralDetailActivity.tvReferralSearchTitle = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
