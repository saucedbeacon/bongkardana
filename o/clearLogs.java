package o;

import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import o.CircleFrameLayout;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ast.FunctionNode;

public class clearLogs {
    private boolean getMax;
    private getLogs getMin;
    private getLogs length;

    public void getMin(LogFactory logFactory, getCricleColor getcriclecolor) {
    }

    public void setMax(LogFactory logFactory, getCricleColor getcriclecolor) {
    }

    public final void setMin(getCricleColor getcriclecolor, SecureQwertyKeyboard.AnonymousClass2 r3) {
        setMax(getcriclecolor, false, r3);
    }

    private void getMin(getCricleColor getcriclecolor, boolean z) {
        this.getMin = new getLogs();
        this.length = new getLogs();
        this.getMax = false;
        boolean z2 = getcriclecolor.length() != 110 || ((FunctionNode) getcriclecolor).Grayscale$Algorithm();
        getcriclecolor.length(!z2);
        setMax(getcriclecolor, getcriclecolor, getcriclecolor, z2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:200:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(o.getCricleColor r19, o.LogFactory r20, o.setRoundColor r21, boolean r22, boolean r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r0 = 0
        L_0x0009:
            if (r0 != 0) goto L_0x0011
            o.LogFactory r0 = r20.setMin()
            r1 = 0
            goto L_0x001a
        L_0x0011:
            o.LogFactory r1 = r0.getMin()
            r17 = r1
            r1 = r0
            r0 = r17
        L_0x001a:
            if (r0 == 0) goto L_0x03b8
            int r2 = r0.length()
            r3 = 154(0x9a, float:2.16E-43)
            r4 = 130(0x82, float:1.82E-43)
            r5 = 159(0x9f, float:2.23E-43)
            r11 = 39
            if (r22 == 0) goto L_0x0085
            r12 = 158(0x9e, float:2.21E-43)
            if (r2 == r4) goto L_0x0034
            r13 = 133(0x85, float:1.86E-43)
            if (r2 == r13) goto L_0x0034
            if (r2 != r12) goto L_0x0085
        L_0x0034:
            boolean r13 = r0 instanceof o.setRoundColor
            if (r13 == 0) goto L_0x0085
            r13 = r0
            o.setRoundColor r13 = (o.setRoundColor) r13
            java.util.Map r14 = r13.ICustomTabsCallback$Default()
            if (r14 == 0) goto L_0x0085
            o.LogFactory r14 = new o.LogFactory
            if (r2 != r12) goto L_0x0048
            r2 = 159(0x9f, float:2.23E-43)
            goto L_0x004a
        L_0x0048:
            r2 = 154(0x9a, float:2.16E-43)
        L_0x004a:
            r14.<init>(r2)
            o.LogFactory r2 = new o.LogFactory
            r2.<init>(r3)
            r14.getMax((o.LogFactory) r2)
            java.util.Map r12 = r13.ICustomTabsCallback$Default()
            java.util.Set r12 = r12.keySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0061:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0075
            java.lang.Object r15 = r12.next()
            java.lang.String r15 = (java.lang.String) r15
            o.LogFactory r15 = o.LogFactory.length((int) r11, (java.lang.String) r15)
            r2.getMax((o.LogFactory) r15)
            goto L_0x0061
        L_0x0075:
            r13.onTransact()
            o.LogFactory r2 = setMax(r8, r1, r0, r14)
            int r12 = r2.length()
            r14.getMax((o.LogFactory) r0)
            r0 = r2
            r2 = r12
        L_0x0085:
            r12 = 3
            if (r2 == r12) goto L_0x0383
            r13 = 4
            r14 = 136(0x88, float:1.9E-43)
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            r4 = 82
            if (r2 == r13) goto L_0x02e3
            r13 = 7
            if (r2 == r13) goto L_0x0282
            r13 = 49
            r10 = 8
            if (r2 == r10) goto L_0x020c
            r10 = 38
            if (r2 == r10) goto L_0x0207
            if (r2 == r11) goto L_0x0213
            r10 = 73
            if (r2 == r10) goto L_0x01f2
            if (r2 == r4) goto L_0x01da
            r10 = 115(0x73, float:1.61E-43)
            if (r2 == r10) goto L_0x01c9
            r10 = 138(0x8a, float:1.93E-43)
            if (r2 == r10) goto L_0x01b9
            if (r2 == r5) goto L_0x013c
            switch(r2) {
                case 30: goto L_0x0137;
                case 31: goto L_0x0213;
                case 32: goto L_0x0282;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            switch(r2) {
                case 121: goto L_0x00d9;
                case 122: goto L_0x00d9;
                case 123: goto L_0x0161;
                case 124: goto L_0x00c0;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            switch(r2) {
                case 131: goto L_0x01c9;
                case 132: goto L_0x0383;
                case 133: goto L_0x01c9;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            switch(r2) {
                case 154: goto L_0x013c;
                case 155: goto L_0x0161;
                case 156: goto L_0x0213;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x039d
        L_0x00c0:
            o.getLogs r1 = r6.getMin
            r1.push(r0)
            o.LogFactory r1 = r0.getMin()
            int r2 = r1.length()
            if (r2 == r12) goto L_0x00d2
            o.getStyleId.setMin()
        L_0x00d2:
            o.getLogs r2 = r6.length
            r2.push(r1)
            goto L_0x039d
        L_0x00d9:
            r3 = r0
            o.AlgorithmInfoPattern r3 = (o.AlgorithmInfoPattern) r3
            o.AlgorithmInfoPattern r5 = r3.extraCallbackWithResult()
            if (r5 != 0) goto L_0x00e5
            o.getStyleId.setMin()
        L_0x00e5:
            o.getLogs r10 = r6.getMin
            int r10 = r10.size()
        L_0x00eb:
            if (r10 == 0) goto L_0x0132
            int r10 = r10 + -1
            o.getLogs r11 = r6.getMin
            java.lang.Object r11 = r11.get(r10)
            o.LogFactory r11 = (o.LogFactory) r11
            if (r11 == r5) goto L_0x011d
            int r13 = r11.length()
            if (r13 != r15) goto L_0x0109
            o.LogFactory r11 = new o.LogFactory
            r11.<init>(r12)
            o.LogFactory r1 = getMin((o.LogFactory) r8, (o.LogFactory) r1, (o.LogFactory) r0, (o.LogFactory) r11)
            goto L_0x00eb
        L_0x0109:
            if (r13 != r4) goto L_0x00eb
            o.AlgorithmInfoPattern r11 = (o.AlgorithmInfoPattern) r11
            o.AlgorithmInfoPattern r13 = new o.AlgorithmInfoPattern
            r13.<init>(r14)
            o.LogFactory r11 = r11.onRelationshipValidationResult()
            r13.ICustomTabsCallback = r11
            o.LogFactory r1 = getMin((o.LogFactory) r8, (o.LogFactory) r1, (o.LogFactory) r0, (o.LogFactory) r13)
            goto L_0x00eb
        L_0x011d:
            r1 = 121(0x79, float:1.7E-43)
            if (r2 != r1) goto L_0x0126
            o.LogFactory r1 = r5.ICustomTabsCallback
            r3.ICustomTabsCallback = r1
            goto L_0x012c
        L_0x0126:
            o.LogFactory r1 = r5.onMessageChannelReady()
            r3.ICustomTabsCallback = r1
        L_0x012c:
            r1 = 5
            r3.setMax((int) r1)
            goto L_0x039d
        L_0x0132:
            java.lang.RuntimeException r0 = o.getStyleId.setMin()
            throw r0
        L_0x0137:
            r6.setMax(r0, r7)
            goto L_0x039d
        L_0x013c:
            o.LogFactory r4 = r0.setMin()
            int r4 = r4.length()
            if (r4 != r3) goto L_0x0161
            int r2 = r19.length()
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 != r3) goto L_0x015a
            r2 = r7
            org.mozilla.javascript.ast.FunctionNode r2 = (org.mozilla.javascript.ast.FunctionNode) r2
            boolean r2 = r2.Grayscale$Algorithm()
            if (r2 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r2 = 0
            goto L_0x015b
        L_0x015a:
            r2 = 1
        L_0x015b:
            o.LogFactory r0 = getMin((boolean) r2, (o.LogFactory) r8, (o.LogFactory) r1, (o.LogFactory) r0)
            goto L_0x039d
        L_0x0161:
            o.LogFactory r3 = new o.LogFactory
            r4 = 130(0x82, float:1.82E-43)
            r3.<init>(r4)
            o.LogFactory r4 = r0.setMin()
        L_0x016c:
            if (r4 == 0) goto L_0x01b3
            o.LogFactory r10 = r4.getMin()
            int r12 = r4.length()
            if (r12 != r11) goto L_0x0198
            boolean r12 = r4.setMax()
            if (r12 == 0) goto L_0x01ac
            o.LogFactory r12 = r4.setMin()
            r4.setMin((o.LogFactory) r12)
            r4.setMax((int) r13)
            o.LogFactory r14 = new o.LogFactory
            r15 = 155(0x9b, float:2.17E-43)
            if (r2 != r15) goto L_0x0191
            r15 = 156(0x9c, float:2.19E-43)
            goto L_0x0193
        L_0x0191:
            r15 = 8
        L_0x0193:
            r14.<init>((int) r15, (o.LogFactory) r4, (o.LogFactory) r12)
            r4 = r14
            goto L_0x019e
        L_0x0198:
            int r12 = r4.length()
            if (r12 != r5) goto L_0x01ae
        L_0x019e:
            o.LogFactory r12 = new o.LogFactory
            r14 = 134(0x86, float:1.88E-43)
            int r15 = r0.equals()
            r12.<init>((int) r14, (o.LogFactory) r4, (int) r15)
            r3.getMax((o.LogFactory) r12)
        L_0x01ac:
            r4 = r10
            goto L_0x016c
        L_0x01ae:
            java.lang.RuntimeException r0 = o.getStyleId.setMin()
            throw r0
        L_0x01b3:
            o.LogFactory r0 = setMax(r8, r1, r0, r3)
            goto L_0x039d
        L_0x01b9:
            r1 = r0
            o.CircleFrameLayout$WidgetListener r1 = (o.CircleFrameLayout.WidgetListener) r1
            java.lang.String r1 = r1.equals
            o.setRoundColor r1 = r9.setMin((java.lang.String) r1)
            if (r1 == 0) goto L_0x039d
            r0.getMax((o.setRoundColor) r1)
            goto L_0x039d
        L_0x01c9:
            o.getLogs r1 = r6.getMin
            r1.push(r0)
            o.getLogs r1 = r6.length
            r2 = r0
            o.AlgorithmInfoPattern r2 = (o.AlgorithmInfoPattern) r2
            o.LogFactory r2 = r2.ICustomTabsCallback
            r1.push(r2)
            goto L_0x039d
        L_0x01da:
            r1 = r0
            o.AlgorithmInfoPattern r1 = (o.AlgorithmInfoPattern) r1
            o.LogFactory r1 = r1.onRelationshipValidationResult()
            if (r1 == 0) goto L_0x039d
            r2 = 1
            r6.getMax = r2
            o.getLogs r2 = r6.getMin
            r2.push(r0)
            o.getLogs r2 = r6.length
            r2.push(r1)
            goto L_0x039d
        L_0x01f2:
            r1 = r7
            org.mozilla.javascript.ast.FunctionNode r1 = (org.mozilla.javascript.ast.FunctionNode) r1
            java.util.List<o.LogFactory> r2 = r1.valueOf
            if (r2 != 0) goto L_0x0200
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.valueOf = r2
        L_0x0200:
            java.util.List<o.LogFactory> r1 = r1.valueOf
            r1.add(r0)
            goto L_0x039d
        L_0x0207:
            r6.getMin((o.LogFactory) r0, (o.getCricleColor) r7)
            goto L_0x039d
        L_0x020c:
            if (r23 == 0) goto L_0x0213
            r3 = 74
            r0.setMax((int) r3)
        L_0x0213:
            if (r22 != 0) goto L_0x039d
            r3 = 31
            if (r2 != r11) goto L_0x021b
            r4 = r0
            goto L_0x022e
        L_0x021b:
            o.LogFactory r4 = r0.setMin()
            int r5 = r4.length()
            if (r5 == r13) goto L_0x022e
            if (r2 != r3) goto L_0x0229
            goto L_0x039d
        L_0x0229:
            java.lang.RuntimeException r0 = o.getStyleId.setMin()
            throw r0
        L_0x022e:
            o.setRoundColor r5 = r4.isInside()
            if (r5 != 0) goto L_0x039d
            r5 = r4
            o.CircleFrameLayout$WidgetListener r5 = (o.CircleFrameLayout.WidgetListener) r5
            java.lang.String r5 = r5.equals
            o.setRoundColor r5 = r9.setMin((java.lang.String) r5)
            if (r5 == 0) goto L_0x039d
            r4.getMax((o.setRoundColor) r5)
            if (r2 != r11) goto L_0x024b
            r1 = 55
            r0.setMax((int) r1)
            goto L_0x039d
        L_0x024b:
            r5 = 41
            r10 = 8
            if (r2 == r10) goto L_0x0278
            r10 = 74
            if (r2 != r10) goto L_0x0256
            goto L_0x0278
        L_0x0256:
            r10 = 156(0x9c, float:2.19E-43)
            if (r2 != r10) goto L_0x0264
            r1 = 157(0x9d, float:2.2E-43)
            r0.setMax((int) r1)
            r4.setMax((int) r5)
            goto L_0x039d
        L_0x0264:
            if (r2 != r3) goto L_0x0273
            o.LogFactory r2 = new o.LogFactory
            r3 = 44
            r2.<init>(r3)
            o.LogFactory r0 = setMax(r8, r1, r0, r2)
            goto L_0x039d
        L_0x0273:
            java.lang.RuntimeException r0 = o.getStyleId.setMin()
            throw r0
        L_0x0278:
            r1 = 56
            r0.setMax((int) r1)
            r4.setMax((int) r5)
            goto L_0x039d
        L_0x0282:
            o.LogFactory r1 = r0.setMin()
            r3 = 7
            if (r2 != r3) goto L_0x02d4
        L_0x0289:
            int r2 = r1.length()
            r3 = 26
            if (r2 != r3) goto L_0x0296
            o.LogFactory r1 = r1.setMin()
            goto L_0x0289
        L_0x0296:
            int r2 = r1.length()
            r3 = 12
            if (r2 == r3) goto L_0x02a6
            int r2 = r1.length()
            r3 = 13
            if (r2 != r3) goto L_0x02d4
        L_0x02a6:
            o.LogFactory r2 = r1.setMin()
            o.LogFactory r3 = r1.getMax()
            int r4 = r2.length()
            java.lang.String r5 = "undefined"
            if (r4 != r11) goto L_0x02c3
            r4 = r2
            o.CircleFrameLayout$WidgetListener r4 = (o.CircleFrameLayout.WidgetListener) r4
            java.lang.String r4 = r4.equals
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x02c3
            r1 = r3
            goto L_0x02d4
        L_0x02c3:
            int r4 = r3.length()
            if (r4 != r11) goto L_0x02d4
            o.CircleFrameLayout$WidgetListener r3 = (o.CircleFrameLayout.WidgetListener) r3
            java.lang.String r3 = r3.equals
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02d4
            r1 = r2
        L_0x02d4:
            int r2 = r1.length()
            r3 = 33
            if (r2 != r3) goto L_0x039d
            r2 = 34
            r1.setMax((int) r2)
            goto L_0x039d
        L_0x02e3:
            int r2 = r19.length()
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 != r3) goto L_0x02f6
            r2 = r7
            org.mozilla.javascript.ast.FunctionNode r2 = (org.mozilla.javascript.ast.FunctionNode) r2
            boolean r2 = r2.invokeSuspend()
            if (r2 == 0) goto L_0x02f6
            r16 = 1
        L_0x02f6:
            if (r16 == 0) goto L_0x02ff
            r2 = 20
            r3 = 1
            r0.setMax((int) r2, (int) r3)
            goto L_0x0300
        L_0x02ff:
            r3 = 1
        L_0x0300:
            boolean r2 = r6.getMax
            if (r2 == 0) goto L_0x039d
            o.getLogs r2 = r6.getMin
            int r2 = r2.size()
            int r2 = r2 - r3
            r3 = 0
        L_0x030c:
            if (r2 < 0) goto L_0x034d
            o.getLogs r5 = r6.getMin
            java.lang.Object r5 = r5.get(r2)
            o.LogFactory r5 = (o.LogFactory) r5
            int r10 = r5.length()
            if (r10 == r4) goto L_0x0322
            if (r10 != r15) goto L_0x031f
            goto L_0x0322
        L_0x031f:
            r11 = 130(0x82, float:1.82E-43)
            goto L_0x034a
        L_0x0322:
            if (r10 != r4) goto L_0x0332
            o.AlgorithmInfoPattern r10 = new o.AlgorithmInfoPattern
            r10.<init>(r14)
            o.AlgorithmInfoPattern r5 = (o.AlgorithmInfoPattern) r5
            o.LogFactory r5 = r5.onRelationshipValidationResult()
            r10.ICustomTabsCallback = r5
            goto L_0x0337
        L_0x0332:
            o.LogFactory r10 = new o.LogFactory
            r10.<init>(r12)
        L_0x0337:
            if (r3 != 0) goto L_0x0345
            o.LogFactory r3 = new o.LogFactory
            int r5 = r0.equals()
            r11 = 130(0x82, float:1.82E-43)
            r3.<init>((int) r11, (int) r5)
            goto L_0x0347
        L_0x0345:
            r11 = 130(0x82, float:1.82E-43)
        L_0x0347:
            r3.getMax((o.LogFactory) r10)
        L_0x034a:
            int r2 = r2 + -1
            goto L_0x030c
        L_0x034d:
            if (r3 == 0) goto L_0x039d
            o.LogFactory r2 = r0.setMin()
            o.LogFactory r10 = setMax(r8, r1, r0, r3)
            if (r2 == 0) goto L_0x037f
            if (r16 == 0) goto L_0x035c
            goto L_0x037f
        L_0x035c:
            o.LogFactory r4 = new o.LogFactory
            r0 = 135(0x87, float:1.89E-43)
            r4.<init>((int) r0, (o.LogFactory) r2)
            r3.length((o.LogFactory) r4)
            o.LogFactory r0 = new o.LogFactory
            r1 = 65
            r0.<init>(r1)
            r3.getMax((o.LogFactory) r0)
            r0 = r18
            r1 = r19
            r2 = r4
            r3 = r21
            r4 = r22
            r5 = r23
            r0.setMax(r1, r2, r3, r4, r5)
            goto L_0x03b5
        L_0x037f:
            r3.getMax((o.LogFactory) r0)
            goto L_0x03b5
        L_0x0383:
            o.getLogs r1 = r6.length
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x039d
            o.getLogs r1 = r6.length
            java.lang.Object r1 = r1.peek()
            if (r1 != r0) goto L_0x039d
            o.getLogs r1 = r6.length
            r1.pop()
            o.getLogs r1 = r6.getMin
            r1.pop()
        L_0x039d:
            r10 = r0
            boolean r0 = r10 instanceof o.setRoundColor
            if (r0 == 0) goto L_0x03a8
            r0 = r10
            o.setRoundColor r0 = (o.setRoundColor) r0
            r3 = r0
            goto L_0x03a9
        L_0x03a8:
            r3 = r9
        L_0x03a9:
            r0 = r18
            r1 = r19
            r2 = r10
            r4 = r22
            r5 = r23
            r0.setMax(r1, r2, r3, r4, r5)
        L_0x03b5:
            r0 = r10
            goto L_0x0009
        L_0x03b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clearLogs.setMax(o.getCricleColor, o.LogFactory, o.setRoundColor, boolean, boolean):void");
    }

    private static LogFactory getMin(boolean z, LogFactory logFactory, LogFactory logFactory2, LogFactory logFactory3) {
        LogFactory logFactory4;
        LogFactory logFactory5;
        LogFactory logFactory6;
        LogFactory logFactory7;
        LogFactory logFactory8;
        LogFactory logFactory9 = logFactory;
        LogFactory logFactory10 = logFactory2;
        LogFactory logFactory11 = logFactory3;
        LogFactory min = logFactory3.setMin();
        LogFactory min2 = min.getMin();
        logFactory11.setMin(min);
        logFactory11.setMin(min2);
        int i = 159;
        boolean z2 = logFactory3.length() == 159;
        int i2 = 154;
        int i3 = 90;
        if (z) {
            logFactory4 = setMax(logFactory9, logFactory10, logFactory11, new LogFactory(z2 ? BlobStatic.MONITOR_IMAGE_WIDTH : TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
            ArrayList arrayList = new ArrayList();
            LogFactory logFactory12 = new LogFactory(67);
            LogFactory min3 = min.setMin();
            while (min3 != null) {
                if (min3.length() == i) {
                    List list = (List) min3.getMax(22);
                    LogFactory min4 = min3.setMin();
                    if (min4.length() == i2) {
                        if (z2) {
                            logFactory7 = new LogFactory(i3, min4.getMin(), min2);
                        } else {
                            logFactory7 = new LogFactory((int) TsExtractor.TS_STREAM_TYPE_HDMV_DTS, new LogFactory((int) TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, min4.getMin()), min2);
                        }
                        if (list != null) {
                            arrayList.addAll(list);
                            for (int i4 = 0; i4 < list.size(); i4++) {
                                logFactory12.getMax(new LogFactory(127, LogFactory.getMin(0.0d)));
                            }
                        }
                        logFactory8 = min4.setMin();
                    } else {
                        throw getStyleId.setMin();
                    }
                } else {
                    logFactory7 = min2;
                    logFactory8 = min3;
                }
                if (logFactory8.length() == 39) {
                    arrayList.add(LogItem.length(((CircleFrameLayout.WidgetListener) logFactory8).equals));
                    LogFactory min5 = logFactory8.setMin();
                    if (min5 == null) {
                        min5 = new LogFactory(127, LogFactory.getMin(0.0d));
                    }
                    logFactory12.getMax(min5);
                    min3 = min3.getMin();
                    min2 = logFactory7;
                    i = 159;
                    i2 = 154;
                    i3 = 90;
                } else {
                    throw getStyleId.setMin();
                }
            }
            logFactory12.setMax(12, (Object) arrayList.toArray());
            logFactory4.getMax(new LogFactory(2, logFactory12));
            logFactory4.getMax(new LogFactory(124, min2));
            logFactory4.getMax(new LogFactory(3));
        } else {
            logFactory4 = setMax(logFactory9, logFactory10, logFactory11, new LogFactory(z2 ? 90 : TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
            LogFactory logFactory13 = new LogFactory(90);
            LogFactory min6 = min.setMin();
            while (min6 != null) {
                if (min6.length() == 159) {
                    LogFactory min7 = min6.setMin();
                    if (min7.length() == 154) {
                        if (z2) {
                            logFactory5 = new LogFactory(90, min7.getMin(), min2);
                        } else {
                            logFactory5 = new LogFactory((int) TsExtractor.TS_STREAM_TYPE_HDMV_DTS, new LogFactory((int) TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, min7.getMin()), min2);
                        }
                        setRoundColor.setMax((setRoundColor) min6, (setRoundColor) logFactory11);
                        logFactory6 = min7.setMin();
                    } else {
                        throw getStyleId.setMin();
                    }
                } else {
                    logFactory5 = min2;
                    logFactory6 = min6;
                }
                if (logFactory6.length() == 39) {
                    LogFactory min8 = LogFactory.getMin(((CircleFrameLayout.WidgetListener) logFactory6).equals);
                    min8.getMax((setRoundColor) logFactory11);
                    LogFactory min9 = logFactory6.setMin();
                    if (min9 == null) {
                        min9 = new LogFactory(127, LogFactory.getMin(0.0d));
                    }
                    logFactory13.getMax(new LogFactory(56, min8, min9));
                    min6 = min6.getMin();
                    min2 = logFactory5;
                } else {
                    throw getStyleId.setMin();
                }
            }
            if (z2) {
                logFactory4.getMax(logFactory13);
                logFactory11.setMax(90);
                logFactory4.getMax(logFactory11);
                logFactory11.getMax(min2);
                if (min2 instanceof setRoundColor) {
                    setRoundColor setroundcolor = (setRoundColor) min2;
                    setRoundColor asInterface = setroundcolor.asInterface();
                    setRoundColor setroundcolor2 = (setRoundColor) logFactory11;
                    setroundcolor.setMax(setroundcolor2);
                    setroundcolor2.setMax(asInterface);
                }
            } else {
                logFactory4.getMax(new LogFactory((int) TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, logFactory13));
                logFactory11.setMax((int) TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                logFactory4.getMax(logFactory11);
                logFactory11.getMin(min2);
                if (min2 instanceof setRoundColor) {
                    setRoundColor setroundcolor3 = (setRoundColor) min2;
                    setRoundColor asInterface2 = setroundcolor3.asInterface();
                    setRoundColor setroundcolor4 = (setRoundColor) logFactory11;
                    setroundcolor3.setMax(setroundcolor4);
                    setroundcolor4.setMax(asInterface2);
                }
            }
        }
        return logFactory4;
    }

    private static LogFactory getMin(LogFactory logFactory, LogFactory logFactory2, LogFactory logFactory3, LogFactory logFactory4) {
        if (logFactory2 == null) {
            if (logFactory3 != logFactory.setMin()) {
                getStyleId.setMin();
            }
            logFactory.length(logFactory4);
        } else {
            if (logFactory3 != logFactory2.getMin()) {
                getStyleId.setMin();
            }
            logFactory.setMin(logFactory4, logFactory2);
        }
        return logFactory4;
    }

    private static LogFactory setMax(LogFactory logFactory, LogFactory logFactory2, LogFactory logFactory3, LogFactory logFactory4) {
        if (logFactory2 == null) {
            if (logFactory3 != logFactory.setMin()) {
                getStyleId.setMin();
            }
            logFactory.getMax(logFactory3, logFactory4);
        } else if (logFactory2.length == logFactory3) {
            logFactory.getMin(logFactory2, logFactory4);
        } else {
            logFactory.getMax(logFactory3, logFactory4);
        }
        return logFactory4;
    }

    public final void setMax(getCricleColor getcriclecolor, boolean z, SecureQwertyKeyboard.AnonymousClass2 r6) {
        if (r6.setMin >= 200 && getcriclecolor.ICustomTabsCallback$Stub()) {
            z = true;
        }
        getMin(getcriclecolor, z);
        int i = 0;
        while (true) {
            if (i != (getcriclecolor.ICustomTabsCallback$Default == null ? 0 : getcriclecolor.ICustomTabsCallback$Default.size())) {
                setMax(getcriclecolor.ICustomTabsCallback$Default.get(i), z, r6);
                i++;
            } else {
                return;
            }
        }
    }
}
