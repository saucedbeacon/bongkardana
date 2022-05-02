package o;

import android.view.ViewGroup;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lid/dana/explore/adapter/viewholder/ExploreProductViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/explore/model/ExploreProductWrapper;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setIcon", "iconUrl", "", "setProductDetail", "productDetail", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class bytesToHexStringInReverse extends Ignore<supportAdvertise> {
    @NotNull
    public static final setMax setMin = new setMax((byte) 0);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r4.equals("service_bpjs") != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r4.equals("service_telkom") != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r4 == null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void setMax(java.lang.Object r8) {
        /*
            r7 = this;
            o.supportAdvertise r8 = (o.supportAdvertise) r8
            super.setMax(r8)
            if (r8 == 0) goto L_0x0129
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r2 = o.resetInternal.setMax.ColorInt
            android.view.View r0 = r0.findViewById(r2)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            if (r0 == 0) goto L_0x0023
            o.openBluetooth r2 = r8.setMax
            java.lang.String r2 = r2.setMax
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setCardBackgroundColor((int) r2)
        L_0x0023:
            o.openBluetooth r0 = r8.setMax
            o.performRequest r0 = r0.toIntRange
            r2 = 1
            if (r0 == 0) goto L_0x0092
            o.openBluetooth r3 = r8.setMax
            o.openBluetooth r4 = r8.setMax
            java.lang.String r4 = r4.toFloatRange
            if (r4 != 0) goto L_0x0033
            goto L_0x0077
        L_0x0033:
            int r5 = r4.hashCode()
            r6 = -1872079272(0xffffffff906a5658, float:-4.621488E-29)
            if (r5 == r6) goto L_0x005d
            r6 = 359536993(0x156e1961, float:4.8083738E-26)
            if (r5 == r6) goto L_0x0054
            r6 = 930525159(0x3776afe7, float:1.4703698E-5)
            if (r5 == r6) goto L_0x0047
            goto L_0x0077
        L_0x0047:
            java.lang.String r5 = "service_electricity"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0077
            o.openBluetooth r4 = r8.setMax
            java.lang.String r4 = r4.getMin
            goto L_0x007b
        L_0x0054:
            java.lang.String r5 = "service_bpjs"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0077
            goto L_0x0065
        L_0x005d:
            java.lang.String r5 = "service_telkom"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0077
        L_0x0065:
            java.lang.String r4 = r0.getCustomerName()
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 != 0) goto L_0x007b
        L_0x0077:
            java.lang.String r4 = r0.getProviderName()
        L_0x007b:
            r3.getMin = r4
            o.openBluetooth r3 = r8.setMax
            java.lang.String r4 = r0.getBizId()
            java.lang.String r0 = r0.getBizId()
            int r0 = r0.length()
            int r0 = r0 - r2
            java.lang.String r0 = o.setH5MenuList.getMin((java.lang.String) r4, (int) r0)
            r3.isInside = r0
        L_0x0092:
            android.view.View r0 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r3 = o.resetInternal.setMax.getViewListMeasuredWidth
            android.view.View r0 = r0.findViewById(r3)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            if (r0 == 0) goto L_0x00aa
            o.openBluetooth r3 = r8.setMax
            java.lang.String r3 = r3.getMin
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x00aa:
            o.openBluetooth r0 = r8.setMax
            java.lang.String r0 = r0.setMin
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            if (r3 == 0) goto L_0x00bd
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r3 = 0
            goto L_0x00be
        L_0x00bd:
            r3 = 1
        L_0x00be:
            r5 = 2131231120(0x7f080190, float:1.8078312E38)
            if (r3 != 0) goto L_0x00e8
            android.content.Context r3 = r7.length
            o.setHorizontalGap r3 = com.bumptech.glide.Glide.getMax((android.content.Context) r3)
            o.updateCornerMarking r3 = (o.updateCornerMarking) r3
            o.updateMessageMenuItem r0 = r3.setMax((java.lang.String) r0)
            o.updateMessageMenuItem r0 = r0.setMax((int) r5)
            o.updateMessageMenuItem r0 = r0.setMin((int) r5)
            android.view.View r3 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            int r5 = o.resetInternal.setMax.getItemData
            android.view.View r3 = r3.findViewById(r5)
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            r0.length((android.widget.ImageView) r3)
            goto L_0x00fa
        L_0x00e8:
            android.view.View r0 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r3 = o.resetInternal.setMax.getItemData
            android.view.View r0 = r0.findViewById(r3)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            if (r0 == 0) goto L_0x00fa
            r0.setImageResource(r5)
        L_0x00fa:
            o.openBluetooth r8 = r8.setMax
            java.lang.String r8 = r8.isInside
            android.view.View r0 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = o.resetInternal.setMax.layoutChildRight
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            if (r0 == 0) goto L_0x0129
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r0.setText(r8)
            android.view.View r0 = (android.view.View) r0
            if (r8 == 0) goto L_0x011f
            boolean r8 = kotlin.text.StringsKt.isBlank(r8)
            if (r8 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r8 = 0
            goto L_0x0120
        L_0x011f:
            r8 = 1
        L_0x0120:
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r4 = 8
        L_0x0126:
            r0.setVisibility(r4)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bytesToHexStringInReverse.setMax(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bytesToHexStringInReverse(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_explore_product, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/explore/adapter/viewholder/ExploreProductViewHolder$Companion;", "", "()V", "CHAR_BETWEEN_SPACE", "", "START_INDEX", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
