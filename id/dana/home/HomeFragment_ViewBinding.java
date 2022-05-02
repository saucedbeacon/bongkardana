package id.dana.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import id.dana.R;
import id.dana.globalnetwork.currency.CurrencySwitchRichView;
import id.dana.globalsearch.view.widget.GlobalSearchHintView;
import id.dana.home.news.NewsFeedsView;
import id.dana.home.view.GridMenuView;
import id.dana.home.view.SavedCardIndicatorLottieAnimationView;
import id.dana.nearbyme.NearbyMeView;
import id.dana.promoquest.views.MissionSummaryView;
import id.dana.richview.PromoBannerView;
import id.dana.richview.SurveyView;
import id.dana.richview.homereferral.HomeReferralView;
import id.dana.richview.servicescard.ServiceCardView;
import id.dana.social.view.SocialWidgetView;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class HomeFragment_ViewBinding implements Unbinder {
    private View getMax;
    private HomeFragment getMin;
    private View length;
    private View setMin;

    @UiThread
    public HomeFragment_ViewBinding(final HomeFragment homeFragment, View view) {
        this.getMin = homeFragment;
        homeFragment.socialWidgetView = (SocialWidgetView) drawDividersHorizontal.setMin(view, R.id.f73252131365960, "field 'socialWidgetView'", SocialWidgetView.class);
        homeFragment.appBarLayout = (AppBarLayout) drawDividersHorizontal.setMin(view, R.id.f34652131361904, "field 'appBarLayout'", AppBarLayout.class);
        homeFragment.tvBalance = (TextView) drawDividersHorizontal.setMin(view, R.id.f64942131365119, "field 'tvBalance'", TextView.class);
        homeFragment.tvHiddenPayContent = (TextView) drawDividersHorizontal.setMin(view, R.id.f66642131365291, "field 'tvHiddenPayContent'", TextView.class);
        homeFragment.currencyTv = (TextView) drawDividersHorizontal.setMin(view, R.id.f69972131365627, "field 'currencyTv'", TextView.class);
        homeFragment.llPayContent = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53462131363902, "field 'llPayContent'", LinearLayout.class);
        homeFragment.globalSearchHintView = (GlobalSearchHintView) drawDividersHorizontal.setMin(view, R.id.f72422131365877, "field 'globalSearchHintView'", GlobalSearchHintView.class);
        homeFragment.ptrHome = (PtrClassicFrameLayout) drawDividersHorizontal.setMin(view, R.id.f57242131364301, "field 'ptrHome'", PtrClassicFrameLayout.class);
        homeFragment.lavSavedCardIndicator = (SavedCardIndicatorLottieAnimationView) drawDividersHorizontal.setMin(view, R.id.f51662131363722, "field 'lavSavedCardIndicator'", SavedCardIndicatorLottieAnimationView.class);
        homeFragment.currencySwitch = (CurrencySwitchRichView) drawDividersHorizontal.setMin(view, R.id.f41312131362618, "field 'currencySwitch'", CurrencySwitchRichView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f54912131364053, "field 'inboxMenuBar' and method 'onClickInbox'");
        homeFragment.inboxMenuBar = (ImageView) drawDividersHorizontal.getMin(max, R.id.f54912131364053, "field 'inboxMenuBar'", ImageView.class);
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                homeFragment.onClickInbox();
            }
        });
        homeFragment.nearbyMeView = (NearbyMeView) drawDividersHorizontal.setMin(view, R.id.f72692131365904, "field 'nearbyMeView'", NearbyMeView.class);
        homeFragment.nestedScrollView = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f55822131364145, "field 'nestedScrollView'", NestedScrollView.class);
        homeFragment.missionSummaryView = (MissionSummaryView) drawDividersHorizontal.setMin(view, R.id.f72932131365928, "field 'missionSummaryView'", MissionSummaryView.class);
        homeFragment.surveyView = (SurveyView) drawDividersHorizontal.setMin(view, R.id.f73332131365968, "field 'surveyView'", SurveyView.class);
        homeFragment.newsFeedsView = (NewsFeedsView) drawDividersHorizontal.setMin(view, R.id.f72712131365906, "field 'newsFeedsView'", NewsFeedsView.class);
        homeFragment.promoBannerView = (PromoBannerView) drawDividersHorizontal.setMin(view, R.id.f34862131361930, "field 'promoBannerView'", PromoBannerView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f44762131363011, "field 'gmvScan' and method 'onClickScan'");
        homeFragment.gmvScan = (GridMenuView) drawDividersHorizontal.getMin(max2, R.id.f44762131363011, "field 'gmvScan'", GridMenuView.class);
        this.getMax = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                homeFragment.onClickScan();
            }
        });
        homeFragment.gmvSend = (GridMenuView) drawDividersHorizontal.setMin(view, R.id.f44772131363012, "field 'gmvSend'", GridMenuView.class);
        homeFragment.gmvRequest = (GridMenuView) drawDividersHorizontal.setMin(view, R.id.f44752131363010, "field 'gmvRequest'", GridMenuView.class);
        View max3 = drawDividersHorizontal.getMax(view, R.id.f44782131363013, "field 'gmvTopup' and method 'onClickTopup'");
        homeFragment.gmvTopup = (GridMenuView) drawDividersHorizontal.getMin(max3, R.id.f44782131363013, "field 'gmvTopup'", GridMenuView.class);
        this.length = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                homeFragment.onClickTopup();
            }
        });
        homeFragment.viewBalanceClickArea = drawDividersHorizontal.getMax(view, R.id.f72082131365843, "field 'viewBalanceClickArea'");
        homeFragment.serviceCardView = (ServiceCardView) drawDividersHorizontal.setMin(view, R.id.f73172131365952, "field 'serviceCardView'", ServiceCardView.class);
        homeFragment.homeReferralView = (HomeReferralView) drawDividersHorizontal.setMin(view, R.id.f72462131365881, "field 'homeReferralView'", HomeReferralView.class);
    }

    @CallSuper
    public final void setMax() {
        HomeFragment homeFragment = this.getMin;
        if (homeFragment != null) {
            this.getMin = null;
            homeFragment.socialWidgetView = null;
            homeFragment.appBarLayout = null;
            homeFragment.tvBalance = null;
            homeFragment.tvHiddenPayContent = null;
            homeFragment.currencyTv = null;
            homeFragment.llPayContent = null;
            homeFragment.globalSearchHintView = null;
            homeFragment.ptrHome = null;
            homeFragment.lavSavedCardIndicator = null;
            homeFragment.currencySwitch = null;
            homeFragment.inboxMenuBar = null;
            homeFragment.nearbyMeView = null;
            homeFragment.nestedScrollView = null;
            homeFragment.missionSummaryView = null;
            homeFragment.surveyView = null;
            homeFragment.newsFeedsView = null;
            homeFragment.promoBannerView = null;
            homeFragment.gmvScan = null;
            homeFragment.gmvSend = null;
            homeFragment.gmvRequest = null;
            homeFragment.gmvTopup = null;
            homeFragment.viewBalanceClickArea = null;
            homeFragment.serviceCardView = null;
            homeFragment.homeReferralView = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
