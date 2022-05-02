package o;

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;

public abstract class fixLayoutEndGap implements updateLayoutStateToFillEnd {
    public final scrollBy setMax() throws InvalidDataException {
        return new collectPrefetchPositionsForLayoutState();
    }

    public final void length(WebSocket webSocket, Framedata framedata) {
        computeScrollOffset computescrolloffset = new computeScrollOffset(framedata);
        computescrolloffset.setMax(Framedata.Opcode.PONG);
        webSocket.getMax(computescrolloffset);
    }

    public final String getMin(WebSocket webSocket) throws InvalidDataException {
        InetSocketAddress length = webSocket.length();
        if (length != null) {
            StringBuffer stringBuffer = new StringBuffer(90);
            stringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringBuffer.append(length.getPort());
            stringBuffer.append("\" /></cross-domain-policy>\u0000");
            return stringBuffer.toString();
        }
        throw new InvalidHandshakeException("socket not bound");
    }
}
