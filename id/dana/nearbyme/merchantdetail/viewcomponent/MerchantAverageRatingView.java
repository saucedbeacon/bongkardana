package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.MerchantAverageRatingModule;
import id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity;
import id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment;
import id.dana.nearbyme.merchantreview.ViewRatingStarBar;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.nearbyme.merchantreview.model.MerchantReviewDialogDismissState;
import id.dana.nearbyme.model.ShopModel;
import id.dana.tracker.TrackerKey;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.GriverCommonResourceProxy;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.UniformOptionMenuPanelExtensionImpl;
import o.containsFavoriteMenuItem;
import o.getAllPlugins;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onSettingChange;
import o.onStateChange;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006*\u0001@\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u00100\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000202H\u0002J\b\u00106\u001a\u000202H\u0002J\u0012\u00107\u001a\u0002022\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020\fH\u0002J&\u0010;\u001a\u0002022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010=\u001a\u000202H\u0002J\b\u0010>\u001a\u000202H\u0007J\u0015\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0002¢\u0006\u0002\u0010CJ\u001c\u0010D\u001a\u0002022\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010E\u001a\u0002022\u0006\u0010F\u001a\u00020\fH\u0002J\u000e\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u000202H\u0016J\u0010\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020\u000fH\u0002J\b\u0010M\u001a\u000202H\u0002J\b\u0010N\u001a\u000202H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0018@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020*@BX\u000e¢\u0006\b\n\u0000\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "canInputReview", "", "canShowOwnReview", "currentReviewData", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewSummaryModel;", "currentShopModel", "Lid/dana/nearbyme/model/ShopModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "value", "numberOfReviews", "setNumberOfReviews", "(I)V", "Landroid/view/View$OnClickListener;", "onSeeAllClickListener", "getOnSeeAllClickListener", "()Landroid/view/View$OnClickListener;", "setOnSeeAllClickListener", "(Landroid/view/View$OnClickListener;)V", "pageSource", "", "getPageSource", "()Ljava/lang/String;", "setPageSource", "(Ljava/lang/String;)V", "presenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$Presenter;", "getPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$Presenter;", "setPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$Presenter;)V", "", "rating", "setRating", "(F)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getLayout", "handleOnReviewDialogDismiss", "", "dismissState", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "hideInputRatingSection", "hideRatingSection", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "isAllSectionAreGone", "loadAverageRating", "shopModel", "loadSkeletonView", "onClick", "onStarClickListener", "id/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingView$onStarClickListener$1", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "(Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;)Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingView$onStarClickListener$1;", "parseAttrs", "setButtonSeeAllVisibility", "show", "setTitle", "title", "", "setup", "setupAverageRatingView", "data", "setupYourReviewSection", "toggleWholeSectionWithChecking", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantAverageRatingView extends BaseRichView {
    private float IsOverlapping;
    private int equals;
    /* access modifiers changed from: private */
    public FragmentManager getMax;
    /* access modifiers changed from: private */
    public ShopModel getMin;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams isInside;
    /* access modifiers changed from: private */
    public onStateChange length;
    @Inject
    public onSettingChange.length presenter;
    @NotNull
    private String setMax;
    @Nullable
    private View.OnClickListener setMin;
    private HashMap toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    /* access modifiers changed from: private */
    public boolean toIntRange;

    @JvmOverloads
    public MerchantAverageRatingView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantAverageRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_average_rating;
    }

    public static final /* synthetic */ ShopModel access$getCurrentShopModel$p(MerchantAverageRatingView merchantAverageRatingView) {
        ShopModel shopModel = merchantAverageRatingView.getMin;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        return shopModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantAverageRatingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantAverageRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantAverageRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
    }

    @NotNull
    public final onSettingChange.length getPresenter() {
        onSettingChange.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2;
    }

    public final void setPresenter(@NotNull onSettingChange.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.presenter = length2;
    }

    @NotNull
    public final String getPageSource() {
        return this.setMax;
    }

    public final void setPageSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.setMax = str;
    }

    @Nullable
    public final View.OnClickListener getOnSeeAllClickListener() {
        return this.setMin;
    }

    public final void setOnSeeAllClickListener(@Nullable View.OnClickListener onClickListener) {
        ((TextView) _$_findCachedViewById(resetInternal.setMax.setLayoutInflater)).setOnClickListener(onClickListener);
        this.setMin = onClickListener;
    }

    private final void setMin(float f) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.isChildOrHidden);
        if (textView != null) {
            String format = new DecimalFormat("##.0").format(Float.valueOf(f));
            Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(\"##.0\").format(value)");
            textView.setText(StringsKt.replace$default(format, ",", ".", false, 4, (Object) null));
        }
        this.IsOverlapping = f;
    }

    private final void length(int i) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getCurrentContentInsetEnd);
        if (textView != null) {
            textView.setText(getResources().getString(R.string.number_of_rating_review_label, new Object[]{Integer.valueOf(i)}));
        }
        this.equals = i;
    }

    public final void loadAverageRating(@NotNull FragmentManager fragmentManager, @NotNull ShopModel shopModel, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.getMin = shopModel;
        this.getMax = fragmentManager;
        this.toFloatRange = z2;
        this.toIntRange = z;
        onSettingChange.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        ShopModel shopModel2 = this.getMin;
        if (shopModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        String str = shopModel2.Grayscale$Algorithm;
        Intrinsics.checkNotNullExpressionValue(str, "currentShopModel.merchantId");
        ShopModel shopModel3 = this.getMin;
        if (shopModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        String str2 = shopModel3.b;
        Intrinsics.checkNotNullExpressionValue(str2, "currentShopModel.shopId");
        length2.getMin(str, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"id/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingView$injectComponent$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$View;", "dismissProgress", "", "getMerchantReviewFormFail", "getMerchantReviewFormSuccess", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "onError", "errorMessage", "", "onLoadingMerchantAverageRatingFail", "onLoadingMerchantAverageRatingSuccess", "data", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewSummaryModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements onSettingChange.setMax {
        final /* synthetic */ MerchantAverageRatingView length;

        @JvmDefault
        public final void length(@Nullable GriverCommonResourceProxy griverCommonResourceProxy) {
        }

        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMin(boolean z) {
        }

        setMin(MerchantAverageRatingView merchantAverageRatingView) {
            this.length = merchantAverageRatingView;
        }

        public final void getMin(@NotNull onStateChange onstatechange) {
            Intrinsics.checkNotNullParameter(onstatechange, "data");
            dismissProgress();
            this.length.length = onstatechange;
            MerchantAverageRatingView.access$setupAverageRatingView(this.length, onstatechange);
            MerchantAverageRatingView.access$toggleWholeSectionWithChecking(this.length);
            if (this.length.toIntRange) {
                onStateChange access$getCurrentReviewData$p = this.length.length;
                if (access$getCurrentReviewData$p == null || !access$getCurrentReviewData$p.setMin()) {
                    LinearLayout linearLayout = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.getCardBackgroundColor);
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                } else {
                    MerchantAverageRatingView.access$setupYourReviewSection(this.length);
                    LinearLayout linearLayout2 = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.getCardBackgroundColor);
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    LinearLayout linearLayout3 = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.setOnCancelListener);
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                        return;
                    }
                    return;
                }
            } else {
                LinearLayout linearLayout4 = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.getCardBackgroundColor);
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
            }
            if (this.length.toFloatRange) {
                onSettingChange.length presenter = this.length.getPresenter();
                String str = MerchantAverageRatingView.access$getCurrentShopModel$p(this.length).b;
                Intrinsics.checkNotNullExpressionValue(str, "currentShopModel.shopId");
                presenter.length(str);
                return;
            }
            LinearLayout linearLayout5 = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.setOnCancelListener);
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
        }

        public final void length() {
            dismissProgress();
            MerchantAverageRatingView.access$hideInputRatingSection(this.length);
            MerchantAverageRatingView.access$toggleWholeSectionWithChecking(this.length);
        }

        public final void getMin(@NotNull MerchantConsultReviewModel merchantConsultReviewModel) {
            Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "reviewForm");
            ViewRatingStarBar viewRatingStarBar = (ViewRatingStarBar) this.length._$_findCachedViewById(resetInternal.setMax.onStartNestedScroll);
            if (viewRatingStarBar != null) {
                viewRatingStarBar.setOnStarClickListener(MerchantAverageRatingView.access$onStarClickListener(this.length, merchantConsultReviewModel));
            }
            LinearLayout linearLayout = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.setOnCancelListener);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            MerchantAverageRatingView.access$toggleWholeSectionWithChecking(this.length);
        }

        public final void setMax() {
            LinearLayout linearLayout = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.setOnCancelListener);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            MerchantAverageRatingView.access$toggleWholeSectionWithChecking(this.length);
        }

        public final void dismissProgress() {
            onDetachedFromLayoutParams access$getSkeletonScreen$p = this.length.isInside;
            if (access$getSkeletonScreen$p != null) {
                access$getSkeletonScreen$p.length();
            }
        }

        public final void showProgress() {
            onDetachedFromLayoutParams access$getSkeletonScreen$p = this.length.isInside;
            if (access$getSkeletonScreen$p != null) {
                access$getSkeletonScreen$p.getMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingView$onStarClickListener$1", "Lid/dana/nearbyme/merchantreview/ViewRatingStarBar$ClickListener;", "onStarClick", "", "rating", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ViewRatingStarBar.setMax {
        final /* synthetic */ MerchantConsultReviewModel getMin;
        final /* synthetic */ MerchantAverageRatingView setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "result", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "invoke", "id/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingView$onStarClickListener$1$onStarClick$1$2"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<MerchantReviewDialogDismissState, Unit> {
            final /* synthetic */ int $rating$inlined;
            final /* synthetic */ getMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(getMin getmin, int i) {
                super(1);
                this.this$0 = getmin;
                this.$rating$inlined = i;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MerchantReviewDialogDismissState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull MerchantReviewDialogDismissState merchantReviewDialogDismissState) {
                Intrinsics.checkNotNullParameter(merchantReviewDialogDismissState, "result");
                MerchantAverageRatingView.access$handleOnReviewDialogDismiss(this.this$0.setMin, merchantReviewDialogDismissState);
            }
        }

        getMin(MerchantAverageRatingView merchantAverageRatingView, MerchantConsultReviewModel merchantConsultReviewModel) {
            this.setMin = merchantAverageRatingView;
            this.getMin = merchantConsultReviewModel;
        }

        public final void setMin(int i) {
            FragmentManager access$getFragmentManager$p = this.setMin.getMax;
            if (access$getFragmentManager$p != null) {
                MerchantReviewDialogFragment.getMin getmin = MerchantReviewDialogFragment.length;
                MerchantConsultReviewModel merchantConsultReviewModel = this.getMin;
                merchantConsultReviewModel.setMin = i;
                Intrinsics.checkNotNullParameter(TrackerKey.SourceType.MERCHANT_DETAIL, "<set-?>");
                merchantConsultReviewModel.getMax = TrackerKey.SourceType.MERCHANT_DETAIL;
                Unit unit = Unit.INSTANCE;
                MerchantReviewDialogFragment.getMin.setMin(access$getFragmentManager$p, merchantConsultReviewModel, true, new length(this, i));
            }
        }
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (context != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.rewind)) != null) {
            setMin(obtainStyledAttributes.getFloat(1, 0.0f));
            int i = 0;
            length(obtainStyledAttributes.getInteger(0, 0));
            CharSequence text = getResources().getText(obtainStyledAttributes.getResourceId(3, R.string.merchant_rating_title));
            Intrinsics.checkNotNullExpressionValue(text, "resources.getText(\n     …          )\n            )");
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            setTitle(text);
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setLayoutInflater);
            if (textView != null) {
                if (!z) {
                    i = 8;
                }
                textView.setVisibility(i);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @OnClick({2131365543})
    public final void onClick() {
        Intent intent = new Intent(getContext(), MerchantReviewDetailActivity.class);
        ShopModel shopModel = this.getMin;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentShopModel");
        }
        intent.putExtra("EXTRA_SHOP_MODEL", shopModel);
        intent.putExtra("EXTRA_SOURCE", this.setMax);
        getContext().startActivity(intent);
    }

    public final void setTitle(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "title");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsService);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = (id.dana.nearbyme.merchantdetail.viewcomponent.MerchantYourReviewView) _$_findCachedViewById(o.resetInternal.setMax.transitionToEnd);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = (android.widget.LinearLayout) _$_findCachedViewById(o.resetInternal.setMax.setOnCancelListener);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean getMin() {
        /*
            r2 = this;
            int r0 = o.resetInternal.setMax.isQwertyMode
            android.view.View r0 = r2._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            if (r0 == 0) goto L_0x0034
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0034
            int r0 = o.resetInternal.setMax.transitionToEnd
            android.view.View r0 = r2._$_findCachedViewById(r0)
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantYourReviewView r0 = (id.dana.nearbyme.merchantdetail.viewcomponent.MerchantYourReviewView) r0
            if (r0 == 0) goto L_0x0034
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x0034
            int r0 = o.resetInternal.setMax.setOnCancelListener
            android.view.View r0 = r2._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            if (r0 == 0) goto L_0x0034
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x0034
            r0 = 1
            return r0
        L_0x0034:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAverageRatingView.getMin():boolean");
    }

    public final void setup() {
        if (this.isInside == null) {
            this.isInside = containsFavoriteMenuItem.getMin((LinearLayout) _$_findCachedViewById(resetInternal.setMax.isShortcutKey), R.layout.view_skeleton_merchant_average_rating);
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        getAllPlugins.getMin getmin = new getAllPlugins.getMin((byte) 0);
        if (r4 != null) {
            getmin.length = r4;
            getmin.setMax = new MerchantAverageRatingModule(new setMin(this));
            stopIgnoring.setMin(getmin.setMax, MerchantAverageRatingModule.class);
            stopIgnoring.setMin(getmin.length, PrepareException.AnonymousClass1.class);
            new getAllPlugins(getmin.setMax, getmin.length, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            onSettingChange.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = length2;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setupAverageRatingView(MerchantAverageRatingView merchantAverageRatingView, onStateChange onstatechange) {
        merchantAverageRatingView.setMin(onstatechange.setMin);
        merchantAverageRatingView.length(onstatechange.getMax);
        if (merchantAverageRatingView.IsOverlapping == 0.0f) {
            View _$_findCachedViewById = merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.setFirstHorizontalBias);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_divider_rating");
            _$_findCachedViewById.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.isQwertyMode);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_all_rating_container");
            linearLayout.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$toggleWholeSectionWithChecking(MerchantAverageRatingView merchantAverageRatingView) {
        if (merchantAverageRatingView.getMin()) {
            LinearLayout linearLayout = (LinearLayout) merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.getOrdering);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.getOrdering);
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    public static final /* synthetic */ void access$setupYourReviewSection(MerchantAverageRatingView merchantAverageRatingView) {
        OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r1;
        MerchantYourReviewView merchantYourReviewView = (MerchantYourReviewView) merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.transitionToEnd);
        if (merchantYourReviewView != null) {
            onStateChange onstatechange = merchantAverageRatingView.length;
            if (onstatechange != null) {
                r1 = onstatechange.getMin;
            } else {
                r1 = null;
            }
            merchantYourReviewView.setMerchantReview(r1);
        }
    }

    public static final /* synthetic */ void access$hideInputRatingSection(MerchantAverageRatingView merchantAverageRatingView) {
        LinearLayout linearLayout = (LinearLayout) merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.getViewVelocity);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public static final /* synthetic */ getMin access$onStarClickListener(MerchantAverageRatingView merchantAverageRatingView, MerchantConsultReviewModel merchantConsultReviewModel) {
        return new getMin(merchantAverageRatingView, merchantConsultReviewModel);
    }

    public static final /* synthetic */ void access$handleOnReviewDialogDismiss(MerchantAverageRatingView merchantAverageRatingView, MerchantReviewDialogDismissState merchantReviewDialogDismissState) {
        LinearLayout linearLayout;
        int i = UniformOptionMenuPanelExtensionImpl.getMax[merchantReviewDialogDismissState.ordinal()];
        if (i == 1) {
            ViewRatingStarBar viewRatingStarBar = (ViewRatingStarBar) merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.onStartNestedScroll);
            if (viewRatingStarBar != null) {
                viewRatingStarBar.setStarSelected(0);
            }
        } else if (i == 2 && (linearLayout = (LinearLayout) merchantAverageRatingView._$_findCachedViewById(resetInternal.setMax.setOnCancelListener)) != null) {
            linearLayout.setVisibility(8);
        }
    }
}
