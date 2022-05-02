package id.dana.richview;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.PromoBannerModule;
import id.dana.promocenter.views.PromoCenterActivity;
import id.dana.promocenter.views.PromoCenterSeePromosView;
import id.dana.tracker.mixpanel.TopupSource;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.GriverBridgeManifest;
import o.GriverCapturePreviewActivity;
import o.IntRange;
import o.LoadingBridgeExtension;
import o.MainResourcePackage;
import o.PrepareException;
import o.getInsetDodgeRect;
import o.getPageUrl;
import o.onDetachedFromLayoutParams;
import o.stopIgnoring;
import o.toJSONStringWithDateFormat;

public class PromoBannerView extends BaseRichView implements GriverBridgeManifest.setMax {
    @BindView(2131362188)
    BannerView bannerView;
    @BindView(2131362491)
    ConstraintLayout clPromoBanner;
    @BindView(2131362493)
    ConstraintLayout clPromoCenter;
    private onDetachedFromLayoutParams getMax;
    private toJSONStringWithDateFormat length;
    @Inject
    public GriverBridgeManifest.getMin presenter;
    @BindView(2131365923)
    PromoCenterSeePromosView promoCenterSeePromosView;
    private getPageUrl setMax;
    @BindView(2131365464)
    TextView tvPromoCenterDescription;
    @BindView(2131365465)
    TextView tvPromoCenterTitle;

    public int getLayout() {
        return R.layout.view_promo_banner;
    }

    public void onError(String str) {
    }

    public PromoBannerView(@NonNull Context context) {
        super(context);
    }

    public PromoBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PromoBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PromoBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.length == null) {
            MainResourcePackage.AnonymousClass1.setMax setmax = new MainResourcePackage.AnonymousClass1.setMax((byte) 0);
            if (r4 != null) {
                setmax.getMin = r4;
                setmax.getMax = new PromoBannerModule(this);
                stopIgnoring.setMin(setmax.getMax, PromoBannerModule.class);
                stopIgnoring.setMin(setmax.getMin, PrepareException.AnonymousClass1.class);
                this.length = new MainResourcePackage.AnonymousClass1(setmax.getMax, setmax.getMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.length.getMax(this);
        registerPresenter(this.presenter);
    }

    public void setup() {
        showProgress();
        refreshView();
        this.bannerView.setGnNotificationCloseContainerCallback(new GriverCapturePreviewActivity(this));
    }

    public void showProgress() {
        showSkeleton();
    }

    public void refreshView() {
        this.presenter.getMin();
        this.presenter.setMin();
    }

    public void showSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.clPromoCenter);
            setmax.getMax = R.layout.view_promo_center_entry_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.getMax = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void hideBannerSkeleton() {
        BannerView bannerView2 = this.bannerView;
        if (bannerView2 != null) {
            bannerView2.hideSkeleton();
        }
    }

    public void unbindAdapter() {
        BannerView bannerView2 = this.bannerView;
        if (bannerView2 != null) {
            bannerView2.unbindAdapter();
        }
    }

    public void onFinishGetPromoCenterConfig(getPageUrl getpageurl) {
        this.setMax = getpageurl;
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.getMax = null;
        }
        this.clPromoCenter.setVisibility(this.setMax.isFeatureEnable() ? 0 : 8);
        if (this.setMax.isFeatureEnable()) {
            if (TextUtils.isEmpty(this.setMax.getTitle())) {
                this.tvPromoCenterTitle.setText(getContext().getString(R.string.promo_center_entry_title));
            } else {
                this.tvPromoCenterTitle.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(getContext(), this.setMax.getTitle(), this.setMax.getTitle()));
            }
            if (TextUtils.isEmpty(this.setMax.getDescription())) {
                this.tvPromoCenterDescription.setText(getContext().getString(R.string.promo_center_entry_description));
            } else {
                this.tvPromoCenterDescription.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(getContext(), this.setMax.getDescription(), this.setMax.getDescription()));
            }
            this.promoCenterSeePromosView.setButtonIcon(this.setMax.getButtonIconUrl());
            this.promoCenterSeePromosView.setButtonTitle(this.setMax.getButtonTitle());
            getPageUrl getpageurl2 = this.setMax;
            if (getpageurl2 != null) {
                this.promoCenterSeePromosView.setButtonIcon(getpageurl2.getButtonIconUrl());
                this.promoCenterSeePromosView.setButtonTitle(this.setMax.getButtonTitle());
            }
        }
        this.bannerView.setPromotionBannerSliderItemMode(getpageurl.isBigSliderItemModeEnabled());
    }

    /* access modifiers changed from: protected */
    @OnClick({2131365923})
    public void onViewAllClicked() {
        getContext().startActivity(new Intent(getContext(), PromoCenterActivity.class));
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.getMax = null;
        }
        hideBannerSkeleton();
    }

    public void onGetPromoCentreBannerSuccess(LoadingBridgeExtension loadingBridgeExtension) {
        List list = loadingBridgeExtension.setMin;
        if (list == null) {
            list = new ArrayList();
        }
        BannerView bannerView2 = this.bannerView;
        bannerView2.setVisibility((!bannerView2.isContentsEmpty() || !list.isEmpty()) ? 0 : 8);
        if (!list.isEmpty()) {
            this.bannerView.setPromotionModel(loadingBridgeExtension);
            this.bannerView.setContents(list);
            this.bannerView.display();
            this.bannerView.setEntryPoint(TopupSource.PROMOTION_BANNER);
        }
    }
}
