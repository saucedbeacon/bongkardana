package o;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.Draft_75;
import o.InvalidHandshakeException;
import o.increaseBuffer;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;

public final class Handshakedata implements getOpcode {
    private static final List<String> setMax = initCloseCode.setMin((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    private static final List<String> setMin = initCloseCode.setMin((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    private final HandshakedataImpl1 getMax;
    private final increaseBuffer.setMax getMin;
    final isFin length;
    private final Protocol toFloatRange;
    private ServerHandshakeBuilder toIntRange;

    public Handshakedata(generateKey generatekey, increaseBuffer.setMax setmax, isFin isfin, HandshakedataImpl1 handshakedataImpl1) {
        Protocol protocol;
        this.getMin = setmax;
        this.length = isfin;
        this.getMax = handshakedataImpl1;
        if (generatekey.setMax.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        } else {
            protocol = Protocol.HTTP_2;
        }
        this.toFloatRange = protocol;
    }

    public final recordDnsTime setMax(InvalidDataException invalidDataException, long j) {
        return this.toIntRange.setMax();
    }

    public final void length(InvalidDataException invalidDataException) throws IOException {
        if (this.toIntRange == null) {
            boolean z = invalidDataException.setMax != null;
            Draft_75 draft_75 = invalidDataException.length;
            ArrayList arrayList = new ArrayList((draft_75.length.length / 2) + 4);
            arrayList.add(new setHttpStatus(setHttpStatus.getMin, invalidDataException.getMin));
            arrayList.add(new setHttpStatus(setHttpStatus.setMin, HandshakeImpl1Client.setMin(invalidDataException.setMin)));
            String min = invalidDataException.setMin(HttpHeaders.HOST);
            if (min != null) {
                arrayList.add(new setHttpStatus(setHttpStatus.toFloatRange, min));
            }
            arrayList.add(new setHttpStatus(setHttpStatus.setMax, invalidDataException.setMin.setMin));
            int length2 = draft_75.length.length / 2;
            for (int i = 0; i < length2; i++) {
                int i2 = i * 2;
                printConnMonitorLog encodeUtf8 = printConnMonitorLog.encodeUtf8(draft_75.length[i2].toLowerCase(Locale.US));
                if (!setMax.contains(encodeUtf8.utf8())) {
                    arrayList.add(new setHttpStatus(encodeUtf8, draft_75.length[i2 + 1]));
                }
            }
            ServerHandshakeBuilder max = this.getMax.setMax(arrayList, z);
            this.toIntRange = max;
            max.toFloatRange.length((long) this.getMin.length(), TimeUnit.MILLISECONDS);
            this.toIntRange.toIntRange.length((long) this.getMin.getMax(), TimeUnit.MILLISECONDS);
        }
    }

    public final void getMin() throws IOException {
        this.getMax.invoke.setMin();
    }

    public final void setMin() throws IOException {
        this.toIntRange.setMax().close();
    }

    public final InvalidHandshakeException.getMin setMax(boolean z) throws IOException {
        Draft_75 max = this.toIntRange.getMax();
        Protocol protocol = this.toFloatRange;
        Draft_75.length length2 = new Draft_75.length();
        int length3 = max.length.length / 2;
        getHttpStatusMessage gethttpstatusmessage = null;
        for (int i = 0; i < length3; i++) {
            int i2 = i * 2;
            String str = max.length[i2];
            String str2 = max.length[i2 + 1];
            if (str.equals(":status")) {
                gethttpstatusmessage = getHttpStatusMessage.setMax("HTTP/1.1 ".concat(String.valueOf(str2)));
            } else if (!setMin.contains(str)) {
                LimitExedeedException.length.length(length2, str, str2);
            }
        }
        if (gethttpstatusmessage != null) {
            InvalidHandshakeException.getMin getmin = new InvalidHandshakeException.getMin();
            getmin.getMax = protocol;
            getmin.getMin = gethttpstatusmessage.getMin;
            getmin.setMax = gethttpstatusmessage.setMin;
            Draft_75 draft_75 = new Draft_75(length2);
            Draft_75.length length4 = new Draft_75.length();
            Collections.addAll(length4.setMin, draft_75.length);
            getmin.equals = length4;
            if (!z || LimitExedeedException.length.setMax(getmin) != 100) {
                return getmin;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public final NotSendableException getMax(InvalidHandshakeException invalidHandshakeException) throws IOException {
        this.length.setMax.responseBodyStart(this.length.setMin);
        String length2 = invalidHandshakeException.toIntRange.length("Content-Type");
        if (length2 == null) {
            length2 = null;
        }
        return new HandshakeImpl1Server(length2, ClientHandshake.getMax(invalidHandshakeException), recordMonitorOfSndMsg.setMin((recordWsHsTime) new length(this.toIntRange.isInside)));
    }

    public final void getMax() {
        ServerHandshakeBuilder serverHandshakeBuilder = this.toIntRange;
        if (serverHandshakeBuilder != null) {
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (serverHandshakeBuilder.getMax(errorCode)) {
                serverHandshakeBuilder.getMax.getMin(serverHandshakeBuilder.setMin, errorCode);
            }
        }
    }

    class length extends DataflowMonitorModel {
        boolean getMin = false;
        long setMin = 0;

        length(recordWsHsTime recordwshstime) {
            super(recordwshstime);
        }

        public final long a_(submitLazy submitlazy, long j) throws IOException {
            try {
                long a_ = setMin().a_(submitlazy, j);
                if (a_ > 0) {
                    this.setMin += a_;
                }
                return a_;
            } catch (IOException e) {
                getMax(e);
                throw e;
            }
        }

        public final void close() throws IOException {
            super.close();
            getMax((IOException) null);
        }

        private void getMax(IOException iOException) {
            if (!this.getMin) {
                this.getMin = true;
                Handshakedata.this.length.setMax(false, Handshakedata.this, this.setMin, iOException);
            }
        }
    }
}
