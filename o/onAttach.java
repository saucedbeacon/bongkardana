package o;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.components.Legend;
import java.util.ArrayList;
import java.util.List;

public class onAttach extends onDestroyView {
    private Path IsOverlapping = new Path();
    protected Legend getMax;
    protected Paint.FontMetrics getMin = new Paint.FontMetrics();
    protected Paint length;
    protected List<addDrawerListener> setMax = new ArrayList(16);
    protected Paint setMin;

    public onAttach(setTargetFragment settargetfragment, Legend legend) {
        super(settargetfragment);
        this.getMax = legend;
        Paint paint = new Paint(1);
        this.setMin = paint;
        paint.setTextSize(getTargetFragment.setMax(9.0f));
        this.setMin.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.length = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    public final Paint getMax() {
        return this.setMin;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: o.checkDrawerViewAbsoluteGravity<?>} */
    /* JADX WARNING: type inference failed for: r7v2, types: [o.EmojiAppCompatTextView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(o.checkDrawerViewAbsoluteGravity<?> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.github.mikephil.charting.components.Legend r2 = r0.getMax
            boolean r2 = r2.length()
            if (r2 != 0) goto L_0x01c6
            java.util.List<o.addDrawerListener> r2 = r0.setMax
            r2.clear()
            r3 = 0
        L_0x0012:
            int r4 = r19.setMin()
            if (r3 >= r4) goto L_0x01a5
            o.EmojiAppCompatTextView r4 = r1.setMin(r3)
            java.util.List r5 = r4.setMin()
            int r6 = r4.ICustomTabsCallback()
            boolean r7 = r4 instanceof o.EmojiAppCompatEditText
            if (r7 == 0) goto L_0x0096
            r7 = r4
            o.EmojiAppCompatEditText r7 = (o.EmojiAppCompatEditText) r7
            boolean r8 = r7.IsOverlapping()
            if (r8 == 0) goto L_0x0096
            java.lang.String[] r6 = r7.onTransact()
            r8 = 0
        L_0x0036:
            int r9 = r5.size()
            if (r8 >= r9) goto L_0x0074
            int r9 = r7.FastBitmap$CoordinateSystem()
            if (r8 >= r9) goto L_0x0074
            java.util.List<o.addDrawerListener> r9 = r0.setMax
            o.addDrawerListener r15 = new o.addDrawerListener
            int r10 = r6.length
            int r10 = r8 % r10
            r11 = r6[r10]
            com.github.mikephil.charting.components.Legend$LegendForm r12 = r4.invoke()
            float r13 = r4.Grayscale$Algorithm()
            float r14 = r4.invokeSuspend()
            android.graphics.DashPathEffect r16 = r4.valueOf()
            java.lang.Object r10 = r5.get(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r17 = r10.intValue()
            r10 = r15
            r2 = r15
            r15 = r16
            r16 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.add(r2)
            int r8 = r8 + 1
            goto L_0x0036
        L_0x0074:
            java.lang.String r2 = r7.isInside()
            if (r2 == 0) goto L_0x0093
            java.util.List<o.addDrawerListener> r2 = r0.setMax
            o.addDrawerListener r12 = new o.addDrawerListener
            java.lang.String r6 = r4.isInside()
            com.github.mikephil.charting.components.Legend$LegendForm r7 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            r8 = 2143289344(0x7fc00000, float:NaN)
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 0
            r11 = 1122867(0x112233, float:1.573472E-39)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.add(r12)
        L_0x0093:
            r2 = r1
            goto L_0x01a0
        L_0x0096:
            boolean r2 = r4 instanceof o.getEmojiReplaceStrategy
            if (r2 == 0) goto L_0x00fc
            r2 = r4
            o.getEmojiReplaceStrategy r2 = (o.getEmojiReplaceStrategy) r2
            r7 = 0
        L_0x009e:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x00db
            if (r7 >= r6) goto L_0x00db
            java.util.List<o.addDrawerListener> r8 = r0.setMax
            o.addDrawerListener r15 = new o.addDrawerListener
            com.github.mikephil.charting.data.Entry r9 = r2.toIntRange(r7)
            com.github.mikephil.charting.data.PieEntry r9 = (com.github.mikephil.charting.data.PieEntry) r9
            java.lang.String r10 = r9.getMin
            com.github.mikephil.charting.components.Legend$LegendForm r11 = r4.invoke()
            float r12 = r4.Grayscale$Algorithm()
            float r13 = r4.invokeSuspend()
            android.graphics.DashPathEffect r14 = r4.valueOf()
            java.lang.Object r9 = r5.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r16 = r9.intValue()
            r9 = r15
            r1 = r15
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.add(r1)
            int r7 = r7 + 1
            r1 = r19
            goto L_0x009e
        L_0x00db:
            java.lang.String r1 = r2.isInside()
            if (r1 == 0) goto L_0x019e
            java.util.List<o.addDrawerListener> r1 = r0.setMax
            o.addDrawerListener r2 = new o.addDrawerListener
            java.lang.String r6 = r4.isInside()
            com.github.mikephil.charting.components.Legend$LegendForm r7 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            r8 = 2143289344(0x7fc00000, float:NaN)
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 0
            r11 = 1122867(0x112233, float:1.573472E-39)
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r2)
            goto L_0x019e
        L_0x00fc:
            boolean r1 = r4 instanceof o.getMaxEmojiCount
            if (r1 == 0) goto L_0x0151
            r1 = r4
            o.getMaxEmojiCount r1 = (o.getMaxEmojiCount) r1
            int r2 = r1.asInterface()
            r7 = 1122867(0x112233, float:1.573472E-39)
            if (r2 == r7) goto L_0x0151
            int r14 = r1.asInterface()
            int r1 = r1.onTransact()
            java.util.List<o.addDrawerListener> r2 = r0.setMax
            o.addDrawerListener r5 = new o.addDrawerListener
            r9 = 0
            com.github.mikephil.charting.components.Legend$LegendForm r10 = r4.invoke()
            float r11 = r4.Grayscale$Algorithm()
            float r12 = r4.invokeSuspend()
            android.graphics.DashPathEffect r13 = r4.valueOf()
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.add(r5)
            java.util.List<o.addDrawerListener> r2 = r0.setMax
            o.addDrawerListener r12 = new o.addDrawerListener
            java.lang.String r6 = r4.isInside()
            com.github.mikephil.charting.components.Legend$LegendForm r7 = r4.invoke()
            float r8 = r4.Grayscale$Algorithm()
            float r9 = r4.invokeSuspend()
            android.graphics.DashPathEffect r10 = r4.valueOf()
            r5 = r12
            r11 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.add(r12)
            goto L_0x019e
        L_0x0151:
            r1 = 0
        L_0x0152:
            int r2 = r5.size()
            if (r1 >= r2) goto L_0x019e
            if (r1 >= r6) goto L_0x019e
            int r2 = r5.size()
            int r2 = r2 + -1
            if (r1 >= r2) goto L_0x016b
            int r2 = r6 + -1
            if (r1 >= r2) goto L_0x016b
            r2 = 0
            r9 = r2
            r2 = r19
            goto L_0x0176
        L_0x016b:
            r2 = r19
            o.EmojiAppCompatTextView r7 = r2.setMin(r3)
            java.lang.String r7 = r7.isInside()
            r9 = r7
        L_0x0176:
            java.util.List<o.addDrawerListener> r7 = r0.setMax
            o.addDrawerListener r15 = new o.addDrawerListener
            com.github.mikephil.charting.components.Legend$LegendForm r10 = r4.invoke()
            float r11 = r4.Grayscale$Algorithm()
            float r12 = r4.invokeSuspend()
            android.graphics.DashPathEffect r13 = r4.valueOf()
            java.lang.Object r8 = r5.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r14 = r8.intValue()
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7.add(r15)
            int r1 = r1 + 1
            goto L_0x0152
        L_0x019e:
            r2 = r19
        L_0x01a0:
            int r3 = r3 + 1
            r1 = r2
            goto L_0x0012
        L_0x01a5:
            com.github.mikephil.charting.components.Legend r1 = r0.getMax
            o.addDrawerListener[] r1 = r1.setMax
            if (r1 == 0) goto L_0x01b4
            java.util.List<o.addDrawerListener> r1 = r0.setMax
            com.github.mikephil.charting.components.Legend r2 = r0.getMax
            o.addDrawerListener[] r2 = r2.setMax
            java.util.Collections.addAll(r1, r2)
        L_0x01b4:
            com.github.mikephil.charting.components.Legend r1 = r0.getMax
            java.util.List<o.addDrawerListener> r2 = r0.setMax
            int r3 = r2.size()
            o.addDrawerListener[] r3 = new o.addDrawerListener[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            o.addDrawerListener[] r2 = (o.addDrawerListener[]) r2
            r1.setMin = r2
        L_0x01c6:
            com.github.mikephil.charting.components.Legend r1 = r0.getMax
            android.graphics.Typeface r1 = r1.getCause()
            if (r1 == 0) goto L_0x01d3
            android.graphics.Paint r2 = r0.setMin
            r2.setTypeface(r1)
        L_0x01d3:
            android.graphics.Paint r1 = r0.setMin
            com.github.mikephil.charting.components.Legend r2 = r0.getMax
            float r2 = r2.onNavigationEvent()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r0.setMin
            com.github.mikephil.charting.components.Legend r2 = r0.getMax
            int r2 = r2.ICustomTabsCallback()
            r1.setColor(r2)
            com.github.mikephil.charting.components.Legend r1 = r0.getMax
            android.graphics.Paint r2 = r0.setMin
            o.setTargetFragment r3 = r0.invokeSuspend
            r1.length(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onAttach.getMax(o.checkDrawerViewAbsoluteGravity):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(android.graphics.Canvas r35) {
        /*
            r34 = this;
            r6 = r34
            r7 = r35
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            boolean r0 = r0.create()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            android.graphics.Typeface r0 = r0.getCause()
            if (r0 == 0) goto L_0x001a
            android.graphics.Paint r1 = r6.setMin
            r1.setTypeface(r0)
        L_0x001a:
            android.graphics.Paint r0 = r6.setMin
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            float r1 = r1.onNavigationEvent()
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.setMin
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            int r1 = r1.ICustomTabsCallback()
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.setMin
            android.graphics.Paint$FontMetrics r1 = r6.getMin
            float r8 = o.getTargetFragment.getMin((android.graphics.Paint) r0, (android.graphics.Paint.FontMetrics) r1)
            android.graphics.Paint r0 = r6.setMin
            android.graphics.Paint$FontMetrics r1 = r6.getMin
            float r0 = o.getTargetFragment.setMax((android.graphics.Paint) r0, (android.graphics.Paint.FontMetrics) r1)
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            float r1 = r1.toDoubleRange
            float r1 = o.getTargetFragment.setMax(r1)
            float r9 = r0 + r1
            android.graphics.Paint r0 = r6.setMin
            java.lang.String r1 = "ABC"
            int r0 = o.getTargetFragment.setMax((android.graphics.Paint) r0, (java.lang.String) r1)
            float r0 = (float) r0
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r10
            float r11 = r8 - r0
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            o.addDrawerListener[] r12 = r0.setMin
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            float r0 = r0.hashCode
            float r13 = o.getTargetFragment.setMax(r0)
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            float r0 = r0.values
            float r14 = o.getTargetFragment.setMax(r0)
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            com.github.mikephil.charting.components.Legend$LegendOrientation r0 = r0.length
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r15 = r1.getMax
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r1 = r1.getMin
            com.github.mikephil.charting.components.Legend r2 = r6.getMax
            com.github.mikephil.charting.components.Legend$LegendDirection r5 = r2.equals
            com.github.mikephil.charting.components.Legend r2 = r6.getMax
            float r2 = r2.IsOverlapping
            float r16 = o.getTargetFragment.setMax(r2)
            com.github.mikephil.charting.components.Legend r2 = r6.getMax
            float r2 = r2.toString
            float r4 = o.getTargetFragment.setMax(r2)
            com.github.mikephil.charting.components.Legend r2 = r6.getMax
            float r2 = r2.Mean$Arithmetic()
            com.github.mikephil.charting.components.Legend r3 = r6.getMax
            float r3 = r3.invokeSuspend()
            int[] r17 = o.onAttach.AnonymousClass1.setMin
            int r18 = r15.ordinal()
            r10 = r17[r18]
            r17 = r4
            r4 = 2
            r20 = 0
            r21 = r14
            r14 = 1
            if (r10 == r14) goto L_0x0135
            if (r10 == r4) goto L_0x0115
            r4 = 3
            if (r10 == r4) goto L_0x00b5
            r26 = r8
            r14 = r9
            r7 = 0
            goto L_0x014f
        L_0x00b5:
            com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r4) goto L_0x00c3
            o.setTargetFragment r4 = r6.invokeSuspend
            float r4 = r4.invoke()
            r10 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r10
            goto L_0x00d3
        L_0x00c3:
            r10 = 1073741824(0x40000000, float:2.0)
            o.setTargetFragment r4 = r6.invokeSuspend
            float r4 = r4.isInside()
            o.setTargetFragment r14 = r6.invokeSuspend
            float r14 = r14.IsOverlapping()
            float r14 = r14 / r10
            float r4 = r4 + r14
        L_0x00d3:
            com.github.mikephil.charting.components.Legend$LegendDirection r10 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r5 != r10) goto L_0x00d9
            r10 = r3
            goto L_0x00da
        L_0x00d9:
            float r10 = -r3
        L_0x00da:
            float r4 = r4 + r10
            com.github.mikephil.charting.components.Legend$LegendOrientation r10 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r10) goto L_0x0111
            r14 = r9
            double r9 = (double) r4
            com.github.mikephil.charting.components.Legend$LegendDirection r4 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            r24 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r5 != r4) goto L_0x00fa
            com.github.mikephil.charting.components.Legend r4 = r6.getMax
            float r4 = r4.Grayscale$Algorithm
            float r4 = -r4
            r26 = r8
            double r7 = (double) r4
            java.lang.Double.isNaN(r7)
            double r7 = r7 / r24
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r7 = r7 + r3
            goto L_0x010b
        L_0x00fa:
            r26 = r8
            com.github.mikephil.charting.components.Legend r4 = r6.getMax
            float r4 = r4.Grayscale$Algorithm
            double r7 = (double) r4
            java.lang.Double.isNaN(r7)
            double r7 = r7 / r24
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r7 = r7 - r3
        L_0x010b:
            java.lang.Double.isNaN(r9)
            double r9 = r9 + r7
            float r4 = (float) r9
            goto L_0x0133
        L_0x0111:
            r26 = r8
            r14 = r9
            goto L_0x0133
        L_0x0115:
            r26 = r8
            r14 = r9
            com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r4) goto L_0x0123
            o.setTargetFragment r4 = r6.invokeSuspend
            float r4 = r4.invoke()
            goto L_0x0129
        L_0x0123:
            o.setTargetFragment r4 = r6.invokeSuspend
            float r4 = r4.equals()
        L_0x0129:
            float r4 = r4 - r3
            com.github.mikephil.charting.components.Legend$LegendDirection r3 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r5 != r3) goto L_0x0133
            com.github.mikephil.charting.components.Legend r3 = r6.getMax
            float r3 = r3.Grayscale$Algorithm
            float r4 = r4 - r3
        L_0x0133:
            r7 = r4
            goto L_0x014f
        L_0x0135:
            r26 = r8
            r14 = r9
            com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
            if (r0 != r4) goto L_0x013d
            goto L_0x0144
        L_0x013d:
            o.setTargetFragment r4 = r6.invokeSuspend
            float r4 = r4.isInside()
            float r3 = r3 + r4
        L_0x0144:
            com.github.mikephil.charting.components.Legend$LegendDirection r4 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r5 != r4) goto L_0x014e
            com.github.mikephil.charting.components.Legend r4 = r6.getMax
            float r4 = r4.Grayscale$Algorithm
            float r4 = r4 + r3
            goto L_0x0133
        L_0x014e:
            r7 = r3
        L_0x014f:
            int[] r3 = o.onAttach.AnonymousClass1.getMax
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L_0x0266
            r4 = 2
            if (r0 == r4) goto L_0x015f
            goto L_0x0265
        L_0x015f:
            int[] r0 = o.onAttach.AnonymousClass1.getMin
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L_0x019f
            if (r0 == r4) goto L_0x0187
            r1 = 3
            if (r0 == r1) goto L_0x0170
            r0 = 0
            goto L_0x01ac
        L_0x0170:
            o.setTargetFragment r0 = r6.invokeSuspend
            float r0 = r0.Grayscale$Algorithm()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            com.github.mikephil.charting.components.Legend r2 = r6.getMax
            float r2 = r2.invokeSuspend
            float r2 = r2 / r1
            float r0 = r0 - r2
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            float r1 = r1.Mean$Arithmetic()
            float r0 = r0 + r1
            goto L_0x01ac
        L_0x0187:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r15 != r0) goto L_0x0192
            o.setTargetFragment r0 = r6.invokeSuspend
            float r0 = r0.Grayscale$Algorithm()
            goto L_0x0198
        L_0x0192:
            o.setTargetFragment r0 = r6.invokeSuspend
            float r0 = r0.toFloatRange()
        L_0x0198:
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            float r1 = r1.invokeSuspend
            float r1 = r1 + r2
            float r0 = r0 - r1
            goto L_0x01ac
        L_0x019f:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r15 != r0) goto L_0x01a5
            r0 = 0
            goto L_0x01ab
        L_0x01a5:
            o.setTargetFragment r0 = r6.invokeSuspend
            float r0 = r0.toIntRange()
        L_0x01ab:
            float r0 = r0 + r2
        L_0x01ac:
            r9 = r0
            r10 = 0
            r15 = 0
            r18 = 0
        L_0x01b1:
            int r0 = r12.length
            if (r15 >= r0) goto L_0x0265
            r4 = r12[r15]
            com.github.mikephil.charting.components.Legend$LegendForm r0 = r4.setMin
            com.github.mikephil.charting.components.Legend$LegendForm r1 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r0 == r1) goto L_0x01bf
            r19 = 1
            goto L_0x01c1
        L_0x01bf:
            r19 = 0
        L_0x01c1:
            float r0 = r4.setMax
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x01cc
            r21 = r16
            goto L_0x01d4
        L_0x01cc:
            float r0 = r4.setMax
            float r0 = o.getTargetFragment.setMax(r0)
            r21 = r0
        L_0x01d4:
            if (r19 == 0) goto L_0x0204
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r5 != r0) goto L_0x01dd
            float r0 = r7 + r18
            goto L_0x01e1
        L_0x01dd:
            float r0 = r21 - r18
            float r0 = r7 - r0
        L_0x01e1:
            r22 = r0
            float r3 = r9 + r11
            com.github.mikephil.charting.components.Legend r2 = r6.getMax
            r0 = r34
            r1 = r35
            r24 = r2
            r2 = r22
            r8 = r17
            r17 = r4
            r27 = r11
            r11 = r5
            r5 = r24
            r0.length(r1, r2, r3, r4, r5)
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r0) goto L_0x0201
            float r22 = r22 + r21
        L_0x0201:
            r0 = r17
            goto L_0x020c
        L_0x0204:
            r27 = r11
            r8 = r17
            r11 = r5
            r0 = r4
            r22 = r7
        L_0x020c:
            java.lang.String r1 = r0.length
            if (r1 == 0) goto L_0x0255
            if (r19 == 0) goto L_0x021e
            if (r10 != 0) goto L_0x021e
            com.github.mikephil.charting.components.Legend$LegendDirection r1 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r1) goto L_0x021a
            r1 = r13
            goto L_0x021b
        L_0x021a:
            float r1 = -r13
        L_0x021b:
            float r22 = r22 + r1
            goto L_0x0222
        L_0x021e:
            if (r10 == 0) goto L_0x0222
            r22 = r7
        L_0x0222:
            com.github.mikephil.charting.components.Legend$LegendDirection r1 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r1) goto L_0x0231
            android.graphics.Paint r1 = r6.setMin
            java.lang.String r2 = r0.length
            int r1 = o.getTargetFragment.getMin((android.graphics.Paint) r1, (java.lang.String) r2)
            float r1 = (float) r1
            float r22 = r22 - r1
        L_0x0231:
            r1 = r22
            if (r10 != 0) goto L_0x0241
            float r2 = r9 + r26
            java.lang.String r0 = r0.length
            android.graphics.Paint r3 = r6.setMin
            r5 = r35
            r5.drawText(r0, r1, r2, r3)
            goto L_0x024f
        L_0x0241:
            r5 = r35
            float r2 = r26 + r14
            float r9 = r9 + r2
            float r2 = r9 + r26
            java.lang.String r0 = r0.length
            android.graphics.Paint r3 = r6.setMin
            r5.drawText(r0, r1, r2, r3)
        L_0x024f:
            float r0 = r26 + r14
            float r9 = r9 + r0
            r18 = 0
            goto L_0x025c
        L_0x0255:
            r5 = r35
            float r21 = r21 + r8
            float r18 = r18 + r21
            r10 = 1
        L_0x025c:
            int r15 = r15 + 1
            r17 = r8
            r5 = r11
            r11 = r27
            goto L_0x01b1
        L_0x0265:
            return
        L_0x0266:
            r27 = r11
            r8 = r17
            r11 = r5
            r5 = r35
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            java.util.List<o.getArguments> r9 = r0.getCause
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            java.util.List<o.getArguments> r10 = r0.Mean$Arithmetic
            com.github.mikephil.charting.components.Legend r0 = r6.getMax
            java.util.List<java.lang.Boolean> r4 = r0.b
            int[] r0 = o.onAttach.AnonymousClass1.getMin
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r3 = 1
            if (r0 == r3) goto L_0x02a9
            r1 = 2
            if (r0 == r1) goto L_0x029c
            r1 = 3
            if (r0 == r1) goto L_0x028c
            r2 = 0
            goto L_0x02a9
        L_0x028c:
            o.setTargetFragment r0 = r6.invokeSuspend
            float r0 = r0.Grayscale$Algorithm()
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            float r1 = r1.invokeSuspend
            float r0 = r0 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r2 + r0
            goto L_0x02a9
        L_0x029c:
            o.setTargetFragment r0 = r6.invokeSuspend
            float r0 = r0.Grayscale$Algorithm()
            float r0 = r0 - r2
            com.github.mikephil.charting.components.Legend r1 = r6.getMax
            float r1 = r1.invokeSuspend
            float r2 = r0 - r1
        L_0x02a9:
            int r1 = r12.length
            r17 = r7
            r0 = 0
            r3 = 0
        L_0x02ae:
            if (r0 >= r1) goto L_0x03c6
            r18 = r8
            r8 = r12[r0]
            r20 = r1
            com.github.mikephil.charting.components.Legend$LegendForm r1 = r8.setMin
            com.github.mikephil.charting.components.Legend$LegendForm r5 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r1 == r5) goto L_0x02bf
            r22 = 1
            goto L_0x02c1
        L_0x02bf:
            r22 = 0
        L_0x02c1:
            float r1 = r8.setMax
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02cc
            r24 = r16
            goto L_0x02d4
        L_0x02cc:
            float r1 = r8.setMax
            float r1 = o.getTargetFragment.setMax(r1)
            r24 = r1
        L_0x02d4:
            int r1 = r4.size()
            if (r0 >= r1) goto L_0x02ed
            java.lang.Object r1 = r4.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02ed
            float r1 = r26 + r14
            float r2 = r2 + r1
            r17 = r2
            r1 = r7
            goto L_0x02f1
        L_0x02ed:
            r1 = r17
            r17 = r2
        L_0x02f1:
            int r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x031d
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            if (r15 != r2) goto L_0x031d
            int r2 = r9.size()
            if (r3 >= r2) goto L_0x031d
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r2) goto L_0x030c
            java.lang.Object r2 = r9.get(r3)
            o.getArguments r2 = (o.getArguments) r2
            float r2 = r2.length
            goto L_0x0315
        L_0x030c:
            java.lang.Object r2 = r9.get(r3)
            o.getArguments r2 = (o.getArguments) r2
            float r2 = r2.length
            float r2 = -r2
        L_0x0315:
            r19 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r19
            float r1 = r1 + r2
            int r3 = r3 + 1
            goto L_0x031f
        L_0x031d:
            r19 = 1073741824(0x40000000, float:2.0)
        L_0x031f:
            r28 = r3
            java.lang.String r2 = r8.length
            if (r2 != 0) goto L_0x0328
            r29 = 1
            goto L_0x032a
        L_0x0328:
            r29 = 0
        L_0x032a:
            if (r22 == 0) goto L_0x0358
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r2) goto L_0x0332
            float r1 = r1 - r24
        L_0x0332:
            r30 = r1
            float r3 = r17 + r27
            com.github.mikephil.charting.components.Legend r5 = r6.getMax
            r2 = r0
            r0 = r34
            r1 = r35
            r31 = r7
            r7 = r2
            r2 = r30
            r23 = 1
            r32 = r4
            r4 = r8
            r33 = r9
            r9 = r35
            r0.length(r1, r2, r3, r4, r5)
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r0) goto L_0x0355
            float r1 = r30 + r24
            goto L_0x0363
        L_0x0355:
            r1 = r30
            goto L_0x0363
        L_0x0358:
            r32 = r4
            r31 = r7
            r33 = r9
            r23 = 1
            r9 = r35
            r7 = r0
        L_0x0363:
            if (r29 != 0) goto L_0x03a1
            if (r22 == 0) goto L_0x036f
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r0) goto L_0x036d
            float r0 = -r13
            goto L_0x036e
        L_0x036d:
            r0 = r13
        L_0x036e:
            float r1 = r1 + r0
        L_0x036f:
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r0) goto L_0x037c
            java.lang.Object r0 = r10.get(r7)
            o.getArguments r0 = (o.getArguments) r0
            float r0 = r0.length
            float r1 = r1 - r0
        L_0x037c:
            float r0 = r17 + r26
            java.lang.String r2 = r8.length
            android.graphics.Paint r3 = r6.setMin
            r9.drawText(r2, r1, r0, r3)
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            if (r11 != r0) goto L_0x0392
            java.lang.Object r0 = r10.get(r7)
            o.getArguments r0 = (o.getArguments) r0
            float r0 = r0.length
            float r1 = r1 + r0
        L_0x0392:
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r0) goto L_0x039a
            r0 = r21
            float r2 = -r0
            goto L_0x039d
        L_0x039a:
            r0 = r21
            r2 = r0
        L_0x039d:
            float r1 = r1 + r2
            r2 = r18
            goto L_0x03af
        L_0x03a1:
            r0 = r21
            com.github.mikephil.charting.components.Legend$LegendDirection r2 = com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT
            if (r11 != r2) goto L_0x03ab
            r2 = r18
            float r4 = -r2
            goto L_0x03ae
        L_0x03ab:
            r2 = r18
            r4 = r2
        L_0x03ae:
            float r1 = r1 + r4
        L_0x03af:
            int r3 = r7 + 1
            r21 = r0
            r8 = r2
            r0 = r3
            r5 = r9
            r2 = r17
            r3 = r28
            r7 = r31
            r4 = r32
            r9 = r33
            r17 = r1
            r1 = r20
            goto L_0x02ae
        L_0x03c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onAttach.setMax(android.graphics.Canvas):void");
    }

    private void length(Canvas canvas, float f, float f2, addDrawerListener adddrawerlistener, Legend legend) {
        float f3;
        float f4;
        DashPathEffect dashPathEffect;
        if (adddrawerlistener.equals != 1122868 && adddrawerlistener.equals != 1122867 && adddrawerlistener.equals != 0) {
            int save = canvas.save();
            Legend.LegendForm legendForm = adddrawerlistener.setMin;
            if (legendForm == Legend.LegendForm.DEFAULT) {
                legendForm = legend.isInside;
            }
            this.length.setColor(adddrawerlistener.equals);
            if (Float.isNaN(adddrawerlistener.setMax)) {
                f3 = legend.IsOverlapping;
            } else {
                f3 = adddrawerlistener.setMax;
            }
            float max = getTargetFragment.setMax(f3);
            float f5 = max / 2.0f;
            int i = AnonymousClass1.setMax[legendForm.ordinal()];
            if (i == 3 || i == 4) {
                this.length.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f + f5, f2, f5, this.length);
            } else if (i == 5) {
                this.length.setStyle(Paint.Style.FILL);
                canvas.drawRect(f, f2 - f5, f + max, f2 + f5, this.length);
            } else if (i == 6) {
                if (Float.isNaN(adddrawerlistener.getMin)) {
                    f4 = legend.toFloatRange;
                } else {
                    f4 = adddrawerlistener.getMin;
                }
                float max2 = getTargetFragment.setMax(f4);
                if (adddrawerlistener.getMax == null) {
                    dashPathEffect = legend.toIntRange;
                } else {
                    dashPathEffect = adddrawerlistener.getMax;
                }
                this.length.setStyle(Paint.Style.STROKE);
                this.length.setStrokeWidth(max2);
                this.length.setPathEffect(dashPathEffect);
                this.IsOverlapping.reset();
                this.IsOverlapping.moveTo(f, f2);
                this.IsOverlapping.lineTo(f + max, f2);
                canvas.drawPath(this.IsOverlapping, this.length);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: o.onAttach$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMax;
        static final /* synthetic */ int[] getMin;
        static final /* synthetic */ int[] setMax;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|(2:21|22)|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a4 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendForm[] r0 = com.github.mikephil.charting.components.Legend.LegendForm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendForm r2 = com.github.mikephil.charting.components.Legend.LegendForm.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = setMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = setMax     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = setMax     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.github.mikephil.charting.components.Legend$LegendForm r4 = com.github.mikephil.charting.components.Legend.LegendForm.LINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                getMax = r3
                com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r3 = getMax     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.github.mikephil.charting.components.Legend$LegendOrientation r4 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                getMin = r3
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r3 = getMin     // Catch:{ NoSuchFieldError -> 0x007f }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x007f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r3 = getMin     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                setMin = r3
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r4 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x009a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x009a }
            L_0x009a:
                int[] r1 = setMin     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x00ae }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x00ae }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ae }
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onAttach.AnonymousClass1.<clinit>():void");
        }
    }
}
