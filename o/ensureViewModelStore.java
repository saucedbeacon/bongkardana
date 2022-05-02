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

public class ensureViewModelStore extends onRetainNonConfigurationInstance {
    /* access modifiers changed from: private */
    public float FastBitmap$CoordinateSystem = Float.NaN;
    /* access modifiers changed from: private */
    public float Grayscale$Algorithm = Float.NaN;
    /* access modifiers changed from: private */
    public float ICustomTabsCallback = Float.NaN;
    /* access modifiers changed from: private */
    public float IsOverlapping = Float.NaN;
    /* access modifiers changed from: private */
    public float Mean$Arithmetic = Float.NaN;
    /* access modifiers changed from: private */
    public float b = 0.0f;
    /* access modifiers changed from: private */
    public String equals;
    /* access modifiers changed from: private */
    public int getCause = 0;
    /* access modifiers changed from: private */
    public float hashCode = Float.NaN;
    /* access modifiers changed from: private */
    public float invoke = Float.NaN;
    /* access modifiers changed from: private */
    public float invokeSuspend = Float.NaN;
    /* access modifiers changed from: private */
    public float isInside = Float.NaN;
    /* access modifiers changed from: private */
    public float toDoubleRange = Float.NaN;
    /* access modifiers changed from: private */
    public int toFloatRange = -1;
    /* access modifiers changed from: private */
    public float toString = Float.NaN;
    /* access modifiers changed from: private */
    public float valueOf = Float.NaN;
    /* access modifiers changed from: private */
    public float values = Float.NaN;

    public ensureViewModelStore() {
        this.setMin = 3;
        this.toIntRange = new HashMap();
    }

    public final void getMin(Context context, AttributeSet attributeSet) {
        getMin.getMin(this, context.obtainStyledAttributes(attributeSet, to.length.OptIn));
    }

    public final void getMax(HashSet<String> hashSet) {
        if (!Float.isNaN(this.IsOverlapping)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.isInside)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.toString)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.toDoubleRange)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.values)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.invokeSuspend)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.invoke)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.Mean$Arithmetic)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.hashCode)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.FastBitmap$CoordinateSystem)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.valueOf)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.Grayscale$Algorithm)) {
            hashSet.add(RVParams.PROGRESS);
        }
        if (this.toIntRange.size() > 0) {
            for (String valueOf2 : this.toIntRange.keySet()) {
                hashSet.add("CUSTOM,".concat(String.valueOf(valueOf2)));
            }
        }
    }

    public final void getMax(HashMap<String, Integer> hashMap) {
        if (this.toFloatRange != -1) {
            if (!Float.isNaN(this.IsOverlapping)) {
                hashMap.put("alpha", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.isInside)) {
                hashMap.put("elevation", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.toString)) {
                hashMap.put("rotation", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.toDoubleRange)) {
                hashMap.put("rotationX", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.values)) {
                hashMap.put("rotationY", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.invokeSuspend)) {
                hashMap.put("translationX", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.invoke)) {
                hashMap.put("translationY", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.Mean$Arithmetic)) {
                hashMap.put("translationZ", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.hashCode)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.FastBitmap$CoordinateSystem)) {
                hashMap.put("scaleX", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.FastBitmap$CoordinateSystem)) {
                hashMap.put("scaleY", Integer.valueOf(this.toFloatRange));
            }
            if (!Float.isNaN(this.Grayscale$Algorithm)) {
                hashMap.put(RVParams.PROGRESS, Integer.valueOf(this.toFloatRange));
            }
            if (this.toIntRange.size() > 0) {
                for (String valueOf2 : this.toIntRange.keySet()) {
                    hashMap.put("CUSTOM,".concat(String.valueOf(valueOf2)), Integer.valueOf(this.toFloatRange));
                }
            }
        }
    }

    public final void length(HashMap<String, startIntentSenderForResult> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(java.util.HashMap<java.lang.String, o.onActivityResult> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            o.onActivityResult r3 = (o.onActivityResult) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap r2 = r10.toIntRange
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            o.onActivityResult$setMin r4 = (o.onActivityResult.setMin) r4
            int r5 = r10.length
            float r7 = r10.ICustomTabsCallback
            int r8 = r10.getCause
            float r9 = r10.b
            r4.length(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00bf;
                case -1249320805: goto L_0x00b5;
                case -1225497657: goto L_0x00aa;
                case -1225497656: goto L_0x009f;
                case -1225497655: goto L_0x0094;
                case -1001078227: goto L_0x0089;
                case -908189618: goto L_0x007f;
                case -908189617: goto L_0x0076;
                case -40300674: goto L_0x006c;
                case -4379043: goto L_0x0062;
                case 37232917: goto L_0x0057;
                case 92909918: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x00c9
        L_0x004c:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 0
            goto L_0x00ca
        L_0x0057:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 5
            goto L_0x00ca
        L_0x0062:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 1
            goto L_0x00ca
        L_0x006c:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 2
            goto L_0x00ca
        L_0x0076:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x007f:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 6
            goto L_0x00ca
        L_0x0089:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 11
            goto L_0x00ca
        L_0x0094:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 10
            goto L_0x00ca
        L_0x009f:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 9
            goto L_0x00ca
        L_0x00aa:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 8
            goto L_0x00ca
        L_0x00b5:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 4
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c9
            r4 = 3
            goto L_0x00ca
        L_0x00c9:
            r4 = -1
        L_0x00ca:
            switch(r4) {
                case 0: goto L_0x01cc;
                case 1: goto L_0x01b5;
                case 2: goto L_0x019e;
                case 3: goto L_0x0187;
                case 4: goto L_0x0170;
                case 5: goto L_0x0159;
                case 6: goto L_0x0142;
                case 7: goto L_0x012b;
                case 8: goto L_0x0114;
                case 9: goto L_0x00fd;
                case 10: goto L_0x00e6;
                case 11: goto L_0x00cf;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x0008
        L_0x00cf:
            float r1 = r10.Grayscale$Algorithm
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.Grayscale$Algorithm
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x00e6:
            float r1 = r10.Mean$Arithmetic
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.Mean$Arithmetic
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x00fd:
            float r1 = r10.invoke
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.invoke
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0114:
            float r1 = r10.invokeSuspend
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.invokeSuspend
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x012b:
            float r1 = r10.valueOf
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.valueOf
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0142:
            float r1 = r10.FastBitmap$CoordinateSystem
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.FastBitmap$CoordinateSystem
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0159:
            float r1 = r10.hashCode
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.hashCode
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0170:
            float r1 = r10.values
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.values
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0187:
            float r1 = r10.toDoubleRange
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.toDoubleRange
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x019e:
            float r1 = r10.toString
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.toString
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01b5:
            float r1 = r10.isInside
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.isInside
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01cc:
            float r1 = r10.IsOverlapping
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.length
            float r5 = r10.IsOverlapping
            float r6 = r10.ICustomTabsCallback
            int r7 = r10.getCause
            float r8 = r10.b
            r3.getMin(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ensureViewModelStore.getMin(java.util.HashMap):void");
    }

    static class getMin {
        private static SparseIntArray getMax;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            getMax = sparseIntArray;
            sparseIntArray.append(to.length.Nullable, 1);
            getMax.append(to.length.level, 2);
            getMax.append(to.length.RequiresApi, 4);
            getMax.append(to.length.RequiresOptIn, 5);
            getMax.append(to.length.RequiresFeature, 6);
            getMax.append(to.length.markerClass, 7);
            getMax.append(to.length.RequiresPermission$Read, 8);
            getMax.append(to.length.allOf, 9);
            getMax.append(to.length.conditional, 10);
            getMax.append(to.length.anyOf, 12);
            getMax.append(to.length.enforcement, 13);
            getMax.append(to.length.RawRes, 14);
            getMax.append(to.length.PluralsRes, 15);
            getMax.append(to.length.Px, 16);
            getMax.append(to.length.RequiresOptIn$Level, 17);
            getMax.append(to.length.RequiresPermission, 18);
            getMax.append(to.length.Size, 20);
            getMax.append(to.length.RequiresPermission$Write, 21);
            getMax.append(to.length.RestrictTo$Scope, 19);
        }

        public static void getMin(ensureViewModelStore ensureviewmodelstore, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (getMax.get(index)) {
                    case 1:
                        float unused = ensureviewmodelstore.IsOverlapping = typedArray.getFloat(index, ensureviewmodelstore.IsOverlapping);
                        break;
                    case 2:
                        float unused2 = ensureviewmodelstore.isInside = typedArray.getDimension(index, ensureviewmodelstore.isInside);
                        break;
                    case 4:
                        float unused3 = ensureviewmodelstore.toString = typedArray.getFloat(index, ensureviewmodelstore.toString);
                        break;
                    case 5:
                        float unused4 = ensureviewmodelstore.toDoubleRange = typedArray.getFloat(index, ensureviewmodelstore.toDoubleRange);
                        break;
                    case 6:
                        float unused5 = ensureviewmodelstore.values = typedArray.getFloat(index, ensureviewmodelstore.values);
                        break;
                    case 7:
                        float unused6 = ensureviewmodelstore.FastBitmap$CoordinateSystem = typedArray.getFloat(index, ensureviewmodelstore.FastBitmap$CoordinateSystem);
                        break;
                    case 8:
                        float unused7 = ensureviewmodelstore.hashCode = typedArray.getFloat(index, ensureviewmodelstore.hashCode);
                        break;
                    case 9:
                        String unused8 = ensureviewmodelstore.equals = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                ensureviewmodelstore.getMax = typedArray.getResourceId(index, ensureviewmodelstore.getMax);
                                break;
                            } else {
                                ensureviewmodelstore.setMax = typedArray.getString(index);
                                break;
                            }
                        } else {
                            ensureviewmodelstore.getMax = typedArray.getResourceId(index, ensureviewmodelstore.getMax);
                            if (ensureviewmodelstore.getMax != -1) {
                                break;
                            } else {
                                ensureviewmodelstore.setMax = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        ensureviewmodelstore.length = typedArray.getInt(index, ensureviewmodelstore.length);
                        break;
                    case 13:
                        int unused9 = ensureviewmodelstore.toFloatRange = typedArray.getInteger(index, ensureviewmodelstore.toFloatRange);
                        break;
                    case 14:
                        float unused10 = ensureviewmodelstore.valueOf = typedArray.getFloat(index, ensureviewmodelstore.valueOf);
                        break;
                    case 15:
                        float unused11 = ensureviewmodelstore.invokeSuspend = typedArray.getDimension(index, ensureviewmodelstore.invokeSuspend);
                        break;
                    case 16:
                        float unused12 = ensureviewmodelstore.invoke = typedArray.getDimension(index, ensureviewmodelstore.invoke);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = ensureviewmodelstore.Mean$Arithmetic = typedArray.getDimension(index, ensureviewmodelstore.Mean$Arithmetic);
                            break;
                        }
                    case 18:
                        float unused14 = ensureviewmodelstore.Grayscale$Algorithm = typedArray.getFloat(index, ensureviewmodelstore.Grayscale$Algorithm);
                        break;
                    case 19:
                        int unused15 = ensureviewmodelstore.getCause = typedArray.getInt(index, ensureviewmodelstore.getCause);
                        break;
                    case 20:
                        float unused16 = ensureviewmodelstore.ICustomTabsCallback = typedArray.getFloat(index, ensureviewmodelstore.ICustomTabsCallback);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused17 = ensureviewmodelstore.b = typedArray.getFloat(index, ensureviewmodelstore.b);
                            break;
                        } else {
                            float unused18 = ensureviewmodelstore.b = typedArray.getDimension(index, ensureviewmodelstore.b);
                            break;
                        }
                    default:
                        getMax.get(index);
                        break;
                }
            }
        }
    }
}
