package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "itemClickListener", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PhotoPreviewViewHolderr", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class negativeTextColor extends IMultiInstanceInvalidationCallback.Stub<Ignore<MerchantImageModel>, MerchantImageModel> {
    private final Function1<Integer, Unit> length;

    /* JADX WARNING: type inference failed for: r0v2, types: [o.positiveTextColor] */
    /* JADX WARNING: type inference failed for: r0v4, types: [o.positiveTextColor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.valueOf onCreateViewHolder(android.view.ViewGroup r2, int r3) {
        /*
            r1 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            if (r3 == r0) goto L_0x0022
            r0 = 2
            if (r3 == r0) goto L_0x0022
            o.view r3 = new o.view
            r3.<init>(r2)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r2 = r1.length
            if (r2 == 0) goto L_0x001a
            o.positiveTextColor r0 = new o.positiveTextColor
            r0.<init>(r2)
            r2 = r0
        L_0x001a:
            o.Ignore$setMin r2 = (o.Ignore.setMin) r2
            r3.setMin(r2)
            o.Ignore r3 = (o.Ignore) r3
            goto L_0x0038
        L_0x0022:
            o.negativeTextColor$getMin r3 = new o.negativeTextColor$getMin
            r3.<init>(r2)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r2 = r1.length
            if (r2 == 0) goto L_0x0031
            o.positiveTextColor r0 = new o.positiveTextColor
            r0.<init>(r2)
            r2 = r0
        L_0x0031:
            o.Ignore$setMin r2 = (o.Ignore.setMin) r2
            r3.setMin(r2)
            o.Ignore r3 = (o.Ignore) r3
        L_0x0038:
            androidx.recyclerview.widget.RecyclerView$valueOf r3 = (androidx.recyclerview.widget.RecyclerView.valueOf) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.negativeTextColor.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$valueOf");
    }

    public negativeTextColor(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "itemClickListener");
        this.length = function1;
    }

    public final int getItemViewType(int i) {
        return ((MerchantImageModel) getMax().get(i)).getMin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryAdapter$PhotoPreviewViewHolderr;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends Ignore<MerchantImageModel> {
        public final /* synthetic */ void setMax(Object obj) {
            MerchantImageModel merchantImageModel = (MerchantImageModel) obj;
            if (merchantImageModel != null) {
                Context context = this.length;
                if (context != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    ((setFirstVerticalBias) ((setFirstVerticalBias) ((setFirstVerticalBias) Glide.getMax(context).getMax(merchantImageModel.length).length((int) R.color.f20342131099946)).getMin((int) R.color.f20342131099946)).getMin(evaluate.setMin)).length((ImageView) view.findViewById(resetInternal.setMax.onSupportNavigateUp));
                }
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextView textView = (TextView) view2.findViewById(resetInternal.setMax.onQueryRefine);
                int i = 8;
                boolean z = true;
                if (textView != null) {
                    View view3 = textView;
                    boolean z2 = merchantImageModel.getMin == 2;
                    Intrinsics.checkNotNullParameter(view3, "<this>");
                    view3.setVisibility(z2 ? 0 : 8);
                }
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ImageView imageView = (ImageView) view4.findViewById(resetInternal.setMax.setCursor);
                if (imageView != null) {
                    View view5 = imageView;
                    if (merchantImageModel.getMin != 2) {
                        z = false;
                    }
                    Intrinsics.checkNotNullParameter(view5, "<this>");
                    if (z) {
                        i = 0;
                    }
                    view5.setVisibility(i);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_photo_preview, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }
    }
}
