package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.constant.UrlTag;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

public class isShowMenu {
    private static int IsOverlapping = 1;
    private static boolean getMax = true;
    private static int getMin = 33;
    private static char[] length = {'v', 'u', 'g', 'N', 'Y'};
    private static int setMax = 0;
    private static boolean setMin = true;

    private isShowMenu() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4.startsWith("https://") == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r4.startsWith("https://") == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r4.startsWith("http://") == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String setMin(java.lang.String r4) {
        /*
            r0 = 1
            if (r4 == 0) goto L_0x0005
            r1 = 1
            goto L_0x0007
        L_0x0005:
            r1 = 91
        L_0x0007:
            if (r1 == r0) goto L_0x000b
            goto L_0x0077
        L_0x000b:
            int r1 = IsOverlapping
            int r1 = r1 + 71
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            java.lang.String r2 = "https://"
            r3 = 0
            if (r1 == 0) goto L_0x0026
            boolean r1 = r4.startsWith(r2)
            r2 = 34
            int r2 = r2 / r3
            if (r1 != 0) goto L_0x0077
            goto L_0x002c
        L_0x0024:
            r4 = move-exception
            throw r4
        L_0x0026:
            boolean r1 = r4.startsWith(r2)
            if (r1 != 0) goto L_0x0077
        L_0x002c:
            int r1 = IsOverlapping
            int r1 = r1 + 23
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            java.lang.String r2 = "http://"
            if (r1 == 0) goto L_0x0047
            boolean r1 = r4.startsWith(r2)
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0077
            goto L_0x004d
        L_0x0045:
            r4 = move-exception
            throw r4
        L_0x0047:
            boolean r1 = r4.startsWith(r2)
            if (r1 != 0) goto L_0x0077
        L_0x004d:
            java.lang.String r1 = "file:///"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L_0x0056
            goto L_0x0077
        L_0x0056:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "https://m.dana.id"
            java.lang.String r4 = r1.concat(r4)
            int r1 = setMax
            int r1 = r1 + 117
            int r2 = r1 % 128
            IsOverlapping = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x006e
            r1 = 0
            goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            if (r1 == r0) goto L_0x0077
            r0 = 45
            int r0 = r0 / r3
            return r4
        L_0x0075:
            r4 = move-exception
            throw r4
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isShowMenu.setMin(java.lang.String):java.lang.String");
    }

    @NonNull
    public static String getMax(@NonNull String str, @NonNull String str2) {
        int i = IsOverlapping + 41;
        setMax = i % 128;
        int i2 = i % 2;
        Uri parse = Uri.parse(str);
        if ((parse.getBooleanQueryParameter(UrlTag.ENTRY_POINT, false) ? 12 : Typography.quote) == '\"') {
            return parse.buildUpon().appendQueryParameter(UrlTag.ENTRY_POINT, str2).build().toString();
        }
        int i3 = setMax + 13;
        IsOverlapping = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static String length(String str, String str2) {
        Object[] objArr = null;
        if ((str.contains(DanaLogConstants.BizType.TOPUP) ? '\'' : '(') != '(') {
            int i = IsOverlapping + 73;
            setMax = i % 128;
            if (!(i % 2 == 0)) {
                try {
                    str = setH5OptionMenuTextFlag.setMin("/m/portal/topup?entryPoint={entryPoint}").getMin(UrlTag.ENTRY_POINT, str2).getMax();
                    super.hashCode();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                str = setH5OptionMenuTextFlag.setMin("/m/portal/topup?entryPoint={entryPoint}").getMin(UrlTag.ENTRY_POINT, str2).getMax();
            }
        }
        String min = setMin(str);
        int i2 = setMax + 27;
        IsOverlapping = i2 % 128;
        if (i2 % 2 != 0) {
            return min;
        }
        int length2 = objArr.length;
        return min;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String setMax(java.lang.String r5) {
        /*
            int r0 = IsOverlapping
            int r0 = r0 + 103
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = -1
            if (r0 == r1) goto L_0x0020
            r0 = 99
            int r0 = r5.indexOf(r0)
            if (r0 == r3) goto L_0x001d
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x002c
            goto L_0x003a
        L_0x0020:
            r0 = 35
            int r0 = r5.indexOf(r0)
            if (r0 == r3) goto L_0x0029
            r1 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            int r1 = setMax     // Catch:{ Exception -> 0x0064 }
            int r1 = r1 + 93
            int r4 = r1 % 128
            IsOverlapping = r4     // Catch:{ Exception -> 0x0064 }
            int r1 = r1 % 2
            java.lang.String r5 = r5.substring(r2, r0)
        L_0x003a:
            java.lang.String r0 = "??"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x004d
            int r0 = setMax
            int r0 = r0 + 27
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            return r5
        L_0x004d:
            r0 = 63
            int r0 = r5.indexOf(r0)     // Catch:{ Exception -> 0x0064 }
            if (r0 == r3) goto L_0x0063
            int r1 = setMax
            int r1 = r1 + 29
            int r3 = r1 % 128
            IsOverlapping = r3
            int r1 = r1 % 2
            java.lang.String r5 = r5.substring(r2, r0)
        L_0x0063:
            return r5
        L_0x0064:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isShowMenu.setMax(java.lang.String):java.lang.String");
    }

    public static boolean length(String str) {
        int i = setMax + 41;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        if ((!TextUtils.isEmpty(str) ? 'C' : 31) != 31) {
            int i3 = setMax + 97;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            if (str.trim().contains("https://link.dana.id/")) {
                try {
                    int i5 = setMax + 95;
                    IsOverlapping = i5 % 128;
                    return !(i5 % 2 == 0);
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        return false;
    }

    public static String getMin(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            try {
                int i = setMax + 75;
                IsOverlapping = i % 128;
                if ((i % 2 == 0 ? ']' : 3) == ']') {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
                str = "";
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                int i2 = setMax + 109;
                IsOverlapping = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        if ((TextUtils.isEmpty(str2) ? 18 : 'O') == 18) {
            str2 = "";
        }
        if (str.contains("?")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&");
            sb.append(str2);
            String obj = sb.toString();
            int i4 = setMax + 71;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?");
        sb2.append(str2);
        return sb2.toString();
    }

    public static String getMax(String str, Map<String, String> map) {
        boolean z = true;
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            try {
                int i = setMax + 7;
                IsOverlapping = i % 128;
                if (i % 2 == 0) {
                    z = false;
                }
                if (z) {
                    return "";
                }
                int i2 = 36 / 0;
                return "";
            } catch (Exception e) {
                throw e;
            }
        } else {
            if (!map.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                return str;
            }
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                if ((it.hasNext() ? '`' : '6') != '`') {
                    return str;
                }
                Map.Entry next = it.next();
                if (!((String) next.getKey()).equals(BranchLinkConstant.OauthParams.REFERRING_LINK)) {
                    int i3 = setMax + 115;
                    IsOverlapping = i3 % 128;
                    int i4 = i3 % 2;
                    if (!((String) next.getKey()).equals(BranchLinkConstant.PaymentParams.ANDROID_URL)) {
                        int i5 = IsOverlapping + 47;
                        setMax = i5 % 128;
                        int i6 = i5 % 2;
                        if (next.getValue() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append((String) next.getKey());
                            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                            sb.append((String) next.getValue());
                            str = getMin(str, sb.toString());
                            int i7 = IsOverlapping + 79;
                            setMax = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r7 > 0) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[Catch:{ UnsupportedEncodingException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e A[Catch:{ UnsupportedEncodingException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[Catch:{ UnsupportedEncodingException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ UnsupportedEncodingException -> 0x009d }] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> getMin(java.net.URL r11) {
        /*
            r0 = 0
            java.lang.String r11 = r11.getQuery()     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ UnsupportedEncodingException -> 0x009d }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.lang.String r2 = "&"
            java.lang.String[] r11 = r11.split(r2)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            int r2 = r11.length     // Catch:{ UnsupportedEncodingException -> 0x009d }
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r4 >= r2) goto L_0x009c
            int r5 = setMax
            int r5 = r5 + 109
            int r6 = r5 % 128
            IsOverlapping = r6
            int r5 = r5 % 2
            r6 = 1
            if (r5 != 0) goto L_0x0024
            r5 = 0
            goto L_0x0025
        L_0x0024:
            r5 = 1
        L_0x0025:
            if (r5 == 0) goto L_0x0032
            r5 = r11[r4]     // Catch:{ UnsupportedEncodingException -> 0x009d }
            r7 = 61
            int r7 = r5.indexOf(r7)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            if (r7 <= 0) goto L_0x004b
            goto L_0x003c
        L_0x0032:
            r5 = r11[r4]     // Catch:{ UnsupportedEncodingException -> 0x009d }
            r7 = 103(0x67, float:1.44E-43)
            int r7 = r5.indexOf(r7)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            if (r7 <= 0) goto L_0x004b
        L_0x003c:
            java.lang.String r8 = r5.substring(r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.lang.String r9 = r9.name()     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.lang.String r8 = java.net.URLDecoder.decode(r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            goto L_0x004c
        L_0x004b:
            r8 = r5
        L_0x004c:
            boolean r9 = r1.containsKey(r8)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            if (r9 != 0) goto L_0x005a
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ UnsupportedEncodingException -> 0x009d }
            r9.<init>()     // Catch:{ UnsupportedEncodingException -> 0x009d }
            r1.put(r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x009d }
        L_0x005a:
            r9 = 36
            if (r7 <= 0) goto L_0x0061
            r10 = 8
            goto L_0x0063
        L_0x0061:
            r10 = 36
        L_0x0063:
            if (r10 == r9) goto L_0x0080
            int r9 = r5.length()     // Catch:{ UnsupportedEncodingException -> 0x009d }
            int r7 = r7 + 1
            if (r9 <= r7) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            if (r6 == 0) goto L_0x0080
            java.lang.String r5 = r5.substring(r7)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.lang.String r6 = r6.name()     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            goto L_0x008b
        L_0x0080:
            int r5 = IsOverlapping
            int r5 = r5 + 33
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r5 = r0
        L_0x008b:
            java.lang.String r5 = toFloatRange(r5)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.lang.Object r6 = r1.get(r8)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedEncodingException -> 0x009d }
            r6.add(r5)     // Catch:{ UnsupportedEncodingException -> 0x009d }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x009c:
            return r1
        L_0x009d:
            r11 = move-exception
            java.lang.Class<o.isShowMenu> r1 = o.isShowMenu.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r11 = r11.getMessage()
            o.updateActionSheetContent.e(r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isShowMenu.getMin(java.net.URL):java.util.Map");
    }

    @Nullable
    private static String toFloatRange(@Nullable String str) {
        int i = IsOverlapping + 87;
        setMax = i % 128;
        if ((i % 2 != 0 ? ' ' : 'J') != ' ') {
            if (!(str != null)) {
                return str;
            }
        } else {
            int i2 = 71 / 0;
            if (str == null) {
                return str;
            }
        }
        try {
            if (str.charAt(0) == '[') {
                str = str.replaceFirst("\\[", "");
                int i3 = setMax + 117;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
            }
            if (!(str.charAt(str.length() - 1) == ']')) {
                return str;
            }
            String substring = str.substring(0, str.length() - 1);
            int i5 = IsOverlapping + 85;
            setMax = i5 % 128;
            int i6 = i5 % 2;
            return substring;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Map<String, List<String>> getMin(String str) throws UnsupportedEncodingException {
        String str2;
        String str3;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String[] split = str.split("&");
            int length2 = split.length;
            int i2 = 0;
            while (true) {
                if ((i2 < length2 ? 'L' : 3) != 'L') {
                    return linkedHashMap;
                }
                String str4 = split[i2];
                int indexOf = str4.indexOf(61);
                if (indexOf > 0) {
                    int i3 = IsOverlapping + 79;
                    setMax = i3 % 128;
                    int i4 = i3 % 2;
                    str2 = URLDecoder.decode(str4.substring(0, indexOf), StandardCharsets.UTF_8.name());
                } else {
                    str2 = str4;
                }
                if (!linkedHashMap.containsKey(str2)) {
                    try {
                        linkedHashMap.put(str2, new LinkedList());
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (indexOf <= 0 || str4.length() <= (i = indexOf + 1)) {
                    str3 = null;
                    int i5 = setMax + 15;
                    IsOverlapping = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    str3 = URLDecoder.decode(str4.substring(i), StandardCharsets.UTF_8.name());
                }
                ((List) linkedHashMap.get(str2)).addAll(equals(toFloatRange(str3)));
                i2++;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Nullable
    private static List<String> equals(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList();
        int length2 = split.length;
        int i = 0;
        while (i < length2) {
            String str2 = split[i];
            try {
                if ((!TextUtils.isEmpty(str2) ? '-' : '(') != '(') {
                    int i2 = IsOverlapping + 65;
                    setMax = i2 % 128;
                    if (!(i2 % 2 != 0)) {
                        arrayList.add(str2);
                    } else {
                        try {
                            arrayList.add(str2);
                            int i3 = 88 / 0;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
                i++;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i4 = setMax + 55;
        IsOverlapping = i4 % 128;
        if (i4 % 2 != 0) {
            return arrayList;
        }
        int i5 = 63 / 0;
        return arrayList;
    }

    @Nullable
    public static String getMax(String str) {
        String min;
        int i = setMax + 21;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? 27 : '_') != 27) {
            try {
                min = setMin(new byte[]{-123, -124, -125, -126, -127}, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (int[]) null, (char[]) null);
            } catch (Exception unused) {
                return null;
            }
        } else {
            min = setMin(new byte[]{-123, -124, -125, -126, -127}, 112 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (int[]) null, (char[]) null);
        }
        return URLEncoder.encode(str, min.intern());
    }

    private static String setMin(byte[] bArr, int i, int[] iArr, char[] cArr) {
        char[] cArr2 = length;
        int i2 = getMin;
        int i3 = 0;
        boolean z = true;
        if (setMin) {
            int i4 = setMax + 125;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            int length2 = bArr.length;
            char[] cArr3 = new char[length2];
            while (i3 < length2) {
                cArr3[i3] = (char) (cArr2[bArr[(length2 - 1) - i3] + i] - i2);
                i3++;
            }
            String str = new String(cArr3);
            int i6 = IsOverlapping + 41;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
        if (!getMax) {
            z = false;
        }
        if (z) {
            int length3 = cArr.length;
            char[] cArr4 = new char[length3];
            while (true) {
                if ((i3 < length3 ? 'b' : 'I') == 'I') {
                    return new String(cArr4);
                }
                int i8 = setMax + 15;
                IsOverlapping = i8 % 128;
                int i9 = i8 % 2;
                cArr4[i3] = (char) (cArr2[cArr[(length3 - 1) - i3] - i] - i2);
                i3++;
            }
        } else {
            int length4 = iArr.length;
            char[] cArr5 = new char[length4];
            while (true) {
                if ((i3 < length4 ? (char) 19 : 27) != 19) {
                    return new String(cArr5);
                }
                cArr5[i3] = (char) (cArr2[iArr[(length4 - 1) - i3] - i] - i2);
                i3++;
            }
        }
    }
}
