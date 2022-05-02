package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import java.util.ArrayList;
import java.util.List;
import o.addDrawerListener;
import o.getArguments;
import o.getTargetFragment;
import o.setDrawerTitle;

public class Legend extends setDrawerTitle {
    public float FastBitmap$CoordinateSystem = 0.95f;
    public float Grayscale$Algorithm = 0.0f;
    private boolean ICustomTabsCallback = false;
    public float IsOverlapping = 8.0f;
    public List<getArguments> Mean$Arithmetic = new ArrayList(16);
    public List<Boolean> b = new ArrayList(16);
    private boolean create = false;
    public LegendDirection equals = LegendDirection.LEFT_TO_RIGHT;
    public List<getArguments> getCause = new ArrayList(16);
    public LegendHorizontalAlignment getMax = LegendHorizontalAlignment.LEFT;
    public LegendVerticalAlignment getMin = LegendVerticalAlignment.BOTTOM;
    public float hashCode = 5.0f;
    public float invoke = 0.0f;
    public float invokeSuspend = 0.0f;
    public LegendForm isInside = LegendForm.SQUARE;
    public LegendOrientation length = LegendOrientation.HORIZONTAL;
    private boolean onNavigationEvent = false;
    public addDrawerListener[] setMax;
    public addDrawerListener[] setMin = new addDrawerListener[0];
    public float toDoubleRange = 0.0f;
    public float toFloatRange = 3.0f;
    public DashPathEffect toIntRange = null;
    public float toString = 3.0f;
    public float valueOf = 0.0f;
    public float values = 6.0f;

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.ICustomTabsCallback$Stub = getTargetFragment.setMax(10.0f);
        this.asInterface = getTargetFragment.setMax(5.0f);
        this.ICustomTabsCallback$Default = getTargetFragment.setMax(3.0f);
    }

    public final boolean length() {
        return this.ICustomTabsCallback;
    }

    public final boolean setMax() {
        return this.onNavigationEvent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x021c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(android.graphics.Paint r27, o.setTargetFragment r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            float r2 = r0.IsOverlapping
            float r2 = o.getTargetFragment.setMax(r2)
            float r3 = r0.toString
            float r3 = o.getTargetFragment.setMax(r3)
            float r4 = r0.hashCode
            float r4 = o.getTargetFragment.setMax(r4)
            float r5 = r0.values
            float r5 = o.getTargetFragment.setMax(r5)
            float r6 = r0.toDoubleRange
            float r6 = o.getTargetFragment.setMax(r6)
            boolean r7 = r0.create
            o.addDrawerListener[] r8 = r0.setMin
            int r9 = r8.length
            float r10 = r0.hashCode
            float r10 = o.getTargetFragment.setMax(r10)
            o.addDrawerListener[] r11 = r0.setMin
            int r12 = r11.length
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0035:
            if (r15 >= r12) goto L_0x0062
            r13 = r11[r15]
            float r14 = r13.setMax
            boolean r14 = java.lang.Float.isNaN(r14)
            if (r14 == 0) goto L_0x0044
            float r14 = r0.IsOverlapping
            goto L_0x0046
        L_0x0044:
            float r14 = r13.setMax
        L_0x0046:
            float r14 = o.getTargetFragment.setMax(r14)
            int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x0050
            r17 = r14
        L_0x0050:
            java.lang.String r13 = r13.length
            if (r13 == 0) goto L_0x005f
            int r13 = o.getTargetFragment.getMin((android.graphics.Paint) r1, (java.lang.String) r13)
            float r13 = (float) r13
            int r14 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x005f
            r16 = r13
        L_0x005f:
            int r15 = r15 + 1
            goto L_0x0035
        L_0x0062:
            float r16 = r16 + r17
            float r10 = r16 + r10
            r0.valueOf = r10
            o.addDrawerListener[] r10 = r0.setMin
            int r11 = r10.length
            r12 = 0
            r13 = 0
        L_0x006d:
            if (r13 >= r11) goto L_0x0082
            r14 = r10[r13]
            java.lang.String r14 = r14.length
            if (r14 == 0) goto L_0x007f
            int r14 = o.getTargetFragment.setMax((android.graphics.Paint) r1, (java.lang.String) r14)
            float r14 = (float) r14
            int r15 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x007f
            r12 = r14
        L_0x007f:
            int r13 = r13 + 1
            goto L_0x006d
        L_0x0082:
            r0.invoke = r12
            int[] r10 = com.github.mikephil.charting.components.Legend.AnonymousClass2.length
            com.github.mikephil.charting.components.Legend$LegendOrientation r11 = r0.length
            int r11 = r11.ordinal()
            r10 = r10[r11]
            r11 = 1
            if (r10 == r11) goto L_0x01c1
            r12 = 2
            if (r10 == r12) goto L_0x0096
            goto L_0x0237
        L_0x0096:
            float r10 = o.getTargetFragment.getMax((android.graphics.Paint) r27)
            float r12 = o.getTargetFragment.length((android.graphics.Paint) r27)
            float r12 = r12 + r6
            float r6 = r28.IsOverlapping()
            float r13 = r0.FastBitmap$CoordinateSystem
            float r6 = r6 * r13
            java.util.List<java.lang.Boolean> r13 = r0.b
            r13.clear()
            java.util.List<o.getArguments> r13 = r0.Mean$Arithmetic
            r13.clear()
            java.util.List<o.getArguments> r13 = r0.getCause
            r13.clear()
            r17 = r2
            r2 = 0
            r11 = 0
            r13 = -1
            r14 = 0
            r15 = 0
        L_0x00bd:
            if (r15 >= r9) goto L_0x0197
            r19 = r5
            r5 = r8[r15]
            r20 = r8
            com.github.mikephil.charting.components.Legend$LegendForm r8 = r5.setMin
            r21 = r12
            com.github.mikephil.charting.components.Legend$LegendForm r12 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r8 == r12) goto L_0x00cf
            r8 = 1
            goto L_0x00d0
        L_0x00cf:
            r8 = 0
        L_0x00d0:
            float r12 = r5.setMax
            boolean r12 = java.lang.Float.isNaN(r12)
            if (r12 == 0) goto L_0x00db
            r12 = r17
            goto L_0x00e1
        L_0x00db:
            float r12 = r5.setMax
            float r12 = o.getTargetFragment.setMax(r12)
        L_0x00e1:
            java.lang.String r5 = r5.length
            r22 = r11
            java.util.List<java.lang.Boolean> r11 = r0.b
            r23 = r10
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r11.add(r10)
            r10 = -1
            if (r13 != r10) goto L_0x00f3
            r10 = 0
            goto L_0x00f5
        L_0x00f3:
            float r10 = r14 + r3
        L_0x00f5:
            if (r5 == 0) goto L_0x0115
            java.util.List<o.getArguments> r11 = r0.Mean$Arithmetic
            o.getArguments r14 = o.getTargetFragment.length(r1, r5)
            r11.add(r14)
            if (r8 == 0) goto L_0x0105
            float r8 = r4 + r12
            goto L_0x0106
        L_0x0105:
            r8 = 0
        L_0x0106:
            float r10 = r10 + r8
            java.util.List<o.getArguments> r8 = r0.Mean$Arithmetic
            java.lang.Object r8 = r8.get(r15)
            o.getArguments r8 = (o.getArguments) r8
            float r8 = r8.length
            float r10 = r10 + r8
            r14 = r10
            r8 = -1
            goto L_0x012d
        L_0x0115:
            java.util.List<o.getArguments> r11 = r0.Mean$Arithmetic
            r24 = r12
            r14 = 0
            o.getArguments r12 = o.getArguments.length(r14, r14)
            r11.add(r12)
            if (r8 == 0) goto L_0x0126
            r12 = r24
            goto L_0x0127
        L_0x0126:
            r12 = 0
        L_0x0127:
            float r10 = r10 + r12
            r8 = -1
            r14 = r10
            if (r13 != r8) goto L_0x012d
            r13 = r15
        L_0x012d:
            if (r5 != 0) goto L_0x0139
            int r10 = r9 + -1
            if (r15 != r10) goto L_0x0134
            goto L_0x0139
        L_0x0134:
            r11 = r22
            r12 = r23
            goto L_0x0189
        L_0x0139:
            r10 = 0
            int r11 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r11 != 0) goto L_0x0140
            r11 = 0
            goto L_0x0142
        L_0x0140:
            r11 = r19
        L_0x0142:
            if (r7 == 0) goto L_0x0171
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0171
            float r12 = r6 - r2
            float r18 = r11 + r14
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 < 0) goto L_0x0151
            goto L_0x0171
        L_0x0151:
            java.util.List<o.getArguments> r11 = r0.getCause
            r12 = r23
            o.getArguments r8 = o.getArguments.length(r2, r12)
            r11.add(r8)
            r8 = r22
            float r2 = java.lang.Math.max(r8, r2)
            java.util.List<java.lang.Boolean> r8 = r0.b
            if (r13 < 0) goto L_0x0168
            r11 = r13
            goto L_0x0169
        L_0x0168:
            r11 = r15
        L_0x0169:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r8.set(r11, r10)
            r11 = r2
            r2 = r14
            goto L_0x0178
        L_0x0171:
            r8 = r22
            r12 = r23
            float r11 = r11 + r14
            float r2 = r2 + r11
            r11 = r8
        L_0x0178:
            int r8 = r9 + -1
            if (r15 != r8) goto L_0x0189
            java.util.List<o.getArguments> r8 = r0.getCause
            o.getArguments r10 = o.getArguments.length(r2, r12)
            r8.add(r10)
            float r11 = java.lang.Math.max(r11, r2)
        L_0x0189:
            if (r5 == 0) goto L_0x018c
            r13 = -1
        L_0x018c:
            int r15 = r15 + 1
            r10 = r12
            r5 = r19
            r8 = r20
            r12 = r21
            goto L_0x00bd
        L_0x0197:
            r8 = r11
            r21 = r12
            r12 = r10
            r0.Grayscale$Algorithm = r8
            java.util.List<o.getArguments> r1 = r0.getCause
            int r1 = r1.size()
            float r1 = (float) r1
            float r10 = r12 * r1
            java.util.List<o.getArguments> r1 = r0.getCause
            int r1 = r1.size()
            if (r1 != 0) goto L_0x01b0
            r13 = 0
            goto L_0x01b9
        L_0x01b0:
            java.util.List<o.getArguments> r1 = r0.getCause
            int r1 = r1.size()
            r2 = 1
            int r13 = r1 + -1
        L_0x01b9:
            float r1 = (float) r13
            float r12 = r21 * r1
            float r10 = r10 + r12
            r0.invokeSuspend = r10
            goto L_0x0237
        L_0x01c1:
            r17 = r2
            r20 = r8
            r2 = 1
            float r5 = o.getTargetFragment.getMax((android.graphics.Paint) r27)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r14 = 0
        L_0x01cf:
            if (r10 >= r9) goto L_0x0233
            r12 = r20[r10]
            com.github.mikephil.charting.components.Legend$LegendForm r13 = r12.setMin
            com.github.mikephil.charting.components.Legend$LegendForm r15 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r13 == r15) goto L_0x01db
            r13 = 1
            goto L_0x01dc
        L_0x01db:
            r13 = 0
        L_0x01dc:
            float r15 = r12.setMax
            boolean r15 = java.lang.Float.isNaN(r15)
            if (r15 == 0) goto L_0x01e7
            r15 = r17
            goto L_0x01ed
        L_0x01e7:
            float r15 = r12.setMax
            float r15 = o.getTargetFragment.setMax(r15)
        L_0x01ed:
            java.lang.String r12 = r12.length
            if (r11 != 0) goto L_0x01f2
            r8 = 0
        L_0x01f2:
            if (r13 == 0) goto L_0x01f8
            if (r11 == 0) goto L_0x01f7
            float r8 = r8 + r3
        L_0x01f7:
            float r8 = r8 + r15
        L_0x01f8:
            if (r12 == 0) goto L_0x0225
            if (r13 == 0) goto L_0x0200
            if (r11 != 0) goto L_0x0200
            float r8 = r8 + r4
            goto L_0x020d
        L_0x0200:
            if (r11 == 0) goto L_0x020d
            float r14 = java.lang.Math.max(r14, r8)
            float r8 = r5 + r6
            float r7 = r7 + r8
            r8 = r14
            r11 = 0
            r14 = 0
            goto L_0x0212
        L_0x020d:
            r25 = r14
            r14 = r8
            r8 = r25
        L_0x0212:
            int r12 = o.getTargetFragment.getMin((android.graphics.Paint) r1, (java.lang.String) r12)
            float r12 = (float) r12
            float r14 = r14 + r12
            int r12 = r9 + -1
            if (r10 >= r12) goto L_0x021f
            float r12 = r5 + r6
            float r7 = r7 + r12
        L_0x021f:
            r25 = r14
            r14 = r8
            r8 = r25
            goto L_0x022c
        L_0x0225:
            float r8 = r8 + r15
            int r11 = r9 + -1
            if (r10 >= r11) goto L_0x022b
            float r8 = r8 + r3
        L_0x022b:
            r11 = 1
        L_0x022c:
            float r14 = java.lang.Math.max(r14, r8)
            int r10 = r10 + 1
            goto L_0x01cf
        L_0x0233:
            r0.Grayscale$Algorithm = r14
            r0.invokeSuspend = r7
        L_0x0237:
            float r1 = r0.invokeSuspend
            float r2 = r0.ICustomTabsCallback$Default
            float r1 = r1 + r2
            r0.invokeSuspend = r1
            float r1 = r0.Grayscale$Algorithm
            float r2 = r0.asInterface
            float r1 = r1 + r2
            r0.Grayscale$Algorithm = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.length(android.graphics.Paint, o.setTargetFragment):void");
    }

    /* renamed from: com.github.mikephil.charting.components.Legend$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.AnonymousClass2.<clinit>():void");
        }
    }
}
