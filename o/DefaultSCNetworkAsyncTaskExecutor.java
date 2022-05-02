package o;

import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DefaultSCNetworkAsyncTaskExecutor {
    /* access modifiers changed from: private */
    public static final char[] IsOverlapping = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final setMin equals = new setMin() {
        public final void setMin(String str, StringBuilder sb) {
            if (str.charAt(0) == '\\') {
                sb.append(str, 1, str.length());
            } else {
                sb.append(SSLExtensionsFactory.getMin(str));
            }
        }
    };
    private static final Pattern getMax = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
    private static final Pattern getMin = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern isInside = Pattern.compile("[ \t\r\n]+");
    private static final Pattern length = Pattern.compile("[\\\\&]");
    private static final Pattern setMax = Pattern.compile("&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});|[&<>\"]", 2);
    private static final Pattern setMin = Pattern.compile("[&<>\"]");
    private static final setMin toFloatRange = new setMin() {
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x005f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMin(java.lang.String r6, java.lang.StringBuilder r7) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                r1 = 34
                r2 = 3
                r3 = 2
                r4 = 1
                if (r0 == r1) goto L_0x0036
                r1 = 38
                if (r0 == r1) goto L_0x002c
                r1 = 60
                if (r0 == r1) goto L_0x0022
                r1 = 62
                if (r0 == r1) goto L_0x0018
                goto L_0x0040
            L_0x0018:
                java.lang.String r0 = ">"
                boolean r0 = r6.equals(r0)
                if (r0 == 0) goto L_0x0040
                r0 = 2
                goto L_0x0041
            L_0x0022:
                java.lang.String r0 = "<"
                boolean r0 = r6.equals(r0)
                if (r0 == 0) goto L_0x0040
                r0 = 1
                goto L_0x0041
            L_0x002c:
                java.lang.String r0 = "&"
                boolean r0 = r6.equals(r0)
                if (r0 == 0) goto L_0x0040
                r0 = 0
                goto L_0x0041
            L_0x0036:
                java.lang.String r0 = "\""
                boolean r0 = r6.equals(r0)
                if (r0 == 0) goto L_0x0040
                r0 = 3
                goto L_0x0041
            L_0x0040:
                r0 = -1
            L_0x0041:
                if (r0 == 0) goto L_0x005f
                if (r0 == r4) goto L_0x0059
                if (r0 == r3) goto L_0x0053
                if (r0 == r2) goto L_0x004d
                r7.append(r6)
                return
            L_0x004d:
                java.lang.String r6 = "&quot;"
                r7.append(r6)
                return
            L_0x0053:
                java.lang.String r6 = "&gt;"
                r7.append(r6)
                return
            L_0x0059:
                java.lang.String r6 = "&lt;"
                r7.append(r6)
                return
            L_0x005f:
                java.lang.String r6 = "&amp;"
                r7.append(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DefaultSCNetworkAsyncTaskExecutor.AnonymousClass3.setMin(java.lang.String, java.lang.StringBuilder):void");
        }
    };
    private static final setMin toIntRange = new setMin() {
        private static int getMax = 0;
        private static int length = 156;
        private static int setMax = 1;

        public final void setMin(String str, StringBuilder sb) {
            int i = setMax + 65;
            getMax = i % 128;
            int i2 = i % 2;
            boolean z = false;
            if (!str.startsWith("%")) {
                for (byte b : str.getBytes(Charset.forName(setMin(224 - TextUtils.indexOf("", "", 0), 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), new char[]{2, 16, 17, 65524, 65513}, PhoneNumberUtils.isDialable('0'), 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()))) {
                    sb.append('%');
                    sb.append(DefaultSCNetworkAsyncTaskExecutor.IsOverlapping[(b >> 4) & 15]);
                    sb.append(DefaultSCNetworkAsyncTaskExecutor.IsOverlapping[b & Ascii.SI]);
                }
                int i3 = getMax + 79;
                setMax = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 51 / 0;
                    return;
                }
                return;
            }
            int i5 = getMax + 9;
            setMax = i5 % 128;
            int i6 = i5 % 2;
            if (str.length() == 3) {
                z = true;
            }
            if (!z) {
                sb.append("%25");
                sb.append(str, 1, str.length());
                int i7 = setMax + 113;
                getMax = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            sb.append(str);
        }

        private static String setMin(int i, int i2, char[] cArr, boolean z, int i3) {
            int i4;
            char[] cArr2;
            int i5 = getMax + 113;
            setMax = i5 % 128;
            int i6 = 0;
            if ((i5 % 2 == 0 ? 1 : 'Y') != 1) {
                cArr2 = new char[i3];
                i4 = 0;
            } else {
                cArr2 = new char[i3];
                i4 = 1;
            }
            while (i4 < i3) {
                int i7 = setMax + 77;
                getMax = i7 % 128;
                int i8 = i7 % 2;
                cArr2[i4] = (char) (cArr[i4] + i);
                cArr2[i4] = (char) (cArr2[i4] - length);
                i4++;
            }
            if (i2 > 0) {
                try {
                    int i9 = setMax + 41;
                    getMax = i9 % 128;
                    int i10 = i9 % 2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i11 = i3 - i2;
                    System.arraycopy(cArr3, 0, cArr2, i11, i2);
                    System.arraycopy(cArr3, i2, cArr2, 0, i11);
                    int i12 = setMax + 97;
                    getMax = i12 % 128;
                    int i13 = i12 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
            if (z) {
                char[] cArr4 = new char[i3];
                while (true) {
                    if ((i6 < i3 ? 'E' : '!') != 'E') {
                        break;
                    }
                    cArr4[i6] = cArr2[(i3 - i6) - 1];
                    i6++;
                }
                int i14 = getMax + 99;
                setMax = i14 % 128;
                int i15 = i14 % 2;
                cArr2 = cArr4;
            }
            return new String(cArr2);
        }
    };

    interface setMin {
        void setMin(String str, StringBuilder sb);
    }

    public static String getMax(String str) {
        if (!length.matcher(str).find()) {
            return str;
        }
        Pattern pattern = getMin;
        setMin setmin = equals;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int i = 0;
        do {
            sb.append(str, i, matcher.start());
            setmin.setMin(matcher.group(), sb);
            i = matcher.end();
        } while (matcher.find());
        if (i != str.length()) {
            sb.append(str, i, str.length());
        }
        return sb.toString();
    }

    public static String length(String str) {
        return isInside.matcher(str.substring(1, str.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }
}
