package o;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

public final class getCloseCode {
    public final InetSocketAddress getMax;
    public final Proxy length;
    public final postProcessHandshakeResponseAsServer setMax;

    public getCloseCode(postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (postprocesshandshakeresponseasserver == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.setMax = postprocesshandshakeresponseasserver;
            this.length = proxy;
            this.getMax = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean length() {
        return this.setMax.toFloatRange != null && this.length.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof getCloseCode)) {
            return false;
        }
        getCloseCode getclosecode = (getCloseCode) obj;
        return getclosecode.setMax.equals(this.setMax) && getclosecode.length.equals(this.length) && getclosecode.getMax.equals(this.getMax);
    }

    public final int hashCode() {
        return ((((this.setMax.hashCode() + 527) * 31) + this.length.hashCode()) * 31) + this.getMax.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.getMax);
        sb.append("}");
        return sb.toString();
    }
}
