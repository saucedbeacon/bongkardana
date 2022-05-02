package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

class onPrepareSupportNavigateUpTaskStack implements Interpolator {
    private final float[] getMax;
    private final float[] length;

    onPrepareSupportNavigateUpTaskStack(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length2 = pathMeasure.getLength();
        int i = ((int) (length2 / 0.002f)) + 1;
        this.length = new float[i];
        this.getMax = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length2) / ((float) (i - 1)), fArr, (float[]) null);
            this.length[i2] = fArr[0];
            this.getMax[i2] = fArr[1];
        }
    }

    onPrepareSupportNavigateUpTaskStack(float f, float f2, float f3, float f4) {
        this(getMin(f, f2, f3, f4));
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length2 = this.length.length - 1;
        while (length2 - i > 1) {
            int i2 = (i + length2) / 2;
            if (f < this.length[i2]) {
                length2 = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.length;
        float f2 = fArr[length2] - fArr[i];
        if (f2 == 0.0f) {
            return this.getMax[i];
        }
        float[] fArr2 = this.getMax;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length2] - f3));
    }

    private static Path getMin(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
