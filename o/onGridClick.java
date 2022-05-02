package o;

import android.annotation.SuppressLint;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\f\u0010\u0013\u001a\u00020\u0014*\u00020\tH\u0002J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0016H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/richview/animation/ClickToBounceAnimation;", "Landroid/view/View$OnTouchListener;", "clickListener", "Landroid/view/View$OnClickListener;", "shouldVibrate", "", "(Landroid/view/View$OnClickListener;Z)V", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "withinArea", "x", "", "y", "width", "", "height", "restoreAndInvalidate", "", "restoreView", "Landroid/view/ViewPropertyAnimator;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@SuppressLint({"ClickableViewAccessibility"})
public final class onGridClick implements View.OnTouchListener {
    @NotNull
    public static final getMax setMin = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public final View.OnClickListener getMax;
    /* access modifiers changed from: private */
    public final boolean length;

    @JvmOverloads
    public onGridClick() {
        this((byte) 0);
    }

    private static boolean getMax(float f, float f2, int i, int i2) {
        return f >= 0.0f && f2 >= 0.0f && f < ((float) i) && f2 < ((float) i2);
    }

    @JvmOverloads
    public onGridClick(@Nullable View.OnClickListener onClickListener, boolean z) {
        this.getMax = onClickListener;
        this.length = z;
    }

    private /* synthetic */ onGridClick(byte b) {
        this((View.OnClickListener) null, false);
    }

    public final boolean onTouch(@Nullable View view, @Nullable MotionEvent motionEvent) {
        float x = motionEvent != null ? motionEvent.getX() : 0.0f;
        float y = motionEvent != null ? motionEvent.getY() : 0.0f;
        if (view == null) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            ViewPropertyAnimator animate = view.animate();
            animate.scaleX(0.95f);
            animate.scaleY(0.95f);
            animate.setDuration(150);
            view.invalidate();
            return false;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (!getMax(x, y, width, height)) {
                return false;
            }
            ViewPropertyAnimator animate2 = view.animate();
            animate2.scaleX(1.0f);
            animate2.scaleY(1.0f);
            animate2.setDuration(100);
            animate2.withEndAction(new setMin(view, this, motionEvent, x, y, view));
            view.invalidate();
            return false;
        } else if (valueOf != null && valueOf.intValue() == 2) {
            if (x >= 0.0f && y >= 0.0f && x <= ((float) width) && y <= ((float) height)) {
                return false;
            }
            ViewPropertyAnimator animate3 = view.animate();
            Intrinsics.checkNotNullExpressionValue(animate3, "this.animate()");
            animate3.scaleX(1.0f);
            animate3.scaleY(1.0f);
            animate3.setDuration(100);
            view.invalidate();
            return false;
        } else if (valueOf == null || valueOf.intValue() != 3) {
            return false;
        } else {
            ViewPropertyAnimator animate4 = view.animate();
            Intrinsics.checkNotNullExpressionValue(animate4, "this.animate()");
            animate4.scaleX(1.0f);
            animate4.scaleY(1.0f);
            animate4.setDuration(100);
            view.invalidate();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "id/dana/richview/animation/ClickToBounceAnimation$onTouch$1$2$1", "id/dana/richview/animation/ClickToBounceAnimation$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ View equals;
        final /* synthetic */ float getMax;
        final /* synthetic */ float getMin;
        final /* synthetic */ onGridClick length;
        final /* synthetic */ MotionEvent setMax;
        final /* synthetic */ View setMin;

        setMin(View view, onGridClick ongridclick, MotionEvent motionEvent, float f, float f2, View view2) {
            this.setMin = view;
            this.length = ongridclick;
            this.setMax = motionEvent;
            this.getMin = f;
            this.getMax = f2;
            this.equals = view2;
        }

        public final void run() {
            if (this.length.length) {
                Vibrator vibrator = (Vibrator) this.equals.getContext().getSystemService("vibrator");
                if (CornerMarkingDataProvider.FastBitmap$CoordinateSystem()) {
                    vibrator.vibrate(VibrationEffect.createOneShot(25, -1));
                } else {
                    vibrator.vibrate(25);
                }
            }
            View.OnClickListener max = this.length.getMax;
            if (max != null) {
                max.onClick(this.setMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/richview/animation/ClickToBounceAnimation$Companion;", "", "()V", "VIBRATE_DURATION_MS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
