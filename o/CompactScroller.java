package o;

import android.content.Context;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.model.SendMoneyHomeMenuModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CornerMarkingDataProvider;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0003J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\rH\u0004J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\nH\u0002¨\u0006\u0019"}, d2 = {"Lid/dana/sendmoney_v2/landing/viewholder/recepient/RecipientViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/SendMoneyHomeMenuModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "getLocalizeText", "", "key", "getPlaceHolder", "", "action", "loadImage", "url", "placeholder", "setContentDescription", "setRibbonView", "Lid/dana/sendmoney_v2/landing/view/RecipientRibbonView;", "setSubtitle", "text", "setTitle", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CompactScroller extends Ignore<SendMoneyHomeMenuModel> {
    @NotNull
    public static final length setMax = new length((byte) 0);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void setMax(java.lang.Object r12) {
        /*
            r11 = this;
            id.dana.model.SendMoneyHomeMenuModel r12 = (id.dana.model.SendMoneyHomeMenuModel) r12
            if (r12 == 0) goto L_0x0191
            java.lang.String r0 = r12.getMax
            java.lang.String r0 = r11.getMin(r0)
            android.view.View r1 = r11.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r3 = o.resetInternal.setMax.launchQuerySearch
            android.view.View r1 = r1.findViewById(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0035
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r6 = kotlin.text.StringsKt.isBlank(r0)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x002d
            r6 = 0
            goto L_0x002f
        L_0x002d:
            r6 = 8
        L_0x002f:
            r5.setVisibility(r6)
            r1.setText(r0)
        L_0x0035:
            java.lang.String r0 = r12.setMin
            java.lang.String r0 = r11.getMin(r0)
            android.view.View r1 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r5 = o.resetInternal.setMax.onActionViewCollapsed
            android.view.View r1 = r1.findViewById(r5)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L_0x0061
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r6 = kotlin.text.StringsKt.isBlank(r0)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x0059
            r6 = 0
            goto L_0x005b
        L_0x0059:
            r6 = 8
        L_0x005b:
            r5.setVisibility(r6)
            r1.setText(r0)
        L_0x0061:
            java.lang.String r0 = r12.equals
            java.lang.String r1 = r12.length
            int r5 = r1.hashCode()
            java.lang.String r6 = "chat"
            java.lang.String r7 = "bank"
            java.lang.String r8 = "phonenumber"
            java.lang.String r9 = "outlet"
            switch(r5) {
                case -1820761141: goto L_0x009d;
                case -1005516787: goto L_0x0093;
                case -276836809: goto L_0x0089;
                case 3016252: goto L_0x007f;
                case 3052376: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x00a9
        L_0x0075:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00a9
            r1 = 2131232404(0x7f080694, float:1.8080916E38)
            goto L_0x00ac
        L_0x007f:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00a9
            r1 = 2131232402(0x7f080692, float:1.8080912E38)
            goto L_0x00ac
        L_0x0089:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00a9
            r1 = 2131232405(0x7f080695, float:1.8080918E38)
            goto L_0x00ac
        L_0x0093:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00a9
            r1 = 2131232282(0x7f08061a, float:1.8080669E38)
            goto L_0x00ac
        L_0x009d:
            java.lang.String r5 = "external"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00a9
            r1 = 2131232403(0x7f080693, float:1.8080914E38)
            goto L_0x00ac
        L_0x00a9:
            r1 = 2131232794(0x7f08081a, float:1.8081707E38)
        L_0x00ac:
            java.lang.String r5 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            android.view.View r5 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            int r10 = o.resetInternal.setMax.setSupportProgressBarVisibility
            android.view.View r5 = r5.findViewById(r10)
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            if (r5 == 0) goto L_0x00eb
            android.content.Context r10 = r5.getContext()
            o.setHorizontalGap r10 = com.bumptech.glide.Glide.getMax((android.content.Context) r10)
            o.updateCornerMarking r10 = (o.updateCornerMarking) r10
            o.updateMessageMenuItem r0 = r10.setMax((java.lang.String) r0)
            o.evaluate r10 = o.evaluate.setMin
            o.updateMessageMenuItem r0 = r0.setMax((o.evaluate) r10)
            o.dispatchApplyWindowInsetsToBehaviors r10 = o.isLineVisible.getMax()
            o.getTopSortedChildren r10 = (o.getTopSortedChildren) r10
            o.updateMessageMenuItem r0 = r0.setMax((o.getTopSortedChildren<?>) r10)
            o.updateMessageMenuItem r0 = r0.setMax((int) r1)
            o.updateMessageMenuItem r0 = r0.setMin((int) r1)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.length((android.widget.ImageView) r5)
        L_0x00eb:
            android.view.View r0 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r1 = o.resetInternal.setMax.setWindowCallback
            android.view.View r0 = r0.findViewById(r1)
            id.dana.sendmoney_v2.landing.view.RecipientRibbonView r0 = (id.dana.sendmoney_v2.landing.view.RecipientRibbonView) r0
            if (r0 == 0) goto L_0x0120
            boolean r1 = r12.setMin()
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = r12.toIntRange
            java.lang.String r1 = r11.getMin(r1)
            r0.setTitle(r1)
            java.lang.String r1 = r12.IsOverlapping
            java.lang.String r1 = r11.getMin(r1)
            r0.setContent(r1)
        L_0x0112:
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r12.setMin()
            if (r1 == 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r3 = 8
        L_0x011d:
            r0.setVisibility(r3)
        L_0x0120:
            java.lang.String r12 = r12.length
            int r0 = r12.hashCode()
            switch(r0) {
                case -1005516787: goto L_0x0178;
                case -276836809: goto L_0x015e;
                case 3016252: goto L_0x0144;
                case 3052376: goto L_0x012a;
                default: goto L_0x0129;
            }
        L_0x0129:
            goto L_0x0191
        L_0x012a:
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0191
            android.view.View r12 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            android.content.Context r0 = r11.length
            r1 = 2131886488(0x7f120198, float:1.9407556E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r12.setContentDescription(r0)
            return
        L_0x0144:
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto L_0x0191
            android.view.View r12 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            android.content.Context r0 = r11.length
            r1 = 2131886487(0x7f120197, float:1.9407554E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r12.setContentDescription(r0)
            return
        L_0x015e:
            boolean r12 = r12.equals(r8)
            if (r12 == 0) goto L_0x0191
            android.view.View r12 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            android.content.Context r0 = r11.length
            r1 = 2131886489(0x7f120199, float:1.9407558E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r12.setContentDescription(r0)
            return
        L_0x0178:
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x0191
            android.view.View r12 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            android.content.Context r0 = r11.length
            r1 = 2131886490(0x7f12019a, float:1.940756E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r12.setContentDescription(r0)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CompactScroller.setMax(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompactScroller(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recipient, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/landing/viewholder/recepient/RecipientViewHolder$Companion;", "", "()V", "V2_RES_POSTFIX", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    private final String getMin(String str) {
        Context context = this.length;
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_v2");
        return CornerMarkingDataProvider.AnonymousClass3.setMin(context, sb.toString(), str);
    }
}
