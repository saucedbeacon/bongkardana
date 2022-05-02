package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import o.Draft;
import o.Draft_75;
import o.InvalidHandshakeException;
import o.checkAlloc;
import o.generateFinalKey;
import o.translateSingleFrame;
import okhttp3.Protocol;

public class generateKey implements Cloneable, checkAlloc.getMin {
    static final List<Protocol> getMax = initCloseCode.setMin((T[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    static final List<generateFinalKey> length = initCloseCode.setMin((T[]) new generateFinalKey[]{generateFinalKey.setMin, generateFinalKey.getMax});
    @Nullable
    final getPayloadData FastBitmap$CoordinateSystem;
    public final translateFrame Grayscale$Algorithm;
    public final toOpcode ICustomTabsCallback;
    final translateSingleFrame.length IsOverlapping;
    public final HostnameVerifier Mean$Arithmetic;
    public final Draft_10 b;
    final boolean create;
    final List<increaseBuffer> equals;
    final int extraCallback;
    final int extraCallbackWithResult;
    final boolean getCause;
    @Nullable
    public final Proxy getMin;
    public final getPreferedSize hashCode;
    public final setParseMode invoke;
    public final translateFrame invokeSuspend;
    public final List<generateFinalKey> isInside;
    public final int onMessageChannelReady;
    final boolean onNavigationEvent;
    final int onPostMessage;
    final int onRelationshipValidationResult;
    public final List<Protocol> setMax;
    public final Draft_17 setMin;
    public final SSLSocketFactory toDoubleRange;
    final List<increaseBuffer> toFloatRange;
    public final ProxySelector toIntRange;
    @Nullable
    final Draft.CloseHandshakeType toString;
    final executeLowPri valueOf;
    public final SocketFactory values;

    static {
        LimitExedeedException.length = new LimitExedeedException() {
            public final void setMax(Draft_75.length length, String str) {
                length.length(str);
            }

            public final boolean getMin(Draft_10 draft_10, setFin setfin) {
                return draft_10.setMax(setfin);
            }

            public final boolean length(postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver2) {
                return postprocesshandshakeresponseasserver.getMin(postprocesshandshakeresponseasserver2);
            }

            public final Framedata getMax(Draft_10 draft_10) {
                return draft_10.setMax;
            }

            public final int setMax(InvalidHandshakeException.getMin getmin) {
                return getmin.getMin;
            }

            @Nullable
            public final IOException length(checkAlloc checkalloc, @Nullable IOException iOException) {
                return ((IncompleteHandshakeException) checkalloc).setMax(iOException);
            }

            public final void length(Draft_75.length length, String str, String str2) {
                length.setMin.add(str);
                length.setMin.add(str2.trim());
            }

            public final setFin setMax(Draft_10 draft_10, postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, isFin isfin, getCloseCode getclosecode) {
                if (Draft_10.toIntRange || Thread.holdsLock(draft_10)) {
                    for (setFin next : draft_10.setMin) {
                        if (next.length(postprocesshandshakeresponseasserver, getclosecode)) {
                            isfin.getMin(next, true);
                            return next;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            public final Socket getMax(Draft_10 draft_10, postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, isFin isfin) {
                if (Draft_10.toIntRange || Thread.holdsLock(draft_10)) {
                    for (setFin next : draft_10.setMin) {
                        if (next.length(postprocesshandshakeresponseasserver, (getCloseCode) null) && next.setMax() && next != isfin.length()) {
                            if (!isFin.toFloatRange && !Thread.holdsLock(isfin.getMax)) {
                                throw new AssertionError();
                            } else if (isfin.isInside == null && isfin.toIntRange.FastBitmap$CoordinateSystem.size() == 1) {
                                Socket min = isfin.getMin(true, false, false);
                                isfin.toIntRange = next;
                                next.FastBitmap$CoordinateSystem.add(isfin.toIntRange.FastBitmap$CoordinateSystem.get(0));
                                return min;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            public final void setMax(Draft_10 draft_10, setFin setfin) {
                if (Draft_10.toIntRange || Thread.holdsLock(draft_10)) {
                    if (!draft_10.length) {
                        draft_10.length = true;
                        Draft_10.getMin.execute(draft_10.getMax);
                    }
                    draft_10.setMin.add(setfin);
                    return;
                }
                throw new AssertionError();
            }

            public final void setMax(generateFinalKey generatefinalkey, SSLSocket sSLSocket, boolean z) {
                String[] strArr;
                String[] strArr2;
                if (generatefinalkey.toIntRange != null) {
                    strArr = initCloseCode.getMin((Comparator<? super String>) readVersion.getMin, sSLSocket.getEnabledCipherSuites(), generatefinalkey.toIntRange);
                } else {
                    strArr = sSLSocket.getEnabledCipherSuites();
                }
                if (generatefinalkey.isInside != null) {
                    strArr2 = initCloseCode.getMin((Comparator<? super String>) initCloseCode.isInside, sSLSocket.getEnabledProtocols(), generatefinalkey.isInside);
                } else {
                    strArr2 = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int min = initCloseCode.getMin(readVersion.getMin, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z && min != -1) {
                    strArr = initCloseCode.getMin(strArr, supportedCipherSuites[min]);
                }
                generateFinalKey generatefinalkey2 = new generateFinalKey(new generateFinalKey.setMax(generatefinalkey).getMin(strArr).setMax(strArr2));
                if (generatefinalkey2.isInside != null) {
                    sSLSocket.setEnabledProtocols(generatefinalkey2.isInside);
                }
                if (generatefinalkey2.toIntRange != null) {
                    sSLSocket.setEnabledCipherSuites(generatefinalkey2.toIntRange);
                }
            }
        };
    }

    public generateKey() {
        this(new getMax());
    }

    public generateKey(getMax getmax) {
        boolean z;
        this.setMin = getmax.length;
        this.getMin = getmax.getMax;
        this.setMax = getmax.setMin;
        this.isInside = getmax.setMax;
        this.equals = initCloseCode.setMin(getmax.getMin);
        this.toFloatRange = initCloseCode.setMin(getmax.toIntRange);
        this.IsOverlapping = getmax.toFloatRange;
        this.toIntRange = getmax.isInside;
        this.hashCode = getmax.IsOverlapping;
        this.toString = getmax.equals;
        this.FastBitmap$CoordinateSystem = getmax.hashCode;
        this.values = getmax.FastBitmap$CoordinateSystem;
        Iterator<generateFinalKey> it = this.isInside.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                generateFinalKey next = it.next();
                if (z || next.getMax()) {
                    z = true;
                }
            }
        }
        if (getmax.values != null || !z) {
            this.toDoubleRange = getmax.values;
            this.valueOf = getmax.toString;
        } else {
            X509TrustManager min = initCloseCode.setMin();
            this.toDoubleRange = length(min);
            this.valueOf = MPaaSSCLogCatImpl.toIntRange().getMin(min);
        }
        if (this.toDoubleRange != null) {
            MPaaSSCLogCatImpl.toIntRange().getMax(this.toDoubleRange);
        }
        this.Mean$Arithmetic = getmax.toDoubleRange;
        setParseMode setparsemode = getmax.valueOf;
        executeLowPri executelowpri = this.valueOf;
        this.invoke = !initCloseCode.setMin((Object) setparsemode.setMax, (Object) executelowpri) ? new setParseMode(setparsemode.length, executelowpri) : setparsemode;
        this.Grayscale$Algorithm = getmax.invokeSuspend;
        this.invokeSuspend = getmax.invoke;
        this.b = getmax.Grayscale$Algorithm;
        this.ICustomTabsCallback = getmax.Mean$Arithmetic;
        this.getCause = getmax.ICustomTabsCallback;
        this.onNavigationEvent = getmax.onNavigationEvent;
        this.create = getmax.create;
        this.extraCallbackWithResult = getmax.b;
        this.onRelationshipValidationResult = getmax.getCause;
        this.extraCallback = getmax.extraCallback;
        this.onPostMessage = getmax.extraCallbackWithResult;
        this.onMessageChannelReady = getmax.onMessageChannelReady;
        if (this.equals.contains((Object) null)) {
            StringBuilder sb = new StringBuilder("Null interceptor: ");
            sb.append(this.equals);
            throw new IllegalStateException(sb.toString());
        } else if (this.toFloatRange.contains((Object) null)) {
            StringBuilder sb2 = new StringBuilder("Null network interceptor: ");
            sb2.append(this.toFloatRange);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private static SSLSocketFactory length(X509TrustManager x509TrustManager) {
        try {
            SSLContext min = MPaaSSCLogCatImpl.toIntRange().setMin();
            min.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return min.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw initCloseCode.length("No System TLS", (Exception) e);
        }
    }

    public final boolean setMax() {
        return this.getCause;
    }

    public final boolean length() {
        return this.onNavigationEvent;
    }

    public final boolean getMax() {
        return this.create;
    }

    public final checkAlloc length(InvalidDataException invalidDataException) {
        return IncompleteHandshakeException.setMax(this, invalidDataException);
    }

    public static final class getMax {
        SocketFactory FastBitmap$CoordinateSystem;
        Draft_10 Grayscale$Algorithm;
        boolean ICustomTabsCallback;
        getPreferedSize IsOverlapping;
        toOpcode Mean$Arithmetic;
        public int b;
        public boolean create;
        @Nullable
        public Draft.CloseHandshakeType equals;
        public int extraCallback;
        int extraCallbackWithResult;
        public int getCause;
        @Nullable
        public Proxy getMax;
        public final List<increaseBuffer> getMin = new ArrayList();
        @Nullable
        public getPayloadData hashCode;
        translateFrame invoke;
        public translateFrame invokeSuspend;
        ProxySelector isInside;
        Draft_17 length = new Draft_17();
        int onMessageChannelReady;
        boolean onNavigationEvent;
        public List<generateFinalKey> setMax = generateKey.length;
        List<Protocol> setMin = generateKey.getMax;
        public HostnameVerifier toDoubleRange;
        public translateSingleFrame.length toFloatRange = translateSingleFrame.factory(translateSingleFrame.NONE);
        final List<increaseBuffer> toIntRange = new ArrayList();
        @Nullable
        public executeLowPri toString;
        setParseMode valueOf;
        @Nullable
        public SSLSocketFactory values;

        public getMax() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.isInside = proxySelector;
            if (proxySelector == null) {
                this.isInside = new toPerformanceString();
            }
            this.IsOverlapping = getPreferedSize.setMin;
            this.FastBitmap$CoordinateSystem = SocketFactory.getDefault();
            this.toDoubleRange = executeIO.length;
            this.valueOf = setParseMode.setMin;
            this.invokeSuspend = translateFrame.getMax;
            this.invoke = translateFrame.getMax;
            this.Grayscale$Algorithm = new Draft_10();
            this.Mean$Arithmetic = toOpcode.getMin;
            this.ICustomTabsCallback = true;
            this.onNavigationEvent = true;
            this.create = true;
            this.b = 0;
            this.getCause = 10000;
            this.extraCallback = 10000;
            this.extraCallbackWithResult = 10000;
            this.onMessageChannelReady = 0;
        }

        public final getMax setMin(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.values = sSLSocketFactory;
                this.toString = MPaaSSCLogCatImpl.toIntRange().getMin(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }
    }
}
