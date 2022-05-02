package o;

import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.security.SecureClassLoader;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import o.CircleFrameLayout;
import org.mozilla.classfile.ClassFileWriter;

public class LogFactory implements Iterable<LogFactory> {
    /* access modifiers changed from: private */
    public static final LogFactory toFloatRange = new LogFactory(-1);
    protected getMax IsOverlapping;
    protected LogFactory getMax;
    protected int getMin;
    protected LogFactory length;
    protected int setMax;
    protected LogFactory setMin;

    public interface ILogPrinter extends announceSwitchKeyboard {
        printException length();
    }

    public final class LogType extends LogPrinterProxy {
        private static final Map<CodeSource, Map<ClassLoader, SoftReference<setMax>>> getMin = new WeakHashMap();
        /* access modifiers changed from: private */
        public static final byte[] setMax = setMax();

        public static abstract class setMax {
            public abstract Object setMax();
        }

        public final Object setMin(Object obj) {
            return obj;
        }

        public final Class<?> length() {
            return CodeSource.class;
        }

        static class setMin extends SecureClassLoader implements traceInfo {
            private final CodeSource length;

            setMin(ClassLoader classLoader, CodeSource codeSource) {
                super(classLoader);
                this.length = codeSource;
            }

            public final Class<?> setMin(String str, byte[] bArr) {
                return defineClass(str, bArr, 0, bArr.length, this.length);
            }

            public final void length(Class<?> cls) {
                resolveClass(cls);
            }
        }

        public final traceInfo length(final ClassLoader classLoader, final Object obj) {
            return (setMin) AccessController.doPrivileged(new PrivilegedAction<Object>() {
                public final Object run() {
                    return new setMin(classLoader, (CodeSource) obj);
                }
            });
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: o.LogFactory$LogType$setMax} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object getMin(java.lang.Object r1, final o.SecureQwertyKeyboard.AnonymousClass1 r2, o.announceSwitchKeyboard r3, o.LogUtils r4, java.lang.Object[] r5) {
            /*
                r0 = this;
                o.LogFactory$LogType$2 r3 = new o.LogFactory$LogType$2
                r3.<init>(r2)
                java.lang.Object r2 = java.security.AccessController.doPrivileged(r3)
                java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
                java.security.CodeSource r1 = (java.security.CodeSource) r1
                java.util.Map<java.security.CodeSource, java.util.Map<java.lang.ClassLoader, java.lang.ref.SoftReference<o.LogFactory$LogType$setMax>>> r3 = getMin
                monitor-enter(r3)
                java.util.Map<java.security.CodeSource, java.util.Map<java.lang.ClassLoader, java.lang.ref.SoftReference<o.LogFactory$LogType$setMax>>> r4 = getMin     // Catch:{ all -> 0x0061 }
                java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0061 }
                java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0061 }
                if (r4 != 0) goto L_0x0024
                java.util.WeakHashMap r4 = new java.util.WeakHashMap     // Catch:{ all -> 0x0061 }
                r4.<init>()     // Catch:{ all -> 0x0061 }
                java.util.Map<java.security.CodeSource, java.util.Map<java.lang.ClassLoader, java.lang.ref.SoftReference<o.LogFactory$LogType$setMax>>> r5 = getMin     // Catch:{ all -> 0x0061 }
                r5.put(r1, r4)     // Catch:{ all -> 0x0061 }
            L_0x0024:
                monitor-exit(r3)     // Catch:{ all -> 0x0061 }
                monitor-enter(r4)
                java.lang.Object r3 = r4.get(r2)     // Catch:{ all -> 0x005e }
                java.lang.ref.SoftReference r3 = (java.lang.ref.SoftReference) r3     // Catch:{ all -> 0x005e }
                if (r3 == 0) goto L_0x0035
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x005e }
                o.LogFactory$LogType$setMax r3 = (o.LogFactory.LogType.setMax) r3     // Catch:{ all -> 0x005e }
                goto L_0x0036
            L_0x0035:
                r3 = 0
            L_0x0036:
                if (r3 != 0) goto L_0x0058
                o.LogFactory$LogType$1 r3 = new o.LogFactory$LogType$1     // Catch:{ PrivilegedActionException -> 0x004d }
                r3.<init>(r2, r1)     // Catch:{ PrivilegedActionException -> 0x004d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r3)     // Catch:{ PrivilegedActionException -> 0x004d }
                r3 = r1
                o.LogFactory$LogType$setMax r3 = (o.LogFactory.LogType.setMax) r3     // Catch:{ PrivilegedActionException -> 0x004d }
                java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch:{ PrivilegedActionException -> 0x004d }
                r1.<init>(r3)     // Catch:{ PrivilegedActionException -> 0x004d }
                r4.put(r2, r1)     // Catch:{ PrivilegedActionException -> 0x004d }
                goto L_0x0058
            L_0x004d:
                r1 = move-exception
                java.lang.reflect.UndeclaredThrowableException r2 = new java.lang.reflect.UndeclaredThrowableException     // Catch:{ all -> 0x005e }
                java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x005e }
                r2.<init>(r1)     // Catch:{ all -> 0x005e }
                throw r2     // Catch:{ all -> 0x005e }
            L_0x0058:
                monitor-exit(r4)     // Catch:{ all -> 0x005e }
                java.lang.Object r1 = r3.setMax()
                return r1
            L_0x005e:
                r1 = move-exception
                monitor-exit(r4)
                throw r1
            L_0x0061:
                r1 = move-exception
                monitor-exit(r3)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.LogFactory.LogType.getMin(java.lang.Object, o.SecureQwertyKeyboard$1, o.announceSwitchKeyboard, o.LogUtils, java.lang.Object[]):java.lang.Object");
        }

        private static byte[] setMax() {
            String name = setMax.class.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("Impl");
            ClassFileWriter classFileWriter = new ClassFileWriter(sb.toString(), name, "<generated>");
            classFileWriter.getMin("<init>", "()V", 1);
            classFileWriter.getMax(42, 25, 0);
            classFileWriter.setMin(183, name, "<init>", "()V");
            classFileWriter.setMax(177);
            classFileWriter.setMin(1);
            classFileWriter.getMin("call", "(Lorg/mozilla/javascript/Callable;".concat("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;"), 17);
            for (int i = 1; i < 6; i++) {
                classFileWriter.getMax(42, 25, i);
            }
            classFileWriter.setMin(WSContextConstant.HANDSHAKE_RECEIVE_SIZE, "org/mozilla/javascript/Callable", "call", "(".concat("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;"));
            classFileWriter.setMax(176);
            classFileWriter.setMin(6);
            return classFileWriter.setMax();
        }
    }

    static class getMax {
        getMax getMax;
        int getMin;
        Object length;
        int setMax;

        private getMax() {
        }

        /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public LogFactory(int i) {
        this.getMin = -1;
        this.setMax = -1;
        this.getMin = i;
    }

    public LogFactory(int i, LogFactory logFactory) {
        this.getMin = -1;
        this.setMax = -1;
        this.getMin = i;
        this.getMax = logFactory;
        this.setMin = logFactory;
        logFactory.length = null;
    }

    public LogFactory(int i, LogFactory logFactory, LogFactory logFactory2) {
        this.getMin = -1;
        this.setMax = -1;
        this.getMin = i;
        this.setMin = logFactory;
        this.getMax = logFactory2;
        logFactory.length = logFactory2;
        logFactory2.length = null;
    }

    public LogFactory(int i, LogFactory logFactory, LogFactory logFactory2, LogFactory logFactory3) {
        this.getMin = -1;
        this.setMax = -1;
        this.getMin = i;
        this.setMin = logFactory;
        this.getMax = logFactory3;
        logFactory.length = logFactory2;
        logFactory2.length = logFactory3;
        logFactory3.length = null;
    }

    public LogFactory(int i, int i2) {
        this.getMin = -1;
        this.setMax = -1;
        this.getMin = i;
        this.setMax = i2;
    }

    public LogFactory(int i, LogFactory logFactory, int i2) {
        this(i, logFactory);
        this.setMax = i2;
    }

    public LogFactory(LogFactory logFactory, LogFactory logFactory2, LogFactory logFactory3, int i) {
        this(125, logFactory, logFactory2, logFactory3);
        this.setMax = i;
    }

    public static LogFactory getMin(double d) {
        setEnable setenable = new setEnable();
        setenable.toIntRange = d;
        return setenable;
    }

    public static LogFactory length(int i, String str) {
        CircleFrameLayout.WidgetListener widgetListener = new CircleFrameLayout.WidgetListener();
        if (str != null) {
            widgetListener.equals = str;
            widgetListener.equals(str.length());
            widgetListener.setMax(i);
            return widgetListener;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final int length() {
        return this.getMin;
    }

    public LogFactory setMax(int i) {
        this.getMin = i;
        return this;
    }

    public final boolean setMax() {
        return this.setMin != null;
    }

    public final LogFactory setMin() {
        return this.setMin;
    }

    public final LogFactory getMax() {
        return this.getMax;
    }

    public final LogFactory getMin() {
        return this.length;
    }

    private LogFactory toFloatRange(LogFactory logFactory) {
        LogFactory logFactory2 = this.setMin;
        if (logFactory == logFactory2) {
            return null;
        }
        while (true) {
            LogFactory logFactory3 = logFactory2.length;
            if (logFactory3 == logFactory) {
                return logFactory2;
            }
            if (logFactory3 != null) {
                logFactory2 = logFactory3;
            } else {
                throw new RuntimeException("node is not a child");
            }
        }
    }

    public final void length(LogFactory logFactory) {
        logFactory.length = this.setMin;
        this.setMin = logFactory;
        if (this.getMax == null) {
            this.getMax = logFactory;
        }
    }

    public final void getMax(LogFactory logFactory) {
        logFactory.length = null;
        LogFactory logFactory2 = this.getMax;
        if (logFactory2 == null) {
            this.getMax = logFactory;
            this.setMin = logFactory;
            return;
        }
        logFactory2.length = logFactory;
        this.getMax = logFactory;
    }

    public final void getMin(LogFactory logFactory) {
        LogFactory logFactory2 = this.getMax;
        if (logFactory2 != null) {
            logFactory2.length = logFactory;
        }
        LogFactory logFactory3 = logFactory;
        while (true) {
            LogFactory logFactory4 = logFactory3.length;
            if (logFactory4 == null) {
                break;
            }
            logFactory3 = logFactory4;
        }
        this.getMax = logFactory3;
        if (this.setMin == null) {
            this.setMin = logFactory;
        }
    }

    public final void length(LogFactory logFactory, LogFactory logFactory2) {
        if (logFactory.length == null) {
            LogFactory logFactory3 = this.setMin;
            if (logFactory3 == logFactory2) {
                logFactory.length = logFactory3;
                this.setMin = logFactory;
                return;
            }
            setMin(logFactory, toFloatRange(logFactory2));
            return;
        }
        throw new RuntimeException("newChild had siblings in addChildBefore");
    }

    public final void setMin(LogFactory logFactory, LogFactory logFactory2) {
        if (logFactory.length == null) {
            logFactory.length = logFactory2.length;
            logFactory2.length = logFactory;
            if (this.getMax == logFactory2) {
                this.getMax = logFactory;
                return;
            }
            return;
        }
        throw new RuntimeException("newChild had siblings in addChildAfter");
    }

    public final void setMin(LogFactory logFactory) {
        LogFactory floatRange = toFloatRange(logFactory);
        if (floatRange == null) {
            this.setMin = this.setMin.length;
        } else {
            floatRange.length = logFactory.length;
        }
        if (logFactory == this.getMax) {
            this.getMax = floatRange;
        }
        logFactory.length = null;
    }

    public final void getMax(LogFactory logFactory, LogFactory logFactory2) {
        logFactory2.length = logFactory.length;
        if (logFactory == this.setMin) {
            this.setMin = logFactory2;
        } else {
            toFloatRange(logFactory).length = logFactory2;
        }
        if (logFactory == this.getMax) {
            this.getMax = logFactory2;
        }
        logFactory.length = null;
    }

    public final void getMin(LogFactory logFactory, LogFactory logFactory2) {
        LogFactory logFactory3 = logFactory.length;
        logFactory2.length = logFactory3.length;
        logFactory.length = logFactory2;
        if (logFactory3 == this.getMax) {
            this.getMax = logFactory2;
        }
        logFactory3.length = null;
    }

    public final void toIntRange() {
        this.getMax = null;
        this.setMin = null;
    }

    public class setMin implements Iterator<LogFactory> {
        private LogFactory getMin = LogFactory.toFloatRange;
        private LogFactory length;
        private LogFactory setMax;
        private boolean setMin = false;

        public setMin() {
            this.length = LogFactory.this.setMin;
        }

        public final boolean hasNext() {
            return this.length != null;
        }

        public final void remove() {
            if (this.getMin == LogFactory.toFloatRange) {
                throw new IllegalStateException("next() has not been called");
            } else if (this.setMin) {
                throw new IllegalStateException("remove() already called for current element");
            } else if (this.getMin == LogFactory.this.setMin) {
                LogFactory.this.setMin = this.getMin.length;
            } else if (this.getMin == LogFactory.this.getMax) {
                this.setMax.length = null;
                LogFactory.this.getMax = this.setMax;
            } else {
                this.setMax.length = this.length;
            }
        }

        public final /* synthetic */ Object next() {
            LogFactory logFactory = this.length;
            if (logFactory != null) {
                this.setMin = false;
                this.setMax = this.getMin;
                this.getMin = logFactory;
                this.length = logFactory.length;
                return this.getMin;
            }
            throw new NoSuchElementException();
        }
    }

    public Iterator<LogFactory> iterator() {
        return new setMin();
    }

    public final void length(int i) {
        getMax getmax = this.IsOverlapping;
        if (getmax != null) {
            getMax getmax2 = null;
            while (getmax.getMin != i) {
                getMax getmax3 = getmax.getMax;
                if (getmax3 != null) {
                    getMax getmax4 = getmax3;
                    getmax2 = getmax;
                    getmax = getmax4;
                } else {
                    return;
                }
            }
            if (getmax2 == null) {
                this.IsOverlapping = getmax.getMax;
            } else {
                getmax2.getMax = getmax.getMax;
            }
        }
    }

    public final void setMax(int i, Object obj) {
        if (obj == null) {
            length(i);
        } else {
            IsOverlapping(i).length = obj;
        }
    }

    public final void setMax(int i, int i2) {
        IsOverlapping(i).setMax = i2;
    }

    public int equals() {
        return this.setMax;
    }

    public final void setMin(int i) {
        this.setMax = i;
    }

    public setRoundColor isInside() {
        return ((CircleFrameLayout.WidgetListener) this).toIntRange;
    }

    public void getMax(setRoundColor setroundcolor) {
        if (setroundcolor == null) {
            getStyleId.setMin();
        }
        if (this instanceof CircleFrameLayout.WidgetListener) {
            ((CircleFrameLayout.WidgetListener) this).toIntRange = setroundcolor;
            return;
        }
        throw getStyleId.setMin();
    }

    public static LogFactory IsOverlapping() {
        return new LogFactory(132);
    }

    public final int toFloatRange() {
        int i = this.getMin;
        if (!(i == 132 || i == 73)) {
            getStyleId.setMin();
        }
        return setMin(15, -1);
    }

    public final void isInside(int i) {
        int i2 = this.getMin;
        if (!(i2 == 132 || i2 == 73)) {
            getStyleId.setMin();
        }
        IsOverlapping(15).setMax = i;
    }

    public final boolean FastBitmap$CoordinateSystem() {
        int invokeSuspend = invokeSuspend();
        return (invokeSuspend & 4) == 0 || (invokeSuspend & 11) == 0;
    }

    private int Mean$Arithmetic() {
        LogFactory logFactory = this.length;
        LogFactory logFactory2 = ((AlgorithmInfoPattern) this).ICustomTabsCallback;
        int invokeSuspend = logFactory.invokeSuspend();
        return logFactory2 != null ? invokeSuspend | logFactory2.invokeSuspend() : invokeSuspend | 1;
    }

    private int invoke() {
        LogFactory logFactory = this.setMin;
        while (true) {
            LogFactory logFactory2 = logFactory.length;
            if (logFactory2 == this.getMax) {
                break;
            }
            logFactory = logFactory2;
        }
        if (logFactory.getMin != 6) {
            return 1;
        }
        int invokeSuspend = ((AlgorithmInfoPattern) logFactory).ICustomTabsCallback.length.invokeSuspend();
        if (logFactory.setMin.getMin == 45) {
            invokeSuspend &= -2;
        }
        return setMin(18, 0) | invokeSuspend;
    }

    private int Grayscale$Algorithm() {
        LogFactory logFactory = this.setMin;
        int i = 1;
        while ((i & 1) != 0 && logFactory != null) {
            i = (i & -2) | logFactory.invokeSuspend();
            logFactory = logFactory.length;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int invokeSuspend() {
        /*
            r6 = this;
            r0 = r6
        L_0x0001:
            int r1 = r0.getMin
            r2 = 4
            if (r1 == r2) goto L_0x0075
            r2 = 50
            r3 = 0
            if (r1 == r2) goto L_0x0074
            r2 = 73
            if (r1 == r2) goto L_0x0071
            r2 = 130(0x82, float:1.82E-43)
            r4 = 18
            r5 = 1
            if (r1 == r2) goto L_0x0044
            r2 = 142(0x8e, float:1.99E-43)
            if (r1 == r2) goto L_0x0044
            r2 = 121(0x79, float:1.7E-43)
            if (r1 == r2) goto L_0x0037
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x0074
            switch(r1) {
                case 132: goto L_0x0031;
                case 133: goto L_0x002c;
                case 134: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            return r5
        L_0x0026:
            o.LogFactory r0 = r0.setMin
            if (r0 == 0) goto L_0x002b
            goto L_0x0001
        L_0x002b:
            return r5
        L_0x002c:
            int r0 = r0.invoke()
            return r0
        L_0x0031:
            o.LogFactory r0 = r0.length
            if (r0 == 0) goto L_0x0036
            goto L_0x0001
        L_0x0036:
            return r5
        L_0x0037:
            o.AlgorithmInfoPattern r0 = (o.AlgorithmInfoPattern) r0
            o.AlgorithmInfoPattern r0 = r0.extraCallbackWithResult()
            o.LogFactory$getMax r0 = r0.IsOverlapping(r4)
            r0.setMax = r5
            return r3
        L_0x0044:
            o.LogFactory r1 = r0.setMin
            if (r1 != 0) goto L_0x0049
            return r5
        L_0x0049:
            int r2 = r1.getMin
            r5 = 7
            if (r2 == r5) goto L_0x006c
            r5 = 82
            if (r2 == r5) goto L_0x006b
            r5 = 115(0x73, float:1.61E-43)
            if (r2 == r5) goto L_0x006b
            r5 = 131(0x83, float:1.84E-43)
            if (r2 == r5) goto L_0x005f
            int r0 = r0.Grayscale$Algorithm()
            return r0
        L_0x005f:
            o.LogFactory r0 = r1.length
            int r0 = r0.invokeSuspend()
            int r1 = r1.setMin((int) r4, (int) r3)
            r0 = r0 | r1
            return r0
        L_0x006b:
            return r3
        L_0x006c:
            int r0 = r1.Mean$Arithmetic()
            return r0
        L_0x0071:
            r0 = 8
            return r0
        L_0x0074:
            return r3
        L_0x0075:
            o.LogFactory r0 = r0.setMin
            if (r0 == 0) goto L_0x007a
            return r2
        L_0x007a:
            r0 = 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LogFactory.invokeSuspend():int");
    }

    public boolean toDoubleRange() {
        LogFactory logFactory;
        int i = this.getMin;
        if (!(i == 30 || i == 31 || i == 37 || i == 38 || i == 50 || i == 51 || i == 56 || i == 57 || i == 82 || i == 83)) {
            switch (i) {
                case -1:
                case 35:
                case 65:
                case 73:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                case 131:
                case 132:
                case 133:
                case TsExtractor.TS_STREAM_TYPE_E_AC3:
                case 136:
                case SavingsActivity.RV_BENEFIT_WIDTH:
                case 141:
                case 142:
                case 143:
                case 154:
                case 155:
                case 159:
                case BlobStatic.MONITOR_IMAGE_WIDTH:
                    break;
                case 90:
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                    LogFactory logFactory2 = this.getMax;
                    if (logFactory2 != null) {
                        return logFactory2.toDoubleRange();
                    }
                    break;
                case 103:
                    LogFactory logFactory3 = this.setMin;
                    if (logFactory3 == null || (logFactory = logFactory3.length) == null || logFactory.length == null) {
                        getStyleId.setMin();
                    }
                    return this.setMin.length.toDoubleRange() && this.setMin.length.length.toDoubleRange();
                default:
                    switch (i) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            break;
                        default:
                            switch (i) {
                                case 69:
                                case 70:
                                case 71:
                                    break;
                                default:
                                    switch (i) {
                                        case 105:
                                        case 106:
                                            if (this.setMin == null || this.getMax == null) {
                                                getStyleId.setMin();
                                            }
                                            return this.setMin.toDoubleRange() || this.getMax.toDoubleRange();
                                        case 107:
                                        case 108:
                                            break;
                                        default:
                                            switch (i) {
                                                case 113:
                                                case 114:
                                                case 115:
                                                    break;
                                                default:
                                                    return false;
                                            }
                                    }
                            }
                    }
            }
        }
        return true;
    }

    public final void values() {
        if (this.getMin == 126) {
            ICustomTabsCallback();
        } else {
            getStyleId.setMin();
        }
    }

    private void ICustomTabsCallback() {
        int i = this.getMin;
        if (i == 132 || i == 73) {
            isInside(-1);
        }
        for (LogFactory logFactory = this.setMin; logFactory != null; logFactory = logFactory.length) {
            logFactory.ICustomTabsCallback();
        }
    }

    public String toString() {
        return String.valueOf(this.getMin);
    }

    public static LogFactory getMin(String str) {
        CircleFrameLayout.WidgetListener widgetListener = new CircleFrameLayout.WidgetListener();
        if (str != null) {
            widgetListener.equals = str;
            widgetListener.equals(str.length());
            widgetListener.setMax(41);
            return widgetListener;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final void getMax(getFaceRegion getfaceregion) {
        if (getfaceregion == null) {
            length(24);
        } else {
            IsOverlapping(24).length = getfaceregion;
        }
    }

    public final void setMax(LogFactory logFactory) {
        LogFactory logFactory2 = logFactory;
        while (true) {
            LogFactory logFactory3 = logFactory2.length;
            if (logFactory3 == null) {
                break;
            }
            logFactory2 = logFactory3;
        }
        logFactory2.length = this.setMin;
        this.setMin = logFactory;
        if (this.getMax == null) {
            this.getMax = logFactory2;
        }
    }

    private getMax IsOverlapping(int i) {
        getMax getmax = this.IsOverlapping;
        while (getmax != null && i != getmax.getMin) {
            getmax = getmax.getMax;
        }
        if (getmax != null) {
            return getmax;
        }
        getMax getmax2 = new getMax((byte) 0);
        getmax2.getMin = i;
        getmax2.getMax = this.IsOverlapping;
        this.IsOverlapping = getmax2;
        return getmax2;
    }

    public final Object getMax(int i) {
        getMax getmax = this.IsOverlapping;
        while (getmax != null && i != getmax.getMin) {
            getmax = getmax.getMax;
        }
        if (getmax == null) {
            return null;
        }
        return getmax.length;
    }

    public final int setMin(int i, int i2) {
        getMax getmax = this.IsOverlapping;
        while (getmax != null && i != getmax.getMin) {
            getmax = getmax.getMax;
        }
        return getmax == null ? i2 : getmax.setMax;
    }

    public final int getMin(int i) {
        getMax getmax = this.IsOverlapping;
        while (getmax != null && i != getmax.getMin) {
            getmax = getmax.getMax;
        }
        if (getmax == null) {
            getStyleId.setMin();
        }
        return getmax.setMax;
    }
}
