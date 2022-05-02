package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class view extends Ignore<MerchantImageModel> {
    public final /* synthetic */ void setMax(Object obj) {
        Context context;
        MerchantImageModel merchantImageModel = (MerchantImageModel) obj;
        if (merchantImageModel != null && (context = this.length) != null) {
            updateMessageMenuItem<Drawable> max = ((updateCornerMarking) Glide.getMax(context)).setMax(merchantImageModel.length).setMin((int) R.drawable.image_broken).setMax(evaluate.setMin);
            dispatchApplyWindowInsetsToBehaviors dispatchapplywindowinsetstobehaviors = new dispatchApplyWindowInsetsToBehaviors();
            Context context2 = this.length;
            Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
            dispatchapplywindowinsetstobehaviors.length((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new RoundedCornersTransformation(context2.getResources().getDimensionPixelSize(R.dimen.f26712131165342), 1, RoundedCornersTransformation.CornerType.ALL)});
            Unit unit = Unit.INSTANCE;
            updateMessageMenuItem<Drawable> max2 = max.setMax((getTopSortedChildren<?>) dispatchapplywindowinsetstobehaviors);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            max2.length((ImageView) view.findViewById(resetInternal.setMax.DrawerArrowDrawable$ArrowDirection));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public view(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_photo_gallery, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
