package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.IResultReceiver;
import o.ResultReceiver;
import o.from;

public final class onBackPressed {
    public float FastBitmap$CoordinateSystem = 1.0f;
    public HashMap<String, startIntentSenderForResult> Grayscale$Algorithm;
    private getOnBackPressedDispatcher ICustomTabsCallback = new getOnBackPressedDispatcher();
    public float IsOverlapping = Float.NaN;
    public int Mean$Arithmetic = onRetainNonConfigurationInstance.getMin;
    private int b = 4;
    private String[] create;
    public IResultReceiver.Default[] equals;
    private float[] extraCallback = new float[4];
    private HashMap<String, onActivityResult> extraCallbackWithResult;
    private int[] getCause;
    int getMax;
    public getSavedStateRegistry getMin = new getSavedStateRegistry();
    public int[] hashCode;
    ArrayList<onRetainNonConfigurationInstance> invoke = new ArrayList<>();
    public HashMap<String, removeOnContextAvailableListener> invokeSuspend;
    public IResultReceiver.Default isInside;
    String length;
    private getViewModelStore[] onMessageChannelReady;
    private int onNavigationEvent = -1;
    public View setMax;
    public getSavedStateRegistry setMin = new getSavedStateRegistry();
    public ArrayList<getSavedStateRegistry> toDoubleRange = new ArrayList<>();
    public getOnBackPressedDispatcher toFloatRange = new getOnBackPressedDispatcher();
    public float toIntRange = 0.0f;
    public double[] toString;
    public float[] valueOf = new float[1];
    public double[] values;

    public onBackPressed(View view) {
        this.setMax = view;
        this.getMax = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.length = ((ConstraintLayout.LayoutParams) layoutParams).requestPostMessageChannel;
        }
    }

    public final void setMin(float[] fArr, int i) {
        float[] fArr2 = fArr;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, startIntentSenderForResult> hashMap = this.Grayscale$Algorithm;
        removeOnContextAvailableListener removeoncontextavailablelistener = null;
        startIntentSenderForResult startintentsenderforresult = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, startIntentSenderForResult> hashMap2 = this.Grayscale$Algorithm;
        startIntentSenderForResult startintentsenderforresult2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, removeOnContextAvailableListener> hashMap3 = this.invokeSuspend;
        removeOnContextAvailableListener removeoncontextavailablelistener2 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, removeOnContextAvailableListener> hashMap4 = this.invokeSuspend;
        if (hashMap4 != null) {
            removeoncontextavailablelistener = hashMap4.get("translationY");
        }
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = 0.0f;
            if (this.FastBitmap$CoordinateSystem != f) {
                if (f3 < this.toIntRange) {
                    f3 = 0.0f;
                }
                float f5 = this.toIntRange;
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = (f3 - f5) * this.FastBitmap$CoordinateSystem;
                }
            }
            double d = (double) f3;
            ResultReceiver.MyResultReceiver myResultReceiver = this.getMin.setMax;
            float f6 = Float.NaN;
            Iterator<getSavedStateRegistry> it = this.toDoubleRange.iterator();
            while (it.hasNext()) {
                getSavedStateRegistry next = it.next();
                if (next.setMax != null) {
                    if (next.setMin < f3) {
                        myResultReceiver = next.setMax;
                        f4 = next.setMin;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.setMin;
                    }
                }
                int i4 = i;
            }
            if (myResultReceiver != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f7 = f6 - f4;
                d = (double) ((((float) myResultReceiver.getMin((double) ((f3 - f4) / f7))) * f7) + f4);
            }
            this.equals[0].length(d, this.values);
            IResultReceiver.Default defaultR = this.isInside;
            if (defaultR != null) {
                double[] dArr = this.values;
                if (dArr.length > 0) {
                    defaultR.length(d, dArr);
                }
            }
            int i5 = i3 * 2;
            this.getMin.getMin(this.hashCode, this.values, fArr2, i5);
            if (removeoncontextavailablelistener2 != null) {
                fArr2[i5] = fArr2[i5] + removeoncontextavailablelistener2.getMin(f3);
            } else if (startintentsenderforresult != null) {
                fArr2[i5] = fArr2[i5] + startintentsenderforresult.length(f3);
            }
            if (removeoncontextavailablelistener != null) {
                int i6 = i5 + 1;
                fArr2[i6] = fArr2[i6] + removeoncontextavailablelistener.getMin(f3);
            } else if (startintentsenderforresult2 != null) {
                int i7 = i5 + 1;
                fArr2[i7] = fArr2[i7] + startintentsenderforresult2.length(f3);
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    private float getMin() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f2 = ((float) i) * 0.01010101f;
            double d3 = (double) f2;
            ResultReceiver.MyResultReceiver myResultReceiver = this.getMin.setMax;
            float f3 = Float.NaN;
            Iterator<getSavedStateRegistry> it = this.toDoubleRange.iterator();
            float f4 = 0.0f;
            while (it.hasNext()) {
                getSavedStateRegistry next = it.next();
                if (next.setMax != null) {
                    if (next.setMin < f2) {
                        myResultReceiver = next.setMax;
                        f4 = next.setMin;
                    } else if (Float.isNaN(f3)) {
                        f3 = next.setMin;
                    }
                }
            }
            if (myResultReceiver != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                float f5 = f3 - f4;
                d3 = (double) ((((float) myResultReceiver.getMin((double) ((f2 - f4) / f5))) * f5) + f4);
            }
            this.equals[0].length(d3, this.values);
            this.getMin.getMin(this.hashCode, this.values, fArr, 0);
            if (i > 0) {
                double d4 = (double) f;
                double d5 = (double) fArr[1];
                Double.isNaN(d5);
                double d6 = d2 - d5;
                double d7 = (double) fArr[0];
                Double.isNaN(d7);
                double hypot = Math.hypot(d6, d - d7);
                Double.isNaN(d4);
                f = (float) (d4 + hypot);
            }
            d = (double) fArr[0];
            d2 = (double) fArr[1];
        }
        return f;
    }

    public final int getMax(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] min = this.equals[0].getMin();
        if (iArr != null) {
            Iterator<getSavedStateRegistry> it = this.toDoubleRange.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().toDoubleRange;
                i++;
            }
        }
        int i2 = 0;
        for (double length2 : min) {
            this.equals[0].length(length2, this.values);
            this.getMin.getMin(this.hashCode, this.values, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0259, code lost:
        r1 = r19;
        r6 = r20;
        r4 = r30;
        r3 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0261, code lost:
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0263, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0401, code lost:
        r17 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0403, code lost:
        switch(r17) {
            case 0: goto L_0x0465;
            case 1: goto L_0x045f;
            case 2: goto L_0x0459;
            case 3: goto L_0x0453;
            case 4: goto L_0x044d;
            case 5: goto L_0x0447;
            case 6: goto L_0x0441;
            case 7: goto L_0x043b;
            case 8: goto L_0x0435;
            case 9: goto L_0x042f;
            case 10: goto L_0x0429;
            case 11: goto L_0x0423;
            case 12: goto L_0x041d;
            case 13: goto L_0x0417;
            case 14: goto L_0x0411;
            case 15: goto L_0x040b;
            default: goto L_0x0406;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0406, code lost:
        r17 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x040b, code lost:
        r17 = new o.startIntentSenderForResult.IsOverlapping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0411, code lost:
        r17 = new o.startIntentSenderForResult.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0417, code lost:
        r17 = new o.startIntentSenderForResult.toDoubleRange();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x041d, code lost:
        r17 = new o.startIntentSenderForResult.values();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0423, code lost:
        r17 = new o.startIntentSenderForResult.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0429, code lost:
        r17 = new o.startIntentSenderForResult.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x042f, code lost:
        r17 = new o.startIntentSenderForResult$FastBitmap$CoordinateSystem();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0435, code lost:
        r17 = new o.startIntentSenderForResult.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x043b, code lost:
        r17 = new o.startIntentSenderForResult.getMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0441, code lost:
        r17 = new o.startIntentSenderForResult.toIntRange();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0447, code lost:
        r17 = new o.startIntentSenderForResult.setMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x044d, code lost:
        r17 = new o.startIntentSenderForResult.isInside();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0453, code lost:
        r17 = new o.startIntentSenderForResult.toFloatRange();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0459, code lost:
        r17 = new o.startIntentSenderForResult.equals();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x045f, code lost:
        r17 = new o.startIntentSenderForResult.setMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0465, code lost:
        r17 = new o.startIntentSenderForResult.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x046a, code lost:
        r32 = r17;
        r17 = r8;
        r8 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08e4, code lost:
        r5 = r16;
        r13 = r17;
        r8 = r18;
        r6 = r19;
        r15 = r20;
        r10 = r25;
        r7 = r27;
        r4 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08f4, code lost:
        r14 = r30;
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x09ba, code lost:
        r13 = r17;
        r8 = r18;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x09e4, code lost:
        r15 = r20;
        r10 = r25;
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0aeb, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0aed, code lost:
        switch(r16) {
            case 0: goto L_0x0b42;
            case 1: goto L_0x0b3c;
            case 2: goto L_0x0b36;
            case 3: goto L_0x0b30;
            case 4: goto L_0x0b2a;
            case 5: goto L_0x0b24;
            case 6: goto L_0x0b1e;
            case 7: goto L_0x0b18;
            case 8: goto L_0x0b12;
            case 9: goto L_0x0b0c;
            case 10: goto L_0x0b06;
            case 11: goto L_0x0b00;
            case 12: goto L_0x0afa;
            case 13: goto L_0x0af4;
            default: goto L_0x0af0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0af0, code lost:
        r36 = r2;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0af4, code lost:
        r16 = new o.removeOnContextAvailableListener.equals();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0afa, code lost:
        r16 = new o.removeOnContextAvailableListener.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0b00, code lost:
        r16 = new o.removeOnContextAvailableListener.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0b06, code lost:
        r16 = new o.removeOnContextAvailableListener.toDoubleRange();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0b0c, code lost:
        r16 = new o.removeOnContextAvailableListener.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0b12, code lost:
        r16 = new o.removeOnContextAvailableListener.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0b18, code lost:
        r16 = new o.removeOnContextAvailableListener$FastBitmap$CoordinateSystem();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0b1e, code lost:
        r16 = new o.removeOnContextAvailableListener.toIntRange();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0b24, code lost:
        r16 = new o.removeOnContextAvailableListener.setMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0b2a, code lost:
        r16 = new o.removeOnContextAvailableListener.IsOverlapping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0b30, code lost:
        r16 = new o.removeOnContextAvailableListener.isInside();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0b36, code lost:
        r16 = new o.removeOnContextAvailableListener.toFloatRange();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0b3c, code lost:
        r16 = new o.removeOnContextAvailableListener.setMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0b42, code lost:
        r16 = new o.removeOnContextAvailableListener.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0b47, code lost:
        r36 = r2;
        r2 = r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(int r34, int r35, long r36) {
        /*
            r33 = this;
            r0 = r33
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.Mean$Arithmetic
            int r7 = o.onRetainNonConfigurationInstance.getMin
            if (r6 == r7) goto L_0x0029
            o.getSavedStateRegistry r6 = r0.getMin
            int r7 = r0.Mean$Arithmetic
            r6.toString = r7
        L_0x0029:
            o.getOnBackPressedDispatcher r6 = r0.toFloatRange
            o.getOnBackPressedDispatcher r7 = r0.ICustomTabsCallback
            float r8 = r6.setMin
            float r9 = r7.setMin
            boolean r8 = o.getOnBackPressedDispatcher.getMin(r8, r9)
            java.lang.String r9 = "alpha"
            if (r8 == 0) goto L_0x003c
            r3.add(r9)
        L_0x003c:
            float r8 = r6.setMax
            float r10 = r7.setMax
            boolean r8 = o.getOnBackPressedDispatcher.getMin(r8, r10)
            java.lang.String r10 = "elevation"
            if (r8 == 0) goto L_0x004b
            r3.add(r10)
        L_0x004b:
            int r8 = r6.getMin
            int r11 = r7.getMin
            if (r8 == r11) goto L_0x0060
            int r8 = r6.getMax
            if (r8 != 0) goto L_0x0060
            int r8 = r6.getMin
            if (r8 == 0) goto L_0x005d
            int r8 = r7.getMin
            if (r8 != 0) goto L_0x0060
        L_0x005d:
            r3.add(r9)
        L_0x0060:
            float r8 = r6.toFloatRange
            float r11 = r7.toFloatRange
            boolean r8 = o.getOnBackPressedDispatcher.getMin(r8, r11)
            java.lang.String r11 = "rotation"
            if (r8 == 0) goto L_0x006f
            r3.add(r11)
        L_0x006f:
            float r8 = r6.Grayscale$Algorithm
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r12 = "transitionPathRotate"
            if (r8 == 0) goto L_0x0081
            float r8 = r7.Grayscale$Algorithm
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L_0x0084
        L_0x0081:
            r3.add(r12)
        L_0x0084:
            float r8 = r6.create
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r13 = "progress"
            if (r8 == 0) goto L_0x0096
            float r8 = r7.create
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L_0x0099
        L_0x0096:
            r3.add(r13)
        L_0x0099:
            float r8 = r6.equals
            float r14 = r7.equals
            boolean r8 = o.getOnBackPressedDispatcher.getMin(r8, r14)
            java.lang.String r14 = "rotationX"
            if (r8 == 0) goto L_0x00a8
            r3.add(r14)
        L_0x00a8:
            float r8 = r6.isInside
            float r15 = r7.isInside
            boolean r8 = o.getOnBackPressedDispatcher.getMin(r8, r15)
            java.lang.String r15 = "rotationY"
            if (r8 == 0) goto L_0x00b7
            r3.add(r15)
        L_0x00b7:
            float r8 = r6.values
            r16 = r1
            float r1 = r7.values
            boolean r1 = o.getOnBackPressedDispatcher.getMin(r8, r1)
            java.lang.String r8 = "transformPivotX"
            if (r1 == 0) goto L_0x00c8
            r3.add(r8)
        L_0x00c8:
            float r1 = r6.toDoubleRange
            r17 = r14
            float r14 = r7.toDoubleRange
            boolean r1 = o.getOnBackPressedDispatcher.getMin(r1, r14)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r1 = "transformPivotY"
            r3.add(r1)
        L_0x00d9:
            float r1 = r6.IsOverlapping
            float r14 = r7.IsOverlapping
            boolean r1 = o.getOnBackPressedDispatcher.getMin(r1, r14)
            java.lang.String r14 = "scaleX"
            if (r1 == 0) goto L_0x00e8
            r3.add(r14)
        L_0x00e8:
            float r1 = r6.toIntRange
            r18 = r15
            float r15 = r7.toIntRange
            boolean r1 = o.getOnBackPressedDispatcher.getMin(r1, r15)
            java.lang.String r15 = "scaleY"
            if (r1 == 0) goto L_0x00f9
            r3.add(r15)
        L_0x00f9:
            float r1 = r6.toString
            r19 = r13
            float r13 = r7.toString
            boolean r1 = o.getOnBackPressedDispatcher.getMin(r1, r13)
            java.lang.String r13 = "translationX"
            if (r1 == 0) goto L_0x010a
            r3.add(r13)
        L_0x010a:
            float r1 = r6.hashCode
            r20 = r13
            float r13 = r7.hashCode
            boolean r1 = o.getOnBackPressedDispatcher.getMin(r1, r13)
            java.lang.String r13 = "translationY"
            if (r1 == 0) goto L_0x011b
            r3.add(r13)
        L_0x011b:
            float r1 = r6.FastBitmap$CoordinateSystem
            float r6 = r7.FastBitmap$CoordinateSystem
            boolean r1 = o.getOnBackPressedDispatcher.getMin(r1, r6)
            java.lang.String r6 = "translationZ"
            if (r1 == 0) goto L_0x012a
            r3.add(r6)
        L_0x012a:
            java.util.ArrayList<o.onRetainNonConfigurationInstance> r1 = r0.invoke
            r21 = 1
            if (r1 == 0) goto L_0x01bc
            java.util.Iterator r1 = r1.iterator()
            r22 = 0
        L_0x0136:
            boolean r23 = r1.hasNext()
            if (r23 == 0) goto L_0x01b5
            java.lang.Object r23 = r1.next()
            r7 = r23
            o.onRetainNonConfigurationInstance r7 = (o.onRetainNonConfigurationInstance) r7
            r23 = r1
            boolean r1 = r7 instanceof o.peekAvailableContext
            if (r1 == 0) goto L_0x017e
            o.peekAvailableContext r7 = (o.peekAvailableContext) r7
            o.getSavedStateRegistry r1 = new o.getSavedStateRegistry
            r30 = r13
            o.getSavedStateRegistry r13 = r0.getMin
            r31 = r6
            o.getSavedStateRegistry r6 = r0.setMin
            r24 = r1
            r25 = r34
            r26 = r35
            r27 = r7
            r28 = r13
            r29 = r6
            r24.<init>(r25, r26, r27, r28, r29)
            java.util.ArrayList<o.getSavedStateRegistry> r6 = r0.toDoubleRange
            int r6 = java.util.Collections.binarySearch(r6, r1)
            java.util.ArrayList<o.getSavedStateRegistry> r13 = r0.toDoubleRange
            int r6 = -r6
            int r6 = r6 + -1
            r13.add(r6, r1)
            int r1 = r7.valueOf
            int r6 = o.onRetainNonConfigurationInstance.getMin
            if (r1 == r6) goto L_0x01ae
            int r1 = r7.valueOf
            r0.onNavigationEvent = r1
            goto L_0x01ae
        L_0x017e:
            r31 = r6
            r30 = r13
            boolean r1 = r7 instanceof o.addOnContextAvailableListener
            if (r1 == 0) goto L_0x018a
            r7.getMax((java.util.HashSet<java.lang.String>) r4)
            goto L_0x01ae
        L_0x018a:
            boolean r1 = r7 instanceof o.ensureViewModelStore
            if (r1 == 0) goto L_0x0192
            r7.getMax((java.util.HashSet<java.lang.String>) r2)
            goto L_0x01ae
        L_0x0192:
            boolean r1 = r7 instanceof o.getViewModelStore
            if (r1 == 0) goto L_0x01a8
            if (r22 != 0) goto L_0x019e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x01a0
        L_0x019e:
            r1 = r22
        L_0x01a0:
            o.getViewModelStore r7 = (o.getViewModelStore) r7
            r1.add(r7)
            r22 = r1
            goto L_0x01ae
        L_0x01a8:
            r7.getMax((java.util.HashMap<java.lang.String, java.lang.Integer>) r5)
            r7.getMax((java.util.HashSet<java.lang.String>) r3)
        L_0x01ae:
            r1 = r23
            r13 = r30
            r6 = r31
            goto L_0x0136
        L_0x01b5:
            r31 = r6
            r30 = r13
            r1 = r22
            goto L_0x01c1
        L_0x01bc:
            r31 = r6
            r30 = r13
            r1 = 0
        L_0x01c1:
            r6 = 0
            if (r1 == 0) goto L_0x01ce
            o.getViewModelStore[] r7 = new o.getViewModelStore[r6]
            java.lang.Object[] r1 = r1.toArray(r7)
            o.getViewModelStore[] r1 = (o.getViewModelStore[]) r1
            r0.onMessageChannelReady = r1
        L_0x01ce:
            boolean r1 = r3.isEmpty()
            java.lang.String r7 = "CUSTOM,"
            if (r1 != 0) goto L_0x0506
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.Grayscale$Algorithm = r1
            java.util.Iterator r1 = r3.iterator()
        L_0x01e1:
            boolean r23 = r1.hasNext()
            if (r23 == 0) goto L_0x0493
            java.lang.Object r23 = r1.next()
            r13 = r23
            java.lang.String r13 = (java.lang.String) r13
            boolean r23 = r13.startsWith(r7)
            if (r23 == 0) goto L_0x024c
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r25 = r1
            java.lang.String r1 = ","
            java.lang.String[] r1 = r13.split(r1)
            r1 = r1[r21]
            r26 = r4
            java.util.ArrayList<o.onRetainNonConfigurationInstance> r4 = r0.invoke
            java.util.Iterator r4 = r4.iterator()
        L_0x020c:
            boolean r27 = r4.hasNext()
            if (r27 == 0) goto L_0x0236
            java.lang.Object r27 = r4.next()
            r28 = r4
            r4 = r27
            o.onRetainNonConfigurationInstance r4 = (o.onRetainNonConfigurationInstance) r4
            r27 = r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r4.toIntRange
            if (r3 == 0) goto L_0x0231
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r4.toIntRange
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            if (r3 == 0) goto L_0x0231
            int r4 = r4.length
            r6.append(r4, r3)
        L_0x0231:
            r3 = r27
            r4 = r28
            goto L_0x020c
        L_0x0236:
            r27 = r3
            o.startIntentSenderForResult$length r1 = new o.startIntentSenderForResult$length
            r1.<init>(r13, r6)
            r6 = r20
            r4 = r30
            r3 = r31
            r32 = r8
            r8 = r1
            r1 = r19
            r19 = r32
            goto L_0x0470
        L_0x024c:
            r25 = r1
            r27 = r3
            r26 = r4
            int r1 = r13.hashCode()
            switch(r1) {
                case -1249320806: goto L_0x03ec;
                case -1249320805: goto L_0x03cf;
                case -1225497657: goto L_0x03b8;
                case -1225497656: goto L_0x039a;
                case -1225497655: goto L_0x0378;
                case -1001078227: goto L_0x0354;
                case -908189618: goto L_0x033c;
                case -908189617: goto L_0x0324;
                case -797520672: goto L_0x030a;
                case -760884510: goto L_0x02f3;
                case -760884509: goto L_0x02da;
                case -40300674: goto L_0x02c4;
                case -4379043: goto L_0x02ae;
                case 37232917: goto L_0x0297;
                case 92909918: goto L_0x0281;
                case 156108012: goto L_0x0267;
                default: goto L_0x0259;
            }
        L_0x0259:
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
        L_0x0261:
            r19 = r8
        L_0x0263:
            r8 = r17
            goto L_0x0401
        L_0x0267:
            java.lang.String r1 = "waveOffset"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0259
            r1 = 10
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 10
            goto L_0x0403
        L_0x0281:
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x0259
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 0
            goto L_0x0403
        L_0x0297:
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x0259
            r1 = 7
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 7
            goto L_0x0403
        L_0x02ae:
            boolean r1 = r13.equals(r10)
            if (r1 == 0) goto L_0x0259
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 1
            goto L_0x0403
        L_0x02c4:
            boolean r1 = r13.equals(r11)
            if (r1 == 0) goto L_0x0259
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 2
            goto L_0x0403
        L_0x02da:
            java.lang.String r1 = "transformPivotY"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0259
            r1 = 6
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 6
            goto L_0x0403
        L_0x02f3:
            boolean r1 = r13.equals(r8)
            if (r1 == 0) goto L_0x0259
            r1 = 5
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 5
            goto L_0x0403
        L_0x030a:
            java.lang.String r1 = "waveVariesBy"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0259
            r1 = 11
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 11
            goto L_0x0403
        L_0x0324:
            boolean r1 = r13.equals(r15)
            if (r1 == 0) goto L_0x0259
            r1 = 9
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 9
            goto L_0x0403
        L_0x033c:
            boolean r1 = r13.equals(r14)
            if (r1 == 0) goto L_0x0259
            r1 = 8
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            r17 = 8
            goto L_0x0403
        L_0x0354:
            r1 = r19
            boolean r3 = r13.equals(r1)
            if (r3 == 0) goto L_0x036c
            r3 = 15
            r19 = r8
            r8 = r17
            r6 = r20
            r4 = r30
            r3 = r31
            r17 = 15
            goto L_0x0403
        L_0x036c:
            r19 = r8
            r8 = r17
            r6 = r20
            r4 = r30
            r3 = r31
            goto L_0x0401
        L_0x0378:
            r1 = r19
            r3 = r31
            boolean r4 = r13.equals(r3)
            if (r4 == 0) goto L_0x0390
            r4 = 14
            r19 = r8
            r8 = r17
            r6 = r20
            r4 = r30
            r17 = 14
            goto L_0x0403
        L_0x0390:
            r19 = r8
            r8 = r17
            r6 = r20
            r4 = r30
            goto L_0x0401
        L_0x039a:
            r1 = r19
            r4 = r30
            r3 = r31
            boolean r6 = r13.equals(r4)
            if (r6 == 0) goto L_0x03b1
            r6 = 13
            r19 = r8
            r8 = r17
            r6 = r20
            r17 = 13
            goto L_0x0403
        L_0x03b1:
            r19 = r8
            r8 = r17
            r6 = r20
            goto L_0x0401
        L_0x03b8:
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            boolean r19 = r13.equals(r6)
            if (r19 == 0) goto L_0x0261
            r19 = 12
            r19 = r8
            r8 = r17
            r17 = 12
            goto L_0x0403
        L_0x03cf:
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r18
            boolean r18 = r13.equals(r8)
            if (r18 == 0) goto L_0x03e8
            r18 = r8
            r8 = r17
            r17 = 4
            goto L_0x0403
        L_0x03e8:
            r18 = r8
            goto L_0x0263
        L_0x03ec:
            r1 = r19
            r6 = r20
            r4 = r30
            r3 = r31
            r19 = r8
            r8 = r17
            boolean r17 = r13.equals(r8)
            if (r17 == 0) goto L_0x0401
            r17 = 3
            goto L_0x0403
        L_0x0401:
            r17 = -1
        L_0x0403:
            switch(r17) {
                case 0: goto L_0x0465;
                case 1: goto L_0x045f;
                case 2: goto L_0x0459;
                case 3: goto L_0x0453;
                case 4: goto L_0x044d;
                case 5: goto L_0x0447;
                case 6: goto L_0x0441;
                case 7: goto L_0x043b;
                case 8: goto L_0x0435;
                case 9: goto L_0x042f;
                case 10: goto L_0x0429;
                case 11: goto L_0x0423;
                case 12: goto L_0x041d;
                case 13: goto L_0x0417;
                case 14: goto L_0x0411;
                case 15: goto L_0x040b;
                default: goto L_0x0406;
            }
        L_0x0406:
            r17 = r8
            r8 = 0
            goto L_0x0470
        L_0x040b:
            o.startIntentSenderForResult$IsOverlapping r17 = new o.startIntentSenderForResult$IsOverlapping
            r17.<init>()
            goto L_0x046a
        L_0x0411:
            o.startIntentSenderForResult$toString r17 = new o.startIntentSenderForResult$toString
            r17.<init>()
            goto L_0x046a
        L_0x0417:
            o.startIntentSenderForResult$toDoubleRange r17 = new o.startIntentSenderForResult$toDoubleRange
            r17.<init>()
            goto L_0x046a
        L_0x041d:
            o.startIntentSenderForResult$values r17 = new o.startIntentSenderForResult$values
            r17.<init>()
            goto L_0x046a
        L_0x0423:
            o.startIntentSenderForResult$getMax r17 = new o.startIntentSenderForResult$getMax
            r17.<init>()
            goto L_0x046a
        L_0x0429:
            o.startIntentSenderForResult$getMax r17 = new o.startIntentSenderForResult$getMax
            r17.<init>()
            goto L_0x046a
        L_0x042f:
            o.startIntentSenderForResult$FastBitmap$CoordinateSystem r17 = new o.startIntentSenderForResult$FastBitmap$CoordinateSystem
            r17.<init>()
            goto L_0x046a
        L_0x0435:
            o.startIntentSenderForResult$hashCode r17 = new o.startIntentSenderForResult$hashCode
            r17.<init>()
            goto L_0x046a
        L_0x043b:
            o.startIntentSenderForResult$getMin r17 = new o.startIntentSenderForResult$getMin
            r17.<init>()
            goto L_0x046a
        L_0x0441:
            o.startIntentSenderForResult$toIntRange r17 = new o.startIntentSenderForResult$toIntRange
            r17.<init>()
            goto L_0x046a
        L_0x0447:
            o.startIntentSenderForResult$setMin r17 = new o.startIntentSenderForResult$setMin
            r17.<init>()
            goto L_0x046a
        L_0x044d:
            o.startIntentSenderForResult$isInside r17 = new o.startIntentSenderForResult$isInside
            r17.<init>()
            goto L_0x046a
        L_0x0453:
            o.startIntentSenderForResult$toFloatRange r17 = new o.startIntentSenderForResult$toFloatRange
            r17.<init>()
            goto L_0x046a
        L_0x0459:
            o.startIntentSenderForResult$equals r17 = new o.startIntentSenderForResult$equals
            r17.<init>()
            goto L_0x046a
        L_0x045f:
            o.startIntentSenderForResult$setMax r17 = new o.startIntentSenderForResult$setMax
            r17.<init>()
            goto L_0x046a
        L_0x0465:
            o.startIntentSenderForResult$getMax r17 = new o.startIntentSenderForResult$getMax
            r17.<init>()
        L_0x046a:
            r32 = r17
            r17 = r8
            r8 = r32
        L_0x0470:
            if (r8 == 0) goto L_0x0480
            r8.setMin = r13
            r20 = r6
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r6 = r0.Grayscale$Algorithm
            r6.put(r13, r8)
            r31 = r3
            r30 = r4
            goto L_0x0486
        L_0x0480:
            r31 = r3
            r30 = r4
            r20 = r6
        L_0x0486:
            r8 = r19
            r4 = r26
            r3 = r27
            r6 = 0
            r19 = r1
            r1 = r25
            goto L_0x01e1
        L_0x0493:
            r27 = r3
            r26 = r4
            r1 = r19
            r4 = r30
            r3 = r31
            java.util.ArrayList<o.onRetainNonConfigurationInstance> r6 = r0.invoke
            if (r6 == 0) goto L_0x04bb
            java.util.Iterator r6 = r6.iterator()
        L_0x04a5:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x04bb
            java.lang.Object r8 = r6.next()
            o.onRetainNonConfigurationInstance r8 = (o.onRetainNonConfigurationInstance) r8
            boolean r13 = r8 instanceof o.onRetainCustomNonConfigurationInstance
            if (r13 == 0) goto L_0x04a5
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r13 = r0.Grayscale$Algorithm
            r8.length((java.util.HashMap<java.lang.String, o.startIntentSenderForResult>) r13)
            goto L_0x04a5
        L_0x04bb:
            o.getOnBackPressedDispatcher r6 = r0.toFloatRange
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r8 = r0.Grayscale$Algorithm
            r13 = 0
            r6.setMax(r8, r13)
            o.getOnBackPressedDispatcher r6 = r0.ICustomTabsCallback
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r8 = r0.Grayscale$Algorithm
            r13 = 100
            r6.setMax(r8, r13)
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r6 = r0.Grayscale$Algorithm
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x04d6:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0510
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r13 = r5.containsKey(r8)
            if (r13 == 0) goto L_0x04f5
            java.lang.Object r13 = r5.get(r8)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r19 = r6
            goto L_0x04f8
        L_0x04f5:
            r19 = r6
            r13 = 0
        L_0x04f8:
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r6 = r0.Grayscale$Algorithm
            java.lang.Object r6 = r6.get(r8)
            o.startIntentSenderForResult r6 = (o.startIntentSenderForResult) r6
            r6.setMin(r13)
            r6 = r19
            goto L_0x04d6
        L_0x0506:
            r27 = r3
            r26 = r4
            r1 = r19
            r4 = r30
            r3 = r31
        L_0x0510:
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0608
            java.util.HashMap<java.lang.String, o.onActivityResult> r6 = r0.extraCallbackWithResult
            if (r6 != 0) goto L_0x0521
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0.extraCallbackWithResult = r6
        L_0x0521:
            java.util.Iterator r2 = r2.iterator()
        L_0x0525:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x05b0
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, o.onActivityResult> r8 = r0.extraCallbackWithResult
            boolean r8 = r8.containsKey(r6)
            if (r8 != 0) goto L_0x05a4
            boolean r8 = r6.startsWith(r7)
            if (r8 == 0) goto L_0x058a
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            java.lang.String r13 = ","
            java.lang.String[] r13 = r6.split(r13)
            r13 = r13[r21]
            r19 = r2
            java.util.ArrayList<o.onRetainNonConfigurationInstance> r2 = r0.invoke
            java.util.Iterator r2 = r2.iterator()
        L_0x0554:
            boolean r25 = r2.hasNext()
            if (r25 == 0) goto L_0x057e
            java.lang.Object r25 = r2.next()
            r28 = r2
            r2 = r25
            o.onRetainNonConfigurationInstance r2 = (o.onRetainNonConfigurationInstance) r2
            r30 = r4
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r2.toIntRange
            if (r4 == 0) goto L_0x0579
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r2.toIntRange
            java.lang.Object r4 = r4.get(r13)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            if (r4 == 0) goto L_0x0579
            int r2 = r2.length
            r8.append(r2, r4)
        L_0x0579:
            r2 = r28
            r4 = r30
            goto L_0x0554
        L_0x057e:
            r30 = r4
            o.onActivityResult r2 = o.onActivityResult.getMax(r6, r8)
            r4 = r2
            r31 = r3
            r2 = r36
            goto L_0x0596
        L_0x058a:
            r19 = r2
            r31 = r3
            r30 = r4
            r2 = r36
            o.onActivityResult r4 = o.onActivityResult.setMin(r6, r2)
        L_0x0596:
            if (r4 == 0) goto L_0x059f
            r4.getMin = r6
            java.util.HashMap<java.lang.String, o.onActivityResult> r8 = r0.extraCallbackWithResult
            r8.put(r6, r4)
        L_0x059f:
            r2 = r19
            r4 = r30
            goto L_0x05ac
        L_0x05a4:
            r19 = r2
            r31 = r3
            r2 = r36
            r2 = r19
        L_0x05ac:
            r3 = r31
            goto L_0x0525
        L_0x05b0:
            r31 = r3
            r30 = r4
            java.util.ArrayList<o.onRetainNonConfigurationInstance> r2 = r0.invoke
            if (r2 == 0) goto L_0x05d4
            java.util.Iterator r2 = r2.iterator()
        L_0x05bc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05d4
            java.lang.Object r3 = r2.next()
            o.onRetainNonConfigurationInstance r3 = (o.onRetainNonConfigurationInstance) r3
            boolean r4 = r3 instanceof o.ensureViewModelStore
            if (r4 == 0) goto L_0x05bc
            o.ensureViewModelStore r3 = (o.ensureViewModelStore) r3
            java.util.HashMap<java.lang.String, o.onActivityResult> r4 = r0.extraCallbackWithResult
            r3.getMin((java.util.HashMap<java.lang.String, o.onActivityResult>) r4)
            goto L_0x05bc
        L_0x05d4:
            java.util.HashMap<java.lang.String, o.onActivityResult> r2 = r0.extraCallbackWithResult
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x05de:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x060c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r5.containsKey(r3)
            if (r4 == 0) goto L_0x05fb
            java.lang.Object r4 = r5.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x05fc
        L_0x05fb:
            r4 = 0
        L_0x05fc:
            java.util.HashMap<java.lang.String, o.onActivityResult> r6 = r0.extraCallbackWithResult
            java.lang.Object r3 = r6.get(r3)
            o.onActivityResult r3 = (o.onActivityResult) r3
            r3.setMin(r4)
            goto L_0x05de
        L_0x0608:
            r31 = r3
            r30 = r4
        L_0x060c:
            java.util.ArrayList<o.getSavedStateRegistry> r2 = r0.toDoubleRange
            int r2 = r2.size()
            r3 = 2
            int r2 = r2 + r3
            o.getSavedStateRegistry[] r3 = new o.getSavedStateRegistry[r2]
            o.getSavedStateRegistry r4 = r0.getMin
            r5 = 0
            r3[r5] = r4
            int r4 = r2 + -1
            o.getSavedStateRegistry r6 = r0.setMin
            r3[r4] = r6
            java.util.ArrayList<o.getSavedStateRegistry> r4 = r0.toDoubleRange
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0631
            int r4 = r0.onNavigationEvent
            r13 = -1
            if (r4 != r13) goto L_0x0632
            r0.onNavigationEvent = r5
            goto L_0x0632
        L_0x0631:
            r13 = -1
        L_0x0632:
            java.util.ArrayList<o.getSavedStateRegistry> r4 = r0.toDoubleRange
            java.util.Iterator r4 = r4.iterator()
            r5 = 1
        L_0x0639:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x064b
            java.lang.Object r6 = r4.next()
            o.getSavedStateRegistry r6 = (o.getSavedStateRegistry) r6
            int r8 = r5 + 1
            r3[r5] = r6
            r5 = r8
            goto L_0x0639
        L_0x064b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            o.getSavedStateRegistry r5 = r0.setMin
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r5.FastBitmap$CoordinateSystem
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x065c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x068c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            o.getSavedStateRegistry r8 = r0.getMin
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r8 = r8.FastBitmap$CoordinateSystem
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L_0x0686
            java.lang.String r8 = java.lang.String.valueOf(r6)
            java.lang.String r8 = r7.concat(r8)
            r13 = r27
            boolean r8 = r13.contains(r8)
            if (r8 != 0) goto L_0x0688
            r4.add(r6)
            goto L_0x0688
        L_0x0686:
            r13 = r27
        L_0x0688:
            r27 = r13
            r13 = -1
            goto L_0x065c
        L_0x068c:
            r6 = 0
            java.lang.String[] r5 = new java.lang.String[r6]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r0.create = r4
            int r4 = r4.length
            int[] r4 = new int[r4]
            r0.getCause = r4
            r4 = 0
        L_0x069d:
            java.lang.String[] r5 = r0.create
            int r6 = r5.length
            if (r4 >= r6) goto L_0x06d2
            r5 = r5[r4]
            int[] r6 = r0.getCause
            r7 = 0
            r6[r4] = r7
            r6 = 0
        L_0x06aa:
            if (r6 >= r2) goto L_0x06cf
            r7 = r3[r6]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r7 = r7.FastBitmap$CoordinateSystem
            boolean r7 = r7.containsKey(r5)
            if (r7 == 0) goto L_0x06cc
            int[] r7 = r0.getCause
            r8 = r7[r4]
            r6 = r3[r6]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r6.FastBitmap$CoordinateSystem
            java.lang.Object r5 = r6.get(r5)
            androidx.constraintlayout.widget.ConstraintAttribute r5 = (androidx.constraintlayout.widget.ConstraintAttribute) r5
            int r5 = r5.setMin()
            int r8 = r8 + r5
            r7[r4] = r8
            goto L_0x06cf
        L_0x06cc:
            int r6 = r6 + 1
            goto L_0x06aa
        L_0x06cf:
            int r4 = r4 + 1
            goto L_0x069d
        L_0x06d2:
            r4 = 0
            r5 = r3[r4]
            int r4 = r5.toString
            int r5 = o.onRetainNonConfigurationInstance.getMin
            if (r4 == r5) goto L_0x06dd
            r4 = 1
            goto L_0x06de
        L_0x06dd:
            r4 = 0
        L_0x06de:
            java.lang.String[] r5 = r0.create
            int r5 = r5.length
            int r5 = r5 + 18
            boolean[] r6 = new boolean[r5]
            r7 = 1
        L_0x06e6:
            if (r7 >= r2) goto L_0x0748
            r8 = r3[r7]
            int r13 = r7 + -1
            r13 = r3[r13]
            r19 = 0
            boolean r23 = r6[r19]
            r25 = r1
            float r1 = r8.length
            r27 = r14
            float r14 = r13.length
            boolean r1 = o.getSavedStateRegistry.setMin(r1, r14)
            r1 = r23 | r1
            r6[r19] = r1
            boolean r1 = r6[r21]
            float r14 = r8.toFloatRange
            r19 = r15
            float r15 = r13.toFloatRange
            boolean r14 = o.getSavedStateRegistry.setMin(r14, r15)
            r14 = r14 | r4
            r1 = r1 | r14
            r6[r21] = r1
            r1 = 2
            boolean r14 = r6[r1]
            float r15 = r8.equals
            float r1 = r13.equals
            boolean r1 = o.getSavedStateRegistry.setMin(r15, r1)
            r1 = r1 | r4
            r1 = r1 | r14
            r14 = 2
            r6[r14] = r1
            r1 = 3
            boolean r14 = r6[r1]
            float r15 = r8.isInside
            float r1 = r13.isInside
            boolean r1 = o.getSavedStateRegistry.setMin(r15, r1)
            r1 = r1 | r14
            r14 = 3
            r6[r14] = r1
            r1 = 4
            boolean r15 = r6[r1]
            float r8 = r8.IsOverlapping
            float r13 = r13.IsOverlapping
            boolean r8 = o.getSavedStateRegistry.setMin(r8, r13)
            r8 = r8 | r15
            r6[r1] = r8
            int r7 = r7 + 1
            r15 = r19
            r1 = r25
            r14 = r27
            goto L_0x06e6
        L_0x0748:
            r25 = r1
            r27 = r14
            r19 = r15
            r1 = 4
            r14 = 3
            r4 = 0
            r7 = 1
        L_0x0752:
            if (r7 >= r5) goto L_0x075d
            boolean r8 = r6[r7]
            if (r8 == 0) goto L_0x075a
            int r4 = r4 + 1
        L_0x075a:
            int r7 = r7 + 1
            goto L_0x0752
        L_0x075d:
            int[] r4 = new int[r4]
            r0.hashCode = r4
            int r7 = r4.length
            double[] r7 = new double[r7]
            r0.values = r7
            int r4 = r4.length
            double[] r4 = new double[r4]
            r0.toString = r4
            r4 = 0
            r7 = 1
        L_0x076d:
            if (r7 >= r5) goto L_0x077d
            boolean r8 = r6[r7]
            if (r8 == 0) goto L_0x077a
            int[] r8 = r0.hashCode
            int r13 = r4 + 1
            r8[r4] = r7
            r4 = r13
        L_0x077a:
            int r7 = r7 + 1
            goto L_0x076d
        L_0x077d:
            int[] r4 = r0.hashCode
            int r4 = r4.length
            r5 = 2
            int[] r6 = new int[r5]
            r6[r21] = r4
            r4 = 0
            r6[r4] = r2
            r4 = r16
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r4, r6)
            double[][] r5 = (double[][]) r5
            double[] r6 = new double[r2]
            r7 = 0
        L_0x0793:
            if (r7 >= r2) goto L_0x07a9
            r8 = r3[r7]
            r13 = r5[r7]
            int[] r15 = r0.hashCode
            r8.getMin(r13, r15)
            r8 = r3[r7]
            float r8 = r8.setMin
            double r14 = (double) r8
            r6[r7] = r14
            int r7 = r7 + 1
            r14 = 3
            goto L_0x0793
        L_0x07a9:
            r7 = 0
        L_0x07aa:
            int[] r8 = r0.hashCode
            int r13 = r8.length
            if (r7 >= r13) goto L_0x07bb
            r8 = r8[r7]
            java.lang.String[] r13 = o.getSavedStateRegistry.getMin
            int r13 = r13.length
            if (r8 >= r13) goto L_0x07b8
            java.lang.String[] r8 = o.getSavedStateRegistry.getMin
        L_0x07b8:
            int r7 = r7 + 1
            goto L_0x07aa
        L_0x07bb:
            java.lang.String[] r7 = r0.create
            int r7 = r7.length
            int r7 = r7 + 1
            o.IResultReceiver$Default[] r7 = new o.IResultReceiver.Default[r7]
            r0.equals = r7
            r7 = 0
        L_0x07c5:
            java.lang.String[] r8 = r0.create
            int r13 = r8.length
            if (r7 >= r13) goto L_0x0841
            r8 = r8[r7]
            r1 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x07d0:
            if (r13 >= r2) goto L_0x0821
            r16 = r11
            r11 = r3[r13]
            boolean r11 = r11.getMin(r8)
            if (r11 == 0) goto L_0x0818
            if (r1 != 0) goto L_0x0800
            double[] r1 = new double[r2]
            r11 = r3[r13]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.FastBitmap$CoordinateSystem
            java.lang.Object r11 = r11.get(r8)
            androidx.constraintlayout.widget.ConstraintAttribute r11 = (androidx.constraintlayout.widget.ConstraintAttribute) r11
            int r11 = r11.setMin()
            r28 = r1
            r15 = 2
            int[] r1 = new int[r15]
            r1[r21] = r11
            r11 = 0
            r1[r11] = r2
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r4, r1)
            double[][] r1 = (double[][]) r1
            r15 = r28
        L_0x0800:
            r11 = r3[r13]
            float r11 = r11.setMin
            r28 = r10
            double r10 = (double) r11
            r15[r14] = r10
            r10 = r3[r13]
            r11 = r1[r14]
            r36 = r1
            r1 = 0
            r10.getMax(r8, r11, r1)
            int r14 = r14 + 1
            r1 = r36
            goto L_0x081a
        L_0x0818:
            r28 = r10
        L_0x081a:
            int r13 = r13 + 1
            r11 = r16
            r10 = r28
            goto L_0x07d0
        L_0x0821:
            r28 = r10
            r16 = r11
            double[] r8 = java.util.Arrays.copyOf(r15, r14)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r14)
            double[][] r1 = (double[][]) r1
            o.IResultReceiver$Default[] r10 = r0.equals
            int r7 = r7 + 1
            int r11 = r0.onNavigationEvent
            o.IResultReceiver$Default r1 = o.IResultReceiver.Default.length(r11, r8, r1)
            r10[r7] = r1
            r11 = r16
            r10 = r28
            r1 = 4
            goto L_0x07c5
        L_0x0841:
            r28 = r10
            r16 = r11
            o.IResultReceiver$Default[] r1 = r0.equals
            int r7 = r0.onNavigationEvent
            o.IResultReceiver$Default r5 = o.IResultReceiver.Default.length(r7, r6, r5)
            r6 = 0
            r1[r6] = r5
            r1 = r3[r6]
            int r1 = r1.toString
            int r5 = o.onRetainNonConfigurationInstance.getMin
            if (r1 == r5) goto L_0x0898
            int[] r1 = new int[r2]
            double[] r5 = new double[r2]
            r13 = 2
            int[] r7 = new int[r13]
            r7[r21] = r13
            r7[r6] = r2
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r7)
            double[][] r4 = (double[][]) r4
            r6 = 0
        L_0x086a:
            if (r6 >= r2) goto L_0x088f
            r7 = r3[r6]
            int r7 = r7.toString
            r1[r6] = r7
            r7 = r3[r6]
            float r7 = r7.setMin
            double r7 = (double) r7
            r5[r6] = r7
            r7 = r4[r6]
            r8 = r3[r6]
            float r8 = r8.toFloatRange
            double r10 = (double) r8
            r8 = 0
            r7[r8] = r10
            r7 = r4[r6]
            r10 = r3[r6]
            float r10 = r10.equals
            double r10 = (double) r10
            r7[r21] = r10
            int r6 = r6 + 1
            goto L_0x086a
        L_0x088f:
            r8 = 0
            o.IResultReceiver$Stub$Proxy r2 = new o.IResultReceiver$Stub$Proxy
            r2.<init>(r1, r5, r4)
            r0.isInside = r2
            goto L_0x089a
        L_0x0898:
            r8 = 0
            r13 = 2
        L_0x089a:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.invokeSuspend = r2
            java.util.ArrayList<o.onRetainNonConfigurationInstance> r2 = r0.invoke
            if (r2 == 0) goto L_0x0bbd
            java.util.Iterator r2 = r26.iterator()
        L_0x08ab:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0b85
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x08dd
            o.removeOnContextAvailableListener$getMin r4 = new o.removeOnContextAvailableListener$getMin
            r4.<init>()
            r36 = r2
            r2 = r4
            r5 = r16
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            goto L_0x0b4b
        L_0x08dd:
            int r4 = r3.hashCode()
            switch(r4) {
                case -1249320806: goto L_0x0ace;
                case -1249320805: goto L_0x0ab1;
                case -1225497657: goto L_0x0a8f;
                case -1225497656: goto L_0x0a67;
                case -1225497655: goto L_0x0a3d;
                case -1001078227: goto L_0x0a15;
                case -908189618: goto L_0x09ec;
                case -908189617: goto L_0x09c1;
                case -797520672: goto L_0x0998;
                case -40300674: goto L_0x097a;
                case -4379043: goto L_0x0959;
                case 37232917: goto L_0x093a;
                case 92909918: goto L_0x091c;
                case 156108012: goto L_0x08fa;
                default: goto L_0x08e4;
            }
        L_0x08e4:
            r5 = r16
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
        L_0x08f4:
            r14 = r30
            r11 = r31
            goto L_0x0aeb
        L_0x08fa:
            java.lang.String r4 = "waveOffset"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x08e4
            r4 = 8
            r5 = r16
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            r16 = 8
            goto L_0x0aed
        L_0x091c:
            boolean r4 = r3.equals(r9)
            if (r4 == 0) goto L_0x08e4
            r5 = r16
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            r16 = 0
            goto L_0x0aed
        L_0x093a:
            boolean r4 = r3.equals(r12)
            if (r4 == 0) goto L_0x08e4
            r4 = 5
            r5 = r16
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            r16 = 5
            goto L_0x0aed
        L_0x0959:
            r4 = r28
            boolean r5 = r3.equals(r4)
            if (r5 == 0) goto L_0x0977
            r5 = r16
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r14 = r30
            r11 = r31
            r16 = 1
            goto L_0x0aed
        L_0x0977:
            r5 = r16
            goto L_0x09ba
        L_0x097a:
            r5 = r16
            r4 = r28
            boolean r6 = r3.equals(r5)
            if (r6 == 0) goto L_0x09ba
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r14 = r30
            r11 = r31
            r16 = 2
            goto L_0x0aed
        L_0x0998:
            r5 = r16
            r4 = r28
            java.lang.String r6 = "waveVariesBy"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x09ba
            r6 = 9
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r14 = r30
            r11 = r31
            r16 = 9
            goto L_0x0aed
        L_0x09ba:
            r13 = r17
            r8 = r18
            r6 = r19
            goto L_0x09e4
        L_0x09c1:
            r5 = r16
            r6 = r19
            r4 = r28
            boolean r7 = r3.equals(r6)
            if (r7 == 0) goto L_0x09e0
            r7 = 7
            r13 = r17
            r8 = r18
            r15 = r20
            r10 = r25
            r7 = r27
            r14 = r30
            r11 = r31
            r16 = 7
            goto L_0x0aed
        L_0x09e0:
            r13 = r17
            r8 = r18
        L_0x09e4:
            r15 = r20
            r10 = r25
            r7 = r27
            goto L_0x08f4
        L_0x09ec:
            r5 = r16
            r6 = r19
            r7 = r27
            r4 = r28
            boolean r10 = r3.equals(r7)
            if (r10 == 0) goto L_0x0a0b
            r10 = 6
            r13 = r17
            r8 = r18
            r15 = r20
            r10 = r25
            r14 = r30
            r11 = r31
            r16 = 6
            goto L_0x0aed
        L_0x0a0b:
            r13 = r17
            r8 = r18
            r15 = r20
            r10 = r25
            goto L_0x08f4
        L_0x0a15:
            r5 = r16
            r6 = r19
            r10 = r25
            r7 = r27
            r4 = r28
            boolean r11 = r3.equals(r10)
            if (r11 == 0) goto L_0x0a35
            r11 = 13
            r13 = r17
            r8 = r18
            r15 = r20
            r14 = r30
            r11 = r31
            r16 = 13
            goto L_0x0aed
        L_0x0a35:
            r13 = r17
            r8 = r18
            r15 = r20
            goto L_0x08f4
        L_0x0a3d:
            r5 = r16
            r6 = r19
            r10 = r25
            r7 = r27
            r4 = r28
            r11 = r31
            boolean r14 = r3.equals(r11)
            if (r14 == 0) goto L_0x0a5d
            r14 = 12
            r13 = r17
            r8 = r18
            r15 = r20
            r14 = r30
            r16 = 12
            goto L_0x0aed
        L_0x0a5d:
            r13 = r17
            r8 = r18
            r15 = r20
            r14 = r30
            goto L_0x0aeb
        L_0x0a67:
            r5 = r16
            r6 = r19
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            boolean r15 = r3.equals(r14)
            if (r15 == 0) goto L_0x0a87
            r15 = 11
            r13 = r17
            r8 = r18
            r15 = r20
            r16 = 11
            goto L_0x0aed
        L_0x0a87:
            r13 = r17
            r8 = r18
            r15 = r20
            goto L_0x0aeb
        L_0x0a8f:
            r5 = r16
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            boolean r16 = r3.equals(r15)
            if (r16 == 0) goto L_0x0aac
            r16 = 10
            r13 = r17
            r8 = r18
            goto L_0x0aed
        L_0x0aac:
            r13 = r17
            r8 = r18
            goto L_0x0aeb
        L_0x0ab1:
            r5 = r16
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            boolean r16 = r3.equals(r8)
            r13 = r17
            if (r16 == 0) goto L_0x0aeb
            r16 = 4
            goto L_0x0aed
        L_0x0ace:
            r5 = r16
            r13 = r17
            r8 = r18
            r6 = r19
            r15 = r20
            r10 = r25
            r7 = r27
            r4 = r28
            r14 = r30
            r11 = r31
            boolean r16 = r3.equals(r13)
            if (r16 == 0) goto L_0x0aeb
            r16 = 3
            goto L_0x0aed
        L_0x0aeb:
            r16 = -1
        L_0x0aed:
            switch(r16) {
                case 0: goto L_0x0b42;
                case 1: goto L_0x0b3c;
                case 2: goto L_0x0b36;
                case 3: goto L_0x0b30;
                case 4: goto L_0x0b2a;
                case 5: goto L_0x0b24;
                case 6: goto L_0x0b1e;
                case 7: goto L_0x0b18;
                case 8: goto L_0x0b12;
                case 9: goto L_0x0b0c;
                case 10: goto L_0x0b06;
                case 11: goto L_0x0b00;
                case 12: goto L_0x0afa;
                case 13: goto L_0x0af4;
                default: goto L_0x0af0;
            }
        L_0x0af0:
            r36 = r2
            r2 = 0
            goto L_0x0b4b
        L_0x0af4:
            o.removeOnContextAvailableListener$equals r16 = new o.removeOnContextAvailableListener$equals
            r16.<init>()
            goto L_0x0b47
        L_0x0afa:
            o.removeOnContextAvailableListener$hashCode r16 = new o.removeOnContextAvailableListener$hashCode
            r16.<init>()
            goto L_0x0b47
        L_0x0b00:
            o.removeOnContextAvailableListener$toString r16 = new o.removeOnContextAvailableListener$toString
            r16.<init>()
            goto L_0x0b47
        L_0x0b06:
            o.removeOnContextAvailableListener$toDoubleRange r16 = new o.removeOnContextAvailableListener$toDoubleRange
            r16.<init>()
            goto L_0x0b47
        L_0x0b0c:
            o.removeOnContextAvailableListener$length r16 = new o.removeOnContextAvailableListener$length
            r16.<init>()
            goto L_0x0b47
        L_0x0b12:
            o.removeOnContextAvailableListener$length r16 = new o.removeOnContextAvailableListener$length
            r16.<init>()
            goto L_0x0b47
        L_0x0b18:
            o.removeOnContextAvailableListener$FastBitmap$CoordinateSystem r16 = new o.removeOnContextAvailableListener$FastBitmap$CoordinateSystem
            r16.<init>()
            goto L_0x0b47
        L_0x0b1e:
            o.removeOnContextAvailableListener$toIntRange r16 = new o.removeOnContextAvailableListener$toIntRange
            r16.<init>()
            goto L_0x0b47
        L_0x0b24:
            o.removeOnContextAvailableListener$setMin r16 = new o.removeOnContextAvailableListener$setMin
            r16.<init>()
            goto L_0x0b47
        L_0x0b2a:
            o.removeOnContextAvailableListener$IsOverlapping r16 = new o.removeOnContextAvailableListener$IsOverlapping
            r16.<init>()
            goto L_0x0b47
        L_0x0b30:
            o.removeOnContextAvailableListener$isInside r16 = new o.removeOnContextAvailableListener$isInside
            r16.<init>()
            goto L_0x0b47
        L_0x0b36:
            o.removeOnContextAvailableListener$toFloatRange r16 = new o.removeOnContextAvailableListener$toFloatRange
            r16.<init>()
            goto L_0x0b47
        L_0x0b3c:
            o.removeOnContextAvailableListener$setMax r16 = new o.removeOnContextAvailableListener$setMax
            r16.<init>()
            goto L_0x0b47
        L_0x0b42:
            o.removeOnContextAvailableListener$length r16 = new o.removeOnContextAvailableListener$length
            r16.<init>()
        L_0x0b47:
            r36 = r2
            r2 = r16
        L_0x0b4b:
            if (r2 == 0) goto L_0x0b6b
            boolean r16 = r2.getMin()
            if (r16 == 0) goto L_0x0b5d
            boolean r16 = java.lang.Float.isNaN(r1)
            if (r16 == 0) goto L_0x0b5d
            float r1 = r33.getMin()
        L_0x0b5d:
            r2.setMin = r3
            r37 = r1
            java.util.HashMap<java.lang.String, o.removeOnContextAvailableListener> r1 = r0.invokeSuspend
            r1.put(r3, r2)
            r2 = r36
            r1 = r37
            goto L_0x0b6d
        L_0x0b6b:
            r2 = r36
        L_0x0b6d:
            r28 = r4
            r16 = r5
            r19 = r6
            r27 = r7
            r18 = r8
            r25 = r10
            r31 = r11
            r17 = r13
            r30 = r14
            r20 = r15
            r8 = 0
            r13 = 2
            goto L_0x08ab
        L_0x0b85:
            java.util.ArrayList<o.onRetainNonConfigurationInstance> r2 = r0.invoke
            java.util.Iterator r2 = r2.iterator()
        L_0x0b8b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0ba3
            java.lang.Object r3 = r2.next()
            o.onRetainNonConfigurationInstance r3 = (o.onRetainNonConfigurationInstance) r3
            boolean r4 = r3 instanceof o.addOnContextAvailableListener
            if (r4 == 0) goto L_0x0b8b
            o.addOnContextAvailableListener r3 = (o.addOnContextAvailableListener) r3
            java.util.HashMap<java.lang.String, o.removeOnContextAvailableListener> r4 = r0.invokeSuspend
            r3.setMin((java.util.HashMap<java.lang.String, o.removeOnContextAvailableListener>) r4)
            goto L_0x0b8b
        L_0x0ba3:
            java.util.HashMap<java.lang.String, o.removeOnContextAvailableListener> r2 = r0.invokeSuspend
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0bad:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0bbd
            java.lang.Object r3 = r2.next()
            o.removeOnContextAvailableListener r3 = (o.removeOnContextAvailableListener) r3
            r3.setMax(r1)
            goto L_0x0bad
        L_0x0bbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onBackPressed.setMax(int, int, long):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        sb.append(this.getMin.toFloatRange);
        sb.append(" y: ");
        sb.append(this.getMin.equals);
        sb.append(" end: x: ");
        sb.append(this.setMin.toFloatRange);
        sb.append(" y: ");
        sb.append(this.setMin.equals);
        return sb.toString();
    }

    private void setMin(getSavedStateRegistry getsavedstateregistry) {
        getsavedstateregistry.toFloatRange = (float) ((int) this.setMax.getX());
        getsavedstateregistry.equals = (float) ((int) this.setMax.getY());
        getsavedstateregistry.isInside = (float) this.setMax.getWidth();
        getsavedstateregistry.IsOverlapping = (float) this.setMax.getHeight();
    }

    public final void getMin(ConstraintWidget constraintWidget, from from) {
        int i;
        this.getMin.setMin = 0.0f;
        this.getMin.length = 0.0f;
        setMin(this.getMin);
        getSavedStateRegistry getsavedstateregistry = this.getMin;
        float Mean$Arithmetic2 = (float) constraintWidget.Mean$Arithmetic();
        float onNavigationEvent2 = (float) constraintWidget.onNavigationEvent();
        int i2 = 0;
        if (constraintWidget.areNotificationsEnabled == 8) {
            i = 0;
        } else {
            i = constraintWidget.requestPostMessageChannelWithExtras;
        }
        float f = (float) i;
        if (constraintWidget.areNotificationsEnabled != 8) {
            i2 = constraintWidget.postMessage;
        }
        getsavedstateregistry.toFloatRange = Mean$Arithmetic2;
        getsavedstateregistry.equals = onNavigationEvent2;
        getsavedstateregistry.isInside = f;
        getsavedstateregistry.IsOverlapping = (float) i2;
        from.length length2 = from.length(this.getMax);
        this.getMin.setMin(length2);
        this.IsOverlapping = length2.getMax.isInside;
        this.toFloatRange.length(constraintWidget, from, this.getMax);
    }

    public final void length(ConstraintWidget constraintWidget, from from) {
        int i;
        this.setMin.setMin = 1.0f;
        this.setMin.length = 1.0f;
        setMin(this.setMin);
        getSavedStateRegistry getsavedstateregistry = this.setMin;
        float Mean$Arithmetic2 = (float) constraintWidget.Mean$Arithmetic();
        float onNavigationEvent2 = (float) constraintWidget.onNavigationEvent();
        int i2 = 0;
        if (constraintWidget.areNotificationsEnabled == 8) {
            i = 0;
        } else {
            i = constraintWidget.requestPostMessageChannelWithExtras;
        }
        float f = (float) i;
        if (constraintWidget.areNotificationsEnabled != 8) {
            i2 = constraintWidget.postMessage;
        }
        getsavedstateregistry.toFloatRange = Mean$Arithmetic2;
        getsavedstateregistry.equals = onNavigationEvent2;
        getsavedstateregistry.isInside = f;
        getsavedstateregistry.IsOverlapping = (float) i2;
        this.setMin.setMin(from.length(this.getMax));
        this.ICustomTabsCallback.length(constraintWidget, from, this.getMax);
    }

    public final float getMin(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else if (((double) this.FastBitmap$CoordinateSystem) != 1.0d) {
            if (f < this.toIntRange) {
                f = 0.0f;
            }
            float f4 = this.toIntRange;
            if (f > f4 && ((double) f) < 1.0d) {
                f = (f - f4) * this.FastBitmap$CoordinateSystem;
            }
        }
        ResultReceiver.MyResultReceiver myResultReceiver = this.getMin.setMax;
        float f5 = Float.NaN;
        Iterator<getSavedStateRegistry> it = this.toDoubleRange.iterator();
        while (it.hasNext()) {
            getSavedStateRegistry next = it.next();
            if (next.setMax != null) {
                if (next.setMin < f) {
                    myResultReceiver = next.setMax;
                    f2 = next.setMin;
                } else if (Float.isNaN(f5)) {
                    f5 = next.setMin;
                }
            }
        }
        if (myResultReceiver != null) {
            if (!Float.isNaN(f5)) {
                f3 = f5;
            }
            float f6 = f3 - f2;
            double d = (double) ((f - f2) / f6);
            f = (((float) myResultReceiver.getMin(d)) * f6) + f2;
            if (fArr != null) {
                fArr[0] = (float) myResultReceiver.setMin(d);
            }
        }
        return f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: o.onActivityResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: o.onActivityResult$setMax} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x034d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getMax(android.view.View r27, float r28, long r29, o.initViewTreeOwners r31) {
        /*
            r26 = this;
            r0 = r26
            r11 = r27
            r1 = 0
            r2 = r28
            float r12 = r0.getMin((float) r2, (float[]) r1)
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r2 = r0.Grayscale$Algorithm
            if (r2 == 0) goto L_0x0027
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()
            o.startIntentSenderForResult r3 = (o.startIntentSenderForResult) r3
            r3.setMin((android.view.View) r11, (float) r12)
            goto L_0x0017
        L_0x0027:
            java.util.HashMap<java.lang.String, o.onActivityResult> r2 = r0.extraCallbackWithResult
            r13 = 0
            if (r2 == 0) goto L_0x005a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0036:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r7.next()
            o.onActivityResult r1 = (o.onActivityResult) r1
            boolean r2 = r1 instanceof o.onActivityResult.setMax
            if (r2 == 0) goto L_0x004a
            r8 = r1
            o.onActivityResult$setMax r8 = (o.onActivityResult.setMax) r8
            goto L_0x0036
        L_0x004a:
            r2 = r27
            r3 = r12
            r4 = r29
            r6 = r31
            boolean r1 = r1.length((android.view.View) r2, (float) r3, (long) r4, (o.initViewTreeOwners) r6)
            r9 = r9 | r1
            goto L_0x0036
        L_0x0057:
            r1 = r8
            r14 = r9
            goto L_0x005b
        L_0x005a:
            r14 = 0
        L_0x005b:
            o.IResultReceiver$Default[] r2 = r0.equals
            if (r2 == 0) goto L_0x0409
            r2 = r2[r13]
            double r9 = (double) r12
            double[] r5 = r0.values
            r2.length(r9, r5)
            o.IResultReceiver$Default[] r2 = r0.equals
            r2 = r2[r13]
            double[] r5 = r0.toString
            r2.getMin(r9, r5)
            o.IResultReceiver$Default r2 = r0.isInside
            if (r2 == 0) goto L_0x0083
            double[] r5 = r0.values
            int r6 = r5.length
            if (r6 <= 0) goto L_0x0083
            r2.length(r9, r5)
            o.IResultReceiver$Default r2 = r0.isInside
            double[] r5 = r0.toString
            r2.getMin(r9, r5)
        L_0x0083:
            o.getSavedStateRegistry r2 = r0.getMin
            int[] r5 = r0.hashCode
            double[] r6 = r0.values
            double[] r7 = r0.toString
            float r8 = r2.toFloatRange
            float r13 = r2.equals
            float r3 = r2.isInside
            float r4 = r2.IsOverlapping
            int r15 = r5.length
            if (r15 == 0) goto L_0x00b4
            double[] r15 = r2.hashCode
            int r15 = r15.length
            r17 = r3
            int r3 = r5.length
            r16 = 1
            int r3 = r3 + -1
            r3 = r5[r3]
            if (r15 > r3) goto L_0x00b6
            int r3 = r5.length
            int r3 = r3 + -1
            r3 = r5[r3]
            int r3 = r3 + 1
            double[] r15 = new double[r3]
            r2.hashCode = r15
            double[] r3 = new double[r3]
            r2.valueOf = r3
            goto L_0x00b6
        L_0x00b4:
            r17 = r3
        L_0x00b6:
            double[] r3 = r2.hashCode
            r18 = r9
            r10 = r8
            r8 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r3, r8)
            r3 = 0
        L_0x00c1:
            int r8 = r5.length
            if (r3 >= r8) goto L_0x00d7
            double[] r8 = r2.hashCode
            r9 = r5[r3]
            r20 = r6[r3]
            r8[r9] = r20
            double[] r8 = r2.valueOf
            r9 = r5[r3]
            r20 = r7[r3]
            r8[r9] = r20
            int r3 = r3 + 1
            goto L_0x00c1
        L_0x00d7:
            r5 = r4
            r8 = r10
            r4 = 0
            r6 = 2143289344(0x7fc00000, float:NaN)
            r7 = 0
            r9 = 0
            r10 = 0
            r20 = 0
        L_0x00e1:
            double[] r15 = r2.hashCode
            int r15 = r15.length
            if (r4 >= r15) goto L_0x013f
            double[] r15 = r2.hashCode
            r22 = r15[r4]
            boolean r15 = java.lang.Double.isNaN(r22)
            if (r15 != 0) goto L_0x0137
            double[] r15 = r2.hashCode
            r22 = r15[r4]
            boolean r15 = java.lang.Double.isNaN(r22)
            r22 = 0
            if (r15 == 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            double[] r15 = r2.hashCode
            r24 = r15[r4]
            double r22 = r24 + r22
        L_0x0103:
            r24 = r4
            r3 = r22
            float r3 = (float) r3
            double[] r4 = r2.valueOf
            r22 = r2
            r23 = r3
            r2 = r4[r24]
            float r2 = (float) r2
            r3 = r24
            r4 = 1
            if (r3 == r4) goto L_0x0133
            r4 = 2
            if (r3 == r4) goto L_0x012f
            r4 = 3
            if (r3 == r4) goto L_0x012b
            r4 = 4
            if (r3 == r4) goto L_0x0126
            r2 = 5
            if (r3 == r2) goto L_0x0123
            goto L_0x013a
        L_0x0123:
            r6 = r23
            goto L_0x013a
        L_0x0126:
            r20 = r2
            r5 = r23
            goto L_0x013a
        L_0x012b:
            r9 = r2
            r17 = r23
            goto L_0x013a
        L_0x012f:
            r10 = r2
            r13 = r23
            goto L_0x013a
        L_0x0133:
            r7 = r2
            r8 = r23
            goto L_0x013a
        L_0x0137:
            r22 = r2
            r3 = r4
        L_0x013a:
            int r4 = r3 + 1
            r2 = r22
            goto L_0x00e1
        L_0x013f:
            boolean r2 = java.lang.Float.isNaN(r6)
            if (r2 == 0) goto L_0x0155
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x0150
            r11.setRotation(r2)
        L_0x0150:
            r20 = r14
        L_0x0152:
            r2 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0184
        L_0x0155:
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L_0x015f
            r3 = 0
            goto L_0x0161
        L_0x015f:
            r3 = 2143289344(0x7fc00000, float:NaN)
        L_0x0161:
            r2 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r2
            float r7 = r7 + r9
            float r20 = r20 / r2
            float r10 = r10 + r20
            double r2 = (double) r3
            r20 = r14
            double r14 = (double) r6
            double r9 = (double) r10
            double r6 = (double) r7
            double r6 = java.lang.Math.atan2(r9, r6)
            double r6 = java.lang.Math.toDegrees(r6)
            java.lang.Double.isNaN(r14)
            double r14 = r14 + r6
            java.lang.Double.isNaN(r2)
            double r2 = r2 + r14
            float r2 = (float) r2
            r11.setRotation(r2)
            goto L_0x0152
        L_0x0184:
            float r8 = r8 + r2
            int r3 = (int) r8
            float r13 = r13 + r2
            int r2 = (int) r13
            float r8 = r8 + r17
            int r4 = (int) r8
            float r13 = r13 + r5
            int r5 = (int) r13
            int r6 = r4 - r3
            int r7 = r5 - r2
            int r8 = r27.getMeasuredWidth()
            if (r6 != r8) goto L_0x01a0
            int r8 = r27.getMeasuredHeight()
            if (r7 == r8) goto L_0x019e
            goto L_0x01a0
        L_0x019e:
            r8 = 0
            goto L_0x01a1
        L_0x01a0:
            r8 = 1
        L_0x01a1:
            if (r8 == 0) goto L_0x01b0
            r8 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            r11.measure(r6, r7)
        L_0x01b0:
            r11.layout(r3, r2, r4, r5)
            java.util.HashMap<java.lang.String, o.startIntentSenderForResult> r2 = r0.Grayscale$Algorithm
            if (r2 == 0) goto L_0x01eb
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x01bf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01eb
            java.lang.Object r3 = r2.next()
            o.startIntentSenderForResult r3 = (o.startIntentSenderForResult) r3
            boolean r4 = r3 instanceof o.startIntentSenderForResult.getMin
            if (r4 == 0) goto L_0x01bf
            o.startIntentSenderForResult$getMin r3 = (o.startIntentSenderForResult.getMin) r3
            double[] r4 = r0.toString
            r5 = 0
            r6 = r4[r5]
            r5 = 1
            r8 = r4[r5]
            float r3 = r3.length(r12)
            double r4 = java.lang.Math.atan2(r8, r6)
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            float r3 = r3 + r4
            r11.setRotation(r3)
            goto L_0x01bf
        L_0x01eb:
            if (r1 == 0) goto L_0x0205
            double[] r2 = r0.toString
            r3 = 0
            r7 = r2[r3]
            r3 = 1
            r9 = r2[r3]
            r2 = r27
            r3 = r31
            r4 = r12
            r5 = r29
            r13 = r18
            boolean r1 = r1.getMax(r2, r3, r4, r5, r7, r9)
            r1 = r20 | r1
            goto L_0x0209
        L_0x0205:
            r13 = r18
            r1 = r20
        L_0x0209:
            r2 = 1
        L_0x020a:
            o.IResultReceiver$Default[] r3 = r0.equals
            int r4 = r3.length
            if (r2 >= r4) goto L_0x022e
            r3 = r3[r2]
            float[] r4 = r0.extraCallback
            r3.getMax(r13, r4)
            o.getSavedStateRegistry r3 = r0.getMin
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r3.FastBitmap$CoordinateSystem
            java.lang.String[] r4 = r0.create
            int r5 = r2 + -1
            r4 = r4[r5]
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            float[] r4 = r0.extraCallback
            r3.setMin((android.view.View) r11, (float[]) r4)
            int r2 = r2 + 1
            goto L_0x020a
        L_0x022e:
            o.getOnBackPressedDispatcher r2 = r0.toFloatRange
            int r2 = r2.getMax
            if (r2 != 0) goto L_0x025d
            r2 = 0
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0241
            o.getOnBackPressedDispatcher r2 = r0.toFloatRange
            int r2 = r2.getMin
            r11.setVisibility(r2)
            goto L_0x025d
        L_0x0241:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x024f
            o.getOnBackPressedDispatcher r2 = r0.ICustomTabsCallback
            int r2 = r2.getMin
            r11.setVisibility(r2)
            goto L_0x025d
        L_0x024f:
            o.getOnBackPressedDispatcher r2 = r0.ICustomTabsCallback
            int r2 = r2.getMin
            o.getOnBackPressedDispatcher r3 = r0.toFloatRange
            int r3 = r3.getMin
            if (r2 == r3) goto L_0x025d
            r2 = 0
            r11.setVisibility(r2)
        L_0x025d:
            o.getViewModelStore[] r2 = r0.onMessageChannelReady
            if (r2 == 0) goto L_0x0406
            r5 = 0
        L_0x0262:
            o.getViewModelStore[] r2 = r0.onMessageChannelReady
            int r3 = r2.length
            if (r5 >= r3) goto L_0x0406
            r2 = r2[r5]
            int r3 = r2.values
            int r4 = o.getViewModelStore.getMin
            if (r3 == r4) goto L_0x02d6
            android.view.View r3 = r2.hashCode
            if (r3 != 0) goto L_0x0281
            android.view.ViewParent r3 = r27.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r2.values
            android.view.View r3 = r3.findViewById(r4)
            r2.hashCode = r3
        L_0x0281:
            android.graphics.RectF r3 = r2.b
            android.view.View r4 = r2.hashCode
            boolean r6 = r2.getCause
            o.getViewModelStore.setMax(r3, r4, r6)
            android.graphics.RectF r3 = r2.ICustomTabsCallback
            boolean r4 = r2.getCause
            o.getViewModelStore.setMax(r3, r11, r4)
            android.graphics.RectF r3 = r2.b
            android.graphics.RectF r4 = r2.ICustomTabsCallback
            boolean r3 = r3.intersect(r4)
            if (r3 == 0) goto L_0x02ba
            boolean r3 = r2.toDoubleRange
            if (r3 == 0) goto L_0x02a4
            r3 = 0
            r2.toDoubleRange = r3
            r4 = 1
            goto L_0x02a6
        L_0x02a4:
            r3 = 0
            r4 = 0
        L_0x02a6:
            boolean r6 = r2.invokeSuspend
            if (r6 == 0) goto L_0x02b0
            r2.invokeSuspend = r3
            r3 = 1
            r16 = 1
            goto L_0x02b3
        L_0x02b0:
            r3 = 1
            r16 = 0
        L_0x02b3:
            r2.valueOf = r3
            r3 = r4
            r6 = r16
            r4 = 0
            goto L_0x02d3
        L_0x02ba:
            r3 = 1
            boolean r4 = r2.toDoubleRange
            if (r4 != 0) goto L_0x02c3
            r2.toDoubleRange = r3
            r4 = 1
            goto L_0x02c4
        L_0x02c3:
            r4 = 0
        L_0x02c4:
            boolean r6 = r2.valueOf
            if (r6 == 0) goto L_0x02cd
            r6 = 0
            r2.valueOf = r6
            r6 = 1
            goto L_0x02ce
        L_0x02cd:
            r6 = 0
        L_0x02ce:
            r2.invokeSuspend = r3
            r3 = r4
            r4 = r6
            r6 = 0
        L_0x02d3:
            r8 = 0
            goto L_0x0360
        L_0x02d6:
            boolean r3 = r2.toDoubleRange
            if (r3 == 0) goto L_0x02ef
            float r3 = r2.Mean$Arithmetic
            float r3 = r12 - r3
            float r4 = r2.create
            float r6 = r2.Mean$Arithmetic
            float r4 = r4 - r6
            float r3 = r3 * r4
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0300
            r3 = 0
            r2.toDoubleRange = r3
            r3 = 1
            goto L_0x0301
        L_0x02ef:
            float r3 = r2.Mean$Arithmetic
            float r3 = r12 - r3
            float r3 = java.lang.Math.abs(r3)
            float r4 = r2.toString
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0300
            r3 = 1
            r2.toDoubleRange = r3
        L_0x0300:
            r3 = 0
        L_0x0301:
            boolean r4 = r2.valueOf
            if (r4 == 0) goto L_0x031e
            float r4 = r2.Mean$Arithmetic
            float r4 = r12 - r4
            float r6 = r2.create
            float r7 = r2.Mean$Arithmetic
            float r6 = r6 - r7
            float r6 = r6 * r4
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x032f
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x032f
            r4 = 0
            r2.valueOf = r4
            r4 = 1
            goto L_0x0330
        L_0x031e:
            float r4 = r2.Mean$Arithmetic
            float r4 = r12 - r4
            float r4 = java.lang.Math.abs(r4)
            float r6 = r2.toString
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x032f
            r4 = 1
            r2.valueOf = r4
        L_0x032f:
            r4 = 0
        L_0x0330:
            boolean r6 = r2.invokeSuspend
            if (r6 == 0) goto L_0x034d
            float r6 = r2.Mean$Arithmetic
            float r6 = r12 - r6
            float r7 = r2.create
            float r8 = r2.Mean$Arithmetic
            float r7 = r7 - r8
            float r7 = r7 * r6
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x035f
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x035f
            r6 = 0
            r2.invokeSuspend = r6
            r6 = 1
            goto L_0x0360
        L_0x034d:
            r8 = 0
            float r6 = r2.Mean$Arithmetic
            float r6 = r12 - r6
            float r6 = java.lang.Math.abs(r6)
            float r7 = r2.toString
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x035f
            r6 = 1
            r2.invokeSuspend = r6
        L_0x035f:
            r6 = 0
        L_0x0360:
            r2.create = r12
            if (r4 != 0) goto L_0x0368
            if (r3 != 0) goto L_0x0368
            if (r6 == 0) goto L_0x0373
        L_0x0368:
            android.view.ViewParent r7 = r27.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = (androidx.constraintlayout.motion.widget.MotionLayout) r7
            int r9 = r2.FastBitmap$CoordinateSystem
            r7.fireTrigger(r9, r6, r12)
        L_0x0373:
            int r7 = r2.equals
            int r9 = o.getViewModelStore.getMin
            if (r7 != r9) goto L_0x037b
            r7 = r11
            goto L_0x0387
        L_0x037b:
            android.view.ViewParent r7 = r27.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = (androidx.constraintlayout.motion.widget.MotionLayout) r7
            int r9 = r2.equals
            android.view.View r7 = r7.findViewById(r9)
        L_0x0387:
            if (r4 == 0) goto L_0x03b0
            java.lang.String r4 = r2.toFloatRange
            if (r4 == 0) goto L_0x03b0
            java.lang.reflect.Method r4 = r2.Grayscale$Algorithm
            if (r4 != 0) goto L_0x03a4
            java.lang.Class r4 = r7.getClass()     // Catch:{ NoSuchMethodException -> 0x03a1 }
            java.lang.String r9 = r2.toFloatRange     // Catch:{ NoSuchMethodException -> 0x03a1 }
            r10 = 0
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x03a1 }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r13)     // Catch:{ NoSuchMethodException -> 0x03a1 }
            r2.Grayscale$Algorithm = r4     // Catch:{ NoSuchMethodException -> 0x03a1 }
            goto L_0x03a4
        L_0x03a1:
            o.addContentView.setMax(r7)
        L_0x03a4:
            java.lang.reflect.Method r4 = r2.Grayscale$Algorithm     // Catch:{ Exception -> 0x03ad }
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03ad }
            r4.invoke(r7, r10)     // Catch:{ Exception -> 0x03ad }
            goto L_0x03b0
        L_0x03ad:
            o.addContentView.setMax(r7)
        L_0x03b0:
            if (r6 == 0) goto L_0x03d9
            java.lang.String r4 = r2.IsOverlapping
            if (r4 == 0) goto L_0x03d9
            java.lang.reflect.Method r4 = r2.onNavigationEvent
            if (r4 != 0) goto L_0x03cd
            java.lang.Class r4 = r7.getClass()     // Catch:{ NoSuchMethodException -> 0x03ca }
            java.lang.String r6 = r2.IsOverlapping     // Catch:{ NoSuchMethodException -> 0x03ca }
            r9 = 0
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x03ca }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r10)     // Catch:{ NoSuchMethodException -> 0x03ca }
            r2.onNavigationEvent = r4     // Catch:{ NoSuchMethodException -> 0x03ca }
            goto L_0x03cd
        L_0x03ca:
            o.addContentView.setMax(r7)
        L_0x03cd:
            java.lang.reflect.Method r4 = r2.onNavigationEvent     // Catch:{ Exception -> 0x03d6 }
            r6 = 0
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x03d6 }
            r4.invoke(r7, r9)     // Catch:{ Exception -> 0x03d6 }
            goto L_0x03d9
        L_0x03d6:
            o.addContentView.setMax(r7)
        L_0x03d9:
            if (r3 == 0) goto L_0x0402
            java.lang.String r3 = r2.isInside
            if (r3 == 0) goto L_0x0402
            java.lang.reflect.Method r3 = r2.invoke
            if (r3 != 0) goto L_0x03f6
            java.lang.Class r3 = r7.getClass()     // Catch:{ NoSuchMethodException -> 0x03f3 }
            java.lang.String r4 = r2.isInside     // Catch:{ NoSuchMethodException -> 0x03f3 }
            r6 = 0
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x03f3 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r9)     // Catch:{ NoSuchMethodException -> 0x03f3 }
            r2.invoke = r3     // Catch:{ NoSuchMethodException -> 0x03f3 }
            goto L_0x03f6
        L_0x03f3:
            o.addContentView.setMax(r7)
        L_0x03f6:
            java.lang.reflect.Method r2 = r2.invoke     // Catch:{ Exception -> 0x03ff }
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x03ff }
            r2.invoke(r7, r4)     // Catch:{ Exception -> 0x03ff }
            goto L_0x0402
        L_0x03ff:
            o.addContentView.setMax(r7)
        L_0x0402:
            int r5 = r5 + 1
            goto L_0x0262
        L_0x0406:
            r14 = r1
            goto L_0x0483
        L_0x0409:
            r20 = r14
            o.getSavedStateRegistry r1 = r0.getMin
            float r1 = r1.toFloatRange
            o.getSavedStateRegistry r2 = r0.setMin
            float r2 = r2.toFloatRange
            o.getSavedStateRegistry r3 = r0.getMin
            float r3 = r3.toFloatRange
            float r2 = r2 - r3
            float r2 = r2 * r12
            float r1 = r1 + r2
            o.getSavedStateRegistry r2 = r0.getMin
            float r2 = r2.equals
            o.getSavedStateRegistry r3 = r0.setMin
            float r3 = r3.equals
            o.getSavedStateRegistry r4 = r0.getMin
            float r4 = r4.equals
            float r3 = r3 - r4
            float r3 = r3 * r12
            float r2 = r2 + r3
            o.getSavedStateRegistry r3 = r0.getMin
            float r3 = r3.isInside
            o.getSavedStateRegistry r4 = r0.setMin
            float r4 = r4.isInside
            o.getSavedStateRegistry r5 = r0.getMin
            float r5 = r5.isInside
            float r4 = r4 - r5
            float r4 = r4 * r12
            float r3 = r3 + r4
            o.getSavedStateRegistry r4 = r0.getMin
            float r4 = r4.IsOverlapping
            o.getSavedStateRegistry r5 = r0.setMin
            float r5 = r5.IsOverlapping
            o.getSavedStateRegistry r6 = r0.getMin
            float r6 = r6.IsOverlapping
            float r5 = r5 - r6
            float r5 = r5 * r12
            float r4 = r4 + r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r5
            int r6 = (int) r1
            float r2 = r2 + r5
            int r5 = (int) r2
            float r1 = r1 + r3
            int r1 = (int) r1
            float r2 = r2 + r4
            int r2 = (int) r2
            int r3 = r1 - r6
            int r4 = r2 - r5
            o.getSavedStateRegistry r7 = r0.setMin
            float r7 = r7.isInside
            o.getSavedStateRegistry r8 = r0.getMin
            float r8 = r8.isInside
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0471
            o.getSavedStateRegistry r7 = r0.setMin
            float r7 = r7.IsOverlapping
            o.getSavedStateRegistry r8 = r0.getMin
            float r8 = r8.IsOverlapping
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x047e
        L_0x0471:
            r7 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7)
            r11.measure(r3, r4)
        L_0x047e:
            r11.layout(r6, r5, r1, r2)
            r14 = r20
        L_0x0483:
            java.util.HashMap<java.lang.String, o.removeOnContextAvailableListener> r1 = r0.invokeSuspend
            if (r1 == 0) goto L_0x04c1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x048f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04c1
            java.lang.Object r2 = r1.next()
            o.removeOnContextAvailableListener r2 = (o.removeOnContextAvailableListener) r2
            boolean r3 = r2 instanceof o.removeOnContextAvailableListener.setMin
            if (r3 == 0) goto L_0x04bb
            o.removeOnContextAvailableListener$setMin r2 = (o.removeOnContextAvailableListener.setMin) r2
            double[] r3 = r0.toString
            r4 = 0
            r5 = r3[r4]
            r7 = 1
            r8 = r3[r7]
            float r2 = r2.getMin(r12)
            double r5 = java.lang.Math.atan2(r8, r5)
            double r5 = java.lang.Math.toDegrees(r5)
            float r3 = (float) r5
            float r2 = r2 + r3
            r11.setRotation(r2)
            goto L_0x048f
        L_0x04bb:
            r4 = 0
            r7 = 1
            r2.getMin(r11, r12)
            goto L_0x048f
        L_0x04c1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onBackPressed.getMax(android.view.View, float, long, o.initViewTreeOwners):boolean");
    }

    public final void length(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float min = getMin(f, this.valueOf);
        IResultReceiver.Default[] defaultArr = this.equals;
        int i = 0;
        if (defaultArr != null) {
            double d = (double) min;
            defaultArr[0].getMin(d, this.toString);
            this.equals[0].length(d, this.values);
            float f4 = this.valueOf[0];
            while (true) {
                dArr = this.toString;
                if (i >= dArr.length) {
                    break;
                }
                double d2 = dArr[i];
                double d3 = (double) f4;
                Double.isNaN(d3);
                dArr[i] = d2 * d3;
                i++;
            }
            IResultReceiver.Default defaultR = this.isInside;
            if (defaultR != null) {
                double[] dArr2 = this.values;
                if (dArr2.length > 0) {
                    defaultR.length(d, dArr2);
                    this.isInside.getMin(d, this.toString);
                    getSavedStateRegistry.length(f2, f3, fArr, this.hashCode, this.toString);
                    return;
                }
                return;
            }
            getSavedStateRegistry.length(f2, f3, fArr, this.hashCode, dArr);
            return;
        }
        float f5 = this.setMin.toFloatRange - this.getMin.toFloatRange;
        float f6 = this.setMin.equals - this.getMin.equals;
        float f7 = (this.setMin.IsOverlapping - this.getMin.IsOverlapping) + f6;
        fArr[0] = (f5 * (1.0f - f2)) + (((this.setMin.isInside - this.getMin.isInside) + f5) * f2);
        fArr[1] = (f6 * (1.0f - f3)) + (f7 * f3);
    }

    public final int setMin() {
        int i = this.getMin.getMax;
        Iterator<getSavedStateRegistry> it = this.toDoubleRange.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().getMax);
        }
        return Math.max(i, this.setMin.getMax);
    }
}
