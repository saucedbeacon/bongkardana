package o;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class access$201 {
    public final Proxy getMax;
    public final InetSocketAddress getMin;
    public final getLayoutInflater length;

    public access$201(getLayoutInflater getlayoutinflater, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (getlayoutinflater == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.length = getlayoutinflater;
            this.getMax = proxy;
            this.getMin = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean getMin() {
        return this.length.isInside != null && this.getMax.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof access$201) {
            access$201 access_201 = (access$201) obj;
            if (!this.length.equals(access_201.length) || !this.getMax.equals(access_201.getMax) || !this.getMin.equals(access_201.getMin)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.length.hashCode() + 527) * 31) + this.getMax.hashCode()) * 31) + this.getMin.hashCode();
    }
}
