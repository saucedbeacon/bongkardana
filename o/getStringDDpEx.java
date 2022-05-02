package o;

import com.google.common.base.Strings;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public final class getStringDDpEx {
    public static final String EVENTS = "/events/bulk";
    public static final String IMPRESSIONS = "/testImpressions/bulk";
    public static final String IMPRESSIONS_COUNT = "/testImpressions/count";
    public static final String MY_SEGMENTS = "/mySegments";
    public static final String SPLIT_CHANGES = "/splitChanges";
    public static final String SSE_AUTHENTICATION = "/auth";
    private static long getMax = -7080820561380931021L;
    private static int setMax = 1;
    private static int setMin;

    public static final URI splitChanges(String str, String str2) throws URISyntaxException {
        try {
            int i = setMin + 93;
            setMax = i % 128;
            int i2 = i % 2;
            URI buildUrl = buildUrl(str, SPLIT_CHANGES, str2);
            int i3 = setMax + 41;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            return buildUrl;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final URI mySegments(String str, String str2) throws URISyntaxException {
        int i = setMax + 111;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            str2 = URLEncoder.encode(str2, setMax(new char[]{45737, 14543, 61237, 40334, 16570, 63302}).intern());
            int i3 = setMax + 99;
            setMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Could not encode user key: ");
            sb.append(str2);
            sb.append(" error -> ");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
        }
        return buildUrl(str, "/mySegments/".concat(String.valueOf(str2)));
    }

    public static final URI events(String str) throws URISyntaxException {
        int i = setMin + 77;
        setMax = i % 128;
        char c = 2;
        if (i % 2 != 0) {
            c = 'Y';
        }
        if (c != 'Y') {
            int i2 = 43 / 0;
            return buildUrl(str, EVENTS);
        }
        try {
            return buildUrl(str, EVENTS);
        } catch (Exception e) {
            throw e;
        }
    }

    public static final URI impressions(String str) throws URISyntaxException {
        URI uri;
        int i = setMin + 65;
        setMax = i % 128;
        if (!(i % 2 == 0)) {
            uri = buildUrl(str, IMPRESSIONS);
        } else {
            uri = buildUrl(str, IMPRESSIONS);
            Object obj = null;
            super.hashCode();
        }
        int i2 = setMin + 99;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        return uri;
    }

    public static final URI impressionsCount(String str) throws URISyntaxException {
        try {
            int i = setMin + 83;
            setMax = i % 128;
            int i2 = i % 2;
            URI buildUrl = buildUrl(str, IMPRESSIONS_COUNT);
            int i3 = setMin + 107;
            setMax = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 13 : 8) == 8) {
                return buildUrl;
            }
            Object obj = null;
            super.hashCode();
            return buildUrl;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final URI sseAuthentication(String str) throws URISyntaxException {
        int i = setMax + 55;
        setMin = i % 128;
        boolean z = i % 2 == 0;
        URI buildUrl = buildUrl(str, SSE_AUTHENTICATION);
        if (!z) {
            int i2 = 29 / 0;
        }
        int i3 = setMin + 37;
        setMax = i3 % 128;
        if ((i3 % 2 == 0 ? '%' : 'T') != '%') {
            return buildUrl;
        }
        Object obj = null;
        super.hashCode();
        return buildUrl;
    }

    private static URI buildUrl(String str, String str2) throws URISyntaxException {
        int i = setMax + 91;
        setMin = i % 128;
        int i2 = i % 2;
        URI buildUrl = buildUrl(str, str2, (String) null);
        int i3 = setMax + 125;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return buildUrl;
    }

    private static URI buildUrl(String str, String str2, String str3) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String obj = sb.toString();
        if (!Strings.isNullOrEmpty(str3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("?");
            sb2.append(str3);
            obj = sb2.toString();
        }
        URI uri = new URI(obj);
        int i = setMin + 87;
        setMax = i % 128;
        if ((i % 2 == 0 ? '=' : '2') == '2') {
            return uri;
        }
        int i2 = 10 / 0;
        return uri;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: char} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r0v5, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r0v6, types: [char] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(char[] r8) {
        /*
            int r0 = setMax
            int r0 = r0 + 9
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x001a
            char r0 = r8[r1]
            int r1 = r8.length
            int r1 = r1 - r2
            char[] r1 = new char[r1]
            goto L_0x0020
        L_0x001a:
            char r0 = r8[r2]
            int r3 = r8.length
            int r3 = r3 + r1
            char[] r1 = new char[r3]
        L_0x0020:
            int r3 = r8.length
            if (r2 >= r3) goto L_0x0068
            int r3 = setMin
            int r3 = r3 + 3
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            r4 = 20
            if (r3 != 0) goto L_0x0034
            r3 = 75
            goto L_0x0036
        L_0x0034:
            r3 = 20
        L_0x0036:
            if (r3 == r4) goto L_0x004c
            int r3 = r2 % 1
            char r4 = r8[r2]
            int r5 = r2 % r0
            r4 = r4 & r5
            long r4 = (long) r4
            long r6 = getMax     // Catch:{ Exception -> 0x004a }
            long r4 = r4 & r6
            int r5 = (int) r4
            char r4 = (char) r5
            r1[r3] = r4
            int r2 = r2 + 121
            goto L_0x005d
        L_0x004a:
            r8 = move-exception
            throw r8
        L_0x004c:
            int r3 = r2 + -1
            char r4 = r8[r2]
            int r5 = r2 * r0
            r4 = r4 ^ r5
            long r4 = (long) r4
            long r6 = getMax
            long r4 = r4 ^ r6
            int r5 = (int) r4
            char r4 = (char) r5
            r1[r3] = r4
            int r2 = r2 + 1
        L_0x005d:
            int r3 = setMin
            int r3 = r3 + 91
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            goto L_0x0020
        L_0x0068:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStringDDpEx.setMax(char[]):java.lang.String");
    }
}
