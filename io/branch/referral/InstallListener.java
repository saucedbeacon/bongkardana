package io.branch.referral;

import android.content.BroadcastReceiver;
import android.content.Context;
import o.TinyMenuPopupWindow;
import o.onActivityPostCreated;
import o.startTinyAppAndCloseCurrent;

public class InstallListener extends BroadcastReceiver {
    private static int IsOverlapping = 1;
    private static char equals;
    private static getMin getMax;
    private static String getMin = "bnc_no_value";
    private static char isInside;
    private static char length;
    private static boolean setMax;
    private static boolean setMin;
    private static int toFloatRange;
    private static char toIntRange;
    static boolean unReportedReferrerAvailable;
    TinyMenuPopupWindow.AnonymousClass1.getMax installReferrerWrapperListener = new TinyMenuPopupWindow.AnonymousClass1.getMax() {
        public final void setMin(Context context, String str, long j, long j2) {
            startTinyAppAndCloseCurrent.toFloatRange("onReferrerClientFinished()");
            InstallListener.access$100(context, str, j, j2);
            if (InstallListener.access$200()) {
                InstallListener.access$000();
            }
        }

        public final void getMin() {
            startTinyAppAndCloseCurrent.toFloatRange("onReferrerClientError()");
            InstallListener.access$302(false);
        }
    };

    interface getMin {
        void IsOverlapping();
    }

    static void length() {
        length = 61701;
        toIntRange = 40045;
        equals = 26080;
        isInside = 1930;
    }

    static /* synthetic */ void access$000() {
        try {
            int i = toFloatRange + 123;
            try {
                IsOverlapping = i % 128;
                if (i % 2 == 0) {
                    getMax();
                    Object obj = null;
                    super.hashCode();
                    return;
                }
                getMax();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ void access$100(Context context, String str, long j, long j2) {
        int i = IsOverlapping + 103;
        toFloatRange = i % 128;
        if (!(i % 2 != 0)) {
            setMin(context, str, j, j2);
            return;
        }
        setMin(context, str, j, j2);
        Object[] objArr = null;
        int length2 = objArr.length;
    }

    static /* synthetic */ boolean access$200() {
        int i = toFloatRange + 63;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? 'P' : 'X') == 'X') {
            return setMin;
        }
        boolean z = setMin;
        Object obj = null;
        super.hashCode();
        return z;
    }

    static /* synthetic */ boolean access$302(boolean z) {
        try {
            int i = IsOverlapping + 65;
            toFloatRange = i % 128;
            boolean z2 = false;
            boolean z3 = i % 2 == 0;
            Object[] objArr = null;
            setMax = z;
            if (!z3) {
                int length2 = objArr.length;
            }
            int i2 = toFloatRange + 107;
            IsOverlapping = i2 % 128;
            if (i2 % 2 == 0) {
                z2 = true;
            }
            if (!z2) {
                return z;
            }
            super.hashCode();
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        try {
            length();
            getMin getmin = null;
            getMax = getmin;
            int i = toFloatRange + 103;
            IsOverlapping = i % 128;
            if (i % 2 == 0) {
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if ((r7) != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        setMin = true;
        setMax = new o.TinyMenuPopupWindow.AnonymousClass1(r4).length(r3.installReferrerWrapperListener);
        new java.util.Timer().schedule(new io.branch.referral.InstallListener.AnonymousClass3(r3), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if ((unReportedReferrerAvailable) != true) goto L_0x004b;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x004b=Splitter:B:32:0x004b, B:17:0x002e=Splitter:B:17:0x002e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void captureInstallReferrer(android.content.Context r4, long r5, io.branch.referral.InstallListener.getMin r7) {
        /*
            r3 = this;
            int r0 = toFloatRange
            int r0 = r0 + 43
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x001f
            getMax = r7
            boolean r7 = unReportedReferrerAvailable
            if (r7 == 0) goto L_0x001b
            r7 = 1
            goto L_0x001c
        L_0x001b:
            r7 = 0
        L_0x001c:
            if (r7 == r2) goto L_0x002e
            goto L_0x004b
        L_0x001f:
            getMax = r7
            boolean r7 = unReportedReferrerAvailable
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            if (r7 == 0) goto L_0x004b
        L_0x002e:
            getMax()     // Catch:{ Exception -> 0x0049 }
            int r4 = IsOverlapping
            int r4 = r4 + 33
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x003f
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r4 == r2) goto L_0x0043
            return
        L_0x0043:
            r4 = 31
            int r4 = r4 / r1
            return
        L_0x0047:
            r4 = move-exception
            throw r4
        L_0x0049:
            r4 = move-exception
            goto L_0x0068
        L_0x004b:
            setMin = r2     // Catch:{ Exception -> 0x0049 }
            o.TinyMenuPopupWindow$1 r7 = new o.TinyMenuPopupWindow$1     // Catch:{ Exception -> 0x0049 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0049 }
            o.TinyMenuPopupWindow$1$getMax r4 = r3.installReferrerWrapperListener     // Catch:{ Exception -> 0x0049 }
            boolean r4 = r7.length(r4)     // Catch:{ Exception -> 0x0049 }
            setMax = r4     // Catch:{ Exception -> 0x0049 }
            java.util.Timer r4 = new java.util.Timer     // Catch:{ Exception -> 0x0049 }
            r4.<init>()     // Catch:{ Exception -> 0x0049 }
            io.branch.referral.InstallListener$3 r7 = new io.branch.referral.InstallListener$3     // Catch:{ Exception -> 0x0049 }
            r7.<init>()     // Catch:{ Exception -> 0x0049 }
            r4.schedule(r7, r5)     // Catch:{ Exception -> 0x0049 }
            return
        L_0x0068:
            throw r4
        L_0x0069:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.InstallListener.captureInstallReferrer(android.content.Context, long, io.branch.referral.InstallListener$getMin):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if ((setMin) != true) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 + 17
            int r1 = r0 % 128
            toFloatRange = r1     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 % 2
            java.lang.String r1 = "referrer"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r5 = r12.getStringExtra(r1)
            r6 = 1
            r8 = 1
            r4 = r11
            setMin(r4, r5, r6, r8)
            boolean r11 = setMin
            if (r11 == 0) goto L_0x0022
            r11 = 1
            goto L_0x0023
        L_0x0022:
            r11 = 0
        L_0x0023:
            if (r11 == r2) goto L_0x003a
            goto L_0x0073
        L_0x0026:
            java.lang.String r5 = r12.getStringExtra(r1)
            r6 = 0
            r8 = 0
            r4 = r11
            setMin(r4, r5, r6, r8)
            boolean r11 = setMin
            if (r11 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            if (r2 == 0) goto L_0x0073
        L_0x003a:
            int r11 = toFloatRange
            int r11 = r11 + 57
            int r12 = r11 % 128
            IsOverlapping = r12
            int r11 = r11 % 2
            boolean r11 = setMax
            if (r11 != 0) goto L_0x0073
            int r11 = IsOverlapping
            int r11 = r11 + 69
            int r12 = r11 % 128
            toFloatRange = r12
            int r11 = r11 % 2
            r12 = 91
            if (r11 == 0) goto L_0x0059
            r11 = 94
            goto L_0x005b
        L_0x0059:
            r11 = 91
        L_0x005b:
            if (r11 == r12) goto L_0x0066
            getMax()     // Catch:{ Exception -> 0x0087 }
            r11 = 60
            int r11 = r11 / r3
            goto L_0x0069
        L_0x0064:
            r11 = move-exception
            throw r11
        L_0x0066:
            getMax()
        L_0x0069:
            int r11 = IsOverlapping
            int r11 = r11 + 97
            int r12 = r11 % 128
            toFloatRange = r12
            int r11 = r11 % 2
        L_0x0073:
            int r11 = toFloatRange     // Catch:{ Exception -> 0x0085 }
            int r11 = r11 + 9
            int r12 = r11 % 128
            IsOverlapping = r12     // Catch:{ Exception -> 0x0087 }
            int r11 = r11 % 2
            if (r11 != 0) goto L_0x0084
            r11 = 4
            int r11 = r11 / r3
            return
        L_0x0082:
            r11 = move-exception
            throw r11
        L_0x0084:
            return
        L_0x0085:
            r11 = move-exception
            throw r11
        L_0x0087:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.InstallListener.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if ((r1 > 1 ? 'F' : '\'') != 'F') goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r1 > 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0 A[Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void setMin(android.content.Context r22, java.lang.String r23, long r24, long r26) {
        /*
            r0 = r23
            r1 = r24
            r3 = r26
            java.lang.String r5 = "="
            int r6 = IsOverlapping
            int r6 = r6 + 33
            int r7 = r6 % 128
            toFloatRange = r7
            r7 = 2
            int r6 = r6 % r7
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0018
            r6 = 1
            goto L_0x0019
        L_0x0018:
            r6 = 0
        L_0x0019:
            r10 = 0
            if (r6 == 0) goto L_0x0030
            o.startTinyAppAndCloseCurrent.length((android.content.Context) r22)
            r12 = 1
            r6 = 70
            int r14 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x002b
            r12 = 70
            goto L_0x002d
        L_0x002b:
            r12 = 39
        L_0x002d:
            if (r12 == r6) goto L_0x0037
            goto L_0x003c
        L_0x0030:
            o.startTinyAppAndCloseCurrent.length((android.content.Context) r22)
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x003c
        L_0x0037:
            java.lang.String r6 = "bnc_referrer_click_ts"
            o.startTinyAppAndCloseCurrent.getMin((java.lang.String) r6, (long) r1)
        L_0x003c:
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x005e
            int r1 = toFloatRange
            int r1 = r1 + 107
            int r2 = r1 % 128
            IsOverlapping = r2
            int r1 = r1 % r7
            if (r1 != 0) goto L_0x004d
            r1 = 0
            goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            java.lang.String r2 = "bnc_install_begin_ts"
            if (r1 == r9) goto L_0x005b
            o.startTinyAppAndCloseCurrent.getMin((java.lang.String) r2, (long) r3)
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x005b:
            o.startTinyAppAndCloseCurrent.getMin((java.lang.String) r2, (long) r3)
        L_0x005e:
            if (r0 == 0) goto L_0x0213
            r1 = 6
            char[] r2 = new char[r1]     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r3 = 22204(0x56bc, float:3.1114E-41)
            r2[r8] = r3     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r4 = 24374(0x5f36, float:3.4155E-41)
            r2[r9] = r4     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r6 = 22661(0x5885, float:3.1755E-41)
            r2[r7] = r6     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r10 = 47847(0xbae7, float:6.7048E-41)
            r11 = 3
            r2[r11] = r10     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r12 = 14481(0x3891, float:2.0292E-41)
            r13 = 4
            r2[r13] = r12     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r14 = 34523(0x86db, float:4.8377E-41)
            r15 = 5
            r2[r15] = r14     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r2 = length(r2)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r2 = r2.intern()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r14 = "&"
            java.lang.String[] r14 = r0.split(r14)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            int r15 = r14.length     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r12 = 0
        L_0x0099:
            r13 = 10
            if (r12 >= r15) goto L_0x00a2
            r16 = 20
            r10 = 20
            goto L_0x00a4
        L_0x00a2:
            r10 = 10
        L_0x00a4:
            if (r10 == r13) goto L_0x015f
            int r10 = IsOverlapping
            int r10 = r10 + 91
            int r13 = r10 % 128
            toFloatRange = r13
            int r10 = r10 % r7
            r10 = r14[r12]     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            if (r13 != 0) goto L_0x013c
            boolean r13 = r10.contains(r5)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r11 = "-"
            if (r13 != 0) goto L_0x00d8
            boolean r13 = r10.contains(r11)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r6 = 50
            if (r13 == 0) goto L_0x00ca
            r13 = 77
            goto L_0x00cc
        L_0x00ca:
            r13 = 50
        L_0x00cc:
            if (r13 == r6) goto L_0x00d8
            int r6 = IsOverlapping
            int r6 = r6 + 117
            int r13 = r6 % 128
            toFloatRange = r13
            int r6 = r6 % r7
            goto L_0x00d9
        L_0x00d8:
            r11 = r5
        L_0x00d9:
            java.lang.String[] r6 = r10.split(r11)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            int r10 = r6.length     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            if (r10 <= r9) goto L_0x013c
            r10 = r6[r8]     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            char[] r11 = new char[r1]     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r11[r8] = r3     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r11[r9] = r4     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r13 = 22661(0x5885, float:3.1755E-41)
            r11[r7] = r13     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r13 = 47847(0xbae7, float:6.7048E-41)
            r16 = 3
            r11[r16] = r13     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r13 = 14481(0x3891, float:2.0292E-41)
            r18 = 4
            r11[r18] = r13     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r13 = 34523(0x86db, float:4.8377E-41)
            r18 = 5
            r11[r18] = r13     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r11 = length(r11)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r11 = r11.intern()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r10 = java.net.URLDecoder.decode(r10, r11)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r6 = r6[r9]     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            char[] r11 = new char[r1]     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r11[r8] = r3     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r11[r9] = r4     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r13 = 22661(0x5885, float:3.1755E-41)
            r11[r7] = r13     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r16 = 47847(0xbae7, float:6.7048E-41)
            r17 = 3
            r11[r17] = r16     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r18 = 14481(0x3891, float:2.0292E-41)
            r19 = 4
            r11[r19] = r18     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r20 = 34523(0x86db, float:4.8377E-41)
            r21 = 5
            r11[r21] = r20     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r11 = length(r11)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r11 = r11.intern()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r2.put(r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            goto L_0x014c
        L_0x013c:
            r13 = 22661(0x5885, float:3.1755E-41)
            r16 = 47847(0xbae7, float:6.7048E-41)
            r17 = 3
            r18 = 14481(0x3891, float:2.0292E-41)
            r19 = 4
            r20 = 34523(0x86db, float:4.8377E-41)
            r21 = 5
        L_0x014c:
            int r12 = r12 + 1
            int r6 = IsOverlapping
            int r6 = r6 + 43
            int r10 = r6 % 128
            toFloatRange = r10
            int r6 = r6 % r7
            r6 = 22661(0x5885, float:3.1755E-41)
            r10 = 47847(0xbae7, float:6.7048E-41)
            r11 = 3
            goto L_0x0099
        L_0x015f:
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.LinkClickID     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            boolean r1 = r2.containsKey(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            if (r1 == 0) goto L_0x017e
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.LinkClickID     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            getMin = r1     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r3 = "bnc_link_click_identifier"
            o.startTinyAppAndCloseCurrent.length((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
        L_0x017e:
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.IsFullAppConv     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            boolean r1 = r2.containsKey(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            if (r1 == 0) goto L_0x018b
            goto L_0x018c
        L_0x018b:
            r9 = 0
        L_0x018c:
            if (r9 == 0) goto L_0x01c4
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.ReferringLink     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            boolean r1 = r2.containsKey(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            if (r1 == 0) goto L_0x01c4
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.IsFullAppConv     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r3 = "bnc_is_full_app_conversion"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            o.startTinyAppAndCloseCurrent.getMax((java.lang.String) r3, (java.lang.Boolean) r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.ReferringLink     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r3 = "bnc_app_link"
            o.startTinyAppAndCloseCurrent.length((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
        L_0x01c4:
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.GoogleSearchInstallReferrer     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            boolean r1 = r2.containsKey(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            if (r1 == 0) goto L_0x020c
            int r1 = toFloatRange
            int r1 = r1 + 35
            int r3 = r1 % 128
            IsOverlapping = r3
            int r1 = r1 % r7
            java.lang.String r3 = "bnc_google_search_install_identifier"
            if (r1 != 0) goto L_0x01f8
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.GoogleSearchInstallReferrer     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            o.startTinyAppAndCloseCurrent.length((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = "bnc_google_play_install_referrer_extras"
            o.startTinyAppAndCloseCurrent.length((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            r0 = 96
            int r0 = r0 / r8
            goto L_0x020c
        L_0x01f5:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x01f8:
            io.branch.referral.Defines$Jsonkey r1 = io.branch.referral.Defines.Jsonkey.GoogleSearchInstallReferrer     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = r1.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            o.startTinyAppAndCloseCurrent.length((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
            java.lang.String r1 = "bnc_google_play_install_referrer_extras"
            o.startTinyAppAndCloseCurrent.length((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ UnsupportedEncodingException -> 0x0213, IllegalArgumentException -> 0x020d }
        L_0x020c:
            return
        L_0x020d:
            java.lang.String r0 = "Illegal characters in url encoded string"
            o.startTinyAppAndCloseCurrent.toFloatRange(r0)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.InstallListener.setMin(android.content.Context, java.lang.String, long, long):void");
    }

    public static String getInstallationID() {
        int i = toFloatRange + 63;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        String str = getMin;
        int i3 = IsOverlapping + 97;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static void getMax() {
        try {
            int i = IsOverlapping + 99;
            toFloatRange = i % 128;
            if (i % 2 != 0) {
                unReportedReferrerAvailable = false;
                if (getMax == null) {
                    return;
                }
            } else {
                unReportedReferrerAvailable = true;
                if ((getMax != null ? '!' : 'O') != '!') {
                    return;
                }
            }
            getMax.IsOverlapping();
            getMax = null;
            unReportedReferrerAvailable = false;
            setMin = false;
            setMax = false;
            int i2 = IsOverlapping + 57;
            toFloatRange = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String length(char[] cArr) {
        int i = IsOverlapping + 105;
        toFloatRange = i % 128;
        int i2 = i % 2;
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i3 = IsOverlapping + 1;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            if (i5 >= cArr.length) {
                return new String(cArr2, 1, cArr2[0]);
            }
            int i6 = toFloatRange + 49;
            IsOverlapping = i6 % 128;
            int i7 = i6 % 2;
            cArr3[0] = cArr[i5];
            int i8 = i5 + 1;
            cArr3[1] = cArr[i8];
            try {
                try {
                    onActivityPostCreated.setMax(cArr3, length, isInside, toIntRange, equals);
                    cArr2[i5] = cArr3[0];
                    cArr2[i8] = cArr3[1];
                    i5 += 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }
}
