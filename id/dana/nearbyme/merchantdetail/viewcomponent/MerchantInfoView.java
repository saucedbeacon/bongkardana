package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.textview.MaterialTextView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.di.modules.MerchantInfoModule;
import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.scanner.ScannerActivity;
import id.dana.scanner.handler.ScannerFromViewType;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CornerMarkingDataProvider;
import o.GriverMenuExtensionImpl;
import o.GriverTransActivity;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.getBluetoothAdapterState;
import o.getInputContent;
import o.resetInternal;
import o.retrieveData;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0002J\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001bH\u0016J \u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J$\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u0002012\b\u0010!\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u00102\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u00010\rH\u0002J!\u00104\u001a\u00020\u001b2\b\u00105\u001a\u0004\u0018\u00010)2\b\u00106\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u00020\u001bH\u0002J\b\u00109\u001a\u00020\u001bH\u0002J\b\u0010:\u001a\u00020\u001bH\u0002J\u0018\u0010;\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0002R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006<"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoView;", "Lid/dana/base/BaseRichView;", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "distance", "", "getDistance", "()Ljava/lang/String;", "setDistance", "(Ljava/lang/String;)V", "merchantDetailViewState", "Lid/dana/nearbyme/merchantdetail/model/MerchantDetailViewState;", "merchantInfoPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$Presenter;", "getMerchantInfoPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$Presenter;", "setMerchantInfoPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$Presenter;)V", "bindViewState", "", "fetchMerchantInfo", "fetchPromoInfo", "getLayout", "getPromoText", "handleOpenHourIfNotFullDay", "openHour", "closeHour", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "setup", "setupMerchantAddressView", "latitude", "", "longitude", "merchantInfoAddress", "Lid/dana/nearbyme/model/ContactAddressModel;", "setupMerchantAddressViewMandatoryData", "setupMerchantDistanceAndOpenHourMandatoryData", "setupMerchantDistanceAndOpenHours", "isFullday", "", "setupMerchantInfo", "merchantLogoUrl", "setupMerchantRating", "rating", "numberOfReviews", "(Ljava/lang/Double;Ljava/lang/Double;)V", "setupMerchantSummaryInfoMandatoryData", "setupQrisText", "setupQrisView", "show24HourOrOpenTimeText", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantInfoView extends BaseRichView implements GriverTransActivity.Lite1 {
    @Nullable
    private String getMax;
    /* access modifiers changed from: private */
    public GriverMenuExtensionImpl getMin;
    @Inject
    public getInputContent.setMin merchantInfoPresenter;
    private HashMap setMax;

    @JvmOverloads
    public MerchantInfoView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_info;
    }

    public final void setup() {
    }

    public static final /* synthetic */ GriverMenuExtensionImpl access$getMerchantDetailViewState$p(MerchantInfoView merchantInfoView) {
        GriverMenuExtensionImpl griverMenuExtensionImpl = merchantInfoView.getMin;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailViewState");
        }
        return griverMenuExtensionImpl;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final getInputContent.setMin getMerchantInfoPresenter() {
        getInputContent.setMin setmin = this.merchantInfoPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantInfoPresenter");
        }
        return setmin;
    }

    public final void setMerchantInfoPresenter(@NotNull getInputContent.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.merchantInfoPresenter = setmin;
    }

    @Nullable
    public final String getDistance() {
        return this.getMax;
    }

    public final void setDistance(@Nullable String str) {
        this.getMax = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"id/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoView$injectComponent$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$View;", "onLoadMerchantPromo", "", "promoInfos", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "onLoadingMerchantInfoFail", "onLoadingMerchantInfoSuccess", "merchantInfoModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getInputContent.length {
        final /* synthetic */ MerchantInfoView getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(MerchantInfoView merchantInfoView) {
            this.getMax = merchantInfoView;
        }

        public final void getMin(@NotNull OptionMenuRecyclerAdapter optionMenuRecyclerAdapter) {
            Intrinsics.checkNotNullParameter(optionMenuRecyclerAdapter, "merchantInfoModel");
            MerchantInfoView.access$getMerchantDetailViewState$p(this.getMax).getMin.getMax(optionMenuRecyclerAdapter);
            MerchantInfoView.access$setupMerchantInfo(this.getMax, optionMenuRecyclerAdapter.getMax);
            MerchantInfoView.access$setupMerchantRating(this.getMax, optionMenuRecyclerAdapter.IsOverlapping, optionMenuRecyclerAdapter.equals);
            MerchantInfoView.access$setupMerchantDistanceAndOpenHours(this.getMax, optionMenuRecyclerAdapter.getMax(), optionMenuRecyclerAdapter.setMin, optionMenuRecyclerAdapter.length);
            MerchantInfoView.access$setupMerchantAddressView(this.getMax, optionMenuRecyclerAdapter.getMin, optionMenuRecyclerAdapter.setMax, optionMenuRecyclerAdapter.toIntRange);
            MerchantInfoView.access$setupQrisText(this.getMax);
        }

        public final void setMin() {
            MerchantSummaryInfoView merchantSummaryInfoView = (MerchantSummaryInfoView) this.getMax._$_findCachedViewById(resetInternal.setMax.setLastBaselineToBottomHeight);
            if (merchantSummaryInfoView != null) {
                merchantSummaryInfoView.hideShimmer();
            }
            MerchantDistanceAndOpenHourView merchantDistanceAndOpenHourView = (MerchantDistanceAndOpenHourView) this.getMax._$_findCachedViewById(resetInternal.setMax.positionChild);
            if (merchantDistanceAndOpenHourView != null) {
                merchantDistanceAndOpenHourView.hideShimmer();
            }
            MerchantAddressView merchantAddressView = (MerchantAddressView) this.getMax._$_findCachedViewById(resetInternal.setMax.canShowOverflowMenu);
            if (merchantAddressView != null) {
                merchantAddressView.hideShimmer();
            }
            MerchantRatingView merchantRatingView = (MerchantRatingView) this.getMax._$_findCachedViewById(resetInternal.setMax.setPrimaryBackground);
            if (merchantRatingView != null) {
                merchantRatingView.hideShimmer();
            }
            View _$_findCachedViewById = this.getMax._$_findCachedViewById(resetInternal.setMax.getOnBackPressedDispatcher);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "cl_qris");
            _$_findCachedViewById.setVisibility(8);
        }

        public final void length(@NotNull List<? extends PromoInfoModel> list) {
            Intrinsics.checkNotNullParameter(list, "promoInfos");
            MerchantPromoView merchantPromoView = (MerchantPromoView) this.getMax._$_findCachedViewById(resetInternal.setMax.ActionBarContainer);
            if (merchantPromoView == null) {
                return;
            }
            if (!list.isEmpty()) {
                merchantPromoView.setPromo(MerchantInfoView.access$getPromoText(this.getMax), list);
            } else {
                merchantPromoView.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindViewState(@org.jetbrains.annotations.NotNull o.GriverMenuExtensionImpl r8) {
        /*
            r7 = this;
            java.lang.String r0 = "merchantDetailViewState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.getMin = r8
            if (r8 != 0) goto L_0x000c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x000c:
            int r1 = o.resetInternal.setMax.setLastBaselineToBottomHeight
            android.view.View r1 = r7._$_findCachedViewById(r1)
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantSummaryInfoView r1 = (id.dana.nearbyme.merchantdetail.viewcomponent.MerchantSummaryInfoView) r1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0022
            id.dana.nearbyme.model.ShopModel r3 = r8.setMax
            java.lang.String r3 = r3.invoke
            if (r3 != 0) goto L_0x001f
            r3 = r2
        L_0x001f:
            r1.setMerchantName(r3)
        L_0x0022:
            int r1 = o.resetInternal.setMax.setLastBaselineToBottomHeight
            android.view.View r1 = r7._$_findCachedViewById(r1)
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantSummaryInfoView r1 = (id.dana.nearbyme.merchantdetail.viewcomponent.MerchantSummaryInfoView) r1
            if (r1 == 0) goto L_0x004a
            id.dana.nearbyme.model.ShopModel r8 = r8.setMax
            java.util.List<id.dana.nearbyme.model.MerchantSubcategoryModel> r3 = r8.extraCallbackWithResult
            if (r3 == 0) goto L_0x0043
            java.util.List<id.dana.nearbyme.model.MerchantSubcategoryModel> r3 = r8.extraCallbackWithResult
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            r3 = 1
            java.lang.String r4 = " "
            java.lang.String r8 = r8.getMin(r3, r4)
            goto L_0x0044
        L_0x0043:
            r8 = r2
        L_0x0044:
            if (r8 != 0) goto L_0x0047
            r8 = r2
        L_0x0047:
            r1.setMerchantCategory(r8)
        L_0x004a:
            int r8 = o.resetInternal.setMax.positionChild
            android.view.View r8 = r7._$_findCachedViewById(r8)
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDistanceAndOpenHourView r8 = (id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDistanceAndOpenHourView) r8
            android.content.Context r1 = r7.getContext()
            boolean r1 = o.WheelView.ScrollerTask.length(r1)
            if (r1 == 0) goto L_0x008c
            o.GriverMenuExtensionImpl r1 = r7.getMin
            if (r1 != 0) goto L_0x0063
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0063:
            id.dana.nearbyme.model.ShopModel r1 = r1.setMax
            double r3 = r1.toFloatRange
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x008c
            android.content.Context r1 = r7.getContext()
            boolean r1 = com.iap.ac.android.acs.plugin.ui.utils.LocationUtils.checkPermission(r1)
            if (r1 != 0) goto L_0x0078
            goto L_0x008c
        L_0x0078:
            android.content.Context r1 = r7.getContext()
            o.GriverMenuExtensionImpl r3 = r7.getMin
            if (r3 != 0) goto L_0x0083
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0083:
            id.dana.nearbyme.model.ShopModel r3 = r3.setMax
            double r3 = r3.toFloatRange
            java.lang.String r1 = o.setH5MenuList.length((android.content.Context) r1, (double) r3)
            goto L_0x008e
        L_0x008c:
            java.lang.String r1 = "-"
        L_0x008e:
            r8.setDistanceText(r1)
            o.GriverMenuExtensionImpl r8 = r7.getMin
            if (r8 != 0) goto L_0x0098
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0098:
            int r1 = o.resetInternal.setMax.canShowOverflowMenu
            android.view.View r1 = r7._$_findCachedViewById(r1)
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAddressView r1 = (id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAddressView) r1
            id.dana.nearbyme.model.ShopModel r3 = r8.setMax
            id.dana.nearbyme.model.ContactAddressModel r3 = r3.setMax()
            if (r3 == 0) goto L_0x00b5
            java.lang.String r4 = r3.setMin
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00b2
            r3 = r2
            goto L_0x00b6
        L_0x00b2:
            java.lang.String r3 = r3.setMin
            goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            if (r3 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r2 = r3
        L_0x00ba:
            r1.setMerchantAddress(r2)
            int r1 = o.resetInternal.setMax.canShowOverflowMenu
            android.view.View r1 = r7._$_findCachedViewById(r1)
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAddressView r1 = (id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAddressView) r1
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView$getMax r2 = new id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView$getMax
            r2.<init>(r8, r7)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnButtonClick(r2)
            int r8 = o.resetInternal.setMax.cancel
            android.view.View r8 = r7._$_findCachedViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            if (r8 == 0) goto L_0x00e3
            id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView$toIntRange r1 = new id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView$toIntRange
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r8.setOnClickListener(r1)
        L_0x00e3:
            r7.getMin()
            o.getInputContent$setMin r8 = r7.merchantInfoPresenter
            if (r8 != 0) goto L_0x00ef
            java.lang.String r1 = "merchantInfoPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00ef:
            o.GriverMenuExtensionImpl r1 = r7.getMin
            if (r1 != 0) goto L_0x00f6
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x00f6:
            id.dana.nearbyme.model.ShopModel r0 = r1.setMax
            r8.getMax(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantdetail.viewcomponent.MerchantInfoView.bindViewState(o.GriverMenuExtensionImpl):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ MerchantInfoView length;

        toIntRange(MerchantInfoView merchantInfoView) {
            this.length = merchantInfoView;
        }

        public final void onClick(View view) {
            BaseActivity baseActivity = this.length.getBaseActivity();
            Intent intent = new Intent(baseActivity, ScannerActivity.class);
            intent.putExtra(ScannerActivity.FROM_VIEW_TYPE, ScannerFromViewType.FOUR_KINGKONG);
            baseActivity.startActivity(intent);
        }
    }

    private final void getMin() {
        String str;
        GriverMenuExtensionImpl griverMenuExtensionImpl = this.getMin;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailViewState");
        }
        ShopModel shopModel = griverMenuExtensionImpl.setMax;
        getInputContent.setMin setmin = this.merchantInfoPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantInfoPresenter");
        }
        String str2 = shopModel.b;
        if (str2 != null && (str = shopModel.Grayscale$Algorithm) != null) {
            String displayName = Calendar.getInstance().getDisplayName(7, 2, Locale.US);
            Intrinsics.checkNotNullExpressionValue(displayName, "DateTimeUtil.getCurrentDayOfWeek()");
            setmin.setMax(str2, str, displayName);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoView$setupMerchantAddressViewMandatoryData$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ GriverMenuExtensionImpl getMax;
        final /* synthetic */ MerchantInfoView setMin;

        getMax(GriverMenuExtensionImpl griverMenuExtensionImpl, MerchantInfoView merchantInfoView) {
            this.getMax = griverMenuExtensionImpl;
            this.setMin = merchantInfoView;
        }

        public final void onClick(View view) {
            Context context = this.setMin.getContext();
            if (context != null) {
                startBeaconDiscovery.setMin(context, this.getMax.setMax.values, this.getMax.setMax.toString);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ MerchantInfoView getMax;
        final /* synthetic */ double length;
        final /* synthetic */ double setMin;

        length(MerchantInfoView merchantInfoView, double d, double d2) {
            this.getMax = merchantInfoView;
            this.length = d;
            this.setMin = d2;
        }

        public final void onClick(View view) {
            Context context = this.getMax.getContext();
            if (context != null) {
                startBeaconDiscovery.setMin(context, this.length, this.setMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Runnable {
        final /* synthetic */ MerchantInfoView setMax;

        setMax(MerchantInfoView merchantInfoView) {
            this.setMax = merchantInfoView;
        }

        public final void run() {
            MaterialTextView materialTextView = (MaterialTextView) this.setMax._$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (materialTextView != null && materialTextView.getLineCount() > 1) {
                Button button = (Button) this.setMax._$_findCachedViewById(resetInternal.setMax.cancel);
                if (button != null) {
                    button.setMinimumWidth(0);
                }
                Button button2 = (Button) this.setMax._$_findCachedViewById(resetInternal.setMax.cancel);
                if (button2 != null) {
                    button2.setMinWidth(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements Runnable {
        final /* synthetic */ MerchantInfoView length;

        getMin(MerchantInfoView merchantInfoView) {
            this.length = merchantInfoView;
        }

        public final void run() {
            Button button;
            MaterialTextView materialTextView = (MaterialTextView) this.length._$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (materialTextView != null && materialTextView.getLineCount() > 1 && (button = (Button) this.length._$_findCachedViewById(resetInternal.setMax.cancel)) != null) {
                Context context = this.length.getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                Integer valueOf = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.f29862131165706));
                Context context2 = this.length.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                getBluetoothAdapterState.getMax(button, valueOf, (Integer) null, Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.f29862131165706)), (Integer) null, 10);
            }
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        retrieveData.getMax getmax = new retrieveData.getMax((byte) 0);
        if (r4 != null) {
            getmax.setMin = r4;
            getmax.setMax = new MerchantInfoModule(new setMin(this));
            stopIgnoring.setMin(getmax.setMax, MerchantInfoModule.class);
            stopIgnoring.setMin(getmax.setMin, PrepareException.AnonymousClass1.class);
            new retrieveData(getmax.setMax, getmax.setMin, (byte) 0).getMin(this);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setupMerchantInfo(MerchantInfoView merchantInfoView, String str) {
        MerchantSummaryInfoView merchantSummaryInfoView = (MerchantSummaryInfoView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.setLastBaselineToBottomHeight);
        if (merchantSummaryInfoView != null) {
            merchantSummaryInfoView.hideShimmer();
        }
        MerchantSummaryInfoView merchantSummaryInfoView2 = (MerchantSummaryInfoView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.setLastBaselineToBottomHeight);
        if (merchantSummaryInfoView2 != null) {
            merchantSummaryInfoView2.setMerchantLogoUrl(str);
        }
    }

    public static final /* synthetic */ void access$setupMerchantRating(MerchantInfoView merchantInfoView, Double d, Double d2) {
        MerchantRatingView merchantRatingView = (MerchantRatingView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.setPrimaryBackground);
        if (merchantRatingView != null) {
            merchantRatingView.hideShimmer();
        }
        MerchantRatingView merchantRatingView2 = (MerchantRatingView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.setPrimaryBackground);
        if (merchantRatingView2 != null) {
            merchantRatingView2.setRating(d);
            merchantRatingView2.setNumberOfReviews(d2);
        }
    }

    public static final /* synthetic */ void access$setupMerchantDistanceAndOpenHours(MerchantInfoView merchantInfoView, boolean z, String str, String str2) {
        String str3;
        MerchantDistanceAndOpenHourView merchantDistanceAndOpenHourView = (MerchantDistanceAndOpenHourView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.positionChild);
        if (merchantDistanceAndOpenHourView != null) {
            merchantDistanceAndOpenHourView.hideShimmer();
        }
        if (z) {
            MerchantDistanceAndOpenHourView merchantDistanceAndOpenHourView2 = (MerchantDistanceAndOpenHourView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.positionChild);
            if (merchantDistanceAndOpenHourView2 != null) {
                merchantDistanceAndOpenHourView2.setOpenHoursText(merchantInfoView.getResources().getString(R.string.merchant_info_twenty_four_hour_value));
                return;
            }
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        boolean z2 = true;
        if (str.length() == 0) {
            if (str2.length() != 0) {
                z2 = false;
            }
            if (z2) {
                MerchantDistanceAndOpenHourView merchantDistanceAndOpenHourView3 = (MerchantDistanceAndOpenHourView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.positionChild);
                if (merchantDistanceAndOpenHourView3 != null) {
                    merchantDistanceAndOpenHourView3.setOpenHoursText(merchantInfoView.getResources().getString(R.string.merchant_default_empty_value));
                    return;
                }
                return;
            }
        }
        MerchantDistanceAndOpenHourView merchantDistanceAndOpenHourView4 = (MerchantDistanceAndOpenHourView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.positionChild);
        if (merchantDistanceAndOpenHourView4 != null) {
            if (Intrinsics.areEqual((Object) str, (Object) str2)) {
                str3 = merchantInfoView.getResources().getString(R.string.merchant_info_twenty_four_hour_value);
                Intrinsics.checkNotNullExpressionValue(str3, "resources.getString(R.st…o_twenty_four_hour_value)");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" - ");
                sb.append(str2);
                str3 = sb.toString();
            }
            merchantDistanceAndOpenHourView4.setOpenHoursText(str3);
        }
    }

    public static final /* synthetic */ void access$setupMerchantAddressView(MerchantInfoView merchantInfoView, double d, double d2, ContactAddressModel contactAddressModel) {
        String str;
        MerchantAddressView merchantAddressView = (MerchantAddressView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.canShowOverflowMenu);
        if (merchantAddressView != null) {
            merchantAddressView.hideShimmer();
        }
        MerchantAddressView merchantAddressView2 = (MerchantAddressView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.canShowOverflowMenu);
        if (merchantAddressView2 != null) {
            if (TextUtils.isEmpty(contactAddressModel.setMin)) {
                str = "";
            } else {
                str = contactAddressModel.setMin;
            }
            Intrinsics.checkNotNullExpressionValue(str, "merchantInfoAddress.readableContactAddress");
            merchantAddressView2.setMerchantAddress(str);
        }
        MerchantAddressView merchantAddressView3 = (MerchantAddressView) merchantInfoView._$_findCachedViewById(resetInternal.setMax.canShowOverflowMenu);
        if (merchantAddressView3 != null) {
            merchantAddressView3.setOnButtonClick(new length(merchantInfoView, d, d2));
        }
    }

    public static final /* synthetic */ void access$setupQrisText(MerchantInfoView merchantInfoView) {
        View _$_findCachedViewById = merchantInfoView._$_findCachedViewById(resetInternal.setMax.getOnBackPressedDispatcher);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        View _$_findCachedViewById2 = merchantInfoView._$_findCachedViewById(resetInternal.setMax.getOnBackPressedDispatcher);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.post(new setMax(merchantInfoView));
        }
        View _$_findCachedViewById3 = merchantInfoView._$_findCachedViewById(resetInternal.setMax.getOnBackPressedDispatcher);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.post(new getMin(merchantInfoView));
        }
    }

    public static final /* synthetic */ String access$getPromoText(MerchantInfoView merchantInfoView) {
        String str;
        StringBuilder sb = new StringBuilder();
        GriverMenuExtensionImpl griverMenuExtensionImpl = merchantInfoView.getMin;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailViewState");
        }
        ShopModel shopModel = griverMenuExtensionImpl.setMax;
        Context context = merchantInfoView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        String str2 = "";
        if (shopModel.equals()) {
            str = shopModel.Mean$Arithmetic.get(0).length;
        } else {
            str = str2;
        }
        Intrinsics.checkNotNullExpressionValue(str, "prizeType");
        if (shopModel.equals()) {
            str2 = shopModel.Mean$Arithmetic.get(0).length;
        }
        Intrinsics.checkNotNullExpressionValue(str2, "prizeType");
        sb.append(CornerMarkingDataProvider.AnonymousClass3.setMin(context, str, str2));
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(shopModel.IsOverlapping());
        sb.append(sb2.toString());
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }
}
