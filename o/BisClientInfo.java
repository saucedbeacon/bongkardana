package o;

import java.util.BitSet;
import java.util.HashMap;
import o.SimplePassword;
import o.WaveView;
import org.mozilla.javascript.ast.FunctionNode;

final class BisClientInfo {
    private boolean getMax;
    ClientConfigContentPB getMin;
    private boolean length;

    BisClientInfo() {
    }

    private void length(LogFactory logFactory) {
        if (this.getMax && logFactory.length() == 55) {
            if (this.getMin.getMax(this.getMin.setMax(logFactory))) {
                this.length = true;
            }
        }
    }

    private boolean setMin(LogFactory logFactory) {
        if (!this.getMax || logFactory.length() != 55) {
            return false;
        }
        if (!this.getMin.getMax(this.getMin.setMax(logFactory))) {
            return false;
        }
        logFactory.length(8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0191, code lost:
        r9.setMax(8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0194, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0125, code lost:
        r10 = r9.setMin();
        r0 = r10.getMin();
        r1 = getMin(r10, 1);
        r5 = getMin(r0, 1);
        length(r10);
        length(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013b, code lost:
        if (r1 != 1) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013d, code lost:
        if (r5 != 1) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013f, code lost:
        r9.setMax(8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0142, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0147, code lost:
        if (setMin(r0) != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0149, code lost:
        r9.setMin(r0);
        r9.getMax(new o.LogFactory(151, r0));
        r9.setMax(8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0157, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0158, code lost:
        if (r5 != 1) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015e, code lost:
        if (setMin(r10) != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0160, code lost:
        r9.setMin(r10);
        r9.length(new o.LogFactory(151, r10));
        r9.setMax(8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016e, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0173, code lost:
        if (setMin(r10) != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0175, code lost:
        r9.setMin(r10);
        r9.length(new o.LogFactory(151, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0184, code lost:
        if (setMin(r0) != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0186, code lost:
        r9.setMin(r0);
        r9.getMax(new o.LogFactory(151, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getMin(o.LogFactory r9, int r10) {
        /*
            r8 = this;
            int r0 = r9.length()
            r1 = 40
            r2 = 8
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L_0x02a2
            r1 = 134(0x86, float:1.88E-43)
            if (r0 == r1) goto L_0x0294
            r1 = 141(0x8d, float:1.98E-43)
            r5 = 150(0x96, float:2.1E-43)
            if (r0 == r1) goto L_0x024a
            r1 = 157(0x9d, float:2.2E-43)
            r6 = 151(0x97, float:2.12E-43)
            if (r0 == r1) goto L_0x01eb
            r1 = 55
            if (r0 == r1) goto L_0x01c6
            r10 = 56
            if (r0 == r10) goto L_0x01eb
            r10 = 107(0x6b, float:1.5E-43)
            if (r0 == r10) goto L_0x0195
            r10 = 108(0x6c, float:1.51E-43)
            if (r0 == r10) goto L_0x0195
            switch(r0) {
                case 9: goto L_0x0125;
                case 10: goto L_0x0125;
                case 11: goto L_0x0125;
                default: goto L_0x002f;
            }
        L_0x002f:
            r10 = 2
            switch(r0) {
                case 14: goto L_0x00de;
                case 15: goto L_0x00de;
                case 16: goto L_0x00de;
                case 17: goto L_0x00de;
                case 18: goto L_0x0125;
                case 19: goto L_0x0125;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r0) {
                case 21: goto L_0x009d;
                case 22: goto L_0x0125;
                case 23: goto L_0x0125;
                case 24: goto L_0x0125;
                case 25: goto L_0x0125;
                default: goto L_0x0036;
            }
        L_0x0036:
            switch(r0) {
                case 36: goto L_0x006e;
                case 37: goto L_0x024a;
                case 38: goto L_0x0041;
                default: goto L_0x0039;
            }
        L_0x0039:
            o.LogFactory r10 = r9.setMin()
            r8.setMin(r9, r10)
            return r3
        L_0x0041:
            o.LogFactory r10 = r9.setMin()
            o.LogFactory r0 = r10.setMin()
            r8.setMin(r10, r0)
            o.LogFactory r10 = r10.getMin()
            r0 = 9
            java.lang.Object r0 = r9.getMax((int) r0)
            o.ClientConfigContentPB r0 = (o.ClientConfigContentPB) r0
            if (r0 == 0) goto L_0x006a
        L_0x005a:
            if (r10 == 0) goto L_0x006d
            int r9 = r8.getMin(r10, r4)
            if (r9 != r4) goto L_0x0065
            r8.length((o.LogFactory) r10)
        L_0x0065:
            o.LogFactory r10 = r10.getMin()
            goto L_0x005a
        L_0x006a:
            r8.setMin(r9, r10)
        L_0x006d:
            return r3
        L_0x006e:
            o.LogFactory r0 = r9.setMin()
            o.LogFactory r1 = r0.getMin()
            int r6 = r8.getMin(r0, r4)
            if (r6 != r4) goto L_0x008d
            boolean r6 = r8.setMin(r0)
            if (r6 != 0) goto L_0x008d
            r9.setMin((o.LogFactory) r0)
            o.LogFactory r6 = new o.LogFactory
            r6.<init>((int) r5, (o.LogFactory) r0)
            r9.length((o.LogFactory) r6)
        L_0x008d:
            int r0 = r8.getMin(r1, r4)
            if (r0 != r4) goto L_0x009c
            boolean r0 = r8.setMin(r1)
            if (r0 != 0) goto L_0x009c
            r9.setMax((int) r2, (int) r10)
        L_0x009c:
            return r3
        L_0x009d:
            o.LogFactory r0 = r9.setMin()
            o.LogFactory r1 = r0.getMin()
            int r5 = r8.getMin(r0, r4)
            int r6 = r8.getMin(r1, r4)
            boolean r0 = r8.setMin(r0)
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r8.setMin(r1)
            if (r0 == 0) goto L_0x00ba
            return r3
        L_0x00ba:
            if (r6 != r4) goto L_0x00dd
            r9.setMax((int) r2, (int) r10)
            goto L_0x00dd
        L_0x00c0:
            boolean r0 = r8.setMin(r1)
            if (r0 == 0) goto L_0x00cc
            if (r5 != r4) goto L_0x00dd
            r9.setMax((int) r2, (int) r4)
            goto L_0x00dd
        L_0x00cc:
            if (r5 != r4) goto L_0x00d8
            if (r6 != r4) goto L_0x00d4
            r9.setMax((int) r2, (int) r3)
            return r4
        L_0x00d4:
            r9.setMax((int) r2, (int) r4)
            goto L_0x00dd
        L_0x00d8:
            if (r6 != r4) goto L_0x00dd
            r9.setMax((int) r2, (int) r10)
        L_0x00dd:
            return r3
        L_0x00de:
            o.LogFactory r0 = r9.setMin()
            o.LogFactory r1 = r0.getMin()
            int r5 = r8.getMin(r0, r4)
            int r6 = r8.getMin(r1, r4)
            r8.length((o.LogFactory) r0)
            r8.length((o.LogFactory) r1)
            boolean r0 = r8.setMin(r0)
            if (r0 == 0) goto L_0x0107
            boolean r0 = r8.setMin(r1)
            if (r0 == 0) goto L_0x0101
            return r3
        L_0x0101:
            if (r6 != r4) goto L_0x0124
            r9.setMax((int) r2, (int) r10)
            goto L_0x0124
        L_0x0107:
            boolean r0 = r8.setMin(r1)
            if (r0 == 0) goto L_0x0113
            if (r5 != r4) goto L_0x0124
            r9.setMax((int) r2, (int) r4)
            goto L_0x0124
        L_0x0113:
            if (r5 != r4) goto L_0x011f
            if (r6 != r4) goto L_0x011b
            r9.setMax((int) r2, (int) r3)
            goto L_0x0124
        L_0x011b:
            r9.setMax((int) r2, (int) r4)
            goto L_0x0124
        L_0x011f:
            if (r6 != r4) goto L_0x0124
            r9.setMax((int) r2, (int) r10)
        L_0x0124:
            return r3
        L_0x0125:
            o.LogFactory r10 = r9.setMin()
            o.LogFactory r0 = r10.getMin()
            int r1 = r8.getMin(r10, r4)
            int r5 = r8.getMin(r0, r4)
            r8.length((o.LogFactory) r10)
            r8.length((o.LogFactory) r0)
            if (r1 != r4) goto L_0x0158
            if (r5 != r4) goto L_0x0143
            r9.setMax((int) r2, (int) r3)
            return r4
        L_0x0143:
            boolean r10 = r8.setMin(r0)
            if (r10 != 0) goto L_0x0157
            r9.setMin((o.LogFactory) r0)
            o.LogFactory r10 = new o.LogFactory
            r10.<init>((int) r6, (o.LogFactory) r0)
            r9.getMax((o.LogFactory) r10)
            r9.setMax((int) r2, (int) r3)
        L_0x0157:
            return r4
        L_0x0158:
            if (r5 != r4) goto L_0x016f
            boolean r0 = r8.setMin(r10)
            if (r0 != 0) goto L_0x016e
            r9.setMin((o.LogFactory) r10)
            o.LogFactory r0 = new o.LogFactory
            r0.<init>((int) r6, (o.LogFactory) r10)
            r9.length((o.LogFactory) r0)
            r9.setMax((int) r2, (int) r3)
        L_0x016e:
            return r4
        L_0x016f:
            boolean r1 = r8.setMin(r10)
            if (r1 != 0) goto L_0x0180
            r9.setMin((o.LogFactory) r10)
            o.LogFactory r1 = new o.LogFactory
            r1.<init>((int) r6, (o.LogFactory) r10)
            r9.length((o.LogFactory) r1)
        L_0x0180:
            boolean r10 = r8.setMin(r0)
            if (r10 != 0) goto L_0x0191
            r9.setMin((o.LogFactory) r0)
            o.LogFactory r10 = new o.LogFactory
            r10.<init>((int) r6, (o.LogFactory) r0)
            r9.getMax((o.LogFactory) r10)
        L_0x0191:
            r9.setMax((int) r2, (int) r3)
            return r4
        L_0x0195:
            o.LogFactory r10 = r9.setMin()
            int r0 = r8.getMin(r10, r4)
            int r5 = r10.length()
            if (r5 != r1) goto L_0x01b3
            if (r0 != r4) goto L_0x01b2
            boolean r0 = r8.setMin(r10)
            if (r0 != 0) goto L_0x01b2
            r9.setMax((int) r2, (int) r3)
            r8.length((o.LogFactory) r10)
            return r4
        L_0x01b2:
            return r3
        L_0x01b3:
            int r9 = r10.length()
            r1 = 36
            if (r9 == r1) goto L_0x01c5
            int r9 = r10.length()
            r10 = 33
            if (r9 != r10) goto L_0x01c4
            goto L_0x01c5
        L_0x01c4:
            return r3
        L_0x01c5:
            return r0
        L_0x01c6:
            o.ClientConfigContentPB r0 = r8.getMin
            int r0 = r0.setMax(r9)
            boolean r1 = r8.getMax
            if (r1 == 0) goto L_0x01de
            o.ClientConfigContentPB r1 = r8.getMin
            boolean r1 = r1.getMax(r0)
            if (r1 == 0) goto L_0x01de
            if (r10 != r4) goto L_0x01de
            r9.setMax((int) r2, (int) r3)
            return r4
        L_0x01de:
            o.ClientConfigContentPB r10 = r8.getMin
            boolean r10 = r10.setMin(r0)
            if (r10 == 0) goto L_0x01ea
            r9.setMax((int) r2, (int) r3)
            return r4
        L_0x01ea:
            return r3
        L_0x01eb:
            o.LogFactory r10 = r9.setMin()
            o.LogFactory r10 = r10.getMin()
            int r0 = r8.getMin(r10, r4)
            o.ClientConfigContentPB r1 = r8.getMin
            int r1 = r1.setMax(r9)
            boolean r7 = r8.getMax
            if (r7 == 0) goto L_0x021a
            o.ClientConfigContentPB r7 = r8.getMin
            boolean r7 = r7.getMax(r1)
            if (r7 == 0) goto L_0x021a
            if (r0 != r4) goto L_0x0219
            boolean r0 = r8.setMin(r10)
            if (r0 != 0) goto L_0x0215
            r9.setMax((int) r2, (int) r3)
            return r4
        L_0x0215:
            r8.length((o.LogFactory) r10)
            return r3
        L_0x0219:
            return r0
        L_0x021a:
            o.ClientConfigContentPB r7 = r8.getMin
            boolean r1 = r7.setMin(r1)
            if (r1 == 0) goto L_0x0236
            if (r0 == r4) goto L_0x022f
            r9.setMin((o.LogFactory) r10)
            o.LogFactory r0 = new o.LogFactory
            r0.<init>((int) r6, (o.LogFactory) r10)
            r9.getMax((o.LogFactory) r0)
        L_0x022f:
            r9.setMax((int) r2, (int) r3)
            r8.length((o.LogFactory) r10)
            return r4
        L_0x0236:
            if (r0 != r4) goto L_0x0249
            boolean r0 = r8.setMin(r10)
            if (r0 != 0) goto L_0x0249
            r9.setMin((o.LogFactory) r10)
            o.LogFactory r0 = new o.LogFactory
            r0.<init>((int) r5, (o.LogFactory) r10)
            r9.getMax((o.LogFactory) r0)
        L_0x0249:
            return r3
        L_0x024a:
            o.LogFactory r10 = r9.setMin()
            o.LogFactory r0 = r10.getMin()
            o.LogFactory r1 = r0.getMin()
            int r6 = r8.getMin(r10, r4)
            if (r6 != r4) goto L_0x026d
            boolean r6 = r8.setMin(r10)
            if (r6 != 0) goto L_0x026d
            r9.setMin((o.LogFactory) r10)
            o.LogFactory r6 = new o.LogFactory
            r6.<init>((int) r5, (o.LogFactory) r10)
            r9.length((o.LogFactory) r6)
        L_0x026d:
            int r10 = r8.getMin(r0, r4)
            if (r10 != r4) goto L_0x027c
            boolean r10 = r8.setMin(r0)
            if (r10 != 0) goto L_0x027c
            r9.setMax((int) r2, (int) r4)
        L_0x027c:
            int r10 = r8.getMin(r1, r4)
            if (r10 != r4) goto L_0x0293
            boolean r10 = r8.setMin(r1)
            if (r10 != 0) goto L_0x0293
            r9.setMin((o.LogFactory) r1)
            o.LogFactory r10 = new o.LogFactory
            r10.<init>((int) r5, (o.LogFactory) r1)
            r9.getMax((o.LogFactory) r10)
        L_0x0293:
            return r3
        L_0x0294:
            o.LogFactory r10 = r9.setMin()
            int r10 = r8.getMin(r10, r4)     // Catch:{ all -> 0x02a6 }
            if (r10 != r4) goto L_0x02a1
            r9.setMax((int) r2, (int) r3)
        L_0x02a1:
            return r3
        L_0x02a2:
            r9.setMax((int) r2, (int) r3)
            return r4
        L_0x02a6:
            r9 = move-exception
            goto L_0x02a9
        L_0x02a8:
            throw r9
        L_0x02a9:
            goto L_0x02a8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisClientInfo.getMin(o.LogFactory, int):int");
    }

    private void setMin(LogFactory logFactory, LogFactory logFactory2) {
        while (logFactory2 != null) {
            LogFactory min = logFactory2.getMin();
            if (getMin(logFactory2, 0) == 1 && !setMin(logFactory2)) {
                logFactory.setMin(logFactory2);
                LogFactory logFactory3 = new LogFactory(150, logFactory2);
                if (min == null) {
                    logFactory.getMax(logFactory3);
                } else {
                    logFactory.length(logFactory3, min);
                }
            }
            logFactory2 = min;
        }
    }

    private static void getMax(LogFactory logFactory, getLogs getlogs) {
        int length2 = logFactory.length();
        if (length2 == 130 || length2 == 142 || length2 == 133 || length2 == 110) {
            for (LogFactory min = logFactory.setMin(); min != null; min = min.getMin()) {
                getMax(min, getlogs);
            }
            return;
        }
        getlogs.add(logFactory);
    }

    /* access modifiers changed from: package-private */
    public final void length(getCricleColor getcriclecolor) {
        int i;
        int i2;
        int i3;
        int i4;
        getCricleColor getcriclecolor2 = getcriclecolor;
        int i5 = 0;
        int size = getcriclecolor2.ICustomTabsCallback$Default == null ? 0 : getcriclecolor2.ICustomTabsCallback$Default.size();
        int i6 = 0;
        while (i6 != size) {
            ClientConfigContentPB clientConfigContentPB = (ClientConfigContentPB) getcriclecolor2.ICustomTabsCallback$Default.get(i6).ICustomTabsCallback$Stub$Proxy;
            if (!clientConfigContentPB.length.Grayscale$Algorithm()) {
                this.getMax = clientConfigContentPB.setMax();
                this.getMin = clientConfigContentPB;
                getLogs getlogs = new getLogs();
                getMax(clientConfigContentPB.length, getlogs);
                int size2 = getlogs.size();
                LogFactory[] logFactoryArr = new LogFactory[size2];
                getlogs.toArray(logFactoryArr);
                int i7 = clientConfigContentPB.length.onTransact;
                FunctionNode functionNode = clientConfigContentPB.length;
                if (functionNode.ICustomTabsService != null) {
                    int size3 = functionNode.asBinder.size();
                    int[] iArr = new int[size3];
                    for (int i8 = 0; i8 != i7; i8++) {
                        iArr[i8] = 3;
                    }
                    for (int i9 = i7; i9 != size3; i9++) {
                        iArr[i9] = i5;
                    }
                    HashMap hashMap = new HashMap();
                    getLogs getlogs2 = new getLogs();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        i2 = 5;
                        if (i10 >= size2) {
                            break;
                        }
                        int length2 = logFactoryArr[i10].length();
                        if (length2 == 5 || length2 == 6 || length2 == 7) {
                            WaveView.AnonymousClass1.getMin getmin = new WaveView.AnonymousClass1.getMin((byte) 0);
                            getmin.setMin = new Object(i11, i10) {
                                private BitSet equals;
                                int getMax;
                                private int getMin;
                                private BitSet isInside;
                                AnonymousClass1[] length;
                                AnonymousClass1[] setMax;
                                int setMin;
                                private BitSet toFloatRange;
                                private BitSet toIntRange;

                                /* renamed from: o.WaveView$1$getMin */
                                static class getMin {
                                    SimplePassword.TextWatcherImpl getMax;
                                    SimplePassword.TextWatcherImpl getMin;
                                    AnonymousClass1 setMin;

                                    private getMin() {
                                        this.getMax = new SimplePassword.TextWatcherImpl();
                                        this.getMin = new SimplePassword.TextWatcherImpl();
                                    }

                                    /* synthetic */ getMin(byte b) {
                                        this();
                                    }

                                    static AnonymousClass1[] setMax(SimplePassword.TextWatcherImpl textWatcherImpl) {
                                        if (textWatcherImpl.isEmpty()) {
                                            return null;
                                        }
                                        AnonymousClass1[] r0 = new AnonymousClass1[textWatcherImpl.size()];
                                        int i = 0;
                                        SimplePassword.TextWatcherImpl.getMin newIterator = textWatcherImpl.newIterator();
                                        newIterator.setMin.initIterator(newIterator);
                                        newIterator.getMax();
                                        while (!newIterator.getMin()) {
                                            Object obj = newIterator.getMin[newIterator.setMax];
                                            if (obj == ack.NULL_VALUE) {
                                                obj = null;
                                            }
                                            r0[i] = ((getMin) obj).setMin;
                                            newIterator.getMax();
                                            i++;
                                        }
                                        return r0;
                                    }
                                }

                                {
                                    this.getMin = r1;
                                    this.setMin = r2;
                                }

                                static void setMax(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, AnonymousClass1[] r9, int[] iArr) {
                                    AnonymousClass1[] r4;
                                    int i = 0;
                                    while (i < r9.length) {
                                        AnonymousClass1 r2 = r9[i];
                                        FunctionNode functionNode = clientConfigContentPB.length;
                                        if (functionNode.ICustomTabsService != null) {
                                            int size = functionNode.asBinder.size();
                                            r2.equals = new BitSet(size);
                                            r2.toFloatRange = new BitSet(size);
                                            r2.isInside = new BitSet(size);
                                            r2.toIntRange = new BitSet(size);
                                            for (int i2 = r2.getMin; i2 <= r2.setMin; i2++) {
                                                r2.getMin(clientConfigContentPB, logFactoryArr[i2]);
                                            }
                                            r2.toFloatRange.flip(0, size);
                                            i++;
                                        } else {
                                            throw getStyleId.setMin();
                                        }
                                    }
                                    boolean[] zArr = new boolean[r9.length];
                                    boolean[] zArr2 = new boolean[r9.length];
                                    int length2 = r9.length - 1;
                                    zArr[length2] = true;
                                    while (true) {
                                        boolean z = false;
                                        while (true) {
                                            if (zArr[length2] || !zArr2[length2]) {
                                                zArr2[length2] = true;
                                                zArr[length2] = false;
                                                if (r9[length2].getMin() && (r4 = r9[length2].length) != null) {
                                                    for (AnonymousClass1 r6 : r4) {
                                                        int i3 = r6.getMax;
                                                        zArr[i3] = true;
                                                        z |= i3 > length2;
                                                    }
                                                }
                                            }
                                            if (length2 == 0) {
                                                break;
                                            }
                                            length2--;
                                        }
                                        if (z) {
                                            length2 = r9.length - 1;
                                        } else {
                                            r9[0].setMax(iArr);
                                            return;
                                        }
                                    }
                                }

                                static void setMin(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, AnonymousClass1[] r11, int[] iArr) {
                                    boolean z;
                                    AnonymousClass1[] r6;
                                    boolean[] zArr = new boolean[r11.length];
                                    boolean[] zArr2 = new boolean[r11.length];
                                    zArr[0] = true;
                                    do {
                                        int i = 0;
                                        z = false;
                                        while (true) {
                                            if (zArr[i] || !zArr2[i]) {
                                                zArr2[i] = true;
                                                zArr[i] = false;
                                                if (r11[i].setMax(clientConfigContentPB, logFactoryArr, iArr) && (r6 = r11[i].setMax) != null) {
                                                    for (AnonymousClass1 r8 : r6) {
                                                        int i2 = r8.getMax;
                                                        zArr[i2] = true;
                                                        z |= i2 < i;
                                                    }
                                                }
                                            }
                                            if (i != r11.length - 1) {
                                                i++;
                                            }
                                        }
                                    } while (z);
                                }

                                private static boolean getMin(int[] iArr, int i, int i2) {
                                    int i3 = iArr[i];
                                    int i4 = i2 | iArr[i];
                                    iArr[i] = i4;
                                    return i3 != i4;
                                }

                                private void setMax(int[] iArr) {
                                    for (int i = 0; i != iArr.length; i++) {
                                        if (this.isInside.get(i)) {
                                            getMin(iArr, i, 3);
                                        }
                                    }
                                }

                                private void getMin(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory) {
                                    do {
                                        int length2 = logFactory.length();
                                        if (length2 != 55) {
                                            if (length2 != 56) {
                                                if (length2 == 107 || length2 == 108) {
                                                    logFactory = logFactory.setMin();
                                                } else if (length2 == 138) {
                                                    int IsOverlapping = clientConfigContentPB.length.IsOverlapping(logFactory);
                                                    if (IsOverlapping >= 0 && !this.toFloatRange.get(IsOverlapping)) {
                                                        this.equals.set(IsOverlapping);
                                                        return;
                                                    }
                                                    return;
                                                } else if (length2 != 157) {
                                                    for (LogFactory min = logFactory.setMin(); min != null; min = min.getMin()) {
                                                        getMin(clientConfigContentPB, min);
                                                    }
                                                    return;
                                                }
                                            }
                                            getMin(clientConfigContentPB, logFactory.setMin().getMin());
                                            this.toFloatRange.set(clientConfigContentPB.setMax(logFactory));
                                            return;
                                        }
                                        int max = clientConfigContentPB.setMax(logFactory);
                                        if (!this.toFloatRange.get(max)) {
                                            this.equals.set(max);
                                            return;
                                        }
                                        return;
                                    } while (logFactory.length() != 55);
                                    int max2 = clientConfigContentPB.setMax(logFactory);
                                    if (!this.toFloatRange.get(max2)) {
                                        this.equals.set(max2);
                                    }
                                    this.toFloatRange.set(max2);
                                }

                                private boolean getMin() {
                                    this.toIntRange.clear();
                                    if (this.setMax != null) {
                                        int i = 0;
                                        while (true) {
                                            AnonymousClass1[] r1 = this.setMax;
                                            if (i >= r1.length) {
                                                break;
                                            }
                                            this.toIntRange.or(r1[i].isInside);
                                            i++;
                                        }
                                    }
                                    return setMin(this.isInside, this.toIntRange, this.equals, this.toFloatRange);
                                }

                                private static boolean setMin(BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4) {
                                    int cardinality = bitSet.cardinality();
                                    bitSet.or(bitSet2);
                                    bitSet.and(bitSet4);
                                    bitSet.or(bitSet3);
                                    return bitSet.cardinality() != cardinality;
                                }

                                private static int getMin(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory, int[] iArr) {
                                    while (true) {
                                        int length2 = logFactory.length();
                                        if (!(length2 == 35 || length2 == 37)) {
                                            if (length2 == 40) {
                                                return 1;
                                            }
                                            if (length2 == 90) {
                                                continue;
                                            } else if (length2 == 103) {
                                                LogFactory min = logFactory.setMin().getMin();
                                                LogFactory min2 = min.getMin();
                                                return getMin(clientConfigContentPB, min2, iArr) | getMin(clientConfigContentPB, min, iArr);
                                            } else if (length2 == 157) {
                                                continue;
                                            } else if (length2 == 55) {
                                                return iArr[clientConfigContentPB.setMax(logFactory)];
                                            } else {
                                                if (length2 != 56) {
                                                    switch (length2) {
                                                        case 8:
                                                            break;
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                            break;
                                                        default:
                                                            switch (length2) {
                                                                case 18:
                                                                case 19:
                                                                case 20:
                                                                case 22:
                                                                case 23:
                                                                case 24:
                                                                case 25:
                                                                    break;
                                                                case 21:
                                                                    LogFactory min3 = logFactory.setMin();
                                                                    return getMin(clientConfigContentPB, min3.getMin(), iArr) | getMin(clientConfigContentPB, min3, iArr);
                                                                default:
                                                                    switch (length2) {
                                                                        case 27:
                                                                        case 28:
                                                                        case 29:
                                                                            break;
                                                                        default:
                                                                            switch (length2) {
                                                                                case 105:
                                                                                case 106:
                                                                                    LogFactory min4 = logFactory.setMin();
                                                                                    return getMin(clientConfigContentPB, min4.getMin(), iArr) | getMin(clientConfigContentPB, min4, iArr);
                                                                                case 107:
                                                                                case 108:
                                                                                    break;
                                                                                default:
                                                                                    return 3;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        logFactory = logFactory.getMax();
                                    }
                                    return 1;
                                }

                                private static boolean getMax(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory, int[] iArr) {
                                    LogFactory min = logFactory.setMin();
                                    boolean z = false;
                                    for (LogFactory logFactory2 = min; logFactory2 != null; logFactory2 = logFactory2.getMin()) {
                                        z |= getMax(clientConfigContentPB, logFactory2, iArr);
                                    }
                                    int length2 = logFactory.length();
                                    if (length2 == 56 || length2 == 157) {
                                        int min2 = getMin(clientConfigContentPB, min.getMin(), iArr);
                                        int max = clientConfigContentPB.setMax(logFactory);
                                        return (logFactory.length() != 56 || !clientConfigContentPB.length.extraCallback()[max]) ? z | getMin(iArr, max, min2) : z;
                                    } else if ((length2 != 107 && length2 != 108) || min.length() != 55) {
                                        return z;
                                    } else {
                                        int max2 = clientConfigContentPB.setMax(min);
                                        if (!clientConfigContentPB.length.extraCallback()[max2]) {
                                            return getMin(iArr, max2, 1) | z;
                                        }
                                        return z;
                                    }
                                }

                                private boolean setMax(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, int[] iArr) {
                                    boolean z = false;
                                    for (int i = this.getMin; i <= this.setMin; i++) {
                                        LogFactory logFactory = logFactoryArr[i];
                                        if (logFactory != null) {
                                            z |= getMax(clientConfigContentPB, logFactory, iArr);
                                        }
                                    }
                                    return z;
                                }
                            };
                            if (logFactoryArr[i11].length() == 132) {
                                hashMap.put(logFactoryArr[i11], getmin);
                            }
                            getlogs2.add(getmin);
                            i11 = i10 + 1;
                        } else if (length2 == 132 && i10 != i11) {
                            WaveView.AnonymousClass1.getMin getmin2 = new WaveView.AnonymousClass1.getMin((byte) 0);
                            getmin2.setMin = new Object(i11, i10 - 1) {
                                private BitSet equals;
                                int getMax;
                                private int getMin;
                                private BitSet isInside;
                                AnonymousClass1[] length;
                                AnonymousClass1[] setMax;
                                int setMin;
                                private BitSet toFloatRange;
                                private BitSet toIntRange;

                                /* renamed from: o.WaveView$1$getMin */
                                static class getMin {
                                    SimplePassword.TextWatcherImpl getMax;
                                    SimplePassword.TextWatcherImpl getMin;
                                    AnonymousClass1 setMin;

                                    private getMin() {
                                        this.getMax = new SimplePassword.TextWatcherImpl();
                                        this.getMin = new SimplePassword.TextWatcherImpl();
                                    }

                                    /* synthetic */ getMin(byte b) {
                                        this();
                                    }

                                    static AnonymousClass1[] setMax(SimplePassword.TextWatcherImpl textWatcherImpl) {
                                        if (textWatcherImpl.isEmpty()) {
                                            return null;
                                        }
                                        AnonymousClass1[] r0 = new AnonymousClass1[textWatcherImpl.size()];
                                        int i = 0;
                                        SimplePassword.TextWatcherImpl.getMin newIterator = textWatcherImpl.newIterator();
                                        newIterator.setMin.initIterator(newIterator);
                                        newIterator.getMax();
                                        while (!newIterator.getMin()) {
                                            Object obj = newIterator.getMin[newIterator.setMax];
                                            if (obj == ack.NULL_VALUE) {
                                                obj = null;
                                            }
                                            r0[i] = ((getMin) obj).setMin;
                                            newIterator.getMax();
                                            i++;
                                        }
                                        return r0;
                                    }
                                }

                                {
                                    this.getMin = r1;
                                    this.setMin = r2;
                                }

                                static void setMax(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, AnonymousClass1[] r9, int[] iArr) {
                                    AnonymousClass1[] r4;
                                    int i = 0;
                                    while (i < r9.length) {
                                        AnonymousClass1 r2 = r9[i];
                                        FunctionNode functionNode = clientConfigContentPB.length;
                                        if (functionNode.ICustomTabsService != null) {
                                            int size = functionNode.asBinder.size();
                                            r2.equals = new BitSet(size);
                                            r2.toFloatRange = new BitSet(size);
                                            r2.isInside = new BitSet(size);
                                            r2.toIntRange = new BitSet(size);
                                            for (int i2 = r2.getMin; i2 <= r2.setMin; i2++) {
                                                r2.getMin(clientConfigContentPB, logFactoryArr[i2]);
                                            }
                                            r2.toFloatRange.flip(0, size);
                                            i++;
                                        } else {
                                            throw getStyleId.setMin();
                                        }
                                    }
                                    boolean[] zArr = new boolean[r9.length];
                                    boolean[] zArr2 = new boolean[r9.length];
                                    int length2 = r9.length - 1;
                                    zArr[length2] = true;
                                    while (true) {
                                        boolean z = false;
                                        while (true) {
                                            if (zArr[length2] || !zArr2[length2]) {
                                                zArr2[length2] = true;
                                                zArr[length2] = false;
                                                if (r9[length2].getMin() && (r4 = r9[length2].length) != null) {
                                                    for (AnonymousClass1 r6 : r4) {
                                                        int i3 = r6.getMax;
                                                        zArr[i3] = true;
                                                        z |= i3 > length2;
                                                    }
                                                }
                                            }
                                            if (length2 == 0) {
                                                break;
                                            }
                                            length2--;
                                        }
                                        if (z) {
                                            length2 = r9.length - 1;
                                        } else {
                                            r9[0].setMax(iArr);
                                            return;
                                        }
                                    }
                                }

                                static void setMin(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, AnonymousClass1[] r11, int[] iArr) {
                                    boolean z;
                                    AnonymousClass1[] r6;
                                    boolean[] zArr = new boolean[r11.length];
                                    boolean[] zArr2 = new boolean[r11.length];
                                    zArr[0] = true;
                                    do {
                                        int i = 0;
                                        z = false;
                                        while (true) {
                                            if (zArr[i] || !zArr2[i]) {
                                                zArr2[i] = true;
                                                zArr[i] = false;
                                                if (r11[i].setMax(clientConfigContentPB, logFactoryArr, iArr) && (r6 = r11[i].setMax) != null) {
                                                    for (AnonymousClass1 r8 : r6) {
                                                        int i2 = r8.getMax;
                                                        zArr[i2] = true;
                                                        z |= i2 < i;
                                                    }
                                                }
                                            }
                                            if (i != r11.length - 1) {
                                                i++;
                                            }
                                        }
                                    } while (z);
                                }

                                private static boolean getMin(int[] iArr, int i, int i2) {
                                    int i3 = iArr[i];
                                    int i4 = i2 | iArr[i];
                                    iArr[i] = i4;
                                    return i3 != i4;
                                }

                                private void setMax(int[] iArr) {
                                    for (int i = 0; i != iArr.length; i++) {
                                        if (this.isInside.get(i)) {
                                            getMin(iArr, i, 3);
                                        }
                                    }
                                }

                                private void getMin(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory) {
                                    do {
                                        int length2 = logFactory.length();
                                        if (length2 != 55) {
                                            if (length2 != 56) {
                                                if (length2 == 107 || length2 == 108) {
                                                    logFactory = logFactory.setMin();
                                                } else if (length2 == 138) {
                                                    int IsOverlapping = clientConfigContentPB.length.IsOverlapping(logFactory);
                                                    if (IsOverlapping >= 0 && !this.toFloatRange.get(IsOverlapping)) {
                                                        this.equals.set(IsOverlapping);
                                                        return;
                                                    }
                                                    return;
                                                } else if (length2 != 157) {
                                                    for (LogFactory min = logFactory.setMin(); min != null; min = min.getMin()) {
                                                        getMin(clientConfigContentPB, min);
                                                    }
                                                    return;
                                                }
                                            }
                                            getMin(clientConfigContentPB, logFactory.setMin().getMin());
                                            this.toFloatRange.set(clientConfigContentPB.setMax(logFactory));
                                            return;
                                        }
                                        int max = clientConfigContentPB.setMax(logFactory);
                                        if (!this.toFloatRange.get(max)) {
                                            this.equals.set(max);
                                            return;
                                        }
                                        return;
                                    } while (logFactory.length() != 55);
                                    int max2 = clientConfigContentPB.setMax(logFactory);
                                    if (!this.toFloatRange.get(max2)) {
                                        this.equals.set(max2);
                                    }
                                    this.toFloatRange.set(max2);
                                }

                                private boolean getMin() {
                                    this.toIntRange.clear();
                                    if (this.setMax != null) {
                                        int i = 0;
                                        while (true) {
                                            AnonymousClass1[] r1 = this.setMax;
                                            if (i >= r1.length) {
                                                break;
                                            }
                                            this.toIntRange.or(r1[i].isInside);
                                            i++;
                                        }
                                    }
                                    return setMin(this.isInside, this.toIntRange, this.equals, this.toFloatRange);
                                }

                                private static boolean setMin(BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4) {
                                    int cardinality = bitSet.cardinality();
                                    bitSet.or(bitSet2);
                                    bitSet.and(bitSet4);
                                    bitSet.or(bitSet3);
                                    return bitSet.cardinality() != cardinality;
                                }

                                private static int getMin(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory, int[] iArr) {
                                    while (true) {
                                        int length2 = logFactory.length();
                                        if (!(length2 == 35 || length2 == 37)) {
                                            if (length2 == 40) {
                                                return 1;
                                            }
                                            if (length2 == 90) {
                                                continue;
                                            } else if (length2 == 103) {
                                                LogFactory min = logFactory.setMin().getMin();
                                                LogFactory min2 = min.getMin();
                                                return getMin(clientConfigContentPB, min2, iArr) | getMin(clientConfigContentPB, min, iArr);
                                            } else if (length2 == 157) {
                                                continue;
                                            } else if (length2 == 55) {
                                                return iArr[clientConfigContentPB.setMax(logFactory)];
                                            } else {
                                                if (length2 != 56) {
                                                    switch (length2) {
                                                        case 8:
                                                            break;
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                            break;
                                                        default:
                                                            switch (length2) {
                                                                case 18:
                                                                case 19:
                                                                case 20:
                                                                case 22:
                                                                case 23:
                                                                case 24:
                                                                case 25:
                                                                    break;
                                                                case 21:
                                                                    LogFactory min3 = logFactory.setMin();
                                                                    return getMin(clientConfigContentPB, min3.getMin(), iArr) | getMin(clientConfigContentPB, min3, iArr);
                                                                default:
                                                                    switch (length2) {
                                                                        case 27:
                                                                        case 28:
                                                                        case 29:
                                                                            break;
                                                                        default:
                                                                            switch (length2) {
                                                                                case 105:
                                                                                case 106:
                                                                                    LogFactory min4 = logFactory.setMin();
                                                                                    return getMin(clientConfigContentPB, min4.getMin(), iArr) | getMin(clientConfigContentPB, min4, iArr);
                                                                                case 107:
                                                                                case 108:
                                                                                    break;
                                                                                default:
                                                                                    return 3;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        logFactory = logFactory.getMax();
                                    }
                                    return 1;
                                }

                                private static boolean getMax(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory, int[] iArr) {
                                    LogFactory min = logFactory.setMin();
                                    boolean z = false;
                                    for (LogFactory logFactory2 = min; logFactory2 != null; logFactory2 = logFactory2.getMin()) {
                                        z |= getMax(clientConfigContentPB, logFactory2, iArr);
                                    }
                                    int length2 = logFactory.length();
                                    if (length2 == 56 || length2 == 157) {
                                        int min2 = getMin(clientConfigContentPB, min.getMin(), iArr);
                                        int max = clientConfigContentPB.setMax(logFactory);
                                        return (logFactory.length() != 56 || !clientConfigContentPB.length.extraCallback()[max]) ? z | getMin(iArr, max, min2) : z;
                                    } else if ((length2 != 107 && length2 != 108) || min.length() != 55) {
                                        return z;
                                    } else {
                                        int max2 = clientConfigContentPB.setMax(min);
                                        if (!clientConfigContentPB.length.extraCallback()[max2]) {
                                            return getMin(iArr, max2, 1) | z;
                                        }
                                        return z;
                                    }
                                }

                                private boolean setMax(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, int[] iArr) {
                                    boolean z = false;
                                    for (int i = this.getMin; i <= this.setMin; i++) {
                                        LogFactory logFactory = logFactoryArr[i];
                                        if (logFactory != null) {
                                            z |= getMax(clientConfigContentPB, logFactory, iArr);
                                        }
                                    }
                                    return z;
                                }
                            };
                            if (logFactoryArr[i11].length() == 132) {
                                hashMap.put(logFactoryArr[i11], getmin2);
                            }
                            getlogs2.add(getmin2);
                            i11 = i10;
                        }
                        i10++;
                        getCricleColor getcriclecolor3 = getcriclecolor;
                    }
                    if (i11 != size2) {
                        WaveView.AnonymousClass1.getMin getmin3 = new WaveView.AnonymousClass1.getMin((byte) 0);
                        getmin3.setMin = new Object(i11, size2 - 1) {
                            private BitSet equals;
                            int getMax;
                            private int getMin;
                            private BitSet isInside;
                            AnonymousClass1[] length;
                            AnonymousClass1[] setMax;
                            int setMin;
                            private BitSet toFloatRange;
                            private BitSet toIntRange;

                            /* renamed from: o.WaveView$1$getMin */
                            static class getMin {
                                SimplePassword.TextWatcherImpl getMax;
                                SimplePassword.TextWatcherImpl getMin;
                                AnonymousClass1 setMin;

                                private getMin() {
                                    this.getMax = new SimplePassword.TextWatcherImpl();
                                    this.getMin = new SimplePassword.TextWatcherImpl();
                                }

                                /* synthetic */ getMin(byte b) {
                                    this();
                                }

                                static AnonymousClass1[] setMax(SimplePassword.TextWatcherImpl textWatcherImpl) {
                                    if (textWatcherImpl.isEmpty()) {
                                        return null;
                                    }
                                    AnonymousClass1[] r0 = new AnonymousClass1[textWatcherImpl.size()];
                                    int i = 0;
                                    SimplePassword.TextWatcherImpl.getMin newIterator = textWatcherImpl.newIterator();
                                    newIterator.setMin.initIterator(newIterator);
                                    newIterator.getMax();
                                    while (!newIterator.getMin()) {
                                        Object obj = newIterator.getMin[newIterator.setMax];
                                        if (obj == ack.NULL_VALUE) {
                                            obj = null;
                                        }
                                        r0[i] = ((getMin) obj).setMin;
                                        newIterator.getMax();
                                        i++;
                                    }
                                    return r0;
                                }
                            }

                            {
                                this.getMin = r1;
                                this.setMin = r2;
                            }

                            static void setMax(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, AnonymousClass1[] r9, int[] iArr) {
                                AnonymousClass1[] r4;
                                int i = 0;
                                while (i < r9.length) {
                                    AnonymousClass1 r2 = r9[i];
                                    FunctionNode functionNode = clientConfigContentPB.length;
                                    if (functionNode.ICustomTabsService != null) {
                                        int size = functionNode.asBinder.size();
                                        r2.equals = new BitSet(size);
                                        r2.toFloatRange = new BitSet(size);
                                        r2.isInside = new BitSet(size);
                                        r2.toIntRange = new BitSet(size);
                                        for (int i2 = r2.getMin; i2 <= r2.setMin; i2++) {
                                            r2.getMin(clientConfigContentPB, logFactoryArr[i2]);
                                        }
                                        r2.toFloatRange.flip(0, size);
                                        i++;
                                    } else {
                                        throw getStyleId.setMin();
                                    }
                                }
                                boolean[] zArr = new boolean[r9.length];
                                boolean[] zArr2 = new boolean[r9.length];
                                int length2 = r9.length - 1;
                                zArr[length2] = true;
                                while (true) {
                                    boolean z = false;
                                    while (true) {
                                        if (zArr[length2] || !zArr2[length2]) {
                                            zArr2[length2] = true;
                                            zArr[length2] = false;
                                            if (r9[length2].getMin() && (r4 = r9[length2].length) != null) {
                                                for (AnonymousClass1 r6 : r4) {
                                                    int i3 = r6.getMax;
                                                    zArr[i3] = true;
                                                    z |= i3 > length2;
                                                }
                                            }
                                        }
                                        if (length2 == 0) {
                                            break;
                                        }
                                        length2--;
                                    }
                                    if (z) {
                                        length2 = r9.length - 1;
                                    } else {
                                        r9[0].setMax(iArr);
                                        return;
                                    }
                                }
                            }

                            static void setMin(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, AnonymousClass1[] r11, int[] iArr) {
                                boolean z;
                                AnonymousClass1[] r6;
                                boolean[] zArr = new boolean[r11.length];
                                boolean[] zArr2 = new boolean[r11.length];
                                zArr[0] = true;
                                do {
                                    int i = 0;
                                    z = false;
                                    while (true) {
                                        if (zArr[i] || !zArr2[i]) {
                                            zArr2[i] = true;
                                            zArr[i] = false;
                                            if (r11[i].setMax(clientConfigContentPB, logFactoryArr, iArr) && (r6 = r11[i].setMax) != null) {
                                                for (AnonymousClass1 r8 : r6) {
                                                    int i2 = r8.getMax;
                                                    zArr[i2] = true;
                                                    z |= i2 < i;
                                                }
                                            }
                                        }
                                        if (i != r11.length - 1) {
                                            i++;
                                        }
                                    }
                                } while (z);
                            }

                            private static boolean getMin(int[] iArr, int i, int i2) {
                                int i3 = iArr[i];
                                int i4 = i2 | iArr[i];
                                iArr[i] = i4;
                                return i3 != i4;
                            }

                            private void setMax(int[] iArr) {
                                for (int i = 0; i != iArr.length; i++) {
                                    if (this.isInside.get(i)) {
                                        getMin(iArr, i, 3);
                                    }
                                }
                            }

                            private void getMin(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory) {
                                do {
                                    int length2 = logFactory.length();
                                    if (length2 != 55) {
                                        if (length2 != 56) {
                                            if (length2 == 107 || length2 == 108) {
                                                logFactory = logFactory.setMin();
                                            } else if (length2 == 138) {
                                                int IsOverlapping = clientConfigContentPB.length.IsOverlapping(logFactory);
                                                if (IsOverlapping >= 0 && !this.toFloatRange.get(IsOverlapping)) {
                                                    this.equals.set(IsOverlapping);
                                                    return;
                                                }
                                                return;
                                            } else if (length2 != 157) {
                                                for (LogFactory min = logFactory.setMin(); min != null; min = min.getMin()) {
                                                    getMin(clientConfigContentPB, min);
                                                }
                                                return;
                                            }
                                        }
                                        getMin(clientConfigContentPB, logFactory.setMin().getMin());
                                        this.toFloatRange.set(clientConfigContentPB.setMax(logFactory));
                                        return;
                                    }
                                    int max = clientConfigContentPB.setMax(logFactory);
                                    if (!this.toFloatRange.get(max)) {
                                        this.equals.set(max);
                                        return;
                                    }
                                    return;
                                } while (logFactory.length() != 55);
                                int max2 = clientConfigContentPB.setMax(logFactory);
                                if (!this.toFloatRange.get(max2)) {
                                    this.equals.set(max2);
                                }
                                this.toFloatRange.set(max2);
                            }

                            private boolean getMin() {
                                this.toIntRange.clear();
                                if (this.setMax != null) {
                                    int i = 0;
                                    while (true) {
                                        AnonymousClass1[] r1 = this.setMax;
                                        if (i >= r1.length) {
                                            break;
                                        }
                                        this.toIntRange.or(r1[i].isInside);
                                        i++;
                                    }
                                }
                                return setMin(this.isInside, this.toIntRange, this.equals, this.toFloatRange);
                            }

                            private static boolean setMin(BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4) {
                                int cardinality = bitSet.cardinality();
                                bitSet.or(bitSet2);
                                bitSet.and(bitSet4);
                                bitSet.or(bitSet3);
                                return bitSet.cardinality() != cardinality;
                            }

                            private static int getMin(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory, int[] iArr) {
                                while (true) {
                                    int length2 = logFactory.length();
                                    if (!(length2 == 35 || length2 == 37)) {
                                        if (length2 == 40) {
                                            return 1;
                                        }
                                        if (length2 == 90) {
                                            continue;
                                        } else if (length2 == 103) {
                                            LogFactory min = logFactory.setMin().getMin();
                                            LogFactory min2 = min.getMin();
                                            return getMin(clientConfigContentPB, min2, iArr) | getMin(clientConfigContentPB, min, iArr);
                                        } else if (length2 == 157) {
                                            continue;
                                        } else if (length2 == 55) {
                                            return iArr[clientConfigContentPB.setMax(logFactory)];
                                        } else {
                                            if (length2 != 56) {
                                                switch (length2) {
                                                    case 8:
                                                        break;
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                        break;
                                                    default:
                                                        switch (length2) {
                                                            case 18:
                                                            case 19:
                                                            case 20:
                                                            case 22:
                                                            case 23:
                                                            case 24:
                                                            case 25:
                                                                break;
                                                            case 21:
                                                                LogFactory min3 = logFactory.setMin();
                                                                return getMin(clientConfigContentPB, min3.getMin(), iArr) | getMin(clientConfigContentPB, min3, iArr);
                                                            default:
                                                                switch (length2) {
                                                                    case 27:
                                                                    case 28:
                                                                    case 29:
                                                                        break;
                                                                    default:
                                                                        switch (length2) {
                                                                            case 105:
                                                                            case 106:
                                                                                LogFactory min4 = logFactory.setMin();
                                                                                return getMin(clientConfigContentPB, min4.getMin(), iArr) | getMin(clientConfigContentPB, min4, iArr);
                                                                            case 107:
                                                                            case 108:
                                                                                break;
                                                                            default:
                                                                                return 3;
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    logFactory = logFactory.getMax();
                                }
                                return 1;
                            }

                            private static boolean getMax(ClientConfigContentPB clientConfigContentPB, LogFactory logFactory, int[] iArr) {
                                LogFactory min = logFactory.setMin();
                                boolean z = false;
                                for (LogFactory logFactory2 = min; logFactory2 != null; logFactory2 = logFactory2.getMin()) {
                                    z |= getMax(clientConfigContentPB, logFactory2, iArr);
                                }
                                int length2 = logFactory.length();
                                if (length2 == 56 || length2 == 157) {
                                    int min2 = getMin(clientConfigContentPB, min.getMin(), iArr);
                                    int max = clientConfigContentPB.setMax(logFactory);
                                    return (logFactory.length() != 56 || !clientConfigContentPB.length.extraCallback()[max]) ? z | getMin(iArr, max, min2) : z;
                                } else if ((length2 != 107 && length2 != 108) || min.length() != 55) {
                                    return z;
                                } else {
                                    int max2 = clientConfigContentPB.setMax(min);
                                    if (!clientConfigContentPB.length.extraCallback()[max2]) {
                                        return getMin(iArr, max2, 1) | z;
                                    }
                                    return z;
                                }
                            }

                            private boolean setMax(ClientConfigContentPB clientConfigContentPB, LogFactory[] logFactoryArr, int[] iArr) {
                                boolean z = false;
                                for (int i = this.getMin; i <= this.setMin; i++) {
                                    LogFactory logFactory = logFactoryArr[i];
                                    if (logFactory != null) {
                                        z |= getMax(clientConfigContentPB, logFactory, iArr);
                                    }
                                }
                                return z;
                            }
                        };
                        if (logFactoryArr[i11].length() == 132) {
                            hashMap.put(logFactoryArr[i11], getmin3);
                        }
                        getlogs2.add(getmin3);
                    }
                    int i12 = 0;
                    while (i12 < getlogs2.size()) {
                        WaveView.AnonymousClass1.getMin getmin4 = (WaveView.AnonymousClass1.getMin) getlogs2.get(i12);
                        LogFactory logFactory = logFactoryArr[getmin4.setMin.setMin];
                        int length3 = logFactory.length();
                        if (length3 == i2 || i12 >= getlogs2.size() - 1) {
                            i4 = size;
                            i3 = i7;
                        } else {
                            WaveView.AnonymousClass1.getMin getmin5 = (WaveView.AnonymousClass1.getMin) getlogs2.get(i12 + 1);
                            i4 = size;
                            i3 = i7;
                            getmin4.getMax.put(getmin5, 0);
                            getmin5.getMin.put(getmin4, 0);
                        }
                        i2 = 5;
                        if (length3 == 7 || length3 == 6 || length3 == 5) {
                            LogFactory logFactory2 = ((AlgorithmInfoPattern) logFactory).ICustomTabsCallback;
                            WaveView.AnonymousClass1.getMin getmin6 = (WaveView.AnonymousClass1.getMin) hashMap.get(logFactory2);
                            logFactory2.setMax(6, (Object) getmin6.setMin);
                            getmin4.getMax.put(getmin6, 0);
                            getmin6.getMin.put(getmin4, 0);
                        }
                        i12++;
                        size = i4;
                        i7 = i3;
                    }
                    i = size;
                    int i13 = i7;
                    WaveView.AnonymousClass1[] r1 = new WaveView.AnonymousClass1[getlogs2.size()];
                    for (int i14 = 0; i14 < getlogs2.size(); i14++) {
                        WaveView.AnonymousClass1.getMin getmin7 = (WaveView.AnonymousClass1.getMin) getlogs2.get(i14);
                        WaveView.AnonymousClass1 r6 = getmin7.setMin;
                        r6.setMax = WaveView.AnonymousClass1.getMin.setMax(getmin7.getMax);
                        r6.length = WaveView.AnonymousClass1.getMin.setMax(getmin7.getMin);
                        r6.getMax = i14;
                        r1[i14] = r6;
                    }
                    WaveView.AnonymousClass1.setMax(clientConfigContentPB, logFactoryArr, r1, iArr);
                    WaveView.AnonymousClass1.setMin(clientConfigContentPB, logFactoryArr, r1, iArr);
                    for (int i15 = i13; i15 != size3; i15++) {
                        if (iArr[i15] == 1) {
                            int i16 = i15 - clientConfigContentPB.length.onTransact;
                            if (i16 < 0) {
                                getStyleId.setMin();
                            }
                            if (clientConfigContentPB.getMin == null) {
                                FunctionNode functionNode2 = clientConfigContentPB.length;
                                if (functionNode2.ICustomTabsService != null) {
                                    clientConfigContentPB.getMin = new boolean[(functionNode2.asBinder.size() - clientConfigContentPB.length.onTransact)];
                                } else {
                                    throw getStyleId.setMin();
                                }
                            }
                            clientConfigContentPB.getMin[i16] = true;
                        }
                    }
                    if (!clientConfigContentPB.length.Grayscale$Algorithm()) {
                        this.length = false;
                        for (int i17 = 0; i17 < size2; i17++) {
                            getMin(logFactoryArr[i17], 1);
                        }
                        clientConfigContentPB.setMax = this.length;
                        i6++;
                        getcriclecolor2 = getcriclecolor;
                        size = i;
                        i5 = 0;
                    }
                } else {
                    throw getStyleId.setMin();
                }
            } else {
                i = size;
            }
            i6++;
            getcriclecolor2 = getcriclecolor;
            size = i;
            i5 = 0;
        }
    }
}
