package com.otaliastudios.cameraview.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.otaliastudios.cameraview.controls.Grid;

public class GridLinesLayout extends View {
    public static final int DEFAULT_COLOR = Color.argb(BlobStatic.MONITOR_IMAGE_WIDTH, 255, 255, 255);
    @VisibleForTesting
    getMax callback;
    private final float getMax;
    private ColorDrawable getMin;
    private Grid length;
    private int setMax;
    private ColorDrawable setMin;

    interface getMax {
    }

    public GridLinesLayout(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public GridLinesLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setMax = DEFAULT_COLOR;
        this.getMin = new ColorDrawable(this.setMax);
        this.setMin = new ColorDrawable(this.setMax);
        this.getMax = TypedValue.applyDimension(1, 0.9f, context.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.getMin.setBounds(i, 0, i3, (int) this.getMax);
        this.setMin.setBounds(0, i2, (int) this.getMax, i4);
    }

    @NonNull
    public Grid getGridMode() {
        return this.length;
    }

    public void setGridMode(@NonNull Grid grid) {
        this.length = grid;
        postInvalidate();
    }

    public int getGridColor() {
        return this.setMax;
    }

    public void setGridColor(@ColorInt int i) {
        this.setMax = i;
        this.getMin.setColor(i);
        this.setMin.setColor(i);
        postInvalidate();
    }

    /* renamed from: com.otaliastudios.cameraview.internal.GridLinesLayout$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.otaliastudios.cameraview.controls.Grid[] r0 = com.otaliastudios.cameraview.controls.Grid.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                com.otaliastudios.cameraview.controls.Grid r1 = com.otaliastudios.cameraview.controls.Grid.OFF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.controls.Grid r1 = com.otaliastudios.cameraview.controls.Grid.DRAW_3X3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.otaliastudios.cameraview.controls.Grid r1 = com.otaliastudios.cameraview.controls.Grid.DRAW_PHI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.otaliastudios.cameraview.controls.Grid r1 = com.otaliastudios.cameraview.controls.Grid.DRAW_4X4     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.internal.GridLinesLayout.AnonymousClass3.<clinit>():void");
        }
    }

    private int getMin() {
        int i = AnonymousClass3.getMin[this.length.ordinal()];
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 0 : 3;
    }

    /* access modifiers changed from: protected */
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int min = getMin();
        int i = 0;
        while (i < min) {
            float min2 = this.length == Grid.DRAW_PHI ? i == 1 ? 0.38196602f : 0.618034f : (1.0f / ((float) (getMin() + 1))) * (((float) i) + 1.0f);
            canvas.translate(0.0f, ((float) getHeight()) * min2);
            this.getMin.draw(canvas);
            float f = -min2;
            canvas.translate(0.0f, ((float) getHeight()) * f);
            canvas.translate(min2 * ((float) getWidth()), 0.0f);
            this.setMin.draw(canvas);
            canvas.translate(f * ((float) getWidth()), 0.0f);
            i++;
        }
    }
}
