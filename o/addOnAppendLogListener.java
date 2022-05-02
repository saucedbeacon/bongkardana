package o;

import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import o.LogContextImpl;

final class addOnAppendLogListener<T> implements LogContextImpl.AnonymousClass2<T, getPart> {
    private static int FastBitmap$CoordinateSystem = 1;
    private static int IsOverlapping;
    private static short[] equals;
    private static int getMax;
    private static int isInside;
    private static final Charset setMax = Charset.forName(length(-19 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) - 430046485, View.combineMeasuredStates(0, 0) - 141299441, (short) (-60 - Gravity.getAbsoluteGravity(0, 0))).intern());
    private static final translateRegularFrame setMin = translateRegularFrame.length("application/json; charset=UTF-8");
    private static byte[] toFloatRange;
    private static int toIntRange;
    private final Gson getMin;
    private final TypeAdapter<T> length;

    static void setMin() {
        IsOverlapping = 141299526;
        getMax = 430046484;
        toFloatRange = new byte[]{-13, ImageFileType.HEAD_GIF_0, 35, 46, 59};
        toIntRange = 18;
    }

    static {
        setMin();
        boolean z = false;
        int i = isInside + 55;
        FastBitmap$CoordinateSystem = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (z) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    addOnAppendLogListener(Gson gson, TypeAdapter<T> typeAdapter) {
        try {
            this.getMin = gson;
            this.length = typeAdapter;
        } catch (Exception e) {
            throw e;
        }
    }

    public final /* synthetic */ Object getMax(Object obj) throws IOException {
        submitLazy submitlazy = new submitLazy();
        JsonWriter newJsonWriter = this.getMin.newJsonWriter(new OutputStreamWriter(new OutputStream() {
            public final void close() {
            }

            public final void flush() {
            }

            public final void write(int i) {
                submitLazy.this.equals((int) (byte) i);
            }

            public final void write(byte[] bArr, int i, int i2) {
                submitLazy.this.length(bArr, i, i2);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(submitLazy.this);
                sb.append(".outputStream()");
                return sb.toString();
            }
        }, setMax));
        this.length.write(newJsonWriter, obj);
        newJsonWriter.close();
        getPart min = getPart.getMin(setMin, new printConnMonitorLog(submitlazy.valueOf()));
        try {
            int i = FastBitmap$CoordinateSystem + 87;
            isInside = i % 128;
            if (!(i % 2 != 0)) {
                return min;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return min;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[SYNTHETIC, Splitter:B:11:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(int r7, byte r8, int r9, int r10, short r11) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = toIntRange
            int r7 = r7 + r1
            r1 = 0
            r2 = -1
            r3 = 1
            if (r7 != r2) goto L_0x001c
            int r2 = isInside
            int r2 = r2 + 65
            int r4 = r2 % 128
            FastBitmap$CoordinateSystem = r4
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            r4 = 75
            if (r2 == 0) goto L_0x0024
            r5 = 75
            goto L_0x0026
        L_0x0024:
            r5 = 16
        L_0x0026:
            if (r5 == r4) goto L_0x0029
            goto L_0x0044
        L_0x0029:
            byte[] r7 = toFloatRange     // Catch:{ Exception -> 0x00b8 }
            if (r7 == 0) goto L_0x0039
            byte[] r7 = toFloatRange
            int r5 = getMax
            int r5 = r5 + r9
            byte r7 = r7[r5]
            int r5 = toIntRange
            int r7 = r7 + r5
            byte r7 = (byte) r7
            goto L_0x0044
        L_0x0039:
            short[] r7 = equals
            int r5 = getMax
            int r5 = r5 + r9
            short r7 = r7[r5]
            int r5 = toIntRange
            int r7 = r7 + r5
            short r7 = (short) r7
        L_0x0044:
            r5 = 13
            if (r7 <= 0) goto L_0x004b
            r6 = 25
            goto L_0x004d
        L_0x004b:
            r6 = 13
        L_0x004d:
            if (r6 == r5) goto L_0x00b1
            int r9 = r9 + r7
            int r9 = r9 + -2
            int r5 = getMax
            int r9 = r9 + r5
            if (r2 == 0) goto L_0x0063
            int r1 = isInside
            int r1 = r1 + 55
            int r2 = r1 % 128
            FastBitmap$CoordinateSystem = r2
            int r1 = r1 % 2
            r1 = 1
            goto L_0x006d
        L_0x0063:
            int r2 = isInside
            int r2 = r2 + 113
            int r5 = r2 % 128
            FastBitmap$CoordinateSystem = r5
            int r2 = r2 % 2
        L_0x006d:
            int r9 = r9 + r1
            int r1 = IsOverlapping
            int r10 = r10 + r1
            char r10 = (char) r10
            r0.append(r10)
        L_0x0075:
            r1 = 89
            if (r3 >= r7) goto L_0x007c
            r2 = 60
            goto L_0x007e
        L_0x007c:
            r2 = 89
        L_0x007e:
            if (r2 == r1) goto L_0x00b1
            int r1 = FastBitmap$CoordinateSystem     // Catch:{ Exception -> 0x00b6 }
            int r1 = r1 + 17
            int r2 = r1 % 128
            isInside = r2     // Catch:{ Exception -> 0x00b8 }
            int r1 = r1 % 2
            byte[] r1 = toFloatRange
            if (r1 == 0) goto L_0x0091
            r1 = 47
            goto L_0x0093
        L_0x0091:
            r1 = 75
        L_0x0093:
            if (r1 == r4) goto L_0x009e
            byte[] r1 = toFloatRange     // Catch:{ Exception -> 0x00b6 }
            int r2 = r9 + -1
            byte r9 = r1[r9]
            int r9 = r9 + r11
            byte r9 = (byte) r9
            goto L_0x00a6
        L_0x009e:
            short[] r1 = equals
            int r2 = r9 + -1
            short r9 = r1[r9]
            int r9 = r9 + r11
            short r9 = (short) r9
        L_0x00a6:
            r9 = r9 ^ r8
            int r10 = r10 + r9
            char r9 = (char) r10
            r10 = r9
            r9 = r2
            r0.append(r10)
            int r3 = r3 + 1
            goto L_0x0075
        L_0x00b1:
            java.lang.String r7 = r0.toString()     // Catch:{ Exception -> 0x00b6 }
            return r7
        L_0x00b6:
            r7 = move-exception
            throw r7
        L_0x00b8:
            r7 = move-exception
            goto L_0x00bb
        L_0x00ba:
            throw r7
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addOnAppendLogListener.length(int, byte, int, int, short):java.lang.String");
    }
}
