package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.wireless.security.SecExceptionCode;
import com.appsflyer.AFLogger;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

public final class d {

    /* renamed from: ˊ  reason: contains not printable characters */
    private static int f8728 = 1;

    /* renamed from: ˋ  reason: contains not printable characters */
    private static long f8729 = 2397383110122312943L;

    /* renamed from: ˎ  reason: contains not printable characters */
    private static char[] f8730 = {38052, 'D', 48511, 10874, 50966, 31751, 59707, 34402, 13257, 43207, 17919, 62181, 28545, 1166, 45496, 11946, 55884, 30516, 60511, 39197, 13829, 41787, 22591, 62932, 25282, 8188, 46330, 8637, 56960, 19384, 57510, 40019, 2368, 42616, '1', '0', 63413, 25434, 56939, 18808, 42077, 7978, 35355, 58728, 20688, 52175, 9925, 37313, 3248, 26498, 53939, 19902, 47439, 5193, 57376, 29900, 51710, 24298, 45983, 2188, 40424, 62206, 18179, 56385, 12577, 34356, 6935, 28675, 50537, 23152, 44678, 1019, 39096, 60826, 17114, 55228, 11516, 33035, 5710, 27436, 49205, 21777, 43604, 16225, 38001, 59522, 54097, 18353, 64138, 28047, 32995, 15346, 44750, 49559, 29735, 61220, 584, 46391, 10341, 17255, 63062, 26964, 40370, 12438, 43955, 57068, 29170, 58570, 8157, 45612, 9514, 22595, 52387, 29080, 59037, 3057, 45280, 9692, 19077, 65330, 25636, 35078, 15875, 41825, 51296, 32066, 57926, 5884, 48046, 8329, 22001, 64253, 28630, 38106, 27502, 65422, 17077, 54704, 14556, 33741, 5873, 31144, 52248, 22299, 47735, 3339, 36936, 64341, 20083, 53613, 9643, 34993, 5042, 26329, 'a', 38017, 10682, 48831, 21459, 59586, 32254, 4775, 42774, 15362, 53538, 26219, 64353, 36945, 9595, '.', 53707, 17750, 9450, 45070, 3368, 39468, 30482, 52290, 22901, 13863, 33676, 6282, 62886, 17057, 57309, 46289, 53221, 23366, 58997, 29028, 39966, 9988, 14365, 44278, 4546, 34466, 27644, 53426, 17793, 10900, 40801, 1149, 5827, 33287, 16187, 43054, 17751, 65112, 27503, 1124, 45501, 10911, 51125, 28832, 60868, 34519, 13307, 44270, 22558, 'F', 38030, 10679, 48801, 21465, 59599, 32186, 4861, 42775, 15431, 53553, 26144, 64320, 36867, 9585, 47712, 20115, 58295, 30891, 3485, 41692, 14330, 52478, 24849, 63048, 35616, 8239, 46401, 19020, 57139, 29799, 2185, 40323, 12970, 51150, 23769, 61941, 34532, 6932, 45139, 17784, 'g', 38026, 10666, 48772, 21458, 59608, 32238, 4840, 42772, 15371, 53555, 26145, 64373, 36947, 9570, 47725, 20121, 58300, 30895, 3529, 41669, 14324, 52452, 24842, 'C', 38023, 10683, 48814, 21463, 59608, 32239, 4836, 42794, 15362, 53552, 26153, 64337, 36928, 9574, 47684, 20104, 58300, 30891, 3533, 41688, 14322, 52453, 24855, 45745, 9849, 39744, 3158, 57646, 23096, 53069, 40983, 5601, 36582, 25550, 54489, 18854, 8948, 38807, 2195, 64609, 20804, 51804, 48937, 4143, 34057, 32281, 54190, 17650, 14789, 37573, 1962, 63676, 28032, 50901, 47729, 12158, 32844, 29985, 61050, 17166, 13316, 43502, 763, 63455, 26820, 56744, 46781, 11149, 40142, 28709};

    /* renamed from: ॱ  reason: contains not printable characters */
    private static int f8731;

    d() {
    }

    @Nullable
    /* renamed from: ˋ  reason: contains not printable characters */
    public static String m1256(Context context, long j) {
        String str;
        String intern;
        int i;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        char c = '=';
        if (!m1260(m1255(34, 0, 38085).intern())) {
            str = m1255(1, 35, 0);
        } else {
            int i2 = f8731 + 61;
            f8728 = i2 % 128;
            int i3 = i2 % 2;
            str = m1255(1, 34, 0);
        }
        sb2.append(str.intern());
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String r11 = m1258(packageName);
        sb2.append(m1255(1, 34, 0).intern());
        sb4.append(r11);
        if (m1261(context) == null) {
            int i4 = f8731 + 71;
            f8728 = i4 % 128;
            sb2.append(((i4 % 2 != 0 ? '\\' : 'U') != '\\' ? m1255(1, 92, 0) : m1255(1, 35, 0)).intern());
            sb4.append(packageName);
        } else {
            sb2.append(m1255(1, 34, 0).intern());
            sb4.append(packageName);
        }
        String r112 = m1259(context);
        if (r112 != null) {
            c = 'X';
        }
        if (c != 'X') {
            sb2.append(m1255(1, 35, 0).intern());
            sb4.append(packageName);
        } else {
            sb2.append(m1255(1, 34, 0).intern());
            sb4.append(r112);
        }
        sb4.append(m1257(context, packageName));
        sb.append(sb4.toString());
        try {
            sb.append(new SimpleDateFormat(m1255(18, 36, 63436).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            sb.append(j);
            sb3.append((m1260(m1255(25, 86, 54064).intern()) ? m1255(1, 34, 0) : m1255(1, 35, 0)).intern());
            sb3.append((m1260(m1255(23, 111, 22562).intern()) ? m1255(1, 34, 0) : m1255(1, 35, 0)).intern());
            sb3.append(((!m1260(m1255(20, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 27407).intern()) ? '\'' : 'M') != '\'' ? m1255(1, 34, 0) : m1255(1, 35, 0)).intern());
            if (m1260(m1255(15, 154, 0).intern())) {
                intern = m1255(1, 34, 0).intern();
                i = f8731 + 93;
                f8728 = i % 128;
            } else {
                intern = m1255(1, 35, 0).intern();
                i = f8728 + 17;
                f8731 = i % 128;
            }
            int i5 = i % 2;
            sb3.append(intern);
            String r13 = af.m1227(af.m1226(sb.toString()));
            String obj = sb2.toString();
            StringBuilder sb5 = new StringBuilder(r13);
            sb5.setCharAt(17, Integer.toString(Integer.parseInt(obj, 2), 16).charAt(0));
            String obj2 = sb5.toString();
            String obj3 = sb3.toString();
            StringBuilder sb6 = new StringBuilder(obj2);
            sb6.setCharAt(27, Integer.toString(Integer.parseInt(obj3, 2), 16).charAt(0));
            return m1262(sb6.toString(), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return m1255(32, 54, 57410).intern();
        }
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    private static String m1262(String str, Long l) {
        int i = f8728 + 19;
        f8731 = i % 128;
        int i2 = i % 2;
        if (str == null || l == null || str.length() != 32) {
            return m1255(32, 54, 57410).intern();
        }
        StringBuilder sb = new StringBuilder(str);
        String obj = l.toString();
        long j = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < obj.length(); i4++) {
            i3 += Character.getNumericValue(obj.charAt(i4));
        }
        String hexString = Integer.toHexString(i3);
        sb.replace(7, hexString.length() + 7, hexString);
        int i5 = f8728 + 83;
        f8731 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < sb.length()) {
            int i8 = f8731 + 33;
            f8728 = i8 % 128;
            int i9 = i8 % 2;
            j += (long) Character.getNumericValue(sb.charAt(i7));
            i7++;
            int i10 = f8728 + 63;
            f8731 = i10 % 128;
            int i11 = i10 % 2;
        }
        while (true) {
            if (j <= 100) {
                break;
            }
            j %= 100;
            int i12 = f8731 + 1;
            f8728 = i12 % 128;
            int i13 = i12 % 2;
        }
        sb.insert(23, (int) j);
        if ((j >= 10 ? ';' : '5') != ';') {
            sb.insert(23, m1255(1, 35, 0).intern());
        }
        return sb.toString();
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private static boolean m1260(String str) {
        int i = f8731 + 25;
        f8728 = i % 128;
        int i2 = i % 2;
        try {
            Class.forName(str);
            int i3 = f8728 + 23;
            f8731 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    private static String m1258(String str) {
        boolean z = false;
        if ((str.contains(m1255(1, 169, 0).intern()) ? 1 : 'N') != 'N') {
            String[] split = str.split(m1255(2, 170, 53655).intern());
            int length = split.length;
            StringBuilder sb = new StringBuilder();
            int i = length - 1;
            sb.append(split[i]);
            sb.append(m1255(1, 169, 0).intern());
            int i2 = 1;
            while (true) {
                if (!(i2 >= i)) {
                    int i3 = f8728 + 101;
                    f8731 = i3 % 128;
                    if (i3 % 2 != 0) {
                        sb.append(split[i2]);
                        sb.append(m1255(0, 22494, 0).intern());
                        i2 += 79;
                    } else {
                        sb.append(split[i2]);
                        sb.append(m1255(1, 169, 0).intern());
                        i2++;
                    }
                } else {
                    sb.append(split[0]);
                    return sb.toString();
                }
            }
        } else {
            int i4 = f8731 + 99;
            f8728 = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        }
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    private static String m1261(Context context) {
        int i = f8728 + 7;
        f8731 = i % 128;
        int i2 = i % 2;
        String str = null;
        if ((!System.getProperties().containsKey(m1255(14, 172, 9344).intern()) ? 'a' : '?') != 'a') {
            try {
                Matcher matcher = Pattern.compile(m1255(10, PsExtractor.AUDIO_STREAM, 14387).intern()).matcher(context.getCacheDir().getPath().replace(m1255(6, 186, 53194).intern(), ""));
                if ((!matcher.find() ? 'G' : 'C') == 'C') {
                    int i3 = f8728 + 93;
                    f8731 = i3 % 128;
                    str = i3 % 2 != 0 ? matcher.group(0) : matcher.group(1);
                }
                int i4 = f8731 + 19;
                f8728 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                if (am.f8691 == null) {
                    am.f8691 = new am();
                }
                am amVar = am.f8691;
                String intern = m1255(17, 202, 5760).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m1255(41, 219, 0).intern());
                sb.append(e);
                amVar.m1247((String) null, intern, sb.toString());
            }
        }
        return str;
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private static String m1259(Context context) {
        int i = f8728 + 15;
        f8731 = i % 128;
        int i2 = i % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i3 = f8728 + 115;
            f8731 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = f8731 + 85;
            f8728 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    private static String m1257(Context context, String str) {
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(m1255(24, 260, 0).intern(), new Class[]{Integer.TYPE}).invoke(context.getPackageManager(), new Object[]{0})).iterator();
            int i = f8731 + 121;
            while (true) {
                f8728 = i % 128;
                int i2 = i % 2;
                if (!it.hasNext()) {
                    break;
                }
                int i3 = f8731 + 117;
                f8728 = i3 % 128;
                int i4 = i3 % 2;
                if ((!((ApplicationInfo) it.next()).packageName.equals(str) ? '-' : 11) != '-') {
                    return Boolean.TRUE.toString();
                }
                i = f8731 + 3;
            }
        } catch (IllegalAccessException e) {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am amVar = am.f8691;
            String intern = m1255(24, 284, 0).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m1255(47, SecExceptionCode.SEC_ERROR_STA_NO_MEMORY, 45815).intern());
            sb.append(e);
            amVar.m1247((String) null, intern, sb.toString());
        } catch (NoSuchMethodException e2) {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am amVar2 = am.f8691;
            String intern2 = m1255(24, 284, 0).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1255(47, SecExceptionCode.SEC_ERROR_STA_NO_MEMORY, 45815).intern());
            sb2.append(e2);
            amVar2.m1247((String) null, intern2, sb2.toString());
        } catch (InvocationTargetException e3) {
            if (am.f8691 == null) {
                am.f8691 = new am();
                int i5 = f8731 + 41;
                f8728 = i5 % 128;
                int i6 = i5 % 2;
            }
            am amVar3 = am.f8691;
            String intern3 = m1255(24, 284, 0).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m1255(47, SecExceptionCode.SEC_ERROR_STA_NO_MEMORY, 45815).intern());
            sb3.append(e3);
            amVar3.m1247((String) null, intern3, sb3.toString());
        }
        return Boolean.FALSE.toString();
    }

    public static class b extends HashMap<String, Object> {

        /* renamed from: ʻ  reason: contains not printable characters */
        private static int f8732 = 1;

        /* renamed from: ˊ  reason: contains not printable characters */
        private static long f8733 = -6420536995876584538L;

        /* renamed from: ˋ  reason: contains not printable characters */
        private static char[] f8734 = {'a', 50112, 34579, 19078, 3825, 53843, 38273, 23033, 7492, 57527, 42001, 26706, 28641, 44119, 59566, 9503, 24959, 28104, 44655, 60053, 10038, 25420, 49145, 63532, 13384, 24752, 41752, 59377, 43098, 27643, 12057, 58018, 42689, 31334, 15864, 61905, 46441, 18564, 3109, 49260, 33685, 18214, 6977, 57064, 37435, 22042, 27131, 11531, 57506, 42114, 30739, 15283, 65493, 45866, 30359, 2775, 52832, 33178, 17768, 6467, 56452, 36921, 21589, 6142, 11024, 61099, 41719, 26136, 14838, 64906, 'k', 50115, 34602, 19147, 3745, 53767, 38365, 17529, 34768, 49953, 3742, 19187, 38509, 53658, 7648, 22849, 42154, 57355, 11385, 28598, 43781, 63342, '5', 50056, 34685, 19164, 3753, 6960, 55497, 39986, 20929, 5551, 'f', 50119, 34597, 19102, 3837, 53850, 38340, 23021, 7509, 57528, 42009, 26704, 11177, 61210, 45949, 30420, 14855, 65062, 49607, 34103, 18590, 3262, 53298, 37771, 22524, 6979, 57017, 41634, 26207, 10663, 60672, 45426, 29920, 14339, 64628, 49105, 33597, 18062, 2768, 52771, 37279, 22008, 6406, 56514, 'b', 50119, 34606, 19095, 3833, 53851, 38356, 22975, 7428, 57574, 42008, 26651, 11257, 61192, 45862, 30346, 14929, 65086, 'a', 50120, 34600, 19072, 3831, 53847, 38272, 22948, 7513, 57528, 41992, 26695, 11174, 61210, 45882, 30427, 14851, 65138, 49605, 34109, 18582, 3248, 53254, 37803, 22468, 7010, 56985, 41680, 26225, 10641, 60727, 45394, 29825, 14376, 64587, 49143, 33564, 606, 49641, 34059, 18600, 3287, 53350, 38831, 23508, 8047, 57998, 42547, 'x', 50078, 34682, 's', 50115, 34594, 19073, 3831, 53836, 'b', 50882, 1338, 26609, 41986, Typography.amp, 50134, 7521, 56977, 39482, 22469, 5102, 53000, 34963, 17596, 'G', 64995, 47433, 30022, 13991, 61981, 44658, 27600};

        /* renamed from: ॱ  reason: contains not printable characters */
        private static int f8735;

        /* renamed from: ˎ  reason: contains not printable characters */
        private final Map<String, Object> f8736;

        /* renamed from: ˏ  reason: contains not printable characters */
        private final Context f8737;

        public b(Map<String, Object> map, Context context) {
            this.f8736 = map;
            this.f8737 = context;
            put(m1263(), m1265());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
            if ((r6 == null) != false) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
            if ((r6 != null ? (char) 25 : 27) != 27) goto L_0x00b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
            r6 = r8;
         */
        /* renamed from: ˎ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.StringBuilder m1266(@androidx.annotation.NonNull java.lang.String... r11) throws java.lang.Exception {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r2 = 0
            L_0x0007:
                r3 = 3
                r4 = 1
                if (r2 < r3) goto L_0x000d
                r5 = 1
                goto L_0x000e
            L_0x000d:
                r5 = 0
            L_0x000e:
                if (r5 == r4) goto L_0x003c
                int r3 = f8732
                int r3 = r3 + 113
                int r4 = r3 % 128
                f8735 = r4
                int r3 = r3 % 2
                if (r3 == 0) goto L_0x002c
                r3 = r11[r2]
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 67
                goto L_0x0007
            L_0x002c:
                r3 = r11[r2]
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto L_0x0007
            L_0x003c:
                java.util.Collections.sort(r0)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r5 = 0
            L_0x004f:
                if (r5 < r0) goto L_0x0052
                return r2
            L_0x0052:
                int r6 = f8735
                int r6 = r6 + 53
                int r7 = r6 % 128
                f8732 = r7
                int r6 = r6 % 2
                r6 = 0
                r7 = 0
            L_0x005e:
                r8 = 58
                if (r7 < r3) goto L_0x0065
                r9 = 92
                goto L_0x0067
            L_0x0065:
                r9 = 58
            L_0x0067:
                if (r9 == r8) goto L_0x0081
                int r6 = r6.intValue()
                java.lang.String r6 = java.lang.Integer.toHexString(r6)
                r2.append(r6)
                int r5 = r5 + 1
                int r6 = f8735
                int r6 = r6 + 81
                int r7 = r6 % 128
                f8732 = r7
                int r6 = r6 % 2
                goto L_0x004f
            L_0x0081:
                int r8 = f8735
                int r8 = r8 + 103
                int r9 = r8 % 128
                f8732 = r9
                int r8 = r8 % 2
                if (r8 == 0) goto L_0x008f
                r8 = 0
                goto L_0x0090
            L_0x008f:
                r8 = 1
            L_0x0090:
                if (r8 == r4) goto L_0x00a0
                r8 = r11[r7]
                char r8 = r8.charAt(r5)
                if (r6 == 0) goto L_0x009c
                r9 = 0
                goto L_0x009d
            L_0x009c:
                r9 = 1
            L_0x009d:
                if (r9 == 0) goto L_0x00b1
                goto L_0x00b7
            L_0x00a0:
                r8 = r11[r7]
                char r8 = r8.charAt(r5)
                r9 = 27
                if (r6 == 0) goto L_0x00ad
                r10 = 25
                goto L_0x00af
            L_0x00ad:
                r10 = 27
            L_0x00af:
                if (r10 == r9) goto L_0x00b7
            L_0x00b1:
                int r6 = r6.intValue()
                r6 = r6 ^ r8
                goto L_0x00b8
            L_0x00b7:
                r6 = r8
            L_0x00b8:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                int r7 = r7 + 1
                goto L_0x005e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.b.m1266(java.lang.String[]):java.lang.StringBuilder");
        }

        @NonNull
        /* renamed from: ˊ  reason: contains not printable characters */
        private String m1263() {
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.f8736.get(m1264(12, 0, 0).intern()).toString();
                String obj2 = this.f8736.get(m1264(5, 12, 28547).intern()).toString();
                if ((obj2 != null ? 'R' : '1') != 'R') {
                    int i = f8735 + 57;
                    f8732 = i % 128;
                    obj2 = ((i % 2 != 0 ? (char) 19 : 20) != 19 ? m1264(24, 51, 28038) : m1264(8, 17, 28038)).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder r3 = m1266(num, obj2, sb.toString());
                int length = r3.length();
                if (length <= 4) {
                    while (length < 4) {
                        length++;
                        r3.append('1');
                    }
                } else {
                    int i2 = f8735 + 1;
                    f8732 = i2 % 128;
                    if (i2 % 2 == 0) {
                    }
                    r3.delete(4, length);
                }
                r3.insert(0, m1264(3, 25, 24795).intern());
                return r3.toString();
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1264(42, 28, 43068).intern());
                sb2.append(e2);
                AFLogger.afRDLog(sb2.toString());
                return m1264(7, 70, 0).intern();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0125, code lost:
            if (r5.contains(m1264(3, com.alibaba.wireless.security.SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE, 0).intern()) != false) goto L_0x0127;
         */
        /* renamed from: ˋ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String m1265() {
            /*
                r12 = this;
                java.lang.String r0 = ""
                r1 = 16
                r2 = 102(0x66, float:1.43E-43)
                r3 = 44
                r4 = 0
                java.util.Map<java.lang.String, java.lang.Object> r5 = r12.f8736     // Catch:{ Exception -> 0x007a }
                r6 = 12
                java.lang.String r6 = m1264(r6, r4, r4)     // Catch:{ Exception -> 0x007a }
                java.lang.String r6 = r6.intern()     // Catch:{ Exception -> 0x007a }
                java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x007a }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x007a }
                java.util.Map<java.lang.String, java.lang.Object> r6 = r12.f8736     // Catch:{ Exception -> 0x007a }
                r7 = 15
                r8 = 77
                r9 = 17439(0x441f, float:2.4437E-41)
                java.lang.String r7 = m1264(r7, r8, r9)     // Catch:{ Exception -> 0x007a }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x007a }
                java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x007a }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x007a }
                r7 = 92
                r8 = 5
                java.lang.String r7 = m1264(r8, r7, r4)     // Catch:{ Exception -> 0x007a }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x007a }
                r9 = 97
                r10 = 6941(0x1b1d, float:9.726E-42)
                java.lang.String r8 = m1264(r8, r9, r10)     // Catch:{ Exception -> 0x007a }
                java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x007a }
                java.lang.String r7 = r7.replaceAll(r8, r0)     // Catch:{ Exception -> 0x007a }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a }
                r8.<init>()     // Catch:{ Exception -> 0x007a }
                r8.append(r5)     // Catch:{ Exception -> 0x007a }
                r8.append(r6)     // Catch:{ Exception -> 0x007a }
                r8.append(r7)     // Catch:{ Exception -> 0x007a }
                java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x007a }
                java.lang.String r5 = com.appsflyer.internal.af.m1226(r5)     // Catch:{ Exception -> 0x007a }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a }
                r6.<init>()     // Catch:{ Exception -> 0x007a }
                r6.append(r0)     // Catch:{ Exception -> 0x007a }
                java.lang.String r5 = r5.substring(r4, r1)     // Catch:{ Exception -> 0x007a }
                r6.append(r5)     // Catch:{ Exception -> 0x007a }
                java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x007a }
                goto L_0x00b0
            L_0x007a:
                r5 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = m1264(r3, r2, r4)
                java.lang.String r7 = r7.intern()
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.appsflyer.AFLogger.afRDLog(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                r0 = 18
                r6 = 146(0x92, float:2.05E-43)
                java.lang.String r0 = m1264(r0, r6, r4)
                java.lang.String r0 = r0.intern()
                r5.append(r0)
                java.lang.String r0 = r5.toString()
            L_0x00b0:
                android.content.Context r5 = r12.f8737     // Catch:{ Exception -> 0x01b6 }
                r6 = 0
                android.content.IntentFilter r7 = new android.content.IntentFilter     // Catch:{ Exception -> 0x01b6 }
                r8 = 37
                r9 = 164(0xa4, float:2.3E-43)
                java.lang.String r8 = m1264(r8, r9, r4)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x01b6 }
                r7.<init>(r8)     // Catch:{ Exception -> 0x01b6 }
                android.content.Intent r5 = r5.registerReceiver(r6, r7)     // Catch:{ Exception -> 0x01b6 }
                r6 = -2700(0xfffffffffffff574, float:NaN)
                r7 = 2
                if (r5 == 0) goto L_0x00e8
                r8 = 11
                r9 = 201(0xc9, float:2.82E-43)
                r10 = 554(0x22a, float:7.76E-43)
                java.lang.String r8 = m1264(r8, r9, r10)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x01b6 }
                int r6 = r5.getIntExtra(r8, r6)     // Catch:{ Exception -> 0x01b6 }
                int r5 = f8735
                int r5 = r5 + 25
                int r8 = r5 % 128
                f8732 = r8
                int r5 = r5 % r7
            L_0x00e8:
                android.content.Context r5 = r12.f8737     // Catch:{ Exception -> 0x01b6 }
                android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r5 = r5.nativeLibraryDir     // Catch:{ Exception -> 0x01b6 }
                r8 = 1
                if (r5 != 0) goto L_0x00f4
                goto L_0x0129
            L_0x00f4:
                int r9 = f8735
                int r9 = r9 + 53
                int r10 = r9 % 128
                f8732 = r10
                int r9 = r9 % r7
                if (r9 == 0) goto L_0x0101
                r9 = 1
                goto L_0x0102
            L_0x0101:
                r9 = 0
            L_0x0102:
                if (r9 == r8) goto L_0x0116
                r9 = 4
                r10 = 15566(0x3cce, float:2.1813E-41)
                java.lang.String r9 = m1264(r9, r10, r4)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r9 = r9.intern()     // Catch:{ Exception -> 0x01b6 }
                boolean r5 = r5.contains(r9)     // Catch:{ Exception -> 0x01b6 }
                if (r5 != 0) goto L_0x0127
                goto L_0x0129
            L_0x0116:
                r9 = 3
                r10 = 212(0xd4, float:2.97E-43)
                java.lang.String r9 = m1264(r9, r10, r4)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r9 = r9.intern()     // Catch:{ Exception -> 0x01b6 }
                boolean r5 = r5.contains(r9)     // Catch:{ Exception -> 0x01b6 }
                if (r5 == 0) goto L_0x0129
            L_0x0127:
                r5 = 1
                goto L_0x012a
            L_0x0129:
                r5 = 0
            L_0x012a:
                android.content.Context r9 = r12.f8737     // Catch:{ Exception -> 0x01b6 }
                r10 = 6
                r11 = 215(0xd7, float:3.01E-43)
                java.lang.String r10 = m1264(r10, r11, r4)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r10 = r10.intern()     // Catch:{ Exception -> 0x01b6 }
                java.lang.Object r9 = r9.getSystemService(r10)     // Catch:{ Exception -> 0x01b6 }
                android.hardware.SensorManager r9 = (android.hardware.SensorManager) r9     // Catch:{ Exception -> 0x01b6 }
                r10 = -1
                java.util.List r9 = r9.getSensorList(r10)     // Catch:{ Exception -> 0x01b6 }
                int r9 = r9.size()     // Catch:{ Exception -> 0x01b6 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b6 }
                r10.<init>()     // Catch:{ Exception -> 0x01b6 }
                r11 = 221(0xdd, float:3.1E-43)
                java.lang.String r8 = m1264(r8, r11, r4)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x01b6 }
                r10.append(r8)     // Catch:{ Exception -> 0x01b6 }
                r10.append(r6)     // Catch:{ Exception -> 0x01b6 }
                r6 = 222(0xde, float:3.11E-43)
                r8 = 50916(0xc6e4, float:7.1349E-41)
                java.lang.String r6 = m1264(r7, r6, r8)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r6 = r6.intern()     // Catch:{ Exception -> 0x01b6 }
                r10.append(r6)     // Catch:{ Exception -> 0x01b6 }
                r10.append(r5)     // Catch:{ Exception -> 0x01b6 }
                r5 = 224(0xe0, float:3.14E-43)
                r6 = 26583(0x67d7, float:3.7251E-41)
                java.lang.String r5 = m1264(r7, r5, r6)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x01b6 }
                r10.append(r5)     // Catch:{ Exception -> 0x01b6 }
                r10.append(r9)     // Catch:{ Exception -> 0x01b6 }
                r5 = 226(0xe2, float:3.17E-43)
                java.lang.String r5 = m1264(r7, r5, r4)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x01b6 }
                r10.append(r5)     // Catch:{ Exception -> 0x01b6 }
                java.util.Map<java.lang.String, java.lang.Object> r5 = r12.f8736     // Catch:{ Exception -> 0x01b6 }
                int r5 = r5.size()     // Catch:{ Exception -> 0x01b6 }
                r10.append(r5)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x01b6 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b6 }
                r6.<init>()     // Catch:{ Exception -> 0x01b6 }
                r6.append(r0)     // Catch:{ Exception -> 0x01b6 }
                byte[] r5 = r5.getBytes()     // Catch:{ Exception -> 0x01b6 }
                byte[] r5 = com.appsflyer.internal.d.b.e.m1267(r5)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r5 = com.appsflyer.internal.d.b.e.m1269((byte[]) r5)     // Catch:{ Exception -> 0x01b6 }
                r6.append(r5)     // Catch:{ Exception -> 0x01b6 }
                java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x01b6 }
                goto L_0x01ec
            L_0x01b6:
                r5 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = m1264(r3, r2, r4)
                java.lang.String r2 = r2.intern()
                r6.append(r2)
                r6.append(r5)
                java.lang.String r2 = r6.toString()
                com.appsflyer.AFLogger.afRDLog(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r0 = 228(0xe4, float:3.2E-43)
                r3 = 7431(0x1d07, float:1.0413E-41)
                java.lang.String r0 = m1264(r1, r0, r3)
                java.lang.String r0 = r0.intern()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            L_0x01ec:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.b.m1265():java.lang.String");
        }

        public static class e {

            /* renamed from: ˋ  reason: contains not printable characters */
            public String f8738;

            /* renamed from: ˎ  reason: contains not printable characters */
            public long f8739;

            /* renamed from: ॱ  reason: contains not printable characters */
            private final Object f8740;

            e() {
            }

            /* renamed from: ˎ  reason: contains not printable characters */
            static byte[] m1267(@NonNull byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            @NonNull
            /* renamed from: ॱ  reason: contains not printable characters */
            static String m1269(@NonNull byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte hexString : bArr) {
                    String hexString2 = Integer.toHexString(hexString);
                    if (hexString2.length() == 1) {
                        hexString2 = "0".concat(String.valueOf(hexString2));
                    }
                    sb.append(hexString2);
                }
                return sb.toString();
            }

            public e(long j, String str) {
                this.f8740 = new Object();
                this.f8739 = 0;
                this.f8738 = "";
                this.f8739 = j;
                this.f8738 = str;
            }

            @NonNull
            /* renamed from: ॱ  reason: contains not printable characters */
            public static e m1268(String str) {
                if (str == null) {
                    return new e(0, "");
                }
                String[] split = str.split(",");
                return split.length < 2 ? new e(0, "") : new e(Long.parseLong(split[0]), split[1]);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
                return false;
             */
            /* renamed from: ˊ  reason: contains not printable characters */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean m1270(long r9, java.lang.String r11) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.f8740
                    monitor-enter(r0)
                    r1 = 0
                    if (r11 == 0) goto L_0x0027
                    java.lang.String r2 = r8.f8738     // Catch:{ all -> 0x0024 }
                    boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0024 }
                    if (r2 != 0) goto L_0x0027
                    long r2 = r8.f8739     // Catch:{ all -> 0x0024 }
                    long r2 = r9 - r2
                    r4 = 2000(0x7d0, double:9.88E-321)
                    r6 = 1
                    int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x001b
                    r2 = 1
                    goto L_0x001c
                L_0x001b:
                    r2 = 0
                L_0x001c:
                    if (r2 == 0) goto L_0x0027
                    r8.f8739 = r9     // Catch:{ all -> 0x0024 }
                    r8.f8738 = r11     // Catch:{ all -> 0x0024 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                    return r6
                L_0x0024:
                    r9 = move-exception
                    monitor-exit(r0)
                    throw r9
                L_0x0027:
                    monitor-exit(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.b.e.m1270(long, java.lang.String):boolean");
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f8739);
                sb.append(",");
                sb.append(this.f8738);
                return sb.toString();
            }
        }

        /* renamed from: ˊ  reason: contains not printable characters */
        private static String m1264(int i, int i2, char c) {
            int i3;
            char[] cArr;
            int i4 = f8732 + 77;
            f8735 = i4 % 128;
            if ((i4 % 2 == 0 ? 'S' : Typography.greater) != '>') {
                cArr = new char[i];
                i3 = 0;
            } else {
                cArr = new char[i];
                i3 = 1;
            }
            int i5 = f8735 + 19;
            f8732 = i5 % 128;
            int i6 = i5 % 2;
            while (true) {
                if ((i3 >= i ? ')' : 'A') != 'A') {
                    return new String(cArr);
                }
                int i7 = f8732 + 37;
                f8735 = i7 % 128;
                int i8 = i7 % 2;
                cArr[i3] = (char) ((int) ((((long) f8734[i2 + i3]) ^ (((long) i3) * f8733)) ^ ((long) c)));
                i3++;
            }
        }
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    private static String m1255(int i, int i2, char c) {
        char[] cArr = new char[i];
        int i3 = 0;
        while (true) {
            if ((i3 >= i ? 'U' : '9') != 'U') {
                int i4 = f8731 + 97;
                f8728 = i4 % 128;
                int i5 = i4 % 2;
                cArr[i3] = (char) ((int) ((((long) f8730[i2 + i3]) ^ (((long) i3) * f8729)) ^ ((long) c)));
                i3++;
            } else {
                String str = new String(cArr);
                int i6 = f8731 + 73;
                f8728 = i6 % 128;
                int i7 = i6 % 2;
                return str;
            }
        }
    }
}
