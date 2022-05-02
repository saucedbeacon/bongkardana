package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.RewriteQueriesToDropUnusedColumns;
import o.positiveString;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AboutMenu extends Ignore<MerchantImageModel> {
    @NotNull
    private final ViewGroup getMin;

    public final /* synthetic */ void setMax(Object obj) {
        MerchantImageModel merchantImageModel = (MerchantImageModel) obj;
        if (merchantImageModel == null) {
            return;
        }
        if (RewriteQueriesToDropUnusedColumns.setMax(merchantImageModel.length)) {
            RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
            getmax.getMin = merchantImageModel.length;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            getmax.setMin = (ImageView) view.findViewById(resetInternal.setMax.scheduleDrawable);
            new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
            return;
        }
        updateMessageMenuItem<Drawable> max = ((updateCornerMarking) Glide.getMax(this.length)).setMax(merchantImageModel.length).setMin((int) R.drawable.ic_merchant_logo_null).setMax(evaluate.setMin);
        dispatchApplyWindowInsetsToBehaviors dispatchapplywindowinsetstobehaviors = new dispatchApplyWindowInsetsToBehaviors();
        Context context = this.length;
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        dispatchapplywindowinsetstobehaviors.length((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new RoundedCornersTransformation(context.getResources().getDimensionPixelSize(R.dimen.f26712131165342), 1, RoundedCornersTransformation.CornerType.ALL)});
        Unit unit = Unit.INSTANCE;
        updateMessageMenuItem<Drawable> max2 = max.setMax((getTopSortedChildren<?>) dispatchapplywindowinsetstobehaviors);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        max2.length((ImageView) view2.findViewById(resetInternal.setMax.scheduleDrawable));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutMenu(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_merchant_photo, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMin = viewGroup;
    }

    /* renamed from: o.AboutMenu$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<MerchantPhotoViewerDialog> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog.merchantPhotoViewerPresenter")
        public static void setMax(MerchantPhotoViewerDialog merchantPhotoViewerDialog, positiveString.length<MerchantImageModel> length) {
            merchantPhotoViewerDialog.merchantPhotoViewerPresenter = length;
        }
    }
}
