package o;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public class setMaxElementsWrap implements GifDecoder {
    private static final String length = setMaxElementsWrap.class.getSimpleName();
    private boolean FastBitmap$CoordinateSystem;
    private int Grayscale$Algorithm;
    @NonNull
    private Bitmap.Config ICustomTabsCallback;
    private byte[] IsOverlapping;
    private int Mean$Arithmetic;
    private byte[] equals;
    @ColorInt
    private int[] getMax;
    @ColorInt
    private final int[] getMin;
    @ColorInt
    private int[] hashCode;
    private int invoke;
    private int invokeSuspend;
    private byte[] isInside;
    private final GifDecoder.setMax setMax;
    private ByteBuffer setMin;
    private setVerticalGap toDoubleRange;
    private byte[] toFloatRange;
    private short[] toIntRange;
    private int toString;
    @Nullable
    private Boolean valueOf;
    private Bitmap values;

    public setMaxElementsWrap(@NonNull GifDecoder.setMax setmax, setVerticalGap setverticalgap, ByteBuffer byteBuffer, int i) {
        this(setmax);
        setMax(setverticalgap, byteBuffer, i);
    }

    private setMaxElementsWrap(@NonNull GifDecoder.setMax setmax) {
        this.getMin = new int[256];
        this.ICustomTabsCallback = Bitmap.Config.ARGB_8888;
        this.setMax = setmax;
        this.toDoubleRange = new setVerticalGap();
    }

    @NonNull
    public final ByteBuffer length() {
        return this.setMin;
    }

    public final void getMax() {
        this.toString = (this.toString + 1) % this.toDoubleRange.length;
    }

    public final int setMin() {
        int i;
        if (this.toDoubleRange.length <= 0 || (i = this.toString) < 0) {
            return 0;
        }
        if (i < 0 || i >= this.toDoubleRange.length) {
            return -1;
        }
        return this.toDoubleRange.getMax.get(i).IsOverlapping;
    }

    public final int setMax() {
        return this.toDoubleRange.length;
    }

    public final int getMin() {
        return this.toString;
    }

    public final void IsOverlapping() {
        this.toString = -1;
    }

    public final int toFloatRange() {
        return this.setMin.limit() + this.toFloatRange.length + (this.hashCode.length * 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04fb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bd, code lost:
        if (r1.toDoubleRange.IsOverlapping == r5.toFloatRange) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e0  */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap equals() {
        /*
            r35 = this;
            r1 = r35
            monitor-enter(r35)
            o.setVerticalGap r0 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            int r0 = r0.length     // Catch:{ all -> 0x04fc }
            r2 = 1
            if (r0 <= 0) goto L_0x000e
            int r0 = r1.toString     // Catch:{ all -> 0x04fc }
            if (r0 >= 0) goto L_0x0010
        L_0x000e:
            r1.invoke = r2     // Catch:{ all -> 0x04fc }
        L_0x0010:
            int r0 = r1.invoke     // Catch:{ all -> 0x04fc }
            r3 = 0
            if (r0 == r2) goto L_0x04fa
            int r0 = r1.invoke     // Catch:{ all -> 0x04fc }
            r4 = 2
            if (r0 != r4) goto L_0x001c
            goto L_0x04fa
        L_0x001c:
            r0 = 0
            r1.invoke = r0     // Catch:{ all -> 0x04fc }
            byte[] r5 = r1.isInside     // Catch:{ all -> 0x04fc }
            r6 = 255(0xff, float:3.57E-43)
            if (r5 != 0) goto L_0x002d
            com.bumptech.glide.gifdecoder.GifDecoder$setMax r5 = r1.setMax     // Catch:{ all -> 0x04fc }
            byte[] r5 = r5.getMax((int) r6)     // Catch:{ all -> 0x04fc }
            r1.isInside = r5     // Catch:{ all -> 0x04fc }
        L_0x002d:
            o.setVerticalGap r5 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            java.util.List<o.setRotation> r5 = r5.getMax     // Catch:{ all -> 0x04fc }
            int r7 = r1.toString     // Catch:{ all -> 0x04fc }
            java.lang.Object r5 = r5.get(r7)     // Catch:{ all -> 0x04fc }
            o.setRotation r5 = (o.setRotation) r5     // Catch:{ all -> 0x04fc }
            int r7 = r1.toString     // Catch:{ all -> 0x04fc }
            int r7 = r7 - r2
            if (r7 < 0) goto L_0x0049
            o.setVerticalGap r8 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            java.util.List<o.setRotation> r8 = r8.getMax     // Catch:{ all -> 0x04fc }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x04fc }
            o.setRotation r7 = (o.setRotation) r7     // Catch:{ all -> 0x04fc }
            goto L_0x004a
        L_0x0049:
            r7 = r3
        L_0x004a:
            int[] r8 = r5.toDoubleRange     // Catch:{ all -> 0x04fc }
            if (r8 == 0) goto L_0x0051
            int[] r8 = r5.toDoubleRange     // Catch:{ all -> 0x04fc }
            goto L_0x0055
        L_0x0051:
            o.setVerticalGap r8 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            int[] r8 = r8.setMin     // Catch:{ all -> 0x04fc }
        L_0x0055:
            r1.getMax = r8     // Catch:{ all -> 0x04fc }
            if (r8 != 0) goto L_0x005d
            r1.invoke = r2     // Catch:{ all -> 0x04fc }
            monitor-exit(r35)
            return r3
        L_0x005d:
            boolean r8 = r5.equals     // Catch:{ all -> 0x04fc }
            if (r8 == 0) goto L_0x007f
            int[] r8 = r1.getMax     // Catch:{ all -> 0x04fc }
            int[] r9 = r1.getMin     // Catch:{ all -> 0x04fc }
            int[] r10 = r1.getMax     // Catch:{ all -> 0x04fc }
            int r10 = r10.length     // Catch:{ all -> 0x04fc }
            java.lang.System.arraycopy(r8, r0, r9, r0, r10)     // Catch:{ all -> 0x04fc }
            int[] r8 = r1.getMin     // Catch:{ all -> 0x04fc }
            r1.getMax = r8     // Catch:{ all -> 0x04fc }
            int r9 = r5.toFloatRange     // Catch:{ all -> 0x04fc }
            r8[r9] = r0     // Catch:{ all -> 0x04fc }
            int r8 = r5.toIntRange     // Catch:{ all -> 0x04fc }
            if (r8 != r4) goto L_0x007f
            int r8 = r1.toString     // Catch:{ all -> 0x04fc }
            if (r8 != 0) goto L_0x007f
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04fc }
            r1.valueOf = r8     // Catch:{ all -> 0x04fc }
        L_0x007f:
            int[] r8 = r1.hashCode     // Catch:{ all -> 0x04fc }
            if (r7 != 0) goto L_0x0093
            android.graphics.Bitmap r9 = r1.values     // Catch:{ all -> 0x04fc }
            if (r9 == 0) goto L_0x008e
            com.bumptech.glide.gifdecoder.GifDecoder$setMax r9 = r1.setMax     // Catch:{ all -> 0x04fc }
            android.graphics.Bitmap r10 = r1.values     // Catch:{ all -> 0x04fc }
            r9.getMax((android.graphics.Bitmap) r10)     // Catch:{ all -> 0x04fc }
        L_0x008e:
            r1.values = r3     // Catch:{ all -> 0x04fc }
            java.util.Arrays.fill(r8, r0)     // Catch:{ all -> 0x04fc }
        L_0x0093:
            r3 = 3
            if (r7 == 0) goto L_0x00a1
            int r9 = r7.toIntRange     // Catch:{ all -> 0x04fc }
            if (r9 != r3) goto L_0x00a1
            android.graphics.Bitmap r9 = r1.values     // Catch:{ all -> 0x04fc }
            if (r9 != 0) goto L_0x00a1
            java.util.Arrays.fill(r8, r0)     // Catch:{ all -> 0x04fc }
        L_0x00a1:
            if (r7 == 0) goto L_0x0107
            int r9 = r7.toIntRange     // Catch:{ all -> 0x04fc }
            if (r9 <= 0) goto L_0x0107
            int r9 = r7.toIntRange     // Catch:{ all -> 0x04fc }
            if (r9 != r4) goto L_0x00ee
            boolean r9 = r5.equals     // Catch:{ all -> 0x04fc }
            if (r9 != 0) goto L_0x00bf
            o.setVerticalGap r9 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            int r9 = r9.toString     // Catch:{ all -> 0x04fc }
            int[] r10 = r5.toDoubleRange     // Catch:{ all -> 0x04fc }
            if (r10 == 0) goto L_0x00c0
            o.setVerticalGap r10 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            int r10 = r10.IsOverlapping     // Catch:{ all -> 0x04fc }
            int r11 = r5.toFloatRange     // Catch:{ all -> 0x04fc }
            if (r10 != r11) goto L_0x00c0
        L_0x00bf:
            r9 = 0
        L_0x00c0:
            int r10 = r7.setMax     // Catch:{ all -> 0x04fc }
            int r11 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r10 = r10 / r11
            int r11 = r7.setMin     // Catch:{ all -> 0x04fc }
            int r12 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r11 = r11 / r12
            int r12 = r7.length     // Catch:{ all -> 0x04fc }
            int r13 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r12 = r12 / r13
            int r7 = r7.getMax     // Catch:{ all -> 0x04fc }
            int r13 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r7 = r7 / r13
            int r13 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            int r11 = r11 * r13
            int r11 = r11 + r7
            int r7 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            int r10 = r10 * r7
            int r10 = r10 + r11
        L_0x00de:
            if (r11 >= r10) goto L_0x0107
            int r7 = r11 + r12
            r13 = r11
        L_0x00e3:
            if (r13 >= r7) goto L_0x00ea
            r8[r13] = r9     // Catch:{ all -> 0x04fc }
            int r13 = r13 + 1
            goto L_0x00e3
        L_0x00ea:
            int r7 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            int r11 = r11 + r7
            goto L_0x00de
        L_0x00ee:
            int r7 = r7.toIntRange     // Catch:{ all -> 0x04fc }
            if (r7 != r3) goto L_0x0107
            android.graphics.Bitmap r7 = r1.values     // Catch:{ all -> 0x04fc }
            if (r7 == 0) goto L_0x0107
            android.graphics.Bitmap r9 = r1.values     // Catch:{ all -> 0x04fc }
            r11 = 0
            int r12 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            r13 = 0
            r14 = 0
            int r15 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            int r7 = r1.invokeSuspend     // Catch:{ all -> 0x04fc }
            r10 = r8
            r16 = r7
            r9.getPixels(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x04fc }
        L_0x0107:
            if (r5 == 0) goto L_0x0110
            java.nio.ByteBuffer r7 = r1.setMin     // Catch:{ all -> 0x04fc }
            int r9 = r5.isInside     // Catch:{ all -> 0x04fc }
            r7.position(r9)     // Catch:{ all -> 0x04fc }
        L_0x0110:
            if (r5 != 0) goto L_0x011d
            o.setVerticalGap r7 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            int r7 = r7.isInside     // Catch:{ all -> 0x04fc }
            o.setVerticalGap r9 = r1.toDoubleRange     // Catch:{ all -> 0x04fc }
            int r9 = r9.toIntRange     // Catch:{ all -> 0x04fc }
        L_0x011a:
            int r7 = r7 * r9
            goto L_0x0122
        L_0x011d:
            int r7 = r5.length     // Catch:{ all -> 0x04fc }
            int r9 = r5.setMax     // Catch:{ all -> 0x04fc }
            goto L_0x011a
        L_0x0122:
            byte[] r9 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            if (r9 == 0) goto L_0x012b
            byte[] r9 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            int r9 = r9.length     // Catch:{ all -> 0x04fc }
            if (r9 >= r7) goto L_0x0133
        L_0x012b:
            com.bumptech.glide.gifdecoder.GifDecoder$setMax r9 = r1.setMax     // Catch:{ all -> 0x04fc }
            byte[] r9 = r9.getMax((int) r7)     // Catch:{ all -> 0x04fc }
            r1.toFloatRange = r9     // Catch:{ all -> 0x04fc }
        L_0x0133:
            byte[] r9 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            short[] r10 = r1.toIntRange     // Catch:{ all -> 0x04fc }
            r11 = 4096(0x1000, float:5.74E-42)
            if (r10 != 0) goto L_0x013f
            short[] r10 = new short[r11]     // Catch:{ all -> 0x04fc }
            r1.toIntRange = r10     // Catch:{ all -> 0x04fc }
        L_0x013f:
            short[] r10 = r1.toIntRange     // Catch:{ all -> 0x04fc }
            byte[] r12 = r1.IsOverlapping     // Catch:{ all -> 0x04fc }
            if (r12 != 0) goto L_0x0149
            byte[] r12 = new byte[r11]     // Catch:{ all -> 0x04fc }
            r1.IsOverlapping = r12     // Catch:{ all -> 0x04fc }
        L_0x0149:
            byte[] r12 = r1.IsOverlapping     // Catch:{ all -> 0x04fc }
            byte[] r13 = r1.equals     // Catch:{ all -> 0x04fc }
            if (r13 != 0) goto L_0x0155
            r13 = 4097(0x1001, float:5.741E-42)
            byte[] r13 = new byte[r13]     // Catch:{ all -> 0x04fc }
            r1.equals = r13     // Catch:{ all -> 0x04fc }
        L_0x0155:
            byte[] r13 = r1.equals     // Catch:{ all -> 0x04fc }
            java.nio.ByteBuffer r14 = r1.setMin     // Catch:{ all -> 0x04fc }
            byte r14 = r14.get()     // Catch:{ all -> 0x04fc }
            r14 = r14 & r6
            int r15 = r2 << r14
            int r4 = r15 + 1
            int r17 = r15 + 2
            int r14 = r14 + r2
            int r18 = r2 << r14
            int r18 = r18 + -1
            r2 = 0
        L_0x016a:
            if (r2 >= r15) goto L_0x0176
            r10[r2] = r0     // Catch:{ all -> 0x04fc }
            byte r11 = (byte) r2     // Catch:{ all -> 0x04fc }
            r12[r2] = r11     // Catch:{ all -> 0x04fc }
            int r2 = r2 + 1
            r11 = 4096(0x1000, float:5.74E-42)
            goto L_0x016a
        L_0x0176:
            byte[] r2 = r1.isInside     // Catch:{ all -> 0x04fc }
            r28 = r14
            r27 = r17
            r29 = r18
            r11 = 0
            r21 = -1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r30 = 0
            r31 = 0
        L_0x018f:
            r32 = 8
            if (r11 >= r7) goto L_0x0281
            if (r22 != 0) goto L_0x01c5
            java.nio.ByteBuffer r3 = r1.setMin     // Catch:{ all -> 0x04fc }
            byte r3 = r3.get()     // Catch:{ all -> 0x04fc }
            r3 = r3 & r6
            if (r3 > 0) goto L_0x01a3
            r33 = r11
            r34 = r14
            goto L_0x01b9
        L_0x01a3:
            java.nio.ByteBuffer r6 = r1.setMin     // Catch:{ all -> 0x04fc }
            byte[] r0 = r1.isInside     // Catch:{ all -> 0x04fc }
            r33 = r11
            java.nio.ByteBuffer r11 = r1.setMin     // Catch:{ all -> 0x04fc }
            int r11 = r11.remaining()     // Catch:{ all -> 0x04fc }
            int r11 = java.lang.Math.min(r3, r11)     // Catch:{ all -> 0x04fc }
            r34 = r14
            r14 = 0
            r6.get(r0, r14, r11)     // Catch:{ all -> 0x04fc }
        L_0x01b9:
            if (r3 > 0) goto L_0x01c0
            r0 = 3
            r1.invoke = r0     // Catch:{ all -> 0x04fc }
            goto L_0x0281
        L_0x01c0:
            r22 = r3
            r23 = 0
            goto L_0x01c9
        L_0x01c5:
            r33 = r11
            r34 = r14
        L_0x01c9:
            byte r0 = r2[r23]     // Catch:{ all -> 0x04fc }
            r3 = 255(0xff, float:3.57E-43)
            r0 = r0 & r3
            int r0 = r0 << r24
            int r25 = r25 + r0
            int r24 = r24 + 8
            int r23 = r23 + 1
            r0 = -1
            int r22 = r22 + -1
            r3 = r21
            r6 = r24
            r14 = r27
            r0 = r28
            r11 = r33
            r21 = r2
            r2 = r31
        L_0x01e7:
            if (r6 < r0) goto L_0x026d
            r24 = r8
            r8 = r25 & r29
            int r25 = r25 >> r0
            int r6 = r6 - r0
            if (r8 != r15) goto L_0x01fc
            r14 = r17
            r29 = r18
            r8 = r24
            r0 = r34
            r3 = -1
            goto L_0x01e7
        L_0x01fc:
            if (r8 == r4) goto L_0x0257
            r27 = r4
            r4 = -1
            if (r3 != r4) goto L_0x0212
            byte r2 = r12[r8]     // Catch:{ all -> 0x04fc }
            r9[r26] = r2     // Catch:{ all -> 0x04fc }
            int r26 = r26 + 1
            int r11 = r11 + 1
            r2 = r8
            r3 = r2
        L_0x020d:
            r8 = r24
            r4 = r27
            goto L_0x01e7
        L_0x0212:
            if (r8 < r14) goto L_0x021b
            byte r2 = (byte) r2     // Catch:{ all -> 0x04fc }
            r13[r30] = r2     // Catch:{ all -> 0x04fc }
            int r30 = r30 + 1
            r2 = r3
            goto L_0x021c
        L_0x021b:
            r2 = r8
        L_0x021c:
            if (r2 < r15) goto L_0x0227
            byte r4 = r12[r2]     // Catch:{ all -> 0x04fc }
            r13[r30] = r4     // Catch:{ all -> 0x04fc }
            int r30 = r30 + 1
            short r2 = r10[r2]     // Catch:{ all -> 0x04fc }
            goto L_0x021c
        L_0x0227:
            byte r2 = r12[r2]     // Catch:{ all -> 0x04fc }
            r4 = 255(0xff, float:3.57E-43)
            r2 = r2 & r4
            byte r4 = (byte) r2     // Catch:{ all -> 0x04fc }
            r9[r26] = r4     // Catch:{ all -> 0x04fc }
        L_0x022f:
            int r26 = r26 + 1
            int r11 = r11 + 1
            if (r30 <= 0) goto L_0x023c
            int r30 = r30 + -1
            byte r28 = r13[r30]     // Catch:{ all -> 0x04fc }
            r9[r26] = r28     // Catch:{ all -> 0x04fc }
            goto L_0x022f
        L_0x023c:
            r19 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r14 >= r2) goto L_0x0253
            short r3 = (short) r3     // Catch:{ all -> 0x04fc }
            r10[r14] = r3     // Catch:{ all -> 0x04fc }
            r12[r14] = r4     // Catch:{ all -> 0x04fc }
            int r14 = r14 + 1
            r3 = r14 & r29
            if (r3 != 0) goto L_0x0253
            if (r14 >= r2) goto L_0x0253
            int r0 = r0 + 1
            int r29 = r29 + r14
        L_0x0253:
            r3 = r8
            r2 = r19
            goto L_0x020d
        L_0x0257:
            r31 = r2
            r28 = r0
            r27 = r14
            r2 = r21
            r8 = r24
            r14 = r34
            r0 = 0
            r21 = r3
            r24 = r6
            r3 = 3
            r6 = 255(0xff, float:3.57E-43)
            goto L_0x018f
        L_0x026d:
            r31 = r2
            r28 = r0
            r24 = r6
            r27 = r14
            r2 = r21
            r14 = r34
            r0 = 0
            r6 = 255(0xff, float:3.57E-43)
            r21 = r3
            r3 = 3
            goto L_0x018f
        L_0x0281:
            r24 = r8
            r0 = r26
            r14 = 0
            java.util.Arrays.fill(r9, r0, r7, r14)     // Catch:{ all -> 0x04fc }
            boolean r0 = r5.getMin     // Catch:{ all -> 0x04fc }
            if (r0 != 0) goto L_0x0304
            int r0 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            r2 = 1
            if (r0 == r2) goto L_0x0294
            goto L_0x0304
        L_0x0294:
            int[] r0 = r1.hashCode     // Catch:{ all -> 0x04fc }
            int r2 = r5.setMax     // Catch:{ all -> 0x04fc }
            int r3 = r5.setMin     // Catch:{ all -> 0x04fc }
            int r4 = r5.length     // Catch:{ all -> 0x04fc }
            int r6 = r5.getMax     // Catch:{ all -> 0x04fc }
            int r7 = r1.toString     // Catch:{ all -> 0x04fc }
            if (r7 != 0) goto L_0x02a4
            r7 = 1
            goto L_0x02a5
        L_0x02a4:
            r7 = 0
        L_0x02a5:
            int r8 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            byte[] r9 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            int[] r10 = r1.getMax     // Catch:{ all -> 0x04fc }
            r11 = -1
            r12 = 0
        L_0x02ad:
            if (r12 >= r2) goto L_0x02e4
            int r13 = r12 + r3
            int r13 = r13 * r8
            int r15 = r13 + r6
            int r14 = r15 + r4
            int r13 = r13 + r8
            if (r13 >= r14) goto L_0x02bb
            r14 = r13
        L_0x02bb:
            int r13 = r5.length     // Catch:{ all -> 0x04fc }
            int r13 = r13 * r12
        L_0x02bf:
            if (r15 >= r14) goto L_0x02dc
            r16 = r2
            byte r2 = r9[r13]     // Catch:{ all -> 0x04fc }
            r17 = r3
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 == r11) goto L_0x02d3
            r3 = r10[r3]     // Catch:{ all -> 0x04fc }
            if (r3 == 0) goto L_0x02d2
            r0[r15] = r3     // Catch:{ all -> 0x04fc }
            goto L_0x02d3
        L_0x02d2:
            r11 = r2
        L_0x02d3:
            int r13 = r13 + 1
            int r15 = r15 + 1
            r2 = r16
            r3 = r17
            goto L_0x02bf
        L_0x02dc:
            r16 = r2
            r17 = r3
            int r12 = r12 + 1
            r14 = 0
            goto L_0x02ad
        L_0x02e4:
            java.lang.Boolean r0 = r1.valueOf     // Catch:{ all -> 0x04fc }
            if (r0 == 0) goto L_0x02f0
            java.lang.Boolean r0 = r1.valueOf     // Catch:{ all -> 0x04fc }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04fc }
            if (r0 != 0) goto L_0x02f9
        L_0x02f0:
            java.lang.Boolean r0 = r1.valueOf     // Catch:{ all -> 0x04fc }
            if (r0 != 0) goto L_0x02fb
            if (r7 == 0) goto L_0x02fb
            r0 = -1
            if (r11 == r0) goto L_0x02fb
        L_0x02f9:
            r0 = 1
            goto L_0x02fc
        L_0x02fb:
            r0 = 0
        L_0x02fc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04fc }
            r1.valueOf = r0     // Catch:{ all -> 0x04fc }
            goto L_0x04ba
        L_0x0304:
            int[] r0 = r1.hashCode     // Catch:{ all -> 0x04fc }
            int r2 = r5.setMax     // Catch:{ all -> 0x04fc }
            int r3 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r2 = r2 / r3
            int r3 = r5.setMin     // Catch:{ all -> 0x04fc }
            int r4 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r3 = r3 / r4
            int r4 = r5.length     // Catch:{ all -> 0x04fc }
            int r6 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r4 = r4 / r6
            int r6 = r5.getMax     // Catch:{ all -> 0x04fc }
            int r7 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r6 = r6 / r7
            int r7 = r1.toString     // Catch:{ all -> 0x04fc }
            if (r7 != 0) goto L_0x0320
            r14 = 1
            goto L_0x0321
        L_0x0320:
            r14 = 0
        L_0x0321:
            int r7 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r8 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            int r9 = r1.invokeSuspend     // Catch:{ all -> 0x04fc }
            byte[] r10 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            int[] r11 = r1.getMax     // Catch:{ all -> 0x04fc }
            java.lang.Boolean r12 = r1.valueOf     // Catch:{ all -> 0x04fc }
            r13 = 0
            r15 = 0
            r17 = 1
            r18 = 8
        L_0x0333:
            if (r13 >= r2) goto L_0x04a6
            r19 = r12
            boolean r12 = r5.getMin     // Catch:{ all -> 0x04fc }
            if (r12 == 0) goto L_0x0364
            if (r15 < r2) goto L_0x035f
            int r12 = r17 + 1
            r21 = r2
            r2 = 2
            if (r12 == r2) goto L_0x035a
            r2 = 3
            if (r12 == r2) goto L_0x0353
            r2 = 4
            if (r12 == r2) goto L_0x034d
            r17 = r12
            goto L_0x0361
        L_0x034d:
            r17 = r12
            r15 = 1
            r18 = 2
            goto L_0x0361
        L_0x0353:
            r2 = 4
            r17 = r12
            r15 = 2
            r18 = 4
            goto L_0x0361
        L_0x035a:
            r2 = 4
            r17 = r12
            r15 = 4
            goto L_0x0361
        L_0x035f:
            r21 = r2
        L_0x0361:
            int r2 = r15 + r18
            goto L_0x0368
        L_0x0364:
            r21 = r2
            r2 = r15
            r15 = r13
        L_0x0368:
            int r15 = r15 + r3
            r12 = 1
            if (r7 != r12) goto L_0x036e
            r12 = 1
            goto L_0x036f
        L_0x036e:
            r12 = 0
        L_0x036f:
            if (r15 >= r9) goto L_0x0480
            int r15 = r15 * r8
            int r20 = r15 + r6
            r22 = r2
            int r2 = r20 + r4
            int r15 = r15 + r8
            if (r15 >= r2) goto L_0x037d
            r2 = r15
        L_0x037d:
            int r15 = r13 * r7
            r23 = r3
            int r3 = r5.length     // Catch:{ all -> 0x04fc }
            int r15 = r15 * r3
            if (r12 == 0) goto L_0x03ba
            r12 = r19
            r3 = r20
        L_0x038b:
            if (r3 >= r2) goto L_0x03ac
            r25 = r4
            byte r4 = r10[r15]     // Catch:{ all -> 0x04fc }
            r26 = r6
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            r4 = r11[r4]     // Catch:{ all -> 0x04fc }
            if (r4 == 0) goto L_0x039d
            r0[r3] = r4     // Catch:{ all -> 0x04fc }
            goto L_0x03a4
        L_0x039d:
            if (r14 == 0) goto L_0x03a4
            if (r12 != 0) goto L_0x03a4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04fc }
            r12 = r4
        L_0x03a4:
            int r15 = r15 + r7
            int r3 = r3 + 1
            r4 = r25
            r6 = r26
            goto L_0x038b
        L_0x03ac:
            r25 = r4
            r26 = r6
        L_0x03b0:
            r31 = r8
            r33 = r9
            r34 = r10
            r9 = 255(0xff, float:3.57E-43)
            goto L_0x0492
        L_0x03ba:
            r25 = r4
            r26 = r6
            int r3 = r2 - r20
            int r3 = r3 * r7
            int r3 = r3 + r15
            r12 = r19
            r4 = r20
        L_0x03c7:
            if (r4 >= r2) goto L_0x03b0
            int r6 = r5.length     // Catch:{ all -> 0x04fc }
            r30 = r2
            r31 = r8
            r2 = r15
            r19 = 0
            r20 = 0
            r27 = 0
            r28 = 0
            r29 = 0
        L_0x03da:
            int r8 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r8 = r8 + r15
            if (r2 >= r8) goto L_0x0418
            byte[] r8 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            int r8 = r8.length     // Catch:{ all -> 0x04fc }
            if (r2 >= r8) goto L_0x0418
            if (r2 >= r3) goto L_0x0418
            byte[] r8 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            byte r8 = r8[r2]     // Catch:{ all -> 0x04fc }
            r33 = r9
            r9 = 255(0xff, float:3.57E-43)
            r8 = r8 & r9
            int[] r9 = r1.getMax     // Catch:{ all -> 0x04fc }
            r8 = r9[r8]     // Catch:{ all -> 0x04fc }
            if (r8 == 0) goto L_0x040f
            int r9 = r8 >> 24
            r34 = r10
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            int r19 = r19 + r9
            int r9 = r8 >> 16
            r9 = r9 & r10
            int r20 = r20 + r9
            int r9 = r8 >> 8
            r9 = r9 & r10
            int r27 = r27 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r28 = r28 + r8
            int r29 = r29 + 1
            goto L_0x0411
        L_0x040f:
            r34 = r10
        L_0x0411:
            int r2 = r2 + 1
            r9 = r33
            r10 = r34
            goto L_0x03da
        L_0x0418:
            r33 = r9
            r34 = r10
            int r6 = r6 + r15
            r2 = r6
        L_0x041e:
            int r8 = r1.Mean$Arithmetic     // Catch:{ all -> 0x04fc }
            int r8 = r8 + r6
            if (r2 >= r8) goto L_0x044f
            byte[] r8 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            int r8 = r8.length     // Catch:{ all -> 0x04fc }
            if (r2 >= r8) goto L_0x044f
            if (r2 >= r3) goto L_0x044f
            byte[] r8 = r1.toFloatRange     // Catch:{ all -> 0x04fc }
            byte r8 = r8[r2]     // Catch:{ all -> 0x04fc }
            r9 = 255(0xff, float:3.57E-43)
            r8 = r8 & r9
            int[] r10 = r1.getMax     // Catch:{ all -> 0x04fc }
            r8 = r10[r8]     // Catch:{ all -> 0x04fc }
            if (r8 == 0) goto L_0x044c
            int r10 = r8 >> 24
            r10 = r10 & r9
            int r19 = r19 + r10
            int r10 = r8 >> 16
            r10 = r10 & r9
            int r20 = r20 + r10
            int r10 = r8 >> 8
            r10 = r10 & r9
            int r27 = r27 + r10
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r28 = r28 + r8
            int r29 = r29 + 1
        L_0x044c:
            int r2 = r2 + 1
            goto L_0x041e
        L_0x044f:
            r9 = 255(0xff, float:3.57E-43)
            if (r29 != 0) goto L_0x0455
            r2 = 0
            goto L_0x0467
        L_0x0455:
            int r19 = r19 / r29
            int r2 = r19 << 24
            int r20 = r20 / r29
            int r6 = r20 << 16
            r2 = r2 | r6
            int r27 = r27 / r29
            int r6 = r27 << 8
            r2 = r2 | r6
            int r28 = r28 / r29
            r2 = r2 | r28
        L_0x0467:
            if (r2 == 0) goto L_0x046c
            r0[r4] = r2     // Catch:{ all -> 0x04fc }
            goto L_0x0473
        L_0x046c:
            if (r14 == 0) goto L_0x0473
            if (r12 != 0) goto L_0x0473
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04fc }
            r12 = r2
        L_0x0473:
            int r15 = r15 + r7
            int r4 = r4 + 1
            r2 = r30
            r8 = r31
            r9 = r33
            r10 = r34
            goto L_0x03c7
        L_0x0480:
            r22 = r2
            r23 = r3
            r25 = r4
            r26 = r6
            r31 = r8
            r33 = r9
            r34 = r10
            r9 = 255(0xff, float:3.57E-43)
            r12 = r19
        L_0x0492:
            int r13 = r13 + 1
            r2 = r21
            r15 = r22
            r3 = r23
            r4 = r25
            r6 = r26
            r8 = r31
            r9 = r33
            r10 = r34
            goto L_0x0333
        L_0x04a6:
            r19 = r12
            java.lang.Boolean r0 = r1.valueOf     // Catch:{ all -> 0x04fc }
            if (r0 != 0) goto L_0x04ba
            if (r19 != 0) goto L_0x04b0
            r0 = 0
            goto L_0x04b4
        L_0x04b0:
            boolean r0 = r19.booleanValue()     // Catch:{ all -> 0x04fc }
        L_0x04b4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04fc }
            r1.valueOf = r0     // Catch:{ all -> 0x04fc }
        L_0x04ba:
            boolean r0 = r1.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x04fc }
            if (r0 == 0) goto L_0x04e3
            int r0 = r5.toIntRange     // Catch:{ all -> 0x04fc }
            if (r0 == 0) goto L_0x04c7
            int r0 = r5.toIntRange     // Catch:{ all -> 0x04fc }
            r2 = 1
            if (r0 != r2) goto L_0x04e3
        L_0x04c7:
            android.graphics.Bitmap r0 = r1.values     // Catch:{ all -> 0x04fc }
            if (r0 != 0) goto L_0x04d1
            android.graphics.Bitmap r0 = r35.isInside()     // Catch:{ all -> 0x04fc }
            r1.values = r0     // Catch:{ all -> 0x04fc }
        L_0x04d1:
            android.graphics.Bitmap r9 = r1.values     // Catch:{ all -> 0x04fc }
            r11 = 0
            int r12 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            r13 = 0
            r14 = 0
            int r15 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            int r0 = r1.invokeSuspend     // Catch:{ all -> 0x04fc }
            r10 = r24
            r16 = r0
            r9.setPixels(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x04fc }
        L_0x04e3:
            android.graphics.Bitmap r0 = r35.isInside()     // Catch:{ all -> 0x04fc }
            r11 = 0
            int r12 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            r13 = 0
            r14 = 0
            int r15 = r1.Grayscale$Algorithm     // Catch:{ all -> 0x04fc }
            int r2 = r1.invokeSuspend     // Catch:{ all -> 0x04fc }
            r9 = r0
            r10 = r24
            r16 = r2
            r9.setPixels(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x04fc }
            monitor-exit(r35)
            return r0
        L_0x04fa:
            monitor-exit(r35)
            return r3
        L_0x04fc:
            r0 = move-exception
            monitor-exit(r35)
            goto L_0x0500
        L_0x04ff:
            throw r0
        L_0x0500:
            goto L_0x04ff
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMaxElementsWrap.equals():android.graphics.Bitmap");
    }

    public final void toIntRange() {
        this.toDoubleRange = null;
        byte[] bArr = this.toFloatRange;
        if (bArr != null) {
            this.setMax.setMax(bArr);
        }
        int[] iArr = this.hashCode;
        if (iArr != null) {
            this.setMax.getMin(iArr);
        }
        Bitmap bitmap = this.values;
        if (bitmap != null) {
            this.setMax.getMax(bitmap);
        }
        this.values = null;
        this.setMin = null;
        this.valueOf = null;
        byte[] bArr2 = this.isInside;
        if (bArr2 != null) {
            this.setMax.setMax(bArr2);
        }
    }

    private synchronized void setMax(@NonNull setVerticalGap setverticalgap, @NonNull ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.invoke = 0;
            this.toDoubleRange = setverticalgap;
            this.toString = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.setMin = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.setMin.order(ByteOrder.LITTLE_ENDIAN);
            this.FastBitmap$CoordinateSystem = false;
            Iterator<setRotation> it = setverticalgap.getMax.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().toIntRange == 3) {
                        this.FastBitmap$CoordinateSystem = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.Mean$Arithmetic = highestOneBit;
            this.Grayscale$Algorithm = setverticalgap.isInside / highestOneBit;
            this.invokeSuspend = setverticalgap.toIntRange / highestOneBit;
            this.toFloatRange = this.setMax.getMax(setverticalgap.isInside * setverticalgap.toIntRange);
            this.hashCode = this.setMax.length(this.Grayscale$Algorithm * this.invokeSuspend);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: ".concat(String.valueOf(i)));
        }
    }

    public final void length(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.ICustomTabsCallback = config;
            return;
        }
        StringBuilder sb = new StringBuilder("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Bitmap.Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Bitmap.Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    private Bitmap isInside() {
        Boolean bool = this.valueOf;
        Bitmap min = this.setMax.getMin(this.Grayscale$Algorithm, this.invokeSuspend, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.ICustomTabsCallback);
        min.setHasAlpha(true);
        return min;
    }
}
