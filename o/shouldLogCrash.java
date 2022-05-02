package o;

import android.telephony.PhoneNumberUtils;
import android.webkit.URLUtil;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.yaml.snakeyaml.error.YAMLException;

public abstract class shouldLogCrash {
    private static int getMax = 1;
    private static final adjustUploadCoreByCategoryDirectly getMin = new getLogEncryptClient("-_.!~*'()@:$&,;=[]/");
    private static int length;
    private static char[] setMax;
    private static final CharsetDecoder setMin = Charset.forName(setMax(new int[]{0, 5, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, 0}, new byte[]{1, 1, 1, 0, 1}, PhoneNumberUtils.isDialable('0')).intern()).newDecoder().onMalformedInput(CodingErrorAction.REPORT);

    static void setMin() {
        setMax = new char[]{Ascii.MAX, 249, 256, 276, 283};
    }

    static {
        setMin();
        int i = getMax + 65;
        length = i % 128;
        int i2 = i % 2;
    }

    public static String setMin(String str) {
        int i = length + 125;
        getMax = i % 128;
        if ((i % 2 == 0 ? '=' : 'E') != '=') {
            return getMin.setMax(str);
        }
        String max = getMin.setMax(str);
        Object[] objArr = null;
        int length2 = objArr.length;
        return max;
    }

    public static String getMax(ByteBuffer byteBuffer) throws CharacterCodingException {
        try {
            int i = length + 17;
            try {
                getMax = i % 128;
                int i2 = i % 2;
                String obj = setMin.decode(byteBuffer).toString();
                int i3 = getMax + 85;
                length = i3 % 128;
                int i4 = i3 % 2;
                return obj;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String getMax(String str) {
        String intern;
        int i = getMax + 9;
        length = i % 128;
        if ((i % 2 != 0 ? '.' : ')') != '.') {
            try {
                intern = setMax(new int[]{0, 5, 199, 0}, new byte[]{1, 1, 1, 0, 1}, !URLUtil.isCookielessProxyUrl((String) null)).intern();
            } catch (UnsupportedEncodingException e) {
                throw new YAMLException((Throwable) e);
            }
        } else {
            intern = setMax(new int[]{0, 5, 199, 0}, new byte[]{1, 1, 1, 0, 1}, URLUtil.isCookielessProxyUrl((String) null)).intern();
        }
        return URLDecoder.decode(str, intern);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if ((r14[r9] == 0 ? '-' : 17) != 17) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r14[r9] == 1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r7[r9] = (char) ((r8[r9] << 1) - r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int[] r13, byte[] r14, boolean r15) {
        /*
            r0 = 0
            r1 = r13[r0]
            r2 = 1
            r3 = r13[r2]
            r4 = 2
            r5 = r13[r4]
            r6 = 3
            r6 = r13[r6]
            char[] r7 = setMax
            char[] r8 = new char[r3]
            java.lang.System.arraycopy(r7, r1, r8, r0, r3)
            r1 = 17
            if (r14 == 0) goto L_0x0075
            char[] r7 = new char[r3]
            r9 = 0
            r10 = 0
        L_0x001b:
            if (r9 >= r3) goto L_0x001f
            r11 = 1
            goto L_0x0020
        L_0x001f:
            r11 = 0
        L_0x0020:
            if (r11 == r2) goto L_0x0024
            r8 = r7
            goto L_0x0075
        L_0x0024:
            int r11 = length     // Catch:{ Exception -> 0x0073 }
            int r11 = r11 + 51
            int r12 = r11 % 128
            getMax = r12     // Catch:{ Exception -> 0x0073 }
            int r11 = r11 % 2
            r12 = 57
            if (r11 != 0) goto L_0x0035
            r11 = 18
            goto L_0x0037
        L_0x0035:
            r11 = 57
        L_0x0037:
            if (r11 == r12) goto L_0x0045
            byte r11 = r14[r9]
            if (r11 != 0) goto L_0x0040
            r11 = 45
            goto L_0x0042
        L_0x0040:
            r11 = 17
        L_0x0042:
            if (r11 == r1) goto L_0x005e
            goto L_0x0049
        L_0x0045:
            byte r11 = r14[r9]
            if (r11 != r2) goto L_0x005e
        L_0x0049:
            char r11 = r8[r9]
            int r11 = r11 << r2
            int r11 = r11 + r2
            int r11 = r11 - r10
            char r10 = (char) r11
            r7[r9] = r10
            int r10 = getMax     // Catch:{ Exception -> 0x0073 }
            int r10 = r10 + 97
            int r11 = r10 % 128
            length = r11     // Catch:{ Exception -> 0x005c }
            int r10 = r10 % 2
            goto L_0x0065
        L_0x005c:
            r13 = move-exception
            throw r13
        L_0x005e:
            char r11 = r8[r9]
            int r11 = r11 << r2
            int r11 = r11 - r10
            char r10 = (char) r11
            r7[r9] = r10
        L_0x0065:
            char r10 = r7[r9]
            int r9 = r9 + 1
            int r11 = getMax
            int r11 = r11 + 51
            int r12 = r11 % 128
            length = r12
            int r11 = r11 % r4
            goto L_0x001b
        L_0x0073:
            r13 = move-exception
            throw r13
        L_0x0075:
            if (r6 <= 0) goto L_0x007a
            r14 = 17
            goto L_0x007c
        L_0x007a:
            r14 = 28
        L_0x007c:
            if (r14 == r1) goto L_0x007f
            goto L_0x008c
        L_0x007f:
            char[] r14 = new char[r3]
            java.lang.System.arraycopy(r8, r0, r14, r0, r3)
            int r1 = r3 - r6
            java.lang.System.arraycopy(r14, r0, r8, r1, r6)
            java.lang.System.arraycopy(r14, r6, r8, r0, r1)
        L_0x008c:
            if (r15 == 0) goto L_0x00bb
            int r14 = length
            int r14 = r14 + 71
            int r15 = r14 % 128
            getMax = r15
            int r14 = r14 % r4
            if (r14 != 0) goto L_0x009b
            r14 = 0
            goto L_0x009c
        L_0x009b:
            r14 = 1
        L_0x009c:
            if (r14 == r2) goto L_0x00a2
            char[] r14 = new char[r3]
            r15 = 1
            goto L_0x00a5
        L_0x00a2:
            char[] r14 = new char[r3]
            r15 = 0
        L_0x00a5:
            r1 = 29
            if (r15 >= r3) goto L_0x00ac
            r6 = 8
            goto L_0x00ae
        L_0x00ac:
            r6 = 29
        L_0x00ae:
            if (r6 == r1) goto L_0x00ba
            int r1 = r3 - r15
            int r1 = r1 - r2
            char r1 = r8[r1]
            r14[r15] = r1
            int r15 = r15 + 1
            goto L_0x00a5
        L_0x00ba:
            r8 = r14
        L_0x00bb:
            if (r5 <= 0) goto L_0x00ca
        L_0x00bd:
            if (r0 >= r3) goto L_0x00ca
            char r14 = r8[r0]
            r15 = r13[r4]
            int r14 = r14 - r15
            char r14 = (char) r14
            r8[r0] = r14
            int r0 = r0 + 1
            goto L_0x00bd
        L_0x00ca:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.shouldLogCrash.setMax(int[], byte[], boolean):java.lang.String");
    }
}
