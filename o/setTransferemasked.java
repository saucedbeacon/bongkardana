package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class setTransferemasked {
    private List<InetSocketAddress> IsOverlapping = Collections.emptyList();
    private int equals;
    final postProcessHandshakeResponseAsServer getMax;
    private final checkAlloc getMin;
    private final List<getCloseCode> isInside = new ArrayList();
    final Framedata length;
    private List<Proxy> setMax = Collections.emptyList();
    private final translateSingleFrame setMin;

    public setTransferemasked(postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, Framedata framedata, checkAlloc checkalloc, translateSingleFrame translatesingleframe) {
        List<Proxy> list;
        this.getMax = postprocesshandshakeresponseasserver;
        this.length = framedata;
        this.getMin = checkalloc;
        this.setMin = translatesingleframe;
        Draft_76 draft_76 = postprocesshandshakeresponseasserver.setMax;
        Proxy proxy = postprocesshandshakeresponseasserver.isInside;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.getMax.toIntRange.select(draft_76.setMax());
            if (select == null || select.isEmpty()) {
                list = initCloseCode.setMin((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = initCloseCode.setMin(select);
            }
        }
        this.setMax = list;
        this.equals = 0;
    }

    public final boolean getMax() {
        return setMax() || !this.isInside.isEmpty();
    }

    public final length length() throws IOException {
        if (getMax()) {
            ArrayList arrayList = new ArrayList();
            while (setMax()) {
                if (setMax()) {
                    List<Proxy> list = this.setMax;
                    int i = this.equals;
                    this.equals = i + 1;
                    Proxy proxy = list.get(i);
                    length(proxy);
                    int size = this.IsOverlapping.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        getCloseCode getclosecode = new getCloseCode(this.getMax, proxy, this.IsOverlapping.get(i2));
                        if (this.length.setMax(getclosecode)) {
                            this.isInside.add(getclosecode);
                        } else {
                            arrayList.add(getclosecode);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("No route to ");
                    sb.append(this.getMax.setMax.getMin);
                    sb.append("; exhausted proxy configurations: ");
                    sb.append(this.setMax);
                    throw new SocketException(sb.toString());
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.isInside);
                this.isInside.clear();
            }
            return new length(arrayList);
        }
        throw new NoSuchElementException();
    }

    private boolean setMax() {
        return this.equals < this.setMax.size();
    }

    private void length(Proxy proxy) throws IOException {
        String str;
        int i;
        this.IsOverlapping = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.getMax.setMax.getMin;
            i = this.getMax.setMax.setMax;
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                } else {
                    str = address2.getHostAddress();
                }
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i <= 0 || i > 65535) {
            StringBuilder sb2 = new StringBuilder("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.IsOverlapping.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.setMin.dnsStart(this.getMin, str);
            List<InetAddress> length2 = this.getMax.length.length(str);
            if (!length2.isEmpty()) {
                this.setMin.dnsEnd(this.getMin, str, length2);
                int size = length2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.IsOverlapping.add(new InetSocketAddress(length2.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.getMax.length);
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    public static final class length {
        final List<getCloseCode> length;
        int setMax = 0;

        length(List<getCloseCode> list) {
            this.length = list;
        }

        public final boolean getMin() {
            return this.setMax < this.length.size();
        }
    }
}
