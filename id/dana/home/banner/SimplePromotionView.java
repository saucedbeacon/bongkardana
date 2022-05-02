package id.dana.home.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import butterknife.BindView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.model.CdpContentModel;
import kotlin.jvm.internal.Intrinsics;
import o.BlurProcess;
import o.ConstraintAttribute$AttributeType;
import o.GriverManifest;
import o.GyroscopeSensorService;
import o.allowsGoneWidget;
import o.containsFavoriteMenuItem;
import o.evaluate;
import o.layoutChildWithAnchor;
import o.onDetachedFromLayoutParams;
import o.parseBehavior;
import o.setFirstVerticalBias;
import o.setScaleX;
import o.updateCornerMarking;
import o.updatePostConstraints;
import o.updatePostLayout;

public class SimplePromotionView extends GyroscopeSensorService.SensorChangedListener {
    /* access modifiers changed from: private */
    public String FastBitmap$CoordinateSystem = "";
    private int IsOverlapping;
    private final boolean getMax;
    private setScaleX<Bitmap> getMin;
    private final int hashCode;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams isInside;
    private String length;
    @BindView(2131364291)
    ImageView promotionImage;
    private setScaleX<Bitmap> setMax;
    private final boolean setMin;
    @BindView(2131364655)
    ImageView shimmerView;
    /* access modifiers changed from: private */
    public CdpContentModel toString;
    private final parseBehavior<Bitmap> values = new parseBehavior<Bitmap>() {
        public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Bitmap> layoutchildwithanchor, boolean z) {
            return false;
        }

        public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
            return setMax((Bitmap) obj);
        }

        private boolean setMax(Bitmap bitmap) {
            if (SimplePromotionView.this.isInside != null) {
                SimplePromotionView.this.isInside.length();
            }
            SimplePromotionView.this.shimmerView.setVisibility(8);
            Context context = SimplePromotionView.this.equals;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
            }
            GriverManifest.AnonymousClass51.setMax(context, bitmap, SimplePromotionView.this.toString, SimplePromotionView.this.FastBitmap$CoordinateSystem);
            return false;
        }
    };

    public final String setMin() {
        return "";
    }

    public SimplePromotionView(CdpContentModel cdpContentModel, boolean z, boolean z2, int i, int i2, String str) {
        this.toString = cdpContentModel;
        this.setMin = z;
        this.getMax = z2;
        this.IsOverlapping = i;
        this.hashCode = i2;
        this.FastBitmap$CoordinateSystem = str;
        this.length = cdpContentModel.setMax;
    }

    public final int setMax() {
        return this.hashCode == 0 ? R.layout.view_simple_promo : R.layout.view_simple_promo_murotal_aspect_ratio;
    }

    public final void getMin() {
        if (this.IsOverlapping != -1) {
            this.shimmerView.getLayoutParams().height = this.IsOverlapping;
            this.promotionImage.getLayoutParams().height = this.IsOverlapping;
            this.shimmerView.requestLayout();
            this.promotionImage.requestLayout();
        }
        this.shimmerView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.promotionImage.setScaleType(ImageView.ScaleType.FIT_XY);
        if (this.isInside == null) {
            this.shimmerView.setVisibility(0);
            this.isInside = containsFavoriteMenuItem.getMin(this.shimmerView, R.layout.view_banner_item_skeleton);
        }
        updatePostLayout[] updatepostlayoutArr = new updatePostLayout[2];
        updatepostlayoutArr[0] = new allowsGoneWidget();
        Context context = this.equals;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        updatepostlayoutArr[1] = new updatePostConstraints(context.getResources().getDimensionPixelSize(R.dimen.f26342131165288));
        this.getMin = new setScaleX<>(updatepostlayoutArr);
        updatePostLayout[] updatepostlayoutArr2 = new updatePostLayout[1];
        Context context2 = this.equals;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        float dimensionPixelSize = (float) context2.getResources().getDimensionPixelSize(R.dimen.f26342131165288);
        updatepostlayoutArr2[0] = new ConstraintAttribute$AttributeType(dimensionPixelSize, dimensionPixelSize);
        this.setMax = new setScaleX<>(updatepostlayoutArr2);
        if (!TextUtils.isEmpty(this.length)) {
            String str = this.length;
            if (this.isInside == null) {
                this.shimmerView.setVisibility(0);
                this.isInside = containsFavoriteMenuItem.getMin(this.shimmerView, R.layout.view_banner_item_skeleton);
            } else {
                this.shimmerView.setVisibility(0);
                this.isInside.getMin();
            }
            BlurProcess.getMin("Promotion Banner Download Finish");
            View view = this.toFloatRange;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            setFirstVerticalBias max = ((updateCornerMarking) Glide.setMin(view)).equals().length(str).setMax(evaluate.getMax);
            if (this.setMin) {
                max = (setFirstVerticalBias) max.setMax((updatePostLayout<Bitmap>) this.getMin);
            } else if (this.getMax) {
                max = (setFirstVerticalBias) max.setMax((updatePostLayout<Bitmap>) this.setMax);
            }
            max.setMin(this.values).length(this.promotionImage);
        }
    }
}
