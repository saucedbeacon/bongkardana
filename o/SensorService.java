package o;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GyroscopeSensorService;
import o.LinearLayoutCompat;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/onboarding/view/AnimatedIntroductionView;", "Lid/dana/onboarding/view/BaseSimpleView;", "title", "", "animationAssetRes", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLayout", "", "getTitle", "init", "", "setAnimation", "setDescription", "setTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SensorService extends GyroscopeSensorService.SensorChangedListener {
    private String getMin;
    private String setMax;
    private String setMin;

    public final int setMax() {
        return R.layout.view_simple_introduction_animated;
    }

    public SensorService(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "animationAssetRes");
        Intrinsics.checkNotNullParameter(str3, "description");
        this.setMin = str;
        this.setMax = str2;
        this.getMin = str3;
    }

    public final void getMin() {
        String str = this.setMin;
        this.setMin = str;
        View view = this.toFloatRange;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.collapseActionView);
        if (textView != null) {
            textView.setText(str);
        }
        this.setMax = this.setMax;
        Context context = this.equals;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        LinearLayoutCompat.DividerMode<setVerticalGravity> length = getOrientation.length(context, this.setMax);
        Intrinsics.checkNotNullExpressionValue(length, "LottieCompositionFactory…imationAssetRes\n        )");
        setVerticalGravity setverticalgravity = (setVerticalGravity) length.length;
        if (setverticalgravity != null) {
            View view2 = this.toFloatRange;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(resetInternal.setMax.getOptionalIconsVisible);
            if (lottieAnimationView != null) {
                lottieAnimationView.setComposition(setverticalgravity);
            }
            View view3 = this.toFloatRange;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view3.findViewById(resetInternal.setMax.getOptionalIconsVisible);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.playAnimation();
            }
        }
        String str2 = this.getMin;
        this.getMin = str2;
        View view4 = this.toFloatRange;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        TextView textView2 = (TextView) view4.findViewById(resetInternal.setMax.isTitleTruncated);
        if (textView2 != null) {
            textView2.setText(str2);
        }
    }

    @NotNull
    public final String setMin() {
        return this.setMin;
    }
}
