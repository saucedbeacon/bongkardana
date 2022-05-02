package o;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

public final class generateFinalKey {
    private static final readVersion[] IsOverlapping = {readVersion.registerCallbackListener, readVersion.unregisterCallbackListener, readVersion.isTransportControlEnabled, readVersion.sendCommand, readVersion.sendMediaButton, readVersion.onSessionDestroyed, readVersion.onShuffleModeChangedRemoved, readVersion.onQueueTitleChanged, readVersion.onExtrasChanged, readVersion.IMediaControllerCallback$Stub, readVersion.IMediaControllerCallback$Stub$Proxy, readVersion.MediaBrowserCompat$SearchResultReceiver, readVersion.MediaBrowserCompat$MediaItem, readVersion.IPostMessageService$Default, readVersion.IPostMessageService$Stub$Proxy, readVersion.onTransact, readVersion.asBinder, readVersion.toFloatRange};
    private static final readVersion[] equals = {readVersion.registerCallbackListener, readVersion.unregisterCallbackListener, readVersion.isTransportControlEnabled, readVersion.sendCommand, readVersion.sendMediaButton, readVersion.onSessionDestroyed, readVersion.onShuffleModeChangedRemoved, readVersion.onQueueTitleChanged, readVersion.onExtrasChanged, readVersion.IMediaControllerCallback$Stub, readVersion.IMediaControllerCallback$Stub$Proxy};
    public static final generateFinalKey getMax = new generateFinalKey(new setMax(false));
    public static final generateFinalKey length;
    public static final generateFinalKey setMax;
    public static final generateFinalKey setMin;
    final boolean getMin;
    @Nullable
    final String[] isInside;
    final boolean toFloatRange;
    @Nullable
    final String[] toIntRange;

    static {
        setMax min = new setMax(true).length(equals).setMin(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2);
        if (min.setMin) {
            min.getMin = true;
            length = new generateFinalKey(min);
            setMax min2 = new setMax(true).length(IsOverlapping).setMin(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
            if (min2.setMin) {
                min2.getMin = true;
                setMin = new generateFinalKey(min2);
                setMax min3 = new setMax(true).length(IsOverlapping).setMin(TlsVersion.TLS_1_0);
                if (min3.setMin) {
                    min3.getMin = true;
                    setMax = new generateFinalKey(min3);
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public generateFinalKey(setMax setmax) {
        this.getMin = setmax.setMin;
        this.toIntRange = setmax.setMax;
        this.isInside = setmax.length;
        this.toFloatRange = setmax.getMin;
    }

    public final boolean getMax() {
        return this.getMin;
    }

    public final boolean setMin() {
        return this.toFloatRange;
    }

    public final boolean getMin(SSLSocket sSLSocket) {
        if (!this.getMin) {
            return false;
        }
        if (this.isInside != null && !initCloseCode.setMin(initCloseCode.isInside, this.isInside, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.toIntRange == null || initCloseCode.setMin(readVersion.getMin, this.toIntRange, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof generateFinalKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        generateFinalKey generatefinalkey = (generateFinalKey) obj;
        boolean z = this.getMin;
        if (z != generatefinalkey.getMin) {
            return false;
        }
        return !z || (Arrays.equals(this.toIntRange, generatefinalkey.toIntRange) && Arrays.equals(this.isInside, generatefinalkey.isInside) && this.toFloatRange == generatefinalkey.toFloatRange);
    }

    public final int hashCode() {
        if (this.getMin) {
            return ((((Arrays.hashCode(this.toIntRange) + 527) * 31) + Arrays.hashCode(this.isInside)) * 31) + (this.toFloatRange ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        List<readVersion> list;
        if (!this.getMin) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.toIntRange;
        List<TlsVersion> list2 = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                list = readVersion.setMin(strArr);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.isInside;
        if (strArr2 != null) {
            if (strArr2 != null) {
                list2 = TlsVersion.forJavaNames(strArr2);
            }
            str2 = list2.toString();
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.toFloatRange);
        sb.append(")");
        return sb.toString();
    }

    public static final class setMax {
        boolean getMin;
        @Nullable
        String[] length;
        @Nullable
        String[] setMax;
        boolean setMin;

        setMax(boolean z) {
            this.setMin = z;
        }

        public setMax(generateFinalKey generatefinalkey) {
            this.setMin = generatefinalkey.getMin;
            this.setMax = generatefinalkey.toIntRange;
            this.length = generatefinalkey.isInside;
            this.getMin = generatefinalkey.toFloatRange;
        }

        public final setMax length(readVersion... readversionArr) {
            if (this.setMin) {
                String[] strArr = new String[readversionArr.length];
                for (int i = 0; i < readversionArr.length; i++) {
                    strArr[i] = readversionArr[i].getVolumeAttributes;
                }
                return getMin(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final setMax getMin(String... strArr) {
            if (!this.setMin) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.setMax = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public final setMax setMin(TlsVersion... tlsVersionArr) {
            if (this.setMin) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                return setMax(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final setMax setMax(String... strArr) {
            if (!this.setMin) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.length = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }
}
