package id.dana.richview.homereferral;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.HomeReferralModule;
import id.dana.di.modules.MissionSummaryModule;
import id.dana.di.modules.OauthModule;
import id.dana.home.RoundedCornersTransformation;
import id.dana.model.ThirdPartyService;
import id.dana.promoquest.model.MissionModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.GriverResourceLoadExtension;
import o.IntRange;
import o.PrepareException;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getBackgroundExecutor;
import o.getDuration;
import o.getInsetDodgeRect;
import o.handleLoggingAction;
import o.isShowMenu;
import o.layoutChildWithAnchor;
import o.loadTitleBarSnapshot;
import o.onAction;
import o.onDetachedFromLayoutParams;
import o.parseBehavior;
import o.removeView;
import o.setScaleX;
import o.stopIgnoring;
import o.style;
import o.updateCornerMarking;
import o.updatePostLayout;
import org.jetbrains.annotations.NotNull;

public class HomeReferralView extends BaseRichView implements onAction.length {
    @BindView(2131362443)
    ConstraintLayout clReferralContainer;
    private GriverResourceLoadExtension.AnonymousClass2 getMax;
    private onDetachedFromLayoutParams getMin;
    @BindView(2131363476)
    ImageView ivReferralBanner;
    private String length;
    @Inject
    public getBackgroundExecutor.setMin missionSummaryPresenter;
    @Inject
    public onAction.setMax presenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    private handleLoggingAction setMax;

    public int getLayout() {
        return R.layout.view_home_referral;
    }

    public void onError(String str) {
    }

    public HomeReferralView(@NonNull Context context) {
        super(context);
    }

    public HomeReferralView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeReferralView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HomeReferralView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r15) {
        if (this.getMax == null) {
            loadTitleBarSnapshot.setMax setmax = new loadTitleBarSnapshot.setMax((byte) 0);
            if (r15 != null) {
                setmax.toFloatRange = r15;
                setmax.length = new HomeReferralModule(this);
                setmax.IsOverlapping = new MissionSummaryModule(new getBackgroundExecutor.length() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void onError(@org.jetbrains.annotations.Nullable String str) {
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }

                    public final void getMax(@NotNull List<MissionModel> list, boolean z) {
                        if (z) {
                            HomeReferralView.this.enableEntryPoint(false);
                        } else {
                            HomeReferralView.this.presenter.length();
                        }
                    }

                    public final void getMax() {
                        HomeReferralView.this.presenter.length();
                    }

                    public final void setMax(boolean z) {
                        if (z) {
                            HomeReferralView.this.missionSummaryPresenter.length();
                        }
                    }
                });
                setmax.equals = new ServicesModule((style.getMin) new style.getMin() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                        Intrinsics.checkNotNullParameter(str, "authCode");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void getMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void length() {
                    }

                    @JvmDefault
                    public final void onError(@org.jetbrains.annotations.Nullable String str) {
                    }

                    @JvmDefault
                    public final void setMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void setMax(boolean z) {
                    }

                    @JvmDefault
                    public final void setMin() {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void setMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }
                });
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = getBaseActivity();
                max.length = TrackerKey.SourceType.REFERRAL;
                setmax.getMin = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = getBaseActivity();
                setmax.getMax = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = getBaseActivity();
                setmax.setMax = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = getBaseActivity();
                setmax.setMin = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = getBaseActivity();
                setmax.isInside = new OauthModule(min2, (byte) 0);
                stopIgnoring.setMin(setmax.length, HomeReferralModule.class);
                stopIgnoring.setMin(setmax.getMin, DeepLinkModule.class);
                stopIgnoring.setMin(setmax.getMax, ScanQrModule.class);
                stopIgnoring.setMin(setmax.setMax, RestoreUrlModule.class);
                stopIgnoring.setMin(setmax.setMin, FeatureModule.class);
                stopIgnoring.setMin(setmax.isInside, OauthModule.class);
                if (setmax.equals == null) {
                    setmax.equals = new ServicesModule();
                }
                stopIgnoring.setMin(setmax.IsOverlapping, MissionSummaryModule.class);
                stopIgnoring.setMin(setmax.toFloatRange, PrepareException.AnonymousClass1.class);
                this.getMax = new loadTitleBarSnapshot(setmax.length, setmax.getMin, setmax.getMax, setmax.setMax, setmax.setMin, setmax.isInside, setmax.equals, setmax.IsOverlapping, setmax.toFloatRange, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.getMax(this);
        registerPresenter(this.presenter, this.readDeepLinkPropertiesPresenter, this.missionSummaryPresenter);
    }

    public void setup() {
        this.presenter.getMax();
        this.missionSummaryPresenter.setMin();
    }

    public void checkReferralQuestExists() {
        this.missionSummaryPresenter.setMin();
    }

    public void showProgress() {
        showSkeleton();
    }

    public void onGetReferralStatusConsultSuccess(handleLoggingAction handleloggingaction) {
        if (handleloggingaction != null) {
            this.setMax = handleloggingaction;
        }
    }

    public void enableBanner(boolean z) {
        this.ivReferralBanner.setVisibility(z ? 0 : 8);
    }

    public void onLoadBanner(String str) {
        RoundedCornersTransformation.CornerType cornerType;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.f26342131165288);
        if (getMin()) {
            cornerType = RoundedCornersTransformation.CornerType.TOP;
        } else {
            cornerType = RoundedCornersTransformation.CornerType.ALL;
        }
        RoundedCornersTransformation roundedCornersTransformation = new RoundedCornersTransformation(dimensionPixelSize, 1, cornerType);
        ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMin((updatePostLayout<Bitmap>) new setScaleX(new removeView(), roundedCornersTransformation)).getMax(new parseBehavior<Drawable>() {
            public final /* bridge */ /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                return false;
            }

            public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                HomeReferralView.this.enableEntryPoint(false);
                return false;
            }
        }).length(this.ivReferralBanner);
    }

    public void saveEntryPointUrl(String str) {
        this.length = str;
    }

    public void enableEntryPoint(boolean z) {
        this.clReferralContainer.setVisibility(z ? 0 : 8);
    }

    private boolean getMin() {
        handleLoggingAction handleloggingaction = this.setMax;
        return handleloggingaction != null && !TextUtils.isEmpty(handleloggingaction.setMin);
    }

    public void showSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.clReferralContainer);
            setmax.getMax = R.layout.view_home_referral_entry_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.getMin = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.getMin = null;
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363476})
    public void onBannerClicked() {
        convertDipToPx.length length2 = new convertDipToPx.length(getBaseActivity().getApplicationContext());
        length2.getMax = TrackerKey.Event.REFERRAL_BANNER_CLICK;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        String str = this.length;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.trim().contains("https://link.dana.id/")) {
            this.readDeepLinkPropertiesPresenter.setMax(str);
        } else {
            DanaH5.startContainerFullUrl(isShowMenu.setMin(str));
        }
    }
}
