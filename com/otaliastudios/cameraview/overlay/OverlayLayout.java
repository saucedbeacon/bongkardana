package com.otaliastudios.cameraview.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.overlay.Overlay;
import o.calculateDyToMakeVisible;

@SuppressLint({"CustomViewStyleable"})
public class OverlayLayout extends FrameLayout implements Overlay {
    private static final String getMin;
    private static final CameraLogger setMax;
    @VisibleForTesting
    Overlay.Target currentTarget = Overlay.Target.PREVIEW;

    static {
        String simpleName = OverlayLayout.class.getSimpleName();
        getMin = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    public OverlayLayout(@NonNull Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public boolean isOverlay(@Nullable AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, calculateDyToMakeVisible.setMax.onExtraCallback);
        if (obtainStyledAttributes.hasValue(calculateDyToMakeVisible.setMax.IPostMessageService$Stub) || obtainStyledAttributes.hasValue(calculateDyToMakeVisible.setMax.ITrustedWebActivityCallback) || obtainStyledAttributes.hasValue(calculateDyToMakeVisible.setMax.ITrustedWebActivityCallback$Stub$Proxy)) {
            z = true;
        }
        obtainStyledAttributes.recycle();
        return z;
    }

    public boolean isOverlay(@NonNull ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        setMax.getMax(1, "normal draw called.");
        if (drawsOn(Overlay.Target.PREVIEW)) {
            drawOn(Overlay.Target.PREVIEW, canvas);
        }
    }

    public boolean drawsOn(@NonNull Overlay.Target target) {
        for (int i = 0; i < getChildCount(); i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).getMax(target)) {
                return true;
            }
        }
        return false;
    }

    public void drawOn(@NonNull Overlay.Target target, @NonNull Canvas canvas) {
        synchronized (this) {
            this.currentTarget = target;
            int i = AnonymousClass3.setMin[target.ordinal()];
            if (i == 1) {
                super.draw(canvas);
            } else if (i == 2 || i == 3) {
                canvas.save();
                float width = ((float) canvas.getWidth()) / ((float) getWidth());
                float height = ((float) canvas.getHeight()) / ((float) getHeight());
                CameraLogger cameraLogger = setMax;
                StringBuilder sb = new StringBuilder();
                sb.append(canvas.getWidth());
                sb.append("x");
                sb.append(canvas.getHeight());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getWidth());
                sb2.append("x");
                sb2.append(getHeight());
                cameraLogger.length("draw", "target:", target, "canvas:", sb.toString(), "view:", sb2.toString(), "widthScale:", Float.valueOf(width), "heightScale:", Float.valueOf(height));
                canvas.scale(width, height);
                dispatchDraw(canvas);
                canvas.restore();
            }
        }
    }

    /* renamed from: com.otaliastudios.cameraview.overlay.OverlayLayout$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.otaliastudios.cameraview.overlay.Overlay$Target[] r0 = com.otaliastudios.cameraview.overlay.Overlay.Target.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.otaliastudios.cameraview.overlay.Overlay$Target r1 = com.otaliastudios.cameraview.overlay.Overlay.Target.PREVIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.overlay.Overlay$Target r1 = com.otaliastudios.cameraview.overlay.Overlay.Target.VIDEO_SNAPSHOT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.otaliastudios.cameraview.overlay.Overlay$Target r1 = com.otaliastudios.cameraview.overlay.Overlay.Target.PICTURE_SNAPSHOT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.overlay.OverlayLayout.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.getMax(this.currentTarget)) {
            setMax.getMax(0, "Performing drawing for view:", view.getClass().getSimpleName(), "target:", this.currentTarget, "params:", layoutParams);
            return doDrawChild(canvas, view, j);
        }
        setMax.getMax(0, "Skipping drawing for view:", view.getClass().getSimpleName(), "target:", this.currentTarget, "params:", layoutParams);
        return false;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean doDrawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public boolean getMax = false;
        public boolean getMin = false;
        public boolean setMax = false;

        public LayoutParams(@NonNull Context context, @NonNull AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateDyToMakeVisible.setMax.onExtraCallback);
            try {
                this.getMax = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.IPostMessageService$Stub, false);
                this.getMin = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.ITrustedWebActivityCallback, false);
                this.setMax = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.ITrustedWebActivityCallback$Stub$Proxy, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public final boolean getMax(@NonNull Overlay.Target target) {
            if (target == Overlay.Target.PREVIEW && this.getMax) {
                return true;
            }
            if (target != Overlay.Target.VIDEO_SNAPSHOT || !this.setMax) {
                return target == Overlay.Target.PICTURE_SNAPSHOT && this.getMin;
            }
            return true;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append("[drawOnPreview:");
            sb.append(this.getMax);
            sb.append(",drawOnPictureSnapshot:");
            sb.append(this.getMin);
            sb.append(",drawOnVideoSnapshot:");
            sb.append(this.setMax);
            sb.append("]");
            return sb.toString();
        }
    }
}
