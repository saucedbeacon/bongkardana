package o;

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;

public interface updateLayoutStateToFillEnd {
    void getMax();

    String getMin(WebSocket webSocket) throws InvalidDataException;

    void getMin();

    void length(WebSocket webSocket, Framedata framedata);

    void length(String str);

    scrollBy setMax() throws InvalidDataException;

    InetSocketAddress setMin();

    void setMin(Exception exc);
}
