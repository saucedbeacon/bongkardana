package o;

import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o.Draft_75;
import o.InvalidDataException;
import o.InvalidHandshakeException;
import o.increaseBuffer;

public final class getTransfereMasked implements increaseBuffer {
    private final getPreferedSize getMin;

    public getTransfereMasked(getPreferedSize getpreferedsize) {
        this.getMin = getpreferedsize;
    }

    public final InvalidHandshakeException getMax(increaseBuffer.setMax setmax) throws IOException {
        boolean z;
        InvalidDataException min = setmax.getMin();
        InvalidDataException.getMin getmin = new InvalidDataException.getMin(min);
        getPart getpart = min.setMax;
        if (getpart != null) {
            translateRegularFrame max = getpart.setMax();
            if (max != null) {
                getmin.setMin.setMin("Content-Type", max.toString());
            }
            long min2 = getpart.setMin();
            if (min2 != -1) {
                getmin.setMin.setMin("Content-Length", Long.toString(min2));
                getmin.setMin.getMax(HttpHeaders.TRANSFER_ENCODING);
            } else {
                getmin.setMin.setMin(HttpHeaders.TRANSFER_ENCODING, "chunked");
                getmin.setMin.getMax("Content-Length");
            }
        }
        if (min.length.length(HttpHeaders.HOST) == null) {
            getmin.setMin.setMin(HttpHeaders.HOST, initCloseCode.getMin(min.setMin, false));
        }
        if (min.length.length(HttpHeaders.CONNECTION) == null) {
            getmin.setMin.setMin(HttpHeaders.CONNECTION, "Keep-Alive");
        }
        if (min.length.length(HttpHeaders.ACCEPT_ENCODING) == null && min.length.length(HttpHeaders.RANGE) == null) {
            getmin.setMin.setMin(HttpHeaders.ACCEPT_ENCODING, HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP);
            z = true;
        } else {
            z = false;
        }
        List<fromOpcode> max2 = this.getMin.getMax();
        if (!max2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = max2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                fromOpcode fromopcode = max2.get(i);
                sb.append(fromopcode.getMin);
                sb.append('=');
                sb.append(fromopcode.setMax);
            }
            getmin.setMax("Cookie", sb.toString());
        }
        if (min.setMin(HttpHeaders.USER_AGENT) == null) {
            getmin.setMax(HttpHeaders.USER_AGENT, "okhttp/3.12.12");
        }
        if (getmin.getMin != null) {
            InvalidHandshakeException max3 = setmax.getMax(new InvalidDataException(getmin));
            ClientHandshake.length(this.getMin, min.setMin, max3.toIntRange);
            InvalidHandshakeException.getMin getmin2 = new InvalidHandshakeException.getMin(max3);
            getmin2.setMin = min;
            if (z && HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP.equalsIgnoreCase(max3.getMax("Content-Encoding")) && ClientHandshake.setMax(max3)) {
                MonitorHelper monitorHelper = new MonitorHelper(max3.toFloatRange.getMax());
                Draft_75 draft_75 = max3.toIntRange;
                Draft_75.length length = new Draft_75.length();
                Collections.addAll(length.setMin, draft_75.length);
                Draft_75 draft_752 = new Draft_75(length.getMax("Content-Encoding").getMax("Content-Length"));
                Draft_75.length length2 = new Draft_75.length();
                Collections.addAll(length2.setMin, draft_752.length);
                getmin2.equals = length2;
                getmin2.toIntRange = new HandshakeImpl1Server(max3.getMax("Content-Type"), -1, recordMonitorOfSndMsg.setMin((recordWsHsTime) monitorHelper));
            }
            return getmin2.length();
        }
        throw new IllegalStateException("url == null");
    }
}
