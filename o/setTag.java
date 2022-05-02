package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class setTag {
    private static final Lock getMax;
    private static final Paint getMin = new Paint(6);
    private static final Paint length;
    private static final Paint setMax = new Paint(7);
    private static final Set<String> setMin;

    interface setMin {
        void setMin(Canvas canvas, Paint paint, RectF rectF);
    }

    public static boolean getMin(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static int setMax(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        setMin = hashSet;
        getMax = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new setMax();
        Paint paint = new Paint(7);
        length = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Lock getMax() {
        return getMax;
    }

    public static Bitmap getMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap min = rebuildscene.setMin(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        min.setHasAlpha(bitmap.hasAlpha());
        setMin(bitmap, min, matrix);
        return min;
    }

    public static Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        Bitmap min2 = rebuildscene.setMin((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        min2.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            min2.getWidth();
            min2.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        setMin(bitmap, min2, matrix);
        return min2;
    }

    public static Bitmap length(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            return setMax(rebuildscene, bitmap, i, i2);
        }
        return bitmap;
    }

    public static Bitmap getMin(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i) {
        if (!getMin(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap min = rebuildscene.setMin(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        matrix.postTranslate(-rectF.left, -rectF.top);
        min.setHasAlpha(bitmap.hasAlpha());
        setMin(bitmap, min, matrix);
        return min;
    }

    /* JADX INFO: finally extract failed */
    public static Bitmap setMin(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap max2 = setMax(rebuildscene, bitmap);
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGBA_F16;
        }
        Bitmap min2 = rebuildscene.setMin(min, min, config);
        min2.setHasAlpha(true);
        getMax.lock();
        try {
            Canvas canvas = new Canvas(min2);
            canvas.drawCircle(f2, f2, f2, setMax);
            canvas.drawBitmap(max2, (Rect) null, rectF, length);
            canvas.setBitmap((Bitmap) null);
            getMax.unlock();
            if (!max2.equals(bitmap)) {
                rebuildscene.setMin(max2);
            }
            return min2;
        } catch (Throwable th) {
            getMax.unlock();
            throw th;
        }
    }

    public static Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, final int i) {
        if (i > 0) {
            return setMin(rebuildscene, bitmap, (setMin) new setMin() {
                public final void setMin(Canvas canvas, Paint paint, RectF rectF) {
                    int i = i;
                    canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
                }
            });
        }
        throw new IllegalArgumentException("roundingRadius must be greater than 0.");
    }

    public static Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, final float f, final float f2, final float f3, final float f4) {
        return setMin(rebuildscene, bitmap, (setMin) new setMin() {
            public final void setMin(Canvas canvas, Paint paint, RectF rectF) {
                Path path = new Path();
                float f = f;
                float f2 = f2;
                float f3 = f3;
                float f4 = f4;
                path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        });
    }

    private static void setMin(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        getMax.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, getMin);
            canvas.setBitmap((Bitmap) null);
        } finally {
            getMax.unlock();
        }
    }

    static final class setMax implements Lock {
        public final void lock() {
        }

        public final void lockInterruptibly() throws InterruptedException {
        }

        public final boolean tryLock() {
            return true;
        }

        public final boolean tryLock(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public final void unlock() {
        }

        setMax() {
        }

        @NonNull
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    private static Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGBA_F16;
        }
        if (config.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap min = rebuildscene.setMin(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(min).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return min;
    }

    /* JADX INFO: finally extract failed */
    private static Bitmap setMin(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, setMin setmin) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGBA_F16;
        }
        Bitmap max = setMax(rebuildscene, bitmap);
        Bitmap min = rebuildscene.setMin(max.getWidth(), max.getHeight(), config);
        min.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(max, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) min.getWidth(), (float) min.getHeight());
        getMax.lock();
        try {
            Canvas canvas = new Canvas(min);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            setmin.setMin(canvas, paint, rectF);
            canvas.setBitmap((Bitmap) null);
            getMax.unlock();
            if (!max.equals(bitmap)) {
                rebuildscene.setMin(max);
            }
            return min;
        } catch (Throwable th) {
            getMax.unlock();
            throw th;
        }
    }
}
