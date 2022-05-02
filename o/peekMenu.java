package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class peekMenu implements Interpolator {
    private float[] getMin;
    private float[] length;

    public peekMenu(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public peekMenu(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        int[] iArr = getMenu.toString;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        getMin(typedArray, xmlPullParser);
        typedArray.recycle();
    }

    private void getMin(TypedArray typedArray, XmlPullParser xmlPullParser) {
        float f;
        float f2;
        float f3;
        String str;
        if (NonNull.setMin(xmlPullParser, "pathData")) {
            if (!NonNull.setMin(xmlPullParser, "pathData")) {
                str = null;
            } else {
                str = typedArray.getString(4);
            }
            Path max = markerClass.getMax(str);
            if (max != null) {
                getMax(max);
                return;
            }
            throw new InflateException("The path is null, which is created from ".concat(String.valueOf(str)));
        } else if (!NonNull.setMin(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (NonNull.setMin(xmlPullParser, "controlY1")) {
            float f4 = 0.0f;
            if (!NonNull.setMin(xmlPullParser, "controlX1")) {
                f = 0.0f;
            } else {
                f = typedArray.getFloat(0, 0.0f);
            }
            if (!NonNull.setMin(xmlPullParser, "controlY1")) {
                f2 = 0.0f;
            } else {
                f2 = typedArray.getFloat(1, 0.0f);
            }
            boolean min = NonNull.setMin(xmlPullParser, "controlX2");
            if (min != NonNull.setMin(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!min) {
                setMax(f, f2);
            } else {
                if (!NonNull.setMin(xmlPullParser, "controlX2")) {
                    f3 = 0.0f;
                } else {
                    f3 = typedArray.getFloat(2, 0.0f);
                }
                if (NonNull.setMin(xmlPullParser, "controlY2")) {
                    f4 = typedArray.getFloat(3, 0.0f);
                }
                length(f, f2, f3, f4);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    private void setMax(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        getMax(path);
    }

    private void length(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        getMax(path);
    }

    private void getMax(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length2 = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length2 / 0.002f)) + 1);
        if (min > 0) {
            this.length = new float[min];
            this.getMin = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length2) / ((float) (min - 1)), fArr, (float[]) null);
                this.length[i2] = fArr[0];
                this.getMin[i2] = fArr[1];
            }
            if (((double) Math.abs(this.length[0])) <= 1.0E-5d && ((double) Math.abs(this.getMin[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.length[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.getMin[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.length;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :".concat(String.valueOf(f2)));
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.length[0]);
            sb.append(",");
            sb.append(this.getMin[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.length[i6]);
            sb.append(",");
            sb.append(this.getMin[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length ".concat(String.valueOf(length2)));
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
            return this.getMin[i];
        }
        float[] fArr2 = this.getMin;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length2] - f3));
    }
}
