package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import o.ResultReceiver;
import o.to;

public class peekAvailableContext extends getDefaultViewModelProviderFactory {
    float FastBitmap$CoordinateSystem = Float.NaN;
    private float Grayscale$Algorithm = Float.NaN;
    int IsOverlapping = getMin;
    private float Mean$Arithmetic = Float.NaN;
    int equals = 0;
    float hashCode = Float.NaN;
    int invokeSuspend = 0;
    float isInside = Float.NaN;
    float toDoubleRange = Float.NaN;
    String toFloatRange = null;
    float toString = Float.NaN;
    float values = Float.NaN;

    public final void length(HashMap<String, startIntentSenderForResult> hashMap) {
    }

    public peekAvailableContext() {
        this.setMin = 2;
    }

    public final void getMin(Context context, AttributeSet attributeSet) {
        getMax.length(this, context.obtainStyledAttributes(attributeSet, to.length.flag));
    }

    static class getMax {
        private static SparseIntArray setMax;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setMax = sparseIntArray;
            sparseIntArray.append(to.length.LongDef, 1);
            setMax.append(to.length.IntDef, 2);
            setMax.append(to.length.MenuRes, 3);
            setMax.append(to.length.IntRange, 4);
            setMax.append(to.length.open, 5);
            setMax.append(to.length.Keep, 6);
            setMax.append(to.length.NonNull, 7);
            setMax.append(to.length.IntegerRes, 9);
            setMax.append(to.length.NavigationRes, 8);
            setMax.append(to.length.LayoutRes, 11);
            setMax.append(to.length.InterpolatorRes, 12);
            setMax.append(to.length.MainThread, 10);
        }

        static /* synthetic */ void length(peekAvailableContext peekavailablecontext, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (setMax.get(index)) {
                    case 1:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                peekavailablecontext.getMax = typedArray.getResourceId(index, peekavailablecontext.getMax);
                                break;
                            } else {
                                peekavailablecontext.setMax = typedArray.getString(index);
                                break;
                            }
                        } else {
                            peekavailablecontext.getMax = typedArray.getResourceId(index, peekavailablecontext.getMax);
                            if (peekavailablecontext.getMax != -1) {
                                break;
                            } else {
                                peekavailablecontext.setMax = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        peekavailablecontext.length = typedArray.getInt(index, peekavailablecontext.length);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type != 3) {
                            peekavailablecontext.toFloatRange = ResultReceiver.MyResultReceiver.length[typedArray.getInteger(index, 0)];
                            break;
                        } else {
                            peekavailablecontext.toFloatRange = typedArray.getString(index);
                            break;
                        }
                    case 4:
                        peekavailablecontext.valueOf = typedArray.getInteger(index, peekavailablecontext.valueOf);
                        break;
                    case 5:
                        peekavailablecontext.equals = typedArray.getInt(index, peekavailablecontext.equals);
                        break;
                    case 6:
                        peekavailablecontext.toDoubleRange = typedArray.getFloat(index, peekavailablecontext.toDoubleRange);
                        break;
                    case 7:
                        peekavailablecontext.hashCode = typedArray.getFloat(index, peekavailablecontext.hashCode);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, peekavailablecontext.FastBitmap$CoordinateSystem);
                        peekavailablecontext.isInside = f;
                        peekavailablecontext.FastBitmap$CoordinateSystem = f;
                        break;
                    case 9:
                        peekavailablecontext.invokeSuspend = typedArray.getInt(index, peekavailablecontext.invokeSuspend);
                        break;
                    case 10:
                        peekavailablecontext.IsOverlapping = typedArray.getInt(index, peekavailablecontext.IsOverlapping);
                        break;
                    case 11:
                        peekavailablecontext.isInside = typedArray.getFloat(index, peekavailablecontext.isInside);
                        break;
                    case 12:
                        peekavailablecontext.FastBitmap$CoordinateSystem = typedArray.getFloat(index, peekavailablecontext.FastBitmap$CoordinateSystem);
                        break;
                    default:
                        setMax.get(index);
                        break;
                }
            }
        }
    }
}
