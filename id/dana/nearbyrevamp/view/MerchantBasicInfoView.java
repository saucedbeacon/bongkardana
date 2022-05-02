package id.dana.nearbyrevamp.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.model.ShopModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AddPhoneContactView;
import o.IntRange;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u000289B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0003J\u0018\u0010\u0018\u001a\n \u0019*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\fH\u0002J\b\u0010,\u001a\u00020\u0013H\u0002J\b\u0010-\u001a\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\u0013H\u0016J\b\u0010/\u001a\u00020\fH\u0002J\u0010\u00100\u001a\u00020\u00132\b\b\u0002\u0010(\u001a\u00020)J\u0010\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\fH\u0002J\"\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020)J\u0014\u00105\u001a\u00020\u0013*\u0002062\u0006\u00107\u001a\u00020\u0007H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantBasicInfoView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isPreview", "", "()Z", "setPreview", "(Z)V", "shop", "Lid/dana/nearbyme/model/ShopModel;", "displayOpenHour", "", "displayedText", "", "displayedDesc", "textColor", "getFormattedHour", "kotlin.jvm.PlatformType", "timeMillisFrom1970", "", "getLayout", "getOpenHourDescription", "stringRes", "hour", "setOpenHourListener", "setPopularAndPromoTag", "setRatingReviewCountText", "setShopDistance", "setShopLogo", "showLogo", "setShopName", "setShopOpenHour", "type", "Lid/dana/nearbyrevamp/view/MerchantBasicInfoView$InfoType;", "setShopRanking", "shouldDisplayRankingInfo", "setShopRatingReview", "setShopSubCategories", "setup", "shouldShowAdditionalInfo", "showAdditionalInfo", "showDivider", "show", "showMerchantInfo", "shopModel", "setRightDrawable", "Landroid/widget/TextView;", "rightDrawable", "Companion", "InfoType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantBasicInfoView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public ShopModel getMax;
    private boolean length;
    private HashMap setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantBasicInfoView$InfoType;", "", "(Ljava/lang/String;I)V", "BASIC", "DETAIL", "DETAIL_WITH_OPENHOUR_REDIRECTION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum InfoType {
        BASIC,
        DETAIL,
        DETAIL_WITH_OPENHOUR_REDIRECTION
    }

    @JvmOverloads
    public MerchantBasicInfoView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_nearby_merchant_basic_info;
    }

    public final void setup() {
    }

    public static final /* synthetic */ ShopModel access$getShop$p(MerchantBasicInfoView merchantBasicInfoView) {
        ShopModel shopModel = merchantBasicInfoView.getMax;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shop");
        }
        return shopModel;
    }

    public final boolean isPreview() {
        return this.length;
    }

    public final void setPreview(boolean z) {
        this.length = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantBasicInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public static /* synthetic */ void showMerchantInfo$default(MerchantBasicInfoView merchantBasicInfoView, ShopModel shopModel, boolean z, InfoType infoType, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            infoType = InfoType.BASIC;
        }
        merchantBasicInfoView.showMerchantInfo(shopModel, z, infoType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0312, code lost:
        if (r1.getMax() != false) goto L_0x0314;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showMerchantInfo(@org.jetbrains.annotations.NotNull id.dana.nearbyme.model.ShopModel r21, boolean r22, @org.jetbrains.annotations.NotNull id.dana.nearbyrevamp.view.MerchantBasicInfoView.InfoType r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            java.lang.String r3 = "shopModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r0.getMax = r1
            int r1 = o.resetInternal.setMax.onVoiceClicked
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = "shop"
            if (r1 == 0) goto L_0x002c
            id.dana.nearbyme.model.ShopModel r4 = r0.getMax
            if (r4 != 0) goto L_0x0025
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0025:
            java.lang.String r4 = r4.invoke
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
        L_0x002c:
            id.dana.nearbyrevamp.view.MerchantBasicInfoView$InfoType r1 = id.dana.nearbyrevamp.view.MerchantBasicInfoView.InfoType.BASIC
            r4 = 1
            r5 = 0
            if (r2 != r1) goto L_0x0034
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r6 = 8
            java.lang.String r7 = "<this>"
            if (r1 != 0) goto L_0x004e
            int r1 = o.resetInternal.setMax.clShopLogo
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            if (r1 == 0) goto L_0x00c3
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            r1.setVisibility(r6)
            goto L_0x00c3
        L_0x004e:
            int r1 = o.resetInternal.setMax.clShopLogo
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            if (r1 == 0) goto L_0x0060
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            r1.setVisibility(r5)
        L_0x0060:
            android.content.Context r1 = r20.getContext()
            r8 = 2131232092(0x7f08055c, float:1.8080283E38)
            android.graphics.drawable.Drawable r1 = o.cancelAll.getMin(r1, r8)
            int r8 = o.resetInternal.setMax.onPrepareSupportNavigateUpTaskStack
            android.view.View r8 = r0._$_findCachedViewById(r8)
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            if (r8 == 0) goto L_0x00c3
            android.content.Context r9 = r8.getContext()
            o.setHorizontalGap r9 = com.bumptech.glide.Glide.getMax((android.content.Context) r9)
            id.dana.nearbyme.model.ShopModel r10 = r0.getMax
            if (r10 != 0) goto L_0x0084
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0084:
            java.lang.String r10 = r10.hashCode
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = ""
        L_0x008a:
            o.setFirstVerticalBias r9 = r9.getMax((java.lang.String) r10)
            o.evaluate r10 = o.evaluate.setMin
            o.getTopSortedChildren r9 = r9.getMin((o.evaluate) r10)
            o.setFirstVerticalBias r9 = (o.setFirstVerticalBias) r9
            o.getTopSortedChildren r9 = r9.length((android.graphics.drawable.Drawable) r1)
            o.setFirstVerticalBias r9 = (o.setFirstVerticalBias) r9
            o.getTopSortedChildren r1 = r9.setMax((android.graphics.drawable.Drawable) r1)
            o.setFirstVerticalBias r1 = (o.setFirstVerticalBias) r1
            o.updatePostConstraints r9 = new o.updatePostConstraints
            r10 = 1082130432(0x40800000, float:4.0)
            android.content.res.Resources r11 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r10 = (int) r11
            r9.<init>(r10)
            o.updatePostLayout r9 = (o.updatePostLayout) r9
            o.getTopSortedChildren r1 = r1.setMax((o.updatePostLayout<android.graphics.Bitmap>) r9)
            o.setFirstVerticalBias r1 = (o.setFirstVerticalBias) r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1.length((android.widget.ImageView) r8)
        L_0x00c3:
            id.dana.nearbyme.model.ShopModel r1 = r0.getMax
            if (r1 != 0) goto L_0x00ca
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00ca:
            java.lang.String r8 = ", "
            java.lang.String r1 = r1.getMin((java.lang.String) r8)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x00dd
            int r9 = r1.length()
            if (r9 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r9 = 0
            goto L_0x00de
        L_0x00dd:
            r9 = 1
        L_0x00de:
            if (r9 != 0) goto L_0x0100
            int r9 = o.resetInternal.setMax.tvCategory
            android.view.View r9 = r0._$_findCachedViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x00ed
            r9.setText(r1)
        L_0x00ed:
            int r1 = o.resetInternal.setMax.tvCategory
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0112
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            r1.setVisibility(r5)
            goto L_0x0112
        L_0x0100:
            int r1 = o.resetInternal.setMax.tvCategory
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0112
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            r1.setVisibility(r6)
        L_0x0112:
            id.dana.nearbyme.model.ShopModel r1 = r0.getMax
            if (r1 != 0) goto L_0x0119
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0119:
            double r9 = r1.create
            r11 = 0
            r1 = 32
            java.lang.String r13 = "-"
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x0147
            int r9 = o.resetInternal.setMax.getDelegate
            android.view.View r9 = r0._$_findCachedViewById(r9)
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            if (r9 == 0) goto L_0x0135
            r10 = 2131232327(0x7f080647, float:1.808076E38)
            r9.setImageResource(r10)
        L_0x0135:
            int r9 = o.resetInternal.setMax.getQueryHint
            android.view.View r9 = r0._$_findCachedViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x01e9
            r10 = r13
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r9.setText(r10)
            goto L_0x01e9
        L_0x0147:
            int r9 = o.resetInternal.setMax.getDelegate
            android.view.View r9 = r0._$_findCachedViewById(r9)
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            if (r9 == 0) goto L_0x0157
            r10 = 2131232332(0x7f08064c, float:1.808077E38)
            r9.setImageResource(r10)
        L_0x0157:
            kotlin.jvm.internal.StringCompanionObject r9 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            android.content.Context r9 = r20.getContext()
            r10 = 2131888593(0x7f1209d1, float:1.9411826E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "context.getString(R.string.review_count)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            id.dana.nearbyme.model.ShopModel r11 = r0.getMax
            if (r11 != 0) goto L_0x0172
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0172:
            double r11 = r11.onNavigationEvent
            int r11 = (int) r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r5] = r11
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r4)
            java.lang.String r9 = java.lang.String.format(r9, r10)
            java.lang.String r10 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            id.dana.nearbyme.model.ShopModel r10 = r0.getMax
            if (r10 != 0) goto L_0x018f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x018f:
            java.lang.String r10 = o.f.AnonymousClass5.getMax(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r1)
            r11.append(r9)
            java.lang.String r10 = r11.toString()
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r11.<init>(r10)
            android.text.style.ForegroundColorSpan r12 = new android.text.style.ForegroundColorSpan
            android.content.Context r14 = r20.getContext()
            r15 = 2131099951(0x7f06012f, float:1.781227E38)
            int r14 = o.IntRange.setMax(r14, r15)
            r12.<init>(r14)
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r14 = r10
            r15 = r9
            int r15 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r14, (java.lang.String) r15, (int) r16, (boolean) r17, (int) r18, (java.lang.Object) r19)
            r10 = r15
            r15 = r9
            int r14 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r14, (java.lang.String) r15, (int) r16, (boolean) r17, (int) r18, (java.lang.Object) r19)
            int r9 = r9.length()
            int r14 = r14 + r9
            r9 = 33
            r11.setSpan(r12, r10, r14, r9)
            int r9 = o.resetInternal.setMax.getQueryHint
            android.view.View r9 = r0._$_findCachedViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x01e9
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r9.setText(r11)
        L_0x01e9:
            int r9 = o.resetInternal.setMax.measureChildBeforeLayout
            android.view.View r9 = r0._$_findCachedViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0252
            id.dana.nearbyme.model.ShopModel r10 = r0.getMax
            if (r10 != 0) goto L_0x01fa
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x01fa:
            boolean r10 = r10.b()
            if (r10 != 0) goto L_0x0211
            android.content.Context r10 = r9.getContext()
            id.dana.nearbyme.model.ShopModel r11 = r0.getMax
            if (r11 != 0) goto L_0x020b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x020b:
            double r11 = r11.toFloatRange
            java.lang.String r13 = o.setH5MenuList.length((android.content.Context) r10, (double) r11)
        L_0x0211:
            id.dana.nearbyme.model.ShopModel r10 = r0.getMax
            if (r10 != 0) goto L_0x0218
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0218:
            java.lang.String r8 = r10.getMin((java.lang.String) r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x0229
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0227
            goto L_0x0229
        L_0x0227:
            r8 = 0
            goto L_0x022a
        L_0x0229:
            r8 = 1
        L_0x022a:
            if (r8 == 0) goto L_0x022f
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            goto L_0x024f
        L_0x022f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r10 = r9.getContext()
            r11 = 2131886851(0x7f120303, float:1.9408293E38)
            java.lang.String r10 = r10.getString(r11)
            r8.append(r10)
            r8.append(r1)
            r8.append(r13)
            java.lang.String r1 = r8.toString()
            r13 = r1
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
        L_0x024f:
            r9.setText(r13)
        L_0x0252:
            int r1 = o.resetInternal.setMax.setSearchView
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L_0x0275
            android.view.View r1 = (android.view.View) r1
            id.dana.nearbyme.model.ShopModel r8 = r0.getMax
            if (r8 != 0) goto L_0x0265
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0265:
            boolean r8 = r8.Mean$Arithmetic()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            if (r8 == 0) goto L_0x0270
            r8 = 0
            goto L_0x0272
        L_0x0270:
            r8 = 8
        L_0x0272:
            r1.setVisibility(r8)
        L_0x0275:
            int r1 = o.resetInternal.setMax.setQuery
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L_0x0298
            android.view.View r1 = (android.view.View) r1
            id.dana.nearbyme.model.ShopModel r8 = r0.getMax
            if (r8 != 0) goto L_0x0288
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0288:
            boolean r8 = r8.equals()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            if (r8 == 0) goto L_0x0293
            r8 = 0
            goto L_0x0295
        L_0x0293:
            r8 = 8
        L_0x0295:
            r1.setVisibility(r8)
        L_0x0298:
            id.dana.nearbyme.model.ShopModel r1 = r0.getMax
            if (r1 != 0) goto L_0x029f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x029f:
            int r1 = r1.getInterfaceDescriptor
            if (r1 == 0) goto L_0x02d4
            if (r22 == 0) goto L_0x02d4
            int r1 = o.resetInternal.setMax.setIconifiedByDefault
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x02c1
            id.dana.nearbyme.model.ShopModel r8 = r0.getMax
            if (r8 != 0) goto L_0x02b6
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x02b6:
            int r8 = r8.getInterfaceDescriptor
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r1.setText(r8)
        L_0x02c1:
            int r1 = o.resetInternal.setMax.setIconifiedByDefault
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x02e6
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            r1.setVisibility(r5)
            goto L_0x02e6
        L_0x02d4:
            int r1 = o.resetInternal.setMax.setIconifiedByDefault
            android.view.View r1 = r0._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x02e6
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            r1.setVisibility(r6)
        L_0x02e6:
            id.dana.nearbyme.model.ShopModel r1 = r0.getMax
            if (r1 != 0) goto L_0x02ed
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x02ed:
            android.content.Context r8 = r20.getContext()
            java.lang.String r1 = r1.getMin((android.content.Context) r8)
            java.lang.String r8 = "shop.getTodayOpenHour(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0304
            r1 = 1
            goto L_0x0305
        L_0x0304:
            r1 = 0
        L_0x0305:
            if (r1 != 0) goto L_0x0314
            id.dana.nearbyme.model.ShopModel r1 = r0.getMax
            if (r1 != 0) goto L_0x030e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x030e:
            boolean r1 = r1.getMax()
            if (r1 == 0) goto L_0x0328
        L_0x0314:
            int r1 = o.resetInternal.setMax.playFromMediaId
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            if (r1 == 0) goto L_0x0328
            id.dana.nearbyrevamp.view.MerchantBasicInfoView$getMax r3 = new id.dana.nearbyrevamp.view.MerchantBasicInfoView$getMax
            r3.<init>(r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
        L_0x0328:
            id.dana.nearbyrevamp.view.MerchantBasicInfoView$InfoType r1 = id.dana.nearbyrevamp.view.MerchantBasicInfoView.InfoType.BASIC
            if (r2 != r1) goto L_0x032d
            goto L_0x032e
        L_0x032d:
            r4 = 0
        L_0x032e:
            int r1 = o.resetInternal.setMax.setCardBackgroundColor
            android.view.View r1 = r0._$_findCachedViewById(r1)
            if (r1 == 0) goto L_0x0341
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            if (r4 == 0) goto L_0x033c
            goto L_0x033e
        L_0x033c:
            r5 = 8
        L_0x033e:
            r1.setVisibility(r5)
        L_0x0341:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.view.MerchantBasicInfoView.showMerchantInfo(id.dana.nearbyme.model.ShopModel, boolean, id.dana.nearbyrevamp.view.MerchantBasicInfoView$InfoType):void");
    }

    public static /* synthetic */ void showAdditionalInfo$default(MerchantBasicInfoView merchantBasicInfoView, InfoType infoType, int i, Object obj) {
        if ((i & 1) != 0) {
            infoType = InfoType.DETAIL;
        }
        merchantBasicInfoView.showAdditionalInfo(infoType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028a, code lost:
        if (r1.equals() != false) goto L_0x028c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0268  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showAdditionalInfo(@org.jetbrains.annotations.NotNull id.dana.nearbyrevamp.view.MerchantBasicInfoView.InfoType r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r18.setMax()
            java.lang.String r4 = "<this>"
            java.lang.String r5 = "shop"
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x024d
            int r2 = o.resetInternal.setMax.getQueueTitle
            android.view.View r2 = r0._$_findCachedViewById(r2)
            if (r2 == 0) goto L_0x0023
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r2.setVisibility(r7)
        L_0x0023:
            int r2 = o.resetInternal.setMax.setInputType
            android.view.View r2 = r0._$_findCachedViewById(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L_0x003b
            android.widget.TextView r2 = (android.widget.TextView) r2
            id.dana.nearbyrevamp.view.MerchantBasicInfoView$InfoType r8 = id.dana.nearbyrevamp.view.MerchantBasicInfoView.InfoType.DETAIL_WITH_OPENHOUR_REDIRECTION
            if (r1 != r8) goto L_0x0037
            r8 = 2131231726(0x7f0803ee, float:1.8079541E38)
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            r2.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r8, r7)
        L_0x003b:
            id.dana.nearbyrevamp.view.MerchantBasicInfoView$InfoType r2 = id.dana.nearbyrevamp.view.MerchantBasicInfoView.InfoType.DETAIL_WITH_OPENHOUR_REDIRECTION
            if (r1 == r2) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r0.length = r2
            id.dana.nearbyme.model.ShopModel r2 = r0.getMax
            if (r2 != 0) goto L_0x004b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x004b:
            boolean r2 = r2.getMax()
            r8 = 2131099938(0x7f060122, float:1.7812243E38)
            java.lang.String r9 = ""
            if (r2 == 0) goto L_0x006b
            android.content.Context r2 = r18.getContext()
            r10 = 2131888223(0x7f12085f, float:1.9411075E38)
            java.lang.String r2 = r2.getString(r10)
            java.lang.String r10 = "context.getString(R.string.open_all_day)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r10)
            r0.setMin(r2, r9, r8)
            goto L_0x025e
        L_0x006b:
            id.dana.nearbyme.model.ShopModel r2 = r0.getMax
            if (r2 != 0) goto L_0x0072
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0072:
            java.util.List<id.dana.nearbyme.model.ShopOpenHourModel> r2 = r2.onMessageChannelReady
            id.dana.nearbyme.model.ShopModel r10 = r0.getMax
            if (r10 != 0) goto L_0x007b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x007b:
            int r10 = id.dana.nearbyme.model.ShopModel.values()
            java.lang.Object r2 = r2.get(r10)
            id.dana.nearbyme.model.ShopOpenHourModel r2 = (id.dana.nearbyme.model.ShopOpenHourModel) r2
            id.dana.nearbyme.model.ShopModel r10 = r0.getMax
            if (r10 != 0) goto L_0x008c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x008c:
            int r10 = id.dana.nearbyme.model.ShopModel.values()
            r11 = 6
            if (r10 != r11) goto L_0x0095
            r10 = 0
            goto L_0x00a1
        L_0x0095:
            id.dana.nearbyme.model.ShopModel r10 = r0.getMax
            if (r10 != 0) goto L_0x009c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x009c:
            int r10 = id.dana.nearbyme.model.ShopModel.values()
            int r10 = r10 + r6
        L_0x00a1:
            id.dana.nearbyme.model.ShopModel r11 = r0.getMax
            if (r11 != 0) goto L_0x00a8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x00a8:
            java.util.List<id.dana.nearbyme.model.ShopOpenHourModel> r11 = r11.onMessageChannelReady
            java.lang.Object r10 = r11.get(r10)
            id.dana.nearbyme.model.ShopOpenHourModel r10 = (id.dana.nearbyme.model.ShopOpenHourModel) r10
            id.dana.nearbyme.model.ShopModel r11 = r0.getMax
            if (r11 != 0) goto L_0x00b7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x00b7:
            java.lang.String r12 = "$this$getOpenHourType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r12)
            java.util.List<id.dana.nearbyme.model.ShopOpenHourModel> r12 = r11.onMessageChannelReady
            java.util.Collection r12 = (java.util.Collection) r12
            if (r12 == 0) goto L_0x00cb
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r12 = 0
            goto L_0x00cc
        L_0x00cb:
            r12 = 1
        L_0x00cc:
            if (r12 == 0) goto L_0x00d1
            id.dana.nearbyme.model.ShopOpenHourModel$OpenHourType r11 = id.dana.nearbyme.model.ShopOpenHourModel.OpenHourType.NONE
            goto L_0x00e1
        L_0x00d1:
            java.util.List<id.dana.nearbyme.model.ShopOpenHourModel> r11 = r11.onMessageChannelReady
            int r12 = id.dana.nearbyme.model.ShopModel.values()
            java.lang.Object r11 = r11.get(r12)
            id.dana.nearbyme.model.ShopOpenHourModel r11 = (id.dana.nearbyme.model.ShopOpenHourModel) r11
            id.dana.nearbyme.model.ShopOpenHourModel$OpenHourType r11 = r11.length()
        L_0x00e1:
            int[] r12 = o.onUpdateContact.getMin
            int r11 = r11.ordinal()
            r11 = r12[r11]
            if (r11 == r6) goto L_0x0249
            r9 = 2
            java.lang.String r13 = "ID"
            java.lang.String r14 = "in"
            java.lang.String r15 = "context.getString(string…, getFormattedHour(hour))"
            java.lang.String r3 = "HH:mm"
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r11 == r9) goto L_0x01f7
            r9 = 3
            r10 = 2131888225(0x7f120861, float:1.941108E38)
            if (r11 == r9) goto L_0x01a8
            r9 = 4
            if (r11 == r9) goto L_0x0158
            r9 = 5
            if (r11 == r9) goto L_0x0106
            goto L_0x025e
        L_0x0106:
            android.content.Context r9 = r18.getContext()
            r10 = 2131888226(0x7f120862, float:1.9411081E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "context.getString(R.string.open_now)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            long r10 = r2.setMax
            android.content.Context r2 = r18.getContext()
            r12 = 2131888227(0x7f120863, float:1.9411083E38)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.util.Date r6 = new java.util.Date
            long r10 = r10 * r16
            r6.<init>(r10)
            java.util.Locale r10 = o.WheelView.OnWheelViewListener.getMax
            if (r10 != 0) goto L_0x0133
            java.util.Locale r10 = new java.util.Locale
            r10.<init>(r14, r13)
            o.WheelView.OnWheelViewListener.getMax = r10
        L_0x0133:
            java.util.Locale r10 = o.WheelView.OnWheelViewListener.getMax
            long r13 = r6.getTime()
            java.util.Date r6 = new java.util.Date
            r6.<init>(r13)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            r11.<init>(r3, r10)
            java.lang.String r3 = r11.format(r6)
            r8[r7] = r3
            java.lang.String r2 = r2.getString(r12, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r15)
            r3 = 2131099938(0x7f060122, float:1.7812243E38)
            r0.setMin(r9, r2, r3)
            goto L_0x025e
        L_0x0158:
            android.content.Context r6 = r18.getContext()
            r8 = 2131888229(0x7f120865, float:1.9411087E38)
            java.lang.String r6 = r6.getString(r8)
            java.lang.String r8 = "context.getString(R.string.opening_soon)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            long r8 = r2.setMin
            android.content.Context r2 = r18.getContext()
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.util.Date r11 = new java.util.Date
            long r8 = r8 * r16
            r11.<init>(r8)
            java.util.Locale r8 = o.WheelView.OnWheelViewListener.getMax
            if (r8 != 0) goto L_0x0183
            java.util.Locale r8 = new java.util.Locale
            r8.<init>(r14, r13)
            o.WheelView.OnWheelViewListener.getMax = r8
        L_0x0183:
            java.util.Locale r8 = o.WheelView.OnWheelViewListener.getMax
            long r13 = r11.getTime()
            java.util.Date r9 = new java.util.Date
            r9.<init>(r13)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            r11.<init>(r3, r8)
            java.lang.String r3 = r11.format(r9)
            r12[r7] = r3
            java.lang.String r2 = r2.getString(r10, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r15)
            r3 = 2131099938(0x7f060122, float:1.7812243E38)
            r0.setMin(r6, r2, r3)
            goto L_0x025e
        L_0x01a8:
            android.content.Context r6 = r18.getContext()
            r8 = 2131886665(0x7f120249, float:1.9407915E38)
            java.lang.String r6 = r6.getString(r8)
            java.lang.String r8 = "context.getString(R.string.closing_soon)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            long r8 = r2.setMax
            android.content.Context r2 = r18.getContext()
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.util.Date r11 = new java.util.Date
            long r8 = r8 * r16
            r11.<init>(r8)
            java.util.Locale r8 = o.WheelView.OnWheelViewListener.getMax
            if (r8 != 0) goto L_0x01d3
            java.util.Locale r8 = new java.util.Locale
            r8.<init>(r14, r13)
            o.WheelView.OnWheelViewListener.getMax = r8
        L_0x01d3:
            java.util.Locale r8 = o.WheelView.OnWheelViewListener.getMax
            long r13 = r11.getTime()
            java.util.Date r9 = new java.util.Date
            r9.<init>(r13)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            r11.<init>(r3, r8)
            java.lang.String r3 = r11.format(r9)
            r12[r7] = r3
            java.lang.String r2 = r2.getString(r10, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r15)
            r3 = 2131100314(0x7f06029a, float:1.7813006E38)
            r0.setMin(r6, r2, r3)
            goto L_0x025e
        L_0x01f7:
            android.content.Context r2 = r18.getContext()
            r6 = 2131886662(0x7f120246, float:1.940791E38)
            java.lang.String r2 = r2.getString(r6)
            java.lang.String r6 = "context.getString(R.string.close_with_dot)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            long r8 = r10.setMin
            android.content.Context r6 = r18.getContext()
            r10 = 2131886664(0x7f120248, float:1.9407913E38)
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.util.Date r11 = new java.util.Date
            long r8 = r8 * r16
            r11.<init>(r8)
            java.util.Locale r8 = o.WheelView.OnWheelViewListener.getMax
            if (r8 != 0) goto L_0x0225
            java.util.Locale r8 = new java.util.Locale
            r8.<init>(r14, r13)
            o.WheelView.OnWheelViewListener.getMax = r8
        L_0x0225:
            java.util.Locale r8 = o.WheelView.OnWheelViewListener.getMax
            long r13 = r11.getTime()
            java.util.Date r9 = new java.util.Date
            r9.<init>(r13)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            r11.<init>(r3, r8)
            java.lang.String r3 = r11.format(r9)
            r12[r7] = r3
            java.lang.String r3 = r6.getString(r10, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r15)
            r6 = 2131100314(0x7f06029a, float:1.7813006E38)
            r0.setMin(r2, r3, r6)
            goto L_0x025e
        L_0x0249:
            r0.setMin(r9, r9, r7)
            goto L_0x025e
        L_0x024d:
            int r2 = o.resetInternal.setMax.getQueueTitle
            android.view.View r2 = r0._$_findCachedViewById(r2)
            if (r2 == 0) goto L_0x025e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x0260
        L_0x025e:
            r3 = 8
        L_0x0260:
            int r2 = o.resetInternal.setMax.setMinimumWidth
            android.view.View r2 = r0._$_findCachedViewById(r2)
            if (r2 == 0) goto L_0x0298
            id.dana.nearbyrevamp.view.MerchantBasicInfoView$InfoType r6 = id.dana.nearbyrevamp.view.MerchantBasicInfoView.InfoType.BASIC
            if (r1 == r6) goto L_0x028e
            boolean r1 = r18.setMax()
            if (r1 != 0) goto L_0x028c
            id.dana.nearbyme.model.ShopModel r1 = r0.getMax
            if (r1 != 0) goto L_0x0279
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0279:
            boolean r1 = r1.Mean$Arithmetic()
            if (r1 != 0) goto L_0x028c
            id.dana.nearbyme.model.ShopModel r1 = r0.getMax
            if (r1 != 0) goto L_0x0286
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0286:
            boolean r1 = r1.equals()
            if (r1 == 0) goto L_0x028e
        L_0x028c:
            r6 = 1
            goto L_0x028f
        L_0x028e:
            r6 = 0
        L_0x028f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            if (r6 == 0) goto L_0x0295
            r3 = 0
        L_0x0295:
            r2.setVisibility(r3)
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.view.MerchantBasicInfoView.showAdditionalInfo(id.dana.nearbyrevamp.view.MerchantBasicInfoView$InfoType):void");
    }

    private final boolean setMax() {
        ShopModel shopModel = this.getMax;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shop");
        }
        CharSequence min = shopModel.getMin(getContext());
        if (min == null || min.length() == 0) {
            ShopModel shopModel2 = this.getMax;
            if (shopModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shop");
            }
            return shopModel2.getMax();
        }
    }

    @SuppressLint({"SetTextI18n"})
    private final void setMin(String str, String str2, int i) {
        CharSequence charSequence = str;
        if (charSequence.length() == 0) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.requestFocus);
            if (appCompatTextView != null) {
                View view = appCompatTextView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setInputType);
            if (appCompatTextView2 != null) {
                View view2 = appCompatTextView2;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.requestFocus);
        if (appCompatTextView3 != null) {
            View view3 = appCompatTextView3;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(0);
        }
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.requestFocus);
        if (appCompatTextView4 != null) {
            appCompatTextView4.setText(charSequence);
        }
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.requestFocus);
        if (appCompatTextView5 != null) {
            appCompatTextView5.setTextColor(IntRange.setMax(getContext(), i));
        }
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setInputType);
        if (appCompatTextView6 != null) {
            View view4 = appCompatTextView6;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            view4.setVisibility(0);
        }
        AppCompatTextView appCompatTextView7 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setInputType);
        if (appCompatTextView7 != null) {
            appCompatTextView7.setText(str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ MerchantBasicInfoView getMax;

        getMax(MerchantBasicInfoView merchantBasicInfoView) {
            this.getMax = merchantBasicInfoView;
        }

        public final void onClick(View view) {
            BaseActivity baseActivity;
            if (!this.getMax.isPreview() && (baseActivity = this.getMax.getBaseActivity()) != null) {
                AddPhoneContactView.length length = AddPhoneContactView.getMin;
                ShopModel access$getShop$p = MerchantBasicInfoView.access$getShop$p(this.getMax);
                Intrinsics.checkNotNullParameter(access$getShop$p, "shopModel");
                AddPhoneContactView addPhoneContactView = new AddPhoneContactView();
                Bundle bundle = new Bundle();
                bundle.putParcelable("shopModel", access$getShop$p);
                Unit unit = Unit.INSTANCE;
                addPhoneContactView.setArguments(bundle);
                addPhoneContactView.show(baseActivity.getSupportFragmentManager(), "OpenHourDetailBottomsheetDialog");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantBasicInfoView$Companion;", "", "()V", "DEFAULT_DISTANCE", "", "MONDAY_INDEX", "", "SUNDAY_INDEX", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
