package com.alipay.mobile.security.bio.workspace;

import android.content.Context;

public class PbToBioApp extends BaseBioParameterToBioApp {
    private static int getMax = 0;
    private static char[] getMin = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    private static char length = '\u0003';
    private static int setMax = 1;

    public PbToBioApp(Context context, BioTransfer bioTransfer) {
        super(context, bioTransfer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0190, code lost:
        if (r6.containsKey(com.alipay.mobile.security.bio.api.BioDetector.EXT_KEY_RETRY_UI_TYPE) != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f4, code lost:
        if ((!r6.isEmpty() ? (char) 16 : 13) != 13) goto L_0x01f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c A[SYNTHETIC, Splitter:B:19:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0134 A[Catch:{ all -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135 A[Catch:{ all -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.mobile.security.bio.service.BioAppDescription toBioApp(com.alipay.mobile.security.bio.api.BioParameter r17) {
        /*
            r16 = this;
            java.lang.String r0 = "mock"
            if (r17 == 0) goto L_0x023a
            java.lang.String r1 = r17.getProtocol()
            com.alipay.mobile.security.bio.service.BioAppDescription r2 = new com.alipay.mobile.security.bio.service.BioAppDescription
            r2.<init>()
            java.lang.String r3 = r17.getRemoteURL()
            r2.setRemoteURL(r3)
            java.lang.String r3 = r17.getHeadImageUrl()
            r2.setHeadImageURL(r3)
            byte[] r1 = r1.getBytes()     // Catch:{ all -> 0x0239 }
            r3 = 10
            byte[] r1 = android.util.Base64.decode(r1, r3)     // Catch:{ all -> 0x0239 }
            o.isRunning r3 = new o.isRunning     // Catch:{ all -> 0x0239 }
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0239 }
            r3.<init>((java.lang.Class<?>[]) r5)     // Catch:{ all -> 0x0239 }
            java.lang.Class<com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigPB> r5 = com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigPB.class
            com.zoloz.wire.Message r1 = r3.parseFrom((byte[]) r1, r5)     // Catch:{ all -> 0x0239 }
            com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigPB r1 = (com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigPB) r1     // Catch:{ all -> 0x0239 }
            com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigContentPB r3 = r1.content     // Catch:{ all -> 0x0239 }
            com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigContentPB r5 = r1.content     // Catch:{ all -> 0x0239 }
            java.lang.String r5 = r5.androidcfg     // Catch:{ all -> 0x0239 }
            java.util.Map r6 = r17.getExtProperty()     // Catch:{ all -> 0x0239 }
            r7 = 2
            if (r6 == 0) goto L_0x0066
            int r8 = setMax
            int r8 = r8 + 35
            int r9 = r8 % 128
            getMax = r9
            int r8 = r8 % r7
            boolean r8 = r6.containsKey(r0)     // Catch:{ all -> 0x0239 }
            r9 = 42
            if (r8 == 0) goto L_0x0056
            r8 = 42
            goto L_0x0058
        L_0x0056:
            r8 = 9
        L_0x0058:
            if (r8 == r9) goto L_0x005b
            goto L_0x0066
        L_0x005b:
            java.lang.Object r0 = r6.remove(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0239 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x0239 }
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            java.lang.String r8 = ""
            r10 = 1
            if (r0 == 0) goto L_0x014d
            o.printConnMonitorLog r0 = r1.sign     // Catch:{ all -> 0x0239 }
            if (r0 == 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x0131
            int r0 = getEnv(r5)     // Catch:{ all -> 0x0239 }
            if (r7 != r0) goto L_0x0090
            int r0 = getMax
            int r0 = r0 + 111
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % r7
            int r0 = setMax
            int r0 = r0 + 45
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r7
            r0 = 1
            goto L_0x0132
        L_0x0090:
            r11 = 94
            r12 = 4
            r13 = 3
            r14 = 5
            if (r0 != r10) goto L_0x00e2
            java.util.Map r0 = r17.getExtProperty()     // Catch:{ all -> 0x0239 }
            java.lang.String r15 = "public_key_test"
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0239 }
            java.io.ByteArrayInputStream r15 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0239 }
            char[] r9 = new char[r14]     // Catch:{ all -> 0x0239 }
            r9[r4] = r10     // Catch:{ all -> 0x0239 }
            r9[r10] = r7     // Catch:{ all -> 0x0239 }
            r9[r7] = r4     // Catch:{ all -> 0x0239 }
            r9[r13] = r14     // Catch:{ all -> 0x0239 }
            r9[r12] = r11     // Catch:{ all -> 0x0239 }
            int r11 = android.graphics.ImageFormat.getBitsPerPixel(r4)     // Catch:{ all -> 0x0239 }
            int r11 = r11 + 6
            int r12 = android.graphics.Color.alpha(r4)     // Catch:{ all -> 0x0239 }
            r13 = 38
            int r12 = r12 + r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x0239 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x0239 }
            java.lang.String r9 = r9.intern()     // Catch:{ all -> 0x0239 }
            byte[] r0 = r0.getBytes(r9)     // Catch:{ all -> 0x0239 }
            r15.<init>(r0)     // Catch:{ all -> 0x0239 }
            com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigContentPB r0 = r1.content     // Catch:{ all -> 0x0239 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0239 }
            o.printConnMonitorLog r1 = r1.sign     // Catch:{ all -> 0x0239 }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x0239 }
            boolean r0 = com.alipay.mobile.security.bio.utils.RSASign.doCheck(r0, r1, r15)     // Catch:{ all -> 0x0239 }
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r15)     // Catch:{ all -> 0x0239 }
            goto L_0x0132
        L_0x00e2:
            if (r0 != 0) goto L_0x0131
            java.util.Map r0 = r17.getExtProperty()     // Catch:{ all -> 0x0239 }
            java.lang.String r9 = "public_key_prod"
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0239 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0239 }
            char[] r15 = new char[r14]     // Catch:{ all -> 0x0239 }
            r15[r4] = r10     // Catch:{ all -> 0x0239 }
            r15[r10] = r7     // Catch:{ all -> 0x0239 }
            r15[r7] = r4     // Catch:{ all -> 0x0239 }
            r15[r13] = r14     // Catch:{ all -> 0x0239 }
            r15[r12] = r11     // Catch:{ all -> 0x0239 }
            int r11 = android.os.Process.myPid()     // Catch:{ all -> 0x0239 }
            int r11 = r11 >> 22
            int r14 = r14 - r11
            int r11 = android.view.KeyEvent.keyCodeFromString(r8)     // Catch:{ all -> 0x0239 }
            r12 = 38
            int r11 = 38 - r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0239 }
            java.lang.String r11 = setMin(r15, r14, r11)     // Catch:{ all -> 0x0239 }
            java.lang.String r11 = r11.intern()     // Catch:{ all -> 0x0239 }
            byte[] r0 = r0.getBytes(r11)     // Catch:{ all -> 0x0239 }
            r9.<init>(r0)     // Catch:{ all -> 0x0239 }
            com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigContentPB r0 = r1.content     // Catch:{ all -> 0x0239 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0239 }
            o.printConnMonitorLog r1 = r1.sign     // Catch:{ all -> 0x0239 }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x0239 }
            boolean r0 = com.alipay.mobile.security.bio.utils.RSASign.doCheck(r0, r1, r9)     // Catch:{ all -> 0x0239 }
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r9)     // Catch:{ all -> 0x0239 }
            goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            if (r0 == 0) goto L_0x0135
            goto L_0x014d
        L_0x0135:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0239 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0239 }
            java.lang.String r3 = "protocol check sign failed. env="
            r1.<init>(r3)     // Catch:{ all -> 0x0239 }
            com.alipay.mobile.security.bio.workspace.Env r3 = com.alipay.mobile.security.bio.service.BioServiceManager.getEnv()     // Catch:{ all -> 0x0239 }
            r1.append(r3)     // Catch:{ all -> 0x0239 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0239 }
            r0.<init>(r1)     // Catch:{ all -> 0x0239 }
            throw r0     // Catch:{ all -> 0x0239 }
        L_0x014d:
            java.lang.Integer r0 = r3.type     // Catch:{ all -> 0x0239 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0239 }
            r2.setBioType(r0)     // Catch:{ all -> 0x0239 }
            int r0 = getUi(r5)     // Catch:{ all -> 0x0239 }
            if (r6 == 0) goto L_0x015f
            r13 = 89
            goto L_0x0161
        L_0x015f:
            r13 = 38
        L_0x0161:
            r1 = 13
            r9 = 38
            if (r13 == r9) goto L_0x01af
            int r9 = getMax
            int r9 = r9 + r1
            int r11 = r9 % 128
            setMax = r11
            int r9 = r9 % r7
            boolean r9 = r6.isEmpty()     // Catch:{ all -> 0x0239 }
            if (r9 != 0) goto L_0x01af
            int r9 = getMax
            int r9 = r9 + 119
            int r11 = r9 % 128
            setMax = r11
            int r9 = r9 % r7
            java.lang.String r11 = "retryUiType"
            if (r9 != 0) goto L_0x018c
            boolean r9 = r6.containsKey(r11)     // Catch:{ all -> 0x0239 }
            r12 = 60
            int r12 = r12 / r4
            if (r9 == 0) goto L_0x01af
            goto L_0x0192
        L_0x018c:
            boolean r9 = r6.containsKey(r11)     // Catch:{ all -> 0x0239 }
            if (r9 == 0) goto L_0x01af
        L_0x0192:
            java.lang.Object r9 = r6.remove(r11)     // Catch:{ all -> 0x0239 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0239 }
            int r11 = java.lang.Integer.parseInt(r9)     // Catch:{ all -> 0x0239 }
            if (r0 == r11) goto L_0x01af
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r8.concat(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r5.replace(r0, r9)     // Catch:{ all -> 0x0239 }
            r2.setCfg(r0)     // Catch:{ all -> 0x0239 }
            r0 = r11
            goto L_0x01b2
        L_0x01af:
            r2.setCfg(r5)     // Catch:{ all -> 0x0239 }
        L_0x01b2:
            r2.setBioAction(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = r3.token     // Catch:{ all -> 0x0239 }
            r2.setBistoken(r0)     // Catch:{ all -> 0x0239 }
            boolean r0 = r17.isAutoClose()     // Catch:{ all -> 0x0239 }
            r2.setAutoClose(r0)     // Catch:{ all -> 0x0239 }
            android.os.Bundle r0 = r17.getBundle()     // Catch:{ all -> 0x0239 }
            r2.setBundle(r0)     // Catch:{ all -> 0x0239 }
            if (r6 == 0) goto L_0x01cc
            r0 = 1
            goto L_0x01cd
        L_0x01cc:
            r0 = 0
        L_0x01cd:
            if (r0 == r10) goto L_0x01d0
            goto L_0x0230
        L_0x01d0:
            int r0 = setMax
            int r0 = r0 + 65
            int r3 = r0 % 128
            getMax = r3
            int r0 = r0 % r7
            if (r0 == 0) goto L_0x01e9
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0239 }
            r1 = 84
            int r1 = r1 / r4
            if (r0 != 0) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            r4 = 1
        L_0x01e6:
            if (r4 == 0) goto L_0x01f6
            goto L_0x0230
        L_0x01e9:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0239 }
            if (r0 != 0) goto L_0x01f2
            r0 = 16
            goto L_0x01f4
        L_0x01f2:
            r0 = 13
        L_0x01f4:
            if (r0 == r1) goto L_0x0230
        L_0x01f6:
            int r0 = getMax
            int r0 = r0 + 101
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % r7
            if (r0 != 0) goto L_0x020c
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x0239 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0239 }
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0239 }
            goto L_0x0214
        L_0x020c:
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x0239 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0239 }
        L_0x0214:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0239 }
            if (r1 == 0) goto L_0x0230
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0239 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0239 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x0239 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0239 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0239 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0239 }
            r2.addExtProperty(r3, r1)     // Catch:{ all -> 0x0239 }
            goto L_0x0214
        L_0x0230:
            int r0 = getMax
            int r0 = r0 + 29
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % r7
        L_0x0239:
            return r2
        L_0x023a:
            com.alipay.mobile.security.bio.exception.BioIllegalArgumentException r0 = new com.alipay.mobile.security.bio.exception.BioIllegalArgumentException
            r0.<init>()
            goto L_0x0241
        L_0x0240:
            throw r0
        L_0x0241:
            goto L_0x0240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.workspace.PbToBioApp.toBioApp(com.alipay.mobile.security.bio.api.BioParameter):com.alipay.mobile.security.bio.service.BioAppDescription");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if ((r13 % 2 != 0 ? '#' : 'T') != 'T') goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if ((r13 / 5) != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(char[] r12, int r13, byte r14) {
        /*
            int r0 = setMax
            int r0 = r0 + 25
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x001e
            char[] r0 = getMin
            char r3 = length
            char[] r4 = new char[r13]
            int r5 = r13 / 5
            if (r5 == 0) goto L_0x0039
            goto L_0x0031
        L_0x001e:
            char[] r0 = getMin
            char r3 = length
            char[] r4 = new char[r13]
            int r5 = r13 % 2
            r6 = 84
            if (r5 == 0) goto L_0x002d
            r5 = 35
            goto L_0x002f
        L_0x002d:
            r5 = 84
        L_0x002f:
            if (r5 == r6) goto L_0x0039
        L_0x0031:
            int r13 = r13 + -1
            char r5 = r12[r13]
            int r5 = r5 - r14
            char r5 = (char) r5
            r4[r13] = r5
        L_0x0039:
            r5 = 9
            r6 = 16
            if (r13 <= r2) goto L_0x0042
            r2 = 9
            goto L_0x0044
        L_0x0042:
            r2 = 16
        L_0x0044:
            if (r2 == r6) goto L_0x00e9
            int r2 = setMax
            int r2 = r2 + 93
            int r6 = r2 % 128
            getMax = r6
            int r2 = r2 % 2
        L_0x0050:
            r2 = 45
            if (r1 >= r13) goto L_0x0057
            r6 = 81
            goto L_0x0059
        L_0x0057:
            r6 = 45
        L_0x0059:
            if (r6 == r2) goto L_0x00e9
            char r2 = r12[r1]
            int r6 = r1 + 1
            char r7 = r12[r6]
            if (r2 != r7) goto L_0x0084
            int r8 = setMax
            int r8 = r8 + 7
            int r9 = r8 % 128
            getMax = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x007b
            int r2 = r2 + r14
            char r2 = (char) r2
            r4[r1] = r2
            int r2 = r1 << 1
            int r6 = r7 >>> r14
            char r6 = (char) r6
            r4[r2] = r6
            goto L_0x00e3
        L_0x007b:
            int r2 = r2 - r14
            char r2 = (char) r2
            r4[r1] = r2
            int r7 = r7 - r14
            char r2 = (char) r7
            r4[r6] = r2
            goto L_0x00e3
        L_0x0084:
            int r8 = o.onActivityPreStopped.setMin(r2, r3)     // Catch:{ Exception -> 0x00e7 }
            int r2 = o.onActivityPreStopped.length(r2, r3)     // Catch:{ Exception -> 0x00e7 }
            int r9 = o.onActivityPreStopped.setMin(r7, r3)     // Catch:{ Exception -> 0x00e7 }
            int r7 = o.onActivityPreStopped.length(r7, r3)     // Catch:{ Exception -> 0x00e7 }
            if (r2 != r7) goto L_0x00af
            int r8 = o.onActivityPreStopped.setMax(r8, r3)
            int r9 = o.onActivityPreStopped.setMax(r9, r3)
            int r2 = o.onActivityPreStopped.getMax(r8, r2, r3)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r3)
            char r2 = r0[r2]
            r4[r1] = r2
            char r2 = r0[r7]
            r4[r6] = r2
            goto L_0x00e3
        L_0x00af:
            r10 = 60
            if (r8 != r9) goto L_0x00b6
            r11 = 60
            goto L_0x00b8
        L_0x00b6:
            r11 = 99
        L_0x00b8:
            if (r11 == r10) goto L_0x00cb
            int r7 = o.onActivityPreStopped.getMax(r8, r7, r3)     // Catch:{ Exception -> 0x00e7 }
            int r2 = o.onActivityPreStopped.getMax(r9, r2, r3)
            char r7 = r0[r7]
            r4[r1] = r7
            char r2 = r0[r2]
            r4[r6] = r2
            goto L_0x00e3
        L_0x00cb:
            int r2 = o.onActivityPreStopped.setMax(r2, r3)
            int r7 = o.onActivityPreStopped.setMax(r7, r3)
            int r2 = o.onActivityPreStopped.getMax(r8, r2, r3)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r3)
            char r2 = r0[r2]
            r4[r1] = r2
            char r2 = r0[r7]
            r4[r6] = r2
        L_0x00e3:
            int r1 = r1 + 2
            goto L_0x0050
        L_0x00e7:
            r12 = move-exception
            throw r12
        L_0x00e9:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r4)
            int r13 = setMax
            int r13 = r13 + r5
            int r14 = r13 % 128
            getMax = r14
            int r13 = r13 % 2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.workspace.PbToBioApp.setMin(char[], int, byte):java.lang.String");
    }
}
