package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import o.NonNull;
import o.markerClass;
import o.setActionBarHideOffset;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {
    private final Matrix getMin = new Matrix();
    private final Path setMax = new Path();
    private Path setMin;

    public PatternPathMotion() {
        this.setMax.lineTo(1.0f, 0.0f);
        this.setMin = this.setMax;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.toDoubleRange);
        try {
            if (!NonNull.setMin((XmlPullParser) attributeSet, "patternPathData")) {
                str = null;
            } else {
                str = obtainStyledAttributes.getString(0);
            }
            if (str != null) {
                getMin(markerClass.getMax(str));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(Path path) {
        getMin(path);
    }

    private void getMin(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.getMin.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
        this.getMin.postScale(sqrt, sqrt);
        this.getMin.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.getMin, this.setMax);
        this.setMin = path;
    }

    public Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.getMin.setScale(sqrt, sqrt);
        this.getMin.postRotate((float) Math.toDegrees(atan2));
        this.getMin.postTranslate(f, f2);
        Path path = new Path();
        this.setMax.transform(this.getMin, path);
        return path;
    }
}
