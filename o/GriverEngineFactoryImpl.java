package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0002J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\rH\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020\rH\u0002J\u0016\u0010+\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0-H\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lid/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/MerchantItemWrapper;", "parent", "Landroid/view/ViewGroup;", "onMerchantListClick", "Lkotlin/Function1;", "", "", "onPromoClick", "onHomeShoppingClick", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ribbonAnimationPlayed", "", "addOpenHour", "bindData", "item", "isRibbonContentViewAvailable", "loadImage", "imageView", "Landroid/widget/ImageView;", "url", "", "removeDotFromMerchantDistance", "removeOpenHour", "setMerchantBasicInfo", "data", "Lid/dana/nearbyme/model/ShopModel;", "setOpenHourTextColor", "openHour", "setPromoRibbonTextBasedValue", "showMerchantBadgeType", "showMerchantRating", "showOpenHour", "showOpenHours", "showPromoRibbon", "toggleRibbonTextContentVisibility", "showWithAnimation", "toggleRibbonTextVisibility", "isAnimate", "toggleRibbonVisibility", "shouldAnimate", "toggleRibbonVisibilityWithAnimation", "visibleIf", "predicate", "Lkotlin/Function0;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverEngineFactoryImpl extends Ignore<H5Worker> {
    @NotNull
    public static final getMin setMax = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public boolean setMin;

    public final /* synthetic */ void setMax(Object obj) {
        CharSequence charSequence;
        String str;
        String string;
        String str2;
        H5Worker h5Worker = (H5Worker) obj;
        Intrinsics.checkNotNullParameter(h5Worker, "item");
        ShopModel shopModel = h5Worker.setMin;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.getContentInsetEnd);
        if (textView != null) {
            textView.setText(shopModel.invoke);
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.ensureMenuView);
        String str3 = "";
        if (textView2 != null) {
            if (shopModel.extraCallbackWithResult == null || shopModel.extraCallbackWithResult.isEmpty()) {
                str2 = str3;
            } else {
                str2 = shopModel.getMin(false, " | ");
            }
            textView2.setText(str2);
        }
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        TextView textView3 = (TextView) view3.findViewById(resetInternal.setMax.ensureMenu);
        if (textView3 != null) {
            ContactAddressModel max = shopModel.setMax();
            Intrinsics.checkNotNullExpressionValue(max, "data.officeAddress");
            textView3.setText(max.setMin);
        }
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
        TextView textView4 = (TextView) view4.findViewById(resetInternal.setMax.setContentInsetsAbsolute);
        if (textView4 != null) {
            textView4.setText(setH5MenuList.getMax(this.length, shopModel.toFloatRange));
        }
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "itemView");
        String str4 = shopModel.hashCode;
        Intrinsics.checkNotNullExpressionValue(str4, "data.logoUrl");
        setMin((AppCompatImageView) view5.findViewById(resetInternal.setMax.invalidateDrawable), str4);
        View view6 = this.itemView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view6.findViewById(resetInternal.setMax.onServiceConnected);
        if (appCompatTextView != null) {
            Context context = view6.getContext();
            if (context == null || (string = context.getString(R.string.merchant_item_top_up)) == null) {
                str = null;
            } else {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
                if (string != null) {
                    str = string.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toUpperCase(locale)");
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            if (str == null) {
                str = str3;
            }
            appCompatTextView.setText(str);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view6.findViewById(resetInternal.setMax.onServiceConnected);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setVisibility(length((Function0<Boolean>) new setMin(this, shopModel)));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view6.findViewById(resetInternal.setMax.onClick);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(length((Function0<Boolean>) new IsOverlapping(this, shopModel)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view6.findViewById(resetInternal.setMax.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(length((Function0<Boolean>) new toFloatRange(this, shopModel)));
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) view6.findViewById(resetInternal.setMax.setTitleMarginTop);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setVisibility(length((Function0<Boolean>) new toIntRange(this, shopModel)));
        }
        int i = 8;
        if (shopModel.create == 0.0d) {
            View view7 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
            TextView textView5 = (TextView) view7.findViewById(resetInternal.setMax.getWrapper);
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        } else {
            View view8 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "itemView");
            TextView textView6 = (TextView) view8.findViewById(resetInternal.setMax.getWrapper);
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            View view9 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view9, "itemView");
            TextView textView7 = (TextView) view9.findViewById(resetInternal.setMax.getWrapper);
            if (textView7 != null) {
                textView7.setText(String.valueOf(shopModel.create));
            }
        }
        View view10 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view10, "itemView");
        String str5 = shopModel.hashCode;
        Intrinsics.checkNotNullExpressionValue(str5, "data.logoUrl");
        setMin((AppCompatImageView) view10.findViewById(resetInternal.setMax.invalidateDrawable), str5);
        if (shopModel.onMessageChannelReady.isEmpty() && !shopModel.getMax()) {
            setMin();
        } else if (shopModel.getMax()) {
            String string2 = this.length.getString(R.string.open);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.open)");
            setMin(string2);
        } else {
            String min = shopModel.getMin(this.length);
            if (TextUtils.isEmpty(min)) {
                setMin();
            } else {
                Intrinsics.checkNotNullExpressionValue(min, "openHourText");
                setMin(min);
            }
        }
        boolean equals2 = shopModel.equals();
        View view11 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view11, "itemView");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view11.findViewById(resetInternal.setMax.onSaveInstanceState);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(equals2 ? 0 : 8);
        }
        View view12 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view12, "itemView");
        View findViewById = view12.findViewById(resetInternal.setMax.InspectableProperty);
        if (findViewById != null) {
            if (equals2) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
        if (equals2) {
            if (shopModel.equals()) {
                str3 = shopModel.Mean$Arithmetic.get(0).length;
            }
            String IsOverlapping2 = shopModel.IsOverlapping();
            View view13 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view13, "itemView");
            TextView textView8 = (TextView) view13.findViewById(resetInternal.setMax.setCollapseContentDescription);
            if (textView8 != null) {
                Context context2 = this.length;
                Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                Intrinsics.checkNotNullExpressionValue(str3, "prizeType");
                textView8.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(context2, str3, str3));
            }
            View view14 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view14, "itemView");
            TextView textView9 = (TextView) view14.findViewById(resetInternal.setMax.setCollapseIcon);
            if (textView9 != null) {
                if (shopModel.isInside()) {
                    charSequence = this.length.getString(R.string.max_value_with_val, new Object[]{IsOverlapping2});
                } else {
                    charSequence = IsOverlapping2;
                }
                textView9.setText(charSequence);
            }
            if (!this.setMin) {
                View view15 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view15, "itemView");
                LottieAnimationView lottieAnimationView = (LottieAnimationView) view15.findViewById(resetInternal.setMax.setOverrideVisibleItems);
                if (lottieAnimationView != null) {
                    lottieAnimationView.postDelayed(new isInside(this), 500);
                    return;
                }
                return;
            }
            length(false);
            getMax(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GriverEngineFactoryImpl(@NotNull ViewGroup viewGroup, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Integer, Unit> function12, @NotNull Function1<? super Integer, Unit> function13) {
        super(viewGroup.getContext(), R.layout.item_merchant_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "onMerchantListClick");
        Intrinsics.checkNotNullParameter(function12, "onPromoClick");
        Intrinsics.checkNotNullParameter(function13, "onHomeShoppingClick");
        View view = this.itemView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.send);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new length(this, function1, function12, function13));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(resetInternal.setMax.onSaveInstanceState);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new getMax(this, function1, function12, function13));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.setTitleMarginTop);
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new setMax(this, function1, function12, function13));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ Function1 getMin;
        final /* synthetic */ Function1 length;
        final /* synthetic */ Function1 setMax;
        final /* synthetic */ GriverEngineFactoryImpl setMin;

        length(GriverEngineFactoryImpl griverEngineFactoryImpl, Function1 function1, Function1 function12, Function1 function13) {
            this.setMin = griverEngineFactoryImpl;
            this.getMin = function1;
            this.length = function12;
            this.setMax = function13;
        }

        public final void onClick(View view) {
            this.getMin.invoke(Integer.valueOf(this.setMin.getAbsoluteAdapterPosition()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$1$2"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ Function1 getMin;
        final /* synthetic */ Function1 length;
        final /* synthetic */ Function1 setMax;
        final /* synthetic */ GriverEngineFactoryImpl setMin;

        getMax(GriverEngineFactoryImpl griverEngineFactoryImpl, Function1 function1, Function1 function12, Function1 function13) {
            this.setMin = griverEngineFactoryImpl;
            this.length = function1;
            this.getMin = function12;
            this.setMax = function13;
        }

        public final void onClick(View view) {
            this.getMin.invoke(Integer.valueOf(this.setMin.getAbsoluteAdapterPosition()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$1$3"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ Function1 getMax;
        final /* synthetic */ Function1 getMin;
        final /* synthetic */ GriverEngineFactoryImpl length;
        final /* synthetic */ Function1 setMin;

        setMax(GriverEngineFactoryImpl griverEngineFactoryImpl, Function1 function1, Function1 function12, Function1 function13) {
            this.length = griverEngineFactoryImpl;
            this.getMin = function1;
            this.setMin = function12;
            this.getMax = function13;
        }

        public final void onClick(View view) {
            this.getMax.invoke(Integer.valueOf(this.length.getAbsoluteAdapterPosition()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$showMerchantBadgeType$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ShopModel $data$inlined;
        final /* synthetic */ GriverEngineFactoryImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(GriverEngineFactoryImpl griverEngineFactoryImpl, ShopModel shopModel) {
            super(0);
            this.this$0 = griverEngineFactoryImpl;
            this.$data$inlined = shopModel;
        }

        public final boolean invoke() {
            return this.$data$inlined.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$showMerchantBadgeType$1$2"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ShopModel $data$inlined;
        final /* synthetic */ GriverEngineFactoryImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(GriverEngineFactoryImpl griverEngineFactoryImpl, ShopModel shopModel) {
            super(0);
            this.this$0 = griverEngineFactoryImpl;
            this.$data$inlined = shopModel;
        }

        public final boolean invoke() {
            return this.$data$inlined.toDoubleRange();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$showMerchantBadgeType$1$3"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ShopModel $data$inlined;
        final /* synthetic */ GriverEngineFactoryImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(GriverEngineFactoryImpl griverEngineFactoryImpl, ShopModel shopModel) {
            super(0);
            this.this$0 = griverEngineFactoryImpl;
            this.$data$inlined = shopModel;
        }

        public final boolean invoke() {
            return this.$data$inlined.FastBitmap$CoordinateSystem();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$showMerchantBadgeType$1$4"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ShopModel $data$inlined;
        final /* synthetic */ GriverEngineFactoryImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(GriverEngineFactoryImpl griverEngineFactoryImpl, ShopModel shopModel) {
            super(0);
            this.this$0 = griverEngineFactoryImpl;
            this.$data$inlined = shopModel;
        }

        public final boolean invoke() {
            return this.$data$inlined.toIntRange();
        }
    }

    private final int length(Function0<Boolean> function0) {
        return (function0.invoke().booleanValue() ? this : null) != null ? 0 : 8;
    }

    private final void setMin() {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.ensureCollapseButtonView);
        if (textView != null && textView.getVisibility() == 0) {
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.ensureCollapseButtonView);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        setMax();
    }

    private final void setMin(String str) {
        length();
        getMax(str);
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.ensureCollapseButtonView);
        if (textView != null) {
            textView.setText(str);
        }
    }

    private final void setMax() {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.setContentInsetsAbsolute);
        String replace$default = StringsKt.replace$default(String.valueOf(textView != null ? textView.getText() : null), "• ", "", false, 4, (Object) null);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.setContentInsetsAbsolute);
        if (textView2 != null) {
            textView2.setText(replace$default);
        }
    }

    private final void length() {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.ensureCollapseButtonView);
        if (textView != null && textView.getVisibility() == 8) {
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.ensureCollapseButtonView);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements Runnable {
        final /* synthetic */ GriverEngineFactoryImpl setMin;

        isInside(GriverEngineFactoryImpl griverEngineFactoryImpl) {
            this.setMin = griverEngineFactoryImpl;
        }

        public final void run() {
            this.setMin.length(true);
            this.setMin.getMax(true);
        }
    }

    /* access modifiers changed from: private */
    public final void length(boolean z) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        if (((LottieAnimationView) view.findViewById(resetInternal.setMax.setOverrideVisibleItems)) != null) {
            if (z) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(resetInternal.setMax.setOverrideVisibleItems);
                if (lottieAnimationView != null) {
                    lottieAnimationView.playAnimation();
                    return;
                }
                return;
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view3.findViewById(resetInternal.setMax.setOverrideVisibleItems);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setFrame(60);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        if (((TextView) view.findViewById(resetInternal.setMax.setCollapseContentDescription)) != null) {
            if (z) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextView textView = (TextView) view2.findViewById(resetInternal.setMax.setCollapseContentDescription);
                if (textView != null) {
                    textView.postDelayed(new equals(this), 150);
                    return;
                }
                return;
            }
            setMin(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class equals implements Runnable {
        final /* synthetic */ GriverEngineFactoryImpl setMax;

        equals(GriverEngineFactoryImpl griverEngineFactoryImpl) {
            this.setMax = griverEngineFactoryImpl;
        }

        public final void run() {
            if (this.setMax.getMax()) {
                this.setMax.setMin(true);
            }
            this.setMax.setMin = true;
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMax() {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        if (((TextView) view.findViewById(resetInternal.setMax.setCollapseContentDescription)) == null) {
            return false;
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        if (((TextView) view2.findViewById(resetInternal.setMax.setCollapseIcon)) == null) {
            return false;
        }
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        return ((AppCompatImageView) view3.findViewById(resetInternal.setMax.getIntrinsicWidth)) != null;
    }

    /* access modifiers changed from: private */
    public final void setMin(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator alpha3;
        if (z) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.setCollapseContentDescription);
            if (!(textView == null || (animate3 = textView.animate()) == null || (alpha3 = animate3.alpha(1.0f)) == null)) {
                alpha3.start();
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.setCollapseIcon);
            if (!(textView2 == null || (animate2 = textView2.animate()) == null || (alpha2 = animate2.alpha(1.0f)) == null)) {
                alpha2.start();
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view3.findViewById(resetInternal.setMax.getIntrinsicWidth);
            if (appCompatImageView != null && (animate = appCompatImageView.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
                alpha.start();
                return;
            }
            return;
        }
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
        TextView textView3 = (TextView) view4.findViewById(resetInternal.setMax.setCollapseContentDescription);
        if (textView3 != null) {
            textView3.setAlpha(1.0f);
        }
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "itemView");
        TextView textView4 = (TextView) view5.findViewById(resetInternal.setMax.setCollapseIcon);
        if (textView4 != null) {
            textView4.setAlpha(1.0f);
        }
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "itemView");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view6.findViewById(resetInternal.setMax.getIntrinsicWidth);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setAlpha(1.0f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/adapter/viewholder/OtherStoreItemViewHolder$Companion;", "", "()V", "MAX_LOTTIE_ANIMATION_FRAME", "", "RADIUS_CORNER_DP_SIZE", "RIBBON_ANIMATION_DELAY", "", "RIBBON_TEXT_ANIMATION_DELAY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    private final void setMin(ImageView imageView, String str) {
        if (imageView != null) {
            ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax(evaluate.setMin).setMax((int) R.drawable.ic_merchant_logo_null).setMin((int) R.drawable.ic_merchant_logo_null).setMin((updatePostLayout<Bitmap>) new updatePostConstraints((int) (Resources.getSystem().getDisplayMetrics().density * 3.0f))).length(imageView);
        }
    }

    private final void getMax(String str) {
        Context context = this.length;
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        if (!Intrinsics.areEqual((Object) str, (Object) context.getResources().getString(R.string.closing_soon))) {
            Context context2 = this.length;
            Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
            if (!Intrinsics.areEqual((Object) str, (Object) context2.getResources().getString(R.string.closed))) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(resetInternal.setMax.ensureCollapseButtonView);
                if (textView != null) {
                    Intrinsics.checkNotNullExpressionValue(this.length, HummerConstants.CONTEXT);
                    textView.setTextColor(-13553359);
                    return;
                }
                return;
            }
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        Intrinsics.checkNotNullExpressionValue(this.length, HummerConstants.CONTEXT);
        ((TextView) view2.findViewById(resetInternal.setMax.ensureCollapseButtonView)).setTextColor(-773316);
    }
}
