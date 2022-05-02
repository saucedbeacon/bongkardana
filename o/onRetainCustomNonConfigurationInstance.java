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

public class onRetainCustomNonConfigurationInstance extends onRetainNonConfigurationInstance {
    /* access modifiers changed from: private */
    public float FastBitmap$CoordinateSystem = Float.NaN;
    /* access modifiers changed from: private */
    public float Grayscale$Algorithm = Float.NaN;
    /* access modifiers changed from: private */
    public float ICustomTabsCallback = Float.NaN;
    /* access modifiers changed from: private */
    public int IsOverlapping = -1;
    /* access modifiers changed from: private */
    public float Mean$Arithmetic = Float.NaN;
    /* access modifiers changed from: private */
    public String equals;
    /* access modifiers changed from: private */
    public float getCause = Float.NaN;
    /* access modifiers changed from: private */
    public float hashCode = Float.NaN;
    /* access modifiers changed from: private */
    public float invoke = Float.NaN;
    /* access modifiers changed from: private */
    public float invokeSuspend = Float.NaN;
    private boolean isInside = false;
    /* access modifiers changed from: private */
    public float onNavigationEvent = Float.NaN;
    /* access modifiers changed from: private */
    public float toDoubleRange = Float.NaN;
    /* access modifiers changed from: private */
    public float toFloatRange = Float.NaN;
    /* access modifiers changed from: private */
    public float toString = Float.NaN;
    /* access modifiers changed from: private */
    public float valueOf = Float.NaN;
    /* access modifiers changed from: private */
    public float values = Float.NaN;

    public onRetainCustomNonConfigurationInstance() {
        this.setMin = 1;
        this.toIntRange = new HashMap();
    }

    public final void getMin(Context context, AttributeSet attributeSet) {
        setMax.length(this, context.obtainStyledAttributes(attributeSet, to.length.api));
    }

    public final void getMax(HashSet<String> hashSet) {
        if (!Float.isNaN(this.toFloatRange)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.toString)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.values)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.toDoubleRange)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.hashCode)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.FastBitmap$CoordinateSystem)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.Mean$Arithmetic)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.invoke)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.ICustomTabsCallback)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.onNavigationEvent)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.Grayscale$Algorithm)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.valueOf)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.invokeSuspend)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.getCause)) {
            hashSet.add(RVParams.PROGRESS);
        }
        if (this.toIntRange.size() > 0) {
            for (String valueOf2 : this.toIntRange.keySet()) {
                hashSet.add("CUSTOM,".concat(String.valueOf(valueOf2)));
            }
        }
    }

    public final void getMax(HashMap<String, Integer> hashMap) {
        if (this.IsOverlapping != -1) {
            if (!Float.isNaN(this.toFloatRange)) {
                hashMap.put("alpha", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.toString)) {
                hashMap.put("elevation", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.values)) {
                hashMap.put("rotation", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.toDoubleRange)) {
                hashMap.put("rotationX", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.hashCode)) {
                hashMap.put("rotationY", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.FastBitmap$CoordinateSystem)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.Mean$Arithmetic)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.invoke)) {
                hashMap.put("translationX", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.ICustomTabsCallback)) {
                hashMap.put("translationY", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.onNavigationEvent)) {
                hashMap.put("translationZ", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.Grayscale$Algorithm)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.valueOf)) {
                hashMap.put("scaleX", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.invokeSuspend)) {
                hashMap.put("scaleY", Integer.valueOf(this.IsOverlapping));
            }
            if (!Float.isNaN(this.getCause)) {
                hashMap.put(RVParams.PROGRESS, Integer.valueOf(this.IsOverlapping));
            }
            if (this.toIntRange.size() > 0) {
                for (String valueOf2 : this.toIntRange.keySet()) {
                    hashMap.put("CUSTOM,".concat(String.valueOf(valueOf2)), Integer.valueOf(this.IsOverlapping));
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r1.equals("transitionPathRotate") != false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ce
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            o.startIntentSenderForResult r2 = (o.startIntentSenderForResult) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003b
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap r3 = r6.toIntRange
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            o.startIntentSenderForResult$length r2 = (o.startIntentSenderForResult.length) r2
            int r3 = r6.length
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.IsOverlapping
            r2.append(r3, r1)
            goto L_0x0008
        L_0x003b:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00d0;
                case -1249320805: goto L_0x00c6;
                case -1225497657: goto L_0x00bb;
                case -1225497656: goto L_0x00b0;
                case -1225497655: goto L_0x00a5;
                case -1001078227: goto L_0x009a;
                case -908189618: goto L_0x008f;
                case -908189617: goto L_0x0084;
                case -760884510: goto L_0x007a;
                case -760884509: goto L_0x0070;
                case -40300674: goto L_0x0065;
                case -4379043: goto L_0x005a;
                case 37232917: goto L_0x0050;
                case 92909918: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x00da
        L_0x0045:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 0
            goto L_0x00db
        L_0x0050:
            java.lang.String r5 = "transitionPathRotate"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00da
            goto L_0x00db
        L_0x005a:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 1
            goto L_0x00db
        L_0x0065:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 2
            goto L_0x00db
        L_0x0070:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 6
            goto L_0x00db
        L_0x007a:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 5
            goto L_0x00db
        L_0x0084:
            java.lang.String r4 = "scaleY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 9
            goto L_0x00db
        L_0x008f:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 8
            goto L_0x00db
        L_0x009a:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 13
            goto L_0x00db
        L_0x00a5:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 12
            goto L_0x00db
        L_0x00b0:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 11
            goto L_0x00db
        L_0x00bb:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 10
            goto L_0x00db
        L_0x00c6:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 4
            goto L_0x00db
        L_0x00d0:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00da
            r4 = 3
            goto L_0x00db
        L_0x00da:
            r4 = -1
        L_0x00db:
            switch(r4) {
                case 0: goto L_0x01bd;
                case 1: goto L_0x01ac;
                case 2: goto L_0x019b;
                case 3: goto L_0x018a;
                case 4: goto L_0x0179;
                case 5: goto L_0x0168;
                case 6: goto L_0x0157;
                case 7: goto L_0x0146;
                case 8: goto L_0x0135;
                case 9: goto L_0x0124;
                case 10: goto L_0x0113;
                case 11: goto L_0x0102;
                case 12: goto L_0x00f1;
                case 13: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x0008
        L_0x00e0:
            float r1 = r6.getCause
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.getCause
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x00f1:
            float r1 = r6.onNavigationEvent
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.onNavigationEvent
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0102:
            float r1 = r6.ICustomTabsCallback
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.ICustomTabsCallback
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0113:
            float r1 = r6.invoke
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.invoke
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0124:
            float r1 = r6.invokeSuspend
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.invokeSuspend
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0135:
            float r1 = r6.valueOf
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.valueOf
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0146:
            float r1 = r6.Grayscale$Algorithm
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.Grayscale$Algorithm
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0157:
            float r1 = r6.hashCode
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.Mean$Arithmetic
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0168:
            float r1 = r6.toDoubleRange
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.FastBitmap$CoordinateSystem
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x0179:
            float r1 = r6.hashCode
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.hashCode
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x018a:
            float r1 = r6.toDoubleRange
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.toDoubleRange
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x019b:
            float r1 = r6.values
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.values
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x01ac:
            float r1 = r6.toString
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.toString
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x01bd:
            float r1 = r6.toFloatRange
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.length
            float r3 = r6.toFloatRange
            r2.setMin((int) r1, (float) r3)
            goto L_0x0008
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRetainCustomNonConfigurationInstance.length(java.util.HashMap):void");
    }

    static class setMax {
        private static SparseIntArray setMax;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setMax = sparseIntArray;
            sparseIntArray.append(to.length.ChecksSdkIntAtLeast, 1);
            setMax.append(to.length.ColorRes, 2);
            setMax.append(to.length.parameter, 4);
            setMax.append(to.length.ColorInt, 5);
            setMax.append(to.length.DimenRes, 6);
            setMax.append(to.length.CheckResult, 19);
            setMax.append(to.length.CallSuper, 20);
            setMax.append(to.length.codename, 7);
            setMax.append(to.length.DoNotInline, 8);
            setMax.append(to.length.DrawableRes, 9);
            setMax.append(to.length.FloatRange, 10);
            setMax.append(to.length.unit, 12);
            setMax.append(to.length.ContentView, 13);
            setMax.append(to.length.lambda, 14);
            setMax.append(to.length.suggest, 15);
            setMax.append(to.length.ColorLong, 16);
            setMax.append(to.length.Dimension, 17);
            setMax.append(to.length.from, 18);
        }

        public static void length(onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (setMax.get(index)) {
                    case 1:
                        float unused = onretaincustomnonconfigurationinstance.toFloatRange = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.toFloatRange);
                        break;
                    case 2:
                        float unused2 = onretaincustomnonconfigurationinstance.toString = typedArray.getDimension(index, onretaincustomnonconfigurationinstance.toString);
                        break;
                    case 4:
                        float unused3 = onretaincustomnonconfigurationinstance.values = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.values);
                        break;
                    case 5:
                        float unused4 = onretaincustomnonconfigurationinstance.toDoubleRange = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.toDoubleRange);
                        break;
                    case 6:
                        float unused5 = onretaincustomnonconfigurationinstance.hashCode = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.hashCode);
                        break;
                    case 7:
                        float unused6 = onretaincustomnonconfigurationinstance.valueOf = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.valueOf);
                        break;
                    case 8:
                        float unused7 = onretaincustomnonconfigurationinstance.Grayscale$Algorithm = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.Grayscale$Algorithm);
                        break;
                    case 9:
                        String unused8 = onretaincustomnonconfigurationinstance.equals = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                onretaincustomnonconfigurationinstance.getMax = typedArray.getResourceId(index, onretaincustomnonconfigurationinstance.getMax);
                                break;
                            } else {
                                onretaincustomnonconfigurationinstance.setMax = typedArray.getString(index);
                                break;
                            }
                        } else {
                            onretaincustomnonconfigurationinstance.getMax = typedArray.getResourceId(index, onretaincustomnonconfigurationinstance.getMax);
                            if (onretaincustomnonconfigurationinstance.getMax != -1) {
                                break;
                            } else {
                                onretaincustomnonconfigurationinstance.setMax = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        onretaincustomnonconfigurationinstance.length = typedArray.getInt(index, onretaincustomnonconfigurationinstance.length);
                        break;
                    case 13:
                        int unused9 = onretaincustomnonconfigurationinstance.IsOverlapping = typedArray.getInteger(index, onretaincustomnonconfigurationinstance.IsOverlapping);
                        break;
                    case 14:
                        float unused10 = onretaincustomnonconfigurationinstance.invokeSuspend = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.invokeSuspend);
                        break;
                    case 15:
                        float unused11 = onretaincustomnonconfigurationinstance.invoke = typedArray.getDimension(index, onretaincustomnonconfigurationinstance.invoke);
                        break;
                    case 16:
                        float unused12 = onretaincustomnonconfigurationinstance.ICustomTabsCallback = typedArray.getDimension(index, onretaincustomnonconfigurationinstance.ICustomTabsCallback);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = onretaincustomnonconfigurationinstance.onNavigationEvent = typedArray.getDimension(index, onretaincustomnonconfigurationinstance.onNavigationEvent);
                            break;
                        }
                    case 18:
                        float unused14 = onretaincustomnonconfigurationinstance.getCause = typedArray.getFloat(index, onretaincustomnonconfigurationinstance.getCause);
                        break;
                    case 19:
                        float unused15 = onretaincustomnonconfigurationinstance.FastBitmap$CoordinateSystem = typedArray.getDimension(index, onretaincustomnonconfigurationinstance.FastBitmap$CoordinateSystem);
                        break;
                    case 20:
                        float unused16 = onretaincustomnonconfigurationinstance.Mean$Arithmetic = typedArray.getDimension(index, onretaincustomnonconfigurationinstance.Mean$Arithmetic);
                        break;
                    default:
                        setMax.get(index);
                        break;
                }
            }
        }
    }
}
