package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import o.to;
import org.xmlpull.v1.XmlPullParser;

public final class access$001 {
    private static final float[][] ICustomTabsCallback = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] onNavigationEvent = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    float FastBitmap$CoordinateSystem;
    private int Grayscale$Algorithm = 0;
    public float IsOverlapping = 0.5f;
    float Mean$Arithmetic = 10.0f;
    private boolean create = true;
    public float equals = 0.0f;
    public int getMax = -1;
    public float getMin = 0.5f;
    public float hashCode = 1.2f;
    float invoke = 1.0f;
    private int invokeSuspend = 0;
    public float[] isInside = new float[2];
    public int length = 0;
    int setMax = -1;
    public int setMin = -1;
    float toDoubleRange;
    public boolean toFloatRange = false;
    public float toIntRange = 1.0f;
    public float toString = 4.0f;
    public int valueOf = 0;
    public final MotionLayout values;

    access$001(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.values = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.createSpinner);
        length(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public final void getMax(boolean z) {
        if (z) {
            float[][] fArr = onNavigationEvent;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = ICustomTabsCallback;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = onNavigationEvent;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = ICustomTabsCallback;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = ICustomTabsCallback;
        int i = this.invokeSuspend;
        this.IsOverlapping = fArr5[i][0];
        this.getMin = fArr5[i][1];
        float[][] fArr6 = onNavigationEvent;
        int i2 = this.Grayscale$Algorithm;
        this.equals = fArr6[i2][0];
        this.toIntRange = fArr6[i2][1];
    }

    private void length(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == to.length.verifyNotNull) {
                this.getMax = typedArray.getResourceId(index, this.getMax);
            } else if (index == to.length.createViewByPrefix) {
                int i2 = typedArray.getInt(index, this.invokeSuspend);
                this.invokeSuspend = i2;
                float[][] fArr = ICustomTabsCallback;
                this.IsOverlapping = fArr[i2][0];
                this.getMin = fArr[i2][1];
            } else if (index == to.length.createImageButton) {
                int i3 = typedArray.getInt(index, this.Grayscale$Algorithm);
                this.Grayscale$Algorithm = i3;
                float[][] fArr2 = onNavigationEvent;
                this.equals = fArr2[i3][0];
                this.toIntRange = fArr2[i3][1];
            } else if (index == to.length.createSeekBar) {
                this.toString = typedArray.getFloat(index, this.toString);
            } else if (index == to.length.createMultiAutoCompleteTextView) {
                this.hashCode = typedArray.getFloat(index, this.hashCode);
            } else if (index == to.length.createRatingBar) {
                this.create = typedArray.getBoolean(index, this.create);
            } else if (index == to.length.createCheckBox) {
                this.invoke = typedArray.getFloat(index, this.invoke);
            } else if (index == to.length.createCheckedTextView) {
                this.Mean$Arithmetic = typedArray.getFloat(index, this.Mean$Arithmetic);
            } else if (index == to.length.checkOnClickListener) {
                this.setMin = typedArray.getResourceId(index, this.setMin);
            } else if (index == to.length.createAutoCompleteTextView) {
                this.length = typedArray.getInt(index, this.length);
            } else if (index == to.length.createToggleButton) {
                this.valueOf = typedArray.getInteger(index, 0);
            } else if (index == to.length.createRadioButton) {
                this.setMax = typedArray.getResourceId(index, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        return this.create;
    }

    public final RectF length(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.setMin;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.equals);
        sb.append(" , ");
        sb.append(this.toIntRange);
        return sb.toString();
    }
}
