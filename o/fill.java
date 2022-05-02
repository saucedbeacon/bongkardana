package o;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClientImpl;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class fill implements inflateMenu {
    private static String getMin = "MixpanelAPI.InstallReferrerPlay";
    private static char[] hashCode = null;
    private static boolean isInside = false;
    protected static final Pattern setMax = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");
    private static int toDoubleRange = 1;
    private static int toString;
    private int FastBitmap$CoordinateSystem;
    private final Pattern IsOverlapping = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");
    private InstallReferrerClient equals;
    private final Pattern getMax = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");
    private final Pattern length = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");
    private final Pattern setMin = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");
    private length toFloatRange;
    private Context toIntRange;
    private Timer values;

    interface length {
        void length();
    }

    static void getMax() {
        hashCode = new char[]{'4', 'g', '`', 'L', 'E'};
    }

    static {
        getMax();
        boolean z = false;
        int i = toString + 67;
        toDoubleRange = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (z) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public fill(Context context, length length2) {
        this.toIntRange = context;
        this.toFloatRange = length2;
        this.FastBitmap$CoordinateSystem = 0;
        this.values = new Timer();
    }

    public final void onInstallReferrerServiceDisconnected() {
        int i = toString + 107;
        toDoubleRange = i % 128;
        int i2 = i % 2;
        findOnePartiallyOrCompletelyInvisibleChild.length();
        setMin();
        int i3 = toString + 31;
        toDoubleRange = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void getMin() {
        int i = toString + 59;
        toDoubleRange = i % 128;
        int i2 = i % 2;
        try {
            Context context = InstallReferrerClient.setMax(this.toIntRange).setMin;
            if (context != null) {
                InstallReferrerClientImpl installReferrerClientImpl = new InstallReferrerClientImpl(context);
                this.equals = installReferrerClientImpl;
                installReferrerClientImpl.setMin(this);
                isInside = true;
                try {
                    int i3 = toString + 49;
                    try {
                        toDoubleRange = i3 % 128;
                        if ((i3 % 2 == 0 ? 'X' : 4) == 'X') {
                            int i4 = 12 / 0;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
        } catch (SecurityException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
    }

    private void setMin() {
        if (this.FastBitmap$CoordinateSystem > 5) {
            try {
                int i = toString + 111;
                try {
                    toDoubleRange = i % 128;
                    boolean z = false;
                    if (i % 2 == 0) {
                        findOnePartiallyOrCompletelyInvisibleChild.length();
                        int i2 = 98 / 0;
                        if (this.equals == null) {
                            return;
                        }
                    } else {
                        findOnePartiallyOrCompletelyInvisibleChild.length();
                        if (this.equals == null) {
                            return;
                        }
                    }
                    int i3 = toDoubleRange + 47;
                    toString = i3 % 128;
                    int i4 = i3 % 2;
                    if (!(!this.equals.length())) {
                        int i5 = toDoubleRange + 1;
                        toString = i5 % 128;
                        if (i5 % 2 == 0) {
                            z = true;
                        }
                        if (!z) {
                            try {
                                this.equals.getMax();
                                Object[] objArr = null;
                                int length2 = objArr.length;
                            } catch (Exception unused) {
                                findOnePartiallyOrCompletelyInvisibleChild.values();
                            }
                        } else {
                            this.equals.getMax();
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            this.values.schedule(new TimerTask() {
                public final void run() {
                    fill.this.getMin();
                }
            }, 2500);
            this.FastBitmap$CoordinateSystem++;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String] */
    private static String setMax(Matcher matcher) {
        ? r1 = 0;
        if (matcher.find()) {
            int i = toDoubleRange + 97;
            toString = i % 128;
            int i2 = i % 2;
            String group = matcher.group(2);
            if ((group != null ? '#' : '@') == '#') {
                try {
                    String decode = URLDecoder.decode(group, getMax(new int[]{0, 5, 19, 0}, new byte[]{0, 1, 0, 1, 1}, !PhoneNumberUtils.isISODigit('0')).intern());
                    int i3 = toDoubleRange + 85;
                    toString = i3 % 128;
                    if ((i3 % 2 != 0 ? 'Z' : '.') != 'Z') {
                        return decode;
                    }
                    int length2 = r1.length;
                    return decode;
                } catch (UnsupportedEncodingException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                }
            }
        }
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInstallReferrerSetupFinished(int r8) {
        /*
            r7 = this;
            int r0 = toString
            int r0 = r0 + 95
            int r1 = r0 % 128
            toDoubleRange = r1
            r1 = 2
            int r0 = r0 % r1
            r0 = -1
            r2 = 0
            r3 = 1
            if (r8 == r0) goto L_0x00e0
            if (r8 == 0) goto L_0x0024
            if (r8 == r3) goto L_0x00e0
            if (r8 == r1) goto L_0x001d
            r0 = 3
            if (r8 == r0) goto L_0x001a
            goto L_0x00d9
        L_0x001a:
            r8 = 0
            goto L_0x00e1
        L_0x001d:
            o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ Exception -> 0x0022 }
            goto L_0x00d9
        L_0x0022:
            r8 = move-exception
            throw r8
        L_0x0024:
            com.android.installreferrer.api.InstallReferrerClient r8 = r7.equals     // Catch:{ Exception -> 0x00db }
            o.setContentInsetsAbsolute r8 = r8.getMin()     // Catch:{ Exception -> 0x00db }
            android.os.Bundle r8 = r8.setMin     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "install_referrer"
            java.lang.String r8 = r8.getString(r0)     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x00d9
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00db }
            r0.<init>()     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = "referrer"
            r0.put(r4, r8)     // Catch:{ Exception -> 0x00db }
            java.util.regex.Pattern r4 = setMax     // Catch:{ Exception -> 0x00db }
            java.util.regex.Matcher r4 = r4.matcher(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = setMax(r4)     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x0050
            java.lang.String r5 = "utm_source"
            r0.put(r5, r4)     // Catch:{ Exception -> 0x00db }
        L_0x0050:
            java.util.regex.Pattern r4 = r7.length     // Catch:{ Exception -> 0x00db }
            java.util.regex.Matcher r4 = r4.matcher(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = setMax(r4)     // Catch:{ Exception -> 0x00db }
            r5 = 96
            if (r4 == 0) goto L_0x0061
            r6 = 96
            goto L_0x0063
        L_0x0061:
            r6 = 11
        L_0x0063:
            if (r6 == r5) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            java.lang.String r5 = "utm_medium"
            r0.put(r5, r4)     // Catch:{ Exception -> 0x00db }
        L_0x006c:
            java.util.regex.Pattern r4 = r7.getMax     // Catch:{ Exception -> 0x00db }
            java.util.regex.Matcher r4 = r4.matcher(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = setMax(r4)     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x007e
            java.lang.String r5 = "utm_campaign"
            r0.put(r5, r4)     // Catch:{ Exception -> 0x00db }
        L_0x007e:
            java.util.regex.Pattern r4 = r7.setMin     // Catch:{ Exception -> 0x00db }
            java.util.regex.Matcher r4 = r4.matcher(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = setMax(r4)     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x008c
            r5 = 0
            goto L_0x008d
        L_0x008c:
            r5 = 1
        L_0x008d:
            if (r5 == 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            java.lang.String r5 = "utm_content"
            r0.put(r5, r4)     // Catch:{ Exception -> 0x00db }
        L_0x0096:
            java.util.regex.Pattern r4 = r7.IsOverlapping     // Catch:{ Exception -> 0x00db }
            java.util.regex.Matcher r8 = r4.matcher(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = setMax(r8)     // Catch:{ Exception -> 0x00db }
            r4 = 53
            if (r8 == 0) goto L_0x00a7
            r5 = 61
            goto L_0x00a9
        L_0x00a7:
            r5 = 53
        L_0x00a9:
            if (r5 == r4) goto L_0x00ba
            int r4 = toString
            int r4 = r4 + 49
            int r5 = r4 % 128
            toDoubleRange = r5
            int r4 = r4 % r1
            java.lang.String r4 = "utm_term"
            r0.put(r4, r8)     // Catch:{ Exception -> 0x00db }
        L_0x00ba:
            android.content.Context r8 = r7.toIntRange     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = "com.mixpanel.android.mpmetrics.ReferralInfo"
            o.findReferenceChild.getMax(r8, r4, r0)     // Catch:{ Exception -> 0x00db }
            o.fill$length r8 = r7.toFloatRange     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x00c7
            r8 = 0
            goto L_0x00c8
        L_0x00c7:
            r8 = 1
        L_0x00c8:
            if (r8 == 0) goto L_0x00cb
            goto L_0x00d9
        L_0x00cb:
            int r8 = toDoubleRange
            int r8 = r8 + 35
            int r0 = r8 % 128
            toString = r0
            int r8 = r8 % r1
            o.fill$length r8 = r7.toFloatRange     // Catch:{ Exception -> 0x00db }
            r8.length()     // Catch:{ Exception -> 0x00db }
        L_0x00d9:
            r8 = 0
            goto L_0x00e4
        L_0x00db:
            o.findOnePartiallyOrCompletelyInvisibleChild.getMin()
            r8 = 1
            goto L_0x00e4
        L_0x00e0:
            r8 = 1
        L_0x00e1:
            o.findOnePartiallyOrCompletelyInvisibleChild.length()
        L_0x00e4:
            r0 = 54
            if (r8 == 0) goto L_0x00ea
            r8 = 0
            goto L_0x00ec
        L_0x00ea:
            r8 = 54
        L_0x00ec:
            if (r8 == r0) goto L_0x00f2
            r7.setMin()
            return
        L_0x00f2:
            com.android.installreferrer.api.InstallReferrerClient r8 = r7.equals
            r0 = 28
            if (r8 == 0) goto L_0x00fb
            r8 = 47
            goto L_0x00fd
        L_0x00fb:
            r8 = 28
        L_0x00fd:
            if (r8 == r0) goto L_0x011e
            com.android.installreferrer.api.InstallReferrerClient r8 = r7.equals
            boolean r8 = r8.length()
            if (r8 == 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r2 = 1
        L_0x0109:
            if (r2 == 0) goto L_0x010c
            goto L_0x011e
        L_0x010c:
            com.android.installreferrer.api.InstallReferrerClient r8 = r7.equals     // Catch:{ Exception -> 0x011b }
            r8.getMax()     // Catch:{ Exception -> 0x011b }
            int r8 = toDoubleRange
            int r8 = r8 + 103
            int r0 = r8 % 128
            toString = r0
            int r8 = r8 % r1
            return
        L_0x011b:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fill.onInstallReferrerSetupFinished(int):void");
    }

    private static String getMax(int[] iArr, byte[] bArr, boolean z) {
        char c;
        int i;
        char[] cArr;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = new char[i3];
        System.arraycopy(hashCode, i2, cArr2, 0, i3);
        if (bArr != null) {
            int i6 = toDoubleRange + 11;
            toString = i6 % 128;
            if (i6 % 2 != 0) {
                cArr = new char[i3];
                i = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                i = 0;
                c = 0;
            }
            while (true) {
                if ((i < i3 ? '!' : '`') == '`') {
                    break;
                }
                if (bArr[i] != 1) {
                    cArr[i] = (char) ((cArr2[i] << 1) - c);
                } else {
                    cArr[i] = (char) (((cArr2[i] << 1) + 1) - c);
                }
                c = cArr[i];
                i++;
            }
            cArr2 = cArr;
        }
        if (i5 > 0) {
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i7 = i3 - i5;
            System.arraycopy(cArr3, 0, cArr2, i7, i5);
            System.arraycopy(cArr3, i5, cArr2, 0, i7);
            try {
                int i8 = toDoubleRange + 21;
                try {
                    toString = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (z) {
            char[] cArr4 = new char[i3];
            int i10 = 0;
            while (true) {
                if ((i10 < i3 ? '.' : 'C') != '.') {
                    break;
                }
                cArr4[i10] = cArr2[(i3 - i10) - 1];
                i10++;
            }
            cArr2 = cArr4;
        }
        if (i4 > 0) {
            for (int i11 = 0; i11 < i3; i11++) {
                cArr2[i11] = (char) (cArr2[i11] - iArr[2]);
            }
        }
        return new String(cArr2);
    }
}
