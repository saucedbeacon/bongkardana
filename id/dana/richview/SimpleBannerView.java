package id.dana.richview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import o.GyroscopeSensorService;
import o.dispatchApplyWindowInsetsToBehaviors;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.rebuildScene;
import o.setType;
import o.updateCornerMarking;
import o.updatePostLayout;

public class SimpleBannerView extends GyroscopeSensorService.SensorChangedListener {
    @BindView(2131363175)
    ImageView imagePromotion;
    private String setMax;
    /* access modifiers changed from: private */
    public Activity setMin;

    public final int setMax() {
        return R.layout.view_simple_promotion;
    }

    public final String setMin() {
        return null;
    }

    public final void getMin() {
        View view = this.toFloatRange;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        ((updateCornerMarking) Glide.setMin(view)).setMax(this.setMax).setMin((updatePostLayout<Bitmap>) new setType() {
            public final void setMax(MessageDigest messageDigest) {
            }

            public final Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
                int length = isLineVisible.length(SimpleBannerView.this.setMin, 80.0f);
                return Bitmap.createScaledBitmap(bitmap, (int) (((float) length) * (((float) bitmap.getWidth()) / ((float) bitmap.getHeight()))), length, true);
            }
        }).setMax((getTopSortedChildren<?>) (dispatchApplyWindowInsetsToBehaviors) new dispatchApplyWindowInsetsToBehaviors().setMax((updatePostLayout<Bitmap>) new RoundedCornersTransformation(8, 6))).length(this.imagePromotion);
    }
}
