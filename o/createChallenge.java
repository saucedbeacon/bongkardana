package o;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import o.Draft_75;

public final class createChallenge extends getPart {
    public static final translateRegularFrame getMax = translateRegularFrame.getMin("multipart/alternative");
    public static final translateRegularFrame getMin = translateRegularFrame.getMin("multipart/digest");
    private static final byte[] isInside = {Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX};
    public static final translateRegularFrame length = translateRegularFrame.getMin("multipart/form-data");
    public static final translateRegularFrame setMax = translateRegularFrame.getMin("multipart/parallel");
    public static final translateRegularFrame setMin = translateRegularFrame.getMin("multipart/mixed");
    private static final byte[] toFloatRange = {58, 32};
    private static final byte[] toIntRange = {13, 10};
    private long FastBitmap$CoordinateSystem = -1;
    private final translateRegularFrame IsOverlapping;
    private final printConnMonitorLog equals;
    private final List<getMax> toDoubleRange;
    private final translateRegularFrame values;

    public createChallenge(printConnMonitorLog printconnmonitorlog, translateRegularFrame translateregularframe, List<getMax> list) {
        this.equals = printconnmonitorlog;
        this.IsOverlapping = translateregularframe;
        StringBuilder sb = new StringBuilder();
        sb.append(translateregularframe);
        sb.append("; boundary=");
        sb.append(printconnmonitorlog.utf8());
        this.values = translateRegularFrame.getMin(sb.toString());
        this.toDoubleRange = initCloseCode.setMin(list);
    }

    public final translateRegularFrame setMax() {
        return this.values;
    }

    public final long setMin() throws IOException {
        long j = this.FastBitmap$CoordinateSystem;
        if (j != -1) {
            return j;
        }
        long min = getMin((executeSerial) null, true);
        this.FastBitmap$CoordinateSystem = min;
        return min;
    }

    public final void getMin(executeSerial executeserial) throws IOException {
        getMin(executeserial, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: o.executeSerial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: o.submitLazy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: o.submitLazy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: o.executeSerial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: o.submitLazy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long getMin(@javax.annotation.Nullable o.executeSerial r14, boolean r15) throws java.io.IOException {
        /*
            r13 = this;
            if (r15 == 0) goto L_0x0009
            o.submitLazy r14 = new o.submitLazy
            r14.<init>()
            r0 = r14
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<o.createChallenge$getMax> r1 = r13.toDoubleRange
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00b4
            java.util.List<o.createChallenge$getMax> r6 = r13.toDoubleRange
            java.lang.Object r6 = r6.get(r5)
            o.createChallenge$getMax r6 = (o.createChallenge.getMax) r6
            o.Draft_75 r7 = r6.setMax
            o.getPart r6 = r6.setMin
            byte[] r8 = isInside
            r14.setMax(r8)
            o.printConnMonitorLog r8 = r13.equals
            r14.length(r8)
            byte[] r8 = toIntRange
            r14.setMax(r8)
            if (r7 == 0) goto L_0x005d
            java.lang.String[] r8 = r7.length
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x005d
            java.lang.String[] r10 = r7.length
            int r11 = r9 * 2
            r10 = r10[r11]
            o.executeSerial r10 = r14.setMin(r10)
            byte[] r12 = toFloatRange
            o.executeSerial r10 = r10.setMax(r12)
            java.lang.String[] r12 = r7.length
            int r11 = r11 + 1
            r11 = r12[r11]
            o.executeSerial r10 = r10.setMin(r11)
            byte[] r11 = toIntRange
            r10.setMax(r11)
            int r9 = r9 + 1
            goto L_0x0039
        L_0x005d:
            o.translateRegularFrame r7 = r6.setMax()
            if (r7 == 0) goto L_0x0076
            java.lang.String r8 = "Content-Type: "
            o.executeSerial r8 = r14.setMin(r8)
            java.lang.String r7 = r7.toString()
            o.executeSerial r7 = r8.setMin(r7)
            byte[] r8 = toIntRange
            r7.setMax(r8)
        L_0x0076:
            long r7 = r6.setMin()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0090
            java.lang.String r9 = "Content-Length: "
            o.executeSerial r9 = r14.setMin(r9)
            o.executeSerial r9 = r9.toDoubleRange(r7)
            byte[] r10 = toIntRange
            r9.setMax(r10)
            goto L_0x009f
        L_0x0090:
            if (r15 == 0) goto L_0x009f
            long r14 = r0.setMax     // Catch:{ EOFException -> 0x0098 }
            r0.isInside(r14)     // Catch:{ EOFException -> 0x0098 }
            return r9
        L_0x0098:
            r14 = move-exception
            java.lang.AssertionError r15 = new java.lang.AssertionError
            r15.<init>(r14)
            throw r15
        L_0x009f:
            byte[] r9 = toIntRange
            r14.setMax(r9)
            if (r15 == 0) goto L_0x00a8
            long r3 = r3 + r7
            goto L_0x00ab
        L_0x00a8:
            r6.getMin(r14)
        L_0x00ab:
            byte[] r6 = toIntRange
            r14.setMax(r6)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00b4:
            byte[] r1 = isInside
            r14.setMax(r1)
            o.printConnMonitorLog r1 = r13.equals
            r14.length(r1)
            byte[] r1 = isInside
            r14.setMax(r1)
            byte[] r1 = toIntRange
            r14.setMax(r1)
            if (r15 == 0) goto L_0x00d0
            long r14 = r0.setMax
            long r3 = r3 + r14
            r0.Mean$Arithmetic()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createChallenge.getMin(o.executeSerial, boolean):long");
    }

    static StringBuilder length(StringBuilder sb, String str) {
        sb.append(Typography.quote);
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append(Typography.quote);
        return sb;
    }

    public static final class getMax {
        @Nullable
        final Draft_75 setMax;
        final getPart setMin;

        public static getMax setMax(@Nullable Draft_75 draft_75, getPart getpart) {
            if (getpart == null) {
                throw new NullPointerException("body == null");
            } else if (draft_75 != null && draft_75.length("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (draft_75 == null || draft_75.length("Content-Length") == null) {
                return new getMax(draft_75, getpart);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static getMax setMax(String str, @Nullable String str2, getPart getpart) {
            StringBuilder sb = new StringBuilder("form-data; name=");
            createChallenge.length(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                createChallenge.length(sb, str2);
            }
            return setMax(new Draft_75(new Draft_75.length().length(HttpHeaders.CONTENT_DISPOSITION, sb.toString())), getpart);
        }

        private getMax(@Nullable Draft_75 draft_75, getPart getpart) {
            this.setMax = draft_75;
            this.setMin = getpart;
        }
    }

    public static final class setMax {
        public final List<getMax> getMin;
        public translateRegularFrame length;
        public final printConnMonitorLog setMax;

        public setMax() {
            this(UUID.randomUUID().toString());
        }

        private setMax(String str) {
            this.length = createChallenge.setMin;
            this.getMin = new ArrayList();
            this.setMax = printConnMonitorLog.encodeUtf8(str);
        }
    }
}
