package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewholder/MerchantLatestReviewPhotoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "parent", "Landroid/view/ViewGroup;", "items", "", "clickListener", "Lkotlin/Function1;", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "", "(Landroid/view/ViewGroup;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "createMediaViewerModel", "defaultValue", "", "loadImage", "imageUrl", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class hasRegisterUpdateManager extends Ignore<MerchantImageModel> {
    /* access modifiers changed from: private */
    public final Function1<MediaViewerModel, Unit> getMin;
    private final List<MerchantImageModel> setMax;

    public final /* synthetic */ void setMax(Object obj) {
        MerchantImageModel merchantImageModel = (MerchantImageModel) obj;
        if (merchantImageModel != null) {
            String str = merchantImageModel.length;
            if (str != null) {
                updateMessageMenuItem<Drawable> max = ((updateCornerMarking) Glide.getMax(this.length)).setMax(isShowMenu.setMin(str)).setMin((int) R.drawable.ic_merchant_logo_null).setMax(evaluate.setMin);
                dispatchApplyWindowInsetsToBehaviors dispatchapplywindowinsetstobehaviors = new dispatchApplyWindowInsetsToBehaviors();
                Context context = this.length;
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                dispatchapplywindowinsetstobehaviors.length((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new RoundedCornersTransformation(context.getResources().getDimensionPixelSize(R.dimen.f26712131165342), 1, RoundedCornersTransformation.CornerType.ALL)});
                Unit unit = Unit.INSTANCE;
                updateMessageMenuItem<Drawable> min = max.setMax((getTopSortedChildren<?>) dispatchapplywindowinsetstobehaviors).setMax((int) R.drawable.square_rounded_skeleton).setMin((int) R.drawable.square_rounded_skeleton);
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                min.length((ImageView) view.findViewById(resetInternal.setMax.onBoundsChange));
                return;
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ImageView imageView = (ImageView) view2.findViewById(resetInternal.setMax.onBoundsChange);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.square_rounded_skeleton);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hasRegisterUpdateManager(@NotNull ViewGroup viewGroup, @NotNull List<MerchantImageModel> list, @NotNull Function1<? super MediaViewerModel, Unit> function1) {
        super(viewGroup.getContext(), R.layout.view_item_latest_review_photo, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        this.setMax = list;
        this.getMin = function1;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ((ImageView) view.findViewById(resetInternal.setMax.onBoundsChange)).setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ hasRegisterUpdateManager setMax;

            {
                this.setMax = r1;
            }

            public final void onClick(View view) {
                if (this.setMax.getAdapterPosition() != -1) {
                    Function1 length = this.setMax.getMin;
                    hasRegisterUpdateManager hasregisterupdatemanager = this.setMax;
                    length.invoke(hasRegisterUpdateManager.getMin(hasregisterupdatemanager, hasregisterupdatemanager.getAdapterPosition()));
                }
            }
        });
    }

    public static final /* synthetic */ MediaViewerModel getMin(hasRegisterUpdateManager hasregisterupdatemanager, int i) {
        return new MediaViewerModel(i, 10, 0, 0, false, hasregisterupdatemanager.setMax);
    }
}
