package o;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GyroscopeSensorService;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/nearbyrevamp/merchantbanner/MerchantBannerItemView;", "Lid/dana/onboarding/view/BaseSimpleView;", "imageUrl", "", "(Ljava/lang/String;)V", "getLayout", "", "getTitle", "init", "", "loadImage", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverCommonAbilityProxyImpl extends GyroscopeSensorService.SensorChangedListener {
    private final String getMin;

    public GriverCommonAbilityProxyImpl() {
        this((byte) 0);
    }

    public final int setMax() {
        return R.layout.item_merchant_banner;
    }

    @NotNull
    public final String setMin() {
        return "";
    }

    private /* synthetic */ GriverCommonAbilityProxyImpl(byte b) {
        this("");
    }

    public GriverCommonAbilityProxyImpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        this.getMin = str;
    }

    public final void getMin() {
        String str = this.getMin;
        View view = this.toFloatRange;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setSupportProgressBarIndeterminate);
        if (appCompatImageView != null) {
            ((setFirstVerticalBias) ((setFirstVerticalBias) ((setFirstVerticalBias) Glide.getMax(appCompatImageView.getContext()).length().getMax(str).getMin(evaluate.setMin)).getMin((int) R.drawable.ic_merchant_banner_placeholder)).length((int) R.color.f20342131099946)).length((ImageView) appCompatImageView);
        }
    }
}
