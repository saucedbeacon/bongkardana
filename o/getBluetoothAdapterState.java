package o;

import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TwoWheelOptionPickerDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\u001c\u0010\r\u001a\u00020\t*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0001\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0012\u0010\u0014\u001a\u00020\t*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0014\u001a\u00020\t*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0012\u0010\u0015\u001a\u00020\t*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f\u001a\n\u0010\u0018\u001a\u00020\t*\u00020\u0019\u001a\n\u0010\u001a\u001a\u00020\t*\u00020\u0019\u001a\u0014\u0010\u001b\u001a\u00020\t*\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u001a?\u0010\u001f\u001a\u00020\t*\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010$\u001a?\u0010\u001f\u001a\u00020\t*\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010%\u001a?\u0010&\u001a\u00020\t*\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010$\u001a?\u0010&\u001a\u00020\t*\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010%\u001a*\u0010'\u001a\u00020\t*\u00020(2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003\u001a*\u0010-\u001a\u00020\t*\u00020(2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0003\u001a'\u00102\u001a\u00020\t*\u00020\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00105\u001a'\u00102\u001a\u00020\t*\u00020\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u00106\u001a\u0012\u00107\u001a\u00020\t*\u0002082\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0012\u00109\u001a\u00020\t*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006:"}, d2 = {"dpToPx", "", "dp", "", "dpToPxOrNull", "(Ljava/lang/Float;)Ljava/lang/Integer;", "pxToDp", "px", "animateRotation", "", "Landroid/view/View;", "duration", "", "animateScaleLeftToRight", "visible", "", "visibilityView", "applyTint", "Landroid/graphics/drawable/Drawable;", "color", "elevate", "enableCollapse", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "enable", "greyscaleImage", "Landroid/widget/ImageView;", "removeGreyscale", "setAllOnClickListener", "Landroidx/constraintlayout/widget/Group;", "listener", "Landroid/view/View$OnClickListener;", "setMargins", "left", "top", "right", "bottom", "(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setPaddings", "setRoundedCorner", "Lcom/google/android/material/card/MaterialCardView;", "topLeftRadius", "topRightRadius", "bottomLeftRadius", "bottomRightRadius", "setRoundedCornerInDp", "topLeftRadiusInDp", "topRightRadiusInDp", "bottomLeftRadiusInDp", "bottomRightRadiusInDp", "setSize", "width", "height", "(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;)V", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toggleVisibility", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "toggleVisibilityInvisible", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getBluetoothAdapterState {
    public static /* synthetic */ void setMin(View view, Integer num, Integer num2, Integer num3, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        getMax(view, num, (Integer) null, num2, num3);
    }

    public static final void getMax(@NotNull View view, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(view, "$this$setMargins");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                marginLayoutParams.leftMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.topMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
            view.requestLayout();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static /* synthetic */ void getMin(View view, Float f, Float f2, Float f3, Float f4, int i) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        getMin(view, f, f2, f3, f4);
    }

    public static /* synthetic */ void getMax(View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        setMax(view, num, num2, num3, num4);
    }

    private static void setMax(@NotNull View view, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(view, "$this$setPaddings");
        view.setPadding(num != null ? num.intValue() : view.getPaddingLeft(), num2 != null ? num2.intValue() : view.getPaddingTop(), num3 != null ? num3.intValue() : view.getPaddingRight(), num4 != null ? num4.intValue() : view.getPaddingBottom());
    }

    public static /* synthetic */ void getMax(View view, Float f, Float f2, Float f3, int i) {
        Integer num;
        Integer num2;
        Integer num3;
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        Intrinsics.checkNotNullParameter(view, "$this$setPaddings");
        if (f != null) {
            float floatValue = f.floatValue();
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            num = Integer.valueOf((int) TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
        } else {
            num = null;
        }
        if (f2 != null) {
            float floatValue2 = f2.floatValue();
            Resources system2 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system2, "Resources.getSystem()");
            num2 = Integer.valueOf((int) TypedValue.applyDimension(1, floatValue2, system2.getDisplayMetrics()));
        } else {
            num2 = null;
        }
        if (f3 != null) {
            float floatValue3 = f3.floatValue();
            Resources system3 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system3, "Resources.getSystem()");
            num3 = Integer.valueOf((int) TypedValue.applyDimension(1, floatValue3, system3.getDisplayMetrics()));
        } else {
            num3 = null;
        }
        setMax(view, num, num2, num3, (Integer) null);
    }

    public static final void setMax(@NotNull View view, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(view, "$this$setSize");
        if (num != null) {
            view.getLayoutParams().width = num.intValue();
        }
        if (num2 != null) {
            view.getLayoutParams().height = num2.intValue();
        }
        view.requestLayout();
    }

    public static final Integer setMax(Float f) {
        if (f == null) {
            return null;
        }
        float floatValue = f.floatValue();
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return Integer.valueOf((int) TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
    }

    public static final void getMin(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$elevate");
        if (CornerMarkingDataProvider.length()) {
            view.setElevation((float) i);
            return;
        }
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        ViewCompat.setMax(view, TypedValue.applyDimension(0, (float) i, system.getDisplayMetrics()));
    }

    public static final void length(@NotNull View view, boolean z, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$animateScaleLeftToRight");
        if (view.getVisibility() == 0 && z) {
            return;
        }
        if (view.getVisibility() != 8 || z) {
            float f = z ? 0.0f : 1.0f;
            float f2 = z ? 1.0f : 0.0f;
            ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.0f, 1, 0.5f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setDuration(200);
            scaleAnimation.setAnimationListener(new length(view, z, i));
            view.startAnimation(scaleAnimation);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/extension/view/ViewExtKt$animateScaleLeftToRight$1$1", "Lid/dana/utils/AnimationUtil$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends TwoWheelOptionPickerDialog.OnOptionPickListener.setMax {
        final /* synthetic */ View getMax;
        final /* synthetic */ boolean length;
        final /* synthetic */ int setMax;

        length(View view, boolean z, int i) {
            this.getMax = view;
            this.length = z;
            this.setMax = i;
        }

        public final void onAnimationStart(@Nullable Animation animation) {
            this.getMax.setVisibility(this.length ? this.setMax : 0);
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            this.getMax.setVisibility(this.length ? 0 : this.setMax);
        }
    }

    public static final void getMax(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "$this$greyscaleImage");
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        imageView.setImageAlpha(200);
    }

    public static final void getMin(@NotNull View view, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4) {
        Integer num;
        Integer num2;
        Integer num3;
        Intrinsics.checkNotNullParameter(view, "$this$setMargins");
        Integer num4 = null;
        if (f != null) {
            float floatValue = f.floatValue();
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            num = Integer.valueOf((int) TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
        } else {
            num = null;
        }
        if (f2 != null) {
            float floatValue2 = f2.floatValue();
            Resources system2 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system2, "Resources.getSystem()");
            num2 = Integer.valueOf((int) TypedValue.applyDimension(1, floatValue2, system2.getDisplayMetrics()));
        } else {
            num2 = null;
        }
        if (f3 != null) {
            float floatValue3 = f3.floatValue();
            Resources system3 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system3, "Resources.getSystem()");
            num3 = Integer.valueOf((int) TypedValue.applyDimension(1, floatValue3, system3.getDisplayMetrics()));
        } else {
            num3 = null;
        }
        if (f4 != null) {
            float floatValue4 = f4.floatValue();
            Resources system4 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system4, "Resources.getSystem()");
            num4 = Integer.valueOf((int) TypedValue.applyDimension(1, floatValue4, system4.getDisplayMetrics()));
        }
        getMax(view, num, num2, num3, num4);
    }
}
