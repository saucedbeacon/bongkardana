package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import o.onActivityPreStopped;
import o.setPopDirection;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class Util {
    private static final int[] CRC32_BYTES_MSBF = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    public static final String DEVICE = Build.DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final Pattern ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final String MANUFACTURER = Build.MANUFACTURER;
    public static final String MODEL = Build.MODEL;
    public static final int SDK_INT = Build.VERSION.SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    private static final Pattern XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static char getMin = '\u0000';
    private static char[] length = null;
    private static int setMax = 0;
    private static int setMin = 1;

    static void setMax() {
        getMin = 3;
        length = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static {
        setMax();
        StringBuilder sb = new StringBuilder();
        sb.append(DEVICE);
        sb.append(", ");
        sb.append(MODEL);
        sb.append(", ");
        sb.append(MANUFACTURER);
        sb.append(", ");
        sb.append(SDK_INT);
        DEVICE_DEBUG_INFO = sb.toString();
        int i = setMax + 67;
        setMin = i % 128;
        if ((i % 2 == 0 ? (char) 17 : 6) != 6) {
            int i2 = 28 / 0;
        }
    }

    private Util() {
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if ((read != -1 ? 15 : 'Y') != 'Y') {
                try {
                    int i = setMax + 37;
                    setMin = i % 128;
                    if (i % 2 != 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream.write(bArr, 1, read);
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i2 = setMax + 3;
                setMin = i2 % 128;
                int i3 = i2 % 2;
                return byteArray;
            }
        }
    }

    public static ComponentName startForegroundService(Context context, Intent intent) {
        int i = setMin + 25;
        setMax = i % 128;
        int i2 = i % 2;
        if ((SDK_INT >= 26 ? 12 : 'Y') != 12) {
            return context.startService(intent);
        }
        int i3 = setMax + 93;
        setMin = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return context.startForegroundService(intent);
        }
        ComponentName startForegroundService = context.startForegroundService(intent);
        Object obj = null;
        super.hashCode();
        return startForegroundService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r6 != 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        if ((r5.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 ? 17 : '8') != 17) goto L_0x0057;
     */
    @android.annotation.TargetApi(23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity r5, android.net.Uri... r6) {
        /*
            int r0 = SDK_INT
            r1 = 23
            r2 = 4
            if (r0 >= r1) goto L_0x0009
            r0 = 4
            goto L_0x000b
        L_0x0009:
            r0 = 34
        L_0x000b:
            r1 = 1
            r3 = 0
            if (r0 == r2) goto L_0x0058
            int r0 = r6.length
            r2 = 0
        L_0x0011:
            if (r2 >= r0) goto L_0x0016
            r4 = 28
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            if (r4 == 0) goto L_0x0057
            r4 = r6[r2]
            boolean r4 = isLocalFileUri(r4)
            if (r4 == 0) goto L_0x0054
            int r6 = setMax
            int r6 = r6 + 7
            int r0 = r6 % 128
            setMin = r0
            int r6 = r6 % 2
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r6 != 0) goto L_0x003c
            int r6 = r5.checkSelfPermission(r0)
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x003a }
            if (r6 == 0) goto L_0x0057
            goto L_0x004c
        L_0x003a:
            r5 = move-exception
            throw r5
        L_0x003c:
            int r6 = r5.checkSelfPermission(r0)
            r2 = 17
            if (r6 == 0) goto L_0x0047
            r6 = 17
            goto L_0x0049
        L_0x0047:
            r6 = 56
        L_0x0049:
            if (r6 == r2) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x006f }
            r5.requestPermissions(r6, r3)     // Catch:{ Exception -> 0x006f }
            return r1
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0057:
            return r3
        L_0x0058:
            int r5 = setMin     // Catch:{ Exception -> 0x006f }
            int r5 = r5 + 119
            int r6 = r5 % 128
            setMax = r6     // Catch:{ Exception -> 0x006f }
            int r5 = r5 % 2
            r6 = 92
            if (r5 == 0) goto L_0x0069
            r5 = 92
            goto L_0x006b
        L_0x0069:
            r5 = 12
        L_0x006b:
            if (r5 == r6) goto L_0x006e
            r1 = 0
        L_0x006e:
            return r1
        L_0x006f:
            r5 = move-exception
            goto L_0x0072
        L_0x0071:
            throw r5
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.maybeRequestReadExternalStoragePermission(android.app.Activity, android.net.Uri[]):boolean");
    }

    @TargetApi(24)
    public static boolean checkCleartextTrafficPermitted(Uri... uriArr) {
        Uri uri;
        if (SDK_INT < 24) {
            int i = setMax + 5;
            setMin = i % 128;
            int i2 = i % 2;
            return true;
        }
        int length2 = uriArr.length;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = setMax + 107;
            setMin = i4 % 128;
            if (i4 % 2 == 0) {
                uri = uriArr[i3];
                boolean equals = "http".equals(uri.getScheme());
                Object obj = null;
                super.hashCode();
                if (!equals) {
                    continue;
                    i3++;
                }
            } else {
                uri = uriArr[i3];
                if (!"http".equals(uri.getScheme())) {
                    continue;
                    i3++;
                }
            }
            try {
                if ((!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(uri.getHost()) ? 'R' : ';') == 'R') {
                    return false;
                }
                i3++;
            } catch (Exception e) {
                throw e;
            }
        }
        int i5 = setMin + 47;
        setMax = i5 % 128;
        if ((i5 % 2 != 0 ? 30 : 'C') != 30) {
            return true;
        }
        int i6 = 50 / 0;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if ((!r4) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if ((!r4) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isLocalFileUri(android.net.Uri r4) {
        /*
            java.lang.String r4 = r4.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0038
            int r0 = setMin
            int r0 = r0 + 57
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x001a
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            java.lang.String r3 = "file"
            boolean r4 = r3.equals(r4)
            if (r0 == r2) goto L_0x0030
            r0 = 18
            int r0 = r0 / r1
            if (r4 == 0) goto L_0x002a
            r4 = 0
            goto L_0x002b
        L_0x002a:
            r4 = 1
        L_0x002b:
            if (r4 == 0) goto L_0x0038
            goto L_0x0037
        L_0x002e:
            r4 = move-exception
            throw r4
        L_0x0030:
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0038
        L_0x0037:
            return r1
        L_0x0038:
            int r4 = setMin
            int r4 = r4 + 65
            int r0 = r4 % 128
            setMax = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r2
        L_0x0049:
            r4 = 0
            super.hashCode()     // Catch:{ all -> 0x004e }
            return r2
        L_0x004e:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.isLocalFileUri(android.net.Uri):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if ((r4 == null ? 'A' : 20) != 20) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r4 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return r4.equals(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean areEqual(@androidx.annotation.Nullable java.lang.Object r4, @androidx.annotation.Nullable java.lang.Object r5) {
        /*
            int r0 = setMax
            int r0 = r0 + 119
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x0024
            r0 = 47
            int r0 = r0 / r1
            r0 = 20
            if (r4 != 0) goto L_0x001d
            r3 = 65
            goto L_0x001f
        L_0x001d:
            r3 = 20
        L_0x001f:
            if (r3 == r0) goto L_0x0049
            goto L_0x0026
        L_0x0022:
            r4 = move-exception
            throw r4
        L_0x0024:
            if (r4 != 0) goto L_0x0049
        L_0x0026:
            int r4 = setMax     // Catch:{ Exception -> 0x0047 }
            int r4 = r4 + 69
            int r0 = r4 % 128
            setMin = r0     // Catch:{ Exception -> 0x0047 }
            int r4 = r4 % 2
            r4 = 25
            if (r5 != 0) goto L_0x0037
            r5 = 25
            goto L_0x0039
        L_0x0037:
            r5 = 44
        L_0x0039:
            if (r5 == r4) goto L_0x0046
            int r4 = setMin
            int r4 = r4 + 13
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            return r1
        L_0x0046:
            return r2
        L_0x0047:
            r4 = move-exception
            throw r4
        L_0x0049:
            boolean r4 = r4.equals(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.areEqual(java.lang.Object, java.lang.Object):boolean");
    }

    public static boolean contains(Object[] objArr, Object obj) {
        int i = setMax + 119;
        setMin = i % 128;
        if (i % 2 == 0) {
        }
        int length2 = objArr.length;
        int i2 = 0;
        while (i2 < length2) {
            try {
                int i3 = setMin + 13;
                setMax = i3 % 128;
                int i4 = i3 % 2;
                if ((areEqual(objArr[i2], obj) ? 21 : 'O') != 21) {
                    i2++;
                    int i5 = setMax + 105;
                    setMin = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    try {
                        int i7 = setMin + 93;
                        setMax = i7 % 128;
                        int i8 = i7 % 2;
                        return true;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    public static <T> void removeRange(List<T> list, int i, int i2) {
        if (i >= 0) {
            if ((i2 <= list.size() ? 'L' : 'K') != 'K' && i <= i2) {
                if (i != i2) {
                    int i3 = setMax + 51;
                    setMin = i3 % 128;
                    if ((i3 % 2 == 0 ? 'K' : 16) != 'K') {
                        list.subList(i, i2).clear();
                    } else {
                        try {
                            list.subList(i, i2).clear();
                            Object[] objArr = null;
                            int length2 = objArr.length;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    int i4 = setMin + 19;
                    setMax = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"#1"})
    public static <T> T castNonNull(@Nullable T t) {
        int i = setMin + 99;
        setMax = i % 128;
        int i2 = i % 2;
        int i3 = setMin + 63;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return t;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        try {
            int i = setMin + 43;
            try {
                setMax = i % 128;
                if ((i % 2 != 0 ? 14 : '1') != '1') {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
                return tArr;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i) {
        int i2 = setMax + 91;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        if (!(i > tArr.length)) {
            try {
                int i4 = setMin + 9;
                setMax = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } catch (Exception e) {
                throw e;
            }
        }
        Assertions.checkArgument(z);
        return Arrays.copyOf(tArr, i);
    }

    public static Handler createHandler(Handler.Callback callback) {
        Handler handler;
        try {
            int i = setMax + 79;
            try {
                setMin = i % 128;
                if ((i % 2 == 0 ? (char) 18 : 10) != 10) {
                    handler = createHandler(getLooper(), callback);
                    Object[] objArr = null;
                    int length2 = objArr.length;
                } else {
                    handler = createHandler(getLooper(), callback);
                }
                int i2 = setMax + 107;
                setMin = i2 % 128;
                if ((i2 % 2 == 0 ? '^' : 'K') != '^') {
                    return handler;
                }
                int i3 = 50 / 0;
                return handler;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static Handler createHandler(Looper looper, Handler.Callback callback) {
        Handler handler = new Handler(looper, callback);
        int i = setMax + 19;
        setMin = i % 128;
        if (!(i % 2 == 0)) {
            return handler;
        }
        int i2 = 79 / 0;
        return handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if ((r0 != null ? 18 : 'b') != 'b') goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if ((r0 != null ? 'E' : '%') != 'E') goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r1 = setMax + 23;
        setMin = r1 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if ((r1 % 2) != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Looper getLooper() {
        /*
            int r0 = setMax
            int r0 = r0 + 45
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 7
            if (r0 != 0) goto L_0x000f
            r0 = 7
            goto L_0x0011
        L_0x000f:
            r0 = 61
        L_0x0011:
            r2 = 0
            if (r0 == r1) goto L_0x0024
            android.os.Looper r0 = android.os.Looper.myLooper()
            r1 = 98
            if (r0 == 0) goto L_0x001f
            r3 = 18
            goto L_0x0021
        L_0x001f:
            r3 = 98
        L_0x0021:
            if (r3 == r1) goto L_0x0036
            goto L_0x003b
        L_0x0024:
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x004e }
            super.hashCode()     // Catch:{ all -> 0x004c }
            r1 = 69
            if (r0 == 0) goto L_0x0032
            r3 = 69
            goto L_0x0034
        L_0x0032:
            r3 = 37
        L_0x0034:
            if (r3 == r1) goto L_0x003b
        L_0x0036:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            return r0
        L_0x003b:
            int r1 = setMax
            int r1 = r1 + 23
            int r3 = r1 % 128
            setMin = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x004b
            int r1 = r2.length     // Catch:{ all -> 0x0049 }
            return r0
        L_0x0049:
            r0 = move-exception
            throw r0
        L_0x004b:
            return r0
        L_0x004c:
            r0 = move-exception
            throw r0
        L_0x004e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getLooper():android.os.Looper");
    }

    public static /* synthetic */ Thread lambda$newSingleThreadExecutor$0(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        int i = setMax + 89;
        setMin = i % 128;
        int i2 = i % 2;
        return thread;
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new setPopDirection(str));
        int i = setMin + 119;
        setMax = i % 128;
        if (i % 2 == 0) {
            return newSingleThreadExecutor;
        }
        Object obj = null;
        super.hashCode();
        return newSingleThreadExecutor;
    }

    public static void closeQuietly(DataSource dataSource) {
        try {
            int i = setMax + 13;
            setMin = i % 128;
            int i2 = i % 2;
            if ((dataSource != null ? '5' : Typography.amp) == '5') {
                int i3 = setMax + 53;
                setMin = i3 % 128;
                if ((i3 % 2 == 0 ? 22 : '8') != 22) {
                    try {
                        dataSource.close();
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    dataSource.close();
                    int i4 = 43 / 0;
                }
                int i5 = setMax + 91;
                setMin = i5 % 128;
                int i6 = i5 % 2;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if ((closeable != null ? '+' : 'L') != 'L') {
            try {
                closeable.close();
                int i = setMax + 109;
                setMin = i % 128;
                int i2 = i % 2;
            } catch (IOException unused) {
                return;
            }
        }
        int i3 = setMax + 99;
        setMin = i3 % 128;
        if (!(i3 % 2 != 0)) {
            Object obj = null;
            super.hashCode();
        }
    }

    public static boolean readBoolean(Parcel parcel) {
        int i = setMin + 85;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            if (parcel.readInt() == 0) {
                return false;
            }
            int i3 = setMin + 49;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        try {
            int i = setMax + 61;
            try {
                setMin = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                if (!(!z)) {
                    int i4 = setMax + 31;
                    setMin = i4 % 128;
                    if ((i4 % 2 == 0 ? '0' : 'B') != '0') {
                        i3 = 1;
                    }
                }
                parcel.writeInt(i3);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r1 != true) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return new java.util.Locale(r4).getISO3Language();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        return toLowerInvariant(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 != false) goto L_0x0034;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String normalizeLanguageCode(@androidx.annotation.Nullable java.lang.String r4) {
        /*
            int r0 = setMax
            int r0 = r0 + 37
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0019
            int r0 = r2.length     // Catch:{ all -> 0x0017 }
            if (r4 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 == 0) goto L_0x001f
            goto L_0x0034
        L_0x0017:
            r4 = move-exception
            throw r4
        L_0x0019:
            if (r4 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            if (r1 == r3) goto L_0x0034
        L_0x001f:
            int r4 = setMin
            int r4 = r4 + 19
            int r0 = r4 % 128
            setMax = r0
            int r4 = r4 % 2
            int r4 = setMin
            int r4 = r4 + 115
            int r0 = r4 % 128
            setMax = r0
            int r4 = r4 % 2
            return r2
        L_0x0034:
            java.util.Locale r0 = new java.util.Locale     // Catch:{ MissingResourceException -> 0x003e }
            r0.<init>(r4)     // Catch:{ MissingResourceException -> 0x003e }
            java.lang.String r4 = r0.getISO3Language()     // Catch:{ MissingResourceException -> 0x003e }
            return r4
        L_0x003e:
            java.lang.String r4 = toLowerInvariant(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.normalizeLanguageCode(java.lang.String):java.lang.String");
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        String str = new String(bArr, Charset.forName(getMax(new char[]{1, 2, 0, 5, 'l'}, TextUtils.lastIndexOf("", '0') + 6, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52)).intern()));
        int i = setMin + 87;
        setMax = i % 128;
        int i2 = i % 2;
        return str;
    }

    public static String fromUtf8Bytes(byte[] bArr, int i, int i2) {
        String str = new String(bArr, i, i2, Charset.forName(getMax(new char[]{1, 2, 0, 5, 'l'}, 134 - PhoneNumberUtils.toaFromString(""), (byte) (52 - TextUtils.getTrimmedLength(""))).intern()));
        int i3 = setMin + 27;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static byte[] getUtf8Bytes(String str) {
        int i = setMax + 115;
        setMin = i % 128;
        int i2 = i % 2;
        byte[] bytes = str.getBytes(Charset.forName(getMax(new char[]{1, 2, 0, 5, 'l'}, Color.rgb(0, 0, 0) + 16777221, (byte) (52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern()));
        int i3 = setMin + 73;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return bytes;
    }

    public static String[] split(String str, String str2) {
        int i = setMax + 121;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            String[] split = str.split(str2, -1);
            int i3 = setMax + 111;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            return split;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String[] splitAtFirst(String str, String str2) {
        try {
            int i = setMin + 57;
            setMax = i % 128;
            boolean z = false;
            String[] split = !(i % 2 != 0) ? str.split(str2, 2) : str.split(str2, 4);
            int i2 = setMin + 49;
            setMax = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (z) {
                return split;
            }
            Object obj = null;
            super.hashCode();
            return split;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean isLinebreak(int i) {
        int i2 = setMax + 21;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        if (i != 10) {
            try {
                int i4 = setMax + 65;
                setMin = i4 % 128;
                int i5 = i4 % 2;
                return !(i != 13);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if ((r2 != null) != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        r0 = setMin + 103;
        setMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String toLowerInvariant(java.lang.String r2) {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x0039 }
            int r0 = r0 + 49
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x0037 }
            int r0 = r0 % 2
            r1 = 25
            if (r0 != 0) goto L_0x0011
            r0 = 25
            goto L_0x0013
        L_0x0011:
            r0 = 16
        L_0x0013:
            if (r0 == r1) goto L_0x0018
            if (r2 != 0) goto L_0x0023
            goto L_0x002a
        L_0x0018:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0020
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r0 == 0) goto L_0x002a
        L_0x0023:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            return r2
        L_0x002a:
            int r0 = setMin
            int r0 = r0 + 103
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            return r2
        L_0x0035:
            r2 = move-exception
            throw r2
        L_0x0037:
            r2 = move-exception
            throw r2
        L_0x0039:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.toLowerInvariant(java.lang.String):java.lang.String");
    }

    public static String toUpperInvariant(String str) {
        int i = setMin + 93;
        setMax = i % 128;
        int i2 = i % 2;
        if (str == null) {
            return str;
        }
        String upperCase = str.toUpperCase(Locale.US);
        try {
            int i3 = setMin + 103;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return upperCase;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String formatInvariant(String str, Object... objArr) {
        try {
            int i = setMax + 47;
            setMin = i % 128;
            if ((i % 2 == 0 ? 'b' : '!') != 'b') {
                return String.format(Locale.US, str, objArr);
            }
            String format = String.format(Locale.US, str, objArr);
            Object obj = null;
            super.hashCode();
            return format;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int ceilDivide(int i, int i2) {
        int i3 = setMax + 21;
        setMin = i3 % 128;
        int i4 = (i3 % 2 == 0 ? '[' : 'Q') != 'Q' ? ((i >>> i2) >>> 1) % i2 : ((i + i2) - 1) / i2;
        int i5 = setMin + 23;
        setMax = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static long ceilDivide(long j, long j2) {
        int i = setMax + 123;
        setMin = i % 128;
        long j3 = !(i % 2 == 0) ? ((j + j2) - 1) / j2 : ((j ^ j2) + 1) & j2;
        try {
            int i2 = setMin + 19;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            return j3;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int constrainValue(int i, int i2, int i3) {
        int i4;
        int i5 = setMax + 83;
        setMin = i5 % 128;
        if (!(i5 % 2 != 0)) {
            i4 = Math.max(i2, Math.min(i, i3));
            Object[] objArr = null;
            int length2 = objArr.length;
        } else {
            i4 = Math.max(i2, Math.min(i, i3));
        }
        try {
            int i6 = setMin + 33;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            return i4;
        } catch (Exception e) {
            throw e;
        }
    }

    public static long constrainValue(long j, long j2, long j3) {
        int i = setMax + 27;
        setMin = i % 128;
        int i2 = i % 2;
        long max = Math.max(j2, Math.min(j, j3));
        try {
            int i3 = setMin + 83;
            setMax = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 3 : 20) == 20) {
                return max;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return max;
        } catch (Exception e) {
            throw e;
        }
    }

    public static float constrainValue(float f, float f2, float f3) {
        try {
            int i = setMax + 27;
            setMin = i % 128;
            boolean z = i % 2 == 0;
            float max = Math.max(f2, Math.min(f, f3));
            if (z) {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
            return max;
        } catch (Exception e) {
            throw e;
        }
    }

    public static long addWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j + j2;
        boolean z = true;
        if (((j ^ j4) & (j2 ^ j4)) >= 0) {
            return j4;
        }
        try {
            int i = setMin + 113;
            setMax = i % 128;
            if (i % 2 == 0) {
                z = false;
            }
            if (z) {
                int i2 = 13 / 0;
            }
            int i3 = setMin + 61;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return j3;
        } catch (Exception e) {
            throw e;
        }
    }

    public static long subtractWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j4) & (j2 ^ j)) < 0) {
            int i = setMin + 95;
            setMax = i % 128;
            if (!(i % 2 != 0)) {
                return j3;
            }
            int i2 = 27 / 0;
            return j3;
        }
        int i3 = setMax + 91;
        setMin = i3 % 128;
        if ((i3 % 2 == 0 ? 31 : 'W') == 'W') {
            return j4;
        }
        int i4 = 23 / 0;
        return j4;
    }

    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
        char c;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (!(binarySearch < 0)) {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                } else if (iArr[binarySearch] != i) {
                    c = 24;
                    continue;
                } else {
                    c = '*';
                    continue;
                }
            } while (c != 24);
            if (z) {
                binarySearch++;
            }
        } else {
            try {
                int i2 = setMax + 19;
                setMin = i2 % 128;
                int i3 = i2 % 2;
                binarySearch = -(binarySearch + 2);
            } catch (Exception e) {
                throw e;
            }
        }
        if ((z2 ? 4 : Typography.quote) == '\"') {
            return binarySearch;
        }
        try {
            int i4 = setMax + 3;
            setMin = i4 % 128;
            return i4 % 2 == 0 ? Math.max(0, binarySearch) : Math.max(0, binarySearch);
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if ((r0 < 0 ? 'P' : '3') != '3') goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r0 < 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r5[r0] == r6) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r8 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r5 = setMin + 49;
        setMax = r5 % 128;
        r5 = r5 % 2;
        r5 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 < 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int binarySearchFloor(long[] r5, long r6, boolean r8, boolean r9) {
        /*
            int r0 = setMax
            int r0 = r0 + 35
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x001b
            int r0 = java.util.Arrays.binarySearch(r5, r6)     // Catch:{ Exception -> 0x0019 }
            r2 = 38
            int r2 = r2 / r1
            if (r0 >= 0) goto L_0x002e
            goto L_0x002a
        L_0x0017:
            r5 = move-exception
            throw r5
        L_0x0019:
            r5 = move-exception
            throw r5
        L_0x001b:
            int r0 = java.util.Arrays.binarySearch(r5, r6)
            r2 = 51
            if (r0 >= 0) goto L_0x0026
            r3 = 80
            goto L_0x0028
        L_0x0026:
            r3 = 51
        L_0x0028:
            if (r3 == r2) goto L_0x002e
        L_0x002a:
            int r0 = r0 + 2
            int r5 = -r0
            goto L_0x0048
        L_0x002e:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0038
            r2 = r5[r0]
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x002e
        L_0x0038:
            if (r8 == 0) goto L_0x0047
            int r5 = setMin
            int r5 = r5 + 49
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            int r5 = r0 + 1
            goto L_0x0048
        L_0x0047:
            r5 = r0
        L_0x0048:
            r6 = 61
            if (r9 == 0) goto L_0x004f
            r7 = 61
            goto L_0x0051
        L_0x004f:
            r7 = 36
        L_0x0051:
            if (r7 == r6) goto L_0x0054
            return r5
        L_0x0054:
            int r5 = java.lang.Math.max(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.binarySearchFloor(long[], long, boolean, boolean):int");
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        boolean z3 = true;
        if (binarySearch < 0) {
            int i2 = setMax + 97;
            setMin = i2 % 128;
            i = -(!(i2 % 2 != 0) ? binarySearch * 3 : binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if ((binarySearch >= 0 ? Typography.amp : 6) == 6) {
                    break;
                }
                int i3 = setMax + 101;
                setMin = i3 % 128;
                int i4 = i3 % 2;
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            if (!z) {
                z3 = false;
            }
            if (z3) {
                i = binarySearch + 1;
                int i5 = setMax + 61;
                setMin = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i = binarySearch;
            }
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int binarySearchCeil(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            r1 = 18
            if (r0 >= 0) goto L_0x000b
            r2 = 53
            goto L_0x000d
        L_0x000b:
            r2 = 18
        L_0x000d:
            if (r2 == r1) goto L_0x002f
            int r5 = setMax
            int r5 = r5 + 115
            int r6 = r5 % 128
            setMin = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x001e
            r5 = r0 & -1
            goto L_0x0020
        L_0x001e:
            r5 = r0 ^ -1
        L_0x0020:
            int r6 = setMin     // Catch:{ Exception -> 0x002d }
            int r6 = r6 + 1
            int r7 = r6 % 128
            setMax = r7     // Catch:{ Exception -> 0x002b }
            int r6 = r6 % 2
            goto L_0x0062
        L_0x002b:
            r4 = move-exception
            throw r4
        L_0x002d:
            r4 = move-exception
            throw r4
        L_0x002f:
            int r0 = r0 + 1
            int r1 = r4.length
            r2 = 94
            if (r0 >= r1) goto L_0x0039
            r1 = 94
            goto L_0x003b
        L_0x0039:
            r1 = 44
        L_0x003b:
            if (r1 == r2) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x002f
        L_0x0044:
            if (r7 == 0) goto L_0x0061
            int r5 = setMin
            int r5 = r5 + 9
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r6 = 65
            if (r5 == 0) goto L_0x0057
            r5 = 65
            goto L_0x0059
        L_0x0057:
            r5 = 81
        L_0x0059:
            if (r5 == r6) goto L_0x005e
            int r5 = r0 + -1
            goto L_0x0062
        L_0x005e:
            int r5 = r0 + 13
            goto L_0x0062
        L_0x0061:
            r5 = r0
        L_0x0062:
            if (r8 == 0) goto L_0x006c
            int r4 = r4.length
            int r4 = r4 + -1
            int r4 = java.lang.Math.min(r4, r5)
            return r4
        L_0x006c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.binarySearchCeil(long[], long, boolean, boolean):int");
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        boolean z3;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            int i2 = setMax + 93;
            setMin = i2 % 128;
            i = !(i2 % 2 == 0) ? binarySearch ^ -1 : binarySearch & -1;
        } else {
            int size = list.size();
            int i3 = setMax + 27;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                } else if (((Comparable) list.get(binarySearch)).compareTo(t) != 0) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
            } while (!z3);
            if (z) {
                try {
                    int i5 = setMax + 53;
                    try {
                        setMin = i5 % 128;
                        i = i5 % 2 == 0 ? binarySearch + 76 : binarySearch - 1;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                i = binarySearch;
            }
        }
        if (!z2) {
            return i;
        }
        int i6 = setMax + 55;
        setMin = i6 % 128;
        if (i6 % 2 != 0) {
        }
        return Math.min(list.size() - 1, i);
    }

    public static int compareLong(long j, long j2) {
        if (j >= j2) {
            if ((j == j2 ? 18 : 'N') != 18) {
                return 1;
            }
            try {
                int i = setMax + 61;
                try {
                    setMin = i % 128;
                    int i2 = i % 2;
                    return 0;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i3 = setMax + 37;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            int i5 = setMax + 33;
            setMin = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
    }

    public static long parseXsDuration(String str) {
        boolean z;
        double d;
        double d2;
        double d3;
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        if (!TextUtils.isEmpty(matcher.group(1))) {
            try {
                int i = setMax + 13;
                setMin = i % 128;
                int i2 = i % 2;
                z = true;
            } catch (Exception e) {
                throw e;
            }
        } else {
            z = false;
        }
        String group = matcher.group(3);
        double d4 = 0.0d;
        if (group != null) {
            int i3 = setMin + 47;
            setMax = i3 % 128;
            if (i3 % 2 != 0) {
                try {
                    d = Double.parseDouble(group) + 3.1556908E7d;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                d = Double.parseDouble(group) * 3.1556908E7d;
            }
        } else {
            d = 0.0d;
        }
        String group2 = matcher.group(5);
        double parseDouble = d + (group2 == null ? 0.0d : Double.parseDouble(group2) * 2629739.0d);
        String group3 = matcher.group(7);
        if ((group3 != null ? 16 : ';') != ';') {
            int i4 = setMax + 17;
            setMin = i4 % 128;
            d2 = i4 % 2 == 0 ? Double.parseDouble(group3) % 86400.0d : Double.parseDouble(group3) * 86400.0d;
        } else {
            d2 = 0.0d;
        }
        double d5 = parseDouble + d2;
        String group4 = matcher.group(10);
        double parseDouble2 = d5 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        if (!(group5 != null)) {
            d3 = 0.0d;
        } else {
            d3 = Double.parseDouble(group5) * 60.0d;
        }
        double d6 = parseDouble2 + d3;
        String group6 = matcher.group(14);
        if (group6 != null) {
            int i5 = setMax + 89;
            setMin = i5 % 128;
            if (i5 % 2 == 0) {
                d4 = Double.parseDouble(group6);
                int i6 = 75 / 0;
            } else {
                d4 = Double.parseDouble(group6);
            }
        }
        long j = (long) ((d6 + d4) * 1000.0d);
        return z ? -j : j;
    }

    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if ((matcher.group(9) == null ? 'J' : 'M') == 'J') {
                int i2 = setMin + 39;
                setMax = i2 % 128;
                int i3 = i2 % 2;
            } else if (matcher.group(9).equalsIgnoreCase("Z")) {
                try {
                    int i4 = setMax + 65;
                    try {
                        setMin = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    int i6 = setMax + 53;
                    setMin = i6 % 128;
                    i = i6 % 2 == 0 ? i >>> -1 : i * -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                StringBuilder sb = new StringBuilder("0.");
                sb.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(sb.toString()).movePointRight(3).intValue());
                int i7 = setMin + 85;
                setMax = i7 % 128;
                int i8 = i7 % 2;
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
        }
        throw new ParserException("Invalid date/time format: ".concat(String.valueOf(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r11 >= r9) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        if ((r0 < 0) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long scaleLargeTimestamp(long r7, long r9, long r11) {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x0069 }
            int r0 = r0 + 43
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x0069 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == r2) goto L_0x001a
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            goto L_0x0026
        L_0x001a:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x0067 }
            if (r0 < 0) goto L_0x0022
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            goto L_0x0039
        L_0x0026:
            long r5 = r11 % r9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            long r11 = r11 / r9
            long r7 = r7 / r11
            int r9 = setMax
            int r9 = r9 + 91
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % 2
            return r7
        L_0x0039:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            if (r1 == 0) goto L_0x0042
            goto L_0x0056
        L_0x0042:
            int r0 = setMax
            int r0 = r0 + 45
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            long r0 = r9 % r11
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0056
            long r9 = r9 / r11
            long r7 = r7 * r9
            return r7
        L_0x0056:
            double r9 = (double) r9
            double r11 = (double) r11
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r11)
            double r9 = r9 / r11
            double r7 = (double) r7
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            long r7 = (long) r7
            return r7
        L_0x0067:
            r7 = move-exception
            throw r7
        L_0x0069:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(long, long, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if ((r11 % r9 == 0) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if ((r11 + r9) == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] scaleLargeTimestamps(java.util.List<java.lang.Long> r8, long r9, long r11) {
        /*
            int r0 = r8.size()
            long[] r1 = new long[r0]
            r2 = 0
            r4 = 0
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0055
            int r5 = setMin     // Catch:{ Exception -> 0x0053 }
            int r5 = r5 + 123
            int r6 = r5 % 128
            setMax = r6     // Catch:{ Exception -> 0x0053 }
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0020
            long r5 = r11 + r9
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0055
            goto L_0x002b
        L_0x0020:
            long r5 = r11 % r9
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            if (r5 == 0) goto L_0x0055
        L_0x002b:
            long r5 = r11 / r9
        L_0x002d:
            r9 = 61
            if (r4 >= r0) goto L_0x0034
            r10 = 61
            goto L_0x0036
        L_0x0034:
            r10 = 92
        L_0x0036:
            if (r10 == r9) goto L_0x0039
            goto L_0x0096
        L_0x0039:
            int r9 = setMax
            int r9 = r9 + 35
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % 2
            java.lang.Object r9 = r8.get(r4)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = r9 / r5
            r1[r4] = r9
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0053:
            r8 = move-exception
            throw r8
        L_0x0055:
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0073
            long r5 = r9 % r11
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0073
            long r9 = r9 / r11
        L_0x0060:
            if (r4 >= r0) goto L_0x0096
            java.lang.Object r11 = r8.get(r4)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = r11 * r9
            r1[r4] = r11
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0073:
            double r9 = (double) r9
            double r11 = (double) r11
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r11)
            double r9 = r9 / r11
        L_0x007c:
            if (r4 >= r0) goto L_0x0096
            java.lang.Object r11 = r8.get(r4)     // Catch:{ Exception -> 0x0094 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ Exception -> 0x0094 }
            long r11 = r11.longValue()     // Catch:{ Exception -> 0x0094 }
            double r11 = (double) r11
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r9
            long r11 = (long) r11
            r1[r4] = r11
            int r4 = r4 + 1
            goto L_0x007c
        L_0x0094:
            r8 = move-exception
            throw r8
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.scaleLargeTimestamps(java.util.List, long, long):long[]");
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j2) {
        int i = setMin + 85;
        setMax = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        if ((j2 >= j ? (char) 21 : 31) == 21) {
            int i4 = setMin + 19;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            if (!(j2 % j != 0)) {
                long j3 = j2 / j;
                while (i3 < jArr.length) {
                    jArr[i3] = jArr[i3] / j3;
                    i3++;
                }
                return;
            }
        }
        if (j2 < j) {
            try {
                int i6 = setMin + 93;
                try {
                    setMax = i6 % 128;
                    if (i6 % 2 == 0 ? j % j2 == 0 : j * j2 == 0) {
                        int i7 = setMax + 97;
                        setMin = i7 % 128;
                        int i8 = i7 % 2;
                        long j4 = j / j2;
                        while (i3 < jArr.length) {
                            jArr[i3] = jArr[i3] * j4;
                            i3++;
                        }
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        double d = (double) j;
        double d2 = (double) j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        int i9 = 0;
        while (true) {
            if (!(i9 >= jArr.length)) {
                double d4 = (double) jArr[i9];
                Double.isNaN(d4);
                jArr[i9] = (long) (d4 * d3);
                i9++;
            } else {
                return;
            }
        }
    }

    public static long getMediaDurationForPlayoutDuration(long j, float f) {
        int i = setMin + 5;
        setMax = i % 128;
        int i2 = i % 2;
        if ((f == 1.0f ? '_' : 'Y') != '_') {
            double d = (double) j;
            double d2 = (double) f;
            Double.isNaN(d);
            Double.isNaN(d2);
            return Math.round(d * d2);
        }
        int i3 = setMax + 45;
        setMin = i3 % 128;
        if ((i3 % 2 == 0 ? 'V' : 30) != 30) {
            int i4 = 48 / 0;
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if ((r5 == 0.0f) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if ((r5 == 1.0f ? 'Q' : kotlin.text.Typography.quote) != '\"') goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r3 = (double) r3;
        r0 = (double) r5;
        java.lang.Double.isNaN(r3);
        java.lang.Double.isNaN(r0);
        r3 = java.lang.Math.round(r3 / r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5 = setMin + 65;
        setMax = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if ((r5 % 2) == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getPlayoutDurationForMediaDuration(long r3, float r5) {
        /*
            int r0 = setMin
            int r0 = r0 + 25
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 89
            if (r0 == 0) goto L_0x0011
            r0 = 63
            goto L_0x0013
        L_0x0011:
            r0 = 89
        L_0x0013:
            r2 = 81
            if (r0 == r1) goto L_0x0022
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x003b
            goto L_0x0031
        L_0x0022:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 34
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            r0 = 81
            goto L_0x002f
        L_0x002d:
            r0 = 34
        L_0x002f:
            if (r0 == r1) goto L_0x003b
        L_0x0031:
            int r5 = setMax
            int r5 = r5 + r2
            int r0 = r5 % 128
            setMin = r0
            int r5 = r5 % 2
            return r3
        L_0x003b:
            double r3 = (double) r3
            double r0 = (double) r5
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r0)
            double r3 = r3 / r0
            long r3 = java.lang.Math.round(r3)
            int r5 = setMin     // Catch:{ Exception -> 0x005c }
            int r5 = r5 + 65
            int r0 = r5 % 128
            setMax = r0     // Catch:{ Exception -> 0x005c }
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x005b
            r5 = 0
            super.hashCode()     // Catch:{ all -> 0x0059 }
            return r3
        L_0x0059:
            r3 = move-exception
            throw r3
        L_0x005b:
            return r3
        L_0x005c:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(long, float):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        if ((r6 > 0) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        if (r13 <= r2) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long resolveSeekPositionUs(long r8, com.google.android.exoplayer2.SeekParameters r10, long r11, long r13) {
        /*
            com.google.android.exoplayer2.SeekParameters r0 = com.google.android.exoplayer2.SeekParameters.EXACT
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0009
            return r8
        L_0x0009:
            long r3 = r10.toleranceBeforeUs     // Catch:{ Exception -> 0x0087 }
            r5 = -9223372036854775808
            r1 = r8
            long r0 = subtractWithOverflowDefault(r1, r3, r5)     // Catch:{ Exception -> 0x0085 }
            long r4 = r10.toleranceAfterUs     // Catch:{ Exception -> 0x0085 }
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = r8
            long r2 = addWithOverflowDefault(r2, r4, r6)     // Catch:{ Exception -> 0x0085 }
            r10 = 1
            r4 = 0
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x005f
            int r6 = setMin
            int r6 = r6 + 71
            int r7 = r6 % 128
            setMax = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x003d
            r6 = 1
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            if (r6 == 0) goto L_0x004f
            int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            r2 = 89
            int r2 = r2 / r4
            if (r6 > 0) goto L_0x0049
            r2 = 0
            goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            if (r2 == 0) goto L_0x0053
            goto L_0x005f
        L_0x004d:
            r8 = move-exception
            throw r8
        L_0x004f:
            int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x005f
        L_0x0053:
            int r2 = setMax
            int r2 = r2 + 53
            int r3 = r2 % 128
            setMin = r3
            int r2 = r2 % 2
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r5 == 0) goto L_0x007a
            if (r2 == 0) goto L_0x007a
            long r0 = r11 - r8
            long r0 = java.lang.Math.abs(r0)
            long r8 = r13 - r8
            long r8 = java.lang.Math.abs(r8)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r10 = 0
        L_0x0076:
            if (r10 == 0) goto L_0x0079
            return r11
        L_0x0079:
            return r13
        L_0x007a:
            if (r5 == 0) goto L_0x007d
            return r11
        L_0x007d:
            if (r2 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            if (r10 == 0) goto L_0x0084
            return r13
        L_0x0084:
            return r0
        L_0x0085:
            r8 = move-exception
            throw r8
        L_0x0087:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.resolveSeekPositionUs(long, com.google.android.exoplayer2.SeekParameters, long, long):long");
    }

    public static int[] toArray(List<Integer> list) {
        if ((list == null ? 22 : 'G') != 'G') {
            try {
                int i = setMin + 3;
                setMax = i % 128;
                int[] iArr = null;
                if ((i % 2 != 0 ? 'L' : 'K') != 'L') {
                    return iArr;
                }
                int length2 = iArr.length;
                return iArr;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int size = list.size();
            int[] iArr2 = new int[size];
            int i2 = setMin + 39;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < size; i4++) {
                iArr2[i4] = list.get(i4).intValue();
            }
            return iArr2;
        }
    }

    public static int getIntegerCodeForString(String str) {
        try {
            int i = setMax + 55;
            try {
                setMin = i % 128;
                int i2 = i % 2;
                int length2 = str.length();
                int i3 = 0;
                Assertions.checkArgument((length2 <= 4 ? (char) 6 : 20) == 6);
                char c = 0;
                while (true) {
                    if ((i3 < length2 ? '!' : 'B') != '!') {
                        return c;
                    }
                    int i4 = setMin + 93;
                    setMax = i4 % 128;
                    int i5 = i4 % 2;
                    c = (c << 8) | str.charAt(i3);
                    i3++;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static byte[] getBytesFromHexString(String str) {
        try {
            int length2 = str.length() / 2;
            byte[] bArr = new byte[length2];
            int i = 0;
            while (true) {
                if (!(i < length2)) {
                    return bArr;
                }
                try {
                    int i2 = setMax + 35;
                    setMin = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = i * 2;
                    bArr[i] = (byte) ((Character.digit(str.charAt(i4), 16) << 4) + Character.digit(str.charAt(i4 + 1), 16));
                    i++;
                    int i5 = setMax + 117;
                    setMin = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            Object[] objArr2 = null;
            if (!(i >= objArr.length)) {
                try {
                    int i2 = setMax + 103;
                    setMin = i2 % 128;
                    int i3 = i2 % 2;
                    sb.append(objArr[i].getClass().getSimpleName());
                    if (!(i >= objArr.length - 1)) {
                        int i4 = setMin + 75;
                        setMax = i4 % 128;
                        int i5 = i4 % 2;
                        sb.append(", ");
                        if (i5 != 0) {
                            int length2 = objArr2.length;
                        } else {
                            continue;
                        }
                    }
                    i++;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                String obj = sb.toString();
                int i6 = setMax + 19;
                setMin = i6 % 128;
                if (i6 % 2 != 0) {
                    return obj;
                }
                super.hashCode();
                return obj;
            }
        }
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            int i = setMax + 55;
            setMin = i % 128;
            int i2 = i % 2;
            boolean z = false;
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "?";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb.append(" (Linux;Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append(") ExoPlayerLib/2.9.0");
            String obj = sb.toString();
            int i3 = setMax + 45;
            setMin = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return obj;
            }
            Object obj2 = null;
            super.hashCode();
            return obj;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = new java.lang.StringBuilder();
        r2 = r9.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r4 >= r2) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6 = setMin + 105;
        setMax = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if ((r6 % 2) == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r6 = r9[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = com.google.android.exoplayer2.util.MimeTypes.getTrackTypeOfCodec(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r8 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r10 != r7) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        r6 = r9[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        if (r10 != com.google.android.exoplayer2.util.MimeTypes.getTrackTypeOfCodec(r6)) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r7 = setMin + 21;
        setMax = r7 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if ((r7 % 2) == 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r7 == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        if (r0.length() <= 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        r7 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        r7 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        if (r7 == 19) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7 = 56 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r0.length() <= 0) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        r0.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r0.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0082, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0083, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0088, code lost:
        if (r0.length() <= 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008a, code lost:
        r9 = kotlin.text.Typography.amp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008d, code lost:
        r9 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008f, code lost:
        if (r9 == 19) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0091, code lost:
        r9 = r0.toString();
        r10 = setMax + 93;
        setMin = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009f, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a0, code lost:
        r9 = setMax + 77;
        setMin = r9 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00aa, code lost:
        if ((r9 % 2) != 0) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 == 0) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r9 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ad, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b1, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b3, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r9.length == 0) goto L_0x001f;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCodecsOfType(java.lang.String r9, int r10) {
        /*
            int r0 = setMax
            int r0 = r0 + 89
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.String[] r9 = splitCodecs(r9)
            int r0 = r9.length
            int r2 = r1.length     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0020
            goto L_0x001f
        L_0x0016:
            r9 = move-exception
            throw r9
        L_0x0018:
            java.lang.String[] r9 = splitCodecs(r9)
            int r0 = r9.length
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            return r1
        L_0x0020:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r9.length
            r3 = 0
            r4 = 0
        L_0x0028:
            r5 = 19
            if (r4 >= r2) goto L_0x0084
            int r6 = setMin     // Catch:{ Exception -> 0x0082 }
            int r6 = r6 + 105
            int r7 = r6 % 128
            setMax = r7     // Catch:{ Exception -> 0x0082 }
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0044
            r6 = r9[r4]
            int r7 = com.google.android.exoplayer2.util.MimeTypes.getTrackTypeOfCodec(r6)     // Catch:{ Exception -> 0x00b1 }
            int r8 = r1.length     // Catch:{ all -> 0x0042 }
            if (r10 != r7) goto L_0x007f
            goto L_0x004c
        L_0x0042:
            r9 = move-exception
            throw r9
        L_0x0044:
            r6 = r9[r4]
            int r7 = com.google.android.exoplayer2.util.MimeTypes.getTrackTypeOfCodec(r6)
            if (r10 != r7) goto L_0x007f
        L_0x004c:
            int r7 = setMin
            int r7 = r7 + 21
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x005a
            r7 = 0
            goto L_0x005b
        L_0x005a:
            r7 = 1
        L_0x005b:
            if (r7 == 0) goto L_0x006b
            int r7 = r0.length()
            if (r7 <= 0) goto L_0x0066
            r7 = 19
            goto L_0x0068
        L_0x0066:
            r7 = 23
        L_0x0068:
            if (r7 == r5) goto L_0x0074
            goto L_0x0079
        L_0x006b:
            int r5 = r0.length()
            r7 = 56
            int r7 = r7 / r3
            if (r5 <= 0) goto L_0x0079
        L_0x0074:
            java.lang.String r5 = ","
            r0.append(r5)
        L_0x0079:
            r0.append(r6)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x007f
        L_0x007d:
            r9 = move-exception
            throw r9
        L_0x007f:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0082:
            r9 = move-exception
            throw r9
        L_0x0084:
            int r9 = r0.length()     // Catch:{ Exception -> 0x00b1 }
            if (r9 <= 0) goto L_0x008d
            r9 = 38
            goto L_0x008f
        L_0x008d:
            r9 = 19
        L_0x008f:
            if (r9 == r5) goto L_0x00a0
            java.lang.String r9 = r0.toString()
            int r10 = setMax
            int r10 = r10 + 93
            int r0 = r10 % 128
            setMin = r0
            int r10 = r10 % 2
            return r9
        L_0x00a0:
            int r9 = setMax
            int r9 = r9 + 77
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % 2
            if (r9 != 0) goto L_0x00b0
            int r9 = r1.length     // Catch:{ all -> 0x00ae }
            return r1
        L_0x00ae:
            r9 = move-exception
            throw r9
        L_0x00b0:
            return r1
        L_0x00b1:
            r9 = move-exception
            goto L_0x00b4
        L_0x00b3:
            throw r9
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getCodecsOfType(java.lang.String, int):java.lang.String");
    }

    public static String[] splitCodecs(String str) {
        try {
            int i = setMax + 47;
            setMin = i % 128;
            int i2 = i % 2;
            try {
                if (!(TextUtils.isEmpty(str))) {
                    String[] split = split(str.trim(), "(\\s*,\\s*)");
                    int i3 = setMax + 61;
                    setMin = i3 % 128;
                    int i4 = i3 % 2;
                    return split;
                }
                int i5 = setMax + 93;
                setMin = i5 % 128;
                int i6 = i5 % 2;
                return new String[0];
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int getPcmEncoding(int i) {
        int i2 = setMax + 55;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            int i4 = setMax + 45;
            setMin = i4 % 128;
            int i5 = i4 % 2;
            return 2;
        } else if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if ((r4 != Integer.MIN_VALUE ? '%' : 11) != '%') goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r4 != Integer.MIN_VALUE) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isEncodingLinearPcm(int r4) {
        /*
            int r0 = setMax
            int r0 = r0 + 7
            int r1 = r0 % 128
            setMin = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = 5
            if (r4 == r0) goto L_0x0067
            goto L_0x0014
        L_0x0011:
            r0 = 3
            if (r4 == r0) goto L_0x0067
        L_0x0014:
            int r0 = setMin
            int r0 = r0 + 41
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % r1
            r0 = 99
            if (r4 == r1) goto L_0x0024
            r3 = 52
            goto L_0x0026
        L_0x0024:
            r3 = 99
        L_0x0026:
            if (r3 == r0) goto L_0x0067
            int r0 = setMax
            int r0 = r0 + 87
            int r3 = r0 % 128
            setMin = r3
            int r0 = r0 % r1
            r1 = 78
            if (r0 != 0) goto L_0x0038
            r0 = 43
            goto L_0x003a
        L_0x0038:
            r0 = 78
        L_0x003a:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x004e
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x004c }
            r0 = 37
            if (r4 == r3) goto L_0x0047
            r1 = 37
            goto L_0x0049
        L_0x0047:
            r1 = 11
        L_0x0049:
            if (r1 == r0) goto L_0x0050
            goto L_0x0067
        L_0x004c:
            r4 = move-exception
            throw r4
        L_0x004e:
            if (r4 == r3) goto L_0x0067
        L_0x0050:
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 19
            if (r4 == r0) goto L_0x0059
            r0 = 17
            goto L_0x005b
        L_0x0059:
            r0 = 19
        L_0x005b:
            if (r0 == r1) goto L_0x0067
            r0 = 4
            r1 = 0
            if (r4 != r0) goto L_0x0063
            r4 = 0
            goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            if (r4 == 0) goto L_0x0067
            return r1
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(int):boolean");
    }

    public static boolean isEncodingHighResolutionIntegerPcm(int i) {
        if ((i != Integer.MIN_VALUE ? 'K' : 10) == 10) {
            return true;
        }
        int i2 = setMax + 51;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        if (i == 1073741824) {
            return true;
        }
        try {
            int i4 = setMax + 65;
            try {
                setMin = i4 % 128;
                if ((i4 % 2 == 0 ? 14 : 'O') == 'O') {
                    return false;
                }
                Object obj = null;
                super.hashCode();
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int getAudioTrackChannelConfig(int i) {
        Object[] objArr = null;
        boolean z = false;
        switch (i) {
            case 1:
                int i2 = setMin + 25;
                setMax = i2 % 128;
                if (i2 % 2 == 0) {
                    return 4;
                }
                super.hashCode();
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return WheelView.DIVIDER_ALPHA;
            case 6:
                int i3 = setMax + 75;
                setMin = i3 % 128;
                if (i3 % 2 != 0) {
                    return 252;
                }
                super.hashCode();
                return 252;
            case 7:
                return 1276;
            case 8:
                try {
                    if (SDK_INT >= 23) {
                        int i4 = setMax + 15;
                        setMin = i4 % 128;
                        if (i4 % 2 == 0) {
                            z = true;
                        }
                        if (!z) {
                            return 6396;
                        }
                        int length2 = objArr.length;
                        return 6396;
                    } else if (SDK_INT < 21) {
                        return 0;
                    } else {
                        int i5 = setMax + 9;
                        setMin = i5 % 128;
                        if (i5 % 2 == 0) {
                            z = true;
                        }
                        if (!z) {
                            return 6396;
                        }
                        return 7251;
                    }
                } catch (Exception e) {
                    throw e;
                }
            default:
                return 0;
        }
    }

    public static int getPcmFrameSize(int i, int i2) {
        int i3 = setMax + 9;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = null;
        boolean z = false;
        if (i != Integer.MIN_VALUE) {
            if (i != 1073741824) {
                if (i == 2) {
                    return i2 * 2;
                }
                if (i == 3) {
                    return i2;
                }
                if (i != 4) {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = i2 * 4;
            int i6 = setMin + 109;
            setMax = i6 % 128;
            if (i6 % 2 != 0) {
                z = true;
            }
            if (!z) {
                return i5;
            }
            int length2 = objArr.length;
            return i5;
        }
        int i7 = i2 * 3;
        try {
            int i8 = setMin + 37;
            setMax = i8 % 128;
            if (i8 % 2 == 0) {
                z = true;
            }
            if (z) {
                return i7;
            }
            int length3 = objArr.length;
            return i7;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x005c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getAudioUsageForStreamType(int r8) {
        /*
            int r0 = setMin
            int r0 = r0 + 41
            int r1 = r0 % 128
            setMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 23
            if (r0 == 0) goto L_0x0011
            r0 = 23
            goto L_0x0013
        L_0x0011:
            r0 = 65
        L_0x0013:
            r3 = 8
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 1
            if (r0 == r2) goto L_0x0028
            if (r8 == 0) goto L_0x007c
            if (r8 == r7) goto L_0x0070
            if (r8 == r1) goto L_0x0063
            if (r8 == r6) goto L_0x0051
            if (r8 == r5) goto L_0x0050
            if (r8 == r3) goto L_0x004e
            goto L_0x0035
        L_0x0028:
            int r0 = r4.length     // Catch:{ all -> 0x007d }
            if (r8 == 0) goto L_0x007c
            if (r8 == r7) goto L_0x0070
            if (r8 == r1) goto L_0x0063
            if (r8 == r6) goto L_0x0051
            if (r8 == r5) goto L_0x0050
            if (r8 == r3) goto L_0x004e
        L_0x0035:
            int r8 = setMin     // Catch:{ Exception -> 0x004c }
            int r8 = r8 + 57
            int r0 = r8 % 128
            setMax = r0     // Catch:{ Exception -> 0x004c }
            int r8 = r8 % r1
            if (r8 == 0) goto L_0x0042
            r8 = 1
            goto L_0x0043
        L_0x0042:
            r8 = 0
        L_0x0043:
            if (r8 == 0) goto L_0x004b
            super.hashCode()     // Catch:{ all -> 0x0049 }
            return r7
        L_0x0049:
            r8 = move-exception
            throw r8
        L_0x004b:
            return r7
        L_0x004c:
            r8 = move-exception
            throw r8
        L_0x004e:
            r8 = 3
            return r8
        L_0x0050:
            return r5
        L_0x0051:
            int r8 = setMax
            int r8 = r8 + 11
            int r0 = r8 % 128
            setMin = r0
            int r8 = r8 % r1
            if (r8 != 0) goto L_0x0062
            super.hashCode()     // Catch:{ all -> 0x0060 }
            return r6
        L_0x0060:
            r8 = move-exception
            throw r8
        L_0x0062:
            return r6
        L_0x0063:
            r8 = 6
            int r0 = setMax     // Catch:{ Exception -> 0x006e }
            int r0 = r0 + 91
            int r2 = r0 % 128
            setMin = r2     // Catch:{ Exception -> 0x006e }
            int r0 = r0 % r1
            return r8
        L_0x006e:
            r8 = move-exception
            throw r8
        L_0x0070:
            r8 = 13
            int r0 = setMin
            int r0 = r0 + 71
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % r1
            return r8
        L_0x007c:
            return r1
        L_0x007d:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getAudioUsageForStreamType(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getAudioContentTypeForStreamType(int r8) {
        /*
            int r0 = setMin
            int r0 = r0 + 67
            int r1 = r0 % 128
            setMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 43
            r3 = 64
            if (r0 == 0) goto L_0x0013
            r0 = 64
            goto L_0x0015
        L_0x0013:
            r0 = 43
        L_0x0015:
            r4 = 8
            r5 = 5
            r6 = 4
            r7 = 1
            if (r0 == r2) goto L_0x002f
            r0 = 45
            int r0 = r0 / 0
            if (r8 == 0) goto L_0x003d
            if (r8 == r7) goto L_0x003c
            if (r8 == r1) goto L_0x003c
            if (r8 == r6) goto L_0x003c
            if (r8 == r5) goto L_0x003c
            if (r8 == r4) goto L_0x003c
            goto L_0x003b
        L_0x002d:
            r8 = move-exception
            throw r8
        L_0x002f:
            if (r8 == 0) goto L_0x003d
            if (r8 == r7) goto L_0x003c
            if (r8 == r1) goto L_0x003c
            if (r8 == r6) goto L_0x003c
            if (r8 == r5) goto L_0x003c
            if (r8 == r4) goto L_0x003c
        L_0x003b:
            return r1
        L_0x003c:
            return r6
        L_0x003d:
            int r8 = setMax     // Catch:{ Exception -> 0x0057 }
            int r8 = r8 + 25
            int r0 = r8 % 128
            setMin = r0     // Catch:{ Exception -> 0x0057 }
            int r8 = r8 % r1
            if (r8 != 0) goto L_0x004b
            r8 = 64
            goto L_0x004d
        L_0x004b:
            r8 = 42
        L_0x004d:
            if (r8 == r3) goto L_0x0050
            return r7
        L_0x0050:
            r8 = 0
            super.hashCode()     // Catch:{ all -> 0x0055 }
            return r7
        L_0x0055:
            r8 = move-exception
            throw r8
        L_0x0057:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getAudioContentTypeForStreamType(int):int");
    }

    public static int getStreamTypeForAudioUsage(int i) {
        try {
            int i2 = setMax + 75;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            switch (i) {
                case 1:
                case 12:
                case 14:
                    int i4 = setMax + 121;
                    setMin = i4 % 128;
                    int i5 = i4 % 2;
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095 A[SYNTHETIC, Splitter:B:55:0x0095] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.UUID getDrmUuid(java.lang.String r7) {
        /*
            java.lang.String r0 = toLowerInvariant(r7)
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -1860423953(0xffffffff911c2eef, float:-1.2320693E-28)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r2 == r3) goto L_0x0043
            r3 = -1400551171(0xffffffffac8548fd, float:-3.7881907E-12)
            if (r2 == r3) goto L_0x0026
            r3 = 790309106(0x2f1b28f2, float:1.4111715E-10)
            if (r2 == r3) goto L_0x001c
            goto L_0x005c
        L_0x001c:
            java.lang.String r2 = "clearkey"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x005c
            r1 = 2
            goto L_0x005c
        L_0x0026:
            java.lang.String r2 = "widevine"
            boolean r0 = r0.equals(r2)
            r2 = 66
            if (r0 == 0) goto L_0x0034
            r0 = 66
            goto L_0x0036
        L_0x0034:
            r0 = 80
        L_0x0036:
            if (r0 == r2) goto L_0x0039
            goto L_0x005c
        L_0x0039:
            int r0 = setMin
            int r0 = r0 + 115
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % r6
            goto L_0x0056
        L_0x0043:
            java.lang.String r2 = "playready"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005c
            int r0 = setMin     // Catch:{ Exception -> 0x005a }
            int r0 = r0 + 11
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x005a }
            int r0 = r0 % r6
            if (r0 == 0) goto L_0x0058
        L_0x0056:
            r1 = 0
            goto L_0x005c
        L_0x0058:
            r1 = 1
            goto L_0x005c
        L_0x005a:
            r7 = move-exception
            throw r7
        L_0x005c:
            if (r1 == 0) goto L_0x0095
            if (r1 == r5) goto L_0x0092
            r0 = 0
            if (r1 == r6) goto L_0x007a
            java.util.UUID r7 = java.util.UUID.fromString(r7)     // Catch:{ RuntimeException -> 0x0079 }
            int r0 = setMax
            int r0 = r0 + 119
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % r6
            if (r0 != 0) goto L_0x0078
            r0 = 59
            int r0 = r0 / r4
            return r7
        L_0x0076:
            r7 = move-exception
            throw r7
        L_0x0078:
            return r7
        L_0x0079:
            return r0
        L_0x007a:
            java.util.UUID r7 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            int r1 = setMax
            int r1 = r1 + 3
            int r2 = r1 % 128
            setMin = r2
            int r1 = r1 % r6
            if (r1 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = 1
        L_0x0089:
            if (r4 == r5) goto L_0x0091
            super.hashCode()     // Catch:{ all -> 0x008f }
            return r7
        L_0x008f:
            r7 = move-exception
            throw r7
        L_0x0091:
            return r7
        L_0x0092:
            java.util.UUID r7 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            return r7
        L_0x0095:
            java.util.UUID r7 = com.google.android.exoplayer2.C.WIDEVINE_UUID     // Catch:{ Exception -> 0x0098 }
            return r7
        L_0x0098:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getDrmUuid(java.lang.String):java.util.UUID");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if ((android.text.TextUtils.isEmpty(r4) ? '2' : com.alibaba.fastjson.parser.JSONLexer.EOI) != 26) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        return inferContentType(".".concat(java.lang.String.valueOf(r4)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int inferContentType(android.net.Uri r3, java.lang.String r4) {
        /*
            int r0 = setMin     // Catch:{ Exception -> 0x0063 }
            int r0 = r0 + 47
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x0063 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x000e
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x0024
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0022 }
            r2 = 26
            if (r0 == 0) goto L_0x001d
            r0 = 50
            goto L_0x001f
        L_0x001d:
            r0 = 26
        L_0x001f:
            if (r0 == r2) goto L_0x0052
            goto L_0x002b
        L_0x0022:
            r3 = move-exception
            throw r3
        L_0x0024:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0052
        L_0x002b:
            int r4 = setMax
            int r4 = r4 + 115
            int r0 = r4 % 128
            setMin = r0
            int r4 = r4 % 2
            int r3 = inferContentType((android.net.Uri) r3)
            int r4 = setMax
            int r4 = r4 + 23
            int r0 = r4 % 128
            setMin = r0
            int r4 = r4 % 2
            r0 = 21
            if (r4 != 0) goto L_0x0049
            r4 = 6
            goto L_0x004b
        L_0x0049:
            r4 = 21
        L_0x004b:
            if (r4 == r0) goto L_0x0051
            int r4 = r1.length     // Catch:{ all -> 0x004f }
            return r3
        L_0x004f:
            r3 = move-exception
            throw r3
        L_0x0051:
            return r3
        L_0x0052:
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "."
            java.lang.String r3 = r4.concat(r3)
            int r3 = inferContentType((java.lang.String) r3)
            return r3
        L_0x0061:
            r3 = move-exception
            throw r3
        L_0x0063:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.inferContentType(android.net.Uri, java.lang.String):int");
    }

    public static int inferContentType(Uri uri) {
        String str;
        int i = setMin + 125;
        setMax = i % 128;
        boolean z = true;
        Object[] objArr = null;
        if (!(i % 2 != 0)) {
            str = uri.getPath();
            if (str == null) {
                return 3;
            }
        } else {
            str = uri.getPath();
            int length2 = objArr.length;
            if ((str == null ? (char) 17 : 0) != 0) {
                return 3;
            }
        }
        int inferContentType = inferContentType(str);
        try {
            int i2 = setMin + 61;
            try {
                setMax = i2 % 128;
                if (i2 % 2 == 0) {
                    z = false;
                }
                if (!z) {
                    return inferContentType;
                }
                int length3 = objArr.length;
                return inferContentType;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int inferContentType(String str) {
        String lowerInvariant = toLowerInvariant(str);
        boolean z = false;
        if (!(lowerInvariant.endsWith(".mpd"))) {
            if ((lowerInvariant.endsWith(".m3u8") ? 'N' : 25) != 25) {
                return 2;
            }
            try {
                if (lowerInvariant.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?")) {
                    z = true;
                }
                if (z) {
                    return 1;
                }
                return 3;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i = setMax + 89;
            setMin = i % 128;
            int i2 = i % 2;
            int i3 = setMin + 43;
            setMax = i3 % 128;
            if ((i3 % 2 != 0 ? 'D' : '0') == '0') {
                return 0;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return 0;
        }
    }

    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j) {
        if ((j == C.TIME_UNSET ? 'D' : 'H') == 'D') {
            int i = setMin + 89;
            setMax = i % 128;
            int i2 = i % 2;
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        if ((j5 > 0 ? 16 : 'c') != 'c') {
            String obj = formatter.format("%d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}).toString();
            try {
                int i3 = setMax + 99;
                setMin = i3 % 128;
                int i4 = i3 % 2;
                return obj;
            } catch (Exception e) {
                throw e;
            }
        } else {
            return formatter.format("%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j3)}).toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r7 != 5) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r7 != 5) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getDefaultBufferSize(int r7) {
        /*
            int r0 = setMax
            int r0 = r0 + 123
            int r1 = r0 % 128
            setMin = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 3
            if (r0 != 0) goto L_0x000f
            r0 = 3
            goto L_0x0011
        L_0x000f:
            r0 = 45
        L_0x0011:
            r3 = 5
            r4 = 4
            r5 = 1
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r0 == r2) goto L_0x0025
            if (r7 == 0) goto L_0x005d
            if (r7 == r5) goto L_0x005a
            if (r7 == r1) goto L_0x0057
            if (r7 == r2) goto L_0x003d
            if (r7 == r4) goto L_0x003c
            if (r7 != r3) goto L_0x0036
            goto L_0x0035
        L_0x0025:
            r0 = 14
            int r0 = r0 / 0
            if (r7 == 0) goto L_0x005d
            if (r7 == r5) goto L_0x005a
            if (r7 == r1) goto L_0x0057
            if (r7 == r2) goto L_0x003d
            if (r7 == r4) goto L_0x003c
            if (r7 != r3) goto L_0x0036
        L_0x0035:
            return r6
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x003c:
            return r6
        L_0x003d:
            int r7 = setMax
            int r7 = r7 + 61
            int r0 = r7 % 128
            setMin = r0
            int r7 = r7 % r1
            r0 = 60
            if (r7 != 0) goto L_0x004d
            r7 = 60
            goto L_0x004f
        L_0x004d:
            r7 = 98
        L_0x004f:
            if (r7 == r0) goto L_0x0052
            return r6
        L_0x0052:
            r7 = 0
            int r7 = r7.length     // Catch:{ all -> 0x0055 }
            return r6
        L_0x0055:
            r7 = move-exception
            throw r7
        L_0x0057:
            r7 = 13107200(0xc80000, float:1.8367099E-38)
            return r7
        L_0x005a:
            r7 = 3538944(0x360000, float:4.959117E-39)
            return r7
        L_0x005d:
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            return r7
        L_0x0060:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getDefaultBufferSize(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (shouldEscapeCharacter(r1) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (shouldEscapeCharacter(r1) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        r2.append(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String escapeFileName(java.lang.String r6) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            r4 = 94
            if (r2 >= r0) goto L_0x000e
            r5 = 9
            goto L_0x0010
        L_0x000e:
            r5 = 94
        L_0x0010:
            if (r5 == r4) goto L_0x0023
            char r4 = r6.charAt(r2)     // Catch:{ Exception -> 0x0021 }
            boolean r4 = shouldEscapeCharacter(r4)     // Catch:{ Exception -> 0x0021 }
            if (r4 == 0) goto L_0x001e
            int r3 = r3 + 1
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0021:
            r6 = move-exception
            throw r6
        L_0x0023:
            if (r3 != 0) goto L_0x0026
            return r6
        L_0x0026:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r4 = r3 * 2
            int r4 = r4 + r0
            r2.<init>(r4)
            int r4 = setMax
            int r4 = r4 + 81
            int r5 = r4 % 128
            setMin = r5
            int r4 = r4 % 2
        L_0x0038:
            r4 = 33
            if (r3 <= 0) goto L_0x003f
            r5 = 24
            goto L_0x0041
        L_0x003f:
            r5 = 33
        L_0x0041:
            if (r5 == r4) goto L_0x007e
            int r4 = setMax
            int r4 = r4 + 65
            int r5 = r4 % 128
            setMin = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x005c
            int r4 = r1 + 49
            char r1 = r6.charAt(r1)
            boolean r5 = shouldEscapeCharacter(r1)
            if (r5 == 0) goto L_0x0079
            goto L_0x0068
        L_0x005c:
            int r4 = r1 + 1
            char r1 = r6.charAt(r1)
            boolean r5 = shouldEscapeCharacter(r1)
            if (r5 == 0) goto L_0x0079
        L_0x0068:
            r5 = 37
            r2.append(r5)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ Exception -> 0x0077 }
            r2.append(r1)     // Catch:{ Exception -> 0x0077 }
            int r3 = r3 + -1
            goto L_0x007c
        L_0x0077:
            r6 = move-exception
            goto L_0x008e
        L_0x0079:
            r2.append(r1)
        L_0x007c:
            r1 = r4
            goto L_0x0038
        L_0x007e:
            if (r1 >= r0) goto L_0x008f
            int r3 = setMin
            int r3 = r3 + 45
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            r2.append(r6, r1, r0)     // Catch:{ Exception -> 0x0077 }
            goto L_0x008f
        L_0x008e:
            throw r6
        L_0x008f:
            java.lang.String r6 = r2.toString()
            int r0 = setMin
            int r0 = r0 + 79
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x00a6
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x00a4 }
            return r6
        L_0x00a4:
            r6 = move-exception
            throw r6
        L_0x00a6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.escapeFileName(java.lang.String):java.lang.String");
    }

    private static boolean shouldEscapeCharacter(char c) {
        int i = setMin + 13;
        setMax = i % 128;
        if ((i % 2 != 0 ? '-' : Typography.dollar) != '$') {
            Object[] objArr = null;
            int length2 = objArr.length;
            if (!(c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?')) {
                return false;
            }
        } else if (!(c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?')) {
            return false;
        }
        int i2 = setMin + 71;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, java.lang.String] */
    @Nullable
    public static String unescapeFileName(String str) {
        int length2 = str.length();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= length2) {
                break;
            }
            if (str.charAt(i) == '%') {
                z2 = false;
            }
            if (!z2) {
                i2++;
            }
            i++;
        }
        ? r2 = 0;
        if (i2 == 0) {
            int i3 = setMax + 41;
            setMin = i3 % 128;
            if (i3 % 2 == 0) {
                int length3 = r2.length;
            }
            return str;
        }
        int i4 = length2 - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        try {
            Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
            int i5 = 0;
            while (true) {
                if ((i2 > 0) && matcher.find()) {
                    sb.append(str, i5, matcher.start());
                    sb.append((char) Integer.parseInt(matcher.group(1), 16));
                    i5 = matcher.end();
                    i2--;
                }
            }
            if (i5 < length2) {
                sb.append(str, i5, length2);
            }
            if (sb.length() != i4) {
                z = true;
            }
            if (z) {
                return r2;
            }
            String obj = sb.toString();
            try {
                int i6 = setMin + 121;
                setMax = i6 % 128;
                if ((i6 % 2 != 0 ? '/' : 16) == 16) {
                    return obj;
                }
                super.hashCode();
                return obj;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void sneakyThrow(Throwable th) {
        try {
            int i = setMin + 9;
            setMax = i % 128;
            boolean z = true;
            if (!(i % 2 == 0)) {
                sneakyThrowInternal(th);
                Object[] objArr = null;
                int length2 = objArr.length;
            } else {
                sneakyThrowInternal(th);
            }
            int i2 = setMin + 11;
            setMax = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            }
            if (z) {
                int i3 = 10 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) throws Throwable {
        try {
            int i = setMin + 11;
            setMax = i % 128;
            if ((i % 2 != 0 ? 'c' : '!') != '!') {
                int i2 = 29 / 0;
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if ((r0 != null) != true) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void recursiveDelete(java.io.File r7) {
        /*
            int r0 = setMin     // Catch:{ Exception -> 0x004b }
            int r0 = r0 + 63
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r2) goto L_0x001f
            java.io.File[] r0 = r7.listFiles()
            if (r0 == 0) goto L_0x001b
            r3 = 1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 == r2) goto L_0x0027
            goto L_0x0043
        L_0x001f:
            java.io.File[] r0 = r7.listFiles()
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0043
        L_0x0027:
            int r3 = r0.length
            r4 = 0
        L_0x0029:
            if (r4 >= r3) goto L_0x002d
            r5 = 0
            goto L_0x002e
        L_0x002d:
            r5 = 1
        L_0x002e:
            if (r5 == 0) goto L_0x0031
            goto L_0x0043
        L_0x0031:
            int r5 = setMin
            int r5 = r5 + 61
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r5 = r0[r4]
            recursiveDelete(r5)
            int r4 = r4 + 1
            goto L_0x0029
        L_0x0043:
            r7.delete()
            return
        L_0x0047:
            r7 = move-exception
            throw r7
        L_0x0049:
            r7 = move-exception
            throw r7
        L_0x004b:
            r7 = move-exception
            goto L_0x004e
        L_0x004d:
            throw r7
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.recursiveDelete(java.io.File):void");
    }

    public static File createTempDirectory(Context context, String str) throws IOException {
        int i = setMax + 21;
        setMin = i % 128;
        int i2 = i % 2;
        File createTempFile = createTempFile(context, str);
        createTempFile.delete();
        createTempFile.mkdir();
        int i3 = setMax + 65;
        setMin = i3 % 128;
        if ((i3 % 2 == 0 ? 23 : ';') == ';') {
            return createTempFile;
        }
        Object obj = null;
        super.hashCode();
        return createTempFile;
    }

    public static File createTempFile(Context context, String str) throws IOException {
        int i = setMin + 95;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            File createTempFile = File.createTempFile(str, (String) null, context.getCacheDir());
            int i3 = setMin + 49;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return createTempFile;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int crc(byte[] bArr, int i, int i2, int i3) {
        while (true) {
            if (!(i < i2)) {
                return i3;
            }
            int i4 = setMax + 25;
            setMin = i4 % 128;
            if ((i4 % 2 == 0 ? 'b' : '8') != 'b') {
                i3 = CRC32_BYTES_MSBF[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
                i++;
            } else {
                try {
                    i3 = CRC32_BYTES_MSBF[((i3 / 62) | (bArr[i] & Ascii.CAN)) ^ 4723] ^ (i3 << 44);
                    i += 102;
                } catch (Exception e) {
                    throw e;
                }
            }
            try {
                int i5 = setMax + 1;
                setMin = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public static int getNetworkType(@Nullable Context context) {
        try {
            int i = setMax + 69;
            try {
                setMin = i % 128;
                int i2 = 2;
                int i3 = i % 2;
                boolean z = false;
                if (!(context == null)) {
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        if (!(connectivityManager != null)) {
                            return 0;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        int i4 = setMax + 29;
                        setMin = i4 % 128;
                        int i5 = i4 % 2;
                        if (activeNetworkInfo != null) {
                            z = true;
                        }
                        if (z) {
                            int i6 = setMin + 13;
                            setMax = i6 % 128;
                            int i7 = i6 % 2;
                            if (activeNetworkInfo.isConnected()) {
                                int type = activeNetworkInfo.getType();
                                if (type != 0) {
                                    if (type != 1) {
                                        if (type != 4) {
                                            i2 = 5;
                                            if (type != 5) {
                                                if (type != 6) {
                                                    return type != 9 ? 8 : 7;
                                                }
                                            }
                                        }
                                    }
                                    return i2;
                                }
                                return getMobileNetworkType(activeNetworkInfo);
                            }
                        }
                        return 1;
                    } catch (SecurityException unused) {
                        return 0;
                    }
                } else {
                    int i8 = setMin + 23;
                    setMax = i8 % 128;
                    if (i8 % 2 != 0) {
                    }
                    return 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if ((r5 == null) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if ((r5 != null) != true) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCountryCode(@androidx.annotation.Nullable android.content.Context r5) {
        /*
            int r0 = setMin
            int r0 = r0 + 109
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001c
            super.hashCode()     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == r3) goto L_0x0024
            goto L_0x006c
        L_0x001a:
            r5 = move-exception
            throw r5
        L_0x001c:
            if (r5 == 0) goto L_0x0020
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r0 == 0) goto L_0x0024
            goto L_0x006c
        L_0x0024:
            int r0 = setMin
            int r0 = r0 + 109
            int r4 = r0 % 128
            setMax = r4
            int r0 = r0 % 2
            java.lang.String r0 = "phone"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5
            r0 = 10
            if (r5 == 0) goto L_0x003c
            r4 = 3
            goto L_0x003e
        L_0x003c:
            r4 = 10
        L_0x003e:
            if (r4 == r0) goto L_0x006c
            java.lang.String r5 = r5.getNetworkCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = 1
        L_0x004c:
            if (r2 == 0) goto L_0x004f
            goto L_0x006c
        L_0x004f:
            int r0 = setMin     // Catch:{ Exception -> 0x006a }
            int r0 = r0 + 45
            int r2 = r0 % 128
            setMax = r2     // Catch:{ Exception -> 0x006a }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0065
            java.lang.String r5 = toUpperInvariant(r5)
            super.hashCode()     // Catch:{ all -> 0x0063 }
            return r5
        L_0x0063:
            r5 = move-exception
            throw r5
        L_0x0065:
            java.lang.String r5 = toUpperInvariant(r5)
            return r5
        L_0x006a:
            r5 = move-exception
            throw r5
        L_0x006c:
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getCountry()
            java.lang.String r5 = toUpperInvariant(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getCountryCode(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if ((r0 > 0) != true) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        if (r5.bytesLeft() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = r6.data;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002c, code lost:
        if (r0.length >= r5.bytesLeft()) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        if (r3 == true) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0033, code lost:
        r0 = new byte[(r5.bytesLeft() * 2)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        if (r7 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003d, code lost:
        r7 = new java.util.zip.Inflater();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        r7.setInput(r5.data, r5.getPosition(), r5.bytesLeft());
        r5 = setMin + 121;
        setMax = r5 % 128;
        r5 = r5 % 2;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5 = r5 + r7.inflate(r0, r5, r0.length - r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r7.finished() == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        r3 = setMax + 111;
        setMin = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6.reset(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        r7.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        if (r7.needsDictionary() != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
        if (r7.needsInput() == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0086, code lost:
        if (r5 != r0.length) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0088, code lost:
        r0 = java.util.Arrays.copyOf(r0, r0.length * 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0094, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0095, code lost:
        r7.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0098, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x009e, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean inflate(com.google.android.exoplayer2.util.ParsableByteArray r5, com.google.android.exoplayer2.util.ParsableByteArray r6, @androidx.annotation.Nullable java.util.zip.Inflater r7) {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x009f }
            int r0 = r0 + 79
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x009f }
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001e
            int r0 = r5.bytesLeft()
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x001c }
            if (r0 > 0) goto L_0x0018
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == r1) goto L_0x0025
            goto L_0x0024
        L_0x001c:
            r5 = move-exception
            throw r5
        L_0x001e:
            int r0 = r5.bytesLeft()
            if (r0 > 0) goto L_0x0025
        L_0x0024:
            return r2
        L_0x0025:
            byte[] r0 = r6.data     // Catch:{ Exception -> 0x009d }
            int r3 = r0.length
            int r4 = r5.bytesLeft()     // Catch:{ Exception -> 0x009d }
            if (r3 >= r4) goto L_0x0030
            r3 = 0
            goto L_0x0031
        L_0x0030:
            r3 = 1
        L_0x0031:
            if (r3 == r1) goto L_0x003b
            int r0 = r5.bytesLeft()
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
        L_0x003b:
            if (r7 != 0) goto L_0x0042
            java.util.zip.Inflater r7 = new java.util.zip.Inflater
            r7.<init>()
        L_0x0042:
            byte[] r3 = r5.data
            int r4 = r5.getPosition()
            int r5 = r5.bytesLeft()
            r7.setInput(r3, r4, r5)
            int r5 = setMin
            int r5 = r5 + 121
            int r3 = r5 % 128
            setMax = r3
            int r5 = r5 % 2
            r5 = 0
        L_0x005a:
            int r3 = r0.length     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            int r3 = r3 - r5
            int r3 = r7.inflate(r0, r5, r3)     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            int r5 = r5 + r3
            boolean r3 = r7.finished()     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            if (r3 == 0) goto L_0x0078
            int r3 = setMax
            int r3 = r3 + 111
            int r4 = r3 % 128
            setMin = r4
            int r3 = r3 % 2
            r6.reset(r0, r5)     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            r7.reset()
            return r1
        L_0x0078:
            boolean r3 = r7.needsDictionary()     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            if (r3 != 0) goto L_0x0090
            boolean r3 = r7.needsInput()     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            if (r3 == 0) goto L_0x0085
            goto L_0x0090
        L_0x0085:
            int r3 = r0.length     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            if (r5 != r3) goto L_0x005a
            int r3 = r0.length     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            int r3 = r3 * 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ DataFormatException -> 0x0099, all -> 0x0094 }
            goto L_0x005a
        L_0x0090:
            r7.reset()
            return r2
        L_0x0094:
            r5 = move-exception
            r7.reset()
            throw r5
        L_0x0099:
            r7.reset()
            return r2
        L_0x009d:
            r5 = move-exception
            throw r5
        L_0x009f:
            r5 = move-exception
            goto L_0x00a2
        L_0x00a1:
            throw r5
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.inflate(com.google.android.exoplayer2.util.ParsableByteArray, com.google.android.exoplayer2.util.ParsableByteArray, java.util.zip.Inflater):boolean");
    }

    public static Point getPhysicalDisplaySize(Context context) {
        int i = setMin + 61;
        setMax = i % 128;
        int i2 = i % 2;
        Point physicalDisplaySize = getPhysicalDisplaySize(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
        try {
            int i3 = setMax + 87;
            setMin = i3 % 128;
            if ((i3 % 2 == 0 ? '(' : 7) != '(') {
                return physicalDisplaySize;
            }
            int i4 = 23 / 0;
            return physicalDisplaySize;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if ((MODEL.startsWith("BRAVIA") ? com.alibaba.fastjson.parser.JSONLexer.EOI : 13) != 13) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (MODEL.equals("TPM171E") != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d3, code lost:
        if (MODEL.equals("TPM171E") != false) goto L_0x00d5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point getPhysicalDisplaySize(android.content.Context r8, android.view.Display r9) {
        /*
            java.lang.String r0 = "Util"
            int r1 = setMin     // Catch:{ Exception -> 0x01a2 }
            int r1 = r1 + 41
            int r2 = r1 % 128
            setMax = r2     // Catch:{ Exception -> 0x01a2 }
            r2 = 2
            int r1 = r1 % r2
            int r1 = SDK_INT
            r3 = 25
            r4 = 0
            r5 = 1
            if (r1 >= r3) goto L_0x013f
            int r1 = r9.getDisplayId()
            if (r1 != 0) goto L_0x013f
            java.lang.String r1 = MANUFACTURER
            java.lang.String r3 = "Sony"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0064
            int r1 = setMin
            int r1 = r1 + 57
            int r3 = r1 % 128
            setMax = r3
            int r1 = r1 % r2
            java.lang.String r3 = "BRAVIA"
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = MODEL
            boolean r1 = r1.startsWith(r3)
            int r3 = r4.length     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0064
            goto L_0x004e
        L_0x003b:
            r8 = move-exception
            throw r8
        L_0x003d:
            java.lang.String r1 = MODEL
            boolean r1 = r1.startsWith(r3)
            r3 = 13
            if (r1 == 0) goto L_0x004a
            r1 = 26
            goto L_0x004c
        L_0x004a:
            r1 = 13
        L_0x004c:
            if (r1 == r3) goto L_0x0064
        L_0x004e:
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r8 = r8.hasSystemFeature(r1)
            if (r8 == 0) goto L_0x0064
            android.graphics.Point r8 = new android.graphics.Point
            r9 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            r8.<init>(r9, r0)
            return r8
        L_0x0064:
            java.lang.String r8 = MANUFACTURER
            java.lang.String r1 = "NVIDIA"
            boolean r8 = r1.equals(r8)
            r1 = 0
            if (r8 == 0) goto L_0x0071
            r8 = 1
            goto L_0x0072
        L_0x0071:
            r8 = 0
        L_0x0072:
            if (r8 == 0) goto L_0x007e
            java.lang.String r8 = MODEL
            java.lang.String r3 = "SHIELD"
            boolean r8 = r8.contains(r3)
            if (r8 != 0) goto L_0x00d5
        L_0x007e:
            java.lang.String r8 = "philips"
            java.lang.String r3 = MANUFACTURER     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = toLowerInvariant(r3)     // Catch:{ Exception -> 0x013d }
            boolean r8 = r8.equals(r3)     // Catch:{ Exception -> 0x013d }
            if (r8 == 0) goto L_0x013f
            int r8 = setMax
            int r8 = r8 + 85
            int r3 = r8 % 128
            setMin = r3
            int r8 = r8 % r2
            java.lang.String r8 = MODEL
            java.lang.String r3 = "QM1"
            boolean r8 = r8.startsWith(r3)
            if (r8 != 0) goto L_0x00d5
            int r8 = setMax
            int r8 = r8 + 45
            int r3 = r8 % 128
            setMin = r3
            int r8 = r8 % r2
            java.lang.String r8 = MODEL
            java.lang.String r3 = "QV151E"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L_0x00d5
            int r8 = setMax
            int r8 = r8 + 51
            int r3 = r8 % 128
            setMin = r3
            int r8 = r8 % r2
            java.lang.String r3 = "TPM171E"
            if (r8 != 0) goto L_0x00cd
            java.lang.String r8 = MODEL
            boolean r8 = r8.equals(r3)
            r3 = 77
            int r3 = r3 / r1
            if (r8 == 0) goto L_0x013f
            goto L_0x00d5
        L_0x00cb:
            r8 = move-exception
            throw r8
        L_0x00cd:
            java.lang.String r8 = MODEL
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x013f
        L_0x00d5:
            java.lang.String r8 = "android.os.SystemProperties"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r3 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00f5 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch:{ Exception -> 0x00f5 }
            java.lang.reflect.Method r3 = r8.getMethod(r3, r6)     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r7 = "sys.display-size"
            r6[r1] = r7     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r8 = r3.invoke(r8, r6)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00fc
        L_0x00f5:
            r8 = move-exception
            java.lang.String r3 = "Failed to read sys.display-size"
            com.google.android.exoplayer2.util.Log.e(r0, r3, r8)
            r8 = r4
        L_0x00fc:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x013f
            java.lang.String r3 = r8.trim()     // Catch:{ NumberFormatException -> 0x012f }
            java.lang.String r6 = "x"
            java.lang.String[] r3 = split(r3, r6)     // Catch:{ NumberFormatException -> 0x012f }
            int r6 = r3.length     // Catch:{ NumberFormatException -> 0x012f }
            if (r6 != r2) goto L_0x0126
            r1 = r3[r1]     // Catch:{ NumberFormatException -> 0x012f }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x012f }
            r3 = r3[r5]     // Catch:{ NumberFormatException -> 0x012f }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x012f }
            if (r1 <= 0) goto L_0x0126
            if (r3 <= 0) goto L_0x0126
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x012f }
            r6.<init>(r1, r3)     // Catch:{ NumberFormatException -> 0x012f }
            return r6
        L_0x0126:
            int r1 = setMin
            int r1 = r1 + 67
            int r3 = r1 % 128
            setMax = r3
            int r1 = r1 % r2
        L_0x012f:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "Invalid sys.display-size: "
            java.lang.String r8 = r1.concat(r8)
            com.google.android.exoplayer2.util.Log.e(r0, r8)
            goto L_0x013f
        L_0x013d:
            r8 = move-exception
            goto L_0x018d
        L_0x013f:
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>()
            int r0 = SDK_INT     // Catch:{ Exception -> 0x01a2 }
            r1 = 23
            if (r0 < r1) goto L_0x014e
            getDisplaySizeV23(r9, r8)
            goto L_0x0191
        L_0x014e:
            int r0 = SDK_INT
            r1 = 17
            r3 = 5
            if (r0 < r1) goto L_0x0157
            r0 = 5
            goto L_0x0159
        L_0x0157:
            r0 = 74
        L_0x0159:
            if (r0 == r3) goto L_0x0172
            int r0 = SDK_INT
            r1 = 16
            r3 = 43
            if (r0 < r1) goto L_0x0166
            r0 = 98
            goto L_0x0168
        L_0x0166:
            r0 = 43
        L_0x0168:
            if (r0 == r3) goto L_0x016e
            getDisplaySizeV16(r9, r8)
            goto L_0x0191
        L_0x016e:
            getDisplaySizeV9(r9, r8)
            goto L_0x0191
        L_0x0172:
            int r0 = setMax
            int r0 = r0 + 69
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % r2
            r1 = 64
            if (r0 != 0) goto L_0x0182
            r0 = 14
            goto L_0x0184
        L_0x0182:
            r0 = 64
        L_0x0184:
            if (r0 == r1) goto L_0x018e
            getDisplaySizeV17(r9, r8)     // Catch:{ Exception -> 0x013d }
            int r9 = r4.length     // Catch:{ all -> 0x018b }
            goto L_0x0191
        L_0x018b:
            r8 = move-exception
            throw r8
        L_0x018d:
            throw r8
        L_0x018e:
            getDisplaySizeV17(r9, r8)
        L_0x0191:
            int r9 = setMin
            int r9 = r9 + r5
            int r0 = r9 % 128
            setMax = r0
            int r9 = r9 % r2
            if (r9 == 0) goto L_0x01a1
            super.hashCode()     // Catch:{ all -> 0x019f }
            return r8
        L_0x019f:
            r8 = move-exception
            throw r8
        L_0x01a1:
            return r8
        L_0x01a2:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.getPhysicalDisplaySize(android.content.Context, android.view.Display):android.graphics.Point");
    }

    @TargetApi(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        try {
            int i = setMin + 69;
            setMax = i % 128;
            int i2 = i % 2;
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            try {
                int i3 = setMax + 1;
                setMin = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @TargetApi(17)
    private static void getDisplaySizeV17(Display display, Point point) {
        int i = setMin + 117;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            display.getRealSize(point);
            int i3 = setMin + 87;
            setMax = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    @TargetApi(16)
    private static void getDisplaySizeV16(Display display, Point point) {
        try {
            int i = setMax + 103;
            setMin = i % 128;
            int i2 = i % 2;
            display.getSize(point);
            int i3 = setMin + 59;
            setMax = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void getDisplaySizeV9(Display display, Point point) {
        int i = setMax + 107;
        setMin = i % 128;
        if (!(i % 2 == 0)) {
            try {
                point.x = display.getWidth();
                point.y = display.getHeight();
            } catch (Exception e) {
                throw e;
            }
        } else {
            point.x = display.getWidth();
            point.y = display.getHeight();
            Object obj = null;
            super.hashCode();
        }
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                try {
                    int i = setMax + 59;
                    setMin = i % 128;
                    if ((i % 2 == 0 ? 10 : '^') != 10) {
                        return 3;
                    }
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return 3;
                } catch (Exception e) {
                    throw e;
                }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            default:
                int i2 = setMin + 107;
                setMax = i2 % 128;
                if ((i2 % 2 != 0 ? 'H' : '#') != 'H') {
                    return 6;
                }
                int i3 = 23 / 0;
                return 6;
        }
    }

    private static String getMax(char[] cArr, int i, byte b) {
        int i2 = setMin + 67;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr2 = length;
        char c = getMin;
        char[] cArr3 = new char[i];
        boolean z = false;
        if (i % 2 != 0) {
            int i4 = setMax + 67;
            setMin = i4 % 128;
            if (!(i4 % 2 != 0)) {
                i += 22;
                cArr3[i] = (char) (cArr[i] - b);
            } else {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
        }
        if (i > 1) {
            int i5 = 0;
            while (true) {
                if (!(i5 < i)) {
                    break;
                }
                char c2 = cArr[i5];
                int i6 = i5 + 1;
                char c3 = cArr[i6];
                if (c2 == c3) {
                    cArr3[i5] = (char) (c2 - b);
                    cArr3[i6] = (char) (c3 - b);
                } else {
                    int min = onActivityPreStopped.setMin(c2, c);
                    int length2 = onActivityPreStopped.length(c2, c);
                    int min2 = onActivityPreStopped.setMin(c3, c);
                    int length3 = onActivityPreStopped.length(c3, c);
                    if (length2 == length3) {
                        int max = onActivityPreStopped.setMax(min, c);
                        int max2 = onActivityPreStopped.setMax(min2, c);
                        int max3 = onActivityPreStopped.getMax(max, length2, c);
                        int max4 = onActivityPreStopped.getMax(max2, length3, c);
                        cArr3[i5] = cArr2[max3];
                        cArr3[i6] = cArr2[max4];
                    } else {
                        if (min == min2) {
                            int i7 = setMax + 37;
                            setMin = i7 % 128;
                            int i8 = i7 % 2;
                            int max5 = onActivityPreStopped.setMax(length2, c);
                            int max6 = onActivityPreStopped.setMax(length3, c);
                            int max7 = onActivityPreStopped.getMax(min, max5, c);
                            int max8 = onActivityPreStopped.getMax(min2, max6, c);
                            cArr3[i5] = cArr2[max7];
                            cArr3[i6] = cArr2[max8];
                        } else {
                            int max9 = onActivityPreStopped.getMax(min, length3, c);
                            int max10 = onActivityPreStopped.getMax(min2, length2, c);
                            cArr3[i5] = cArr2[max9];
                            cArr3[i6] = cArr2[max10];
                        }
                    }
                }
                i5 += 2;
            }
        }
        String str = new String(cArr3);
        int i9 = setMax + 117;
        setMin = i9 % 128;
        if (i9 % 2 != 0) {
            z = true;
        }
        if (z) {
            return str;
        }
        Object[] objArr = null;
        int length4 = objArr.length;
        return str;
    }
}
