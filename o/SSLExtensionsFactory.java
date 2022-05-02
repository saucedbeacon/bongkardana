package o;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSLExtensionsFactory {
    public static final Map<String, String> getMax = length();
    private static int getMin = 0;
    private static final Pattern length = Pattern.compile("^&#[Xx]?");
    private static char[] setMax = null;
    private static char setMin = '\u0000';
    private static int toIntRange = 1;

    static void getMax() {
        setMin = 3;
        setMax = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static {
        getMax();
        int i = getMin + 67;
        toIntRange = i % 128;
        int i2 = i % 2;
    }

    public static String getMin(String str) {
        Matcher matcher = length.matcher(str);
        boolean z = true;
        if ((matcher.find() ? 'W' : ')') != ')') {
            try {
                try {
                    int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), (matcher.end() == 2 ? '[' : 11) != 11 ? 10 : 16);
                    if (parseInt == 0) {
                        return "�";
                    }
                    return new String(Character.toChars(parseInt));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            String str2 = getMax.get(str.substring(1, str.length() - 1));
            if (str2 != null) {
                z = false;
            }
            if (z) {
                return str;
            }
            int i = getMin + 9;
            toIntRange = i % 128;
            int i2 = i % 2;
            try {
                int i3 = getMin + 117;
                toIntRange = i3 % 128;
                if ((i3 % 2 == 0 ? 22 : 'E') == 'E') {
                    return str2;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return str2;
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, java.lang.String> length() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<o.SSLExtensionsFactory> r1 = o.SSLExtensionsFactory.class
            java.lang.String r2 = "/org/commonmark/internal/util/entities.properties"
            java.io.InputStream r1 = r1.getResourceAsStream(r2)
            r2 = 5
            char[] r3 = new char[r2]
            r3 = {1, 2, 0, 5, 110} // fill-array
            r4 = 0
            int r5 = android.view.KeyEvent.getDeadChar(r4, r4)
            int r2 = r2 - r5
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r5 = 54 - r5
            byte r5 = (byte) r5
            java.lang.String r2 = getMin(r3, r2, r5)
            java.lang.String r2 = r2.intern()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00a0 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a0 }
            r5.<init>(r1, r2)     // Catch:{ IOException -> 0x00a0 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x00a0 }
        L_0x0036:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x007f
            int r2 = r1.length()     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r2 == 0) goto L_0x0036
            int r2 = getMin
            int r2 = r2 + 71
            int r5 = r2 % 128
            toIntRange = r5
            int r2 = r2 % 2
            r5 = 84
            if (r2 != 0) goto L_0x0058
            r2 = 84
            goto L_0x005a
        L_0x0058:
            r2 = 37
        L_0x005a:
            java.lang.String r6 = "="
            if (r2 == r5) goto L_0x0070
            int r2 = r1.indexOf(r6)     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r1.substring(r4, r2)     // Catch:{ all -> 0x0094 }
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)     // Catch:{ all -> 0x0094 }
        L_0x006c:
            r0.put(r5, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0036
        L_0x0070:
            int r2 = r1.indexOf(r6)     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r1.substring(r4, r2)     // Catch:{ all -> 0x0094 }
            int r2 = r2 >> 0
            java.lang.String r1 = r1.substring(r2)     // Catch:{ all -> 0x0094 }
            goto L_0x006c
        L_0x007f:
            r3.close()     // Catch:{ IOException -> 0x00a0 }
            int r1 = getMin
            int r1 = r1 + 17
            int r2 = r1 % 128
            toIntRange = r2
            int r1 = r1 % 2
            java.lang.String r1 = "NewLine"
            java.lang.String r2 = "\n"
            r0.put(r1, r2)
            return r0
        L_0x0094:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch:{ IOException -> 0x00a0 }
        L_0x009f:
            throw r1     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed reading data for HTML named character references"
            r1.<init>(r2, r0)
            goto L_0x00aa
        L_0x00a9:
            throw r1
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SSLExtensionsFactory.length():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if ((r12 * 4 != 0 ? 23 : kotlin.text.Typography.quote) != '\"') goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if ((r12 % 2) != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(char[] r11, int r12, byte r13) {
        /*
            int r0 = toIntRange
            int r0 = r0 + 25
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0020
            char[] r0 = setMax
            char r1 = setMin
            char[] r2 = new char[r12]
            int r3 = r12 * 4
            r4 = 34
            if (r3 == 0) goto L_0x001b
            r3 = 23
            goto L_0x001d
        L_0x001b:
            r3 = 34
        L_0x001d:
            if (r3 == r4) goto L_0x003c
            goto L_0x002a
        L_0x0020:
            char[] r0 = setMax
            char r1 = setMin
            char[] r2 = new char[r12]
            int r3 = r12 % 2
            if (r3 == 0) goto L_0x003c
        L_0x002a:
            int r3 = toIntRange
            int r3 = r3 + 79
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
            int r12 = r12 + -1
            char r3 = r11[r12]
            int r3 = r3 - r13
            char r3 = (char) r3
            r2[r12] = r3
        L_0x003c:
            r3 = 1
            if (r12 <= r3) goto L_0x00cb
            r3 = 0
        L_0x0040:
            if (r3 >= r12) goto L_0x00cb
            char r4 = r11[r3]
            int r5 = r3 + 1
            char r6 = r11[r5]
            if (r4 != r6) goto L_0x005d
            int r7 = toIntRange
            int r7 = r7 + 123
            int r8 = r7 % 128
            getMin = r8
            int r7 = r7 % 2
            int r4 = r4 - r13
            char r4 = (char) r4
            r2[r3] = r4
            int r6 = r6 - r13
            char r4 = (char) r6
            r2[r5] = r4
            goto L_0x00c5
        L_0x005d:
            int r7 = o.onActivityPreStopped.setMin(r4, r1)     // Catch:{ Exception -> 0x00c9 }
            int r4 = o.onActivityPreStopped.length(r4, r1)     // Catch:{ Exception -> 0x00c9 }
            int r8 = o.onActivityPreStopped.setMin(r6, r1)     // Catch:{ Exception -> 0x00c9 }
            int r6 = o.onActivityPreStopped.length(r6, r1)     // Catch:{ Exception -> 0x00c9 }
            r9 = 44
            if (r4 != r6) goto L_0x0074
            r10 = 59
            goto L_0x0076
        L_0x0074:
            r10 = 44
        L_0x0076:
            if (r10 == r9) goto L_0x0091
            int r7 = o.onActivityPreStopped.setMax(r7, r1)
            int r8 = o.onActivityPreStopped.setMax(r8, r1)
            int r4 = o.onActivityPreStopped.getMax(r7, r4, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            char r4 = r0[r4]
            r2[r3] = r4
            char r4 = r0[r6]
            r2[r5] = r4
            goto L_0x00c5
        L_0x0091:
            r9 = 11
            if (r7 != r8) goto L_0x0098
            r10 = 11
            goto L_0x009a
        L_0x0098:
            r10 = 42
        L_0x009a:
            if (r10 == r9) goto L_0x00ad
            int r6 = o.onActivityPreStopped.getMax(r7, r6, r1)
            int r4 = o.onActivityPreStopped.getMax(r8, r4, r1)
            char r6 = r0[r6]
            r2[r3] = r6
            char r4 = r0[r4]
            r2[r5] = r4
            goto L_0x00c5
        L_0x00ad:
            int r4 = o.onActivityPreStopped.setMax(r4, r1)
            int r6 = o.onActivityPreStopped.setMax(r6, r1)
            int r4 = o.onActivityPreStopped.getMax(r7, r4, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            char r4 = r0[r4]
            r2[r3] = r4
            char r4 = r0[r6]
            r2[r5] = r4
        L_0x00c5:
            int r3 = r3 + 2
            goto L_0x0040
        L_0x00c9:
            r11 = move-exception
            throw r11
        L_0x00cb:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SSLExtensionsFactory.getMin(char[], int, byte):java.lang.String");
    }
}
