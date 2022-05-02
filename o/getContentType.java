package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RewriteQueriesToDropUnusedColumns;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lid/dana/promocenter/viewholders/PromoSpecialAdsViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/promocenter/model/PromoModel;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "bindData", "", "data", "setImagePng", "iconUrl", "", "setImageSvg", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getContentType extends Ignore<DownloadFileHandle> {
    public final /* synthetic */ void setMax(Object obj) {
        DownloadFileHandle downloadFileHandle = (DownloadFileHandle) obj;
        if (downloadFileHandle != null) {
            String str = downloadFileHandle.isInside;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                Context context = this.length;
                Intrinsics.checkNotNullExpressionValue(str, "icon");
                RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(context, (byte) 0);
                getmax.getMin = str;
                getmax.setMax = R.drawable.ic_no_image;
                getmax.isInside = new allowsGoneWidget();
                if (context != null) {
                    getmax.isInside = new RoundedCornersTransformation(isLineVisible.length((Activity) context, 8.0f), 0, RoundedCornersTransformation.CornerType.ALL);
                    getmax.setMin = (ImageView) this.itemView.findViewById(R.id.f50342131363589);
                    new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            Context context2 = this.length;
            Intrinsics.checkNotNullExpressionValue(str, "icon");
            if (context2 != null) {
                ((updateCornerMarking) Glide.getMax(context2)).setMax(str).getMax((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new RoundedCornersTransformation(isLineVisible.length((Activity) context2, 8.0f), 0, RoundedCornersTransformation.CornerType.ALL)}).setMax((int) R.drawable.bg_rounded_8dp_grey30).setMin((int) R.drawable.ic_no_image).length((ImageView) this.itemView.findViewById(R.id.f50342131363589));
            }
        }
    }

    public getContentType(@Nullable Context context, @Nullable ViewGroup viewGroup) {
        super(context, R.layout.view_promo_merchant_special, viewGroup);
    }
}
