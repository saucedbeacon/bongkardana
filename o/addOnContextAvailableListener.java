package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.alibaba.ariver.kernel.RVParams;
import java.util.HashMap;
import java.util.HashSet;
import o.to;

public class addOnContextAvailableListener extends onRetainNonConfigurationInstance {
    /* access modifiers changed from: private */
    public float FastBitmap$CoordinateSystem = 0.0f;
    /* access modifiers changed from: private */
    public float Grayscale$Algorithm = Float.NaN;
    /* access modifiers changed from: private */
    public float ICustomTabsCallback = Float.NaN;
    /* access modifiers changed from: private */
    public float IsOverlapping = Float.NaN;
    /* access modifiers changed from: private */
    public float Mean$Arithmetic = Float.NaN;
    /* access modifiers changed from: private */
    public float create = Float.NaN;
    /* access modifiers changed from: private */
    public int equals = -1;
    /* access modifiers changed from: private */
    public float getCause = Float.NaN;
    /* access modifiers changed from: private */
    public float hashCode = Float.NaN;
    /* access modifiers changed from: private */
    public float invoke = Float.NaN;
    /* access modifiers changed from: private */
    public float invokeSuspend = Float.NaN;
    /* access modifiers changed from: private */
    public int isInside = 0;
    /* access modifiers changed from: private */
    public float onNavigationEvent = Float.NaN;
    /* access modifiers changed from: private */
    public int toDoubleRange = -1;
    /* access modifiers changed from: private */
    public String toFloatRange = null;
    /* access modifiers changed from: private */
    public float toString = Float.NaN;
    /* access modifiers changed from: private */
    public float valueOf = Float.NaN;
    /* access modifiers changed from: private */
    public float values = Float.NaN;

    public addOnContextAvailableListener() {
        this.setMin = 4;
        this.toIntRange = new HashMap();
    }

    public final void getMin(Context context, AttributeSet attributeSet) {
        setMax.setMax(this, context.obtainStyledAttributes(attributeSet, to.length.to));
    }

    public final void getMax(HashSet<String> hashSet) {
        if (!Float.isNaN(this.values)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.toString)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.valueOf)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.invokeSuspend)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.Mean$Arithmetic)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.Grayscale$Algorithm)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.getCause)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.invoke)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.create)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.onNavigationEvent)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.ICustomTabsCallback)) {
            hashSet.add("translationZ");
        }
        if (this.toIntRange.size() > 0) {
            for (String valueOf2 : this.toIntRange.keySet()) {
                hashSet.add("CUSTOM,".concat(String.valueOf(valueOf2)));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(java.util.HashMap<java.lang.String, o.removeOnContextAvailableListener> r12) {
        /*
            r11 = this;
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0133
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r3 = 7
            if (r2 == 0) goto L_0x004b
            java.lang.String r2 = r1.substring(r3)
            java.util.HashMap r3 = r11.toIntRange
            java.lang.Object r2 = r3.get(r2)
            r10 = r2
            androidx.constraintlayout.widget.ConstraintAttribute r10 = (androidx.constraintlayout.widget.ConstraintAttribute) r10
            if (r10 == 0) goto L_0x0008
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r10.getMax
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            if (r2 != r3) goto L_0x0008
            java.lang.Object r1 = r12.get(r1)
            r3 = r1
            o.removeOnContextAvailableListener r3 = (o.removeOnContextAvailableListener) r3
            int r4 = r11.length
            int r5 = r11.equals
            int r6 = r11.toDoubleRange
            float r7 = r11.IsOverlapping
            float r8 = r11.FastBitmap$CoordinateSystem
            float r9 = r10.length()
            r3.getMax(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0008
        L_0x004b:
            int r2 = r1.hashCode()
            r4 = -1
            switch(r2) {
                case -1249320806: goto L_0x00d4;
                case -1249320805: goto L_0x00ca;
                case -1225497657: goto L_0x00bf;
                case -1225497656: goto L_0x00b4;
                case -1225497655: goto L_0x00a9;
                case -1001078227: goto L_0x009e;
                case -908189618: goto L_0x0094;
                case -908189617: goto L_0x008b;
                case -40300674: goto L_0x0081;
                case -4379043: goto L_0x0077;
                case 37232917: goto L_0x006c;
                case 92909918: goto L_0x0061;
                case 156108012: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x00de
        L_0x0055:
            java.lang.String r2 = "waveOffset"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 11
            goto L_0x00df
        L_0x0061:
            java.lang.String r2 = "alpha"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 0
            goto L_0x00df
        L_0x006c:
            java.lang.String r2 = "transitionPathRotate"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 5
            goto L_0x00df
        L_0x0077:
            java.lang.String r2 = "elevation"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 1
            goto L_0x00df
        L_0x0081:
            java.lang.String r2 = "rotation"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 2
            goto L_0x00df
        L_0x008b:
            java.lang.String r2 = "scaleY"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            goto L_0x00df
        L_0x0094:
            java.lang.String r2 = "scaleX"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 6
            goto L_0x00df
        L_0x009e:
            java.lang.String r2 = "progress"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 12
            goto L_0x00df
        L_0x00a9:
            java.lang.String r2 = "translationZ"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 10
            goto L_0x00df
        L_0x00b4:
            java.lang.String r2 = "translationY"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 9
            goto L_0x00df
        L_0x00bf:
            java.lang.String r2 = "translationX"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 8
            goto L_0x00df
        L_0x00ca:
            java.lang.String r2 = "rotationY"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 4
            goto L_0x00df
        L_0x00d4:
            java.lang.String r2 = "rotationX"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00de
            r3 = 3
            goto L_0x00df
        L_0x00de:
            r3 = -1
        L_0x00df:
            switch(r3) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0106;
                case 2: goto L_0x0103;
                case 3: goto L_0x0100;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00fa;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00f4;
                case 8: goto L_0x00f1;
                case 9: goto L_0x00ee;
                case 10: goto L_0x00eb;
                case 11: goto L_0x00e8;
                case 12: goto L_0x00e5;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            r2 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x010b
        L_0x00e5:
            float r2 = r11.hashCode
            goto L_0x010b
        L_0x00e8:
            float r2 = r11.FastBitmap$CoordinateSystem
            goto L_0x010b
        L_0x00eb:
            float r2 = r11.ICustomTabsCallback
            goto L_0x010b
        L_0x00ee:
            float r2 = r11.onNavigationEvent
            goto L_0x010b
        L_0x00f1:
            float r2 = r11.create
            goto L_0x010b
        L_0x00f4:
            float r2 = r11.getCause
            goto L_0x010b
        L_0x00f7:
            float r2 = r11.Grayscale$Algorithm
            goto L_0x010b
        L_0x00fa:
            float r2 = r11.invoke
            goto L_0x010b
        L_0x00fd:
            float r2 = r11.Mean$Arithmetic
            goto L_0x010b
        L_0x0100:
            float r2 = r11.invokeSuspend
            goto L_0x010b
        L_0x0103:
            float r2 = r11.valueOf
            goto L_0x010b
        L_0x0106:
            float r2 = r11.toString
            goto L_0x010b
        L_0x0109:
            float r2 = r11.values
        L_0x010b:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x0008
            java.lang.Object r1 = r12.get(r1)
            o.removeOnContextAvailableListener r1 = (o.removeOnContextAvailableListener) r1
            int r3 = r11.length
            int r5 = r11.equals
            int r6 = r11.toDoubleRange
            float r7 = r11.IsOverlapping
            float r8 = r11.FastBitmap$CoordinateSystem
            java.util.ArrayList<o.removeOnContextAvailableListener$values> r9 = r1.toFloatRange
            o.removeOnContextAvailableListener$values r10 = new o.removeOnContextAvailableListener$values
            r10.<init>(r3, r7, r8, r2)
            r9.add(r10)
            if (r6 == r4) goto L_0x012f
            r1.getMax = r6
        L_0x012f:
            r1.setMax = r5
            goto L_0x0008
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addOnContextAvailableListener.setMin(java.util.HashMap):void");
    }

    public final void length(HashMap<String, startIntentSenderForResult> hashMap) {
        hashMap.size();
        new Throwable().getStackTrace();
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
                        c = 8;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals(RVParams.PROGRESS)) {
                        c = 12;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
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
                        c = 5;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
                case 156108012:
                    if (next.equals("waveOffset")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    startintentsenderforresult.setMin(this.length, this.values);
                    break;
                case 1:
                    startintentsenderforresult.setMin(this.length, this.toString);
                    break;
                case 2:
                    startintentsenderforresult.setMin(this.length, this.valueOf);
                    break;
                case 3:
                    startintentsenderforresult.setMin(this.length, this.invokeSuspend);
                    break;
                case 4:
                    startintentsenderforresult.setMin(this.length, this.Mean$Arithmetic);
                    break;
                case 5:
                    startintentsenderforresult.setMin(this.length, this.invoke);
                    break;
                case 6:
                    startintentsenderforresult.setMin(this.length, this.Grayscale$Algorithm);
                    break;
                case 7:
                    startintentsenderforresult.setMin(this.length, this.getCause);
                    break;
                case 8:
                    startintentsenderforresult.setMin(this.length, this.create);
                    break;
                case 9:
                    startintentsenderforresult.setMin(this.length, this.onNavigationEvent);
                    break;
                case 10:
                    startintentsenderforresult.setMin(this.length, this.ICustomTabsCallback);
                    break;
                case 11:
                    startintentsenderforresult.setMin(this.length, this.FastBitmap$CoordinateSystem);
                    break;
                case 12:
                    startintentsenderforresult.setMin(this.length, this.hashCode);
                    break;
            }
        }
    }

    static class setMax {
        private static SparseIntArray setMin;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setMin = sparseIntArray;
            sparseIntArray.append(to.length.enumMapping, 1);
            setMin.append(to.length.hasAttributeId, 2);
            setMin.append(to.length.valueType, 3);
            setMin.append(to.length.attributeId, 4);
            setMin.append(to.length.mask, 5);
            setMin.append(to.length.InspectableProperty$EnumEntry, 6);
            setMin.append(to.length.InspectableProperty$FlagEntry, 7);
            setMin.append(to.length.target, 8);
            setMin.append(to.length.GuardedBy, 9);
            setMin.append(to.length.value, 10);
            setMin.append(to.length.InspectableProperty, 11);
            setMin.append(to.length.name, 12);
            setMin.append(to.length.IdRes, 13);
            setMin.append(to.length.InspectableProperty$ValueType, 14);
            setMin.append(to.length.fromInclusive, 15);
            setMin.append(to.length.FontRes, 16);
            setMin.append(to.length.FractionRes, 17);
            setMin.append(to.length.toInclusive, 18);
            setMin.append(to.length.HalfFloat, 19);
            setMin.append(to.length.flagMapping, 20);
        }

        static /* synthetic */ void setMax(addOnContextAvailableListener addoncontextavailablelistener, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (setMin.get(index)) {
                    case 1:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                addoncontextavailablelistener.getMax = typedArray.getResourceId(index, addoncontextavailablelistener.getMax);
                                break;
                            } else {
                                addoncontextavailablelistener.setMax = typedArray.getString(index);
                                break;
                            }
                        } else {
                            addoncontextavailablelistener.getMax = typedArray.getResourceId(index, addoncontextavailablelistener.getMax);
                            if (addoncontextavailablelistener.getMax != -1) {
                                break;
                            } else {
                                addoncontextavailablelistener.setMax = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        addoncontextavailablelistener.length = typedArray.getInt(index, addoncontextavailablelistener.length);
                        break;
                    case 3:
                        String unused = addoncontextavailablelistener.toFloatRange = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = addoncontextavailablelistener.isInside = typedArray.getInteger(index, addoncontextavailablelistener.isInside);
                        break;
                    case 5:
                        int unused3 = addoncontextavailablelistener.equals = typedArray.getInt(index, addoncontextavailablelistener.equals);
                        break;
                    case 6:
                        float unused4 = addoncontextavailablelistener.IsOverlapping = typedArray.getFloat(index, addoncontextavailablelistener.IsOverlapping);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused5 = addoncontextavailablelistener.FastBitmap$CoordinateSystem = typedArray.getFloat(index, addoncontextavailablelistener.FastBitmap$CoordinateSystem);
                            break;
                        } else {
                            float unused6 = addoncontextavailablelistener.FastBitmap$CoordinateSystem = typedArray.getDimension(index, addoncontextavailablelistener.FastBitmap$CoordinateSystem);
                            break;
                        }
                    case 8:
                        int unused7 = addoncontextavailablelistener.toDoubleRange = typedArray.getInt(index, addoncontextavailablelistener.toDoubleRange);
                        break;
                    case 9:
                        float unused8 = addoncontextavailablelistener.values = typedArray.getFloat(index, addoncontextavailablelistener.values);
                        break;
                    case 10:
                        float unused9 = addoncontextavailablelistener.toString = typedArray.getDimension(index, addoncontextavailablelistener.toString);
                        break;
                    case 11:
                        float unused10 = addoncontextavailablelistener.valueOf = typedArray.getFloat(index, addoncontextavailablelistener.valueOf);
                        break;
                    case 12:
                        float unused11 = addoncontextavailablelistener.invokeSuspend = typedArray.getFloat(index, addoncontextavailablelistener.invokeSuspend);
                        break;
                    case 13:
                        float unused12 = addoncontextavailablelistener.Mean$Arithmetic = typedArray.getFloat(index, addoncontextavailablelistener.Mean$Arithmetic);
                        break;
                    case 14:
                        float unused13 = addoncontextavailablelistener.invoke = typedArray.getFloat(index, addoncontextavailablelistener.invoke);
                        break;
                    case 15:
                        float unused14 = addoncontextavailablelistener.Grayscale$Algorithm = typedArray.getFloat(index, addoncontextavailablelistener.Grayscale$Algorithm);
                        break;
                    case 16:
                        float unused15 = addoncontextavailablelistener.getCause = typedArray.getFloat(index, addoncontextavailablelistener.getCause);
                        break;
                    case 17:
                        float unused16 = addoncontextavailablelistener.create = typedArray.getDimension(index, addoncontextavailablelistener.create);
                        break;
                    case 18:
                        float unused17 = addoncontextavailablelistener.onNavigationEvent = typedArray.getDimension(index, addoncontextavailablelistener.onNavigationEvent);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused18 = addoncontextavailablelistener.ICustomTabsCallback = typedArray.getDimension(index, addoncontextavailablelistener.ICustomTabsCallback);
                            break;
                        }
                    case 20:
                        float unused19 = addoncontextavailablelistener.hashCode = typedArray.getFloat(index, addoncontextavailablelistener.hashCode);
                        break;
                    default:
                        setMin.get(index);
                        break;
                }
            }
        }
    }
}
