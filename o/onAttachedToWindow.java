package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class onAttachedToWindow {
    public final int FastBitmap$CoordinateSystem;
    @Nullable
    public final String IsOverlapping;
    public final int equals;
    @NonNull
    public final Executor getMax;
    @NonNull
    public final setSupportBackgroundTintMode getMin;
    private final boolean hashCode;
    @Nullable
    public final getSupportBackgroundTintMode isInside;
    @NonNull
    public final setAutoSizeTextTypeUniformWithConfiguration length;
    @NonNull
    public final Executor setMax;
    @NonNull
    public final onInitializeAccessibilityNodeInfo setMin;
    public final int toFloatRange;
    public final int toIntRange;

    public interface getMax {
        @NonNull
        onAttachedToWindow getWorkManagerConfiguration();
    }

    public static final class length {
        int IsOverlapping = Integer.MAX_VALUE;
        @Nullable
        String equals;
        public setAutoSizeTextTypeUniformWithConfiguration getMax;
        setSupportBackgroundTintMode getMin;
        public int isInside = 4;
        Executor length;
        Executor setMax;
        onInitializeAccessibilityNodeInfo setMin;
        int toDoubleRange = 20;
        int toFloatRange = 0;
        @Nullable
        getSupportBackgroundTintMode toIntRange;
    }

    public onAttachedToWindow(@NonNull length length2) {
        if (length2.setMax == null) {
            this.getMax = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
        } else {
            this.getMax = length2.setMax;
        }
        if (length2.length == null) {
            this.hashCode = true;
            this.setMax = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
        } else {
            this.hashCode = false;
            this.setMax = length2.length;
        }
        if (length2.getMax == null) {
            this.length = setAutoSizeTextTypeUniformWithConfiguration.getMin();
        } else {
            this.length = length2.getMax;
        }
        if (length2.getMin == null) {
            this.getMin = new setSupportBackgroundTintMode() {
            };
        } else {
            this.getMin = length2.getMin;
        }
        if (length2.setMin == null) {
            this.setMin = new setAutoSizeTextTypeWithDefaults();
        } else {
            this.setMin = length2.setMin;
        }
        this.toIntRange = length2.isInside;
        this.equals = length2.toFloatRange;
        this.toFloatRange = length2.IsOverlapping;
        this.FastBitmap$CoordinateSystem = length2.toDoubleRange;
        this.isInside = length2.toIntRange;
        this.IsOverlapping = length2.equals;
    }
}
