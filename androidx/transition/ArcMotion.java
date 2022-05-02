package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import o.NonNull;
import o.setActionBarHideOffset;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {
    private static final float getMax = ((float) Math.tan(Math.toRadians(35.0d)));
    private float IsOverlapping;
    private float getMin;
    private float length;
    private float setMax;
    private float setMin;
    private float toFloatRange;

    public ArcMotion() {
        this.getMin = 0.0f;
        this.setMin = 0.0f;
        this.setMax = 70.0f;
        this.length = 0.0f;
        this.IsOverlapping = 0.0f;
        this.toFloatRange = getMax;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f;
        float f2 = 0.0f;
        this.getMin = 0.0f;
        this.setMin = 0.0f;
        float f3 = 70.0f;
        this.setMax = 70.0f;
        this.length = 0.0f;
        this.IsOverlapping = 0.0f;
        this.toFloatRange = getMax;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.equals);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (!NonNull.setMin(xmlPullParser, "minimumVerticalAngle")) {
            f = 0.0f;
        } else {
            f = obtainStyledAttributes.getFloat(1, 0.0f);
        }
        this.setMin = f;
        this.IsOverlapping = setMin(f);
        f2 = NonNull.setMin(xmlPullParser, "minimumHorizontalAngle") ? obtainStyledAttributes.getFloat(0, 0.0f) : f2;
        this.getMin = f2;
        this.length = setMin(f2);
        f3 = NonNull.setMin(xmlPullParser, "maximumAngle") ? obtainStyledAttributes.getFloat(2, 70.0f) : f3;
        this.setMax = f3;
        this.toFloatRange = setMin(f3);
        obtainStyledAttributes.recycle();
    }

    private static float setMin(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public Path getPath(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f10 = f3 - f;
        float f11 = f4 - f2;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = (f + f3) / 2.0f;
        float f14 = (f2 + f4) / 2.0f;
        float f15 = 0.25f * f12;
        boolean z = f2 > f4;
        if (Math.abs(f10) < Math.abs(f11)) {
            float abs = Math.abs(f12 / (f11 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.IsOverlapping;
        } else {
            float f16 = f12 / (f10 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f16 + f;
            } else {
                f8 = f3 - f16;
                f9 = f4;
            }
            f5 = this.length;
        }
        float f17 = f15 * f5 * f5;
        float f18 = f13 - f6;
        float f19 = f14 - f7;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = this.toFloatRange;
        float f22 = f15 * f21 * f21;
        if (f20 >= f17) {
            f17 = f20 > f22 ? f22 : 0.0f;
        }
        if (f17 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f17 / f20));
            f6 = ((f6 - f13) * sqrt) + f13;
            f7 = f14 + (sqrt * (f7 - f14));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }
}
