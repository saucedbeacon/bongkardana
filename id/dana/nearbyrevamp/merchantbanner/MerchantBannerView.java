package id.dana.nearbyrevamp.merchantbanner;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.rd.PageIndicatorView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.nearbyme.merchantdetail.mediaviewer.MerchantPhotoGalleryActivity;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverCommonAbilityProxyImpl;
import o.containsFavoriteMenuItem;
import o.getAddPhoneContactDialog;
import o.getInsetDodgeRect;
import o.k;
import o.resetInternal;
import o.setStatusBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0007J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0006\u0010\u001c\u001a\u00020\u0017J\u0014\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fJ\b\u0010 \u001a\u00020\u0017H\u0002J\u001e\u0010!\u001a\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\"2\b\b\u0002\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010%\u001a\u00020\u0017H\u0016J\u0006\u0010&\u001a\u00020\u0017J\b\u0010'\u001a\u00020\u0017H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lid/dana/nearbyrevamp/merchantbanner/MerchantBannerView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "merchantImages", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "pagerAdapter", "Lid/dana/nearbyrevamp/merchantbanner/MerchantBannerPagerAdapter;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "skeletonScreen", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "getCurrentPos", "getLayout", "hideShimmer", "", "initViewPager", "openMerchantPhotoGallery", "openMerchantPhotoViewerDialog", "position", "reset", "setCloseListener", "onClose", "Lkotlin/Function0;", "setMerchantBanner", "setMerchantImages", "", "currentSelectedPage", "setShopModel", "setup", "showLoading", "showShimmer", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantBannerView extends BaseRichView {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    private ShopModel getMax;
    private getAddPhoneContactDialog getMin;
    private HashMap length;
    private getInsetDodgeRect setMax;
    private List<MerchantImageModel> setMin;

    @JvmOverloads
    public MerchantBannerView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_banner;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = new ArrayList();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = new ArrayList();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ MerchantBannerView getMin;

        setMax(MerchantBannerView merchantBannerView) {
            this.getMin = merchantBannerView;
        }

        public final void onClick(View view) {
            MerchantBannerView.access$openMerchantPhotoGallery(this.getMin);
        }
    }

    public final void setup() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getMaxWidth);
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new setMax(this));
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        getAddPhoneContactDialog getaddphonecontactdialog = new getAddPhoneContactDialog(context);
        this.getMin = getaddphonecontactdialog;
        if (getaddphonecontactdialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        getaddphonecontactdialog.setMax = new setMin(this);
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(resetInternal.setMax.obtainVelocityTracker);
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new length(viewPager));
            viewPager.setOffscreenPageLimit(5);
            getAddPhoneContactDialog getaddphonecontactdialog2 = this.getMin;
            if (getaddphonecontactdialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
            }
            viewPager.setAdapter(getaddphonecontactdialog2);
        }
    }

    public static /* synthetic */ void setMerchantImages$default(MerchantBannerView merchantBannerView, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        merchantBannerView.setMerchantImages(list, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/nearbyrevamp/merchantbanner/MerchantBannerView$initViewPager$1", "Lid/dana/onboarding/view/SimplePagerAdapter$OnItemClickListener;", "onItemClick", "", "position", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setStatusBar.length {
        final /* synthetic */ MerchantBannerView getMin;

        setMin(MerchantBannerView merchantBannerView) {
            this.getMin = merchantBannerView;
        }

        public final void getMin(int i) {
            MerchantBannerView.access$openMerchantPhotoViewerDialog(this.getMin, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"id/dana/nearbyrevamp/merchantbanner/MerchantBannerView$initViewPager$2$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements ViewPager.setMax {
        final /* synthetic */ ViewPager length;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        length(ViewPager viewPager) {
            this.length = viewPager;
        }

        public final void onPageSelected(int i) {
            PageIndicatorView pageIndicatorView = (PageIndicatorView) this.length.findViewById(resetInternal.setMax.shouldDelayChildPressedState);
            if (pageIndicatorView != null) {
                pageIndicatorView.setSelected(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ Function0 getMin;

        getMin(Function0 function0) {
            this.getMin = function0;
        }

        public final void onClick(View view) {
            this.getMin.invoke();
        }
    }

    public final void setCloseListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onClose");
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.setView);
        if (imageView != null) {
            imageView.setOnClickListener(new getMin(function0));
        }
    }

    public final void setShopModel(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.getMax = shopModel;
    }

    public final void reset() {
        this.getMax = null;
        setMerchantImages$default(this, CollectionsKt.emptyList(), 0, 2, (Object) null);
        getInsetDodgeRect getinsetdodgerect = this.setMax;
        if (getinsetdodgerect != null) {
            getinsetdodgerect.length();
        }
    }

    public final int getCurrentPos() {
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(resetInternal.setMax.obtainVelocityTracker);
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/merchantbanner/MerchantBannerView$Companion;", "", "()V", "MERCHANT_BANNER_PAGE_NUM", "", "MERCHANT_BANNER_PAGE_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void setMerchantImages(@NotNull List<MerchantImageModel> list, int i) {
        List list2;
        Intrinsics.checkNotNullParameter(list, "merchantImages");
        getInsetDodgeRect getinsetdodgerect = this.setMax;
        if (getinsetdodgerect != null) {
            getinsetdodgerect.length();
        }
        Collection collection = list;
        if (collection.isEmpty()) {
            this.setMin.clear();
        } else {
            this.setMin = CollectionsKt.toMutableList(collection);
        }
        if (this.setMin.isEmpty()) {
            list2 = CollectionsKt.emptyList();
        } else {
            Iterable<MerchantImageModel> iterable = this.setMin;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (MerchantImageModel merchantImageModel : iterable) {
                arrayList.add(new GriverCommonAbilityProxyImpl(merchantImageModel.length));
            }
            list2 = CollectionsKt.toList((List) arrayList);
        }
        getAddPhoneContactDialog getaddphonecontactdialog = this.getMin;
        if (getaddphonecontactdialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        getaddphonecontactdialog.getMin(list2);
        getAddPhoneContactDialog getaddphonecontactdialog2 = this.getMin;
        if (getaddphonecontactdialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        getaddphonecontactdialog2.notifyDataSetChanged();
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getMaxWidth);
        int i2 = 8;
        if (appCompatTextView != null) {
            View view = appCompatTextView;
            boolean z = true;
            if (list2.size() <= 1) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.onCreateSupportNavigateUpTaskStack);
        if (imageView != null) {
            View view2 = imageView;
            boolean isEmpty = collection.isEmpty();
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (isEmpty) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(resetInternal.setMax.obtainVelocityTracker);
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
        }
    }

    public final void showLoading() {
        getInsetDodgeRect getinsetdodgerect = this.setMax;
        if (getinsetdodgerect != null) {
            getinsetdodgerect.getMin();
        } else {
            MerchantBannerView merchantBannerView = this;
            merchantBannerView.setMax = containsFavoriteMenuItem.getMin((ViewPager) merchantBannerView._$_findCachedViewById(resetInternal.setMax.obtainVelocityTracker), R.layout.view_merchant_banner_skeleton);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getMaxWidth);
        if (appCompatTextView != null) {
            View view = appCompatTextView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(4);
        }
    }

    public static final /* synthetic */ void access$openMerchantPhotoGallery(MerchantBannerView merchantBannerView) {
        ShopModel shopModel = merchantBannerView.getMax;
        if (shopModel != null) {
            MerchantPhotoGalleryActivity.setMin setmin = MerchantPhotoGalleryActivity.Companion;
            Context context = merchantBannerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            String str = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str, "merchantId");
            String str2 = shopModel.b;
            Intrinsics.checkNotNullExpressionValue(str2, FeatureParams.SHOP_ID);
            String str3 = shopModel.invoke;
            if (str3 == null) {
                str3 = "";
            }
            merchantBannerView.getContext().startActivity(MerchantPhotoGalleryActivity.setMin.setMax(context, str, str2, str3));
        }
    }

    public static final /* synthetic */ void access$openMerchantPhotoViewerDialog(MerchantBannerView merchantBannerView, int i) {
        BaseActivity baseActivity;
        if (merchantBannerView.getMax != null && (baseActivity = merchantBannerView.getBaseActivity()) != null) {
            ShopModel shopModel = merchantBannerView.getMax;
            Intrinsics.checkNotNull(shopModel);
            k.AnonymousClass3.getMax(baseActivity, shopModel, i, merchantBannerView.setMin);
        }
    }
}
