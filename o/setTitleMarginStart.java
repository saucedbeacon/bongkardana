package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

public final class setTitleMarginStart {
    private static float IsOverlapping = -1.0f;
    private static final ThreadLocal<float[]> getMax = new ThreadLocal<float[]>() {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new float[4];
        }
    };
    private static final float getMin = ((float) (Math.sqrt(2.0d) / 2.0d));
    private static final ThreadLocal<PathMeasure> length = new ThreadLocal<PathMeasure>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> setMax = new ThreadLocal<Path>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> setMin = new ThreadLocal<Path>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new Path();
        }
    };

    public static boolean length(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    public static int setMax(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    public static Path getMax(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void setMin(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float getMin(Matrix matrix) {
        float[] fArr = getMax.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = getMin;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    public static boolean getMax(Matrix matrix) {
        float[] fArr = getMax.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return true;
        }
        return false;
    }

    public static void getMax(Path path, @Nullable getImeOptions getimeoptions) {
        if (getimeoptions != null && !getimeoptions.getMin()) {
            getMax(path, ((setOnQueryTextListener) getimeoptions.setMax).isInside() / 100.0f, ((setOnQueryTextListener) getimeoptions.getMin).isInside() / 100.0f, ((setOnQueryTextListener) getimeoptions.getMax).isInside() / 360.0f);
        }
    }

    public static void getMax(Path path, float f, float f2, float f3) {
        setChildFrame.getMin("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = length.get();
        Path path2 = setMax.get();
        Path path3 = setMin.get();
        pathMeasure.setPath(path, false);
        float length2 = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            setChildFrame.length("applyTrimPathIfNeeded");
        } else if (length2 < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            setChildFrame.length("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length2;
            float f5 = f2 * length2;
            float f6 = f3 * length2;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length2 && max >= length2) {
                min = (float) getTitleMarginTop.length(min, length2);
                max = (float) getTitleMarginTop.length(max, length2);
            }
            if (min < 0.0f) {
                min = (float) getTitleMarginTop.length(min, length2);
            }
            if (max < 0.0f) {
                max = (float) getTitleMarginTop.length(max, length2);
            }
            if (min == max) {
                path.reset();
                setChildFrame.length("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length2;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length2) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length2, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length2, length2, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            setChildFrame.length("applyTrimPathIfNeeded");
        }
    }

    public static float getMax() {
        if (IsOverlapping == -1.0f) {
            IsOverlapping = Resources.getSystem().getDisplayMetrics().density;
        }
        return IsOverlapping;
    }

    public static float length(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap getMax(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean getMin(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void length(Canvas canvas, RectF rectF, Paint paint) {
        setMin(canvas, rectF, paint, 31);
    }

    public static void setMin(Canvas canvas, RectF rectF, Paint paint, int i) {
        setChildFrame.getMin("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        setChildFrame.length("Utils#saveLayer");
    }
}
