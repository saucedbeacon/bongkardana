package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import id.dana.richview.moreforyou.MoreForYouView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getAspectRatio;
import o.getDuration;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lid/dana/richview/moreforyou/viewholder/MoreForYouItem;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/richview/moreforyou/model/MoreForYouModel;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "cornerRadius", "", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getSkeletonScreen", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "setSkeletonScreen", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "bindData", "", "data", "bindImage", "bindText", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class APVideoRecordRsp extends Ignore<CameraParams> {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    private final int setMin;

    public final /* synthetic */ void setMax(Object obj) {
        CameraParams cameraParams = (CameraParams) obj;
        Intrinsics.checkNotNullParameter(cameraParams, "data");
        updateMessageMenuItem<Drawable> max = ((updateCornerMarking) Glide.getMax(this.length)).setMax(cameraParams.setMin).getMax((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new RoundedCornersTransformation(this.setMin, 0)});
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        max.length((ImageView) (AppCompatImageView) view.findViewById(resetInternal.setMax.createCheckedTextView));
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextView textView = (TextView) view2.findViewById(resetInternal.setMax.ShareTarget$RequestMethod);
        if (textView != null) {
            textView.setText(cameraParams.length);
        }
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        TextView textView2 = (TextView) view3.findViewById(resetInternal.setMax.CardView);
        if (textView2 != null) {
            textView2.setText(cameraParams.setMax);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public APVideoRecordRsp(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        super(context, R.layout.item_more_for_you, viewGroup);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this.setMin = (int) (resources.getDisplayMetrics().density * 8.0f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/richview/moreforyou/viewholder/MoreForYouItem$Companion;", "", "()V", "CORNER_RADIUS_DP", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final class RecordPhase implements getBindingAdapter<MoreForYouView> {
        @InjectedFieldSignature("id.dana.richview.moreforyou.MoreForYouView.presenter")
        public static void getMax(MoreForYouView moreForYouView, getAspectRatio.getMax getmax) {
            moreForYouView.presenter = getmax;
        }

        @InjectedFieldSignature("id.dana.richview.moreforyou.MoreForYouView.readDeepLinkPropertiesPresenter")
        public static void getMax(MoreForYouView moreForYouView, getDuration.length length) {
            moreForYouView.readDeepLinkPropertiesPresenter = length;
        }
    }
}
