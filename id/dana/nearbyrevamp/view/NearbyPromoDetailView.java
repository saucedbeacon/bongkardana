package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.NearbyMePromoType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020 H\u0016¨\u0006%"}, d2 = {"Lid/dana/nearbyrevamp/view/NearbyPromoDetailView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getDate", "", "date", "", "getLayout", "getLimitRangeTypeString", "limitRangeType", "getLimitTypeString", "limitType", "getLimitValue", "limitRule", "Lid/dana/nearbyme/model/PromoLimitInfoModel;", "getPaymentMethodString", "paymentMethodType", "getPaymentMethodValue", "paymentMethods", "", "getPromoPeriodValue", "beginDate", "endDate", "setPromoInfoModel", "", "data", "Lid/dana/nearbyme/model/PromoInfoModel;", "setup", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NearbyPromoDetailView extends BaseRichView {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    private HashMap getMin;

    @JvmOverloads
    public NearbyPromoDetailView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NearbyPromoDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_new_item_promo_nearby;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NearbyPromoDetailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearbyPromoDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NearbyPromoDetailView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPromoInfoModel(@org.jetbrains.annotations.NotNull id.dana.nearbyme.model.PromoInfoModel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = o.resetInternal.setMax.setAppSearchData
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002d
            java.lang.String r3 = r14.getMax
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0020
            int r3 = r3.length()
            if (r3 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x0021
        L_0x0020:
            r3 = 1
        L_0x0021:
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = "-"
            goto L_0x0028
        L_0x0026:
            java.lang.String r3 = r14.getMax
        L_0x0028:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x002d:
            int r0 = o.resetInternal.setMax.removeTabAt
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0050
            id.dana.model.CurrencyAmountModel r4 = r14.toIntRange
            if (r4 == 0) goto L_0x004a
            boolean r4 = r14.setMin()
            if (r4 != 0) goto L_0x004a
            id.dana.model.CurrencyAmountModel r4 = r14.toIntRange
            java.lang.String r4 = r4.setMax()
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x0050:
            int r0 = o.resetInternal.setMax.onItemSelected
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0071
            id.dana.model.CurrencyAmountModel r4 = r14.isInside
            if (r4 == 0) goto L_0x006b
            boolean r4 = r14.getMax()
            if (r4 != 0) goto L_0x006b
            id.dana.model.CurrencyAmountModel r4 = r14.isInside
            java.lang.String r4 = r4.setMax()
            goto L_0x006c
        L_0x006b:
            r4 = r3
        L_0x006c:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x0071:
            int r0 = o.resetInternal.setMax.getSuggestionCommitIconResId
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00dc
            long r4 = r14.toFloatRange
            long r6 = r14.IsOverlapping
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.Locale r9 = o.WheelView.OnWheelViewListener.getMax
            java.lang.String r10 = "ID"
            java.lang.String r11 = "in"
            if (r9 != 0) goto L_0x0093
            java.util.Locale r9 = new java.util.Locale
            r9.<init>(r11, r10)
            o.WheelView.OnWheelViewListener.getMax = r9
        L_0x0093:
            java.util.Locale r9 = o.WheelView.OnWheelViewListener.getMax
            java.util.Date r12 = new java.util.Date
            r12.<init>(r4)
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "d MMM yyyy"
            r4.<init>(r5, r9)
            java.lang.String r4 = r4.format(r12)
            java.lang.String r9 = "DateTimeUtil.getDateTime…IndonesianLocale(), date)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
            r8.append(r4)
            java.lang.String r4 = " - "
            r8.append(r4)
            java.util.Locale r4 = o.WheelView.OnWheelViewListener.getMax
            if (r4 != 0) goto L_0x00bd
            java.util.Locale r4 = new java.util.Locale
            r4.<init>(r11, r10)
            o.WheelView.OnWheelViewListener.getMax = r4
        L_0x00bd:
            java.util.Locale r4 = o.WheelView.OnWheelViewListener.getMax
            java.util.Date r10 = new java.util.Date
            r10.<init>(r6)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            r6.<init>(r5, r4)
            java.lang.String r4 = r6.format(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x00dc:
            java.util.List<id.dana.nearbyme.model.PromoLimitInfoModel> r0 = r14.toDoubleRange
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r1 = 0
        L_0x00ea:
            java.lang.String r0 = "<this>"
            if (r1 != 0) goto L_0x0260
            int r1 = o.resetInternal.setMax.setImeOptions
            android.view.View r1 = r13._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0100
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setVisibility(r2)
        L_0x0100:
            int r1 = o.resetInternal.setMax.getSuggestionRowLayout
            android.view.View r1 = r13._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0112
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setVisibility(r2)
        L_0x0112:
            int r0 = o.resetInternal.setMax.getSuggestionRowLayout
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0286
            java.util.List<id.dana.nearbyme.model.PromoLimitInfoModel> r1 = r14.toDoubleRange
            java.lang.String r2 = "data.limitRule"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)
            java.lang.String r2 = "data.limitRule.first()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            id.dana.nearbyme.model.PromoLimitInfoModel r1 = (id.dana.nearbyme.model.PromoLimitInfoModel) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r1.getMax
            r2.append(r4)
            android.content.Context r4 = r13.getContext()
            r5 = 2131888416(0x7f120920, float:1.9411467E38)
            java.lang.String r4 = r4.getString(r5)
            r2.append(r4)
            java.lang.String r4 = " "
            r2.append(r4)
            java.lang.String r5 = r1.length
            if (r5 != 0) goto L_0x0150
            goto L_0x01af
        L_0x0150:
            int r6 = r5.hashCode()
            r7 = -1567752462(0xffffffffa28dfef2, float:-3.848806E-18)
            if (r6 == r7) goto L_0x0196
            r7 = -1509871868(0xffffffffa6012f04, float:-4.4819584E-16)
            if (r6 == r7) goto L_0x017d
            r7 = 1268314605(0x4b98f1ed, float:2.004681E7)
            if (r6 == r7) goto L_0x0164
            goto L_0x01af
        L_0x0164:
            java.lang.String r6 = "DIVISION_ID"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01af
            android.content.Context r5 = r13.getContext()
            r6 = 2131888410(0x7f12091a, float:1.9411455E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(\n     …mo_use_limit_division_id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            goto L_0x01b0
        L_0x017d:
            java.lang.String r6 = "SHOP_ID"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01af
            android.content.Context r5 = r13.getContext()
            r6 = 2131888414(0x7f12091e, float:1.9411463E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(\n     ….promo_use_limit_shop_id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            goto L_0x01b0
        L_0x0196:
            java.lang.String r6 = "MERCHANT_ID"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01af
            android.content.Context r5 = r13.getContext()
            r6 = 2131888413(0x7f12091d, float:1.941146E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(\n     …mo_use_limit_merchant_id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            goto L_0x01b0
        L_0x01af:
            r5 = r3
        L_0x01b0:
            r2.append(r5)
            r2.append(r4)
            java.lang.String r1 = r1.setMin
            java.lang.String r4 = "limitRule.limitRangeType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            int r4 = r1.hashCode()
            r5 = 2175(0x87f, float:3.048E-42)
            if (r4 == r5) goto L_0x023b
            r5 = 2423(0x977, float:3.395E-42)
            if (r4 == r5) goto L_0x0222
            r5 = 2454(0x996, float:3.439E-42)
            if (r4 == r5) goto L_0x0209
            r5 = 2764(0xacc, float:3.873E-42)
            if (r4 == r5) goto L_0x01f0
            r5 = 2826(0xb0a, float:3.96E-42)
            if (r4 == r5) goto L_0x01d7
            goto L_0x0253
        L_0x01d7:
            java.lang.String r4 = "YC"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0253
            android.content.Context r1 = r13.getContext()
            r3 = 2131888417(0x7f120921, float:1.9411469E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r1 = "context.getString(R.string.promo_use_limit_yc)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            goto L_0x0253
        L_0x01f0:
            java.lang.String r4 = "WC"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0253
            android.content.Context r1 = r13.getContext()
            r3 = 2131888415(0x7f12091f, float:1.9411465E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r1 = "context.getString(R.string.promo_use_limit_wc)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            goto L_0x0253
        L_0x0209:
            java.lang.String r4 = "MC"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0253
            android.content.Context r1 = r13.getContext()
            r3 = 2131888412(0x7f12091c, float:1.9411459E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r1 = "context.getString(R.string.promo_use_limit_mc)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            goto L_0x0253
        L_0x0222:
            java.lang.String r4 = "LC"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0253
            android.content.Context r1 = r13.getContext()
            r3 = 2131888411(0x7f12091b, float:1.9411457E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r1 = "context.getString(R.string.promo_use_limit_lc)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            goto L_0x0253
        L_0x023b:
            java.lang.String r4 = "DC"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0253
            android.content.Context r1 = r13.getContext()
            r3 = 2131888409(0x7f120919, float:1.9411453E38)
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r1 = "context.getString(R.string.promo_use_limit_dc)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
        L_0x0253:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x0286
        L_0x0260:
            int r1 = o.resetInternal.setMax.setImeOptions
            android.view.View r1 = r13._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 8
            if (r1 == 0) goto L_0x0274
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setVisibility(r2)
        L_0x0274:
            int r1 = o.resetInternal.setMax.getSuggestionRowLayout
            android.view.View r1 = r13._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0286
            android.view.View r1 = (android.view.View) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setVisibility(r2)
        L_0x0286:
            int r0 = o.resetInternal.setMax.setSearchableInfo
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x029b
            java.util.List<java.lang.String> r14 = r14.equals
            java.lang.String r14 = r13.setMax(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r0.setText(r14)
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.view.NearbyPromoDetailView.setPromoInfoModel(id.dana.nearbyme.model.PromoInfoModel):void");
    }

    private final String setMax(List<String> list) {
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            return getMin("");
        }
        List arrayList = new ArrayList();
        for (String min : list) {
            String min2 = getMin(min);
            if (!TextUtils.isEmpty(min2) && !arrayList.contains(min2)) {
                arrayList.add(min2);
            }
        }
        if (arrayList.size() <= 1) {
            return (String) arrayList.get(0);
        }
        arrayList.remove(arrayList.size() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(", ", arrayList));
        sb.append(" & ");
        sb.append((String) arrayList.get(arrayList.size() - 1));
        return sb.toString();
    }

    private final String getMin(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        Regex regex = new Regex("\\]");
        String replace = new Regex(" ").replace((CharSequence) regex.replace((CharSequence) new Regex("\\[").replace(charSequence, ""), ""), "");
        switch (replace.hashCode()) {
            case -64365875:
                if (replace.equals("DIRECT_DEBIT_CREDIT_CARD")) {
                    return getContext().getString(R.string.promo_payment_method_direct_debit_credit_card);
                }
                break;
            case 0:
                if (replace.equals("")) {
                    return getContext().getString(R.string.all_payment_method);
                }
                break;
            case 341392997:
                if (replace.equals(NearbyMePromoType.PaymentMethodType.ONLINE_CREDIT)) {
                    return getContext().getString(R.string.promo_payment_method_online_credit);
                }
                break;
            case 378796732:
                if (replace.equals("BALANCE")) {
                    return getContext().getString(R.string.promo_payment_method_balance);
                }
                break;
            case 1079718284:
                if (replace.equals("DIRECT_DEBIT_DEBIT_CARD")) {
                    return getContext().getString(R.string.promo_payment_method_direct_debit_debit_card);
                }
                break;
            case 1280945827:
                if (replace.equals("DEBIT_CARD")) {
                    return getContext().getString(R.string.promo_payment_method_debit_card);
                }
                break;
            case 1878720662:
                if (replace.equals("CREDIT_CARD")) {
                    return getContext().getString(R.string.promo_payment_method_credit_card);
                }
                break;
            case 1883983033:
                if (replace.equals("VIRTUAL_ACCOUNT")) {
                    return getContext().getString(R.string.promo_payment_method_virtual_account);
                }
                break;
            case 1993722918:
                if (replace.equals("COUPON")) {
                    return getContext().getString(R.string.promo_payment_method_coupon);
                }
                break;
            case 2134027076:
                if (replace.equals("NET_BANKING")) {
                    return getContext().getString(R.string.promo_payment_method_net_banking);
                }
                break;
        }
        return "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/view/NearbyPromoDetailView$Companion;", "", "()V", "DATE_FORMAT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
