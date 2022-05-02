package o;

import com.google.common.net.HttpHeaders;
import java.util.Date;
import javax.annotation.Nullable;

public final class setCodeAndMessage {
    @Nullable
    public final InvalidHandshakeException getMax;
    @Nullable
    public final InvalidDataException getMin;

    setCodeAndMessage(InvalidDataException invalidDataException, InvalidHandshakeException invalidHandshakeException) {
        this.getMin = invalidDataException;
        this.getMax = invalidHandshakeException;
    }

    public static class getMax {
        String FastBitmap$CoordinateSystem;
        long IsOverlapping;
        Date equals;
        final long getMax;
        final InvalidHandshakeException getMin;
        int hashCode = -1;
        String isInside;
        String length;
        Date setMax;
        final InvalidDataException setMin;
        Date toFloatRange;
        long toIntRange;

        public getMax(long j, InvalidDataException invalidDataException, InvalidHandshakeException invalidHandshakeException) {
            this.getMax = j;
            this.setMin = invalidDataException;
            this.getMin = invalidHandshakeException;
            if (invalidHandshakeException != null) {
                this.toIntRange = invalidHandshakeException.toDoubleRange;
                this.IsOverlapping = invalidHandshakeException.hashCode;
                Draft_75 draft_75 = invalidHandshakeException.toIntRange;
                int length2 = draft_75.length.length / 2;
                for (int i = 0; i < length2; i++) {
                    int i2 = i * 2;
                    String str = draft_75.length[i2];
                    String str2 = draft_75.length[i2 + 1];
                    if ("Date".equalsIgnoreCase(str)) {
                        this.setMax = FramedataImpl1.setMin(str2);
                        this.length = str2;
                    } else if (HttpHeaders.EXPIRES.equalsIgnoreCase(str)) {
                        this.toFloatRange = FramedataImpl1.setMin(str2);
                    } else if (HttpHeaders.LAST_MODIFIED.equalsIgnoreCase(str)) {
                        this.equals = FramedataImpl1.setMin(str2);
                        this.isInside = str2;
                    } else if ("ETag".equalsIgnoreCase(str)) {
                        this.FastBitmap$CoordinateSystem = str2;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(str)) {
                        this.hashCode = ClientHandshake.getMin(str2, -1);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin() {
            InvalidHandshakeException invalidHandshakeException = this.getMin;
            translateHandshake translatehandshake = invalidHandshakeException.FastBitmap$CoordinateSystem;
            if (translatehandshake == null) {
                translatehandshake = translateHandshake.length(invalidHandshakeException.toIntRange);
                invalidHandshakeException.FastBitmap$CoordinateSystem = translatehandshake;
            }
            return translatehandshake.setMin == -1 && this.toFloatRange == null;
        }

        static boolean getMax(InvalidDataException invalidDataException) {
            return (invalidDataException.length.length("If-Modified-Since") == null && invalidDataException.length.length("If-None-Match") == null) ? false : true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        if (r0.setMax() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0075, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getMax(o.InvalidHandshakeException r3, o.InvalidDataException r4) {
        /*
            int r0 = r3.getMax
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x0076
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x0076
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x0076
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x0076
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x0076
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0076
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x002f
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x0076
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x0076
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x0076
            switch(r0) {
                case 300: goto L_0x0076;
                case 301: goto L_0x0076;
                case 302: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0075
        L_0x002f:
            o.Draft_75 r0 = r3.toIntRange
            java.lang.String r1 = "Expires"
            java.lang.String r0 = r0.length(r1)
            if (r0 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 != 0) goto L_0x0076
            o.translateHandshake r0 = r3.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x0042
            goto L_0x004a
        L_0x0042:
            o.Draft_75 r0 = r3.toIntRange
            o.translateHandshake r0 = o.translateHandshake.length(r0)
            r3.FastBitmap$CoordinateSystem = r0
        L_0x004a:
            int r0 = r0.setMin
            r1 = -1
            if (r0 != r1) goto L_0x0076
            o.translateHandshake r0 = r3.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            o.Draft_75 r0 = r3.toIntRange
            o.translateHandshake r0 = o.translateHandshake.length(r0)
            r3.FastBitmap$CoordinateSystem = r0
        L_0x005c:
            boolean r0 = r0.setMin()
            if (r0 != 0) goto L_0x0076
            o.translateHandshake r0 = r3.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            o.Draft_75 r0 = r3.toIntRange
            o.translateHandshake r0 = o.translateHandshake.length(r0)
            r3.FastBitmap$CoordinateSystem = r0
        L_0x006f:
            boolean r0 = r0.setMax()
            if (r0 != 0) goto L_0x0076
        L_0x0075:
            return r2
        L_0x0076:
            o.translateHandshake r0 = r3.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            o.Draft_75 r0 = r3.toIntRange
            o.translateHandshake r0 = o.translateHandshake.length(r0)
            r3.FastBitmap$CoordinateSystem = r0
        L_0x0083:
            boolean r3 = r0.length()
            if (r3 != 0) goto L_0x009e
            o.translateHandshake r3 = r4.isInside
            if (r3 == 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            o.Draft_75 r3 = r4.length
            o.translateHandshake r3 = o.translateHandshake.length(r3)
            r4.isInside = r3
        L_0x0096:
            boolean r3 = r3.length()
            if (r3 != 0) goto L_0x009e
            r3 = 1
            return r3
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCodeAndMessage.getMax(o.InvalidHandshakeException, o.InvalidDataException):boolean");
    }
}
