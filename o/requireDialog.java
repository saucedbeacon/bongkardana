package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.data.BarEntry;

public class requireDialog extends getShowsDialog {
    private RectF FastBitmap$CoordinateSystem = new RectF();
    protected EmojiCompat$LoadStrategy getMax;
    protected Paint getMin;
    protected Paint length;
    protected setChildInsets[] setMax;
    protected RectF setMin = new RectF();

    public final void setMin(Canvas canvas) {
    }

    public requireDialog(EmojiCompat$LoadStrategy emojiCompat$LoadStrategy, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.getMax = emojiCompat$LoadStrategy;
        this.IsOverlapping = new Paint(1);
        this.IsOverlapping.setStyle(Paint.Style.FILL);
        this.IsOverlapping.setColor(Color.rgb(0, 0, 0));
        this.IsOverlapping.setAlpha(120);
        Paint paint = new Paint(1);
        this.getMin = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.length = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    public void setMax() {
        getDrawerTitle barData = this.getMax.getBarData();
        this.setMax = new setChildInsets[barData.setMin()];
        for (int i = 0; i < this.setMax.length; i++) {
            EmojiAppCompatEditText emojiAppCompatEditText = (EmojiAppCompatEditText) barData.setMin(i);
            this.setMax[i] = new setChildInsets(emojiAppCompatEditText.ICustomTabsCallback() * 4 * (emojiAppCompatEditText.IsOverlapping() ? emojiAppCompatEditText.FastBitmap$CoordinateSystem() : 1), barData.setMin(), emojiAppCompatEditText.IsOverlapping());
        }
    }

    public final void getMax(Canvas canvas) {
        getDrawerTitle barData = this.getMax.getBarData();
        for (int i = 0; i < barData.setMin(); i++) {
            EmojiAppCompatEditText emojiAppCompatEditText = (EmojiAppCompatEditText) barData.setMin(i);
            if (emojiAppCompatEditText.b()) {
                setMin(canvas, emojiAppCompatEditText, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setMin(Canvas canvas, EmojiAppCompatEditText emojiAppCompatEditText, int i) {
        EmojiAppCompatEditText emojiAppCompatEditText2 = emojiAppCompatEditText;
        int i2 = i;
        getActivity transformer = this.getMax.getTransformer(emojiAppCompatEditText.getCause());
        this.length.setColor(emojiAppCompatEditText.ICustomTabsCallback$Default());
        this.length.setStrokeWidth(getTargetFragment.setMax(emojiAppCompatEditText.ICustomTabsCallback$Stub()));
        int i3 = 0;
        boolean z = true;
        boolean z2 = emojiAppCompatEditText.ICustomTabsCallback$Stub() > 0.0f;
        float min = this.equals.getMin();
        float length2 = this.equals.length();
        if (this.getMax.isDrawBarShadowEnabled()) {
            this.getMin.setColor(emojiAppCompatEditText.extraCallback());
            float f = this.getMax.getBarData().getMax / 2.0f;
            int min2 = Math.min((int) Math.ceil((double) (((float) emojiAppCompatEditText.ICustomTabsCallback()) * min)), emojiAppCompatEditText.ICustomTabsCallback());
            for (int i4 = 0; i4 < min2; i4++) {
                float length3 = ((BarEntry) emojiAppCompatEditText2.toIntRange(i4)).length();
                this.FastBitmap$CoordinateSystem.left = length3 - f;
                this.FastBitmap$CoordinateSystem.right = length3 + f;
                transformer.setMax(this.FastBitmap$CoordinateSystem);
                if (this.invokeSuspend.toFloatRange(this.FastBitmap$CoordinateSystem.right)) {
                    if (!this.invokeSuspend.isInside(this.FastBitmap$CoordinateSystem.left)) {
                        break;
                    }
                    this.FastBitmap$CoordinateSystem.top = this.invokeSuspend.toIntRange();
                    this.FastBitmap$CoordinateSystem.bottom = this.invokeSuspend.toFloatRange();
                    canvas.drawRect(this.FastBitmap$CoordinateSystem, this.getMin);
                } else {
                    Canvas canvas2 = canvas;
                }
            }
        }
        Canvas canvas3 = canvas;
        setChildInsets setchildinsets = this.setMax[i2];
        setchildinsets.setMin(min, length2);
        setchildinsets.getMin(i2);
        setchildinsets.length(this.getMax.isInverted(emojiAppCompatEditText.getCause()));
        setchildinsets.length(this.getMax.getBarData().getMax);
        setchildinsets.setMax(emojiAppCompatEditText2);
        transformer.length(setchildinsets.setMax);
        if (emojiAppCompatEditText.setMin().size() != 1) {
            z = false;
        }
        if (z) {
            this.toFloatRange.setColor(emojiAppCompatEditText.length());
        }
        while (i3 < setchildinsets.setMax.length) {
            int i5 = i3 + 2;
            if (this.invokeSuspend.toFloatRange(setchildinsets.setMax[i5])) {
                if (this.invokeSuspend.isInside(setchildinsets.setMax[i3])) {
                    if (!z) {
                        this.toFloatRange.setColor(emojiAppCompatEditText2.setMax(i3 / 4));
                    }
                    if (emojiAppCompatEditText.setMax() != null) {
                        getTheme max = emojiAppCompatEditText.setMax();
                        this.toFloatRange.setShader(new LinearGradient(setchildinsets.setMax[i3], setchildinsets.setMax[i3 + 3], setchildinsets.setMax[i3], setchildinsets.setMax[i3 + 1], max.getMax, max.setMax, Shader.TileMode.MIRROR));
                    }
                    if (emojiAppCompatEditText.getMax() != null) {
                        int i6 = i3 / 4;
                        this.toFloatRange.setShader(new LinearGradient(setchildinsets.setMax[i3], setchildinsets.setMax[i3 + 3], setchildinsets.setMax[i3], setchildinsets.setMax[i3 + 1], emojiAppCompatEditText2.getMax(i6).getMax, emojiAppCompatEditText2.getMax(i6).setMax, Shader.TileMode.MIRROR));
                    }
                    int i7 = i3 + 1;
                    int i8 = i3 + 3;
                    canvas.drawRect(setchildinsets.setMax[i3], setchildinsets.setMax[i7], setchildinsets.setMax[i5], setchildinsets.setMax[i8], this.toFloatRange);
                    if (z2) {
                        canvas.drawRect(setchildinsets.setMax[i3], setchildinsets.setMax[i7], setchildinsets.setMax[i5], setchildinsets.setMax[i8], this.length);
                    }
                } else {
                    return;
                }
            }
            i3 += 4;
            Canvas canvas4 = canvas;
        }
    }

    /* access modifiers changed from: protected */
    public void getMin(float f, float f2, float f3, float f4, getActivity getactivity) {
        this.setMin.set(f - f4, f2, f + f4, f3);
        getactivity.setMin(this.setMin, this.equals.length());
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMax(android.graphics.Canvas r42) {
        /*
            r41 = this;
            r6 = r41
            o.EmojiCompat$LoadStrategy r0 = r6.getMax
            boolean r0 = r6.length((o.setValue) r0)
            if (r0 == 0) goto L_0x0379
            o.EmojiCompat$LoadStrategy r0 = r6.getMax
            o.getDrawerTitle r0 = r0.getBarData()
            java.util.List r7 = r0.toIntRange()
            r0 = 1083179008(0x40900000, float:4.5)
            float r8 = o.getTargetFragment.setMax(r0)
            o.EmojiCompat$LoadStrategy r0 = r6.getMax
            boolean r9 = r0.isDrawValueAboveBarEnabled()
            r11 = 0
        L_0x0021:
            o.EmojiCompat$LoadStrategy r0 = r6.getMax
            o.getDrawerTitle r0 = r0.getBarData()
            int r0 = r0.setMin()
            if (r11 >= r0) goto L_0x0379
            java.lang.Object r0 = r7.get(r11)
            r12 = r0
            o.EmojiAppCompatEditText r12 = (o.EmojiAppCompatEditText) r12
            boolean r0 = getMin(r12)
            if (r0 == 0) goto L_0x0369
            r6.length((o.EmojiAppCompatTextView) r12)
            o.EmojiCompat$LoadStrategy r0 = r6.getMax
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.getCause()
            boolean r0 = r0.isInverted(r1)
            android.graphics.Paint r1 = r6.toString
            java.lang.String r2 = "8"
            int r1 = o.getTargetFragment.setMax((android.graphics.Paint) r1, (java.lang.String) r2)
            float r1 = (float) r1
            if (r9 == 0) goto L_0x0054
            float r2 = -r8
            goto L_0x0056
        L_0x0054:
            float r2 = r1 + r8
        L_0x0056:
            if (r9 == 0) goto L_0x005b
            float r3 = r1 + r8
            goto L_0x005c
        L_0x005b:
            float r3 = -r8
        L_0x005c:
            if (r0 == 0) goto L_0x0064
            float r0 = -r2
            float r2 = r0 - r1
            float r0 = -r3
            float r3 = r0 - r1
        L_0x0064:
            r13 = r2
            r14 = r3
            o.setChildInsets[] r0 = r6.setMax
            r15 = r0[r11]
            o.setDrawerShadow r0 = r6.equals
            float r16 = r0.length()
            o.closeDrawers r5 = r12.toFloatRange()
            o.setArguments r0 = r12.onNavigationEvent()
            o.setArguments r4 = o.setArguments.setMax(r0)
            float r0 = r4.length
            float r0 = o.getTargetFragment.setMax(r0)
            r4.length = r0
            float r0 = r4.getMin
            float r0 = o.getTargetFragment.setMax(r0)
            r4.getMin = r0
            boolean r0 = r12.IsOverlapping()
            r17 = 1073741824(0x40000000, float:2.0)
            r18 = 0
            if (r0 != 0) goto L_0x0188
            r3 = 0
        L_0x0097:
            float r0 = (float) r3
            float[] r1 = r15.setMax
            int r1 = r1.length
            float r1 = (float) r1
            o.setDrawerShadow r2 = r6.equals
            float r2 = r2.getMin()
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x017f
            float[] r0 = r15.setMax
            r0 = r0[r3]
            float[] r1 = r15.setMax
            int r2 = r3 + 2
            r1 = r1[r2]
            float r0 = r0 + r1
            float r2 = r0 / r17
            o.setTargetFragment r0 = r6.invokeSuspend
            boolean r0 = r0.isInside(r2)
            if (r0 == 0) goto L_0x017f
            o.setTargetFragment r0 = r6.invokeSuspend
            float[] r1 = r15.setMax
            int r16 = r3 + 1
            r1 = r1[r16]
            boolean r0 = r0.IsOverlapping(r1)
            if (r0 == 0) goto L_0x016a
            o.setTargetFragment r0 = r6.invokeSuspend
            boolean r0 = r0.toFloatRange(r2)
            if (r0 == 0) goto L_0x016a
            int r0 = r3 / 4
            com.github.mikephil.charting.data.Entry r1 = r12.toIntRange(r0)
            com.github.mikephil.charting.data.BarEntry r1 = (com.github.mikephil.charting.data.BarEntry) r1
            float r19 = r1.getMin()
            boolean r20 = r12.Mean$Arithmetic()
            if (r20 == 0) goto L_0x0124
            float r10 = r1.getMin()
            java.lang.String r10 = r5.getMin(r10)
            int r21 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            if (r21 < 0) goto L_0x00f9
            r21 = r1
            float[] r1 = r15.setMax
            r1 = r1[r16]
            float r1 = r1 + r13
            goto L_0x0102
        L_0x00f9:
            r21 = r1
            float[] r1 = r15.setMax
            int r22 = r3 + 3
            r1 = r1[r22]
            float r1 = r1 + r14
        L_0x0102:
            r22 = r1
            int r23 = r12.getMin((int) r0)
            r0 = r41
            r24 = r7
            r7 = r21
            r1 = r42
            r21 = r2
            r2 = r10
            r10 = r3
            r3 = r21
            r25 = r8
            r8 = r4
            r4 = r22
            r22 = r9
            r9 = r5
            r5 = r23
            r0.setMax(r1, r2, r3, r4, r5)
            goto L_0x0130
        L_0x0124:
            r21 = r2
            r10 = r3
            r24 = r7
            r25 = r8
            r22 = r9
            r7 = r1
            r8 = r4
            r9 = r5
        L_0x0130:
            android.graphics.drawable.Drawable r0 = r7.equals
            if (r0 == 0) goto L_0x0173
            boolean r0 = r12.create()
            if (r0 == 0) goto L_0x0173
            android.graphics.drawable.Drawable r0 = r7.equals
            int r1 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x0146
            float[] r1 = r15.setMax
            r1 = r1[r16]
            float r1 = r1 + r13
            goto L_0x014d
        L_0x0146:
            float[] r1 = r15.setMax
            int r3 = r10 + 3
            r1 = r1[r3]
            float r1 = r1 + r14
        L_0x014d:
            float r2 = r8.length
            float r2 = r21 + r2
            float r3 = r8.getMin
            float r1 = r1 + r3
            int r2 = (int) r2
            int r1 = (int) r1
            int r30 = r0.getIntrinsicWidth()
            int r31 = r0.getIntrinsicHeight()
            r26 = r42
            r27 = r0
            r28 = r2
            r29 = r1
            o.getTargetFragment.setMax(r26, r27, r28, r29, r30, r31)
            goto L_0x0173
        L_0x016a:
            r10 = r3
            r24 = r7
            r25 = r8
            r22 = r9
            r8 = r4
            r9 = r5
        L_0x0173:
            int r3 = r10 + 4
            r4 = r8
            r5 = r9
            r9 = r22
            r7 = r24
            r8 = r25
            goto L_0x0097
        L_0x017f:
            r24 = r7
            r25 = r8
            r22 = r9
            r8 = r4
            goto L_0x0365
        L_0x0188:
            r24 = r7
            r25 = r8
            r22 = r9
            r8 = r4
            r9 = r5
            o.EmojiCompat$LoadStrategy r0 = r6.getMax
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r12.getCause()
            o.getActivity r7 = r0.getTransformer(r1)
            r10 = 0
            r19 = 0
        L_0x019d:
            float r0 = (float) r10
            int r1 = r12.ICustomTabsCallback()
            float r1 = (float) r1
            o.setDrawerShadow r2 = r6.equals
            float r2 = r2.getMin()
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0365
            com.github.mikephil.charting.data.Entry r0 = r12.toIntRange(r10)
            r5 = r0
            com.github.mikephil.charting.data.BarEntry r5 = (com.github.mikephil.charting.data.BarEntry) r5
            float[] r4 = r5.setMin
            float[] r0 = r15.setMax
            r0 = r0[r19]
            float[] r1 = r15.setMax
            int r2 = r19 + 2
            r1 = r1[r2]
            float r0 = r0 + r1
            float r3 = r0 / r17
            int r21 = r12.getMin((int) r10)
            if (r4 != 0) goto L_0x026c
            o.setTargetFragment r0 = r6.invokeSuspend
            boolean r0 = r0.isInside(r3)
            if (r0 == 0) goto L_0x0365
            o.setTargetFragment r0 = r6.invokeSuspend
            float[] r1 = r15.setMax
            int r23 = r19 + 1
            r1 = r1[r23]
            boolean r0 = r0.IsOverlapping(r1)
            if (r0 == 0) goto L_0x0262
            o.setTargetFragment r0 = r6.invokeSuspend
            boolean r0 = r0.toFloatRange(r3)
            if (r0 == 0) goto L_0x0262
            boolean r0 = r12.Mean$Arithmetic()
            if (r0 == 0) goto L_0x021c
            float r0 = r5.getMin()
            java.lang.String r2 = r9.getMin(r0)
            float[] r0 = r15.setMax
            r0 = r0[r23]
            float r1 = r5.getMin()
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x0205
            r1 = r13
            goto L_0x0206
        L_0x0205:
            r1 = r14
        L_0x0206:
            float r26 = r0 + r1
            r0 = r41
            r1 = r42
            r27 = r3
            r28 = r13
            r13 = r4
            r4 = r26
            r26 = r14
            r14 = r5
            r5 = r21
            r0.setMax(r1, r2, r3, r4, r5)
            goto L_0x0224
        L_0x021c:
            r27 = r3
            r28 = r13
            r26 = r14
            r13 = r4
            r14 = r5
        L_0x0224:
            android.graphics.drawable.Drawable r0 = r14.equals
            if (r0 == 0) goto L_0x0357
            boolean r0 = r12.create()
            if (r0 == 0) goto L_0x0357
            android.graphics.drawable.Drawable r0 = r14.equals
            float[] r1 = r15.setMax
            r1 = r1[r23]
            float r2 = r14.getMin()
            int r2 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x023f
            r2 = r28
            goto L_0x0241
        L_0x023f:
            r2 = r26
        L_0x0241:
            float r1 = r1 + r2
            float r2 = r8.length
            r5 = r27
            float r3 = r5 + r2
            float r2 = r8.getMin
            float r1 = r1 + r2
            int r2 = (int) r3
            int r1 = (int) r1
            int r33 = r0.getIntrinsicWidth()
            int r34 = r0.getIntrinsicHeight()
            r29 = r42
            r30 = r0
            r31 = r2
            r32 = r1
            o.getTargetFragment.setMax(r29, r30, r31, r32, r33, r34)
            goto L_0x0357
        L_0x0262:
            r28 = r13
            r26 = r14
        L_0x0266:
            r14 = r26
            r13 = r28
            goto L_0x019d
        L_0x026c:
            r28 = r13
            r26 = r14
            r13 = r4
            r14 = r5
            r5 = r3
            int r0 = r13.length
            int r4 = r0 * 2
            float[] r3 = new float[r4]
            float r0 = r14.length
            float r0 = -r0
            r23 = r0
            r0 = 0
            r1 = 0
            r27 = 0
        L_0x0281:
            if (r0 >= r4) goto L_0x02b2
            r2 = r13[r1]
            int r29 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r29 != 0) goto L_0x0298
            int r29 = (r27 > r18 ? 1 : (r27 == r18 ? 0 : -1))
            if (r29 == 0) goto L_0x0291
            int r29 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r29 != 0) goto L_0x0298
        L_0x0291:
            r40 = r23
            r23 = r2
            r2 = r40
            goto L_0x02a5
        L_0x0298:
            int r29 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r29 < 0) goto L_0x02a3
            float r27 = r27 + r2
            r2 = r23
            r23 = r27
            goto L_0x02a5
        L_0x02a3:
            float r2 = r23 - r2
        L_0x02a5:
            int r29 = r0 + 1
            float r23 = r23 * r16
            r3[r29] = r23
            int r0 = r0 + 2
            int r1 = r1 + 1
            r23 = r2
            goto L_0x0281
        L_0x02b2:
            r7.length(r3)
            r2 = 0
        L_0x02b6:
            if (r2 >= r4) goto L_0x0357
            int r0 = r2 / 2
            r0 = r13[r0]
            int r1 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x02c8
            int r1 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x02c8
            int r1 = (r27 > r18 ? 1 : (r27 == r18 ? 0 : -1))
            if (r1 > 0) goto L_0x02cc
        L_0x02c8:
            int r1 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x02ce
        L_0x02cc:
            r1 = 1
            goto L_0x02cf
        L_0x02ce:
            r1 = 0
        L_0x02cf:
            int r29 = r2 + 1
            r29 = r3[r29]
            if (r1 == 0) goto L_0x02d8
            r1 = r26
            goto L_0x02da
        L_0x02d8:
            r1 = r28
        L_0x02da:
            float r1 = r29 + r1
            r29 = r2
            o.setTargetFragment r2 = r6.invokeSuspend
            boolean r2 = r2.isInside(r5)
            if (r2 == 0) goto L_0x0357
            o.setTargetFragment r2 = r6.invokeSuspend
            boolean r2 = r2.IsOverlapping(r1)
            if (r2 == 0) goto L_0x0347
            o.setTargetFragment r2 = r6.invokeSuspend
            boolean r2 = r2.toFloatRange(r5)
            if (r2 == 0) goto L_0x0347
            boolean r2 = r12.Mean$Arithmetic()
            if (r2 == 0) goto L_0x0315
            java.lang.String r2 = r9.getMin(r0)
            r0 = r41
            r30 = r1
            r1 = r42
            r31 = r3
            r3 = r5
            r32 = r4
            r4 = r30
            r33 = r5
            r5 = r21
            r0.setMax(r1, r2, r3, r4, r5)
            goto L_0x031d
        L_0x0315:
            r30 = r1
            r31 = r3
            r32 = r4
            r33 = r5
        L_0x031d:
            android.graphics.drawable.Drawable r0 = r14.equals
            if (r0 == 0) goto L_0x034d
            boolean r0 = r12.create()
            if (r0 == 0) goto L_0x034d
            android.graphics.drawable.Drawable r0 = r14.equals
            float r1 = r8.length
            float r3 = r33 + r1
            int r1 = (int) r3
            float r2 = r8.getMin
            float r2 = r30 + r2
            int r2 = (int) r2
            int r38 = r0.getIntrinsicWidth()
            int r39 = r0.getIntrinsicHeight()
            r34 = r42
            r35 = r0
            r36 = r1
            r37 = r2
            o.getTargetFragment.setMax(r34, r35, r36, r37, r38, r39)
            goto L_0x034d
        L_0x0347:
            r31 = r3
            r32 = r4
            r33 = r5
        L_0x034d:
            int r2 = r29 + 2
            r3 = r31
            r4 = r32
            r5 = r33
            goto L_0x02b6
        L_0x0357:
            if (r13 != 0) goto L_0x035c
            int r19 = r19 + 4
            goto L_0x0361
        L_0x035c:
            int r0 = r13.length
            int r0 = r0 * 4
            int r19 = r19 + r0
        L_0x0361:
            int r10 = r10 + 1
            goto L_0x0266
        L_0x0365:
            o.setArguments.setMin(r8)
            goto L_0x036f
        L_0x0369:
            r24 = r7
            r25 = r8
            r22 = r9
        L_0x036f:
            int r11 = r11 + 1
            r9 = r22
            r7 = r24
            r8 = r25
            goto L_0x0021
        L_0x0379:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requireDialog.setMax(android.graphics.Canvas):void");
    }

    public void setMax(Canvas canvas, String str, float f, float f2, int i) {
        this.toString.setColor(i);
        canvas.drawText(str, f, f2, this.toString);
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        float f;
        float f2;
        getDrawerTitle barData = this.getMax.getBarData();
        for (addFocusables addfocusables : addfocusablesArr) {
            EmojiAppCompatEditText emojiAppCompatEditText = (EmojiAppCompatEditText) barData.setMin(addfocusables.equals);
            if (emojiAppCompatEditText != null && emojiAppCompatEditText.toIntRange()) {
                BarEntry barEntry = (BarEntry) emojiAppCompatEditText.length(addfocusables.setMax, addfocusables.getMin);
                if (setMax(barEntry, emojiAppCompatEditText)) {
                    getActivity transformer = this.getMax.getTransformer(emojiAppCompatEditText.getCause());
                    this.IsOverlapping.setColor(emojiAppCompatEditText.getMin());
                    this.IsOverlapping.setAlpha(emojiAppCompatEditText.asInterface());
                    if (!(addfocusables.toIntRange >= 0 && barEntry.getMax())) {
                        f2 = barEntry.getMin();
                        f = 0.0f;
                    } else if (this.getMax.isHighlightFullBarEnabled()) {
                        float f3 = barEntry.getMin;
                        f = -barEntry.length;
                        f2 = f3;
                    } else {
                        createFloatPropertyCompat createfloatpropertycompat = barEntry.setMax[addfocusables.toIntRange];
                        f2 = createfloatpropertycompat.getMin;
                        f = createfloatpropertycompat.length;
                    }
                    getMin(barEntry.length(), f2, f, barData.getMax / 2.0f, transformer);
                    getMin(addfocusables, this.setMin);
                    canvas.drawRect(this.setMin, this.IsOverlapping);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void getMin(addFocusables addfocusables, RectF rectF) {
        float centerX = rectF.centerX();
        float f = rectF.top;
        addfocusables.isInside = centerX;
        addfocusables.IsOverlapping = f;
    }
}
