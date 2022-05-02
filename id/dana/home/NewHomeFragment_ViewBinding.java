package id.dana.home;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.globalnetwork.currency.CurrencySwitchRichView;
import id.dana.home.view.GridMenuView;
import id.dana.home.view.SavedCardIndicatorLottieAnimationView;
import id.dana.investment.view.HomeInvestmentView;
import id.dana.nearbyme.NewNearbyMeView;
import id.dana.promoquest.views.MissionSummaryView;
import id.dana.richview.NewPromoBannerView;
import id.dana.richview.SurveyView;
import id.dana.richview.homereferral.HomeReferralView;
import id.dana.richview.moreforyou.MoreForYouView;
import id.dana.richview.servicescard.NewServiceCardView;
import id.dana.social.view.NewSocialWidgetView;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class NewHomeFragment_ViewBinding implements Unbinder {
    private View getMax;
    private View getMin;
    private View length;
    private NewHomeFragment setMin;

    @UiThread
    public NewHomeFragment_ViewBinding(final NewHomeFragment newHomeFragment, View view) {
        this.setMin = newHomeFragment;
        newHomeFragment.btnDanaProtectionMainButton = (DanaButtonSecondaryView) drawDividersHorizontal.setMin(view, R.id.f36192131362068, "field 'btnDanaProtectionMainButton'", DanaButtonSecondaryView.class);
        newHomeFragment.currencySwitch = (CurrencySwitchRichView) drawDividersHorizontal.setMin(view, R.id.f41312131362618, "field 'currencySwitch'", CurrencySwitchRichView.class);
        newHomeFragment.currencyTv = (TextView) drawDividersHorizontal.setMin(view, R.id.f69972131365627, "field 'currencyTv'", TextView.class);
        newHomeFragment.gmvRequest = (GridMenuView) drawDividersHorizontal.setMin(view, R.id.f44752131363010, "field 'gmvRequest'", GridMenuView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f44762131363011, "field 'gmvScan' and method 'onClickScan'");
        newHomeFragment.gmvScan = (GridMenuView) drawDividersHorizontal.getMin(max, R.id.f44762131363011, "field 'gmvScan'", GridMenuView.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                newHomeFragment.onClickScan();
            }
        });
        newHomeFragment.gmvSend = (GridMenuView) drawDividersHorizontal.setMin(view, R.id.f44772131363012, "field 'gmvSend'", GridMenuView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f44782131363013, "field 'gmvTopup' and method 'onClickTopup'");
        newHomeFragment.gmvTopup = (GridMenuView) drawDividersHorizontal.getMin(max2, R.id.f44782131363013, "field 'gmvTopup'", GridMenuView.class);
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                newHomeFragment.onClickTopup();
            }
        });
        newHomeFragment.homeReferralView = (HomeReferralView) drawDividersHorizontal.setMin(view, R.id.f72462131365881, "field 'homeReferralView'", HomeReferralView.class);
        View max3 = drawDividersHorizontal.getMax(view, R.id.f54912131364053, "field 'inboxMenuBar' and method 'onClickInbox'");
        newHomeFragment.inboxMenuBar = (ImageView) drawDividersHorizontal.getMin(max3, R.id.f54912131364053, "field 'inboxMenuBar'", ImageView.class);
        this.getMax = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                newHomeFragment.onClickInbox();
            }
        });
        newHomeFragment.lavSavedCardIndicator = (SavedCardIndicatorLottieAnimationView) drawDividersHorizontal.setMin(view, R.id.f51662131363722, "field 'lavSavedCardIndicator'", SavedCardIndicatorLottieAnimationView.class);
        newHomeFragment.llPayContent = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53462131363902, "field 'llPayContent'", LinearLayout.class);
        newHomeFragment.missionSummaryView = (MissionSummaryView) drawDividersHorizontal.setMin(view, R.id.f72932131365928, "field 'missionSummaryView'", MissionSummaryView.class);
        newHomeFragment.moreForYouView = (MoreForYouView) drawDividersHorizontal.setMin(view, R.id.f72662131365901, "field 'moreForYouView'", MoreForYouView.class);
        newHomeFragment.nearbyMeView = (NewNearbyMeView) drawDividersHorizontal.setMin(view, R.id.f72692131365904, "field 'nearbyMeView'", NewNearbyMeView.class);
        newHomeFragment.homeInvestmentView = (HomeInvestmentView) drawDividersHorizontal.setMin(view, R.id.f72452131365880, "field 'homeInvestmentView'", HomeInvestmentView.class);
        newHomeFragment.nestedScrollView = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f55822131364145, "field 'nestedScrollView'", NestedScrollView.class);
        newHomeFragment.promoBannerView = (NewPromoBannerView) drawDividersHorizontal.setMin(view, R.id.f34862131361930, "field 'promoBannerView'", NewPromoBannerView.class);
        newHomeFragment.ptrHome = (PtrClassicFrameLayout) drawDividersHorizontal.setMin(view, R.id.f57242131364301, "field 'ptrHome'", PtrClassicFrameLayout.class);
        newHomeFragment.serviceCardView = (NewServiceCardView) drawDividersHorizontal.setMin(view, R.id.f73172131365952, "field 'serviceCardView'", NewServiceCardView.class);
        newHomeFragment.socialWidgetView = (NewSocialWidgetView) drawDividersHorizontal.setMin(view, R.id.f73252131365960, "field 'socialWidgetView'", NewSocialWidgetView.class);
        newHomeFragment.surveyView = (SurveyView) drawDividersHorizontal.setMin(view, R.id.f73332131365968, "field 'surveyView'", SurveyView.class);
        newHomeFragment.tvBalance = (TextView) drawDividersHorizontal.setMin(view, R.id.f64942131365119, "field 'tvBalance'", TextView.class);
        newHomeFragment.tvHiddenPayContent = (TextView) drawDividersHorizontal.setMin(view, R.id.f66642131365291, "field 'tvHiddenPayContent'", TextView.class);
        newHomeFragment.viewBalanceClickArea = drawDividersHorizontal.getMax(view, R.id.f72082131365843, "field 'viewBalanceClickArea'");
        newHomeFragment.etGlobalSearchToolbar = (EditText) drawDividersHorizontal.setMin(view, R.id.f43012131362819, "field 'etGlobalSearchToolbar'", EditText.class);
    }

    @CallSuper
    public final void setMax() {
        NewHomeFragment newHomeFragment = this.setMin;
        if (newHomeFragment != null) {
            this.setMin = null;
            newHomeFragment.btnDanaProtectionMainButton = null;
            newHomeFragment.currencySwitch = null;
            newHomeFragment.currencyTv = null;
            newHomeFragment.gmvRequest = null;
            newHomeFragment.gmvScan = null;
            newHomeFragment.gmvSend = null;
            newHomeFragment.gmvTopup = null;
            newHomeFragment.homeReferralView = null;
            newHomeFragment.inboxMenuBar = null;
            newHomeFragment.lavSavedCardIndicator = null;
            newHomeFragment.llPayContent = null;
            newHomeFragment.missionSummaryView = null;
            newHomeFragment.moreForYouView = null;
            newHomeFragment.nearbyMeView = null;
            newHomeFragment.homeInvestmentView = null;
            newHomeFragment.nestedScrollView = null;
            newHomeFragment.promoBannerView = null;
            newHomeFragment.ptrHome = null;
            newHomeFragment.serviceCardView = null;
            newHomeFragment.socialWidgetView = null;
            newHomeFragment.surveyView = null;
            newHomeFragment.tvBalance = null;
            newHomeFragment.tvHiddenPayContent = null;
            newHomeFragment.viewBalanceClickArea = null;
            newHomeFragment.etGlobalSearchToolbar = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
