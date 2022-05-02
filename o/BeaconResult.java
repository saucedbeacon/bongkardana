package o;

import android.view.ViewGroup;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\n"}, d2 = {"Lid/dana/explore/view/ExploreServiceViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/explore/model/ExploreServiceWrapper;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setIcon", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BeaconResult extends Ignore<getUUIDFromString> {
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void setMax(java.lang.Object r9) {
        /*
            r8 = this;
            o.getUUIDFromString r9 = (o.getUUIDFromString) r9
            if (r9 == 0) goto L_0x013b
            o.MyBeacon r0 = r9.setMin
            java.lang.String r0 = r0.getMin
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003f
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r4 = "_description"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 2
            boolean r0 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r4, (boolean) r3, (int) r5, (java.lang.Object) r2)
            if (r0 != r1) goto L_0x003f
            android.content.Context r0 = r8.length
            android.content.Context r4 = r8.length
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            o.MyBeacon r6 = r9.setMin
            java.lang.String r6 = r6.getMin
            android.content.Context r7 = r8.length
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            java.lang.String r5 = r7.getPackageName()
            java.lang.String r7 = "string"
            int r4 = r4.getIdentifier(r6, r7, r5)
            java.lang.String r0 = r0.getString(r4)
            goto L_0x0043
        L_0x003f:
            o.MyBeacon r0 = r9.setMin
            java.lang.String r0 = r0.getMin
        L_0x0043:
            android.view.View r4 = r8.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r6 = o.resetInternal.setMax.CustomTabsIntent$ShareState
            android.view.View r4 = r4.findViewById(r6)
            com.google.android.material.textview.MaterialTextView r4 = (com.google.android.material.textview.MaterialTextView) r4
            if (r4 == 0) goto L_0x005d
            o.MyBeacon r6 = r9.setMin
            java.lang.String r6 = r6.setMax
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.setText(r6)
        L_0x005d:
            android.view.View r4 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r6 = o.resetInternal.setMax.setSplitTrack
            android.view.View r4 = r4.findViewById(r6)
            com.google.android.material.textview.MaterialTextView r4 = (com.google.android.material.textview.MaterialTextView) r4
            if (r4 == 0) goto L_0x0071
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
        L_0x0071:
            android.view.View r0 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            int r4 = o.resetInternal.setMax.setFirstVerticalBias
            android.view.View r0 = r0.findViewById(r4)
            r4 = 8
            if (r0 == 0) goto L_0x008d
            boolean r6 = r9.getMin()
            if (r6 == 0) goto L_0x0089
            r6 = 8
            goto L_0x008a
        L_0x0089:
            r6 = 0
        L_0x008a:
            r0.setVisibility(r6)
        L_0x008d:
            if (r9 == 0) goto L_0x0096
            o.MyBeacon r0 = r9.setMin
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = r0.getMax
            goto L_0x0097
        L_0x0096:
            r0 = r2
        L_0x0097:
            if (r0 != 0) goto L_0x009a
            goto L_0x00e5
        L_0x009a:
            int r6 = r0.hashCode()
            r7 = 110546608(0x696ceb0, float:5.672743E-35)
            if (r6 == r7) goto L_0x00c7
            r7 = 821988681(0x30fe8d49, float:1.8521088E-9)
            if (r6 == r7) goto L_0x00a9
            goto L_0x00e5
        L_0x00a9:
            java.lang.String r6 = "send_money"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e5
            android.view.View r0 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            int r2 = o.resetInternal.setMax.setShortcut
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0114
            r2 = 2131232296(0x7f080628, float:1.8080697E38)
            r0.setImageResource(r2)
            goto L_0x0114
        L_0x00c7:
            java.lang.String r6 = "topup"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e5
            android.view.View r0 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            int r2 = o.resetInternal.setMax.setShortcut
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0114
            r2 = 2131232297(0x7f080629, float:1.80807E38)
            r0.setImageResource(r2)
            goto L_0x0114
        L_0x00e5:
            android.content.Context r0 = r8.length
            o.setHorizontalGap r0 = com.bumptech.glide.Glide.getMax((android.content.Context) r0)
            o.updateCornerMarking r0 = (o.updateCornerMarking) r0
            if (r9 == 0) goto L_0x00f5
            o.MyBeacon r6 = r9.setMin
            if (r6 == 0) goto L_0x00f5
            java.lang.String r2 = r6.setMin
        L_0x00f5:
            o.updateMessageMenuItem r0 = r0.setMax((java.lang.String) r2)
            r2 = 2131231845(0x7f080465, float:1.8079783E38)
            o.updateMessageMenuItem r0 = r0.setMax((int) r2)
            o.updateMessageMenuItem r0 = r0.setMin((int) r2)
            android.view.View r2 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            int r6 = o.resetInternal.setMax.setShortcut
            android.view.View r2 = r2.findViewById(r6)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.length((android.widget.ImageView) r2)
        L_0x0114:
            if (r9 == 0) goto L_0x013b
            o.MyBeacon r9 = r9.setMin
            if (r9 == 0) goto L_0x013b
            android.view.View r0 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            int r2 = o.resetInternal.setMax.setVisible
            android.view.View r0 = r0.findViewById(r2)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            java.lang.String r2 = "itemView.iv_maintenance_badge"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            android.view.View r0 = (android.view.View) r0
            boolean r9 = r9.setMin()
            r9 = r9 ^ r1
            if (r9 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r3 = 8
        L_0x0138:
            r0.setVisibility(r3)
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BeaconResult.setMax(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BeaconResult(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_explore_service, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
