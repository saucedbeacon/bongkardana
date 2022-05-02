package o;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

public final class getStartState implements rebuildScene {
    private static final Bitmap.Config length = Bitmap.Config.ARGB_8888;
    private int IsOverlapping;
    private long equals;
    private final length getMax;
    private final getTargetPosition getMin;
    private int hashCode;
    private int isInside;
    private final long setMax;
    private final Set<Bitmap.Config> setMin;
    private long toFloatRange;
    private int toIntRange;

    interface length {
    }

    private getStartState(long j, getTargetPosition gettargetposition, Set<Bitmap.Config> set) {
        this.setMax = j;
        this.equals = j;
        this.getMin = gettargetposition;
        this.setMin = set;
        this.getMax = new getMin();
    }

    public final synchronized void setMin(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.getMin.getMax(bitmap)) <= this.equals) {
                        if (this.setMin.contains(bitmap.getConfig())) {
                            int max = this.getMin.getMax(bitmap);
                            this.getMin.length(bitmap);
                            this.toIntRange++;
                            this.toFloatRange += (long) max;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                this.getMin.setMin(bitmap);
                            }
                            getMin(this.equals);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.getMin.setMin(bitmap);
                        bitmap.isMutable();
                        this.setMin.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    @NonNull
    public final Bitmap setMin(int i, int i2, Bitmap.Config config) {
        Bitmap max = getMax(i, i2, config);
        if (max != null) {
            max.eraseColor(0);
            return max;
        }
        if (config == null) {
            config = length;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @NonNull
    public final Bitmap setMax(int i, int i2, Bitmap.Config config) {
        Bitmap max = getMax(i, i2, config);
        if (max != null) {
            return max;
        }
        if (config == null) {
            config = length;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final void getMax() {
        getMin(0);
    }

    @SuppressLint({"InlinedApi"})
    public final void setMin(int i) {
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            getMin(0);
        } else if (i >= 20 || i == 15) {
            getMin(this.equals / 2);
        }
    }

    private synchronized void getMin(long j) {
        while (this.toFloatRange > j) {
            Bitmap length2 = this.getMin.length();
            if (length2 == null) {
                this.toFloatRange = 0;
                return;
            }
            this.toFloatRange -= (long) this.getMin.getMax(length2);
            this.hashCode++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.getMin.setMin(length2);
            }
            length2.recycle();
        }
    }

    static final class getMin implements length {
        getMin() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getStartState(long r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000c
            o.getTransition r0 = new o.getTransition
            r0.<init>()
            goto L_0x0011
        L_0x000c:
            o.getConstraintSet r0 = new o.getConstraintSet
            r0.<init>()
        L_0x0011:
            java.util.HashSet r2 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r3 = android.graphics.Bitmap.Config.values()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L_0x0026
            r1 = 0
            r2.add(r1)
        L_0x0026:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0031
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            r2.remove(r1)
        L_0x0031:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStartState.<init>(long):void");
    }

    @Nullable
    private synchronized Bitmap getMax(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap max;
        if (Build.VERSION.SDK_INT >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                StringBuilder sb = new StringBuilder("Cannot create a mutable Bitmap with config: ");
                sb.append(config);
                sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        max = this.getMin.setMax(i, i2, config != null ? config : length);
        if (max == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.getMin.getMax(i, i2, config);
            }
            this.IsOverlapping++;
        } else {
            this.isInside++;
            this.toFloatRange -= (long) this.getMin.getMax(max);
            max.setHasAlpha(true);
            if (Build.VERSION.SDK_INT >= 19) {
                max.setPremultiplied(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            this.getMin.getMax(i, i2, config);
        }
        return max;
    }
}
