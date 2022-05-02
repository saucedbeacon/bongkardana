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

public class NewSimplePromotionView extends GyroscopeSensorService.SensorChangedListener {
    /* access modifiers changed from: private */
    public String IsOverlapping = "";
    private final boolean getMax;
    private View.OnTouchListener getMin;
    /* access modifiers changed from: private */
    public CdpContentModel hashCode;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams isInside;
    private String length;
    @BindView(2131364291)
    ImageView promotionImage;
    private final boolean setMax;
    private setScaleX<Bitmap> setMin;
    @BindView(2131364655)
    ImageView shimmerView;
    private setScaleX<Bitmap> toDoubleRange;
    private final parseBehavior<Bitmap> toString = new parseBehavior<Bitmap>() {
        public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Bitmap> layoutchildwithanchor, boolean z) {
            return false;
        }

        public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
            return setMax((Bitmap) obj);
        }

        private boolean setMax(Bitmap bitmap) {
            if (NewSimplePromotionView.this.isInside != null) {
                NewSimplePromotionView.this.isInside.length();
            }
            NewSimplePromotionView.this.shimmerView.setVisibility(8);
            Context context = NewSimplePromotionView.this.equals;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
            }
            GriverManifest.AnonymousClass51.setMax(context, bitmap, NewSimplePromotionView.this.hashCode, NewSimplePromotionView.this.IsOverlapping);
            return false;
        }
    };

    public final int setMax() {
        return R.layout.view_simple_promo_murotal_aspect_ratio;
    }

    public final String setMin() {
        return "";
    }

    public NewSimplePromotionView(View.OnTouchListener onTouchListener, CdpContentModel cdpContentModel, boolean z, boolean z2, String str) {
        this.hashCode = cdpContentModel;
        this.setMax = z;
        this.getMin = onTouchListener;
        this.getMax = z2;
        this.IsOverlapping = str;
        this.length = cdpContentModel.setMax;
    }

    public final void getMin() {
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
        this.setMin = new setScaleX<>(updatepostlayoutArr);
        updatePostLayout[] updatepostlayoutArr2 = new updatePostLayout[1];
        Context context2 = this.equals;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        float dimensionPixelSize = (float) context2.getResources().getDimensionPixelSize(R.dimen.f26352131165289);
        updatepostlayoutArr2[0] = new ConstraintAttribute$AttributeType(dimensionPixelSize, dimensionPixelSize);
        this.toDoubleRange = new setScaleX<>(updatepostlayoutArr2);
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
            if (this.setMax) {
                max = (setFirstVerticalBias) max.setMax((updatePostLayout<Bitmap>) this.setMin);
            } else if (this.getMax) {
                max = (setFirstVerticalBias) max.setMax((updatePostLayout<Bitmap>) this.toDoubleRange);
            }
            max.setMin(this.toString).length(this.promotionImage);
        }
        View view2 = this.toFloatRange;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        view2.setOnTouchListener(this.getMin);
    }
}
