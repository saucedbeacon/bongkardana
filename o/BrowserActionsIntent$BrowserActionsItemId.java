package o;

import com.bca.xco.widget.connection.httpclient.z;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class BrowserActionsIntent$BrowserActionsItemId {
    public static final BrowserActionsIntent$BrowserActionsItemId getMax = new BrowserActionsIntent$BrowserActionsItemId(new getMax(false), (byte) 0);
    private static final BrowserServiceFileProvider[] isInside = {BrowserServiceFileProvider.onMetadataChanged, BrowserServiceFileProvider.onQueueTitleChanged, BrowserServiceFileProvider.onPlaybackStateChanged, BrowserServiceFileProvider.onShuffleModeChangedRemoved, BrowserServiceFileProvider.cancelAll, BrowserServiceFileProvider.MediaBrowserCompat$MediaItem, BrowserServiceFileProvider.INotificationSideChannel$Stub, BrowserServiceFileProvider.MediaBrowserCompat$ItemReceiver};
    public static final BrowserActionsIntent$BrowserActionsItemId setMax;
    public static final BrowserActionsIntent$BrowserActionsItemId setMin;
    /* access modifiers changed from: private */
    public final boolean IsOverlapping;
    /* access modifiers changed from: private */
    public final boolean equals;
    /* access modifiers changed from: package-private */
    public final String[] getMin;
    /* access modifiers changed from: package-private */
    public final String[] length;

    public /* synthetic */ BrowserActionsIntent$BrowserActionsItemId(getMax getmax, byte b) {
        this(getmax);
    }

    static {
        getMax getmax = new getMax(true);
        BrowserServiceFileProvider[] browserServiceFileProviderArr = isInside;
        if (getmax.setMax) {
            String[] strArr = new String[browserServiceFileProviderArr.length];
            for (int i = 0; i < browserServiceFileProviderArr.length; i++) {
                strArr[i] = browserServiceFileProviderArr[i].onShuffleModeChanged;
            }
            getMax length2 = getmax.getMax(strArr).length(z.TLS_1_2);
            if (length2.setMax) {
                length2.getMin = true;
                BrowserActionsIntent$BrowserActionsItemId browserActionsIntent$BrowserActionsItemId = new BrowserActionsIntent$BrowserActionsItemId(length2, (byte) 0);
                setMin = browserActionsIntent$BrowserActionsItemId;
                getMax length3 = new getMax(browserActionsIntent$BrowserActionsItemId).length(z.TLS_1_0);
                if (length3.setMax) {
                    length3.getMin = true;
                    setMax = new BrowserActionsIntent$BrowserActionsItemId(length3, (byte) 0);
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    private BrowserActionsIntent$BrowserActionsItemId(getMax getmax) {
        this.equals = getmax.setMax;
        this.getMin = getmax.getMax;
        this.length = getmax.setMin;
        this.IsOverlapping = getmax.getMin;
    }

    public final boolean getMax() {
        return this.equals;
    }

    public final boolean length() {
        return this.IsOverlapping;
    }

    public final boolean getMin(SSLSocket sSLSocket) {
        if (!this.equals) {
            return false;
        }
        String[] strArr = this.length;
        if (strArr != null && !setMin(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.getMin;
        if (strArr2 == null || setMin(strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    private static boolean setMin(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String max : strArr) {
                if (CustomTabsIntent$ShareState.setMax(strArr2, max) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserActionsIntent$BrowserActionsItemId)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        BrowserActionsIntent$BrowserActionsItemId browserActionsIntent$BrowserActionsItemId = (BrowserActionsIntent$BrowserActionsItemId) obj;
        boolean z = this.equals;
        if (z != browserActionsIntent$BrowserActionsItemId.equals) {
            return false;
        }
        return !z || (Arrays.equals(this.getMin, browserActionsIntent$BrowserActionsItemId.getMin) && Arrays.equals(this.length, browserActionsIntent$BrowserActionsItemId.length) && this.IsOverlapping == browserActionsIntent$BrowserActionsItemId.IsOverlapping);
    }

    public final int hashCode() {
        if (this.equals) {
            return ((((Arrays.hashCode(this.getMin) + 527) * 31) + Arrays.hashCode(this.length)) * 31) + (this.IsOverlapping ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        List list;
        if (!this.equals) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.getMin;
        List list2 = null;
        int i = 0;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr == null) {
                list = null;
            } else {
                BrowserServiceFileProvider[] browserServiceFileProviderArr = new BrowserServiceFileProvider[strArr.length];
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.getMin;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    browserServiceFileProviderArr[i2] = BrowserServiceFileProvider.setMax(strArr2[i2]);
                    i2++;
                }
                list = CustomTabsIntent$ShareState.getMin((T[]) browserServiceFileProviderArr);
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr3 = this.length;
        if (strArr3 != null) {
            if (strArr3 != null) {
                z[] zVarArr = new z[strArr3.length];
                while (true) {
                    String[] strArr4 = this.length;
                    if (i >= strArr4.length) {
                        break;
                    }
                    zVarArr[i] = z.a(strArr4[i]);
                    i++;
                }
                list2 = CustomTabsIntent$ShareState.getMin((T[]) zVarArr);
            }
            str2 = list2.toString();
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.IsOverlapping);
        sb.append(")");
        return sb.toString();
    }

    public static final class getMax {
        String[] getMax;
        /* access modifiers changed from: package-private */
        public boolean getMin;
        /* access modifiers changed from: package-private */
        public boolean setMax;
        String[] setMin;

        getMax(boolean z) {
            this.setMax = z;
        }

        public getMax(BrowserActionsIntent$BrowserActionsItemId browserActionsIntent$BrowserActionsItemId) {
            this.setMax = browserActionsIntent$BrowserActionsItemId.equals;
            this.getMax = browserActionsIntent$BrowserActionsItemId.getMin;
            this.setMin = browserActionsIntent$BrowserActionsItemId.length;
            this.getMin = browserActionsIntent$BrowserActionsItemId.IsOverlapping;
        }

        public final getMax getMax(String... strArr) {
            if (!this.setMax) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.getMax = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public final getMax length(z... zVarArr) {
            if (this.setMax) {
                String[] strArr = new String[1];
                for (int i = 0; i <= 0; i++) {
                    strArr[0] = zVarArr[0].e;
                }
                return getMin(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final getMax getMin(String... strArr) {
            if (!this.setMax) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.setMin = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }
}
