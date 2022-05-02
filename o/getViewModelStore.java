package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import o.to;

public class getViewModelStore extends onRetainNonConfigurationInstance {
    /* access modifiers changed from: package-private */
    public int FastBitmap$CoordinateSystem = getMin;
    Method Grayscale$Algorithm;
    RectF ICustomTabsCallback = new RectF();
    /* access modifiers changed from: package-private */
    public String IsOverlapping = null;
    /* access modifiers changed from: package-private */
    public float Mean$Arithmetic = Float.NaN;
    RectF b = new RectF();
    float create;
    /* access modifiers changed from: package-private */
    public int equals = getMin;
    /* access modifiers changed from: package-private */
    public boolean getCause = false;
    View hashCode = null;
    Method invoke;
    boolean invokeSuspend = true;
    /* access modifiers changed from: package-private */
    public String isInside = null;
    Method onNavigationEvent;
    private int onRelationshipValidationResult = -1;
    boolean toDoubleRange = true;
    /* access modifiers changed from: package-private */
    public String toFloatRange = null;
    float toString = 0.1f;
    boolean valueOf = true;
    /* access modifiers changed from: package-private */
    public int values = getMin;

    public final void getMax(HashSet<String> hashSet) {
    }

    public final void length(HashMap<String, startIntentSenderForResult> hashMap) {
    }

    public getViewModelStore() {
        this.setMin = 5;
        this.toIntRange = new HashMap();
    }

    public final void getMin(Context context, AttributeSet attributeSet) {
        setMax.setMin(this, context.obtainStyledAttributes(attributeSet, to.length.min));
    }

    static void setMax(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    static class setMax {
        private static SparseIntArray setMin;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setMin = sparseIntArray;
            sparseIntArray.append(to.length.RestrictTo, 8);
            setMin.append(to.length.StyleRes, 4);
            setMin.append(to.length.StringDef, 1);
            setMin.append(to.length.UiThread, 2);
            setMin.append(to.length.max, 7);
            setMin.append(to.length.TransitionRes, 6);
            setMin.append(to.length.StyleableRes, 5);
            setMin.append(to.length.StringRes, 9);
            setMin.append(to.length.multiple, 10);
            setMin.append(to.length.otherwise, 11);
        }

        public static void setMin(getViewModelStore getviewmodelstore, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (setMin.get(index)) {
                    case 1:
                        String unused = getviewmodelstore.toFloatRange = typedArray.getString(index);
                        continue;
                    case 2:
                        String unused2 = getviewmodelstore.IsOverlapping = typedArray.getString(index);
                        continue;
                    case 4:
                        String unused3 = getviewmodelstore.isInside = typedArray.getString(index);
                        continue;
                    case 5:
                        getviewmodelstore.toString = typedArray.getFloat(index, getviewmodelstore.toString);
                        continue;
                    case 6:
                        int unused4 = getviewmodelstore.FastBitmap$CoordinateSystem = typedArray.getResourceId(index, getviewmodelstore.FastBitmap$CoordinateSystem);
                        continue;
                    case 7:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                getviewmodelstore.getMax = typedArray.getResourceId(index, getviewmodelstore.getMax);
                                break;
                            } else {
                                getviewmodelstore.setMax = typedArray.getString(index);
                                break;
                            }
                        } else {
                            getviewmodelstore.getMax = typedArray.getResourceId(index, getviewmodelstore.getMax);
                            if (getviewmodelstore.getMax == -1) {
                                getviewmodelstore.setMax = typedArray.getString(index);
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 8:
                        getviewmodelstore.length = typedArray.getInteger(index, getviewmodelstore.length);
                        float unused5 = getviewmodelstore.Mean$Arithmetic = (((float) getviewmodelstore.length) + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        int unused6 = getviewmodelstore.values = typedArray.getResourceId(index, getviewmodelstore.values);
                        continue;
                    case 10:
                        boolean unused7 = getviewmodelstore.getCause = typedArray.getBoolean(index, getviewmodelstore.getCause);
                        continue;
                    case 11:
                        int unused8 = getviewmodelstore.equals = typedArray.getResourceId(index, getviewmodelstore.equals);
                        break;
                }
                setMin.get(index);
            }
        }
    }
}
