package id.dana.richview.imageview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onConfigurationChanged;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 l2\u00020\u0001:\u0002lmB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u00102\u001a\u0004\u0018\u00010\"2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\fH\u0002J\u001a\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,2\b\b\u0002\u00108\u001a\u00020\u0007H\u0002J\b\u00109\u001a\u000206H\u0002J\b\u0010:\u001a\u000206H\u0002J\b\u0010;\u001a\u000206H\u0002J\b\u0010<\u001a\u000206H\u0002J\b\u0010=\u001a\u00020\u0011H\u0002J\b\u0010>\u001a\u000206H\u0002J\b\u0010?\u001a\u00020\fH\u0002J\b\u0010@\u001a\u00020\fH\u0002J\u0018\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\fH\u0002J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\f2\u0006\u0010F\u001a\u00020\fH\u0002J\b\u0010G\u001a\u000206H\u0002J\u0010\u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020JH\u0002J\u0018\u0010K\u001a\u0002062\u0006\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u00020\fH\u0002J\u0018\u0010N\u001a\u0002062\u0006\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u00020\fH\u0002J\b\u0010O\u001a\u00020\u0011H\u0002J\u0012\u0010P\u001a\u00020\u00112\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0010\u0010Q\u001a\u0002062\u0006\u0010I\u001a\u00020JH\u0002J\u0006\u0010R\u001a\u000206J\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u000206H\u0002J\u000e\u0010V\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010W\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u0007J\u0010\u0010X\u001a\u0002062\u0006\u0010Y\u001a\u00020\u0011H\u0016J\u0012\u0010Z\u001a\u0002062\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\u0012\u0010]\u001a\u0002062\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J\u0010\u0010`\u001a\u0002062\u0006\u0010a\u001a\u00020\u0007H\u0016J\u0012\u0010b\u001a\u0002062\b\u0010c\u001a\u0004\u0018\u00010dH\u0016J\u0016\u0010e\u001a\u0002062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fJ\u0012\u0010f\u001a\u0002062\b\u0010g\u001a\u0004\u0018\u00010/H\u0016J\b\u0010h\u001a\u000206H\u0002J\u0010\u0010i\u001a\u0002062\u0006\u0010j\u001a\u00020\u001dH\u0002J\b\u0010k\u001a\u000206H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lid/dana/richview/imageview/ZoomableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bounds", "Landroid/graphics/RectF;", "calculatedMaxScale", "", "calculatedMinScale", "currentPointerCount", "currentScaleFactor", "doubleTapDetected", "", "doubleTapToZoomScaleFactor", "durationAnimationReset", "gestureDetector", "Landroid/view/GestureDetector;", "gestureListener", "Landroid/view/GestureDetector$OnGestureListener;", "getGestureListener", "()Landroid/view/GestureDetector$OnGestureListener;", "last", "Landroid/graphics/PointF;", "matrixValues", "", "maxScale", "minScale", "previousPointerCount", "resetAnimator", "Landroid/animation/ValueAnimator;", "scaleBy", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "scaleGestureListener", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "getScaleGestureListener", "()Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "singleTapDetected", "startMatrix", "Landroid/graphics/Matrix;", "startScale", "startScaleType", "Landroid/widget/ImageView$ScaleType;", "startValues", "tempMatrix", "animateMatrixIndex", "index", "to", "animateScaleAndTranslationToMatrix", "", "targetMatrix", "duration", "animateToStartMatrix", "animateTranslationX", "animateTranslationY", "center", "disallowParentTouch", "forceScaleTypeToMatrix", "getCurrentDisplayedHeight", "getCurrentDisplayedWidth", "getXDistance", "toX", "fromX", "getYDistance", "toY", "fromY", "handleDoubleTap", "handleTouchActionWhichNotDoubleTapOrSingleTap", "event", "Landroid/view/MotionEvent;", "handleTranslationCameraAfterZoomed", "focusX", "focusY", "handleZoom", "isAnimating", "onTouchEvent", "registerTheMotionEventToDetector", "reset", "resetImage", "", "resetStartValues", "setDoubleTapToZoomScaleFactor", "setDurationAnimationReset", "setEnabled", "enabled", "setImageBitmap", "bm", "Landroid/graphics/Bitmap;", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "setScaleRange", "setScaleType", "scaleType", "setStartValues", "updateBounds", "values", "verifyScaleRange", "Companion", "SimpleAnimatorListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ZoomableImageView extends AppCompatImageView {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    private Matrix FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public boolean Grayscale$Algorithm;
    private HashMap ICustomTabsCallback;
    private GestureDetector IsOverlapping;
    private int Mean$Arithmetic;
    private int create;
    private Matrix equals;
    private float getCause;
    private float getMax;
    private ScaleGestureDetector getMin;
    private PointF hashCode;
    /* access modifiers changed from: private */
    public boolean invoke;
    /* access modifiers changed from: private */
    public float invokeSuspend;
    private final RectF isInside;
    /* access modifiers changed from: private */
    public float length;
    private int onNavigationEvent;
    /* access modifiers changed from: private */
    public float setMax;
    private float setMin;
    /* access modifiers changed from: private */
    public float[] toDoubleRange;
    private ValueAnimator toFloatRange;
    private ImageView.ScaleType toIntRange;
    private float[] toString;
    /* access modifiers changed from: private */
    public float valueOf;
    private float values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lid/dana/richview/imageview/ZoomableImageView$SimpleAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "()V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static class getMax implements Animator.AnimatorListener {
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }
    }

    @JvmOverloads
    public ZoomableImageView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ZoomableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.ICustomTabsCallback;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.ICustomTabsCallback == null) {
            this.ICustomTabsCallback = new HashMap();
        }
        View view = (View) this.ICustomTabsCallback.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.ICustomTabsCallback.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZoomableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ZoomableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = 0.95f;
        this.getMax = 10.0f;
        this.setMax = 0.95f;
        this.length = 10.0f;
        this.getMin = new ScaleGestureDetector(context, new toIntRange(this));
        this.IsOverlapping = new GestureDetector(context, new IsOverlapping(this));
        this.isInside = new RectF();
        this.equals = new Matrix();
        this.FastBitmap$CoordinateSystem = new Matrix();
        this.toDoubleRange = new float[9];
        this.hashCode = new PointF(0.0f, 0.0f);
        this.values = 3.0f;
        this.valueOf = 1.0f;
        this.invokeSuspend = 1.0f;
        this.onNavigationEvent = 1;
        this.getCause = 1.0f;
        this.create = 200;
        onConfigurationChanged.setMin(this.getMin, false);
        ImageView.ScaleType scaleType = getScaleType();
        Intrinsics.checkNotNullExpressionValue(scaleType, "scaleType");
        this.toIntRange = scaleType;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.from);
        if (obtainStyledAttributes != null) {
            this.setMin = obtainStyledAttributes.getFloat(2, 0.95f);
            this.getMax = obtainStyledAttributes.getFloat(1, 10.0f);
            this.values = obtainStyledAttributes.getFloat(0, 3.0f);
            getMax();
            obtainStyledAttributes.recycle();
        }
    }

    private final void getMax() {
        boolean z = true;
        if (this.setMin < this.getMax) {
            if (this.setMin >= 0.0f) {
                if (this.getMax < 0.0f) {
                    z = false;
                }
                if (z) {
                    float f = this.values;
                    float f2 = this.getMax;
                    if (f > f2) {
                        this.values = f2;
                    }
                    float f3 = this.values;
                    float f4 = this.setMin;
                    if (f3 < f4) {
                        this.values = f4;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("maxScale must be greater than 0".toString());
            }
            throw new IllegalStateException("minScale must be greater than 0".toString());
        }
        throw new IllegalStateException("minScale must be less than maxScale".toString());
    }

    public final void setScaleRange(float f, float f2) {
        this.setMin = f;
        this.getMax = f2;
        this.toString = null;
        getMax();
    }

    public final void setDoubleTapToZoomScaleFactor(float f) {
        this.values = f;
        getMax();
    }

    public final void setDurationAnimationReset(int i) {
        if (i <= 0) {
            this.create = i;
            return;
        }
        throw new IllegalStateException("durationAnimationReset must be greater than 0".toString());
    }

    public final void setScaleType(@Nullable ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.toIntRange = scaleType;
            this.toString = null;
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            setScaleType(this.toIntRange);
        }
    }

    public final void setImageResource(int i) {
        super.setImageResource(i);
        setScaleType(this.toIntRange);
    }

    public final void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.toIntRange);
    }

    public final void setImageBitmap(@Nullable Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setScaleType(this.toIntRange);
    }

    public final void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.toIntRange);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        if (r2 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ba, code lost:
        if (r2 == null) goto L_0x01bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(@org.jetbrains.annotations.Nullable android.view.MotionEvent r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x02c7
            boolean r0 = r13.isClickable()
            if (r0 != 0) goto L_0x02c7
            boolean r0 = r13.isEnabled()
            if (r0 == 0) goto L_0x02c7
            android.widget.ImageView$ScaleType r0 = r13.getScaleType()
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            if (r0 == r1) goto L_0x001b
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            super.setScaleType(r0)
        L_0x001b:
            float[] r0 = r13.toString
            r1 = 0
            if (r0 != 0) goto L_0x004a
            r0 = 9
            float[] r0 = new float[r0]
            r13.toString = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r2 = r13.getImageMatrix()
            r0.<init>(r2)
            r13.equals = r0
            float[] r2 = r13.toString
            r0.getValues(r2)
            float[] r0 = r13.toString
            if (r0 == 0) goto L_0x004a
            float r2 = r13.setMin
            r3 = r0[r1]
            float r2 = r2 * r3
            r13.setMax = r2
            float r2 = r13.getMax
            r0 = r0[r1]
            float r2 = r2 * r0
            r13.length = r2
        L_0x004a:
            int r0 = r14.getPointerCount()
            r13.Mean$Arithmetic = r0
            android.graphics.Matrix r0 = r13.FastBitmap$CoordinateSystem
            android.graphics.Matrix r2 = r13.getImageMatrix()
            r0.set(r2)
            android.graphics.Matrix r0 = r13.FastBitmap$CoordinateSystem
            float[] r2 = r13.toDoubleRange
            r0.getValues(r2)
            float[] r0 = r13.toDoubleRange
            android.graphics.drawable.Drawable r2 = r13.getDrawable()
            r3 = 4
            r4 = 5
            r5 = 2
            if (r2 == 0) goto L_0x008c
            android.graphics.RectF r6 = r13.isInside
            r7 = r0[r5]
            r8 = r0[r4]
            int r9 = r2.getIntrinsicWidth()
            float r9 = (float) r9
            r10 = r0[r1]
            float r9 = r9 * r10
            r10 = r0[r5]
            float r9 = r9 + r10
            int r2 = r2.getIntrinsicHeight()
            float r2 = (float) r2
            r10 = r0[r3]
            float r2 = r2 * r10
            r0 = r0[r4]
            float r2 = r2 + r0
            r6.set(r7, r8, r9, r2)
        L_0x008c:
            android.view.ScaleGestureDetector r0 = r13.getMin
            r0.onTouchEvent(r14)
            android.view.GestureDetector r0 = r13.IsOverlapping
            r0.onTouchEvent(r14)
            boolean r0 = r13.invoke
            r2 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00dc
            r13.invoke = r1
            r13.Grayscale$Algorithm = r1
            float[] r14 = r13.toString
            if (r14 == 0) goto L_0x00b9
            float[] r0 = r13.toDoubleRange
            r0 = r0[r1]
            float r3 = r13.length
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00af
            r1 = 1
        L_0x00af:
            if (r1 == 0) goto L_0x00b2
            r2 = r14
        L_0x00b2:
            if (r2 == 0) goto L_0x00b9
            r13.reset()
            if (r2 != 0) goto L_0x00db
        L_0x00b9:
            r14 = r13
            id.dana.richview.imageview.ZoomableImageView r14 = (id.dana.richview.imageview.ZoomableImageView) r14
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r1 = r14.FastBitmap$CoordinateSystem
            r0.<init>(r1)
            float r1 = r14.values
            android.view.ScaleGestureDetector r2 = r14.getMin
            float r2 = r2.getFocusX()
            android.view.ScaleGestureDetector r3 = r14.getMin
            float r3 = r3.getFocusY()
            r0.postScale(r1, r1, r2, r3)
            int r1 = r14.create
            r14.getMin((android.graphics.Matrix) r0, (int) r1)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x00db:
            return r6
        L_0x00dc:
            boolean r0 = r13.Grayscale$Algorithm
            if (r0 != 0) goto L_0x02b7
            int r0 = r14.getActionMasked()
            r7 = 0
            if (r0 == 0) goto L_0x017f
            int r0 = r13.Mean$Arithmetic
            int r8 = r13.onNavigationEvent
            if (r0 == r8) goto L_0x00ef
            goto L_0x017f
        L_0x00ef:
            int r0 = r14.getActionMasked()
            if (r5 != r0) goto L_0x0190
            android.view.ScaleGestureDetector r0 = r13.getMin
            float r0 = r0.getFocusX()
            android.view.ScaleGestureDetector r8 = r13.getMin
            float r8 = r8.getFocusY()
            android.graphics.PointF r9 = r13.hashCode
            float r9 = r9.x
            float r9 = r0 - r9
            android.graphics.RectF r10 = r13.isInside
            float r10 = r10.right
            float r10 = r10 + r9
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x0116
            android.graphics.RectF r9 = r13.isInside
            float r9 = r9.right
            float r9 = -r9
            goto L_0x012e
        L_0x0116:
            android.graphics.RectF r10 = r13.isInside
            float r10 = r10.left
            float r10 = r10 + r9
            int r11 = r13.getWidth()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x012e
            int r9 = r13.getWidth()
            float r9 = (float) r9
            android.graphics.RectF r10 = r13.isInside
            float r10 = r10.left
            float r9 = r9 - r10
        L_0x012e:
            android.graphics.PointF r10 = r13.hashCode
            float r10 = r10.y
            float r10 = r8 - r10
            android.graphics.RectF r11 = r13.isInside
            float r11 = r11.bottom
            float r11 = r11 + r10
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0143
            android.graphics.RectF r10 = r13.isInside
            float r10 = r10.bottom
            float r10 = -r10
            goto L_0x015b
        L_0x0143:
            android.graphics.RectF r11 = r13.isInside
            float r11 = r11.top
            float r11 = r11 + r10
            int r12 = r13.getHeight()
            float r12 = (float) r12
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x015b
            int r10 = r13.getHeight()
            float r10 = (float) r10
            android.graphics.RectF r11 = r13.isInside
            float r11 = r11.top
            float r10 = r10 - r11
        L_0x015b:
            android.graphics.Matrix r11 = r13.FastBitmap$CoordinateSystem
            r11.postTranslate(r9, r10)
            android.graphics.Matrix r9 = r13.FastBitmap$CoordinateSystem
            float r10 = r13.valueOf
            r9.postScale(r10, r10, r0, r8)
            float[] r9 = r13.toString
            if (r9 == 0) goto L_0x0174
            float[] r10 = r13.toDoubleRange
            r10 = r10[r1]
            r9 = r9[r1]
            float r10 = r10 / r9
            r13.getCause = r10
        L_0x0174:
            android.graphics.Matrix r9 = r13.FastBitmap$CoordinateSystem
            r13.setImageMatrix(r9)
            android.graphics.PointF r9 = r13.hashCode
            r9.set(r0, r8)
            goto L_0x0190
        L_0x017f:
            android.graphics.PointF r0 = r13.hashCode
            android.view.ScaleGestureDetector r8 = r13.getMin
            float r8 = r8.getFocusX()
            android.view.ScaleGestureDetector r9 = r13.getMin
            float r9 = r9.getFocusY()
            r0.set(r8, r9)
        L_0x0190:
            int r0 = r14.getActionMasked()
            if (r6 == r0) goto L_0x019d
            r0 = 3
            int r14 = r14.getActionMasked()
            if (r0 != r14) goto L_0x02b7
        L_0x019d:
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.valueOf = r14
            float[] r14 = r13.toString
            if (r14 == 0) goto L_0x01bc
            float[] r0 = r13.toDoubleRange
            r0 = r0[r1]
            r8 = r14[r1]
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x01b1
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r0 == 0) goto L_0x01b5
            r2 = r14
        L_0x01b5:
            if (r2 == 0) goto L_0x01bc
            r13.reset()
            if (r2 != 0) goto L_0x02b7
        L_0x01bc:
            r14 = r13
            id.dana.richview.imageview.ZoomableImageView r14 = (id.dana.richview.imageview.ZoomableImageView) r14
            android.graphics.drawable.Drawable r0 = r14.getDrawable()
            java.lang.String r2 = "drawable"
            if (r0 == 0) goto L_0x01da
            android.graphics.drawable.Drawable r0 = r14.getDrawable()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float[] r8 = r14.toDoubleRange
            r1 = r8[r1]
            float r0 = r0 * r1
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            int r1 = r14.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0210
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.left
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f0
            r14.getMin((int) r5, (float) r7)
            goto L_0x023b
        L_0x01f0:
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.right
            int r1 = r14.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x023b
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.left
            int r1 = r14.getWidth()
            float r1 = (float) r1
            float r0 = r0 + r1
            android.graphics.RectF r1 = r14.isInside
            float r1 = r1.right
            float r0 = r0 - r1
            r14.getMin((int) r5, (float) r0)
            goto L_0x023b
        L_0x0210:
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.left
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x021c
            r14.getMin((int) r5, (float) r7)
            goto L_0x023b
        L_0x021c:
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.right
            int r1 = r14.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x023b
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.left
            int r1 = r14.getWidth()
            float r1 = (float) r1
            float r0 = r0 + r1
            android.graphics.RectF r1 = r14.isInside
            float r1 = r1.right
            float r0 = r0 - r1
            r14.getMin((int) r5, (float) r0)
        L_0x023b:
            android.graphics.drawable.Drawable r0 = r14.getDrawable()
            if (r0 == 0) goto L_0x0254
            android.graphics.drawable.Drawable r0 = r14.getDrawable()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float[] r1 = r14.toDoubleRange
            r1 = r1[r3]
            float r0 = r0 * r1
            goto L_0x0255
        L_0x0254:
            r0 = 0
        L_0x0255:
            int r1 = r14.getHeight()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x028a
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.top
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x026a
            r14.getMin((int) r4, (float) r7)
            goto L_0x02b5
        L_0x026a:
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.bottom
            int r1 = r14.getHeight()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b5
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.top
            int r1 = r14.getHeight()
            float r1 = (float) r1
            float r0 = r0 + r1
            android.graphics.RectF r1 = r14.isInside
            float r1 = r1.bottom
            float r0 = r0 - r1
            r14.getMin((int) r4, (float) r0)
            goto L_0x02b5
        L_0x028a:
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.top
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0296
            r14.getMin((int) r4, (float) r7)
            goto L_0x02b5
        L_0x0296:
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.bottom
            int r1 = r14.getHeight()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b5
            android.graphics.RectF r0 = r14.isInside
            float r0 = r0.top
            int r1 = r14.getHeight()
            float r1 = (float) r1
            float r0 = r0 + r1
            android.graphics.RectF r1 = r14.isInside
            float r1 = r1.bottom
            float r0 = r0 - r1
            r14.getMin((int) r4, (float) r0)
        L_0x02b5:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x02b7:
            android.view.ViewParent r14 = r13.getParent()
            boolean r0 = r13.getMin()
            r14.requestDisallowInterceptTouchEvent(r0)
            int r14 = r13.Mean$Arithmetic
            r13.onNavigationEvent = r14
            return r6
        L_0x02c7:
            boolean r14 = super.onTouchEvent(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.imageview.ZoomableImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final boolean getMin() {
        return this.Mean$Arithmetic > 1 || this.getCause > 1.0f || setMax();
    }

    private final boolean setMax() {
        ValueAnimator valueAnimator = this.toFloatRange;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    static /* synthetic */ void animateScaleAndTranslationToMatrix$default(ZoomableImageView zoomableImageView, Matrix matrix, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 200;
        }
        zoomableImageView.getMin(matrix, i);
    }

    private final void getMin(Matrix matrix, int i) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix(getImageMatrix());
        matrix2.getValues(this.toDoubleRange);
        float f = fArr[0];
        float[] fArr2 = this.toDoubleRange;
        float f2 = f - fArr2[0];
        float f3 = fArr[4] - fArr2[4];
        float f4 = fArr[2] - fArr2[2];
        float f5 = fArr[5] - fArr2[5];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (ofFloat != null) {
            Matrix matrix3 = matrix2;
            float f6 = f4;
            float f7 = f5;
            float f8 = f2;
            float f9 = f3;
            Matrix matrix4 = matrix;
            ValueAnimator valueAnimator = ofFloat;
            int i2 = i;
            valueAnimator.addUpdateListener(new length(this, matrix3, f6, f7, f8, f9, matrix4, i2));
            valueAnimator.addListener(new setMax(this, matrix3, f6, f7, f8, f9, matrix4, i2));
            valueAnimator.setDuration((long) i);
            valueAnimator.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e¸\u0006\u0000"}, d2 = {"id/dana/richview/imageview/ZoomableImageView$animateScaleAndTranslationToMatrix$1$1", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "activeMatrix", "Landroid/graphics/Matrix;", "getActiveMatrix", "()Landroid/graphics/Matrix;", "values", "", "getValues", "()[F", "onAnimationUpdate", "", "animation", "Landroid/animation/ValueAnimator;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ Matrix IsOverlapping;
        final /* synthetic */ float equals;
        final /* synthetic */ ZoomableImageView getMax;
        final /* synthetic */ float getMin;
        final /* synthetic */ int isInside;
        final /* synthetic */ float length;
        final /* synthetic */ float setMax;
        final /* synthetic */ Matrix setMin;
        @NotNull
        private final float[] toFloatRange = new float[9];
        @NotNull
        private final Matrix toIntRange = new Matrix(this.getMax.getImageMatrix());

        length(ZoomableImageView zoomableImageView, Matrix matrix, float f, float f2, float f3, float f4, Matrix matrix2, int i) {
            this.getMax = zoomableImageView;
            this.setMin = matrix;
            this.length = f;
            this.getMin = f2;
            this.setMax = f3;
            this.equals = f4;
            this.IsOverlapping = matrix2;
            this.isInside = i;
        }

        public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.toIntRange.set(this.setMin);
                this.toIntRange.getValues(this.toFloatRange);
                float[] fArr = this.toFloatRange;
                fArr[2] = fArr[2] + (this.length * floatValue);
                fArr[5] = fArr[5] + (this.getMin * floatValue);
                fArr[0] = fArr[0] + (this.setMax * floatValue);
                fArr[4] = fArr[4] + (this.equals * floatValue);
                this.toIntRange.setValues(fArr);
                this.getMax.setImageMatrix(this.toIntRange);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"id/dana/richview/imageview/ZoomableImageView$animateScaleAndTranslationToMatrix$1$2", "Lid/dana/richview/imageview/ZoomableImageView$SimpleAnimatorListener;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends getMax {
        final /* synthetic */ Matrix equals;
        final /* synthetic */ float getMax;
        final /* synthetic */ float getMin;
        final /* synthetic */ int isInside;
        final /* synthetic */ float length;
        final /* synthetic */ ZoomableImageView setMax;
        final /* synthetic */ Matrix setMin;
        final /* synthetic */ float toFloatRange;

        setMax(ZoomableImageView zoomableImageView, Matrix matrix, float f, float f2, float f3, float f4, Matrix matrix2, int i) {
            this.setMax = zoomableImageView;
            this.setMin = matrix;
            this.length = f;
            this.getMax = f2;
            this.getMin = f3;
            this.toFloatRange = f4;
            this.equals = matrix2;
            this.isInside = i;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            this.setMax.setImageMatrix(this.equals);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"id/dana/richview/imageview/ZoomableImageView$animateMatrixIndex$1$1", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "current", "Landroid/graphics/Matrix;", "getCurrent", "()Landroid/graphics/Matrix;", "setCurrent", "(Landroid/graphics/Matrix;)V", "values", "", "getValues", "()[F", "onAnimationUpdate", "", "animation", "Landroid/animation/ValueAnimator;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ ZoomableImageView getMax;
        final /* synthetic */ int getMin;
        @NotNull
        private final float[] setMax = new float[9];
        @NotNull
        private Matrix setMin = new Matrix();

        getMin(ZoomableImageView zoomableImageView, int i) {
            this.getMax = zoomableImageView;
            this.getMin = i;
        }

        public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "animation");
            this.setMin.set(this.getMax.getImageMatrix());
            this.setMin.getValues(this.setMax);
            float[] fArr = this.setMax;
            int i = this.getMin;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                fArr[i] = ((Float) animatedValue).floatValue();
                this.setMin.setValues(this.setMax);
                this.getMax.setImageMatrix(this.setMin);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    private final ValueAnimator getMin(int i, float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.toDoubleRange[i], f});
        if (ofFloat == null) {
            return null;
        }
        ofFloat.addUpdateListener(new getMin(this, i));
        ofFloat.setDuration((long) this.create);
        ofFloat.start();
        return ofFloat;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"id/dana/richview/imageview/ZoomableImageView$scaleGestureListener$1", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        final /* synthetic */ ZoomableImageView setMin;

        toIntRange(ZoomableImageView zoomableImageView) {
            this.setMin = zoomableImageView;
        }

        public final boolean onScaleBegin(@Nullable ScaleGestureDetector scaleGestureDetector) {
            ZoomableImageView zoomableImageView = this.setMin;
            zoomableImageView.invokeSuspend = zoomableImageView.toDoubleRange[0];
            return true;
        }

        public final void onScaleEnd(@Nullable ScaleGestureDetector scaleGestureDetector) {
            this.setMin.valueOf = 1.0f;
        }

        public final boolean onScale(@Nullable ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector == null) {
                return super.onScale(scaleGestureDetector);
            }
            ZoomableImageView zoomableImageView = this.setMin;
            zoomableImageView.valueOf = (zoomableImageView.invokeSuspend * scaleGestureDetector.getScaleFactor()) / this.setMin.toDoubleRange[0];
            float access$getScaleBy$p = this.setMin.valueOf * this.setMin.toDoubleRange[0];
            if (access$getScaleBy$p < this.setMin.setMax) {
                ZoomableImageView zoomableImageView2 = this.setMin;
                zoomableImageView2.valueOf = zoomableImageView2.setMax / this.setMin.toDoubleRange[0];
            } else if (access$getScaleBy$p > this.setMin.length) {
                ZoomableImageView zoomableImageView3 = this.setMin;
                zoomableImageView3.valueOf = zoomableImageView3.length / this.setMin.toDoubleRange[0];
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"id/dana/richview/imageview/ZoomableImageView$gestureListener$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onDoubleTapEvent", "", "e", "Landroid/view/MotionEvent;", "onDown", "onSingleTapConfirmed", "onSingleTapUp", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ ZoomableImageView setMin;

        public final boolean onDown(@Nullable MotionEvent motionEvent) {
            return true;
        }

        IsOverlapping(ZoomableImageView zoomableImageView) {
            this.setMin = zoomableImageView;
        }

        public final boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
            this.setMin.Grayscale$Algorithm = true;
            return false;
        }

        public final boolean onSingleTapConfirmed(@Nullable MotionEvent motionEvent) {
            this.setMin.Grayscale$Algorithm = false;
            return false;
        }

        public final boolean onDoubleTapEvent(@Nullable MotionEvent motionEvent) {
            if (motionEvent != null && 1 == motionEvent.getAction()) {
                this.setMin.invoke = true;
            }
            this.setMin.Grayscale$Algorithm = false;
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/richview/imageview/ZoomableImageView$Companion;", "", "()V", "DEFAULT_DURATION_ANIMATION_RESET", "", "DEFAULT_SCALE", "", "DEFAULT_ZOOM_SCALE_DOUBLE_TAP_FACTOR", "MAX_SCALE", "MIN_SCALE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void reset() {
        getMin(this.equals, this.create);
    }
}
