package id.dana.nearbyrevamp.merchantdetail.bottomsheet;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.merchantdetail.MerchantDetailView;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CascadingMenuPopup$HorizPosition;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 J2\u00020\u0001:\u0001JB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\u0006\u0010$\u001a\u00020\u0013J\b\u0010%\u001a\u00020\u0007H\u0016J\u0006\u0010&\u001a\u00020\u0013J\u0006\u0010'\u001a\u00020\u000fJ\u0006\u0010(\u001a\u00020\u000fJ\u0006\u0010)\u001a\u00020\u000fJ\u0006\u0010*\u001a\u00020\u0013J\u0006\u0010+\u001a\u00020\u0013J\u0006\u0010,\u001a\u00020\u0013J\u0006\u0010-\u001a\u00020\u0013J\u0014\u0010.\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\u0010\u0010/\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0007J\b\u00102\u001a\u00020\u0013H\u0002J\u0006\u00103\u001a\u00020\u0013J)\u00104\u001a\u00020\u00132!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eJ\u000e\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u000fJ\b\u00107\u001a\u00020\u0013H\u0016J\b\u00108\u001a\u00020\u0013H\u0002J\u000e\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0019J\u0016\u0010;\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=J\u0016\u0010>\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010@\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=H\u0002J\u001c\u0010A\u001a\u00020\u00132\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010:\u001a\u00020\u0019J\u001e\u0010E\u001a\u00020\u0013*\u00020F2\u0006\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u0007H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fX.¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006K"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/bottomsheet/MerchantDetailBottomsheetView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bottomsheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "merchantBannerShown", "", "dimBackgroundView", "Landroid/view/View;", "forceCollapse", "shopModelLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lid/dana/nearbyme/model/ShopModel;", "getShopModelLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setShopModelLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "addBottomsheetCallback", "bottomSheetCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "adjustBottomSheetPeekHeight", "checkBackgroundDim", "checkCardRadius", "collapseBottomsheet", "getLayout", "hideMerchantDetailBottomsheet", "isMerchantDetailFullyDisplayed", "isMerchantDetailPreviewDisplayed", "isShowing", "onMerchantDetailFullyShown", "onMerchantDetailRefreshed", "reset", "resetMerchantDetailContent", "setBottomsheetBehavior", "setDimBackground", "setInitialState", "state", "setMerchantDetailStateFromList", "setNonDraggableExpandBottomsheet", "setOnScrollListener", "setSkipCollapsed", "skipCollapsed", "setup", "setupMerchantDetailView", "showMerchantDetailFromList", "shopModel", "showMerchantDetailFromNonMaps", "source", "", "showMerchantDetailPreview", "showPreviewData", "showShopDataWithPreviewFirst", "updateImage", "merchantImages", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "adjustCardRadius", "Landroidx/cardview/widget/CardView;", "slideOffset", "", "cardRadius", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDetailBottomsheetView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private HashMap equals;
    /* access modifiers changed from: private */
    public View getMax;
    private boolean getMin;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<MerchantDetailBottomsheetView> length;
    /* access modifiers changed from: private */
    public Function1<? super Boolean, Unit> setMax;
    @NotNull
    private CascadingMenuPopup$HorizPosition<ShopModel> setMin;

    @JvmOverloads
    public MerchantDetailBottomsheetView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantDetailBottomsheetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_detail_bottomsheet;
    }

    public static final /* synthetic */ BottomSheetBehavior access$getBottomsheetBehavior$p(MerchantDetailBottomsheetView merchantDetailBottomsheetView) {
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = merchantDetailBottomsheetView.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        return bottomSheetBehavior;
    }

    @NotNull
    public final CascadingMenuPopup$HorizPosition<ShopModel> getShopModelLiveData() {
        return this.setMin;
    }

    public final void setShopModelLiveData(@NotNull CascadingMenuPopup$HorizPosition<ShopModel> cascadingMenuPopup$HorizPosition) {
        Intrinsics.checkNotNullParameter(cascadingMenuPopup$HorizPosition, "<set-?>");
        this.setMin = cascadingMenuPopup$HorizPosition;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantDetailBottomsheetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantDetailBottomsheetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = new CascadingMenuPopup$HorizPosition<>();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantDetailBottomsheetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = new CascadingMenuPopup$HorizPosition<>();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/bottomsheet/MerchantDetailBottomsheetView$setupMerchantDetailView$1", "Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "onBackToTop", "", "onCloseBanner", "onHeaderInfoClicked", "onInfoUpdated", "onMerchantImagesUpdated", "onScroll", "merchantBannerOutOfScreen", "", "onSeeMoreClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements MerchantDetailView.setMin {
        final /* synthetic */ MerchantDetailBottomsheetView setMax;

        length(MerchantDetailBottomsheetView merchantDetailBottomsheetView) {
            this.setMax = merchantDetailBottomsheetView;
        }

        public final void length() {
            MerchantDetailBottomsheetView.access$getBottomsheetBehavior$p(this.setMax).setState(3);
        }

        public final void getMin() {
            MerchantDetailBottomsheetView.access$getBottomsheetBehavior$p(this.setMax).setState(3);
        }

        public final void setMin() {
            if (MerchantDetailBottomsheetView.access$getBottomsheetBehavior$p(this.setMax).getSkipCollapsed()) {
                MerchantDetailBottomsheetView.access$getBottomsheetBehavior$p(this.setMax).setState(5);
            } else {
                MerchantDetailBottomsheetView.access$getBottomsheetBehavior$p(this.setMax).setState(4);
            }
        }

        public final void getMin(boolean z) {
            if (MerchantDetailBottomsheetView.access$getBottomsheetBehavior$p(this.setMax).getState() == 3) {
                Function1 access$getCallback$p = this.setMax.setMax;
                if (access$getCallback$p != null) {
                    access$getCallback$p.invoke(Boolean.valueOf(z));
                    return;
                }
                return;
            }
            Function1 access$getCallback$p2 = this.setMax.setMax;
            if (access$getCallback$p2 != null) {
                access$getCallback$p2.invoke(Boolean.FALSE);
            }
        }

        public final void setMax() {
            this.setMax.setMax();
        }
    }

    public final void setOnScrollListener(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        this.setMax = function1;
    }

    public final void setBottomsheetBehavior(@NotNull BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "bottomsheetBehavior");
        this.length = bottomSheetBehavior;
        bottomSheetBehavior.setPeekHeight(getResources().getDimensionPixelSize(R.dimen.f31872131165920));
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setFitToContents(true);
        bottomSheetBehavior.addBottomSheetCallback(new getMax(this, bottomSheetBehavior));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/bottomsheet/MerchantDetailBottomsheetView$setBottomsheetBehavior$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ BottomSheetBehavior length;
        final /* synthetic */ MerchantDetailBottomsheetView setMax;

        getMax(MerchantDetailBottomsheetView merchantDetailBottomsheetView, BottomSheetBehavior bottomSheetBehavior) {
            this.setMax = merchantDetailBottomsheetView;
            this.length = bottomSheetBehavior;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            ImageView imageView = (ImageView) this.setMax._$_findCachedViewById(resetInternal.setMax.getSupportActionBar);
            if (imageView != null) {
                View view2 = imageView;
                boolean z = i == 4;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(z ? 0 : 8);
            }
            if (i == 3) {
                MerchantDetailView merchantDetailView = (MerchantDetailView) this.setMax._$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
                if (merchantDetailView != null) {
                    merchantDetailView.setOnFull();
                }
            } else if (i == 4) {
                MerchantDetailView merchantDetailView2 = (MerchantDetailView) this.setMax._$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
                if (merchantDetailView2 != null) {
                    merchantDetailView2.showComponentWhenFullState(false);
                }
                MerchantDetailView merchantDetailView3 = (MerchantDetailView) this.setMax._$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
                if (merchantDetailView3 != null) {
                    merchantDetailView3.setOnCollapsed();
                }
                this.setMax.setMax();
            } else if (i == 5) {
                this.length.setSkipCollapsed(false);
                this.length.setPeekHeight(this.setMax.getResources().getDimensionPixelSize(R.dimen.f31872131165920));
            }
        }

        public final void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            CardView cardView = (CardView) this.setMax._$_findCachedViewById(resetInternal.setMax.AttrRes);
            if (cardView != null) {
                MerchantDetailBottomsheetView.adjustCardRadius$default(this.setMax, cardView, f, 0, 2, (Object) null);
            }
            if (f > 0.0f) {
                View access$getDimBackgroundView$p = this.setMax.getMax;
                if (access$getDimBackgroundView$p != null) {
                    access$getDimBackgroundView$p.setAlpha(f);
                }
                View access$getDimBackgroundView$p2 = this.setMax.getMax;
                if (access$getDimBackgroundView$p2 != null) {
                    Intrinsics.checkNotNullParameter(access$getDimBackgroundView$p2, "<this>");
                    access$getDimBackgroundView$p2.setVisibility(0);
                }
            } else {
                View access$getDimBackgroundView$p3 = this.setMax.getMax;
                if (access$getDimBackgroundView$p3 != null) {
                    Intrinsics.checkNotNullParameter(access$getDimBackgroundView$p3, "<this>");
                    access$getDimBackgroundView$p3.setVisibility(8);
                }
            }
            MerchantDetailView merchantDetailView = (MerchantDetailView) this.setMax._$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            if (merchantDetailView != null) {
                merchantDetailView.setOnBottomsheetDragged(f);
            }
        }
    }

    public final void setDimBackground(@Nullable View view) {
        this.getMax = view;
    }

    /* access modifiers changed from: private */
    public final void setMax() {
        CardView cardView;
        View view;
        View view2;
        ViewTreeObserver viewTreeObserver;
        if (this.getMin) {
            this.getMin = false;
            return;
        }
        MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
        if (!(merchantDetailView == null || (viewTreeObserver = merchantDetailView.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new getMin(this));
        }
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        if (bottomSheetBehavior.getState() == 4 && (view = this.getMax) != null && view.getVisibility() == 0 && (view2 = this.getMax) != null) {
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(8);
        }
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior2 = this.length;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        if (bottomSheetBehavior2.getState() == 4 && (cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.AttrRes)) != null) {
            adjustCardRadius$default(this, cardView, 0.0f, 0, 2, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/bottomsheet/MerchantDetailBottomsheetView$adjustBottomSheetPeekHeight$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ MerchantDetailBottomsheetView getMax;

        getMin(MerchantDetailBottomsheetView merchantDetailBottomsheetView) {
            this.getMax = merchantDetailBottomsheetView;
        }

        public final void onGlobalLayout() {
            MerchantDetailView merchantDetailView = (MerchantDetailView) this.getMax._$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            Intrinsics.checkNotNullExpressionValue(merchantDetailView, "mdvMerchantDetail");
            merchantDetailView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MerchantDetailView merchantDetailView2 = (MerchantDetailView) this.getMax._$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            if (merchantDetailView2 != null) {
                MerchantDetailBottomsheetView.access$getBottomsheetBehavior$p(this.getMax).setPeekHeight(merchantDetailView2.getHeaderInfoViewBottom() + ((int) (Resources.getSystem().getDisplayMetrics().density * 12.0f)));
            }
        }
    }

    public final void showMerchantDetailFromList(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        reset();
        this.setMin.getMax(shopModel);
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setState(3);
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior2 = this.length;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior2.setSkipCollapsed(true);
        setMax(shopModel, TrackerKey.SourceType.NEARBY_SHOP_LIST);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ MerchantDetailBottomsheetView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(MerchantDetailBottomsheetView merchantDetailBottomsheetView) {
            super(0);
            this.this$0 = merchantDetailBottomsheetView;
        }

        public final void invoke() {
            this.this$0.setMax();
        }
    }

    private final void setMax(ShopModel shopModel, String str) {
        MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
        if (merchantDetailView != null) {
            merchantDetailView.showCompleteShopDataWithPreviewFirst(shopModel, str, new setMin(this));
        }
    }

    public final void resetMerchantDetailContent() {
        MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
        if (merchantDetailView != null) {
            merchantDetailView.onMerchantDetailReset();
        }
    }

    public final void addBottomsheetCallback(@NotNull BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        Intrinsics.checkNotNullParameter(bottomSheetCallback, "bottomSheetCallback");
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.addBottomSheetCallback(bottomSheetCallback);
    }

    public final void collapseBottomsheet() {
        MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
        if (merchantDetailView != null) {
            merchantDetailView.scrollToTop();
        }
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        if (bottomSheetBehavior.getSkipCollapsed()) {
            BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior2 = this.length;
            if (bottomSheetBehavior2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
            }
            bottomSheetBehavior2.setState(5);
            return;
        }
        this.getMin = true;
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior3 = this.length;
        if (bottomSheetBehavior3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior3.setState(4);
    }

    public final boolean isShowing() {
        return isMerchantDetailFullyDisplayed() || isMerchantDetailPreviewDisplayed();
    }

    public final boolean isMerchantDetailFullyDisplayed() {
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        if (bottomSheetBehavior.getState() == 6) {
            return true;
        }
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior2 = this.length;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        return bottomSheetBehavior2.getState() == 3;
    }

    public final boolean isMerchantDetailPreviewDisplayed() {
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        return bottomSheetBehavior.getState() == 4;
    }

    public final void showMerchantDetailPreview(@NotNull ShopModel shopModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(str, "source");
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setState(4);
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior2 = this.length;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior2.setSkipCollapsed(false);
        MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
        if (merchantDetailView != null) {
            merchantDetailView.showPreviewShopData(shopModel, str);
        }
        setMax();
    }

    public final void onMerchantDetailFullyShown() {
        MerchantDetailView merchantDetailView;
        Object obj = this.setMin.setMin;
        if (obj == LiveData.setMax) {
            obj = null;
        }
        ShopModel shopModel = (ShopModel) obj;
        if (shopModel != null && (merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved)) != null) {
            Intrinsics.checkNotNullExpressionValue(shopModel, "it");
            merchantDetailView.loadCompleteMerchantDetailInfo(shopModel);
        }
    }

    public final void hideMerchantDetailBottomsheet() {
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setState(5);
    }

    public final void reset() {
        Object obj = this.setMin.setMin;
        if (obj == LiveData.setMax) {
            obj = null;
        }
        if (obj != null) {
            this.setMin.getMax(null);
        }
    }

    public final void setSkipCollapsed(boolean z) {
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setSkipCollapsed(z);
    }

    public final void setNonDraggableExpandBottomsheet() {
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setDraggable(false);
        bottomSheetBehavior.setState(3);
    }

    public final void showMerchantDetailFromNonMaps(@NotNull ShopModel shopModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(str, "source");
        this.setMin.getMax(shopModel);
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setDraggable(true);
        setMax(shopModel, str);
    }

    public final void onMerchantDetailRefreshed() {
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setDraggable(true);
        bottomSheetBehavior.setState(3);
        bottomSheetBehavior.setSkipCollapsed(false);
    }

    public final void setInitialState(int i) {
        boolean z = true;
        if (i == 3) {
            CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.AttrRes);
            if (cardView != null) {
                adjustCardRadius$default(this, cardView, 1.0f, 0, 2, (Object) null);
            }
            MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            if (merchantDetailView != null) {
                merchantDetailView.showComponentWhenFullState(true);
            }
            MerchantDetailView merchantDetailView2 = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            if (merchantDetailView2 != null) {
                merchantDetailView2.setOnFull();
            }
        }
        BottomSheetBehavior<MerchantDetailBottomsheetView> bottomSheetBehavior = this.length;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomsheetBehavior");
        }
        bottomSheetBehavior.setState(i);
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.getSupportActionBar);
        if (imageView != null) {
            View view = imageView;
            int i2 = 0;
            if (i != 4) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public final void updateImage(@NotNull List<MerchantImageModel> list, @NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(list, "merchantImages");
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Object obj = this.setMin.setMin;
        if (obj == LiveData.setMax) {
            obj = null;
        }
        ShopModel shopModel2 = (ShopModel) obj;
        if (shopModel2 != null && Intrinsics.areEqual((Object) shopModel2, (Object) shopModel)) {
            Intrinsics.checkNotNullExpressionValue(shopModel2, "this");
            shopModel2.ICustomTabsService = true;
            shopModel2.getDefaultImpl = list;
            MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
            if (merchantDetailView != null) {
                merchantDetailView.updateImages(shopModel2);
            }
            setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/bottomsheet/MerchantDetailBottomsheetView$Companion;", "", "()V", "MERCHANT_DETAIL_CARD_RADIUS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setup() {
        MerchantDetailView merchantDetailView = (MerchantDetailView) _$_findCachedViewById(resetInternal.setMax.isOverflowReserved);
        if (merchantDetailView != null) {
            merchantDetailView.setMerchantDetailViewListener(new length(this));
        }
    }

    static /* synthetic */ void adjustCardRadius$default(MerchantDetailBottomsheetView merchantDetailBottomsheetView, CardView cardView, float f, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 16;
        }
        float f2 = 0.0f;
        if (f < 1.0f && f >= 0.0f) {
            f2 = ((float) ((int) (((float) i) * Resources.getSystem().getDisplayMetrics().density))) * (1.0f - f);
        }
        cardView.setRadius(f2);
        cardView.requestLayout();
    }
}
