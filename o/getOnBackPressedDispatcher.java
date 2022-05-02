package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.alibaba.ariver.kernel.RVParams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import o.ResultReceiver;
import o.from;
import o.startIntentSenderForResult;

public final class getOnBackPressedDispatcher implements Comparable<getOnBackPressedDispatcher> {
    static String[] b = {"position", "x", "y", "width", "height", "pathRotate"};
    public float FastBitmap$CoordinateSystem = 0.0f;
    float Grayscale$Algorithm = Float.NaN;
    int ICustomTabsCallback = 0;
    public float IsOverlapping = 1.0f;
    public float Mean$Arithmetic;
    float create = Float.NaN;
    public float equals = 0.0f;
    private float extraCallback;
    double[] extraCallbackWithResult = new double[18];
    LinkedHashMap<String, ConstraintAttribute> getCause = new LinkedHashMap<>();
    int getMax = 0;
    public int getMin;
    public float hashCode = 0.0f;
    public float invoke;
    public float invokeSuspend;
    public float isInside = 0.0f;
    public boolean length = false;
    private int onMessageChannelReady = 0;
    double[] onNavigationEvent = new double[18];
    private ResultReceiver.MyResultReceiver onRelationshipValidationResult;
    public float setMax = 0.0f;
    public float setMin = 1.0f;
    public float toDoubleRange = Float.NaN;
    public float toFloatRange = 0.0f;
    public float toIntRange = 1.0f;
    public float toString = 0.0f;
    public float valueOf;
    public float values = Float.NaN;

    public final /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.extraCallback, ((getOnBackPressedDispatcher) obj).extraCallback);
    }

    static boolean getMin(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public final void setMax(HashMap<String, startIntentSenderForResult> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            startIntentSenderForResult startintentsenderforresult = hashMap.get(next);
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 12;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 13;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals(RVParams.PROGRESS)) {
                        c = 8;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 9;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 10;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c = 5;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c = 6;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 1;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 7;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.setMin)) {
                        f = this.setMin;
                    }
                    startintentsenderforresult.setMin(i, f);
                    break;
                case 1:
                    if (!Float.isNaN(this.setMax)) {
                        f2 = this.setMax;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.toFloatRange)) {
                        f2 = this.toFloatRange;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.equals)) {
                        f2 = this.equals;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.isInside)) {
                        f2 = this.isInside;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.values)) {
                        f2 = this.values;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.toDoubleRange)) {
                        f2 = this.toDoubleRange;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.Grayscale$Algorithm)) {
                        f2 = this.Grayscale$Algorithm;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 8:
                    if (!Float.isNaN(this.create)) {
                        f2 = this.create;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 9:
                    if (!Float.isNaN(this.IsOverlapping)) {
                        f = this.IsOverlapping;
                    }
                    startintentsenderforresult.setMin(i, f);
                    break;
                case 10:
                    if (!Float.isNaN(this.toIntRange)) {
                        f = this.toIntRange;
                    }
                    startintentsenderforresult.setMin(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.toString)) {
                        f2 = this.toString;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 12:
                    if (!Float.isNaN(this.hashCode)) {
                        f2 = this.hashCode;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                case 13:
                    if (!Float.isNaN(this.FastBitmap$CoordinateSystem)) {
                        f2 = this.FastBitmap$CoordinateSystem;
                    }
                    startintentsenderforresult.setMin(i, f2);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.getCause.containsKey(str)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.getCause.get(str);
                            if (!(startintentsenderforresult instanceof startIntentSenderForResult.length)) {
                                constraintAttribute.length();
                                break;
                            } else {
                                ((startIntentSenderForResult.length) startintentsenderforresult).IsOverlapping.append(i, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    public final void length(ConstraintWidget constraintWidget, from from, int i) {
        int i2;
        float Mean$Arithmetic2 = (float) constraintWidget.Mean$Arithmetic();
        float onNavigationEvent2 = (float) constraintWidget.onNavigationEvent();
        int i3 = 0;
        if (constraintWidget.areNotificationsEnabled == 8) {
            i2 = 0;
        } else {
            i2 = constraintWidget.requestPostMessageChannelWithExtras;
        }
        float f = (float) i2;
        if (constraintWidget.areNotificationsEnabled != 8) {
            i3 = constraintWidget.postMessage;
        }
        this.valueOf = Mean$Arithmetic2;
        this.invoke = onNavigationEvent2;
        this.Mean$Arithmetic = f;
        this.invokeSuspend = (float) i3;
        from.length length2 = from.length(i);
        this.getMax = length2.length.getMin;
        this.getMin = length2.length.length;
        this.setMin = (length2.length.length == 0 || this.getMax != 0) ? length2.length.getMax : 0.0f;
        this.length = length2.setMax.hashCode;
        this.setMax = length2.setMax.FastBitmap$CoordinateSystem;
        this.toFloatRange = length2.setMax.getMin;
        this.equals = length2.setMax.length;
        this.isInside = length2.setMax.setMax;
        this.IsOverlapping = length2.setMax.getMax;
        this.toIntRange = length2.setMax.toIntRange;
        this.values = length2.setMax.isInside;
        this.toDoubleRange = length2.setMax.IsOverlapping;
        this.toString = length2.setMax.equals;
        this.hashCode = length2.setMax.toFloatRange;
        this.FastBitmap$CoordinateSystem = length2.setMax.values;
        this.onRelationshipValidationResult = ResultReceiver.MyResultReceiver.getMax(length2.getMax.setMin);
        this.Grayscale$Algorithm = length2.getMax.IsOverlapping;
        this.onMessageChannelReady = length2.getMax.setMax;
        this.create = length2.length.setMin;
        for (String next : length2.toFloatRange.keySet()) {
            ConstraintAttribute constraintAttribute = length2.toFloatRange.get(next);
            if (constraintAttribute.getMax != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.getCause.put(next, constraintAttribute);
            }
        }
    }
}
